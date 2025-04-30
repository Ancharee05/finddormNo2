package com.example.findmydorm;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document("dormitories")
public class Dorm {

    @Id
    private String id;
    private String name;
    private int distance;
    private int price;
    private String tel;
    private String address;
    private List<String> images;
    private List<Obj> waterRate;
    private List<String> furniture;
    private List<Obj> facilities;
    private List<Obj> security;


    public Dorm(String name, int price, int distance, String tel, String address,
                List<String> images, List<String> furniture,
                List<Obj> security, List<Obj> facilities, List<Obj> waterRate) {
        this.name = name;
        this.price = price;
        this.distance = distance;
        this.tel = tel;
        this.address = address;
        this.images = images;
        this.furniture = furniture;
        this.security = security;
        this.facilities = facilities;
        this.waterRate = waterRate;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<Obj> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Obj> facilities) {
        this.facilities = facilities;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Obj> getWaterRate() {
        return waterRate;
    }

    public void setWaterRate(List<Obj> waterRate) {
        this.waterRate = waterRate;
    }

    public List<String> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<String> furniture) {
        this.furniture = furniture;
    }

    public List<Obj> getSecurity() {
        return security;
    }

    public void setSecurity(List<Obj> security) {
        this.security = security;
    }
}

