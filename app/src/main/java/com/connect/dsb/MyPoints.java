package com.connect.dsb;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyPoints  extends Fragment {
    public MyPoints() {
    }
    @Override
    public void onViewCreated( View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("My Points");
    }
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.my_points, container, false);
        TextView t1 = (TextView) rootView.findViewById(R.id.mypoints_total_points);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new PointsTotal();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView t2 = (TextView) rootView.findViewById(R.id.mypoints_points_redeemed);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new PointsRedeemed();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        TextView t3 = (TextView) rootView.findViewById(R.id.mypoints_points_with_me);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new PointsMe();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });
        return rootView;
    }
}
