package com.example.childadoption;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {



    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent homeintent = new Intent(MainActivity.this, LoginForm.class);
                startActivity(homeintent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }




}
