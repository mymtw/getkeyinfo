package com.paypal.android.platform.authsdk.authcommon;

import android.webkit.SslErrorHandler;
import com.paypal.android.platform.authsdk.authcommon.utils.WebViewUtils;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.GRCWebViewLoader$getWebViewClient$webViewClient$1$onReceivedSslError$1$1 */
public final class C17055xa8f6804f implements WebViewUtils.DialogOnSslErrorHandler {
    public final /* synthetic */ SslErrorHandler $handler;
    public final /* synthetic */ GRCWebViewLoader$getWebViewClient$webViewClient$1 this$0;

    public C17055xa8f6804f(GRCWebViewLoader$getWebViewClient$webViewClient$1 gRCWebViewLoader$getWebViewClient$webViewClient$1, SslErrorHandler sslErrorHandler) {
        this.this$0 = gRCWebViewLoader$getWebViewClient$webViewClient$1;
        this.$handler = sslErrorHandler;
    }

    public void cancel() {
        this.this$0.cancelOnSslError(this.$handler);
    }
}
