package com.example.frameburst.xrd;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.frameburst.R;

import androidx.appcompat.app.AppCompatActivity;

public class Rev2ZatoActivity extends AppCompatActivity {
    private WebView webview;
    //private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev2_zato);
        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://guilty-gear.fandom.com/wiki/Zato-1/Commands");

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.clearView();
                webview.clearHistory();
                webview.loadUrl("https://guilty-gear.fandom.com/wiki/Zato-1");

            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.clearView();
                webview.clearHistory();
                webview.loadUrl("https://guilty-gear.fandom.com/wiki/Zato-1/Commands");
            }
        });

        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webview.canGoBack()){
            webview.goBack();
        }else{
            super.onBackPressed();
        }

    }
}
