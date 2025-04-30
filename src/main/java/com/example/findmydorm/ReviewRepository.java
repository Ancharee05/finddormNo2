package com.example.findmydorm;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByDormitoryId(String dormitoryId);  // ใช้ dormitoryId แทน dormId
}
