package com.projects.recipenetwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.yalantis.guillotine.animation.GuillotineAnimation;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class Home extends AppCompatActivity {

    LinearLayout Home;
    LinearLayout dishes;
    LinearLayout drinks;
    LinearLayout crtrecipie;
    LinearLayout myRecipie;

    private static final long RIPPLE_DURATION = 250;


    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.root)
    FrameLayout root;
    @InjectView(R.id.content_hamburger)
    View contentHamburger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home);
        ButterKnife.inject(this);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }

        View guillotineMenu = LayoutInflater.from(this).inflate(R.layout.guillotine, null);
        root.addView(guillotineMenu);

        new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();

        Home=(LinearLayout) findViewById(R.id.home_group);
        dishes=(LinearLayout) findViewById(R.id.dishes_group);
        drinks=(LinearLayout) findViewById(R.id.drinks_group);
        crtrecipie=(LinearLayout) findViewById(R.id.crtrecipie_group);
        myRecipie=(LinearLayout) findViewById(R.id.myrecipie_group);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Home.this,Home.class);
                startActivity(a);
            }
        });
       dishes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Home.this,Dishes.class);
                startActivity(b);
            }
        });

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Home.this,Drinks.class);
                startActivity(c);
            }
        });

        crtrecipie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Home.this,Create_Recipie.class);
                startActivity(d);
            }
        });

        myRecipie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(Home.this,MyRecipie.class);
                startActivity(e);
            }
        });


    }
}
