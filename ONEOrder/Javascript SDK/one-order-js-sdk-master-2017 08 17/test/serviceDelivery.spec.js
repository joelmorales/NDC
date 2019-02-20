'use strict';

var should = require('should'),
    testData = require('./test-data'),
    OO = require('../');

// Override API Key with env variable
if (process.env.API_KEY) {
    testData.config[0].APIAuthKey = testData.config[1].APIAuthKey = process.env.API_KEY;
}

var oo = new OO(testData.config[0]);

describe('should handle the serviceDeliveryRQ messages', function() {
    it('should create a serviceDelivery XML message with only one a <Service> and <Order> element  ', function(done) {
        var xml = oo.messages.IATA_ServiceDelivery(testData.ServiceDelivery).toXML(true, true);

        should(xml.match(/<Service>/g).length).equal(1);
        should(xml.match(/<Order OrderID=\"[A-z0-9]+\" \/>/g).length).equal(1);

        done();
    });
});

describe('should handle the serviceDeliveryRS messages', function() {
    it('should receive a successful IATA_ServiceDelivery response element', function(done) {
        oo.request('IATA_ServiceDelivery', testData.ServiceDelivery, function(err, response) {

            should.not.exist(err);
            should.exist(response.IATA_ServiceDeliveryRS.Order);

            console.log('Order - > orderID: ', response.IATA_ServiceDeliveryRS.Order.$.OrderID);

            console.log('\n <-----Order Items----->\n');
            for (var i = 0; i < response.IATA_ServiceDeliveryRS.Order.OrderItem.length; i++) {
                console.log('OrderItem -> orderItemID: ', response.IATA_ServiceDeliveryRS.Order
                    .OrderItem[i].$.OrderItemID);

                console.log('\n<----Services----> \n');
                for (var service in response.IATA_ServiceDeliveryRS.Order
                        .OrderItem[i].Service) {
                    console.log('ServiceID: ', response.IATA_ServiceDeliveryRS.Order
                        .OrderItem[i].Service[service].ServiceSelection.ServiceDefinition.$.ServiceDefinitionID, 'Service name: ',
                        response.IATA_ServiceDeliveryRS.Order
                        .OrderItem[i].Service[service].ServiceSelection.ServiceDefinition.Name);

                    console.log('\n<---Offer Valid Dates---> \n');
                    console.log('start: ', new Date(response.IATA_ServiceDeliveryRS.Order
                        .OrderItem[i].Service[service].OfferValidDates.Start.$.Timestamp));
                    console.log('end: ', new Date(response.IATA_ServiceDeliveryRS.Order
                        .OrderItem[i].Service[service].OfferValidDates.End.$.Timestamp), '\n');
                }
            }

            done();
        });
    });
});
