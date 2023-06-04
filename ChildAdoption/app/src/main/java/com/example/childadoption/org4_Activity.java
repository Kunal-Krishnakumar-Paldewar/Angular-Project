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

public class org4_Activity extends AppCompatActivity {

    TextView ee1,ee2,ee3,ee4;
    Button btn,btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org4_);

        ee1 = (TextView) findViewById(R.id.tw4);
        ee1.setText(Html.fromHtml("<a href=\"mailto:balashrayagmail.com\">Email : balashrayagmail.com</a>"));
        ee1.setMovementMethod(LinkMovementMethod.getInstance());

        ee2 = (TextView) findViewById(R.id.tww8);
        ee2.setText(Html.fromHtml("<a href=\"mailto: varadaan_ngp@yahoo.com \">Email :  varadaan_ngp@yahoo.com </a>"));
        ee2.setMovementMethod(LinkMovementMethod.getInstance());

        ee3 = (TextView) findViewById(R.id.tww12);
        ee3.setText(Html.fromHtml("<a href=\"mailto:vivekanandbalsadan@rediffmail.com \">Email :vivekanandbalsadan@rediffmail.com </a>"));
        ee3.setMovementMethod(LinkMovementMethod.getInstance());

        ee4 = (TextView) findViewById(R.id.tww16);
        ee4.setText(Html.fromHtml("<a href=\"mailto: parel_ngo@rediffmail.com \">Email : parel_ngo@rediffmail.com</a>"));
        ee4.setMovementMethod(LinkMovementMethod.getInstance());

        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9850424520"));
                startActivity(intent);


            }
        });

        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7588886617"));
                startActivity(intent);


            }
        });

        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 7709558334"));
                startActivity(intent);


            }
        });


        btn3=(Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9422818622"));
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
        startActivity(new Intent(getApplicationContext(),adopt_org31.class));

    }

    public void org2(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org32.class));

    }

    public void org3(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org33.class));

    }

    public void org4(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org34.class));

    }

}
