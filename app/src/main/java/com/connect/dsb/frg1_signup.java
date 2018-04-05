package com.connect.dsb;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.support.design.widget.TextInputLayout;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by monagarg on 24/03/18.
 */

public class frg1_signup extends Fragment {
    private Vibrator vib;
    private TextInputLayout d_name,d_password,d_confirmPassword;
    EditText username,password,confirm_password;
    Button signup;
    String email,f_name,L_name,mobile;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View view= inflater.inflate(R.layout.frag_signup1_layout,container,false);
        signup=(Button)view.findViewById(R.id.b1);
        TextView txt=(TextView)view.findViewById(R.id.t3);
        d_name=(TextInputLayout)view.findViewById(R.id.di_username);
        d_password=(TextInputLayout)view.findViewById(R.id.d_password);
        d_confirmPassword=(TextInputLayout)view.findViewById(R.id.d_confirmpassword);
        username =(EditText)view.findViewById(R.id.r_username);
        password=(EditText)view.findViewById(R.id.password);
        confirm_password=(EditText)view.findViewById(R.id.confirm_password);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Preference_Helper helper=new Preference_Helper(getActivity());
                email= helper.email();
                f_name=helper.firstname();
                L_name=helper.lastname();
                mobile=helper.mobileno();

//                 Log.d("hello",email);
//                Toast.makeText(getActivity()," " +f_name + " " +L_name+ " " +email+" "+ mobile,Toast.LENGTH_LONG).show();

                Intent intent=new Intent(getActivity(),BottomNavigation.class);
//                Intent intent = new Intent(this, Login.class);
                startActivity(intent);



                username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        boolean isvalid=true;
                        if (username.getText().toString().isEmpty()) {
                            d_name.setError("full name is mandatory");
                            isvalid = false;
                        }
                        else {
                            d_name.setErrorEnabled(false);
                        }


                    }

                });

                password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {

                        boolean isvalid=true;

//                  if (password!= null && password.length()> 8)
                        if(password!=null && password.length()<8)         {
                            d_password.setError("enter atleast 8 character long");
                            isvalid = false;
                        }
                        else {
                            d_password.setErrorEnabled(false);
                        }

                    }

                });
                confirm_password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        boolean isvalid = false;
                        if(confirm_password.getText().toString().equals(password.getText().toString()))
                        {

                            d_confirmPassword.setErrorEnabled(false);
                            isvalid = true;

                        }

                        else {
                            d_confirmPassword.setError("password doesn't match");
                        }
                    }
                });



            }
            Methods methods=new Methods();
            String[] data;
            String url = "http://test.dsbedutech.in";


            public Methods getMethods() {
                return methods;
            }

            public String[] getData() {
                return data;
            }

            public String getUrl() {
                return url;
            }



            //             methods.url = "http://test.dsbedutech.in";
            String result = methods.GET();
        });


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(getActivity(),Login.class);
                startActivity(intent);
            }
        });
        return view;

    }
}