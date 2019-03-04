package org.iata.crosscutting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;
import org.iata.oo.schema.AirShoppingRS.ListOfFlightSegmentType;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS.DataLists.FlightList;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS.DataLists.FlightList.Flight;
import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;

@Component
public class AirShoppingDataMapping {

	public List<Map<String, String>> fillAirShoppingDataFetcher(AirShoppingRS airSRS) {
		Map<String, String> airShopping=new HashMap<String, String>();
		
		airShopping.put("departureCode", getValue(airSRS.getDataLists().getOriginDestinationList()
				.getOriginDestination().get(0).getDepartureCode().getValue()));
		airShopping.put("referenceVersion", getValue(airSRS.getDocument().getReferenceVersion()));
		airShopping.put("shoppingResponseId", getValue(airSRS.getShoppingResponseID().getResponseID().getValue()));
		
		return Arrays.asList(airShopping);
	}
	
	public List<Map<String, String>> fillFlightSegmentListDataFetcher(AirShoppingRS airSRS){
		Map<String, String> map=new HashMap<String, String>();
		List<Map<String, String>> flightSegment = new ArrayList<Map<String, String>>();
		
		for(ListOfFlightSegmentType flight: airSRS.getDataLists().getFlightSegmentList().getFlightSegment()) {
			//map=new HashMap<String, String>();
			//map.put("segmentKey", getValue(flight.getSegmentKey()));
			flightSegment.add(ImmutableMap.of("segmentKey", getValue(flight.getSegmentKey())));
		}
		return flightSegment;
	}

	public List<Map<String, String>> fillDeparturesListDataFetcher(AirShoppingRS airSRS) {
		List<Map<String, String>> departures = new ArrayList<Map<String, String>>();
		for(ListOfFlightSegmentType flight: airSRS.getDataLists().getFlightSegmentList().getFlightSegment()) {
			departures.add(
					ImmutableMap.of(
					 	"segmentKey",getValue(flight.getSegmentKey()),
						"airporCode", getValue(flight.getDeparture().getAirportCode().getValue()),
						"date",getValue(flight.getDeparture().getDate().toString()),
						"time",getValue(flight.getDeparture().getTime()),
						"airportName",getValue(flight.getDeparture().getAirportCode().getValue())
					));
		}
		return departures;
	}
	
	private String getValue(String value) {
		return Optional.ofNullable(value).orElse("");
	}
}
