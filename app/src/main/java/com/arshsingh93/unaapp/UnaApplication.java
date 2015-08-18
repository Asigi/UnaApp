package com.arshsingh93.unaapp;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by Student on 8/17/2015.
 */
public class UnaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        Parse.enableLocalDatastore(this);
        ParseFacebookUtils.initialize(this);
        Parse.initialize(this, "ZKorAmUCQmL03WosweB6tJNQXSwedHT1tPVbC6BB", "U6H8f6cbLGB2UDjLl9z6RLc3MjWVfpHWbUa6gH3r");
    }

}