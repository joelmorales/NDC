# ONE Order (OO) client

A Node.js client wrapper for IATA's One Order API.

## Installation

Use npm to install from repo:

```
npm install iata-ndc/ONEOrder
```

Or just clone with git:

```
git clone git clone https://github.com/iata-ndc/ONEOrder.git
```

## Usage

Create a config file and save it as config.json:

```json
{
  "endpoint": "http://iata.api.mashery.com/Zeus/NDC",
  "APIAuthKey": "xxxxxxxxxxxxxxxxxxxxxxxx"
}
```

Remember to replace the string of "xxx" above with your API Key.

And then to make a request create a new file, for example zeus.js and put the following contents inside:

```javascript
var OO = require('oo-client');
var oo = new OO(require('./config.json'));

/* order's available service for type 'BAG' */
var reqData = {
Order: {
      _OrderID: 'A12346VR8'	  
	  },
Service: {
      ServiceType: {
         	  Code: 'BAG'
	      }
  }
};

// Direct request
oo.request('IATA_ServiceDelivery', reqData, function (err, response) {
    console.log(response);
});

//Or if you need to work with message body:
var message = oo.messages.IATA_ServiceDelivery(reqData);

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
