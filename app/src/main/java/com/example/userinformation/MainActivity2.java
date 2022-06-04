package com.example.userinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView uEmail,uName;
    TextView uMobile;
    TextView uDOB;
    TextView uGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        uName=findViewById(R.id.uName);
        uEmail=findViewById(R.id.uEmail);
        uMobile=findViewById(R.id.uMobile);
        uDOB=findViewById(R.id.uDOB);
        uGender=findViewById(R.id.uGender);

        String uName1=getIntent().getStringExtra("Name");
        String uEmail1=getIntent().getStringExtra("Email");
        String uDOB1=getIntent().getStringExtra("DOB");
        String uGender=getIntent().getStringExtra("Gender");
        String uMobile1=getIntent().getStringExtra("Mobile");

        uName.setText(uName1);
        uEmail.setText(uEmail1);
        uMobile.setText(uMobile1);
        uDOB.setText(uDOB1);




    }
}