package com.projects.recipenetwork;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by victor on 11/18/15.
 */
public class Intro extends AppIntro {
    // Please DO NOT override onCreate. Use init
    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here
        // AppIntro will automatically generate the dots indicator and buttons
        // title,description,image,color
        addSlide(AppIntroFragment.newInstance("Welcome To Recipe Network", "Where everyone is a Chef in their own way. ",
                R.drawable.intro1,
                Color.parseColor("#FF5102")));

        addSlide(AppIntroFragment.newInstance("Choose from a variety of recipes","Depending on your taste,we have a variety of types to choose from",
                R.drawable.intro2,
                Color.parseColor("#2856FF")));

        addSlide(AppIntroFragment.newInstance("Create and share your recipes", "Share your perfect recipe with the world.",
                R.drawable.intro3,
                Color.parseColor("#FF7B02")));

        addSlide(AppIntroFragment.newInstance("Get started", "Simply signup to gwt started.",
                R.drawable.intro4,
                Color.parseColor("#FF4CD6")));


        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest


        // OPTIONAL METHODS
        // Override bar/separator color
//        setBarColor(Color.parseColor("#3F51B5"));
//        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(false);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Intent skip= new Intent(Intro.this,Login.class);
        startActivity(skip);
        finish();


    }


    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Intent done= new Intent(Intro.this,Login.class);
        startActivity(done);
        finish();

    }
}
