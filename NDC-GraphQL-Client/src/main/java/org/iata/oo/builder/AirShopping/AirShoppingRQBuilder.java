package org.iata.oo.builder.AirShopping;

import java.math.BigInteger;

//import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.iata.configuration.AppPropertyKeys;
import org.iata.configuration.PropertiesReaderHelper;
import org.iata.oo.builder.Buildable;
import org.iata.oo.builder.Initializer;
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
		document.setName(PropertiesReaderHelper.getProperty(AppPropertyKeys.NDC_GATEWAY_NAME));
		document.setReferenceVersion(PropertiesReaderHelper.getProperty(AppPropertyKeys.NDC_GATEWAY_REFERENCE_VERSION));

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
		travelAgency.setName(PropertiesReaderHelper.getProperty(AppPropertyKeys.TRAVEL_AGENCY_NAME));
		travelAgency.setIATANumber(PropertiesReaderHelper.getProperty(AppPropertyKeys.TRAVEL_AGENCY_IATA_NUMBER));
		AgencyIDType agencyID = new AgencyIDType();
		agencyID.setOwner(PropertiesReaderHelper.getProperty(AppPropertyKeys.TRAVEL_AGENCY_OWNER));
		agencyID.setValue(PropertiesReaderHelper.getProperty(AppPropertyKeys.TRAVEL_AGENCY_VALUE));
		travelAgency.setAgencyID(agencyID);
		sender.setTravelAgencySender(travelAgency);

		MsgPartiesType.Participants participants = new Participants();
		Participant participant = new Participant();
		AggregatorParticipantType aggregator = new AggregatorParticipantType();
		aggregator.setSequenceNumber(new BigInteger(PropertiesReaderHelper.getProperty(AppPropertyKeys.AGGREGATOR_SEQUENCE_NUM)));
		aggregator.setName(PropertiesReaderHelper.getProperty(AppPropertyKeys.AGGREGATOR_NAME));
		AggregatorIDType aggregatorType = new AggregatorIDType();
		aggregatorType.setValue(PropertiesReaderHelper.getProperty(AppPropertyKeys.AGGREGATOR_NUMBER));
		aggregator.setAggregatorID(aggregatorType);

		participant.setAggregatorParticipant(aggregator);
		participants.getParticipant().add(participant);

		
		party.setSender(sender);
		
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
