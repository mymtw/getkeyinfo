package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class LoadingIndicatorKt$LoadingIndicator$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C12161l $colorScheme;
    public final /* synthetic */ boolean $isSmall;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorKt$LoadingIndicator$2(C1436d dVar, boolean z, C12161l lVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$isSmall = z;
        this.$colorScheme = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        LoadingIndicatorKt.m19951a(this.$modifier, this.$isSmall, this.$colorScheme, dVar, this.$$changed | 1, this.$$default);
    }
}
