package com.reddit.indicatorfastscroll;

import kotlin.C19394m;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.C19401d;
import p753kq.C19846a;

public final /* synthetic */ class FastScrollerView$iconColor$2 extends FunctionReference implements C19846a<C19394m> {
    public FastScrollerView$iconColor$2(FastScrollerView fastScrollerView) {
        super(0, fastScrollerView);
    }

    public final String getName() {
        return "bindItemIndicatorViews";
    }

    public final C19401d getOwner() {
        return C19386q.m32807a(FastScrollerView.class);
    }

    public final String getSignature() {
        return "bindItemIndicatorViews()V";
    }

    public final void invoke() {
        ((FastScrollerView) this.receiver).bindItemIndicatorViews();
    }
}
