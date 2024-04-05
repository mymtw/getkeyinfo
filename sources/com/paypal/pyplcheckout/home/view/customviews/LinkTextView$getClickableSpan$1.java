package com.paypal.pyplcheckout.home.view.customviews;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public final class LinkTextView$getClickableSpan$1 extends ClickableSpan {
    public final /* synthetic */ C19846a<C19394m> $action;

    public LinkTextView$getClickableSpan$1(C19846a<C19394m> aVar) {
        this.$action = aVar;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "v");
        this.$action.invoke();
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}
