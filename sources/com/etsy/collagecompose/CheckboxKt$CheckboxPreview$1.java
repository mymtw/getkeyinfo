package com.etsy.collagecompose;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class CheckboxKt$CheckboxPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxPreview$1(int i) {
        super(2);
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2 = this.$$changed | 1;
        float f = CheckboxKt.f27020a;
        ComposerImpl h = dVar.mo5440h(-730880581);
        if (i2 != 0 || !h.mo5442i()) {
            ThemeKt.m19959a(false, ComposableSingletons$CheckboxKt.f27044a, h, 48, 1);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CheckboxKt$CheckboxPreview$1(i2);
        }
    }
}
