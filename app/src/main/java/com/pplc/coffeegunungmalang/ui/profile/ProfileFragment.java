package com.pplc.coffeegunungmalang.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pplc.coffeegunungmalang.R;
import com.pplc.coffeegunungmalang.login.activity_login;
import com.pplc.coffeegunungmalang.produk.activity_produk_detail;
import com.pplc.coffeegunungmalang.profile.activity_profile_bantuan;
import com.pplc.coffeegunungmalang.profile.activity_profile_kebijakan_privasi;
import com.pplc.coffeegunungmalang.profile.activity_profile_ketentuan_layanan;

public class ProfileFragment extends Fragment {

    private ProfileViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        TextView profile_kebijakan_privasi = root.findViewById(R.id.profile_TV_kebijakan_privasi);
        TextView profile_ketentuan_layanan = root.findViewById(R.id.profile_TV_ketentuan_layanan);
        TextView profile_bantuan = root.findViewById(R.id.profile_TV_help);
        TextView profile_beri_nilai = root.findViewById(R.id.profile_TV_rate_us);
        Button logout = root.findViewById(R.id.profile_BT_logout);

        profile_kebijakan_privasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_profile_kebijakan_privasi.class);
                startActivity(i);
            }
        });
        profile_ketentuan_layanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_profile_ketentuan_layanan.class);
                startActivity(i);
            }
        });

        profile_bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_profile_bantuan.class);
                startActivity(i);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getActivity(), activity_login.class);
                startActivity(i);
            }
        });

        return root;
    }
}