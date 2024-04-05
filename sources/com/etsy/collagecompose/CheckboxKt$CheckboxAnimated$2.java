package com.etsy.collagecompose;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class CheckboxKt$CheckboxAnimated$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C12155h $size;
    public final /* synthetic */ ToggleableState $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxAnimated$2(boolean z, ToggleableState toggleableState, C1436d dVar, C12155h hVar, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$value = toggleableState;
        this.$modifier = dVar;
        this.$size = hVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CheckboxKt.m19948b(this.$enabled, this.$value, this.$modifier, this.$size, dVar, this.$$changed | 1, this.$$default);
    }
}
