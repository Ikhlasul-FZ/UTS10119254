package com.example.uts10119254.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.uts10119254.MainActivity;
import com.example.uts10119254.R;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.splash_activity);
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();

    }
}

//10119254_IkhlasulFZ_IF7