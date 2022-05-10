package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class forgot_password extends AppCompatActivity {

    Button ok_btn;
    ImageButton password_back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);
        ok_btn = (Button) findViewById(R.id.ok_btn);
        ok_btn.setOnClickListener((View.OnClickListener) this);
        password_back_btn = (ImageButton) findViewById(R.id.password_back_btn);

        ok_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ok_btn.setText("Please check your email");
                Intent i = new Intent(forgot_password.this, Shopping.class);
                startActivity(i);
            }
        });

        password_back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent( forgot_password.this, main_login.class);
                startActivity(i);
            }
        });
    }
}