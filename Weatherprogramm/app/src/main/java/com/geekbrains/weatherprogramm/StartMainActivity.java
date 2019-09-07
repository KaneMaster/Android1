package com.geekbrains.weatherprogramm;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;


public class StartMainActivity implements View.OnClickListener {

    private Activity sourceActivity;

    public StartMainActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View view) {
        Parcel parcel = new Parcel();

        EditText edit_text = sourceActivity.findViewById(R.id.city_name);
        CheckBox cb_wet = sourceActivity.findViewById(R.id.wet_sel);
        CheckBox cb_speed = sourceActivity.findViewById(R.id.wind_sel);

        parcel.setSpeed(cb_speed.isChecked());
        parcel.setWet(cb_wet.isChecked());
        parcel.setText(edit_text.getText().toString());

        Intent intent = new Intent(sourceActivity, MainActivity.class);
        intent.putExtra("INFO", parcel);
        sourceActivity.startActivityForResult(intent, FirstStartActivity.REQUEST_CODE);
    }
}
