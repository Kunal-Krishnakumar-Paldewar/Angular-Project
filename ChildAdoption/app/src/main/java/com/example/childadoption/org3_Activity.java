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

public class org3_Activity extends AppCompatActivity {


    TextView ee1,ee2;
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org3_);

        ee1 = (TextView) findViewById(R.id.tw4);
        ee1.setText(Html.fromHtml("<a href=\"mailto:sakaradoption@gmail.com\">Email : sakaradoption@gmail.com</a>"));
        ee1.setMovementMethod(LinkMovementMethod.getInstance());

        ee2 = (TextView) findViewById(R.id.tww8);
        ee2.setText(Html.fromHtml("<a href=\"mailto:aniketan@bsskindia.org\">Email : aniketan@bsskindia.org</a>"));
        ee2.setMovementMethod(LinkMovementMethod.getInstance());


        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:09673101760"));
                startActivity(intent);


            }
        });

        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9423449651"));
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


    public void org1(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org21.class));

    }

    public void org2(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org22.class));

    }

}
