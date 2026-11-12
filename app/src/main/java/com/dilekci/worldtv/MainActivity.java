
package com.dilekci.worldtv;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

public class MainActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        webView.loadData(
            "<html><body style='background:#101827;color:white;text-align:center;font-family:sans-serif;'>"
            + "<h1>DİLEKÇİ WORLD TV</h1>"
            + "<h2>Dünyanın Televizyonu</h2>"
            + "<p>Android TV uygulamamıza hoş geldiniz.</p>"
            + "</body></html>",
            "text/html",
            "UTF-8"
        );

        setContentView(webView);
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
