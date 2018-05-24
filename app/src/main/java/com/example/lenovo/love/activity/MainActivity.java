package com.example.lenovo.love.activity;

import android.Manifest;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lenovo.love.R;


public class MainActivity extends AppCompatActivity {

    private ImageView mImg;
    String[] mPermissionList = new String[]{
            "android.permission.INTERNET",
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.CALL_PHONE,
            Manifest.permission.READ_LOGS,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.SET_DEBUG_APP,
            Manifest.permission.SYSTEM_ALERT_WINDOW,
            Manifest.permission.GET_ACCOUNTS,
            Manifest.permission.WRITE_APN_SETTINGS};
    public MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        if (Build.VERSION.SDK_INT >= 23) {//SDK版本是6.0以上(包含6.0)
            ActivityCompat.requestPermissions(this, mPermissionList, 123);
        }


        mediaPlayer = mediaPlayer.create(MainActivity.this,R.raw.wonderfulu);
        mediaPlayer.start();

    }

    private void initView() {
        mImg = (ImageView) findViewById(R.id.mImg);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim);
        mImg.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(MainActivity.this, Main2bannerActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
//            Toast.makeText(this, "按下了back键   onKeyDown()", Toast.LENGTH_SHORT).show();
            mediaPlayer.stop();
finish();
            return true;
        }else {
            return super.onKeyDown(keyCode, event);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "执行 onDestroy()", Toast.LENGTH_SHORT).show();
    }
}
