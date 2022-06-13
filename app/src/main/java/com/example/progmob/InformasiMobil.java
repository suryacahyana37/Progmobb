package com.example.progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InformasiMobil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_mobil);
    }

    public void hal_sewa(View view) {
        Intent intent = new Intent(InformasiMobil.this, SewaActivity.class);
        startActivity(intent);
    }
}