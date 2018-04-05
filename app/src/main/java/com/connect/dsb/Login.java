package com.connect.dsb;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.connect.dsb.SignUpp;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import com.facebook.FacebookException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

import org.w3c.dom.Text;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login extends AppCompatActivity implements Animation.AnimationListener {

    private static final String TAG = Login.class.getSimpleName();
    private static final int RC_SIGN_IN = 007;

    private GoogleApiClient mGoogleApiClient;
    private ProgressDialog mProgressDialog;

    private Button btnSignOut, btnRevokeAccess;
    private LinearLayout llProfileLayout;
    private ImageView imgProfilePic;
    private TextView txtName, txtEmail;

    private ImageView mFbLogoImageView;
    private ImageView mFbCoverImageView;
    private EditText mEmailEditText;
    private EditText mPswEditText;
    //    private TextView mLangTextView;
    private TextView mForgotPswTextView;
    private Button mLoginButton;
    //    private Button mNewAccountButton;
    private TextView mNewAccountButton;
    private ImageView mFbLogoStaticImageView;
    private View mView;
    private View mView1;
    private View mView2;
    private TextView mtextOr;
    private ImageView mlogin_button1;
    private ImageView mbtn_sign_in;
   private ImageView micon_linked;
   private TextView msignup;
    private TextView mtextConnect;
    private ImageView micon_twitt;




    private Boolean ANIMATION_ENDED = false;
    private Boolean START_ANIMATION = true;

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


        if (savedInstanceState != null) {
            START_ANIMATION = savedInstanceState.getBoolean("START_ANIMATION");
        }

        mFbLogoImageView = (ImageView) findViewById(R.id.fbLogoImageView);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            mFbCoverImageView = (ImageView) findViewById(R.id.fbCoverImageView);
        mEmailEditText = (EditText) findViewById(R.id.emailEditText);
        mPswEditText = (EditText) findViewById(R.id.pswEditText);
//        mLangTextView = (TextView) findViewById(R.id.langTextView);
        mForgotPswTextView = (TextView) findViewById(R.id.forgotPswTextView);
        mLoginButton = (Button) findViewById(R.id.loginButton);
        mNewAccountButton = (TextView) findViewById(R.id.newAccountButton);

        mNewAccountButton = (TextView) findViewById(R.id.newAccountButton);
        mFbLogoStaticImageView = (ImageView) findViewById(R.id.fbLogoStaticImageView);
        mView=(View)findViewById(R.id.view1);
        mView1=(View)findViewById(R.id.view2);
        mView2=(View)findViewById(R.id.view3);
        mtextOr=(TextView)findViewById(R.id.textOr);
        mlogin_button1=(ImageView)findViewById(R.id.login_button1);
        mbtn_sign_in=(ImageView)findViewById(R.id.btn_sign_in);
        micon_linked=(ImageView)findViewById(R.id.icon_linked);
        msignup=(TextView) findViewById(R.id.signup);
        mtextConnect=(TextView) findViewById(R.id.textConnect);
        micon_twitt=(ImageView) findViewById(R.id.icon_twitt);




        if (START_ANIMATION) {
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                mFbCoverImageView.setVisibility(View.GONE);
            mEmailEditText.setVisibility(View.GONE);
            mPswEditText.setVisibility(View.GONE);
//            mLangTextView.setVisibility(View.GONE);
            mForgotPswTextView.setVisibility(View.GONE);
            mLoginButton.setVisibility(View.GONE);
            mNewAccountButton.setVisibility(View.GONE);
            mFbLogoStaticImageView.setVisibility(View.GONE);
            mView.setVisibility(View.GONE);
            mView1.setVisibility(View.GONE);
            mView2.setVisibility(View.GONE);
            mtextOr.setVisibility(View.GONE);
            mLoginButton.setVisibility(View.GONE);
            mlogin_button1.setVisibility(View.GONE);
            mbtn_sign_in.setVisibility(View.GONE);
            micon_linked.setVisibility(View.GONE);
            msignup.setVisibility(View.GONE);
            mtextConnect.setVisibility(View.GONE);
            micon_twitt.setVisibility(View.GONE);




//
            Animation moveFBLogoAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_fb_logo);
            moveFBLogoAnimation.setFillAfter(true);
            moveFBLogoAnimation.setAnimationListener(this);
            mFbLogoImageView.startAnimation(moveFBLogoAnimation);
        } else {
            mFbLogoImageView.setVisibility(View.GONE);
        }

        final View activityRootView = findViewById(R.id.mainConstraintLayout);
        activityRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (ANIMATION_ENDED || !START_ANIMATION) {
                    int heightDiff = activityRootView.getRootView().getHeight() - activityRootView.getHeight();
                    if (heightDiff > dpToPx(Login.this, 200)) {
                        //Soft keyboard is shown
                        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                            mFbCoverImageView.setVisibility(View.GONE);
//                        mLangTextView.setVisibility(View.GONE);
                        mForgotPswTextView.setVisibility(View.GONE);
                    } else {
                        //Soft keyboard is hidden
                        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                            mFbCoverImageView.setVisibility(View.VISIBLE);
//                        mLangTextView.setVisibility(View.VISIBLE);
                        mForgotPswTextView.setVisibility(View.VISIBLE);
                    }
                }
            }
        });


        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.connect.dsb",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        mFbLogoStaticImageView.setVisibility(View.VISIBLE);
        mFbLogoImageView.clearAnimation();

        mFbLogoImageView.setVisibility(View.GONE);
        mEmailEditText.setAlpha(0f);
        mEmailEditText.setVisibility(View.VISIBLE);
        mPswEditText.setAlpha(0f);
        mPswEditText.setVisibility(View.VISIBLE);
