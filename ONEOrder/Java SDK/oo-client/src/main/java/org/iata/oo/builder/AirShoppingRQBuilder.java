package org.iata.oo.builder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.iata.oo.schema.AirShoppingRQ.AgencyIDType;
import org.iata.oo.schema.AirShoppingRQ.AggregatorIDType;
import org.iata.oo.schema.AirShoppingRQ.AggregatorParticipantType;
import org.iata.oo.schema.AirShoppingRQ.AirShopReqAttributeQueryTypeOriginDestination;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ.CoreQuery;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ.DataLists;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ.Preference;
import org.iata.oo.schema.AirShoppingRQ.CabinPreferencesType;
import org.iata.oo.schema.AirShoppingRQ.CabinType;
import org.iata.oo.schema.AirShoppingRQ.CoreDateGrpType;
import org.iata.oo.schema.AirShoppingRQ.Departure;
import org.iata.oo.schema.AirShoppingRQ.FarePreferencesType;
import org.iata.oo.schema.AirShoppingRQ.FlightArrivalType;
import org.iata.oo.schema.AirShoppingRQ.FlightDepartureType;
import org.iata.oo.schema.AirShoppingRQ.MsgDocumentType;
import org.iata.oo.schema.AirShoppingRQ.MsgPartiesType;
import org.iata.oo.schema.AirShoppingRQ.MsgPartiesType.Participants;
import org.iata.oo.schema.AirShoppingRQ.MsgPartiesType.Participants.Participant;
import org.iata.oo.schema.AirShoppingRQ.MsgPartiesType.Sender;
//import org.iata.oo.schema.AirShoppingRQ.ObjectFactory;
import org.iata.oo.schema.AirShoppingRQ.PassengerType;
import org.iata.oo.schema.AirShoppingRQ.TravelAgencySenderType;

public class AirShoppingRQBuilder implements Buildable<AirShoppingRQ> {

	private AirShoppingRQ request;

	/**
	 * Creates a new instance of ServiceDeliveryRQBuilder.
	 */
	public AirShoppingRQBuilder() { // {@link #clear)
		 doInitialize();
	}

	/**
	 * Re-initializes builder to empty state.
	 */

	protected void doInitialize() {
		request = Initializer.getObject(AirShoppingRQ.class);
	}

	public AirShoppingRQBuilder addDocument() {

		MsgDocumentType document= new  MsgDocumentType();
		document.setName("ZEUS NDC GATEWAY");
		document.setReferenceVersion("1.0");
		
		request.setDocument(document);
		
		return this;
	}

	public AirShoppingRQBuilder addPreference() {
		
		AirShoppingRQ.Preference preference = new Preference();
		FarePreferencesType farePreference = new FarePreferencesType();
		List<FarePreferencesType.Type> types =  new ArrayList<>();
		FarePreferencesType.Type type =  new FarePreferencesType.Type();
		type.setValue("759");
		types.add(type);
		
		CabinPreferencesType cabin = new  CabinPreferencesType();
		CabinType cabinType= new  CabinType();
		cabinType.setCode("M");
		cabin.getCabinType().add(cabinType);
		
		farePreference.setTypes(types);
		
		preference.setFarePreferences(farePreference);
		preference.setCabinPreferences(cabin);
		
		request.setPreference(preference);
		
		return this;
	}
	
	public AirShoppingRQBuilder addDataList() {
		
		AirShoppingRQ.DataLists dataList = new DataLists();
		PassengerType passenger1= new PassengerType();
		passenger1.setPTC("ADT");
		passenger1.setPassengerID("SH1");
		
		PassengerType passenger2= new PassengerType();
		passenger2.setPTC("ADT");
		passenger2.setPassengerID("SH1");
		
		List<PassengerType> passengerList = new ArrayList<>();
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		
		dataList.setPassengerList(passengerList);
		
		request.setDataLists(dataList);
		return this;
	}
	
	public AirShoppingRQBuilder addCoreQuery(String departureCode,XMLGregorianCalendar departureDate,String arrivalCode) {
		
		AirShoppingRQ.CoreQuery corequery =  new CoreQuery();
		AirShopReqAttributeQueryTypeOriginDestination originDestination = new AirShopReqAttributeQueryTypeOriginDestination();
		
		Departure departure = new Departure();
		FlightDepartureType.AirportCode airportCode =  new FlightDepartureType.AirportCode();
		airportCode.setValue(departureCode);
		departure.setDate(departureDate);
		departure.setAirportCode(airportCode);
		
		FlightArrivalType.AirportCode airportArrivalCode =  new FlightArrivalType.AirportCode();
		airportArrivalCode.setValue(arrivalCode);
		FlightArrivalType arrival = new FlightArrivalType();
		arrival.setAirportCode(airportArrivalCode);
		
		originDestination.setDeparture(departure);
		originDestination.setArrival(arrival);
		
		List<AirShopReqAttributeQueryTypeOriginDestination> destinations= new ArrayList<>();
		destinations.add(originDestination);
		
		//dataList.setPassengerList(passengerList);
		corequery.setOriginDestinations(destinations);
		
		//AirShoppingRQ.OfferValidPeriodType t;
		//AirShoppingRQ.Qualifier q;
		
		CoreDateGrpType core= new  CoreDateGrpType();
		//core.set
		//CoreDateGrpType
		
		request.setCoreQuery(corequery);
		return this;
	}
	
	public AirShoppingRQBuilder addParty() {
		
		MsgPartiesType party = new  MsgPartiesType();
		
		Sender sender = new  Sender();
		
		TravelAgencySenderType travelAgency = new  TravelAgencySenderType();
		travelAgency.setName("JR TECHNOLOGIES");
		travelAgency.setIATANumber("12312312");
		AgencyIDType agencyID = new  AgencyIDType();
		agencyID.setOwner("Z9");
		agencyID.setValue("Z9");
		travelAgency.setAgencyID(agencyID);
		sender.setTravelAgencySender(travelAgency);
		
	
		MsgPartiesType.Participants participants = new  Participants();
		Participant participant= new  Participant();
		AggregatorParticipantType aggregator= new  AggregatorParticipantType();
		aggregator.setSequenceNumber(new BigInteger("1"));
		aggregator.setName("JR TECHNOLOGIES");
		AggregatorIDType aggregatorType= new  AggregatorIDType();
		aggregatorType.setValue("88888888");
		aggregator.setAggregatorID(aggregatorType);
		 
		participant.setAggregatorParticipant(aggregator);
		participants.getParticipant().add(participant);
		
		//ObjectFactory factory = new  ObjectFactory();
		//JAXBElement<MsgPartiesType.Participants> jaxbParticipants= factory.createMsgPartiesTypeParticipants(participants);
		
		
		party.setSender(sender);
		//party.setParticipants(jaxbParticipants);
		
		request.setParty(party);
		
		return this;
	}
	
	@Override
	public AirShoppingRQ build() {
		addRequestAttributes();
		return request;
	}

	
	private void addRequestAttributes() {
		request.setVersion(VERSION);
	}

}
