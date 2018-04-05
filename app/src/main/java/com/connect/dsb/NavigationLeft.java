package com.connect.dsb;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NavigationLeft extends Fragment {
    public NavigationLeft() {
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Connect App");
    }
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        View rootView = inflater.inflate(R.layout.navigation_left, container, false);
        TextView a1 = (TextView) rootView.findViewById(R.id.Registration_form);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new RegistrationForm();

                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView a2 = (TextView) rootView.findViewById(R.id.wallet);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new NavigationWallet();

                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView a3 = (TextView) rootView.findViewById(R.id.offers);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new Offers();

                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView a4 = (TextView) rootView.findViewById(R.id.profile);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new Profile();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView a5 = (TextView) rootView.findViewById(R.id.help_desk);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new Help();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView a6 = (TextView) rootView.findViewById(R.id.campus_ambass);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new EnrollCampus();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });

        return rootView;

    }
}
