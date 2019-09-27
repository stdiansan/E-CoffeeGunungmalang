package com.pplc.coffeegunungmalang.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pplc.coffeegunungmalang.MainActivity;
import com.pplc.coffeegunungmalang.R;
import com.pplc.coffeegunungmalang.register.activity_register;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin, btnDaftar;
        EditText etEmail, etPassword;

        btnLogin = findViewById(R.id.login_masuk);
        btnDaftar = findViewById(R.id.login_register);
        etEmail = findViewById(R.id.login_email);
        etPassword = findViewById(R.id.login_password);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_login.this,activity_register.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_login.this, MainActivity.class));
            }
        });


    }
}
