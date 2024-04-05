package com.paypal.android.platform.authsdk.authcommon;

import android.app.Activity;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;
import kotlin.jvm.internal.C19383o;

public final class GRCWebViewLoader$getWebViewClient$webViewClient$1 extends WebViewClient {
    public final /* synthetic */ GRCWebViewLoader this$0;

    public GRCWebViewLoader$getWebViewClient$webViewClient$1(GRCWebViewLoader gRCWebViewLoader) {
        this.this$0 = gRCWebViewLoader;
    }

    /* access modifiers changed from: private */
    public final void cancelOnSslError(SslErrorHandler sslErrorHandler) {
        sslErrorHandler.cancel();
    }

    public void onPageFinished(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        super.onPageFinished(webView, str);
        this.this$0.mWeakActivity.clear();
        this.this$0.webView = null;
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(sslErrorHandler, "handler");
        C19383o.m32797g(sslError, "error");
        Log.d("GRCWebViewLoader", "Override Url Loading URL: " + sslError);
        Activity activity = (Activity) this.this$0.mWeakActivity.get();
        if (activity != null) {
            if (!this.this$0.isAppDebuggable(activity)) {
                cancelOnSslError(sslErrorHandler);
            } else if (!activity.isFinishing()) {
                WebViewUtils.Companion.showDialogOnSslError(sslErrorHandler, activity, new C17055xa8f6804f(this, sslErrorHandler));
            } else {
                cancelOnSslError(sslErrorHandler);
            }
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        Log.d("GRCWebViewLoader", "Override Url Loading URL: " + str);
        return false;
    }
}
