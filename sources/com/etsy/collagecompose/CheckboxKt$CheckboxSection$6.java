package com.etsy.collagecompose;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class CheckboxKt$CheckboxSection$6 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C12152g $direction;
    public final /* synthetic */ C12155h $size;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxSection$6(C12155h hVar, C12152g gVar, int i) {
        super(2);
        this.$size = hVar;
        this.$direction = gVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CheckboxKt.m19949c(this.$size, this.$direction, dVar, this.$$changed | 1);
    }
}
