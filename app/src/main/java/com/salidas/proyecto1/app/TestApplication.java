package com.salidas.proyecto1.app;

import android.app.Application;
import android.content.Context;


/**
 * Created by Sebastian on 21/04/17.
 */

public class TestApplication extends Application {

    static TestApplication instance;

    public static TestApplication getInstance() {
        return instance;
    }

    public static Context getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }
}
