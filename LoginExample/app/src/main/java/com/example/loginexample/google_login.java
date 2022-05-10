package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class google_login extends AppCompatActivity {

    Button login_btn;
    ImageButton google_back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_login);
        login_btn = (Button) findViewById(R.id.login_btn);
        google_back_btn = (ImageButton) findViewById(R.id.google_back_btn);

        login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( google_login.this, Shopping.class);
                startActivity(i);
            }
        });

        google_back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( google_login.this, main_login.class);
                startActivity(i);
            }
        });
    }
}