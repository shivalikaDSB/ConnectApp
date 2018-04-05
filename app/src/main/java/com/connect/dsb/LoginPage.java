package com.connect.dsb;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.common.api.GoogleApiClient;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginPage extends AppCompatActivity {

    private GoogleApiClient mGoogleApiClient;
    private ProgressDialog mProgressDialog;

    private Button btnSignOut, btnRevokeAccess;
    private LinearLayout llProfileLayout;
    private ImageView imgProfilePic;
    private TextView txtName, txtEmail;




//    private Boolean ANIMATION_ENDED = false;
//    private Boolean START_ANIMATION = true;

    TextView txtStatus;
    ImageView login_button1;
    CallbackManager callbackmanager;
    private ImageView btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());

        setContentView(R.layout.login);
        initializeControls();
        btnSignIn = (ImageView) findViewById(R.id.btn_sign_in);
        btnSignOut = (Button) findViewById(R.id.btn_sign_out);
        btnRevokeAccess = (Button) findViewById(R.id.btn_revoke_access);
        llProfileLayout = (LinearLayout) findViewById(R.id.llProfile);
        imgProfilePic = (ImageView) findViewById(R.id.imgProfilePic);
        txtName = (TextView) findViewById(R.id.txtName);
        txtEmail = (TextView) findViewById(R.id.txtEmail);

//        txtStatus=(TextView) findViewById(R.id.txtStatus);

//        btnSignIn.setOnClickListener(this);
//        btnSignOut.setOnClickListener(this);
//        btnRevokeAccess.setOnClickListener(this);

//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestEmail()
//                .build();
//
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .enableAutoManage(this, this)
//                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
//                .build();

        // Customizing G+ button
//        btnSignIn.setSize(SignInButton.SIZE_STANDARD);
//        btnSignIn.setScopes(gso.getScopeArray());



    }

        public void login (View view){
            Intent i = new Intent(this, BottomNavigation.class);
            startActivity(i);
            overridePendingTransition(R.anim.enter, R.anim.exit);
        }

//    public void login(View v) {
//        Intent i = new Intent(this, BottomNavigation.class);
//        startActivity(i);
//    }

        public void forget (View v){
            Intent i = new Intent(this, ForgetPassword.class);
            startActivity(i);
        }

        public void signup (View v){
            Intent i = new Intent(this, SignUp.class);
            startActivity(i);
        }

        private void initializeControls () {
            callbackmanager = CallbackManager.Factory.create();
//        txtStatus = (TextView) findViewById(R.id.txtStatus);
            login_button1 = (ImageView) findViewById(R.id.login_button1);
        }


        public void loginWithFB (View v){
            LoginManager.getInstance().registerCallback(callbackmanager, new FacebookCallback<LoginResult>() {
                @Override
                public void onSuccess(LoginResult loginResult) {
//                txtStatus.setText("Login success\n" + loginResult.getAccessToken());

                }

                @Override
                public void onCancel() {
//                txtStatus.setText("Login Cancelled.");

                }

                @Override
                public void onError(FacebookException error) {
//                txtStatus.setText("Login Error: " + error.getMessage());

                }
            });

        }
    }


