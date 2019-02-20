'use strict';

var should = require('should'),
    testData = require('./test-data'),
    OO = require('../');

// Override API Key with env variable
if (process.env.API_KEY) {
    testData.config[0].APIAuthKey = testData.config[1].APIAuthKey = process.env.API_KEY;
}

var oo = new OO(testData.config[0]);


describe('should handle the serviceStatusChangeNotification messages', function() {
    it('should create a serviceStatusChangeNotification XML message with only one  <Order> element  ', function(done) {
        var xml = oo.messages.IATA_ServiceStatusChangeNotification(testData.serviceStatusChangeNotification).toXML(true, true);

        should(xml.match(/<Order OrderID=\"[A-z0-9]+\" Owner="Z9">/g).length).equal(1);

        done();
    });
});

describe('should handle the serviceStatusChangeNotificationRS messages', function() {
    it('should receive a successful serviceStatusChangeNotification response element', function(done) {

        oo.request('IATA_ServiceStatusChangeNotification', testData.serviceStatusChangeNotification, function(err, response) {
            should.not.exist(err);
            should.exist(response.Acknowledgement);

            console.log('\n<--Response  Acknowledgement--> \n');
            console.log('Status Code: ', response.Acknowledgement.StatusCode);
            console.log('Status Message: ', response.Acknowledgement.StatusMessage);

            done();
        });
    });
});
