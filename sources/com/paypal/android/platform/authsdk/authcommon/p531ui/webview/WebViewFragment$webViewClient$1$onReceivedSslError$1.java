package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.WebViewFragment$webViewClient$1$onReceivedSslError$1 */
public final class WebViewFragment$webViewClient$1$onReceivedSslError$1 implements WebViewUtils.DialogOnSslErrorHandler {
    public final /* synthetic */ SslError $error;
    public final /* synthetic */ SslErrorHandler $handler;
    public final /* synthetic */ WebViewFragment this$0;

    public WebViewFragment$webViewClient$1$onReceivedSslError$1(WebViewFragment webViewFragment, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.this$0 = webViewFragment;
        this.$handler = sslErrorHandler;
        this.$error = sslError;
    }

    public void cancel() {
        WebViewFragment webViewFragment = this.this$0;
        SslErrorHandler sslErrorHandler = this.$handler;
        String sslError = this.$error.toString();
        C19383o.m32796f(sslError, "error.toString()");
        webViewFragment.cancelOnSslError(sslErrorHandler, sslError);
    }
}
