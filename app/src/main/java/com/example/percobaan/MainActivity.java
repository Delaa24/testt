package com.example.percobaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private static final long DELAY_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menjalankan tindakan penundaan menggunakan Handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Setelah waktu penundaan berakhir, memulai Activity berikutnya
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);

                // Menutup Activity saat ini agar tidak bisa kembali ke Activity sebelumnya
                finish();
            }
        }, DELAY_TIME); // Menetapkan waktu penundaan
    }
}
