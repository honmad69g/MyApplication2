package com.example.honmadaisuke.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btn1,btn2,btn3;Intent int1,int2,int3;int eyes = 3;

    private TextView textView;
    private Testclass test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

        btn1 = (Button) findViewById(R.id.send_button);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.send_button2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.send_button3);
        btn3.setOnClickListener(this);

        test = new Testclass();
        String str =  test.compare(eyes);
        textView.setText(str);

    }

    public void onClick(View v) {
        String originpath = "origin.jpg"; String selectphoto = "burapi.jpg";
        String position_origin = "[" +
                "{ID:1,parts:eyes,X:240,Y:214},{ID:2,parts:eyes,X:370,Y:210},{ID:3,parts:eyess,X:241,Y:230},{ID:4,parts:eyes,X:382,Y:235}," +
                "{ID:5,parts:nose,X:282,Y:219},{ID:6,parts:nose,X:320,Y:220},{ID:7,parts:nose,X:283,Y:275},{ID:8,parts:nose,X:325,Y:276}," +
                "{ID:9,parts:mouth,X:270,Y:296},{ID:10,parts:mouth,X:338,Y:295},{ID:11,parts:mouth,X:271,Y:310},{ID:12,parts:mouth,X:337,Y:312}" +
                "]";

        String position_select = "[" +
                "{ID:1,parts:eyes,X:80,Y:113},{ID:2,parts:eyes,X:208,Y:110},{ID:3,parts:eyess,X:81,Y:130},{ID:4,parts:eyes,X:210,Y:128}," +
                "{ID:5,parts:nose,X:120,Y:119},{ID:6,parts:nose,X:168,Y:117},{ID:7,parts:nose,X:151,Y:185},{ID:8,parts:nose,X:170,Y:128}," +
                "{ID:9,parts:mouth,X:110,Y:193},{ID:10,parts:mouth,X:178,Y:190},{ID:11,parts:mouth,X:151,Y:225},{ID:12,parts:mouth,X:190,Y:198}" +
                "]";

        switch (v.getId()){
            case R.id.send_button:
                int1 = new Intent(getApplication(), Main2Activity.class);
                int1.putExtra("Eyes", eyes);
                startActivity(int1);
                break;
            case R.id.send_button2:
                int2 = new Intent(getApplication(), Main3Activity.class);
                int2.putExtra("originpath",originpath);
                int2.putExtra("selectphoto",selectphoto);
                int2.putExtra("position_origin",position_origin);
                int2.putExtra("position_select",position_select);
                startActivity(int2);
                break;
            case R.id.send_button3:
                int3 = new Intent(getApplication(), Photocut.class);
                int3.putExtra("originpath",originpath);
                int3.putExtra("selectphoto",selectphoto);
                int3.putExtra("position_origin",position_origin);
                int3.putExtra("position_select",position_select);
                startActivity(int3);
                break;

        }}}

