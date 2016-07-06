package com.momo.fly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.momo.fly.recyclerView.MyRecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recyclerView(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,MyRecyclerViewActivity.class);
        startActivity(intent);
    }
}
