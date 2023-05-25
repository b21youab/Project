package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("");

            TextView SecondScreenTextView = findViewById(R.id.SecondScreenTextView);
           // SecondScreenTextView.setText("");



        }
    }

}
