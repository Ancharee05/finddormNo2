package com.example.findmydorm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private  DormRepository dormRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    public Review addReview(Review review) {
        // เช็คว่าหอพักนี้มีอยู่จริงหรือไม่
        boolean exists = dormRepository.existsById(review.getDormId());
        if (!exists) {
            throw new IllegalArgumentException("ไม่พบหอพักที่มี ID นี้: " + review.getDormId());
        }

        // ถ้ามีอยู่จริงค่อยบันทึก
        return reviewRepository.save(review);
    }


    public List<Review> getReviewsByDormId(String dormId) {
        return reviewRepository.findByDormId(dormId);
    }
}
