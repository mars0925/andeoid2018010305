package com.mars.andeoid2018010305;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = (WebView)findViewById(R.id.webview);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);//打開javascript的功能
        //wv.loadUrl("https://www.youtube.com/");
        //loaddata可以使用HTML格式載入網頁的資料
        wv.loadData("<iframe width=\"450\" height=\"300\" src=\"https://www.youtube.com/embed/pUcrkzCO-GI\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>","text/html; charset=UTF-8",null);
    }
}
