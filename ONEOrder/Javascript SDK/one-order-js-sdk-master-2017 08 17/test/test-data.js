'use strict';
var TestData = {};

TestData.config = [
    /* Zeus Air config data*/
    {
        "language": "en",
        "currencyCode": "USD",
        "countryCode": "US",
        "cityCode": "NYC",
        "providerName": "IATA NDC GATEWAY",
        "endpoint": "http://35.187.57.17:8700/ndcgateway",
        "APIAuthKey": "xxxxxxxxxxxxxxxxxxxxxxxx",
        "agent": {
            "IATANumber": "0000XXXX",
            "name": "IATA Developer",
            "id": "developer.test",
            "type": "Hackathon Agent",
            "email": "me@my.domain.com"
        },
        "sender": {
            "id": "9A",
            "name": "Athena Air",
            "type": "Airline Agent",
            "email": "test@example.org",
            "IATANumber": "00000001"
        },
        airline: {
            id: "Z9",
            name: "Zeus Airline"
        }
    }

];
/* ServiceDeliveryRQ TestData */
TestData.ServiceDelivery = {
    Service: {
        ServiceType: {
            Code: 'BAG'
        },
    },
    Order: {
        _OrderID: 'A12346X78'
    }
};

/* serviceStatusChangeNotificationRQ TestData */
TestData.serviceStatusChangeNotification = {
    Order: {
        _OrderID: 'A12346SG8',
        _Owner: 'Z9',
        OrderItem: {
            _OrderItemID: 'ORDERITEM1',
            _Owner: 'Z9',
            Service: {
                _ServiceID: 'SV1023_AL2_1_SH2',
                _Owner: 'Z9',
                ServiceStatus: 'Service Delivery DELIVERED'
            }
        }
    }
};

/* orderSalesInformationNotificationRQ Test transaction IDs */
TestData.transactionIDs = ['0a77d82514074ee5b414f8bdb0c950e2', '29206e9fe31a4eabbe81d2468c2dbcba'];

module.exports = TestData;
