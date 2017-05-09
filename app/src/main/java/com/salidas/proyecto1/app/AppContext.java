package com.salidas.proyecto1.app;

import android.content.Context;

/**
 * Created by esteban on 2/05/17.
 */

public class AppContext {
    private static Context globalContext;

    public static Context getGlobalContext() {
        return globalContext;
    }

    public static void setGlobalContext(Context globalContext) {
        AppContext.globalContext = globalContext;
    }
}
