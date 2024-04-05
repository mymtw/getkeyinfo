package com.qualtrics.qsiframework;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.R;

public class QualtricsActivity extends AppCompatActivity {

    /* renamed from: com.qualtrics.qsiframework.QualtricsActivity$a */
    public class C17335a extends WebViewClient {
        public final void onPageFinished(WebView webView, String str) {
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.qualtrics_activity);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            str = extras != null ? extras.getString("Q_URL") : null;
        } else {
            str = (String) bundle.getSerializable("Q_URL");
        }
        Log.i("QPUSH", "Starting activity, survey URL: " + str);
        if (str != null) {
            WebView webView = (WebView) findViewById(R.id.survey_webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setOverScrollMode(2);
            webView.setWebViewClient(new C17335a());
            webView.loadUrl(str);
        }
    }
}
