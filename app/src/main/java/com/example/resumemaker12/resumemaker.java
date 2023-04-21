package com.example.resumemaker12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class resumemaker extends AppCompatActivity {
    LinearLayout linpersonal;
    CardView card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumemaker);
        initivew();
    }

    private void initivew() {
        linpersonal=findViewById(R.id.linpersonal);
        card2=findViewById(R.id.card2);
        linpersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(resumemaker.this,persnoaldetails.class);
                startActivity(b);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(resumemaker.this,fourthpage.class);
                startActivity(c);
            }
        });

    }
}