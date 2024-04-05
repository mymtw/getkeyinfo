package androidx.compose.material;

import androidx.compose.material.ripple.C1239e;
import androidx.compose.material.ripple.C1245k;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import p628nj.C18263b;

/* renamed from: androidx.compose.material.z0 */
public final class C1273z0 implements C1245k {

    /* renamed from: a */
    public static final C1273z0 f2676a = new C1273z0();

    /* renamed from: a */
    public final long mo5326a(C1302d dVar) {
        dVar.mo5465u(550536719);
        long j = ((C1545s) dVar.mo5410J(ContentColorKt.f2199a)).f3366a;
        boolean k = ((C1259v) dVar.mo5410J(ColorsKt.f2187a)).mo5364k();
        float f0 = C18263b.m30843f0(j);
        if (!k && ((double) f0) < 0.5d) {
            j = C1545s.f3358c;
        }
        dVar.mo5406H();
        return j;
    }

    /* renamed from: b */
    public final C1239e mo5327b(C1302d dVar) {
        dVar.mo5465u(-1419762518);
        C1239e eVar = ((C1259v) dVar.mo5410J(ColorsKt.f2187a)).mo5364k() ? ((double) C18263b.m30843f0(((C1545s) dVar.mo5410J(ContentColorKt.f2199a)).f3366a)) > 0.5d ? RippleThemeKt.f2574b : RippleThemeKt.f2575c : RippleThemeKt.f2576d;
        dVar.mo5406H();
        return eVar;
    }
}
