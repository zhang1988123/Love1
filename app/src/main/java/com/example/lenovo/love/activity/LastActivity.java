package com.example.lenovo.love.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.lenovo.love.R;

import java.util.Timer;
import java.util.TimerTask;

public class LastActivity extends AppCompatActivity {

    private TextView mText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        initView();
    }

    private void initView() {
        mText = (TextView) findViewById(R.id.mText);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim2);
        mText.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                try {
                    Thread.sleep(2000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(LastActivity.this, Main3ShouActivity.class));
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
