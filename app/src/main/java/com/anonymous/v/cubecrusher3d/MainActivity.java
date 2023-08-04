package com.anonymous.v.cubecrusher3d;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.services.banners.BannerErrorInfo;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    WebView wv;

    //back button time
    private long pressedTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for full screen
        //remove title bar
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       setContentView(R.layout.activity_main);
        //hiding action bar
        getSupportActionBar().hide();

        wv = findViewById(R.id.game_bord);
        //enabling JS and other Requirements
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setUseWideViewPort(true);
        wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        wv.getSettings().setAllowFileAccess(true);
        wv.getSettings().setAllowContentAccess(true);
        wv.getSettings().setAllowFileAccessFromFileURLs(true);
        wv.getSettings().setAllowUniversalAccessFromFileURLs(true);
        wv.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        wv.getSettings().setDomStorageEnabled(true);


        //loading view
        wv.loadUrl("file:///android_asset/index.html");



    }

    @Override
    public void onBackPressed() {
        if(pressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            finish();
        }
        else{
            Toast.makeText(MainActivity.this, "Press Back Again To Exit ", Toast.LENGTH_SHORT).show();
        }

        pressedTime = System.currentTimeMillis();
    }



}




