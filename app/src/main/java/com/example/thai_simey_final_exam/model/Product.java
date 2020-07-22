package com.example.thai_simey_final_exam.model;

import com.google.gson.annotations.SerializedName;

public class Product {



    @SerializedName("categoryName")
    private String categoryName;
    @SerializedName("categoryId")
    private String categoryId;
    @SerializedName("totalView")
    private String totalView;
    @SerializedName("averageRate")
    private String averageRate;
    @SerializedName("totalRate")
    private String totalRate;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("price")
    private String price;
    @SerializedName("description")
    private String description;
    @SerializedName("code")
    private String code;
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private String id;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTotalView() {
        return totalView;
    }

    public void setTotalView(String totalView) {
        this.totalView = totalView;
    }

    public String getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(String averageRate) {
        this.averageRate = averageRate;
    }

    public String getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(String totalRate) {
        this.totalRate = totalRate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
