package com.etsy.android.uikit.webview;

import android.net.Uri;
import android.webkit.WebView;
import p287xp.C8333a;

/* renamed from: com.etsy.android.uikit.webview.a */
public final /* synthetic */ class C12021a implements C8333a {

    /* renamed from: a */
    public final /* synthetic */ EtsyWebViewClient f26791a;

    /* renamed from: b */
    public final /* synthetic */ WebView f26792b;

    /* renamed from: c */
    public final /* synthetic */ Uri f26793c;

    public /* synthetic */ C12021a(EtsyWebViewClient etsyWebViewClient, WebView webView, Uri uri) {
        this.f26791a = etsyWebViewClient;
        this.f26792b = webView;
        this.f26793c = uri;
    }

    public final void run() {
        this.f26791a.lambda$shouldOverrideUrlLoading$0(this.f26792b, this.f26793c);
    }
}
