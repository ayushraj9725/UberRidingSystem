package com.example.reviewService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uber.entitymanagerservice.Models.PassengerReview;

@Repository
public interface PassengerReviewRepository extends JpaRepository<PassengerReview,Long> {

    // it will help me to do all the queried for us, related to passenger review!

}
