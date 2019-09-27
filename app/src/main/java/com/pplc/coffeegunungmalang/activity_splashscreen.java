package com.pplc.coffeegunungmalang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;

import com.pplc.coffeegunungmalang.login.activity_login;

public class activity_splashscreen extends AppCompatActivity {
    private int waktu_loading=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity
                startActivity(new Intent(activity_splashscreen.this, activity_login.class));
                finish();

            }
        },waktu_loading);

    }
}
