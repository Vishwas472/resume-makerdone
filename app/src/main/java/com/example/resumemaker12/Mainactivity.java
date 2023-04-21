package com.example.resumemaker12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mainactivity extends AppCompatActivity {
    ImageView imgADD;

    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiview();

    }


    private void intiview() {
        imgADD=findViewById(R.id.imgADD);

        imgADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Mainactivity.this,Loginactivity.class);
                startActivity(a);
            }
        });
    }
}