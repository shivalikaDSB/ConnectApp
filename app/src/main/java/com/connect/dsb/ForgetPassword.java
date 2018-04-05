package com.connect.dsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forget_password);
    }

//    public void forgetlogin(View v) {
//        Intent i = new Intent(this, LoginPage.class);
//        startActivity(i);
////        overridePendingTransition(R.anim.enter, R.anim.exit);
//    }

    public void forgetlogin(View v) {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
//        overridePendingTransition(R.anim.enter, R.anim.exit);
    }


//    public void onclick(View v) {
//        Intent i = new Intent(Intent.ACTION_SEND);
//        i.setType("text/plain");
//        String shareBody = "your body";
//        String sharesub = "subject here";
//        i.putExtra(Intent.EXTRA_SUBJECT, shareBody);
//        i.putExtra(Intent.EXTRA_TEXT, shareBody);
//        startActivity(Intent.createChooser(i, "share using"));

//    public void onclick(View v) {
//        Intent i = new Intent(Intent.ACTION_SEND);
//        i.setType("text/plain");
//        String shareBody = "your body";
//        String sharesub = "subject here";
//        i.putExtra( android.content.Intent.EXTRA_TEXT, "My new app https://play.google.com/store/search?q=TECHHUBINDIAN");
//
//        startActivity(Intent.createChooser(i, "Share Via"));
//
//    }
}

