package com.apap.tutorial7.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.tutorial7.model.PilotModel;

/*
 * PilotDB
 */

@Repository
public interface PilotDb extends JpaRepository<PilotModel, Long> {
	Optional<PilotModel> findByLicenseNumber(String licenseNumber);
	Optional<PilotModel> findById(long id);
}
