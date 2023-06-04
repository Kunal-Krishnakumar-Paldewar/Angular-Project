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

public class org5_Activity extends AppCompatActivity {

    TextView el1,el2,el3;
    Button btn,btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org5_);


        el1 = (TextView) findViewById(R.id.tw4);
        el1.setText(Html.fromHtml("<a href=\"mailto:spsloha@gmail.com\">Email : spsloha@gmail.com</a>"));
        el1.setMovementMethod(LinkMovementMethod.getInstance());

        el2 = (TextView) findViewById(R.id.ww8);
        el2.setText(Html.fromHtml("<a href=\"mailto: snmm@rediffmail.com\">Email : snmm@rediffmail.com</a>"));
        el2.setMovementMethod(LinkMovementMethod.getInstance());

        el3 = (TextView) findViewById(R.id.tww12);
        el3.setText(Html.fromHtml("<a href=\"mailto: n.v.gutte@gmail.com\">Email : n.v.gutte@gmail.com</a>"));
        el3.setMovementMethod(LinkMovementMethod.getInstance());


        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 9923842601"));
                startActivity(intent);


            }
        });

        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9423306800"));
                startActivity(intent);


            }
        });

        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7350518003"));
                startActivity(intent);


            }
        });

        btn3=(Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9960127595"));
                startActivity(intent);


            }
        });






    }

    public void donate(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate1(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate2(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate3(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));


    }

    public void org1(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org51.class));

    }

    public void org2(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org52.class));

    }

    public void org3(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org53.class));

    }

    public void org4(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org54.class));

    }
}
