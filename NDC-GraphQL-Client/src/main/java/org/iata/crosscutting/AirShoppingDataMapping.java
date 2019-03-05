package org.iata.crosscutting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.iata.oo.schema.AirShoppingRS.ALaCarteOfferItemType;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS.OffersGroup.AirlineOffers;
import org.iata.oo.schema.AirShoppingRS.ListOfFlightSegmentType;
import org.iata.oo.schema.AirShoppingRS.ServiceDefinitionType;
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
		List<Map<String, String>> flightSegment = new ArrayList<Map<String, String>>();
		
		for(ListOfFlightSegmentType flight: airSRS.getDataLists().getFlightSegmentList().getFlightSegment()) {
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
	
	public List<Map<String,String>> fillAlaCarteOffersDataFetcher(AirShoppingRS airSRS, String sortSegmentKey) {

		String totalAmount;
		String unitPrice;
		String name;
		String desc;
		String serviceRef;
		String key;
		ServiceDefinitionType serviceDefinitionRef;
		List<Map<String, String>> aLaCarteoffers = new ArrayList<Map<String, String>>();
		List<String> checkList = new ArrayList<>();

		//System.out.println("Offers 1 root: "+airSRS.getOffersGroup().getAirlineOffers().size());
		
		for (AirlineOffers offers : airSRS.getOffersGroup().getAirlineOffers()) {

			for (ALaCarteOfferItemType alaCarte : offers.getALaCarteOffer().getALaCarteOfferItem()) {

				totalAmount = alaCarte.getUnitPriceDetail().getTotalAmount().getSimpleCurrencyPrice().getValue()
						.toString();
				unitPrice = alaCarte.getUnitPriceDetail().getTotalAmount().getSimpleCurrencyPrice().getCode();
				serviceDefinitionRef = (ServiceDefinitionType) alaCarte.getService().getServiceDefinitionRef();
				name = serviceDefinitionRef.getName().getValue();
				desc = serviceDefinitionRef.getDescriptions().getDescription().get(0).getText().getValue();
				serviceRef = serviceDefinitionRef.getServiceDefinitionID().toString();
				//System.out.println("serviceDefinition Ref:" + serviceRef + " , Unit:" + unitPrice + " ,Amount:"
				//		+ totalAmount + " , Name" + name + " , Desc:" + desc);

				for (Object refs : alaCarte.getEligibility().getSegmentRefs().getValue()) {

					ListOfFlightSegmentType type = (ListOfFlightSegmentType) refs;
					key = serviceRef + type.getSegmentKey();

					if (!checkList.contains(key) && type.getSegmentKey().equals(sortSegmentKey)) {
						//System.out.println(" Segments ref:" + type.getSegmentKey());
						checkList.add(key);

						aLaCarteoffers.add(
							ImmutableMap.of(
								"segmentKey", type.getSegmentKey(), 
								"unitPrice", unitPrice, 
								"totalAmount", getValue(totalAmount), 
								"serviceName", getValue(name),
								"description", getValue(desc)));
					}
					
				}

			}

		}
		return aLaCarteoffers;
	}
	
	
	
	public List<Map<String, String>> fillArrivalsListDataFetcher(AirShoppingRS airSRS) {
		List<Map<String, String>> arrivals = new ArrayList<Map<String, String>>();
		for(ListOfFlightSegmentType flight: airSRS.getDataLists().getFlightSegmentList().getFlightSegment()) {
			arrivals.add(
					ImmutableMap.of(
					 	"segmentKey",getValue(flight.getSegmentKey()),
						"airporCode", getValue(flight.getArrival().getAirportCode().getValue()),
						"date",getValue(flight.getArrival().getDate().toString()),
						"time",getValue(flight.getArrival().getTime()),
						"airportName",getValue(flight.getArrival().getAirportCode().getValue())
					));
		}
		return arrivals;
	}
	
	private String getValue(String value) {
		return Optional.ofNullable(value).orElse("");
	}
}
