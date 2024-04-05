package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;

public final class WebDialog$setUpWebView$1 extends WebView {
    public final /* synthetic */ WebDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebDialog$setUpWebView$1(WebDialog webDialog, Context context) {
        super(context);
        this.this$0 = webDialog;
    }

    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (NullPointerException unused) {
        }
    }
}
