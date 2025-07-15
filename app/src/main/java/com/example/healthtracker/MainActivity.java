package com.example.healthtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This line is crucial! It connects this Java code
        // to your XML layout file.
        setContentView(R.layout.activity_main);
    }
}