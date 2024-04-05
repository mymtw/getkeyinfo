package androidx.compose.material;

import androidx.compose.animation.C0483r;
import androidx.compose.animation.core.C0448r;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p504ai.C13983i;

/* renamed from: androidx.compose.material.c0 */
public final class C1172c0 implements C1204j1 {

    /* renamed from: a */
    public final long f2386a;

    /* renamed from: b */
    public final long f2387b;

    /* renamed from: c */
    public final long f2388c;

    public C1172c0(long j, long j2, long j3) {
        this.f2386a = j;
        this.f2387b = j2;
        this.f2388c = j3;
    }

    /* renamed from: a */
    public final C1342k1 mo5233a(boolean z, boolean z2, C1302d dVar) {
        C1342k1 k1Var;
        dVar.mo5465u(1243421834);
        long j = !z ? this.f2388c : !z2 ? this.f2387b : this.f2386a;
        if (z) {
            dVar.mo5465u(-1052799218);
            k1Var = C0483r.m1263a(j, C0761x.m1706Z0(100, 0, (C0448r) null, 6), dVar, 48);
            dVar.mo5406H();
        } else {
            dVar.mo5465u(-1052799113);
            k1Var = C0761x.m1664E0(new C1545s(j), dVar);
            dVar.mo5406H();
        }
        dVar.mo5406H();
        return k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(C1172c0.class), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1172c0 c0Var = (C1172c0) obj;
        return C1545s.m3357c(this.f2386a, c0Var.f2386a) && C1545s.m3357c(this.f2387b, c0Var.f2387b) && C1545s.m3357c(this.f2388c, c0Var.f2388c);
    }

    public final int hashCode() {
        long j = this.f2386a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(this.f2388c) + C13983i.m21487f(this.f2387b, C19356i.m32678a(j) * 31, 31);
    }
}
