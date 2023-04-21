package com.example.resumemaker12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthpage extends AppCompatActivity {
    Button btnS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthpage);
        initview();
    }

    private void initview() {
        btnS=findViewById(R.id.btnS);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(fourthpage.this,resumemaker.class);
                startActivity(b);
            }
        });
    }
}