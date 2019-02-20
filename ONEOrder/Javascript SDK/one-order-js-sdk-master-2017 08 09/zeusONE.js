/*var OO = require('oo-client');*/
var OO = require('./index.js');
var oo = new OO(require('./config.json'));
/* order's available service for type 'BAG' */
var reqData = {
Order: {
      _OrderID: 'A12346VR8'	  
	  },
Service: {
      ServiceType: {
          RFIC: {
		  Code: 'BAG'
		  }
      }
  }
};


// Direct request
oo.request('IATA_ServiceDelivery', reqData, function (err, response) {
    console.log(response);
	
	if (err) {
        console.error("Can't process request", err);
		}
}
);

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