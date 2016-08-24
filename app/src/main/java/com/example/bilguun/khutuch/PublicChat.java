package com.example.bilguun.khutuch;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PublicChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_chat);
        //action bar text and logo
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);


        final Button post = (Button)findViewById(R.id.post);
        final EditText blankField = (EditText)findViewById(R.id.blankEditText);
        final EditText actualPost = (EditText)findViewById(R.id.actualPost);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blankField.setText(actualPost.getText());
            }
        });    }
}
