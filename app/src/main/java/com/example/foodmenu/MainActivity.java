package com.example.foodmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodmenu.databinding.ActivityMainBinding;
import com.example.foodmenu.model.MenuModel;
import com.example.foodmenu.ui.adapter.FoodAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private RecyclerView recyclerView;
    private com.example.foodmenu.ui.adapter.FoodAdapter foodAdapter;
    private List<MenuModel> menuModelList;
    RecyclerView.Adapter FoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        menuModelList = new ArrayList<>();
        List<MenuModel> foodList = new ArrayList<MenuModel>();
        MenuModel pasta = new MenuModel("Pasta","Bucatini Pasta, Ditalini Pasta",R.drawable.pasta_image);
        MenuModel burger = new MenuModel("Burgers","Cheese Burger, Kubie Burger",R.drawable.burger_image);
        MenuModel salad = new MenuModel("Salad","Caesar Salad, Tossed Salad",R.drawable.salad_image);
        MenuModel pizza = new MenuModel("Pizza","Pepperoni Pizza, Italian Pizza",R.drawable.pizza_image);
        MenuModel hotdog = new MenuModel("Hotdog","Michigan Hot Dog, Italian Hot Dog",R.drawable.hotdog_image);
        MenuModel fries = new MenuModel("Fries","French Fries, Steak Fries",R.drawable.fries_image2);
        MenuModel chicken = new MenuModel("Chicken","Salad1, Korean Fried Chicken",R.drawable.chicken_image);

        //adding data to list
        foodList.add(pasta);
        foodList.add(burger);
        foodList.add(salad);
        foodList.add(pizza);
        foodList.add(hotdog);
        foodList.add(fries);
        foodList.add(chicken);

        FoodAdapter = new FoodAdapter(menuModelList);
        binding.recyclerviewFoodList.setAdapter(new FoodAdapter(foodList));
        binding.recyclerviewFoodList.setHasFixedSize(true);
        binding.recyclerviewFoodList.setLayoutManager(new LinearLayoutManager(getBaseContext(),RecyclerView.VERTICAL,false));
    }
}