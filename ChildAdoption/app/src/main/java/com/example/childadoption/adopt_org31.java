package com.example.childadoption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class adopt_org31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopt_org31);
    }

    public void adopt_form31(View view) {
        startActivity(new Intent(getApplicationContext(),adoptation_form.class));

    }
}
