package com.example.foodmenu.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.foodmenu.R;
import com.example.foodmenu.databinding.ActivityDetailsBinding;
import com.example.foodmenu.utilities.Const;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    private String foodImage, foodName, foodCost,foodIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Define Strings
        foodImage = getIntent().getIntExtra(Const.FOOD_IMAGE_KEY);
        foodName = getIntent().getStringExtra(Const.FOOD_NAME_KEY);
        foodCost = getIntent().getStringExtra(Const.FOOD_COST_KEY);
        foodIngredients = getIntent().getStringExtra(Const.FOOD_INGREDIENTS_KEY);

        //Setting values to components
        binding.foodDetailsImageview.setImageDrawable(foodImage);
        binding.foodNameTextview.setText(foodName);
        binding.foodCostTextview.setText(foodCost);
        binding.foodIngredientsTextview.setText(foodIngredients);

        binding.orderButton.setOnClickListener(v -> Toast.makeText(getBaseContext(),"به قول علیرضا، این دکمه سر کاریست و متاسفانه قادر به ثبت سفارش شما نمی باشد :))",Toast.LENGTH_SHORT).show());
    }
}