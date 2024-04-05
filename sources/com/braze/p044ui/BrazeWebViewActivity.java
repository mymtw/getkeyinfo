package com.braze.p044ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.appboy.p043ui.C4940R;
import com.braze.p044ui.support.ViewUtils;
import kotlin.jvm.internal.C19383o;

@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: com.braze.ui.BrazeWebViewActivity */
public class BrazeWebViewActivity extends FragmentActivity {
    public WebChromeClient createWebChromeClient() {
        return new BrazeWebViewActivity$createWebChromeClient$1();
    }

    public WebViewClient createWebViewClient() {
        return new BrazeWebViewActivity$createWebViewClient$1(this);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        setContentView(C4940R.C4943layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(C4940R.C4942id.com_braze_webview_activity_webview);
        webView.setLayerType(2, (Paint) null);
        WebSettings settings = webView.getSettings();
        C19383o.m32796f(settings, "webView.settings");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        C19383o.m32796f(applicationContext, "this.applicationContext");
        if (ViewUtils.m11481g(applicationContext)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (i >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString("url")) != null) {
            webView.loadUrl(string);
        }
    }
}
