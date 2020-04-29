package com.example.frameburst.acr;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.frameburst.R;

import androidx.appcompat.app.AppCompatActivity;

public class acrSolActivity extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acr_sol);
        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://guilty-gear.fandom.com/wiki/Sol_Badguy");

        webview = (WebView) findViewById(R.id.webview2);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.dustloop.com/wiki/index.php?title=GGACR/Sol_Badguy");

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View webview) {
            layoutone.setVisibility(View.GONE);
            layouttwo.setVisibility(View.GONE);
        }});

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()){
            webview.goBack();
        }else{
            super.onBackPressed();
        }

    }
}
