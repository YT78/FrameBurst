package com.example.frameburst.bbcf;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.frameburst.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class bbcfLambdaActivity extends AppCompatActivity {
    private WebView webview;
    //private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbcf_lambda);
        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://blazblue.fandom.com/wiki/Lambda-11/Move_List");

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.clearView();
                webview.clearHistory();
                webview.loadUrl("https://blazblue.fandom.com/wiki/Lambda-11");

            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.clearView();
                webview.clearHistory();
                webview.loadUrl("https://blazblue.fandom.com/wiki/Lambda-11/Move_List");
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
