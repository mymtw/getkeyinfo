package com.reddit.indicatorfastscroll;

import android.content.res.TypedArray;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19846a;

public final class FastScrollerView$$special$$inlined$use$lambda$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ TypedArray $attrsArray;
    public final /* synthetic */ FastScrollerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerView$$special$$inlined$use$lambda$1(TypedArray typedArray, FastScrollerView fastScrollerView) {
        super(0);
        this.$attrsArray = typedArray;
        this.this$0 = fastScrollerView;
    }

    public final void invoke() {
        this.this$0.setIconColor(C0005b.m34b0(this.$attrsArray, 2));
        FastScrollerView fastScrollerView = this.this$0;
        TypedArray typedArray = this.$attrsArray;
        C19383o.m32797g(typedArray, "<this>");
        C0005b.m23Q(typedArray, 0);
        fastScrollerView.setTextAppearanceRes(typedArray.getResourceId(0, 0));
        this.this$0.setTextColor(C0005b.m34b0(this.$attrsArray, 1));
        FastScrollerView fastScrollerView2 = this.this$0;
        TypedArray typedArray2 = this.$attrsArray;
        C19383o.m32797g(typedArray2, "<this>");
        C0005b.m23Q(typedArray2, 3);
        fastScrollerView2.setTextPadding(typedArray2.getDimension(3, 0.0f));
    }
}
