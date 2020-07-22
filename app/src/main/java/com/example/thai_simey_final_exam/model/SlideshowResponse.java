package com.example.thai_simey_final_exam.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SlideshowResponse {

    @SerializedName("")
    private List<Slideshow> products;

    public List<Slideshow> getProducts() {
        return products;
    }

    public void setProducts(List<Slideshow> products) {
        this.products = products;
    }

    public String toString() {
        return "ProductResponse{" +
                "products=" + products +
                '}';
    }
}
