package com.example.kp.doktor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuUtama extends AppCompatActivity {

    private ImageButton diagnosa,perawatan,bantuan,tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        diagnosa = (ImageButton) findViewById(R.id.imgbtn_kerusakan );
        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuKerusakan.class);
                startActivity(i);
            }
        });

        perawatan = (ImageButton) findViewById(R.id.imgbtn_service);
        perawatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuPerawatan.class);
                startActivity(i);
            }
        });

        tentang = (ImageButton) findViewById(R.id.imgbtn_tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TentangAplikasi.class);
                startActivity(i);
            }
        });

        bantuan = (ImageButton) findViewById(R.id.imgbtn_informasi);
        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuBantuan.class);
                startActivity(i);
            }
        });
    }
}
