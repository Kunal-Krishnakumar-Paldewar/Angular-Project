package com.example.childadoption;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

import org.w3c.dom.Text;

public class SignupForm extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText emailid,pword;
    private Button regbtn;
    private ProgressDialog mRegPocess;


    public void Loginbtn(View view) {
        startActivity(new Intent(getApplicationContext(), LoginForm.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        mRegPocess=new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();


        emailid=(EditText) findViewById(R.id.email);
        pword=(EditText)findViewById(R.id.password);
        regbtn=(Button)findViewById(R.id.regbtn1);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_email=emailid.getEditableText().toString();
                String s_pass=pword.getEditableText().toString();
                if (! TextUtils.isEmpty(s_email)|| TextUtils.isEmpty(s_pass)){
                  mRegPocess.setTitle("Registering User");
                  mRegPocess.setMessage("Please Wait while we create your Account");
                  mRegPocess.setCanceledOnTouchOutside(false);
                  mRegPocess.show();
                  reg_user(s_email,s_pass);
                }
            }
        });
    }
    private void reg_user( String s_email, String s_pass) {
        if (s_email.isEmpty()){
            emailid.setError("Email is Required...!");
            emailid.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(s_email).matches()){
            emailid.setError("Please enter a Valid Email...!");
            emailid.requestFocus();
            return;
        }
        if (s_pass.isEmpty()){
            pword.setError("Password is Required...!");
            pword.requestFocus();
            return;
        }
        if(s_pass.length()<6){
            pword.setError("Minimum Length of Password is six");
            pword.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(s_email,s_pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    mRegPocess.dismiss();
                    Intent mainIntent =new Intent(SignupForm.this,LoginForm.class);
                    startActivity(mainIntent);
                    Toast.makeText(getApplicationContext(),"Registration Successfully Completed...",Toast.LENGTH_SHORT).show();
                    finish();

                }else {
                    mRegPocess.hide();
                    if(task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(),"You are Already Registered",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(SignupForm.this,"Cannot Sign In...Please Try Again..",Toast.LENGTH_LONG).show();

                }
            }
        });
    }


}



