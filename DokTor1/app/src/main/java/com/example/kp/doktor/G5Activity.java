package com.example.kp.doktor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class G5Activity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    RadioGroup rdogrp;
    RadioButton rdobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g5);

        sharedPreferences = getSharedPreferences("DokTor",Context.MODE_PRIVATE);
        sharedPreferencesEditor = sharedPreferences.edit();
        sharedPreferencesEditor.putString("g5_value", "0.0");

        rdogrp = (RadioGroup) findViewById(R.id.radioGroup);
        rdogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rdobtn = (RadioButton) findViewById(checkedId);
                sharedPreferencesEditor.putString("g5_value", rdobtn.getTag().toString());
                sharedPreferencesEditor.putInt("g5_selected", checkedId);
                sharedPreferencesEditor.apply();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
