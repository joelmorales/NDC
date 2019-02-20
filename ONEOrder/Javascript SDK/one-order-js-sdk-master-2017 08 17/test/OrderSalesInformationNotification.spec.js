'use strict';

var should = require('should'),
    testData = require('./test-data'),
    OO = require('../');

// Override API Key with env variable
if (process.env.API_KEY) {
    testData.config[0].APIAuthKey = testData.config[1].APIAuthKey = process.env.API_KEY;
}

var oo = new OO(testData.config[0]);


describe('should handle the orderSalesInformationNotification messages', function() {
    it('should receive a successful orderSalesInformationNotification response element', function(done) {

        oo.orderSalesInformationNotificationRQ(testData.transactionIDs[1], function(err, response) {

            should.not.exist(err);
            should.exist(response.IATA_OrderSaleInformationNotificationRQ.Passengers);
            should.exist(response.IATA_OrderSaleInformationNotificationRQ.Order);

            var passengers = response.IATA_OrderSaleInformationNotificationRQ.Passengers.Passenger;
            var order = response.IATA_OrderSaleInformationNotificationRQ.Order;

            var passengerTotalServiceList = [];

            // In case of one passenger the passengers element works as JS object and not as array
            if (passengers.constructor === Array) {
                console.log('<----Passengers---->\n');

                for (var passenger in passengers) {
                    passengerTotalServiceList[passengers[passenger].$.PassengerID] = 0;

                    console.log('ID: ', passengers[passenger].$.PassengerID, '| Surname: ', passengers[passenger].Individual.Surname,
                        '| GivenName: ', passengers[passenger].Individual.GivenName);
                }
            } else {
                passengerTotalServiceList[passengers.$.PassengerID] = 0;

                console.log('<--Passenger-->');
                console.log('ID: ', passengers.$.PassengerID, '| Surname: ', passengers.Individual.Surname,
                    '| GivenName: ', passengers.Individual.GivenName);
            }

            console.log('\n<----Order---->');
            console.log('OrderID: ', order.$.OrderID, '| Total Price: ', order.TotalOrderPrice.SimpleCurrencyPrice._,
                order.TotalOrderPrice.SimpleCurrencyPrice.$.Code);

            console.log('\n<---Passenger available services total--->\n ');
            for (var item in order.OrderItem) {
                var services = order.OrderItem[item].Service;

                for (var service in services) {
                    passengerTotalServiceList[services[service].PassengerRef] = passengerTotalServiceList[services[service].PassengerRef] + 1;
                }
            }

            for (var passengerId in passengerTotalServiceList) {
                console.log('passenger: ', passengerId,
                    'total service count: ', passengerTotalServiceList[passengerId]);
            }

            done();
        });
    });
});
