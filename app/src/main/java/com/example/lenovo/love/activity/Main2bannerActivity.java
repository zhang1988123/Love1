package com.example.lenovo.love.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.lenovo.love.R;
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.List;

public class Main2bannerActivity extends AppCompatActivity {

    private FlyBanner mBanner;
    private TextView mBtn;

    private List<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        initData();
    }

    private void initData() {
        list.add(R.mipmap.aa);
        list.add(R.mipmap.bb);
        list.add(R.mipmap.fff);
        mBanner.setImages(list);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2bannerActivity.this, LastActivity.class));
            }
        });
    }

    private void initView() {
        mBanner = (FlyBanner) findViewById(R.id.mBanner);
        mBtn = (TextView) findViewById(R.id.mBtn);

    }


}
