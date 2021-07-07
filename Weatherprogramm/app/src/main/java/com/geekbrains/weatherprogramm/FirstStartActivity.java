package com.geekbrains.weatherprogramm;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstStartActivity extends AppCompatActivity {

    public static  final Integer REQUEST_CODE = 100;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_start);
        Button btn = findViewById(R.id.but_accept);
        btn.setOnClickListener(new StartMainActivity(this));
    }
}
