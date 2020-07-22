package com.example.thai_simey_final_exam.model;

import com.google.gson.annotations.SerializedName;

public class Slideshow {


    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("id")
    private int id;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
