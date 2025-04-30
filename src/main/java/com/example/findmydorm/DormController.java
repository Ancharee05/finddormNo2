package com.example.findmydorm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/dorms")
public class DormController {


    @Autowired
    private ReviewService reviewService;
    @Autowired
    private DormService dormService;


    @PostMapping("/add")
    public String addDorm(@RequestBody Dorm dorm) {
        return dormService.createDorm(dorm);
    }

    @GetMapping("/all")
    public List<Dorm> getAllDorms() {
        return dormService.getAllDorms();
    }

    // ค้นหาหอพักตามชื่อ
    @GetMapping("/search/name")
    public List<Dorm> searchDormsByName(@RequestParam String keyword) {
        return dormService.searchByName(keyword);
    }

    // ค้นหาหอพักตามระยะทางที่ไม่เกินค่าที่กำหนด
    @GetMapping("/search/distance")
    public List<Dorm> searchDormsByDistance(@RequestParam int maxDistance) {
        return dormService.searchByMaxDistance(maxDistance);
    }

    // ค้นหาหอพักตามราคาที่ไม่เกินค่าที่กำหนด
    @GetMapping("/search/price")
    public List<Dorm> searchDormsByPrice(@RequestParam int maxPrice) {
        return dormService.searchByMaxPrice(maxPrice);
    }

    @GetMapping("/{id}")
    public Dorm getDormById(@PathVariable String id) {
        return dormService.getDormById(id);
    }


    @GetMapping("/{id}/with-reviews")
    public DormWithReviewsDTO getDormWithReviews(@PathVariable String id) {
        Dorm dorm = dormService.getDormById(id); // ดึง dorm
        List<Review> reviews = reviewService.getReviewsByDormId(id); // ดึง reviews
        return new DormWithReviewsDTO(dorm, reviews);
    }



}
