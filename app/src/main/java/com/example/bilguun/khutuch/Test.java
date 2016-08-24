package com.example.bilguun.khutuch;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test extends AppCompatActivity {

    public int e;
    public int h;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //action bar text and logo
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);

        final Button btn55 = (Button)findViewById(R.id.submitButton);
        final Button btn1 = (Button)findViewById(R.id.button1);//e
        final Button btn5 = (Button)findViewById(R.id.button5);//h
        final Button btn11 = (Button)findViewById(R.id.button11);//h
        final Button btn13 = (Button)findViewById(R.id.button13);//e
        final Button btn17 = (Button)findViewById(R.id.button17);//h
        final Button btn19 = (Button)findViewById(R.id.button19);//e
        final Button btn22 = (Button)findViewById(R.id.button22);//e
        final Button btn26 = (Button)findViewById(R.id.button26);//h

        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test.this, video.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setBackgroundColor(Color.WHITE);
                btn1.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setBackgroundColor(Color.WHITE);
                btn5.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11.setBackgroundColor(Color.WHITE);
                btn11.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn13.setBackgroundColor(Color.WHITE);
                btn13.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn17.setBackgroundColor(Color.WHITE);
                btn17.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn19.setBackgroundColor(Color.WHITE);
                btn19.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn22.setBackgroundColor(Color.WHITE);
                btn22.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn26.setBackgroundColor(Color.WHITE);
                btn26.setTextColor(Color.parseColor("#ff9a35"));
            }
        });
    }
}
