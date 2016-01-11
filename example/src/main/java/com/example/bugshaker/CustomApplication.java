package com.example.bugshaker;

import android.app.Application;

import com.github.stkent.bugshaker.BugShaker;

public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        BugShaker.get(this)
                 .configure("someone@example.com")
                 .enableDebugLogging()
                 .start();
    }

}
