package com.connect.dsb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.uncopt.android.widget.text.justify.JustifiedTextView;


public class EventDetailYdp extends Fragment {

    public EventDetailYdp() {
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Event Detail YDP");
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        View rootView = inflater.inflate(R.layout.event_detail_ydp, container, false);

        JustifiedTextView myMsg = (JustifiedTextView)rootView.findViewById(R.id.ydp_event_detail_1);
        myMsg.setText("Full Conference Program. This year's National Conference between 18-20 October 2016 is at the Four Points Hotel, Sydney. The theme for this year is: Cyber Security Do we have IT right?. Below you will find a list of networking opportunities as well as the Conference agenda for each day.");


        Button a1 = (Button) rootView.findViewById(R.id.ydp_button);
        a1.setOnClickListener(new View.OnClickListener() {
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