package com.example.resumemaker12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class persnoaldetails extends AppCompatActivity {
     Button btnsave;
     EditText Fname,Email,Mnumber,Address,Dbirthday,hobby,Study;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persnoaldetails);
        Initview();
    }

    private void Initview() {
        btnsave=findViewById(R.id.btnsave);
        Fname=findViewById(R.id.Fname);
        Email=findViewById(R.id.Email);
        Mnumber=findViewById(R.id.Mnumber);
        Address=findViewById(R.id.Address);
        Dbirthday=findViewById(R.id.Dbirthday);
        hobby=findViewById(R.id.hobby);
        Study=findViewById(R.id.Study);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String N =Fname.getText().toString();
                String E =Email.getText().toString();
                String M =Mnumber.getText().toString();
                String A =Address.getText().toString();
                String D =Dbirthday.getText().toString();
                String H =hobby.getText().toString();
                String S =Study.getText().toString();




                Intent intent =new Intent(persnoaldetails.this,printdetails.class);
                intent.putExtra("nameuser",N);
                intent.putExtra("Emailuser",E);
                intent.putExtra("Mobilenumber",M);
                intent.putExtra("Adressuser",A);
                intent.putExtra("birthuser",D);
                intent.putExtra("hobbyuser",H);
                intent.putExtra("studyuser",S);




                startActivity(intent);
            }
        });






    }
}