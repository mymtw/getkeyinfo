package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import android.content.Context;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.paypal.android.platform.authsdk.authcommon.utils.BuildConfigUtils;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.WebViewFragment$webViewClient$1 */
public final class WebViewFragment$webViewClient$1 extends WebViewClient {
    public final /* synthetic */ WebViewFragment this$0;

    public WebViewFragment$webViewClient$1(WebViewFragment webViewFragment) {
        this.this$0 = webViewFragment;
    }

    public void onPageFinished(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        super.onPageFinished(webView, str);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(sslErrorHandler, "handler");
        C19383o.m32797g(sslError, "error");
        try {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            BuildConfigUtils.Companion companion = BuildConfigUtils.Companion;
            Context applicationContext = this.this$0.requireActivity().getApplicationContext();
            C19383o.m32796f(applicationContext, "requireActivity().applicationContext");
            if (companion.isAppDebuggable$auth_sdk_thirdPartyRelease(applicationContext)) {
                WebViewUtils.Companion.showDialogOnSslError(sslErrorHandler, requireActivity, new WebViewFragment$webViewClient$1$onReceivedSslError$1(this.this$0, sslErrorHandler, sslError));
                return;
            }
            WebViewFragment webViewFragment = this.this$0;
            String sslError2 = sslError.toString();
            C19383o.m32796f(sslError2, "error.toString()");
            webViewFragment.cancelOnSslError(sslErrorHandler, sslError2);
        } catch (Exception e) {
            String access$getTAG$p = this.this$0.TAG;
            Log.e(access$getTAG$p, "Exception in receivedSSLError - " + e);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        return this.this$0.shouldOverrideUrl(webView, str);
    }
}
