package com.reddit.indicatorfastscroll;

import android.content.res.TypedArray;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19846a;

public final class FastScrollerThumbView$$special$$inlined$use$lambda$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ TypedArray $attrsArray;
    public final /* synthetic */ FastScrollerThumbView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastScrollerThumbView$$special$$inlined$use$lambda$1(TypedArray typedArray, FastScrollerThumbView fastScrollerThumbView) {
        super(0);
        this.$attrsArray = typedArray;
        this.this$0 = fastScrollerThumbView;
    }

    public final void invoke() {
        this.this$0.setThumbColor(C0005b.m34b0(this.$attrsArray, 3));
        FastScrollerThumbView fastScrollerThumbView = this.this$0;
        TypedArray typedArray = this.$attrsArray;
        C19383o.m32797g(typedArray, "<this>");
        C0005b.m23Q(typedArray, 2);
        fastScrollerThumbView.setIconColor(typedArray.getColor(2, 0));
        FastScrollerThumbView fastScrollerThumbView2 = this.this$0;
        TypedArray typedArray2 = this.$attrsArray;
        C19383o.m32797g(typedArray2, "<this>");
        C0005b.m23Q(typedArray2, 0);
        fastScrollerThumbView2.setTextAppearanceRes(typedArray2.getResourceId(0, 0));
        FastScrollerThumbView fastScrollerThumbView3 = this.this$0;
        TypedArray typedArray3 = this.$attrsArray;
        C19383o.m32797g(typedArray3, "<this>");
        C0005b.m23Q(typedArray3, 1);
        fastScrollerThumbView3.setTextColor(typedArray3.getColor(1, 0));
    }
}
