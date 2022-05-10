package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class facebook_login extends AppCompatActivity {

    Button login_btn;
    ImageButton facebook_back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);
        login_btn = (Button) findViewById(R.id.login_btn);
        facebook_back_btn = (ImageButton) findViewById(R.id.facebook_back_btn);

        login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( facebook_login.this, Shopping.class);
                startActivity(i);
            }
        });

        facebook_back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( facebook_login.this, main_login.class);
                startActivity(i);
            }
        });
    }
}