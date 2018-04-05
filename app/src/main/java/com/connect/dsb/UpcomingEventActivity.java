package com.connect.dsb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class UpcomingEventActivity extends Fragment {


    public UpcomingEventActivity() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Upcoming Events");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.upcoming_event, container, false);


        TextView a1 = (TextView) rootView.findViewById(R.id.d_up_icdp);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new EventICDP();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });

        TextView a2 = (TextView) rootView.findViewById(R.id.d_up_ydp);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new EventYdp();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        return rootView;
    }
}


