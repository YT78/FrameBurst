package com.example.frameburst.acr;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import com.example.frameburst.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class acrSolActivity extends AppCompatActivity {
    private TextView textview;
    private WebView webview, webview2;
    private ConstraintLayout profile, framedata, specials;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acr_sol);


        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://guilty-gear.fandom.com/wiki/Sol_Badguy");

        webview2 = findViewById(R.id.webview2);
        webview2.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0");
        webview2.setWebViewClient(new WebViewClient());
        webview2.getSettings().setUseWideViewPort(true);
        webview2.setInitialScale(1);
        webview2.loadUrl("https://www.dustloop.com/wiki/index.php?title=GGACR/Sol_Badguy");

        final ConstraintLayout specials = findViewById(R.id.layout1);
        final ConstraintLayout profile = findViewById(R.id.layout2);
        final ConstraintLayout framedata = findViewById(R.id.layout3);


        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile.setVisibility(View.GONE);
                framedata.setVisibility(View.VISIBLE);
                specials.setVisibility(View.GONE);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile.setVisibility(View.VISIBLE);
                framedata.setVisibility(View.GONE);
                specials.setVisibility(View.GONE);
            }
        });

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profile.setVisibility(View.GONE);
                framedata.setVisibility(View.GONE);
                specials.setVisibility(View.VISIBLE);
            }
        });

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