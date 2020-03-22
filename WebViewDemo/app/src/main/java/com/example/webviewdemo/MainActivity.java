package com.example.webviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = this.<WebView>findViewById(R.id.WebViewId);

        WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

            webView.loadUrl("https://www.aiub.edu/");
    }

    // Back space button pressed
    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}