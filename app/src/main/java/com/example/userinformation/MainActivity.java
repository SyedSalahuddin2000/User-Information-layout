package com.example.userinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity {
    EditText userName,userEmail,userMobile,userDOB,userGender;
    RadioButton userMale,userFemale;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=findViewById(R.id.userName);
        userEmail=findViewById(R.id.userEmail);
        userMobile=findViewById(R.id.userMobile);
        //userGender=findViewById(R.id.userGender);
        userDOB=findViewById(R.id.userDOB);
        userMale=findViewById(R.id.userMale);
        userFemale=findViewById(R.id.userFemale);
        btnsubmit=findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String userName1=userName.getText().toString();
                String userEmail1=userEmail.getText().toString();
                String userMobile1=userMobile.getText().toString();
                String userDOB1=userDOB.getText().toString();
                String userMale1=userMale.getText().toString();
                String userFemale1=userFemale.getText().toString();
               // String userGender1=userGender.getText().toString();

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name",userName1);
                intent.putExtra("Email",userEmail1);
                intent.putExtra("Mobile",userMobile1);
                intent.putExtra("DOB",userDOB1);
                intent.putExtra("Male",userMale1);
                intent.putExtra("Female",userFemale1);
                startActivity(intent);
                Toast toast=Toast.makeText(MainActivity.this,"user information", LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.LEFT, 0, 0 );
                toast.show();
            }
        });
    }
}