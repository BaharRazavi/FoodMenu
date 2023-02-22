package com.example.foodmenu.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.foodmenu.OnItemClickListener;
import com.example.foodmenu.R;
import com.example.foodmenu.databinding.ActivityMainBinding;
import com.example.foodmenu.model.MenuModel;
import com.example.foodmenu.ui.adapter.FoodAdapter;
import com.example.foodmenu.utilities.Const;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

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

        //making new menuModel
        MenuModel pasta = new MenuModel("Pasta","Bucatini Pasta, Ditalini Pasta", R.drawable.pasta_image,"20$","Chicken breast, penne pasta, parmesan cheese, butter, garlic");
        MenuModel burger = new MenuModel("Burgers","Cheese Burger, Kubie Burger",R.drawable.burger_image,"15$","Beef mince, horseradish sauce, egg, vegetable oil, burger buns");
        MenuModel salad = new MenuModel("Salad","Caesar Salad, Tossed Salad",R.drawable.salad_image,"22$","Homemade italian dressing, cherry tomatoes, green olives");
        MenuModel pizza = new MenuModel("Pizza","Pepperoni Pizza, Italian Pizza",R.drawable.pizza_image,"24$","Italian sausage, pizza dough, pesto, feta cheese, bell peppers");
        MenuModel hotdog = new MenuModel("Hotdog","Michigan Hot Dog, Italian Hot Dog",R.drawable.hotdog_image,"12$","beef  , water, spices, beef stock, cherry powder");
        MenuModel fries = new MenuModel("Fries","French Fries, Steak Fries",R.drawable.fries_image2,"18$","Russet potatoes, ketchup, peanut oil, sea salt");
        MenuModel chicken = new MenuModel("Chicken","Salad1, Korean Fried Chicken",R.drawable.chicken_image,"25$","Boneless chicken breast, soy sauce, olive oil, lemon juice");

        //adding data to list
        foodList.add(pasta);
        foodList.add(burger);
        foodList.add(salad);
        foodList.add(pizza);
        foodList.add(hotdog);
        foodList.add(fries);
        foodList.add(chicken);

        FoodAdapter = new FoodAdapter(menuModelList, this);
        binding.recyclerviewFoodList.setAdapter(new FoodAdapter(foodList, this));
        binding.recyclerviewFoodList.setHasFixedSize(true);
        binding.recyclerviewFoodList.setLayoutManager(new LinearLayoutManager(getBaseContext(),RecyclerView.VERTICAL,false));
    }

    @Override
    public void onItemClick(MenuModel menuModel) {

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(Const.FOOD_IMAGE_KEY,menuModel.getFoodImage());
        intent.putExtra(Const.FOOD_NAME_KEY,menuModel.getFoodName());
        intent.putExtra(Const.FOOD_COST_KEY,menuModel.getFoodCost());
        intent.putExtra(Const.FOOD_INGREDIENTS_KEY,menuModel.getFoodIngredients());
        startActivity(intent);
    }
}