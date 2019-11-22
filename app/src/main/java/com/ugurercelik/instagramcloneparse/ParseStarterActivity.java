package com.ugurercelik.instagramcloneparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("R2FJhDKYLtE6j2GcX2HkLdt99gAKAUAB9LE3Ouu9")
        .clientKey("11ACh029kccNt2KRfq3V9GpQRi9YeUFkoqHCbqRh")
        .server("https://parseapi.back4app.com/")
        .build()
        );
    }
}
