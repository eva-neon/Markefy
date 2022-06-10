package com.example.loginexample.Domain;

import android.graphics.drawable.Drawable;

import androidx.lifecycle.ViewModel;

import java.io.Serializable;

public class Article_ViewModel extends ViewModel {
    private String title;
    private int imageId;
    private String description;
    private Double fee;
    private int numberInCart;

    public Article_ViewModel(String title, int imageId, String description, Double fee) {
        this.title = title;
        this.imageId = imageId;
        this.description = description;
        this.fee = fee;
    }

    public Article_ViewModel(String title, int imageId, String description, Double fee, int numberInCart) {
        this.title = title;
        this.imageId = imageId;
        this.description = description;
        this.fee = fee;
        this.numberInCart = numberInCart;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public int getImageId() {
        return imageId;
    }
    public String getDescription() {
        return description;
    }
    public Double getFee() {
        return fee;
    }
    public int getNumberInCart() {
        return numberInCart;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setImageId(Drawable pic) {
        this.imageId = imageId;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setFee(Double fee) {
        this.fee = fee;
    }
    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
