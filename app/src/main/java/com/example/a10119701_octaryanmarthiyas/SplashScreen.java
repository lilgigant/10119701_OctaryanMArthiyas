package com.example.a10119701_octaryanmarthiyas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import static com.example.a10119701_octaryanmarthiyas.R.layout.splashscreen;

public class SplashScreen extends Activity{

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(splashscreen);
        Thread thread = new Thread() {
            public void  run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
