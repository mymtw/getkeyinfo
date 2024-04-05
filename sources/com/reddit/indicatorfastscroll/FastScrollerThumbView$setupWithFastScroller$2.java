package com.reddit.indicatorfastscroll;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FastScrollerThumbView$setupWithFastScroller$2 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ FastScrollerThumbView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerThumbView$setupWithFastScroller$2(FastScrollerThumbView fastScrollerThumbView) {
        super(1);
        this.this$0 = fastScrollerThumbView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        this.this$0.setActivated(z);
    }
}
