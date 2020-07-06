package com.example.dormapp.ui.sign_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dormapp.R;

public class SignUp_activity extends AppCompatActivity {

    Button next, cancel;
    Spinner rooms;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        next = findViewById(R.id.Save_button);
        cancel = findViewById(R.id.Back);
        rooms = findViewById(R.id.room_spinner);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SigUp_picture.class);
                startActivity(intent);
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SignIn_activity.class);
                startActivity(intent);
            }
        });

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.spinner_layout,getResources().getStringArray(R.array.spinner));
        myAdapter.setDropDownViewResource(R.layout.spinner_layout);
        rooms.setAdapter(myAdapter);

    }
}
