package com.example.findmydorm;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    private String userId;
    private String dormitoryId;  // ใช้ dormitoryId แทน dormId
    private int rating;
    private String comment;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDormitoryId() {
        return dormitoryId;  // ใช้ dormitoryId แทน dormId
    }

    public void setDormitoryId(String dormitoryId) {  // ใช้ dormitoryId แทน dormId
        this.dormitoryId = dormitoryId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
