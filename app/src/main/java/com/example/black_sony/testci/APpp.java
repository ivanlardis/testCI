package com.example.black_sony.testci;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by black-sony on 13.02.17.
 */

public class APpp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        if ( BuildConfig.WITH_LOGS) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
