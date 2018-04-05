package com.connect.dsb;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class    Splash extends AppCompatActivity  implements Animation.AnimationListener {
    ImageView imageView;
    private Bundle savedInstanceState;
    private ImageView mFbLogoImageView;
    private ImageView mFbCoverImageView;
    private EditText mEmailEditText;
    private EditText mPswEditText;
    private TextView mLangTextView;
    private TextView mForgotPswTextView;
    private Button mLoginButton;
    private TextView mNewAccountButton;
    private ImageView mFbLogoStaticImageView;

    private Boolean ANIMATION_ENDED = false;
    private Boolean START_ANIMATION = true;

    /**
     * @param savedInstanceState
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
//        final ImageView imageView = (ImageView) findViewById(R.id.ImageView1);
//
//        imageView.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                final Animation animation = new AlphaAnimation(1, 0);
//                animation.setDuration(1000);
//                animation.setInterpolator(new LinearInterpolator());
//                animation.setRepeatCount(4);
//                animation.setRepeatMode(Animation.REVERSE);
//                imageView.startAnimation(animation);
//            }
//        }, 1000);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent startActivity = new Intent(Splash.this, Login.class);
//                startActivity(startActivity);
//                finish();
//            }
//        }, 4000);
//    }
        final ImageView imageView = (ImageView) findViewById(R.id.ImageView1);

        imageView.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Animation animation = new AlphaAnimation(1, 0);
                animation.setDuration(1000);
                animation.setInterpolator(new LinearInterpolator());
                animation.setRepeatCount(4);
                animation.setRepeatMode(Animation.REVERSE);
                imageView.startAnimation(animation);
            }
        }, 1000);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(new SessionManager(Splash.this).isLoggedIn()) {
                    startActivity(new Intent(Splash.this, BottomNavigation.class));

                    finish();
                }
                else {
                    startActivity(new Intent(Splash.this, Login.class));
                    finish();
                }
            }
        },3000);
    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(savedInstanceState != null) {
            START_ANIMATION = savedInstanceState.getBoolean("START_ANIMATION");
        }

        mFbLogoImageView = (ImageView) findViewById(R.id.fbLogoImageView);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            mFbCoverImageView = (ImageView) findViewById(R.id.fbCoverImageView);
        mEmailEditText = (EditText) findViewById(R.id.emailEditText);
        mPswEditText = (EditText) findViewById(R.id.pswEditText);
//        mLangTextView = (TextView) findViewById(R.id.langTextView);
        mForgotPswTextView = (TextView) findViewById(R.id.forgotPswTextView);
        mLoginButton = (Button) findViewById(R.id.loginButton);
        mNewAccountButton = (TextView) findViewById(R.id.newAccountButton);
        mFbLogoStaticImageView = (ImageView) findViewById(R.id.fbLogoStaticImageView);

        if(START_ANIMATION) {
//            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
//                mFbCoverImageView.setVisibility(View.GONE);
//            mEmailEditText.setVisibility(View.GONE);
//            mPswEditText.setVisibility(View.GONE);
//            mLangTextView.setVisibility(View.GONE);
//            mForgotPswTextView.setVisibility(View.GONE);
//            mLoginButton.setVisibility(View.GONE);
//            mNewAccountButton.setVisibility(View.GONE);
//            mFbLogoStaticImageView.setVisibility(View.GONE);

            Animation moveFBLogoAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_fb_logo);
            moveFBLogoAnimation.setFillAfter(true);
            moveFBLogoAnimation.setAnimationListener(this);
//            mFbLogoImageView.startAnimation(moveFBLogoAnimation);
        }
        else {
            mFbLogoImageView.setVisibility(View.GONE);
        }

//        final View activityRootView = findViewById(R.id.mainConstraintLayout);
//        activityRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                if(ANIMATION_ENDED || !START_ANIMATION) {
//                    int heightDiff = activityRootView.getRootView().getHeight() - activityRootView.getHeight();
//                    if (heightDiff > dpToPx(Splash.this, 200)) {
//                        //Soft keyboard is shown
//                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
//                            mFbCoverImageView.setVisibility(View.GONE);
//                        mLangTextView.setVisibility(View.GONE);
//                        mForgotPswTextView.setVisibility(View.GONE);
//                    } else {
//                        //Soft keyboard is hidden
//                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
//                            mFbCoverImageView.setVisibility(View.VISIBLE);
//                        mLangTextView.setVisibility(View.VISIBLE);
//                        mForgotPswTextView.setVisibility(View.VISIBLE);
//                    }
//                }
//            }
//        });

//        mEmailEditText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if(mEmailEditText.getText().toString().length() > 0 && mPswEditText.getText().toString().length() > 0) {
//                    mLoginButton.setTextColor(Color.parseColor("#ffffff"));
//                    mLoginButton.setEnabled(true);
//                }
//                else {
//                    mLoginButton.setTextColor(Color.parseColor("#aaaaaa"));
//                    mLoginButton.setEnabled(false);
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//        mPswEditText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if(mEmailEditText.getText().toString().length() > 0 && mPswEditText.getText().toString().length() > 0) {
//                    mLoginButton.setTextColor(Color.parseColor("#ffffff"));
//                    mLoginButton.setEnabled(true);
//                }
//                else {
//                    mLoginButton.setTextColor(Color.parseColor("#aaaaaa"));
//                    mLoginButton.setEnabled(false);
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
    }





    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        mFbLogoStaticImageView.setVisibility(View.VISIBLE);
        mFbLogoImageView.clearAnimation();
        mFbLogoImageView.setVisibility(View.GONE);

//        mEmailEditText.setAlpha(0f);
//        mEmailEditText.setVisibility(View.VISIBLE);
//        mPswEditText.setAlpha(0f);
//        mPswEditText.setVisibility(View.VISIBLE);
//        mLangTextView.setAlpha(0f);
//        mLangTextView.setVisibility(View.VISIBLE);
//        mForgotPswTextView.setAlpha(0f);
//        mForgotPswTextView.setVisibility(View.VISIBLE);
//        mLoginButton.setAlpha(0f);
//        mLoginButton.setVisibility(View.VISIBLE);
//        mNewAccountButton.setAlpha(0f);
//        mNewAccountButton.setVisibility(View.VISIBLE);
//        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//            mFbCoverImageView.setAlpha(0f);
//            mFbCoverImageView.setVisibility(View.VISIBLE);
//        }
//
//        int mediumAnimationTime = getResources().getInteger(android.R.integer.config_mediumAnimTime);
//
//        mEmailEditText.animate()
//                .alpha(1f)
//                .setDuration(mediumAnimationTime)
//                .setListener(null);
//
//        mPswEditText.animate()
//                .alpha(1f)
//                .setDuration(mediumAnimationTime)
//                .setListener(null);
//
//        mLangTextView.animate()
//                .alpha(1f)
//                .setDuration(mediumAnimationTime)
//                .setListener(null);
//
//        mForgotPswTextView.animate()
//                .alpha(1f)
//                .setDuration(mediumAnimationTime)
//                .setListener(null);
//
//        mLoginButton.animate()
//                .alpha(1f)
//                .setDuration(mediumAnimationTime)
//                .setListener(null);
//
//        mNewAccountButton.animate()
//                .alpha(1f)
//                .setDuration(mediumAnimationTime)
//                .setListener(null);
//
//        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//            mFbCoverImageView.animate()
//                    .alpha(1f)
//                    .setDuration(mediumAnimationTime)
//                    .setListener(null);
//        }
//
//        ANIMATION_ENDED = true;
    }



    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    public static float dpToPx(Context context, float valueInDp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, metrics);
    }

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


