package com.momo.fly;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void force_crash(View view) {
        throw new RuntimeException("this is a crash");
    }
}
