package com.etsy.android.uikit.util;

import android.text.style.URLSpan;
import android.view.View;
import com.etsy.android.uikit.util.EtsyLinkify;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class EtsyLinkify$createCustomSpannable$formattedSpan$1 extends EtsyLinkify.CustomColorUnderlineURLSpan {
    public final /* synthetic */ C19861p<View, String, C19394m> $listener;
    public final /* synthetic */ URLSpan $span;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLinkify$createCustomSpannable$formattedSpan$1(int i, C19861p<? super View, ? super String, C19394m> pVar, URLSpan uRLSpan, String str) {
        super(i, str, false);
        this.$listener = pVar;
        this.$span = uRLSpan;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        C19861p<View, String, C19394m> pVar = this.$listener;
        String url = this.$span.getURL();
        C19383o.m32796f(url, "span.url");
        pVar.invoke(view, url);
    }
}
