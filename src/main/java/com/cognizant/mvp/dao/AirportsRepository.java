package com.cognizant.mvp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.mvp.entitys.Airport;

public interface AirportsRepository extends JpaRepository<Airport, Long> {

	List<Airport> findByCountryName(String countryName);

	List<Airport> findByLatitude(String latitude);

	List<Airport> findByLongitude(String longitude);

	List<Airport> findByMunicipality(String municipality);

	List<Airport> findByMunicipalityAndLongitude(String municipalit, String longitude);
}
