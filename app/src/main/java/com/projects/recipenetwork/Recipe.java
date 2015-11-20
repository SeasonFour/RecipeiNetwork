package com.projects.recipenetwork;

//an example of what (recipe) we'll passthrough the adapter and recycler view
public class Recipe {
    String recipe_title;
    String recipe_description;
    int recipe_photo;

    Recipe (String recipe_title, String recipe_description, int recipe_photo){
        this.recipe_title = recipe_title;
        this.recipe_description = recipe_description;
        this.recipe_photo = recipe_photo;
    }
}


