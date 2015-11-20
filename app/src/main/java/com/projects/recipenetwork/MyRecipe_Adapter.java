package com.projects.recipenetwork;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by iWanjugu on 20/11/2015.
 */
public class MyRecipe_Adapter extends RecyclerView.Adapter<MyRecipe_Adapter.RecipeViewHolder> {

    public static class RecipeViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView recipe_title;
        TextView recipe_description;
        ImageView recipe_photo;

        RecipeViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            recipe_title = (TextView)itemView.findViewById(R.id.food_title);
            recipe_description = (TextView)itemView.findViewById(R.id.food_description);
            recipe_photo = (ImageView)itemView.findViewById(R.id.food_photo);
        }
    }

    List<Recipe> recipes;

    MyRecipe_Adapter(List<Recipe> recipes){
        this.recipes = recipes;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public RecipeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_recipe_item, viewGroup, false);
        RecipeViewHolder rvh = new RecipeViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder recipeViewHolder, int i) {
        recipeViewHolder.recipe_title.setText(recipes.get(i).recipe_title);
        recipeViewHolder.recipe_description.setText(recipes.get(i).recipe_description);
        recipeViewHolder.recipe_photo.setImageResource(recipes.get(i).recipe_photo);
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }
}
