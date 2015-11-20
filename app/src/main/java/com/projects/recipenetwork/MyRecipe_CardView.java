package com.projects.recipenetwork;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iWanjugu on 20/11/2015.
 */
public class MyRecipe_CardView extends Activity {

    TextView recipe_title;
    TextView recipe_description;
    ImageView recipe_photo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_recipe_cardview);

        recipe_title = (TextView)findViewById(R.id.food_title);
        recipe_description = (TextView)findViewById(R.id.food_description);
        recipe_photo = (ImageView)findViewById(R.id.food_photo);

        recipe_title.setText("Pilau");
        recipe_description.setText("Kenyan style spiced rice");
        recipe_photo.setImageResource(R.drawable.pilau);
    }
}
