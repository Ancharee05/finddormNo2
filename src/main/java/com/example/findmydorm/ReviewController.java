package com.example.findmydorm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/reviews")
public class ReviewController {


    @Autowired
    private ReviewService reviewService;

    // เพิ่มรีวิว
    @PostMapping
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    // ดึงรีวิวทั้งหมดของ dorm นั้น ๆ
    @GetMapping("/dorm/{dormId}")
    public List<Review> getReviewsByDorm(@PathVariable String dormId) {
        return reviewService.getReviewsByDormId(dormId);
    }
}
