package com.felight.toastactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


/**
 * Created by hp on 17-10-2016.
 */

public class WebActivity extends AppCompatActivity {
    private WebView webView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_layout);
        webView=(WebView)findViewById(R.id.wView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.gmail.com");
    }
}
