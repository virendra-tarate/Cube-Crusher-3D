package com.anonymous.v.cubecrusher3d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash_Screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        //hiding Action Bar
        getSupportActionBar().hide();

        //calling a handler to change a activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //passing intent
                Intent iii = new Intent(Splash_Screen.this, MainActivity.class);

                //starting activity
                startActivity(iii);

                //after 3sec remove current activaty from stack
                finish();
            }
        },3000);

    }
}