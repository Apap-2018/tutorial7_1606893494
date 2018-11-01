package com.apap.tutorial7.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tutorial7.model.FlightModel;

/*
 * FlightDB
 */

@Repository
public interface FlightDb extends JpaRepository<FlightModel, Long> {
	Optional<FlightModel> findById(long id);
	void deleteById(long id);
	Optional<FlightModel> findByFlightNumber(String flightNumber);
}
