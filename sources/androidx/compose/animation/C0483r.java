package androidx.compose.animation;

import androidx.compose.animation.core.C0411a;
import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0435k0;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import androidx.compose.runtime.C1302d;
import p753kq.C19857l;

/* renamed from: androidx.compose.animation.r */
public final class C0483r {
    static {
        C0761x.m1678L0(0.0f, 0.0f, (Object) null, 7);
    }

    /* renamed from: a */
    public static final C0424f m1263a(long j, C0433j0 j0Var, C1302d dVar, int i) {
        dVar.mo5465u(-1942442407);
        C1505c f = C1545s.m3360f(j);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(f);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = (C0435k0) ColorVectorConverterKt.f975a.invoke(C1545s.m3360f(j));
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C0424f c = C0411a.m1107c(new C1545s(j), (C0435k0) v, j0Var, (Float) null, (C19857l) null, dVar, (i & 14) | 576 | (57344 & (i << 6)), 8);
        dVar.mo5406H();
        return c;
    }
}
