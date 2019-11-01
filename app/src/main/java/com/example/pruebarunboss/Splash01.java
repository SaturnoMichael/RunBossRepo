package com.example.pruebarunboss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import android.os.Handler;

public class Splash01 extends Activity {
    Handler handle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash01);
        handle=new Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Splash01.this,splashCrafters.class);
                startActivity(intent);
                finish();
            }
        },10);

    }
}
