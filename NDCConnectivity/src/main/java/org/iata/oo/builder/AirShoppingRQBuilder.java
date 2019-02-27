package org.iata.oo.builder;

import java.math.BigInteger;

//import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.iata.oo.schema.AirShoppingRQ.AgencyIDType;
import org.iata.oo.schema.AirShoppingRQ.AggregatorIDType;
import org.iata.oo.schema.AirShoppingRQ.AggregatorParticipantType;
import org.iata.oo.schema.AirShoppingRQ.AirShopReqAttributeQueryType;
//import org.iata.oo.schema.AirShoppingRQ.AirShopReqAttributeQueryTypeOriginDestination;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ.CoreQuery;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ.DataLists;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ.Preference;
import org.iata.oo.schema.AirShoppingRQ.CabinPreferencesType;
import org.iata.oo.schema.AirShoppingRQ.CabinType;
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

//import com.sun.xml.internal.ws.org.objectweb.asm.Type;

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

		MsgDocumentType document = new MsgDocumentType();
		document.setName("KRONOS NDC GATEWAY");
		document.setReferenceVersion("1.0");

		request.setDocument(document);

		return this;
	}

	public AirShoppingRQBuilder addPreference() {

		AirShoppingRQ.Preference preference = new Preference();
		FarePreferencesType farePreference = new FarePreferencesType();

		FarePreferencesType.Types types = new FarePreferencesType.Types();
		FarePreferencesType.Types.Type type = new FarePreferencesType.Types.Type();
		type.setValue("759");
		types.getType().add(type);

		CabinPreferencesType cabin = new CabinPreferencesType();
		CabinType cabinType = new CabinType();
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
		PassengerType passenger1 = new PassengerType();
		passenger1.setPTC("ADT");
		passenger1.setPassengerID("SH1");

		PassengerType passenger2 = new PassengerType();
		passenger2.setPTC("CHD");
		passenger2.setPassengerID("SH2");

		AirShoppingRQ.DataLists.PassengerList passengerList = new AirShoppingRQ.DataLists.PassengerList();

		passengerList.getPassenger().add(passenger1);
		passengerList.getPassenger().add(passenger2);
		
		dataList.setPassengerList(passengerList);
		
		request.setDataLists(dataList);
		return this;
	}

	public AirShoppingRQBuilder addCoreQueryOneWay(String departureCode, XMLGregorianCalendar departureDate,
			String arrivalCode) {

		AirShoppingRQ.CoreQuery corequery = new CoreQuery();
		AirShopReqAttributeQueryType.OriginDestination originDestination = 
				addOriginDestination(departureCode, departureDate, arrivalCode);

		AirShopReqAttributeQueryType destinations = new AirShopReqAttributeQueryType();
		destinations.getOriginDestination().add(originDestination);

		corequery.setOriginDestinations(destinations);
		request.setCoreQuery(corequery);
		return this;
	}

	private AirShopReqAttributeQueryType.OriginDestination addOriginDestination(String departureCode,
			XMLGregorianCalendar departureDate, String arrivalCode) {
		AirShopReqAttributeQueryType.OriginDestination originDestination = new AirShopReqAttributeQueryType.OriginDestination();

		Departure departure = new Departure();
		FlightDepartureType.AirportCode airportCode = new FlightDepartureType.AirportCode();
		airportCode.setValue(departureCode);
		departure.setDate(departureDate);
		departure.setAirportCode(airportCode);

		FlightArrivalType.AirportCode airportArrivalCode = new FlightArrivalType.AirportCode();
		airportArrivalCode.setValue(arrivalCode);
		FlightArrivalType arrival = new FlightArrivalType();
		arrival.setAirportCode(airportArrivalCode);

		originDestination.setDeparture(departure);
		originDestination.setArrival(arrival);

		return originDestination;
	}

	public AirShoppingRQBuilder addParty() {

		MsgPartiesType party = new MsgPartiesType();

		Sender sender = new Sender();

		TravelAgencySenderType travelAgency = new TravelAgencySenderType();
		travelAgency.setName("JR TECHNOLOGIES");
		travelAgency.setIATANumber("20200154");
		AgencyIDType agencyID = new AgencyIDType();
		// agencyID.setOwner("Z9");
		agencyID.setValue("00010080");
		travelAgency.setAgencyID(agencyID);
		sender.setTravelAgencySender(travelAgency);

		MsgPartiesType.Participants participants = new Participants();
		Participant participant = new Participant();
		AggregatorParticipantType aggregator = new AggregatorParticipantType();
		aggregator.setSequenceNumber(new BigInteger("1"));
		aggregator.setName("JR TECHNOLOGIES");
		AggregatorIDType aggregatorType = new AggregatorIDType();
		aggregatorType.setValue("88888888");
		aggregator.setAggregatorID(aggregatorType);

		participant.setAggregatorParticipant(aggregator);
		participants.getParticipant().add(participant);

		// ObjectFactory factory = new ObjectFactory();
		// JAXBElement<MsgPartiesType.Participants> jaxbParticipants=
		// factory.createMsgPartiesTypeParticipants(participants);

		party.setSender(sender);
		// party.setParticipants(jaxbParticipants);

		request.setParty(party);

		return this;
	}

	public static AirShoppingRQ buildAirShoppingRQ_OneWay(XMLGregorianCalendar departureDate, String departureCode,
			String arrivalCode) {

		AirShoppingRQ airShoppingRQ = new AirShoppingRQBuilder().addDocument().addParty().changeHeader()
				.addCoreQueryOneWay(departureCode, departureDate, arrivalCode).addDataList().addPreference().build();

		return airShoppingRQ;
	}

	public AirShoppingRQBuilder changeHeader() {
		request.setEchoToken("{{$guid}}");

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
