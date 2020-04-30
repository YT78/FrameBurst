package com.example.frameburst.acr;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.frameburst.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class acrDizzyActivity extends AppCompatActivity {
    private WebView webview, webview2;
    private ConstraintLayout profile, framedata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acr_dizzy);


        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://guilty-gear.fandom.com/wiki/Dizzy");

        webview2 = (WebView) findViewById(R.id.webview2);
        webview2.setWebViewClient(new WebViewClient());
        webview2.loadUrl("https://www.dustloop.com/wiki/index.php?title=GGACR/Dizzy");

        final ConstraintLayout profile = findViewById(R.id.layout2);
        final ConstraintLayout framedata = findViewById(R.id.layout3);

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile.setVisibility(View.GONE);
                framedata.setVisibility(View.VISIBLE);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile.setVisibility(View.VISIBLE);
                framedata.setVisibility(View.GONE);
            }
        });

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }


    @Override
    public void onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.onBackPressed();
        }

    }
}