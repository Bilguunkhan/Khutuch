package com.example.bilguun.khutuch;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class video extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //action bar text and logo
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);

        final Button video = (Button)findViewById(R.id.video);
        final Button publicChat = (Button)findViewById(R.id.publicchat);
        final Button contactProfessional = (Button)findViewById(R.id.contactprofessional);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                video.setBackgroundColor(Color.WHITE);
                video.setTextColor(Color.parseColor("#ff9a35"));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=Hxy8BZGQ5Jo")));
            }
        });

        publicChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                publicChat.setBackgroundColor(Color.WHITE);
                publicChat.setTextColor(Color.parseColor("#ff9a35"));
                startActivity(new Intent(video.this, PublicChat.class));
            }
        });

        contactProfessional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactProfessional.setBackgroundColor(Color.WHITE);
                contactProfessional.setTextColor(Color.parseColor("#ff9a35"));
                startActivity(new Intent(video.this, SendPrivateMessage.class));
            }
        });
    }
}
