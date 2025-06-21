package com.example.reviewService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uber.entitymanagerservice.Models.Driver;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {

   // Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

   List<Driver> findAllByIdIn(List<Long> driverIds);

}
