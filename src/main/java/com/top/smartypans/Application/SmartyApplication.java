package com.top.smartypans;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatDelegate;

public class SmartyApplication extends Application {
    private static SmartyApplication instance;
    private static Context appContext;

    public static SmartyApplication getInstance() {
        return instance;
    }

    public static Context getAppContext() {
        return appContext;
    }

    public void setAppContext(Context mAppContext) {
        this.appContext = mAppContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        this.setAppContext(getApplicationContext());
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