//        mLangTextView.setAlpha(0f);
//        mLangTextView.setVisibility(View.VISIBLE);
        mForgotPswTextView.setAlpha(0f);
        mForgotPswTextView.setVisibility(View.VISIBLE);

        mLoginButton.setAlpha(0f);
        mLoginButton.setVisibility(View.VISIBLE);

        mNewAccountButton.setAlpha(0f);
        mNewAccountButton.setVisibility(View.VISIBLE);

        mView.setAlpha(0f);
        mView.setVisibility(View.VISIBLE);

        mView1.setAlpha(0f);
        mView1.setVisibility(View.VISIBLE);

        mView2.setAlpha(0f);
        mView2.setVisibility(View.VISIBLE);

        mtextOr.setAlpha(0f);
        mtextOr.setVisibility(View.VISIBLE);

        mlogin_button1.setAlpha(0f);
        mlogin_button1.setVisibility(View.VISIBLE);

        mbtn_sign_in.setAlpha(0f);
        mbtn_sign_in.setVisibility(View.VISIBLE);

        micon_linked.setAlpha(0f);
        micon_linked.setVisibility(View.VISIBLE);

        msignup.setAlpha(0f);
        msignup.setVisibility(View.VISIBLE);

        mtextConnect.setAlpha(0f);
        mtextConnect.setVisibility(View.VISIBLE);

        micon_twitt.setAlpha(0f);
        micon_twitt.setVisibility(View.VISIBLE);



        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mFbCoverImageView.setAlpha(0f);
            mFbCoverImageView.setVisibility(View.VISIBLE);
        }

        int mediumAnimationTime = getResources().getInteger(android.R.integer.config_mediumAnimTime);

        mEmailEditText.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);

        mPswEditText.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);

//        mLangTextView.animate()
//                .alpha(1f)
//                .setDuration(mediumAnimationTime)
//                .setListener(null);

        mForgotPswTextView.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);

        mLoginButton.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);

        mNewAccountButton.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mView.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mView1.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mView2.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mtextOr.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mLoginButton.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mlogin_button1.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mbtn_sign_in.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        micon_linked.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        msignup.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        mtextConnect.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);
        micon_twitt.animate()
                .alpha(1f)
                .setDuration(mediumAnimationTime)
                .setListener(null);



        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mFbCoverImageView.animate()
                    .alpha(1f)
                    .setDuration(mediumAnimationTime)
                    .setListener(null); }

        ANIMATION_ENDED = true;
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }


    public static float dpToPx(Context context, float valueInDp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, metrics);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("START_ANIMATION", false);
    }


    public void login(View view) {
        Intent i = new Intent(this, BottomNavigation.class);
        startActivity(i);
        overridePendingTransition(R.anim.enter, R.anim.exit);
    }

//    public void login(View v) {
//        Intent i = new Intent(this, BottomNavigation.class);
//        startActivity(i);
//    }

    public void forget(View v) {
        Intent i = new Intent(this, ForgetPassword.class);
        startActivity(i);
    }

    public void signup(View v) {
        Intent i = new Intent(this, SignUpp.class);
        startActivity(i);
    }

    private void initializeControls() {
        callbackmanager = CallbackManager.Factory.create();
//        txtStatus = (TextView) findViewById(R.id.txtStatus);
        login_button1 = (ImageView) findViewById(R.id.login_button1);
    }


    public void loginWithFB(View v) {
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

