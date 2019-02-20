'use strict';
var OO = require('./'),
    testData = require('./test/test-data');

// Override API Key with env variable
testData.config[0].APIAuthKey = testData.config[1].APIAuthKey = process.env.API_KEY;

var zeus = new OO(testData.config[0]),

    // var message = zeus.messages.IATA_ServiceDelivery(testData.ServiceDelivery);
    var message = zeus.messages.IATA_ServiceStatusChangeNotification(testData.serviceStatusChangeNotification);

message.request(function(err, data) {
    if (err) {
        return console.error(err);
    }
    console.log('>>>', JSON.stringify(data, null, '  '));
}, true);

// zeus.orderSalesInformationNotificationRQ(testData.transactionIDs[0], function(err, data) {
//     if (err) {
//         return console.error(err);
//     }
//     console.log('>>>', JSON.stringify(data, null, '  '));
// });
