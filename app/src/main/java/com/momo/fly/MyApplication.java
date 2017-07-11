package com.momo.fly;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by xueying on 2017/7/11.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (usedFabric()) {
            Fabric.with(this, new Crashlytics());
        }
    }


    private boolean usedFabric() {
//        if (BuildConfig.BUILD_TYPE.equalsIgnoreCase("Debug")) {
//            return false;
//        }
        return true;
    }
}
