package com.cognizant.mvp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.mvp.dao.AirportsRepository;
import com.cognizant.mvp.entitys.Airport;

@RestController
@RequestMapping("/airports")
public class APIService {

	@Autowired
	private AirportsRepository airportsRepository;

	@GetMapping(produces = "application/json")
	public List<Airport> listAirports() {
		return airportsRepository.findAll();
	}

	@GetMapping(produces = "application/json", path = "/{airportname}")
	public Airport listAirports(@PathVariable("airportname") String airportname) {
		Airport airport = new Airport();
		airport.setName(airportname);
		Example airportExample = Example.of(airport);
		return (Airport) airportsRepository.findOne(airportExample).get();
	}

	@GetMapping(produces = "application/json", path = "/{by}/{searchstring}")
	public List<Airport> listAirportsByAnything(@PathVariable("by") String by,
			@PathVariable("searchstring") String searchstring) {
		Airport airport = new Airport();
		if (by.equals("type")) {
			airport.setType(searchstring);
		}
		if (by.equals("name")) {
			airport.setName(searchstring);
		}
		Example airportExample = Example.of(airport);
		return (List) airportsRepository.findAll(airportExample);
	}

	@GetMapping(produces = "application/json", path = "/bylatitude/{latitude}")
	public List<Airport> listAirportsByLatitude(@PathVariable("latitude") String latitude) {
		return airportsRepository.findByLatitude(latitude);
	}

	@GetMapping(produces = "application/json", path = "/byml/{longitude}/{municipality}")
	public List<Airport> listAirportsByML(@PathVariable("longitude") String latitude,
			@PathVariable("municipality") String municipality) {
		System.out.println(airportsRepository.getClass().getName());
		return airportsRepository.findByMunicipalityAndLongitude(municipality, latitude);
	}

}
