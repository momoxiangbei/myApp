package com.momo.fly;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.andexert.library.RippleView;
import com.momo.fly.recyclerView.MyRecyclerViewActivity;
import com.momo.fly.viewpager.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {
    private RippleView recyclerView_r;
    private RippleView viewpager_r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView_r = (RippleView) findViewById(R.id.recyclerView_r);
        viewpager_r = (RippleView) findViewById(R.id.viewpager_r);

        recyclerView_r.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {

            @Override
            public void onComplete(RippleView rippleView) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MyRecyclerViewActivity.class);
                startActivity(intent);
            }

        });

        viewpager_r.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {

            @Override
            public void onComplete(RippleView rippleView) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }

        });
    }

}
