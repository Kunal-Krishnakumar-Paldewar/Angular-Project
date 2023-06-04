package com.example.childadoption;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
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
import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.auth.FirebaseUser;

public class LoginForm extends AppCompatActivity  {
    private FirebaseAuth mAuth;
    private EditText emailid1,pword1;
    private Button lgbtn ,forgetpassword;
    private ProgressDialog mRgPocess;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        mRgPocess=new ProgressDialog(this);
        mAuth=FirebaseAuth.getInstance();

        emailid1=(EditText) findViewById(R.id.l_email);
        pword1=(EditText)findViewById(R.id.l_password);
        lgbtn=(Button) findViewById(R.id.logbtn);
        forgetpassword = (Button)findViewById(R.id.forget_pass);

        lgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_email=emailid1.getEditableText().toString();
                String s_pass=pword1.getEditableText().toString();
                if (! TextUtils.isEmpty(s_email) || TextUtils.isEmpty(s_pass)){
                    mRgPocess.setTitle("Logging User");
                    mRgPocess.setMessage("Please Wait while we LogIn");
                    mRgPocess.setCanceledOnTouchOutside(false);
                    mRgPocess.show();
                    userLogin();
                }
            }
        });
        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginForm.this,PasswordActivity.class));
            }
        });
    }



    private void userLogin() {
         String s_email=emailid1.getEditableText().toString().trim();
         String s_pass=pword1.getEditableText().toString().trim();
        if (s_email.isEmpty()){
            emailid1.setError("Email is Required...!");
            emailid1.requestFocus();
            return;
        }
         if (!Patterns.EMAIL_ADDRESS.matcher(s_email).matches()){
             emailid1.setError("Please enter a Valid Email...!");
             emailid1.requestFocus();
             return;
         }
        if (s_pass.isEmpty()){
            pword1.setError("Password is Required...!");
            pword1.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(s_email,s_pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                mRgPocess.dismiss();
                if(task.isSuccessful()){

                    Intent mintent=new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(mintent);
                    finish();
                    mintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    Toast.makeText(getApplicationContext(),"LogIn Successfully Done....!!",Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void gotosignup(View view) {
        startActivity(new Intent(getApplicationContext(),SignupForm.class));
    }

}
