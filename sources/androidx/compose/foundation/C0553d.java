package androidx.compose.foundation;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.draw.C1444f;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1606z;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19356i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p003a2.C0023f;
import p288y.C8341a;
import p288y.C8345d;
import p288y.C8346e;
import p288y.C8347f;
import p297z.C8412e;
import p297z.C8413f;
import p297z.C8415h;

/* renamed from: androidx.compose.foundation.d */
public final class C0553d extends C1862p0 implements C1444f {

    /* renamed from: c */
    public final C1545s f1294c;

    /* renamed from: d */
    public final C1533m f1295d;

    /* renamed from: e */
    public final float f1296e;

    /* renamed from: f */
    public final C1530k0 f1297f;

    /* renamed from: g */
    public C8347f f1298g;

    /* renamed from: h */
    public C1606z f1299h;

    public C0553d() {
        throw null;
    }

    public C0553d(C1545s sVar, C1530k0 k0Var) {
        super(InspectableValueKt.f4032a);
        this.f1294c = sVar;
        this.f1295d = null;
        this.f1296e = 1.0f;
        this.f1297f = k0Var;
    }

    /* renamed from: P */
    public final void mo3715P(C1741h hVar) {
        C1606z zVar;
        C1521g gVar;
        C1492b0 b0Var;
        if (this.f1297f == C1517e0.f3292a) {
            C1545s sVar = this.f1294c;
            if (sVar != null) {
                C8412e.m16785N(hVar, sVar.f3366a, 0, 0, 0.0f, 126);
            }
            C1533m mVar = this.f1295d;
            if (mVar != null) {
                C8412e.m16780A0(hVar, mVar, 0, 0, this.f1296e, (C8413f) null, 118);
            }
        } else {
            long b = hVar.mo6913b();
            C8347f fVar = this.f1298g;
            int i = C8347f.f18315d;
            boolean z = false;
            if ((fVar instanceof C8347f) && b == fVar.f18316a) {
                z = true;
            }
            if (!z || hVar.getLayoutDirection() != null) {
                zVar = this.f1297f.mo3864a(hVar.mo6913b(), hVar.getLayoutDirection(), hVar);
            } else {
                zVar = this.f1299h;
                C19383o.m32794d(zVar);
                C1741h hVar2 = hVar;
            }
            C1545s sVar2 = this.f1294c;
            if (sVar2 != null) {
                long j = sVar2.f3366a;
                C8415h hVar3 = C8415h.f18433a;
                C19383o.m32797g(zVar, "outline");
                C19383o.m32797g(hVar3, "style");
                if (zVar instanceof C1606z.C1608b) {
                    C8345d dVar = ((C1606z.C1608b) zVar).f3572a;
                    hVar.mo6903F0(j, C19421p.m32952q(dVar.f18301a, dVar.f18302b), C0114h.m319t(dVar.f18303c - dVar.f18301a, dVar.f18304d - dVar.f18302b), 1.0f, hVar3, (C1546t) null, 3);
                } else {
                    if (zVar instanceof C1606z.C1609c) {
                        C1606z.C1609c cVar = (C1606z.C1609c) zVar;
                        b0Var = cVar.f3574b;
                        if (b0Var == null) {
                            C8346e eVar = cVar.f3573a;
                            float b2 = C8341a.m16635b(eVar.f18312h);
                            hVar.mo6908L(j, C19421p.m32952q(eVar.f18305a, eVar.f18306b), C0114h.m319t(eVar.f18307c - eVar.f18305a, eVar.f18308d - eVar.f18306b), C0114h.m317s(b2, b2), hVar3, 1.0f, (C1546t) null, 3);
                        }
                    } else if (zVar instanceof C1606z.C1607a) {
                        b0Var = ((C1606z.C1607a) zVar).f3571a;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.mo6918z0(b0Var, j, 1.0f, hVar3, (C1546t) null, 3);
                }
            }
            C1533m mVar2 = this.f1295d;
            if (mVar2 != null) {
                float f = this.f1296e;
                C8415h hVar4 = C8415h.f18433a;
                C19383o.m32797g(zVar, "outline");
                C19383o.m32797g(hVar4, "style");
                if (zVar instanceof C1606z.C1608b) {
                    C8345d dVar2 = ((C1606z.C1608b) zVar).f3572a;
                    hVar.mo6906I0(mVar2, C19421p.m32952q(dVar2.f18301a, dVar2.f18302b), C0114h.m319t(dVar2.f18303c - dVar2.f18301a, dVar2.f18304d - dVar2.f18302b), f, hVar4, (C1546t) null, 3);
                } else {
                    if (zVar instanceof C1606z.C1609c) {
                        C1606z.C1609c cVar2 = (C1606z.C1609c) zVar;
                        C1521g gVar2 = cVar2.f3574b;
                        if (gVar2 != null) {
                            gVar = gVar2;
                        } else {
                            C8346e eVar2 = cVar2.f3573a;
                            float b3 = C8341a.m16635b(eVar2.f18312h);
                            hVar.mo6910M0(mVar2, C19421p.m32952q(eVar2.f18305a, eVar2.f18306b), C0114h.m319t(eVar2.f18307c - eVar2.f18305a, eVar2.f18308d - eVar2.f18306b), C0114h.m317s(b3, b3), f, hVar4, (C1546t) null, 3);
                        }
                    } else if (zVar instanceof C1606z.C1607a) {
                        gVar = ((C1606z.C1607a) zVar).f3571a;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar.mo6914c0(gVar, mVar2, f, hVar4, (C1546t) null, 3);
                }
            }
            this.f1299h = zVar;
            this.f1298g = new C8347f(hVar.mo6913b());
        }
        hVar.mo6911O0();
    }

    public final boolean equals(Object obj) {
        C0553d dVar = obj instanceof C0553d ? (C0553d) obj : null;
        if (dVar == null || !C19383o.m32792b(this.f1294c, dVar.f1294c) || !C19383o.m32792b(this.f1295d, dVar.f1295d)) {
            return false;
        }
        return ((this.f1296e > dVar.f1296e ? 1 : (this.f1296e == dVar.f1296e ? 0 : -1)) == 0) && C19383o.m32792b(this.f1297f, dVar.f1297f);
    }

    public final int hashCode() {
        C1545s sVar = this.f1294c;
        int i = 0;
        int a = (sVar != null ? C19356i.m32678a(sVar.f3366a) : 0) * 31;
        C1533m mVar = this.f1295d;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return this.f1297f.hashCode() + C0023f.m104c(this.f1296e, (a + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Background(color=");
        h.append(this.f1294c);
        h.append(", brush=");
        h.append(this.f1295d);
        h.append(", alpha = ");
        h.append(this.f1296e);
        h.append(", shape=");
        h.append(this.f1297f);
        h.append(')');
        return h.toString();
    }
}
