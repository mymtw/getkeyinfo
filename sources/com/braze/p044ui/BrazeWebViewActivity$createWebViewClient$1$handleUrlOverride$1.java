package com.braze.p044ui;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p003a2.C0023f;
import p753kq.C19846a;

/* renamed from: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1 */
public final class BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $url;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1(String str) {
        super(0);
        this.$url = str;
    }

    public final String invoke() {
        return C0023f.m110k(C0072d.m201h("Unexpected exception while processing url "), this.$url, ". Passing url back to WebView.");
    }
}
