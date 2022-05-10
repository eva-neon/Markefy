package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.loginexample.R;
import com.example.loginexample.Shopping;
import com.example.loginexample.facebook_login;
import com.example.loginexample.google_login;

public class main_login extends AppCompatActivity {

    Button login_btn;
    ImageButton facebook_login_btn;
    ImageButton google_login_btn;
    TextView forgot_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( com.example.loginexample.main_login.this, Shopping.class);
                startActivity(i);
            }
        });

        facebook_login_btn = (ImageButton) findViewById(R.id.facebook_login_btn);
        facebook_login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(com.example.loginexample.main_login.this, facebook_login.class);
                startActivity(i);
            }
        });

        google_login_btn = (ImageButton) findViewById(R.id.google_login_btn);
        google_login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(com.example.loginexample.main_login.this, google_login.class);
                startActivity(i);
            }
        });

        forgot_password = (TextView) findViewById(R.id.forgot_password);
        forgot_password.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( com.example.loginexample.main_login.this, forgot_password.class);
                startActivity(i);
            }
        });
    }
}