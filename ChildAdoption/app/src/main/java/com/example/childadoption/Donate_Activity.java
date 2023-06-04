package com.example.childadoption;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Donate_Activity extends AppCompatActivity  {

    EditText et1,contact,donamtr;
    Button btn1;
    DatabaseReference databaseDonor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_);
        databaseDonor = FirebaseDatabase.getInstance().getReference("donor");

        contact=(EditText)findViewById(R.id.cntct);
        et1= (EditText) findViewById(R.id.name);
        btn1=(Button) findViewById(R.id.donbtn);
        donamtr=(EditText) findViewById(R.id.donamt);

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                addDonor();
           }
       });

    }


    private void addDonor(){

        String name= et1.getEditableText().toString().trim();
        String phone = contact.getEditableText().toString().trim();
        String amt= donamtr.getText().toString().trim();

      if(TextUtils.isEmpty(phone)){
            Toast.makeText(getApplicationContext(),"Enter a Contact No.",Toast.LENGTH_LONG).show();
            return;
        }
        if(phone.length()!=10)
        {
            Toast.makeText(getApplicationContext(),"Enter a valid No.",Toast.LENGTH_LONG).show();
            return;
        }
        if(!TextUtils.isEmpty(name)){
            String id = databaseDonor.push().getKey();
            Donor donor = new Donor(id,name,phone,amt);
             databaseDonor.child(id).setValue(donor);
             Toast.makeText(this,"donor added successfully",Toast.LENGTH_LONG).show();
             Intent payintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.paytm.com"));
             startActivity(payintent);


        }else{
            Toast.makeText(this, "You should enter a name ", Toast.LENGTH_LONG).show();
        }
    }



}
