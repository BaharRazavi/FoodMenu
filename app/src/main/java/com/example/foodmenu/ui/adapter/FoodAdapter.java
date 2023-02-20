package com.example.foodmenu.ui.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodmenu.R;
import com.example.foodmenu.model.MenuModel;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private List<MenuModel> menuModelList;

    public FoodAdapter(List<MenuModel> menuModelList) {
        this.menuModelList = menuModelList;
    }


    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_row,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        MenuModel menuModel = menuModelList.get(position);
//        Glide.with(holder.itemView.getContext())
//                    .load(menuModel.getImageURL())
//                .centerCrop()
//                .placeholder(R.drawable.placeholder)
//                .into(holder.imageViewFoodType);
        holder.textViewFoodType.setText(menuModel.getFoodName());
        holder.textViewFoodInfo.setText(menuModel.getFoodInfo());
        holder.imageViewFoodType.setImageResource(menuModel.getFoodImage());

    }

    @Override
    public int getItemCount() {
        return menuModelList.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        private AppCompatImageView imageViewFoodType;
        private AppCompatTextView textViewFoodType;
        private AppCompatTextView textViewFoodInfo;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFoodType = itemView.findViewById(R.id.food_type_imageview);
            textViewFoodType = itemView.findViewById(R.id.food_type_textview);
            textViewFoodInfo = itemView.findViewById(R.id.food_info_textview);
        }
    }
}
