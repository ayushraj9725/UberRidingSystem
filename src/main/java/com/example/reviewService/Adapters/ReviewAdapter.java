package com.example.reviewService.Adapters;

import com.example.reviewService.DTOs.ReviewDto;
import org.springframework.stereotype.Component;
import org.uber.entitymanagerservice.Models.Review;

@Component
public interface ReviewAdapter {

    public Review ConvertDTO(ReviewDto reviewDto);

}
