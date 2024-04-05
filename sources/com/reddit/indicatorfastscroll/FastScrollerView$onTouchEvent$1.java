package com.reddit.indicatorfastscroll;

import android.view.View;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class FastScrollerView$onTouchEvent$1 extends Lambda implements C19861p<View, Integer, Boolean> {
    public static final FastScrollerView$onTouchEvent$1 INSTANCE = new FastScrollerView$onTouchEvent$1();

    public FastScrollerView$onTouchEvent$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((View) obj, ((Number) obj2).intValue()));
    }

    public final boolean invoke(View view, int i) {
        C19383o.m32798h(view, "$this$containsY");
        return view.getTop() <= i && view.getBottom() > i;
    }
}
