package com.blog.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;


import android.os.Bundle;
import android.widget.Button;

import com.blog.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.button1.setText("TEST");

        button1 = findViewById(R.id.button1);
        button1.setText("TEST");

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);


    }
}
