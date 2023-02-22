package com.example.foodmenu.model;

public class MenuModel {
    private String foodName;
    private String foodInfo;
    private int foodImage;
    private String foodCost;
    private String foodIngredients;

    public String getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(String foodCost) {
        this.foodCost = foodCost;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public void setFoodIngredients(String foodIngredients) {
        this.foodIngredients = foodIngredients;
    }

    public MenuModel(String foodName, String foodInfo, int foodImage, String foodCost, String foodIngredients) {
        this.foodName = foodName;
        this.foodInfo = foodInfo;
        this.foodImage = foodImage;
        this.foodCost = foodCost;
        this.foodIngredients = foodIngredients;
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
