package com.csuft.taoquan.base;

import android.app.Application;
import android.content.Context;

import com.csuft.detector.PageDetector;

public class BaseApplication extends Application {

    private static Context appContext;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PageDetector.instance().init(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }


    public static Context getAppContext() {
        return appContext;
    }
}
