package org.iata.graphql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.iata.ndc.AirShoppingRQAPI;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.GraphQLException;
import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

	private static final String SEGMENT_KEY = "segmentKey";

	@Autowired
	private AirShoppingDataMapping airShoppingDataMapping;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GraphQLDataFetchers.class);
	private AirShoppingRS airShoppingRS;
	
	private static List<Map<String, String>> airShoppingMap = new ArrayList<Map<String, String>>();
	private static List<Map<String, String>> flightSegment = new ArrayList<Map<String, String>>();
	private static List<Map<String, String>> aLaCarteoffersMap= new ArrayList<Map<String, String>>();
	private static List<Map<String, String>> departureMap= new ArrayList<Map<String, String>>();
	private static List<Map<String, String>> arrivalMap= new ArrayList<Map<String, String>>();
	
	
	public DataFetcher getAlaCarteOffers() {
		return dataFetchingEnvironment ->{
			Map<String, String> depar = dataFetchingEnvironment.getSource();
			String segmentKey = depar.get(SEGMENT_KEY);
			//String mealMatch = depar.get("mealMatch");
			
			aLaCarteoffersMap = airShoppingDataMapping.fillAlaCarteOffersDataFetcher(airShoppingRS,segmentKey);
			LOGGER.debug("A La carte List Count:" + aLaCarteoffersMap.size());
			
			return aLaCarteoffersMap;
			
		};
			
	}
	
	public DataFetcher getFlightSegmentList() {
			return dataFetchingEnvironment -> {
				flightSegment = airShoppingDataMapping.fillFlightSegmentListDataFetcher(airShoppingRS);
				LOGGER.debug("Flight Segment List Count:" + flightSegment.size());
				return flightSegment;
			};
	}
		
	public DataFetcher getDepartures() {
		return dataFetchingEnvironment -> {
			Map<String, String> depar = dataFetchingEnvironment.getSource();
			String segmentKey = depar.get(SEGMENT_KEY);
			
			departureMap=airShoppingDataMapping.fillDeparturesListDataFetcher(airShoppingRS);
			LOGGER.debug("Departure List Count:" + departureMap.size());
			return departureMap.stream()
					.filter(d -> d.get(SEGMENT_KEY).equals(segmentKey))
					.findFirst()
					.orElseThrow(() ->new GraphQLException("Segment Key"+segmentKey));
					//.orElse(null);
			};
	}
	
	public DataFetcher getArrivals() {
		return dataFetchingEnvironment -> {
			Map<String, String> depar = dataFetchingEnvironment.getSource();
			String segmentKey = depar.get(SEGMENT_KEY);
			arrivalMap = airShoppingDataMapping.fillArrivalsListDataFetcher(airShoppingRS);
			LOGGER.debug("Arrivals List Count:" + arrivalMap.size());
			return arrivalMap.stream()
					.filter(d -> d.get(SEGMENT_KEY).equals(segmentKey))
					.findFirst()
					.orElseThrow(() ->new GraphQLException("Segment Key"+segmentKey));
			};
	}

	public DataFetcher getAirShoppingByDate() {
		return dataFetchingEnvironment -> {
			String departureCode = dataFetchingEnvironment.getArgument("departureCode");
			String departureDate = dataFetchingEnvironment.getArgument("departureDate");
			String arrivalCode = dataFetchingEnvironment.getArgument("arrivalCode");
			LOGGER.debug("Parameters - Dept Code:"+departureCode+", Date:"+departureDate+" ,Arrival Code:"+arrivalCode);
			
			airShoppingRS = AirShoppingRQAPI.getStubResponse(departureCode,departureDate,arrivalCode);
			//airShoppingRS = AirShoppingRQAPI.getResponse(departureCode,departureDate,arrivalCode);
			
			airShoppingMap = airShoppingDataMapping.fillAirShoppingDataFetcher(airShoppingRS);
			LOGGER.debug("AirShopping Object Count:" + airShoppingMap.size());
			
			return airShoppingMap.stream()
					.findFirst()
					.orElseThrow(() ->new GraphQLException("Parameters - Dept Code:"+departureCode+", Date:"+departureDate+" ,Arrival Code:"+arrivalCode));
		};
	}

}
