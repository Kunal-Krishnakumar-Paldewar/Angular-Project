package com.example.childadoption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private  Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth=FirebaseAuth.getInstance();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Child Adoption");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser=mAuth.getCurrentUser();

        if(currentUser==null){
            Intent startIntent = new Intent(HomeActivity.this,LoginForm.class);
            startActivity(startIntent);
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.menulogout :
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(HomeActivity.this,LoginForm.class));
                finish();
                Toast.makeText(getApplicationContext(),"Logged Out Successfully...",Toast.LENGTH_SHORT).show();
                break;

            case R.id.home :
                this.finish();
                break;
        }

        return true;
    }

    public void Rule_btn(View view) {
        startActivity(new Intent(HomeActivity.this, Rule_Activity.class));
    }

    public void tip_btn(View view) {
        startActivity(new Intent(HomeActivity.this,tip_Activity.class));
    }

    public void process_btn(View view) {
        startActivity(new Intent(HomeActivity.this,process_Activity.class));
    }


    public void intro_btn(View view) {
        startActivity( new Intent(HomeActivity.this,introduction_Activity.class));
    }


    public void organ_btn(View view) {
        startActivity(new Intent(HomeActivity.this,Organization_Activity.class));
    }

    public void fdback(View view) {
        startActivity(new Intent(getApplicationContext(),feedback1.class));
    }
}
