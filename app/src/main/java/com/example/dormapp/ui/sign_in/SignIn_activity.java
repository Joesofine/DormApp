package com.example.dormapp.ui.sign_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dormapp.Main;
import com.example.dormapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn_activity extends AppCompatActivity {

    Button SignUp, SignIn, Forgot;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        SignUp = findViewById(R.id.SignUpButton);
        SignIn = findViewById(R.id.signIpButton);
        Forgot = findViewById(R.id.ForgotPasswordBotton);


        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);
            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignUp_activity.class);
                startActivity(intent);
            }
        });

        Forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Forgotten_activity.class);
                startActivity(intent);
            }
        });


    }

}
