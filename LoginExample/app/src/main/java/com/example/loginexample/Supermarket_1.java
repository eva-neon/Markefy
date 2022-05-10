package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Supermarket_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supermarket1);

        ImageButton back_btn;
        back_btn = (ImageButton) findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(com.example.loginexample.Supermarket_1.this, Shopping.class);
                startActivity(i);
            }
        });

        ImageButton r1_c1;
        r1_c1 = (ImageButton) findViewById(R.id.r1_c1);
        r1_c1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(com.example.loginexample.Supermarket_1.this, Article.class);
                startActivity(i);
            }
        });
    }
}