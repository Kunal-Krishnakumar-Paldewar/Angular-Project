package com.example.childadoption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Organization_Activity extends AppCompatActivity {

    private CardView or1,or2,or3,or4,or5,or6,or7,or8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization_);

        or1=(CardView) findViewById(R.id.org1);
        or2=(CardView) findViewById(R.id.org2);
        or3=(CardView) findViewById(R.id.org3);
        or4=(CardView) findViewById(R.id.org4);
        or5=(CardView) findViewById(R.id.org5);
        or6=(CardView) findViewById(R.id.org6);
        or7=(CardView) findViewById(R.id.org7);
        or8=(CardView) findViewById(R.id.org9);


        or1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org1_Activity.class));
            }
        });

        or2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org2_Activity.class));
            }
        });
        or3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org3_Activity.class));
            }
        });
        or4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org4_Activity.class));
            }
        });
        or5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org5_Activity.class));
            }
        });
        or6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org6_Activity.class));
            }
        });

        or7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org7_Activity.class));
            }
        });
        or8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),org8_Activity.class));
            }
        });
    }


   }
