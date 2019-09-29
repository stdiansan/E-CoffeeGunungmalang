package com.pplc.coffeegunungmalang.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pplc.coffeegunungmalang.MainActivity;
import com.pplc.coffeegunungmalang.R;
import com.pplc.coffeegunungmalang.login.activity_login;

public class activity_register extends AppCompatActivity {

    Button register, batal_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = findViewById(R.id.daftar_button_simpan);
        batal_register = findViewById(R.id.daftar_button_batal);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_register.this, activity_login.class));

            }
        });

        batal_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_register.this, activity_login.class));

            }
        });
    }
}
