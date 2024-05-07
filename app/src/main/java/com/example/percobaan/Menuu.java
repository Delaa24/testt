package com.example.percobaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menuu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Menemukan ImageButtons berdasarkan ID mereka
        ImageButton imageButtonBack = findViewById(R.id.imageButton5);
        ImageButton imageButton1 = findViewById(R.id.imageButton8);
        ImageButton imageButton2 = findViewById(R.id.imageButton12);
        ImageButton imageButton3 = findViewById(R.id.imageButton13);
        ImageButton imageButton4 = findViewById(R.id.imageButton14);

        // Menetapkan onClickListeners untuk ImageButtons
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke aktivitas sebelumnya
                onBackPressed();
            }
        });

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementasikan tindakan untuk ImageButton1
                // Start MenuActivity
                Intent intent = new Intent(Menuu.this, Menuu.class);
                startActivity(intent);
            }
        });


        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementasikan tindakan untuk ImageButton2
                // Contoh: Memulai aktivitas baru atau melakukan beberapa tindakan
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ajuan.class);
                startActivity(i);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implementasikan tindakan untuk ImageButton4
                // Contoh: Memulai aktivitas baru atau melakukan beberapa tindakan
            }
        });
    }
}
