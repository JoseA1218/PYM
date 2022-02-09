package com.example.pm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    static Button bt1,bt2;
    String DNI="";
    String password="";
    EditText etDNI,etPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt1= (Button) findViewById(R.id.button);
        bt2=(Button) findViewById(R.id.button2);
        etDNI=(EditText) findViewById(R.id.etDNI);
        etPasswd=(EditText) findViewById(R.id.etPasswd);

    }

    public void botonEnviar(View v){
        //Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade);
        //bt1.startAnimation(animation);
        animaFab(bt1);
        DNI=etDNI.getText().toString();
        password=etPasswd.getText().toString();
        validacion();


    }
    public void validacion(){
        if(!DNI.isEmpty() && !password.isEmpty()){
            if(DNI.equals("123456789B")&&password.equals("BANCOPYM")){

                startActivity(new Intent(login.this,MainActivity.class));

            }else {

                Toast.makeText(login.this, "DNI o Contraseña incorrectos", Toast.LENGTH_LONG).show();

            }
        }else {
            Toast.makeText(login.this, "Complete los campos requeridos", Toast.LENGTH_LONG).show();

        }
    }

    public void botonRegistrar(View v){
        animaFab(bt2);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade);
    }
    private void animaFab(final Button bt){
        bt.animate().scaleX(0.7f).scaleY(0.7f).setDuration(60).withEndAction(new Runnable() {
            @Override
            public void run() {
                bt.animate().scaleX(1f).scaleY(1f);
            }
        });
    }
}