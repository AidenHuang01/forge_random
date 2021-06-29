package com.example.forgerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class WhatToEat extends AppCompatActivity {
    ArrayList<String> pool;
    StringBuilder stringBuilder;
    Random random;
    EditText editText;
    TextView textView2;
    TextView textView5;
    Button but5;
    Button but6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_to_eat);
        pool = new ArrayList<String>();
        editText = findViewById(R.id.editTextOption);
        stringBuilder = new StringBuilder();
        random = new Random();
        textView2 = findViewById(R.id.textView2);
        textView5 = findViewById(R.id.textView5);
        but5 = findViewById(R.id.button5);
        but6 = findViewById(R.id.button6);
        but5.setVisibility(View.INVISIBLE);
        but6.setVisibility(View.INVISIBLE);
    }

    public void addOption(View view) {
        String option = editText.getText().toString();
        if(!option.equals("")) {
            pool.add(option);
            stringBuilder.append(option + "\n");
            textView2.setText(stringBuilder.toString());
            editText.setText("");
            but5.setVisibility(View.VISIBLE);
            but6.setVisibility(View.VISIBLE);
        }
    }

    public void rowOption(View view) {
        int length = pool.size();
        int index = random.nextInt(length);
        textView5.setText(pool.get(index));
    }

    public void clearOption(View view) {
        pool = new ArrayList<String>();
        stringBuilder = new StringBuilder();
        textView2.setText("");
        textView5.setText("");
        but5.setVisibility(View.INVISIBLE);
        but6.setVisibility(View.INVISIBLE);
    }
}