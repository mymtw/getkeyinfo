package com.etsy.collagecompose;

import androidx.compose.material.C1178d2;
import androidx.compose.material.C1225q1;
import androidx.compose.material.C1259v;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p202p.C7645g;
import p753kq.C19861p;

public final class ThemeKt$CollageTheme$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1259v $materialColors;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThemeKt$CollageTheme$1(C1259v vVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$materialColors = vVar;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            MaterialThemeKt.m2189a(this.$materialColors, (C1178d2) null, new C1225q1(C7645g.m14661a(((C12159j) dVar.mo5410J(DimensKt.f27051e)).f27178f), 6), this.$content, dVar, (this.$$dirty << 6) & 7168, 2);
            return;
        }
        dVar.mo5396C();
    }
}
