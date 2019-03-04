package org.iata.graphql.ndc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.iata.crosscutting.AirShoppingDataMapping;
import org.iata.crosscutting.AirShoppingRQAPI;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableMap;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

	@Autowired
	private AirShoppingDataMapping airShoppingDataMapping;

	private AirShoppingRS airShoppingRS;
	private static List<Map<String, String>> airShoppingMap = new ArrayList<Map<String, String>>();

	private static List<Map<String, String>> flightSegment = Arrays
			.asList(ImmutableMap.of("segmentKey", "SEG_LHRPRG_8_1"), ImmutableMap.of("segmentKey", "SEG_PRGDXB_7"));

	
	
	private static List<Map<String, String>> departureMap = Arrays.asList(
			ImmutableMap.of("segmentKey", "SEG_LHRPRG_8_1", "airporCode", "LHR", "date", "2019-07-27", "time", "20:10",
					"airportName", "Heathrow Airport"),
			ImmutableMap.of("segmentKey", "SEG_PRGDXB_7", "airporCode", "LHR", "date", "2019-07-27", "time", "18:00",
					"airportName", "Vaclav Havel Airport Prague")
	
	);
	
	private static List<Map<String, String>> arrivalMap = Arrays.asList(
			ImmutableMap.of("segmentKey", "SEG_LHRPRG_8_1", "airporCode", "PRG", "date", "2019-07-27", "time", "23:01",
					"airportName", "Václav Havel Airport Prague"),
			ImmutableMap.of("segmentKey", "SEG_PRGDXB_7", "airporCode", "DXB", "date", "2019-07-28", "time", "01:59",
					"airportName", "Dubai International Airport")
	
	);

	public DataFetcher getDepartures() {
		return dataFetchingEnvironment -> {
			Map<String, String> depar = dataFetchingEnvironment.getSource();
			String segmentKey = depar.get("segmentKey");

			System.out.println("Departure List:" + departureMap.size());
			return departureMap.stream()
					.filter(d -> d.get("segmentKey").equals(segmentKey))
					.findFirst()
					.orElse(null);
			};
	}
	
	public DataFetcher getArrivals() {
		return dataFetchingEnvironment -> {
			Map<String, String> depar = dataFetchingEnvironment.getSource();
			String segmentKey = depar.get("segmentKey");

			System.out.println("Arrivals List:" + arrivalMap.size());
			return arrivalMap.stream()
					.filter(d -> d.get("segmentKey").equals(segmentKey))
					.findFirst()
					.orElse(null);
			};
	}

	public DataFetcher getFlightSegmentList() {
		System.out.println("Enter List:");
		return dataFetchingEnvironment -> {
			System.out.println("List:" + flightSegment.size());
			return flightSegment;
		};
	}

	public DataFetcher getAirShoppingByDate() {
		airShoppingRS = AirShoppingRQAPI.getResponse();
		return dataFetchingEnvironment -> {
			airShoppingMap = airShoppingDataMapping.fillAirShoppingDataFetcher(airShoppingRS);
			System.out.println("Maps Count:" + airShoppingMap.size());
			String departureCode = dataFetchingEnvironment.getArgument("departureCode");
			return airShoppingMap.stream()
					// .filter(air -> air.get("departureCode").equals(departureCode))
					.findFirst().orElse(null);
		};
	}

}
