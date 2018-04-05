package com.connect.dsb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dsb on 13/12/17.
 */

public class RegistrationForm extends Fragment {

    public RegistrationForm() {
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Registration Form");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.registration_form, container, false);


//        to add animation
//                getContext error removed when api level changed from 17 to 23
//        animBlink = AnimationUtils.loadAnimation(getContext(), R.anim.up_to_down);
//        animBlink.setAnimationListener(this);

        return rootView;

    }

}


