package com.connect.dsb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WalletActivity extends Fragment {

    public WalletActivity() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Wallet");
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.wallet, container, false);
    }

//    @Override
//    public void doBack() {
//        Intent yourMainActivity = new Intent(getActivity(),BottomNavigation.class);
//        startActivity(yourMainActivity);
//    }
//implements BottomNavigation.OnBackPressedListener
}

