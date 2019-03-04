package org.iata.crosscutting;

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
	
	public void fillFlightSegmentListDataFetcher(AirShoppingRS airSRS){
		Map<String, String> map=new HashMap<String, String>();
			
		for(ListOfFlightSegmentType flight: airSRS.getDataLists().getFlightSegmentList().getFlightSegment()) {
			System.out.println("Value:"+flight.getSegmentKey());
		}
		
		
	}

	private String getValue(String value) {
		return Optional.ofNullable(value).orElse("");
	}
}
