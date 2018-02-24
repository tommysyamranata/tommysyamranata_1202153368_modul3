package com.example.tommy.tommysyamranata_1202153368_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    private int SplashInterval = 3000; // kecepatan perpindahan 3 detik
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
//      Menghinlangkan head atau navigasi pada SplashScreen Activity
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //berpindah dari splashscreen ke menulist utama
                startActivity(new Intent(SplashActivity.this, MainLogin.class));
                //menampilkan toast
                Toast.makeText(SplashActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
                finish();
            }
        },SplashInterval);
    }
}
