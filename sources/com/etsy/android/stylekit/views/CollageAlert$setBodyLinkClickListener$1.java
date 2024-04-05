package com.etsy.android.stylekit.views;

import android.text.style.URLSpan;
import android.view.View;
import kotlin.jvm.internal.C19383o;

public final class CollageAlert$setBodyLinkClickListener$1 extends URLSpan {
    public final /* synthetic */ View.OnClickListener $onClickListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollageAlert$setBodyLinkClickListener$1(View.OnClickListener onClickListener, String str) {
        super(str);
        this.$onClickListener = onClickListener;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        this.$onClickListener.onClick(view);
    }
}
