package com.connect.dsb;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class EventICDP extends  Fragment {

    Dialog mdialog;
    List<EventBean> eventlist;


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

        eventlist=new ArrayList<>();
        eventlist.add(new EventBean("Festival","even1","xyz",R.drawable.event2));
        eventlist.add(new EventBean("holi","event2","abc",R.drawable.event4));
        eventlist.add(new EventBean("Fest"," Event3","this is event 3",R.drawable.event2));
        eventlist.add(new EventBean("Festil"," Event4"," this is event 4",R.drawable.event3));
        eventlist.add(new EventBean("Dewali","Event5","this is event 5",R.drawable.event4));
        eventlist.add(new EventBean("Festival","Event6","this is event 6",R.drawable.event2));
        eventlist.add(new EventBean("holi","Event7","this is event 7",R.drawable.event1));
        eventlist.add(new EventBean("Fest","Event8","this is event 8",R.drawable.event2));
        eventlist.add(new EventBean("this is festival seasion of the year","Category Event9","this is event 9",R.drawable.event2));
        eventlist.add(new EventBean("Dewali","Event10","this is Event10",R.drawable.event3));
        RecyclerView recyclerView=(RecyclerView) rootView.findViewById(R.id.recyclerview);
        EventAdapter adapter=new EventAdapter(getActivity(),eventlist);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setAdapter(adapter);


        return rootView;
    }

}