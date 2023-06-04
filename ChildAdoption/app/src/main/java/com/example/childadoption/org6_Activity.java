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

public class org6_Activity extends AppCompatActivity {

    TextView t1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org6_);

        t1 = (TextView) findViewById(R.id.tw4);
        t1.setText(Html.fromHtml("<a href=\"mailto:dss.mhaswad@gmail.com\">Email : dss.mhaswad@gmail.com</a>"));
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9112908689"));
                startActivity(intent);


            }
        });




    }

    public void donate(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void org1(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org61.class));

    }
}
