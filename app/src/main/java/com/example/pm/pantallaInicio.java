package com.example.pm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class pantallaInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallainicio);

        startActivity(new Intent(pantallaInicio.this, login.class));
        /*Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                startActivity(new Intent(pantallaInicio.this, loginActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);            }
        }, 3000);*/
    }
}
