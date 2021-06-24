
package com.example.forgerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToRandomNumberGenerator(View view) {
        Intent intent = new Intent(this, RandomNumberGenerator.class);
        startActivity(intent);
    }

    public void switchToWhatToEat(View view) {
        Intent intent = new Intent(this,WhatToEat.class);
        startActivity(intent);
    }
}