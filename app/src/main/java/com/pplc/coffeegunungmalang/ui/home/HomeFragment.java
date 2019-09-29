package com.pplc.coffeegunungmalang.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pplc.coffeegunungmalang.R;
import com.pplc.coffeegunungmalang.keranjang_belanja.activity_keranjang_checkout;
import com.pplc.coffeegunungmalang.produk.activity_produk_detail;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        CardView produk1 = root.findViewById(R.id.home_CV_produk1);
        CardView produk3 = root.findViewById(R.id.home_CV_produk2);
        CardView produk4 = root.findViewById(R.id.home_CV_produk3);
        CardView produk2 = root.findViewById(R.id.home_CV_produk4);

        produk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_produk_detail.class);
                startActivity(i);
            }
        });
        produk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_produk_detail.class);
                startActivity(i);
            }
        });
        produk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_produk_detail.class);
                startActivity(i);
            }
        });
        produk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_produk_detail.class);
                startActivity(i);
            }
        });


        Button tambah_ke_keranjang1 = root.findViewById(R.id.home_BT_produk1);
        tambah_ke_keranjang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_keranjang_checkout.class);
                startActivity(i);
            }
        });
        Button tambah_ke_keranjang2 = root.findViewById(R.id.home_BT_produk1);
        tambah_ke_keranjang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_keranjang_checkout.class);
                startActivity(i);
            }
        });
        Button tambah_ke_keranjang3 = root.findViewById(R.id.home_BT_produk1);
        tambah_ke_keranjang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_keranjang_checkout.class);
                startActivity(i);
            }
        });
        Button tambah_ke_keranjang4 = root.findViewById(R.id.home_BT_produk1);
        tambah_ke_keranjang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_keranjang_checkout.class);
                startActivity(i);
            }
        });




        return root;
    }
}