package com.example.progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {

    ImageView infomobil;
    ImageView sewamobil;
    ImageView akun;
    ImageView about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        infomobil = findViewById(R.id.infomobil);
        infomobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, InformasiMobil.class);
                startActivity(intent);
            }
        });
        akun = findViewById(R.id.akun);
        akun.setOnClickListener(view ->  {
            Intent intents = new Intent(DashboardActivity.this, Akun.class);
            startActivity(intents);
        });

        sewamobil = findViewById(R.id.sewamobil);
        sewamobil.setOnClickListener(view ->  {
            Intent intents = new Intent(DashboardActivity.this, SewaActivity.class);
            startActivity(intents);
        });
        about = findViewById(R.id.about);
        about.setOnClickListener(view ->  {
            Intent intents = new Intent(DashboardActivity.this, AboutActivity.class);
            startActivity(intents);
        });

    }
}