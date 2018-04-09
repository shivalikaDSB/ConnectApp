package com.connect.dsb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class EventICDP extends  Fragment {
    CardView i1;

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
        final CardView i1 = (CardView) rootView.findViewById(R.id.icon_event1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment f = new EventDetailICDP();
                Fragment f = new Event1();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.down_to_up, R.anim.up_to_down)
                        .replace(R.id.content1, f)
                        .addToBackStack(null)
                        .commit();
            }
        });
        final CardView i2 = (CardView) rootView.findViewById(R.id.icon_event2);
        i2      .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new Event1();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.down_to_up, R.anim.up_to_down)
                        .replace(R.id.content1, f)
                        .addToBackStack(null)
                        .commit();
            }
        });
        final CardView i3 = (CardView) rootView.findViewById(R.id.icon_event6);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new Event1();
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                getFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.down_to_up, R.anim.up_to_down)
                        .replace(R.id.content1, f)
                        .addToBackStack(null)
                        .commit();
            }
        });
                // here settings changed
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//                ft.setCustomAnimations(R.anim.down_to_up, R.anim.slide_in_left);
//                fm.beginTransaction().replace(R.id.content1, f).addToBackStack(null).commit();


//        i1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                PopupMenu popup = new PopupMenu(getContext(), i1);
//                popup.getMenuInflater().inflate(R.menu.main, popup.getMenu());
//                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    public boolean onMenuItemClick(MenuItem item) {
//                        if (item.getTitle().equals("Event1")) {
//                            Intent i = new Intent(getContext(),ForgetPassword.class);
////                            i.setData(Uri.parse("tel:1234567890"));
//                            startActivity(i);
//                            return (true);
//                        }
//                        if (item.getTitle().equals("Message")) {
//                            Intent i1 = new Intent(Intent.ACTION_VIEW);
//                            i1.setData(Uri.parse("sms:"));
//
//                            startActivity(i1);
//                            return (true);
//                        } else {
//                            Toast.makeText(getContext(), "error", Toast.LENGTH_SHORT).show();
//                            return (true);
//                        }
//                    }
//                    //}
//
//                  /*  public boolean onMenuItemClick(MenuItem item) {
//
//                        Intent i1 = new Intent(Intent.ACTION_VIEW);
//                        i1.setData(Uri.parse("sms:"));
//
//                        startActivity(i1);
//                        return(true);
//
//                    }*/
//
//                });
//
//                popup.show();
//            }
//        });

//        TextView a1 = (TextView) rootView.findViewById(R.id.up_event1);
//        a1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment f = new EventDetailICDP();
//                // here settings changed
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
//            }
//        });
//        TextView a2 = (TextView) rootView.findViewById(R.id.up_event2);
//        a2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment f = new EventDetailICDP();
//                // here settings changed
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
//            }
//        });
//        TextView a3 = (TextView) rootView.findViewById(R.id.up_event3);
//        a3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment f = new EventDetailICDP();
//                // here settings changed
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
//            }
//        });
//
//        Button a4 = (Button) rootView.findViewById(R.id.upcoming_button1);
//        a4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment f = new MemberSignup();
//                // here settings changed
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
//            }
//        });
//        Button a5 = (Button) rootView.findViewById(R.id.upcoming_button2);
//        a5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment f = new MemberSignup();
//                // here settings changed
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
//            }
//        });
//        Button a6 = (Button) rootView.findViewById(R.id.upcoming_button3);
//        a6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment f = new MemberSignup();
//                // here settings changed
//                android.support.v4.app.FragmentManager fm = getFragmentManager();
//                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
//            }
//        });

        return rootView;
    }

}
