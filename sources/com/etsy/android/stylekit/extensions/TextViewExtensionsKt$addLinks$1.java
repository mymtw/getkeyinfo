package com.etsy.android.stylekit.extensions;

import android.text.style.URLSpan;
import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class TextViewExtensionsKt$addLinks$1 extends URLSpan {
    public final /* synthetic */ C19861p<View, String, C19394m> $onClickListener;
    public final /* synthetic */ URLSpan $url;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextViewExtensionsKt$addLinks$1(String str, C19861p<? super View, ? super String, C19394m> pVar, URLSpan uRLSpan) {
        super(str);
        this.$onClickListener = pVar;
        this.$url = uRLSpan;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        C19861p<View, String, C19394m> pVar = this.$onClickListener;
        String url = this.$url.getURL();
        C19383o.m32796f(url, "url.url");
        pVar.invoke(view, url);
    }
}
