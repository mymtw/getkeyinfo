package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import p628nj.C18263b;

/* renamed from: androidx.compose.material.a0 */
public final class C1164a0 implements C1215n0 {

    /* renamed from: a */
    public static final C1164a0 f2375a = new C1164a0();

    /* renamed from: a */
    public final long mo5221a(long j, float f, C1302d dVar, int i) {
        C1259v vVar = (C1259v) dVar.mo5410J(ColorsKt.f2187a);
        if (Float.compare(f, (float) 0) <= 0 || vVar.mo5364k()) {
            return j;
        }
        C1345l1 l1Var = ElevationOverlayKt.f2206a;
        return C18263b.m30808C(C1545s.m3356b(ColorsKt.m2174b(j, dVar), ((((float) Math.log((double) (f + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f), j);
    }
}
