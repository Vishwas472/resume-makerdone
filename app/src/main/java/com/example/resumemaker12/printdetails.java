package com.example.resumemaker12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class printdetails extends AppCompatActivity {
    TextView txtname,txtemail,txtmobilenumber,txtadrees,txtbirth,txtHobby,txtstudy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_printdetails);
        initview();
    }

    private void initview() {
        txtname=findViewById(R.id.txtname);
        txtemail=findViewById(R.id.txtemail);
        txtmobilenumber=findViewById(R.id.txtmobilenumber);
        txtadrees=findViewById(R.id.txtadrees);
        txtbirth=findViewById(R.id.txtbirth);
        txtHobby=findViewById(R.id.txtHobby);
        txtstudy=findViewById(R.id.txtstudy);



        String username =getIntent().getStringExtra("nameuser");
        String Emailuser =getIntent().getStringExtra("Emailuser");
        String Mobileuser =getIntent().getStringExtra("Mobilenumber");
        String Adreesuser =getIntent().getStringExtra("Adressuser");
        String birthuser =getIntent().getStringExtra("birthuser");
        String hobbyuser =getIntent().getStringExtra("hobbyuser");
        String studyuser =getIntent().getStringExtra("studyuser");



        txtname.setText(username);
        txtemail.setText(Emailuser);
        txtmobilenumber.setText(Mobileuser);
        txtadrees.setText(Adreesuser);
        txtbirth.setText(birthuser);
        txtHobby.setText(hobbyuser);
        txtstudy.setText(studyuser);

    }
}