package com.pplc.coffeegunungmalang.ui.cart;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pplc.coffeegunungmalang.R;
import com.pplc.coffeegunungmalang.keranjang_belanja.activity_keranjang_checkout;

public class CartFragment extends Fragment {

    private CartViewModel mViewModel;

    public static CartFragment newInstance() {
        return new CartFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        Button keranjang_cekout = view.findViewById(R.id.keranjang_button_periksa_pesanan);
        keranjang_cekout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_keranjang_checkout.class);
                startActivity(i);
            }
        });

        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CartViewModel.class);
        // TODO: Use the ViewModel
    }

}
