package androidx.compose.p015ui.window;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7287g;
import p174m0.C7289h;
import p174m0.C7290i;

/* renamed from: androidx.compose.ui.window.a */
public final class C2088a implements C2092e {

    /* renamed from: a */
    public final C1428a f4723a;

    /* renamed from: b */
    public final long f4724b;

    public C2088a(C1428a aVar, long j) {
        this.f4723a = aVar;
        this.f4724b = j;
    }

    /* renamed from: a */
    public final long mo4694a(C7289h hVar, long j, LayoutDirection layoutDirection, long j2) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        long o = C19421p.m32949o(0, 0);
        long a = this.f4723a.mo6133a(0, C0761x.m1707a(hVar.f16169c - hVar.f16167a, hVar.f16170d - hVar.f16168b), layoutDirection);
        long a2 = this.f4723a.mo6133a(0, C0761x.m1707a((int) (j2 >> 32), C7290i.m13995b(j2)), layoutDirection);
        long o2 = C19421p.m32949o(hVar.f16167a, hVar.f16168b);
        long o3 = C19421p.m32949o(((int) (o >> 32)) + ((int) (o2 >> 32)), C7287g.m13992b(o2) + C7287g.m13992b(o));
        long o4 = C19421p.m32949o(((int) (o3 >> 32)) + ((int) (a >> 32)), C7287g.m13992b(a) + C7287g.m13992b(o3));
        long o5 = C19421p.m32949o((int) (a2 >> 32), C7287g.m13992b(a2));
        long o6 = C19421p.m32949o(((int) (o4 >> 32)) - ((int) (o5 >> 32)), C7287g.m13992b(o4) - C7287g.m13992b(o5));
        long j3 = this.f4724b;
        long o7 = C19421p.m32949o(((int) (j3 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), C7287g.m13992b(j3));
        return C19421p.m32949o(((int) (o6 >> 32)) + ((int) (o7 >> 32)), C7287g.m13992b(o7) + C7287g.m13992b(o6));
    }
}
