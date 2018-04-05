package com.connect.dsb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class EventICDP extends  Fragment {

    public EventICDP() {
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Events of ICDP");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.event_icdp, container, false);


        TextView a1 = (TextView) rootView.findViewById(R.id.up_event1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new EventDetailICDP();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView a2 = (TextView) rootView.findViewById(R.id.up_event2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new EventDetailICDP();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView a3 = (TextView) rootView.findViewById(R.id.up_event3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new EventDetailICDP();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });

        Button a4 = (Button) rootView.findViewById(R.id.upcoming_button1);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new MemberSignup();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        Button a5 = (Button) rootView.findViewById(R.id.upcoming_button2);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new MemberSignup();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        Button a6 = (Button) rootView.findViewById(R.id.upcoming_button3);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new MemberSignup();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });

        return rootView;
    }

}
