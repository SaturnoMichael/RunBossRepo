package com.example.pruebarunboss;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RunBossSplash extends AppCompatActivity {
    Handler handle;
    private SharedPreferences mPrefs;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.runbossplash);
        handle=new Handler();

        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Cargaremos las configuraciones de la app y si es primera vez que se usa, mostraremos la pantalla de seleccion
                // de lo contrario lo mandamos a la pantalla indicada
                mPrefs = getSharedPreferences(getString(R.string.RumbosConf), MODE_PRIVATE);

                Intent intent= new Intent(RunBossSplash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },1500);
    }
}
