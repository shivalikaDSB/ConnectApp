package com.connect.dsb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dsb on 7/12/17.
 */

//public class MemberSignup extends Fragment implements Animation.AnimationListener{
public class MemberSignup extends Fragment {
//    ImageView logo_signup;
//    ImageView imageView;
//
//
//    Animation animBlink;

    public MemberSignup() {
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Members Sign Up");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.member_signup, container, false);

//        animBlink = AnimationUtils.loadAnimation(getContext(), R.anim.up_to_down);
//        animBlink.setAnimationListener(this);
//
//        logo_signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                imageView.setVisibility(View.VISIBLE);
//                imageView.startAnimation(animBlink);
//            }
//        });

        return rootView;


    }

//    @Override
//    public void onAnimationStart(Animation animation) {
//
//    }
//
//    @Override
//    public void onAnimationEnd(Animation animation) {
//
//    }
//
//    @Override
//    public void onAnimationRepeat(Animation animation) {
//
//    }
}


