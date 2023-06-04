package com.example.childadoption;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class org7_Activity extends AppCompatActivity {

    TextView el1,el2;
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org7_);

        el1 = (TextView) findViewById(R.id.tw4);
        el1.setText(Html.fromHtml("<a href=\"mailto:pakhar_sankul.rediffmail.com\">Email :pakhar_sankul.rediffmail.com</a>"));
        el1.setMovementMethod(LinkMovementMethod.getInstance());

        el2 = (TextView) findViewById(R.id.tww8);
        el2.setText(Html.fromHtml("<a href=\"mailto:  wbnb.pp@gmail.com  \">Email : wbnb.pp@gmail.com</a>"));
        el2.setMovementMethod(LinkMovementMethod.getInstance());


        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0217 2321466"));
                startActivity(intent);


            }
        });

        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7768957852"));
                startActivity(intent);


            }
        });



    }

    public void donate1(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate2(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void org1(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org71.class));

    }

    public void org2(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org72.class));

    }
}
