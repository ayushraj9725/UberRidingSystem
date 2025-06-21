package com.example.reviewService.Services;

import org.springframework.stereotype.Service;
import org.uber.entitymanagerservice.Models.PassengerReview;

import java.util.List;
import java.util.Optional;

@Service
public interface PassengerReviewService {

    public Optional<PassengerReview> findPassengerReviewById(Long Id);

    public List<PassengerReview> findAllPassengerReview();

    public PassengerReview publishPassengerReview(PassengerReview passengerReview);

    public PassengerReview updatePassengerReview(Long Id , PassengerReview passengerReview);

    public boolean deletePassengerReviewById(Long Id);


}
