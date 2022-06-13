package com.example.progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Akun extends AppCompatActivity {
    ImageView home;
    LinearLayout icAccount;
    TextView btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        home = findViewById(R.id.home);
        home.setOnClickListener(view ->  {
            Intent intents = new Intent(Akun.this, DashboardActivity.class);
            Toast.makeText(Akun.this, "Berhasil Kembali Ke Menu Utama", Toast.LENGTH_SHORT).show();
            finish();
        });

        icAccount = findViewById(R.id.icAccount);
        icAccount.setOnClickListener(view ->  {
            Intent intents = new Intent(Akun.this, Akun.class);
            startActivity(intents);
            finish();
        });

        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(view -> {
            Intent intents = new Intent(Akun.this, LoginActivity.class);
            startActivity(intents);
            Toast.makeText(Akun.this, "Berhasil Logout, Silahkan Datang Kembali !", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}