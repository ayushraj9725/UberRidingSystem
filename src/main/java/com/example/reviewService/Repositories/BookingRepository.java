package com.example.reviewService.Repositories;

import org.uber.entitymanagerservice.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uber.entitymanagerservice.Models.Driver;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking , Long> {

    //  List<Booking> findAllDriverId(Long driverId);

    List<Booking> findAllByDriverIn(List<Driver> drivers);


}
