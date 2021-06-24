package com.example.forgerandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class RandomNumberGenerator extends AppCompatActivity {
    private int lowerBound = 0;
    private int upperBound = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number_generator);
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int newBound) {
        lowerBound = newBound;
    }

    public void setUpperBound(int newBound) {
        upperBound = newBound;
    }

    public void generateRandomNumber(View view){
        TextView textView = findViewById(R.id.textView_random_number_generator_result);
        EditText editTextLower = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText editTextUpper = (EditText) findViewById(R.id.editTextNumberDecimal2);
        int lower = Integer.parseInt(editTextLower.getText().toString());
        int upper = Integer.parseInt(editTextUpper.getText().toString());
        if(lower<upper) {
            Random rand = new Random();
            int num = rand.nextInt(upper - lower) + lower;
            String str = "" + num;
            textView.setText(str);
        }
        else {
            String errorMessage = "ERROR!";
            textView.setText(errorMessage);
        }
    }

}