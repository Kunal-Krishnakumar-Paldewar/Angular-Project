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

public class org8_Activity extends AppCompatActivity {

    TextView t1,t2;
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org8_);

        t1 = (TextView) findViewById(R.id.tw4);
        t1.setText(Html.fromHtml("<a href=\"mailto:shishu96kop@gmail.com\">Email :shishu96kop@gmail.com</a>"));
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        t2 = (TextView) findViewById(R.id.ww8);
        t2.setText(Html.fromHtml("<a href=\"mailto:pramiladjarag@yahoo.com\">Email :pramiladjarag@yahoo.com</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());


        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 9158016130"));
                startActivity(intent);

            }
        });

        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9930359499"));
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
        startActivity(new Intent(getApplicationContext(),adopt_org81.class));

    }

    public void org2(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org82.class));

    }
}
