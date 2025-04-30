package com.example.findmydorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // ตัวอย่าง method ที่ใช้ค้นหาความคิดเห็นตาม dormitoryId
    public List<Review> getReviewsByDormitory(String dormitoryId) {
        return reviewRepository.findByDormitoryId(dormitoryId);  // ใช้ dormitoryId แทน dormId
    }

    // เมธอดที่ใช้บันทึกรีวิวใหม่
    public Review saveReview(Review review) {
        return reviewRepository.save(review);  // บันทึกรีวิวลงในฐานข้อมูล
    }

    // เมธอดที่ใช้ดึงรีวิวทั้งหมดของหอพักนั้นๆ โดยใช้ dormitoryId
    public List<Review> getReviewsByDormitoryId(String dormitoryId) {
        return reviewRepository.findByDormitoryId(dormitoryId);  // ดึงรีวิวตาม dormitoryId
    }
}
