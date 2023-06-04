package com.example.childadoption;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class adoptation_form extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] gender={"Male","Female"};
    Button btn1;
    EditText childname,childage;
    DatabaseReference databaseAdopt;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoptation_form);
        databaseAdopt = FirebaseDatabase.getInstance().getReference("adopt");

        childage=(EditText)findViewById(R.id.ageid);
        childname=(EditText) findViewById(R.id.childname);
        btn1=(Button) findViewById(R.id.adoptchild);
        spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addAdopt();
            }
        });
        ArrayAdapter aa=new ArrayAdapter(this, android.R.layout.simple_spinner_item,gender);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

    }

    private void addAdopt() {
        String name= childname.getEditableText().toString().trim();
        String age = childage.getEditableText().toString().trim();
        String gen=spin.getSelectedItem().toString();
        if(TextUtils.isEmpty(age)){
            childage.setError("You should Enter a Age");
            // Toast.makeText(this, "You should enter a age ", Toast.LENGTH_LONG).show();
        }
        if(!TextUtils.isEmpty(name))
        {
            String id = databaseAdopt.push().getKey();
            Adopt adopt = new Adopt(id,name,age,gen);
            databaseAdopt.child(id).setValue(adopt);
            Toast.makeText(this,"Adoption Form submitted Successfully",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this, "You should enter a name ", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),gender[position] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
