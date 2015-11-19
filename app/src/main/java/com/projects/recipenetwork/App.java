package com.projects.recipenetwork;

import android.app.Application;
import android.graphics.Typeface;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Dmytro Denysenko on 5/6/15.
 */
public class App extends Application {

    //Fonts
    private static final String CANARO_EXTRA_BOLD_PATH = "assets/fonts/canaro_extra_bold.otf";
    public static Typeface canaroExtraBold;

    //Twitter Keys
    private static final String TWITTER_KEY = "cEr8HYegtclQ1afSTzBo2U2HP";
    private static final String TWITTER_SECRET ="Hvmi1qDtJx7n5j3pnVWUNgE4vhtWSVaGHM3cOeySjApQammCrS";

    //CrashLytics strings
    public final static String CRASHLYTICS_KEY_SESSION_ACTIVATED = "session_activated";


    private static App singleton;

    public static App getInstance() {
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
//        initTypeface();

    }

    private void initTypeface() {
        canaroExtraBold = Typeface.createFromAsset(getAssets(), CANARO_EXTRA_BOLD_PATH);

    }
}
