package com.etsy.android.uikit.webview;

import android.net.Uri;
import android.webkit.WebView;
import p145io.reactivex.functions.Consumer;

/* renamed from: com.etsy.android.uikit.webview.b */
public final /* synthetic */ class C12022b implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ EtsyWebViewClient f26794b;

    /* renamed from: c */
    public final /* synthetic */ WebView f26795c;

    /* renamed from: d */
    public final /* synthetic */ Uri f26796d;

    public /* synthetic */ C12022b(EtsyWebViewClient etsyWebViewClient, WebView webView, Uri uri) {
        this.f26794b = etsyWebViewClient;
        this.f26795c = webView;
        this.f26796d = uri;
    }

    public final void accept(Object obj) {
        this.f26794b.lambda$shouldOverrideUrlLoading$1(this.f26795c, this.f26796d, (Throwable) obj);
    }
}
