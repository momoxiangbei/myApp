package com.momo.fly;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by xueying on 2017/7/11.
 *
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Fabric收集crash
        Fabric.with(this, new Crashlytics());
    }

}
