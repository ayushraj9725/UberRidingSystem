package com.example.reviewService.Adapters;

import com.example.reviewService.DTOs.PassengerReviewDto;
import org.springframework.stereotype.Component;
import org.uber.entitymanagerservice.Models.PassengerReview;

@Component // allow spring handling the creating object or handling BEANs
public interface PassengerReviewAdapter {

    public PassengerReview ConvertDTOPRtoB(PassengerReviewDto passengerReviewDto);

}
