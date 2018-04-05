package com.connect.dsb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * Created by dsb on 13/12/17.
 */

public class EnrollCampus extends Fragment {

    public EnrollCampus() {
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Enroll Campus");



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.enroll_campus, container, false);


//        to add animation
//                getContext error removed when api level changed from 17 to 23
//        animBlink = AnimationUtils.loadAnimation(getContext(), R.anim.up_to_down);
//        animBlink.setAnimationListener(this);

        return rootView;

    }

}


