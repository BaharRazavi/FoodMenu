package com.example.foodmenu.model;

public class MenuModel {
    private String foodName;
    private String foodInfo;
    private int foodImage;

    public MenuModel(String foodName, String foodInfo, int foodImage) {
        this.foodName = foodName;
        this.foodInfo = foodInfo;
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodInfo() {
        return foodInfo;
    }

    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }
}
