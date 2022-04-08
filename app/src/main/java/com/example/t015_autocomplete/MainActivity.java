package com.example.t015_autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView ;
    String city[] = {"Jalgaon","Malkapur","Bhusawal","Mumbai","Kalyan"};
    ArrayAdapter arrayAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.atview);
        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,city);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);
    }
}