
package com.example.nerio.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView WebView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView1 = findViewById(R.id.webView);
        String URL;
        URL = getIntent().getStringExtra("pagina");
        WebView1.setWebViewClient(new WebViewClient());
        WebView1.loadUrl("http://" + URL);
    }
    public void BotonCerrar (View vista) {
        finish();
    }
}
