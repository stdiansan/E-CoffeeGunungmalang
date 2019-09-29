package com.pplc.coffeegunungmalang.keranjang_belanja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import com.pplc.coffeegunungmalang.R;

public class activity_keranjang_checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang_checkout);
        TextView tambah_alamat = findViewById(R.id.checkout_clik_to_add_alamat);
        tambah_alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_keranjang_checkout.this, activity_keranjang_checkout_tambah_alamat.class));
            }
        });
        TableLayout checkout_TL_jasa_pengiriman = findViewById(R.id.checkout_TL_jasa_pengiriman);
        checkout_TL_jasa_pengiriman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_keranjang_checkout.this,activity_keranjang_checkout_jasapengiriman.class));
            }
        });
        TableLayout checkout_TL_nomor_telepon = findViewById(R.id.checkout_TL_nomor_telepon);
        checkout_TL_nomor_telepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_keranjang_checkout.this,activity_keranjang_checkout_nomortelepon.class));
            }
        });TableLayout checkout_TL_metode_pembayaran = findViewById(R.id.checkout_TL_metode_pembayaran);
        checkout_TL_metode_pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_keranjang_checkout.this,activity_keranjang_checkout_metodepembayaran.class));
            }
        });
    }
}
