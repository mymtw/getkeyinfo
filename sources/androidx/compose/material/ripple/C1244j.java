package androidx.compose.material.ripple;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0450s;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import p174m0.C7284d;

/* renamed from: androidx.compose.material.ripple.j */
public final class C1244j {

    /* renamed from: a */
    public static final C0433j0<Float> f2601a = new C0433j0<>(15, (C0448r) C0450s.C0451a.f1169a, 2);

    /* renamed from: a */
    public static final C1237c m2369a(boolean z, float f, long j, C1302d dVar, int i, int i2) {
        dVar.mo5465u(1635163520);
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = C1545s.f3364i;
        }
        C1338j0 E0 = C0761x.m1664E0(new C1545s(j), dVar);
        Boolean valueOf = Boolean.valueOf(z);
        C7284d dVar2 = new C7284d(f);
        dVar.mo5465u(-3686552);
        boolean I = dVar.mo5408I(valueOf) | dVar.mo5408I(dVar2);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new C1237c(z, f, E0);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        C1237c cVar = (C1237c) v;
        dVar.mo5406H();
        return cVar;
    }
}
