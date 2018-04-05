package com.connect.dsb;
import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends Fragment {

    public Profile() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState ) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("My Profile");
    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.profile, container, false);
        Button a1 = (Button) rootView.findViewById(R.id.p_account);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new SettingAccount();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });

        Button a2 = (Button) rootView.findViewById(R.id.p_notification);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f = new SettingNotifications();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });


        Button a3 = (Button) rootView.findViewById(R.id.p_password);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Fragment f = new SettingPassword();
                // here settings changed
                android.support.v4.app.FragmentManager fm = getFragmentManager();
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
                fm.beginTransaction().replace(R.id.content, f).addToBackStack(null).commit();
            }
        });

        return rootView;
    }
}
//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        getActivity().setTitle("My Profile");
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View rootView = inflater.inflate(R.layout.profile, container, false);
//
//
//        Button a1 = (Button) rootView.findViewById(R.id.p_account);
//        a1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                android.app.Fragment f = new SettingAccount();
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).commit();
//            }
//
////            Intent i= new Intent(getActivity(),ForgotPassword.class);
////                i.putExtra("some","some data");
////            startActivity(i);
//
//        });
//
//
//        Button a2 = (Button) rootView.findViewById(R.id.p_notification);
//        a2.setOnClickListener(new View.OnClickListener() {
////            private FragmentManager supportFragmentManager;
////
////            public FragmentManager getSupportFragmentManager() {
////                return supportFragmentManager;
////            }
//
//            @Override
//            public void onClick(View v) {
//                android.app.Fragment f = new SettingNotifications();
//                // here settings changed
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).commit();
//            }
//        });
//
//
//        Button a3 = (Button) rootView.findViewById(R.id.p_password);
//        a3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                android.app.Fragment f = new SettingPassword();
//                // here settings changed
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).commit();
//            }
//        });
//
//
//        Button a4 = (Button) rootView.findViewById(R.id.p_chatbox);
//        a4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                android.app.Fragment f = new SettingPassword();
//                // here settings changed
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                fm.beginTransaction().replace(R.id.content, f).commit();
//            }
//        });
//
//        return rootView;
//    }
//}
