package com.reddit.indicatorfastscroll;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class FastScrollerView$showIndicator$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ FastScrollerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerView$showIndicator$2(FastScrollerView fastScrollerView) {
        super(0);
        this.this$0 = fastScrollerView;
    }

    public final void invoke() {
        this.this$0.postUpdateItemIndicators();
    }
}
