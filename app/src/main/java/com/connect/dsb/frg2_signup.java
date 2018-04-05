package com.connect.dsb;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.connect.dsb.R.*;

/**
 * Created by monagarg on 24/03/18.
 */

public class frg2_signup extends Fragment {
    private Vibrator vib;
    Animation animShake;
    EditText first_name, Last_name, email, Mobile;
    Button Next;
    TextInputLayout d_name, d_lname, d_email, d_phone;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(layout.frag_signup2_layout, container, false);
        email = (EditText) view.findViewById(id.e2);
        first_name = (EditText) view.findViewById(id.s_firstname);
        Last_name = (EditText) view.findViewById(id.s_lastname);
        Mobile = (EditText) view.findViewById(id.phone);
        d_name = (TextInputLayout) view.findViewById(id.d_name);
        d_lname = (TextInputLayout) view.findViewById(id.d_lname);
        d_email = (TextInputLayout) view.findViewById(id.d_email);
        d_phone = (TextInputLayout) view.findViewById(id.d_phone);

        Last_name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Preference_Helper helper=new Preference_Helper(getActivity());
                helper.Last_name(Last_name.getText().toString());
                //Toast.makeText(getActivity(),"Lastname saved",Toast.LENGTH_LONG).show();

                isValidUser_Lname();
            }
        });

        first_name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Preference_Helper helper=new Preference_Helper(getActivity());
                helper.first_name(first_name.getText().toString());
               // Toast.makeText(getActivity(),"first_name saved",Toast.LENGTH_LONG).show();


                isValidUser_name();
            }
        });

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                Preference_Helper helper=new Preference_Helper(getActivity());
                helper.registerUser(email.getText().toString());
             //   Toast.makeText(getActivity(),"email saved",Toast.LENGTH_LONG).show();


                String validEmail="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//                        if(email.getText().toString().isEmpty())
//                        {
//                            email.setError("email is Mandatory");
//                        }

                final String email1 = email.getText().toString();
                if (!isValidEmail(email1)) {
                    d_email.setError("Please Enter valid email_id");
                }
                else {
                    d_email.setErrorEnabled(false);
                }


            }
        });
        Mobile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                Preference_Helper helper=new Preference_Helper(getActivity());
                helper.Mobile_number(Mobile.getText().toString());
               // Toast.makeText(getActivity(),"Mobile nummber is saved",Toast.LENGTH_LONG).show();


                boolean isvalid = true;
                if (Mobile.length() !=13) {

                  d_phone.setError("please Enter 10 digit long number");
                  isvalid=false;
                }
                else  {
                   d_phone.setErrorEnabled(false);

                }
            }
        });
        return view;
    }


    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private void isValidUser_name() {
        boolean isvalid = true;
        if (first_name.getText().toString().isEmpty()) {
            d_name.setError("first name is mandatory");
            isvalid = false;
        } else {
            d_name.setErrorEnabled(false);
        }

    }

    private void isValidUser_Lname() {
        {
            boolean isvalid = true;
            if (Last_name.getText().toString().isEmpty()) {
                d_lname.setError("Last name is mandatory");
                isvalid = false;
            } else {
                d_lname.setErrorEnabled(false);
            }

        }
    }

    private boolean isValidPhone(String email) {
        String NAME_PATTERN = "^[0-9]{10}$";

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
