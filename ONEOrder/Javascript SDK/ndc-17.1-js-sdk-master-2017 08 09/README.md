# NDC client

A Node.js client wrapper for IATA's NDC API.

## Installation

Use npm to install from repo:

```
npm install iata-ndc/ONEOrder
```

Or just clone with git:

```
git clone https://github.com/iata-ndc/ONEOrder.git
```

If you do not already have the debug module installed then:

```
npm install debug
```

## Usage

Create a config file and save it as config.json:

```json
{
  "currencyCode": "USD",
  "countryCode": "US",
  "cityCode": "NYC",
  "providerName": "ZEUS NDC GATEWAY",
  "endpoint": "<http://iata.api.mashery.com/Zeus/NDC>",
  "APIAuthKey": "xxxxxxxxxxxxxxxxxxxxxxxx",
  "agent": {
    "IATANumber": "0000XXXX",
    "name": "IATA Developer",
    "id": "developer.test",
    "type": "Hackathon Agent",
    "email": "me@my.domain.com"
  },
  "sender": {
    "id": "Z9",
    "name": "Zeus Airlines",
    "type": "Airline Agent",
    "email": "test@example.org",
    "IATANumber": "00000001"
  },
  "airline": {
    "id": "Z9",
    "name": "Zeus Airlines"
  }
}
```

Remember to replace the string of "xxx" above with your API Key.

And then to make a request create a new file, for example zeus.js and put the following contents inside:

```javascript
/*var NDC = require('ndc-client');*/
var NDC = require('./index.js');
var ndc = new NDC(require('./config.json'));

/* OneWay with multiple pax */
var reqData = {
	language: 'EN',
    pointOfSaleEvent: {
        code: 9,
        definition: 'Shop'
    },
    onds: [{
        flights: [{
            departure: {
                date: new Date('2017-12-25'),
                airportCode: 'ARN'
            },
            arrival: {
                airportCode: 'LHR'
            },
            airline: ndc.config.sender
        }]
    }],
    cabin: 'C',
    travelers: [
        /* two anonymous adults */
        {
            anonymous: true,
            count: 2,
            type: 'ADT'
        },
        /* 1 anonymous children */
        {
            anonymous: true,
            count: 1,
            type: 'CNN'
        },
        /* 1 anonymous infant */
        {
            anonymous: true,
            count: 1,
            type: 'INF'
        }
    ]
};

// Direct request
ndc.request('AirShopping', reqData, function (err, response) {
    console.log(response);
	//console.log(response.Errors.Error.$);
});

//Or if you need to work with message body:
var message = ndc.messages.AirShopping(reqData);

// print JSON message.
console.log(message.toJSON());
// print pretty XML code.
console.log(message.toXML(true));
// make request
message.request(function (err, response) {
    // view response
    console.log(response);
});
```

Finally execute it on the command line with "node zeus.js"

For further details on each message parameters, have a look to the test folder in the `test-data.js` file, with examples.
