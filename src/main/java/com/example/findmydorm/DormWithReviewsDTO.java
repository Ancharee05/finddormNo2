package com.example.findmydorm;

import java.util.List;

public class DormWithReviewsDTO {

    private Dorm dorm;
    private List<Review> reviews;


    public DormWithReviewsDTO(Dorm dorm, List<Review> reviews) {
        this.dorm = dorm;
        this.reviews = reviews;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Dorm getDorm() {
        return dorm;
    }

    public void setDorm(Dorm dorm) {
        this.dorm = dorm;
    }
}
