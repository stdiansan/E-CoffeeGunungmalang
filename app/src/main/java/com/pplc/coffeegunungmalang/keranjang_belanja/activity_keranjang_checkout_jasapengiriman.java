package com.pplc.coffeegunungmalang.keranjang_belanja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pplc.coffeegunungmalang.R;

public class activity_keranjang_checkout_jasapengiriman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang_checkout_jasapengiriman);
        Button jasa_pengiriman_simpan = findViewById(R.id.jasa_pengiriman_selesai);
        jasa_pengiriman_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_keranjang_checkout_jasapengiriman.this,activity_keranjang_checkout.class));
            }
        });
    }
}
