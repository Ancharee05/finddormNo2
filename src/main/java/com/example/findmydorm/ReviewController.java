package com.example.findmydorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") // ให้ frontend Next.js ติดต่อได้
@RestController
@RequestMapping("/api/dorms/{dormId}/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // สำหรับสร้างรีวิวใหม่
    @PostMapping
    public Review createReview(@PathVariable String dormId, @RequestBody Review review) {
        review.setDormitoryId(dormId); // ใช้ dormitoryId แทน dormId
        return reviewService.saveReview(review);
    }

    // สำหรับดึงรีวิวทั้งหมดของหอพักนั้น
    @GetMapping
    public List<Review> getReviews(@PathVariable String dormId) {
        return reviewService.getReviewsByDormitoryId(dormId);  // ใช้ dormitoryId แทน dormId
    }
}
