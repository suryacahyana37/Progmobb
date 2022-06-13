package com.example.progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity<view> extends AppCompatActivity {
    TextView btnalamat;
    ImageButton home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnalamat = findViewById(R.id.btnalamat);

        btnalamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/GQ6jwmPtxLrmwJDYA"));
                startActivity(i);
            }
        });

        home = findViewById(R.id.home);
        home.setOnClickListener(view ->  {
            Intent intents = new Intent(AboutActivity.this, DashboardActivity.class);
            Toast.makeText(AboutActivity.this, "Berhasil Kembali Ke Menu Utama", Toast.LENGTH_SHORT).show();
            finish();
        });
    }


    }

