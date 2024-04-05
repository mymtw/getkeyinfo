package com.etsy.collagecompose;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ButtonKt$ButtonIconRow$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C12142d $size;
    public final /* synthetic */ C12145e $style;
    public final /* synthetic */ String $textAndTag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ButtonKt$ButtonIconRow$2(C12145e eVar, String str, C12142d dVar, int i, int i2) {
        super(2);
        this.$style = eVar;
        this.$textAndTag = str;
        this.$size = dVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ButtonKt.m19940b(this.$style, this.$textAndTag, this.$size, dVar, this.$$changed | 1, this.$$default);
    }
}
