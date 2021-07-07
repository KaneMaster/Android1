package com.geekbrains.weatherprogramm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cityName = findViewById(R.id.city_name);
        TextView label_wet = findViewById(R.id.label_wet);
        TextView label_speed = findViewById(R.id.label_speed);
        TextView val_wet = findViewById(R.id.val_wet);
        TextView val_speed = findViewById(R.id.val_speed);


        Parcel parcel = (Parcel)getIntent().getExtras().getSerializable("INFO");
        cityName.setText(parcel.getText());
        if (parcel.getSpeed()) {
            label_speed.setVisibility(TextView.VISIBLE);
            val_speed.setVisibility(TextView.VISIBLE);
        } else {
            label_speed.setVisibility(TextView.INVISIBLE);
            val_speed.setVisibility(TextView.INVISIBLE);
        }


        if (parcel.getWet()) {
            label_wet.setVisibility(TextView.VISIBLE);
            val_wet.setVisibility(TextView.VISIBLE);
        } else {
            label_wet.setVisibility(TextView.INVISIBLE);
            val_wet.setVisibility(TextView.INVISIBLE);
        }
    }
}
