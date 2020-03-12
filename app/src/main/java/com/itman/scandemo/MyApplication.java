package com.itman.scandemo;

import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;


    }


    public static MyApplication getInstance() {
        return context;
    }
}
