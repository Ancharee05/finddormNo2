package com.example.findmydorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class FindmydormApplication {
    public static void main(String[] args) {
        SpringApplication.run(FindmydormApplication.class, args);
    }

}
