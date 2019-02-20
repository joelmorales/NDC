# ONE Order sandbox test samples


## Getting Started
- Use Postman
- import the latest json collection
- do not forget to set you API Key 

### Prerequisites

In order to use the ONE Order sandbox test samples, you need to :

- Request for an API Key in order to use IATA NDC and ONE Order APIs sandboxes - http://iata.mashery.com/member/register
- set your API key as a global variable as expected by the samples headers ({{Authorization-key}}) - (Postman documentation: https://www.getpostman.com/docs/postman/environments_and_globals/variables)

- look at the test guide : [ONE Order Sandbox How_to Guide](./ONE%20Order%20Sandbox%20How_to%20Guide.pdf)
- look at the sandbox content : https://airtechzone.iata.org/docs/ONE_Order_Sandbox_Brochure_ZEUS_Airlines_Z9.pdf
- look at other information about the sandbox here: https://airtechzone.iata.org/toolbox/oo-sandbox/#specs


- use github samples in this folder

### Service Statuses
- Service Delivery ```READY TO PROCEED``` - Airline is in a position to start delivery of the Service, or in a position to allow a Delivery Provider to prepare the service
- Service Delivery ```DELIVERY IN PROGRESS``` - The delivery provider is in control of the Service delivery.
- Service Delivery ```DELIVERED```	- Service has been successfully delivered.
- Service Delivery ```DELIVERED to Passenger``` - Service has been successfully delivered to the Passenger.
- Service Delivery ```NOT CLAIMED``` (because of Passenger) - For reasons as a result of passenger action or inaction such as Passenger no-show 
- Service Delivery ```FAILED TO DELIVER``` (because of Airline)	- Service could not be delivered due to airlines or provider limitations.
- Service Delivery ```READY FOR DELIVERY``` (Provider Ready for Delivery) - Provider is in a position to start delivery of the Service.
- Service Delivery ```NOTIFICATION TO PROVIDER IS SENT``` - Delivery provider was successfully informed about the Service he has to deliver.
- Service Delivery ```READY FOR DELIVERY ON-BOARD``` - Delivery provider (cabin crew) is in a position to start delivery of the Service.
- Service Delivery ```BLOCKED FROM DELIVERY``` - Service may be blocked from delivery in case of:
	- unforeseen reason (Force Majeure) where airline wants to decline offering the Service
	- Change of Service, the original would be blocked 
	- Refund cases, where Service should not be delivered anymore


### Service Types and details
[List of services details](./ZeusServicesAug2017.xlsx)

When using per example IATA_ServiceDeliveryRQ with Service type:
```
<ServiceType>
	<Code>BAG</Code>
</ServiceType>
```

Please use the following list of codes:
- MEL : Meal
- CON : Wifi
- BAG : Bag services
- GRN : Lounge Pass
- SET : Seat selection
- LNP : Lounge Pass
- FTR : Fast Track
- GRN : Parking Service
- CRE : Car Rental
- TRS : Ground Transport Concierge
- VIP : VIP services

