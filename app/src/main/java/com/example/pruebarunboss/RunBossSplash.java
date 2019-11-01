package com.example.pruebarunboss;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RunBossSplash extends AppCompatActivity {
    Handler handle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.runbossplash);
        handle=new Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(RunBossSplash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1500);
    }
}
