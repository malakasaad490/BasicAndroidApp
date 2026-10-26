package com.example.basicandroidapp;

import java.io.Serializable;

public class Clothes implements Serializable {
    private String tops;
    private String pants;
    private String shoes;
    private String accessories;
    private String logo;

    public Clothes(String tops, String pants, String shoes, String accessories, String logo) {
        this.tops = tops;
        this.pants = pants;
        this.shoes = shoes;
        this.accessories = accessories;
        this.logo = logo;
    }

    public String getTops() {
        return tops;
    }

    public void setTops(String tops) {
        this.tops = tops;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "tops='" + tops + '\'' +
                ", pants='" + pants + '\'' +
                ", shoes='" + shoes + '\'' +
                ", accessories='" + accessories + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
