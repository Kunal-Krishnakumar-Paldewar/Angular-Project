package com.example.childadoption;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class feedback1 extends AppCompatActivity {

    EditText editTextName;
    EditText editTextName1,editTextname2;
    Button buttonadd;

    DatabaseReference databasefeedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback1);

        databasefeedback = FirebaseDatabase.getInstance().getReference("feedback");

        editTextName=(EditText) findViewById(R.id.usrnm);
        editTextName1=(EditText) findViewById(R.id.feedback);
        editTextname2=(EditText) findViewById(R.id.editTextemail);
        buttonadd=(Button)findViewById(R.id.btn);


        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addfeedback();
            }
        });
    }





    private void addfeedback(){
        String name= editTextName.getText().toString().trim();
        String name1=editTextName1.getText().toString().trim();
        String email=editTextname2.getText().toString().trim();

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(getApplicationContext(),"Enter a valid Email",Toast.LENGTH_LONG).show();
            return;
        }

        if ((!TextUtils.isEmpty(name))){

            String id =databasefeedback.push().getKey();
            feedback feedback=new feedback(id,name,name1,email);
            databasefeedback.child(id).setValue(feedback);
            Toast.makeText(this, "feedback submitted successfully", Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(this, "enter username", Toast.LENGTH_SHORT).show();
        }
    }

}


