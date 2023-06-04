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

public class org1_Activity extends AppCompatActivity {

    TextView emaillink,elink,elink1,elink2,elink3,elink4,elink5,elink6,elink7,elink8;
    Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org1_);

        emaillink = (TextView) findViewById(R.id.textview4);
        emaillink.setText(Html.fromHtml("<a href=\"mailto:mbalanand@hotmail.com\">Email : mbalanand@hotmail.com</a>"));
        emaillink.setMovementMethod(LinkMovementMethod.getInstance());

        elink = (TextView) findViewById(R.id.textview8);
        elink.setText(Html.fromHtml("<a href=\"mailto:cwb@bom5.vsnl.net.in\">Email : cwb@bom5.vsnl.net.in</a>"));
        elink.setMovementMethod(LinkMovementMethod.getInstance());

        elink1 = (TextView) findViewById(R.id.textview12);
        elink1.setText(Html.fromHtml("<a href=\"mailto:balvikas@vsnl.com\">Email : balvikas@vsnl.com</a>"));
        elink1.setMovementMethod(LinkMovementMethod.getInstance());

        elink2 = (TextView) findViewById(R.id.textview16);
        elink2.setText(Html.fromHtml("<a href=\"mailto:stcath@mtnl.net.in\">Email : stcath@mtnl.net.in</a>"));
        elink2.setMovementMethod(LinkMovementMethod.getInstance());


        elink3 = (TextView) findViewById(R.id.tview4);
        elink3.setText(Html.fromHtml("<a href=\"mailto:hwws@rediffmail.com\">Email : hwws@rediffmail.com</a>"));
        elink3.setMovementMethod(LinkMovementMethod.getInstance());

        elink4 = (TextView) findViewById(R.id.tview8);
        elink4.setText(Html.fromHtml("<a href=\"mailto:m.s.w.c.ashasadan@mtnl.net.in\">Email : m.s.w.c.ashasadan@mtnl.net.in</a>"));
        elink4.setMovementMethod(LinkMovementMethod.getInstance());

        elink5 = (TextView) findViewById(R.id.tview12);
        elink5.setText(Html.fromHtml("<a href=\"mailto:adoption@vsnl.com\">Email : adoption@vsnl.com</a>"));
        elink5.setMovementMethod(LinkMovementMethod.getInstance());

        elink6 = (TextView) findViewById(R.id.tview16);
        elink6.setText(Html.fromHtml("<a href=\"mailto:smss@vsnl.com\">Email : smss@vsnl.com</a>"));
        elink6.setMovementMethod(LinkMovementMethod.getInstance());

        elink7 = (TextView) findViewById(R.id.tv4);
        elink7.setText(Html.fromHtml("<a href=\"mailto:iapa@vsnl.com \">Email : iapa@vsnl.com </a>"));
        elink7.setMovementMethod(LinkMovementMethod.getInstance());

        elink8 = (TextView) findViewById(R.id.tv8);
        elink8.setText(Html.fromHtml("<a href=\"mailto:vatsalyatrust@inidatimes.com  \">Email : vatsalyatrust@inidatimes.com  </a>"));
        elink8.setMovementMethod(LinkMovementMethod.getInstance());


        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:25202262"));
                startActivity(intent);


            }
        });

        btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:022-66602196"));
                startActivity(intent);


            }
        });

        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:022-28422802"));
                startActivity(intent);


            }
        });


        btn3=(Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:91-022-26763021"));
                startActivity(intent);


            }
        });

        btn4=(Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:91-022-24012252"));
                startActivity(intent);


            }
        });

        btn5=(Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:23740397"));
                startActivity(intent);


            }
        });

        btn6=(Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:91-022-24926526"));
                startActivity(intent);


            }
        });


        btn7=(Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:24092266"));
                startActivity(intent);


            }
        });



        btn8=(Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 24374938"));
                startActivity(intent);


            }
        });


        btn9=(Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 022-25794798"));
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

    public void donate6(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate7(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate8(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void donate9(View view) {
        startActivity(new Intent(getApplicationContext(),Donate_Activity.class));

    }

    public void org1(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org1.class));
    }

    public void org2(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org2.class));

    }

    public void org3(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org3.class));
    }

    public void org4(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org4.class));

    }

    public void org5(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org5.class));

    }

    public void org6(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org6.class));

    }

    public void org7(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org7.class));

    }

    public void org8(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org8.class));

    }

    public void org9(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org9.class));

    }

    public void org10(View view) {
        startActivity(new Intent(getApplicationContext(),adopt_org10.class));

    }
}

