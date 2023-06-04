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

public class org2_Activity extends AppCompatActivity {

    TextView el1,el2,el3,el4,el5,el6;
    Button btn,btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org2_);


        el1 = (TextView) findViewById(R.id.tew4);
        el1.setText(Html.fromHtml("<a href=\"mailto:sofosh@vsnl.net\">Email : sofosh@vsnl.net</a>"));
        el1.setMovementMethod(LinkMovementMethod.getInstance());

        el2 = (TextView) findViewById(R.id.tew8);
        el2.setText(Html.fromHtml("<a href=\"mailto: bssk@bsskindia.org\">Email :  bssk@bsskindia.org</a>"));
        el2.setMovementMethod(LinkMovementMethod.getInstance());

        el3 = (TextView) findViewById(R.id.tew12);
        el3.setText(Html.fromHtml("<a href=\"mailto: rsg_94@yahoo.co.in\">Email :  rsg_94@yahoo.co.in</a>"));
        el3.setMovementMethod(LinkMovementMethod.getInstance());

        el4 = (TextView) findViewById(R.id.tew16);
        el4.setText(Html.fromHtml("<a href=\"mailto: priyadarshaniadoption@yahoo.com \">Email : priyadarshaniadoption@yahoo.com </a>"));
        el4.setMovementMethod(LinkMovementMethod.getInstance());

        el5 = (TextView) findViewById(R.id.tew20);
        el5.setText(Html.fromHtml("<a href=\"mailto:  d.v.tikekar@vsnl.com  \">Email :  d.v.tikekar@vsnl.com  </a>"));
        el5.setMovementMethod(LinkMovementMethod.getInstance());

        el6 = (TextView) findViewById(R.id.tew24);
        el6.setText(Html.fromHtml("<a href=\"mailto: preetindianadoption@vsnl.net  \">Email : preetindianadoption@vsnl.net  </a>"));
        el6.setMovementMethod(LinkMovementMethod.getInstance());




        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:91-020-26124660"));
                startActivity(intent);


            }
        });

        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:91-020-26128002"));
                startActivity(intent);


            }
        });

        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:020-32662982"));
                startActivity(intent);


            }
        });


        btn3=(Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:020-27122630"));
                startActivity(intent);


            }
        });

        btn4=(Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:25436851"));
                startActivity(intent);


            }
        });

        btn5=(Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 26360081"));
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

    public void donate4(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate5(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void org1(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org11.class));


    }

    public void org2(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org12.class));

    }

    public void org3(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org13.class));

    }

    public void org4(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org14.class));

    }

    public void org5(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org15.class));

    }

    public void org6(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org16.class));

    }
}
