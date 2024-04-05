package androidx.compose.material;

import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p504ai.C13983i;

/* renamed from: androidx.compose.material.z */
public final class C1272z implements C1249s {

    /* renamed from: a */
    public final long f2670a;

    /* renamed from: b */
    public final long f2671b;

    /* renamed from: c */
    public final long f2672c;

    /* renamed from: d */
    public final long f2673d;

    /* renamed from: e */
    public final long f2674e;

    /* renamed from: f */
    public final long f2675f;

    public C1272z(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f2670a = j;
        this.f2671b = j2;
        this.f2672c = j3;
        this.f2673d = j4;
        this.f2674e = j5;
        this.f2675f = j6;
    }

    /* renamed from: a */
    public final C1338j0 mo5340a(boolean z, C1302d dVar) {
        dVar.mo5465u(483145880);
        return C0388a.m1047b(z ? this.f2671b : this.f2674e, dVar);
    }

    /* renamed from: b */
    public final C1338j0 mo5341b(boolean z, C1302d dVar) {
        dVar.mo5465u(-1593588247);
        return C0388a.m1047b(z ? this.f2670a : this.f2673d, dVar);
    }

    /* renamed from: c */
    public final C1338j0 mo5342c(boolean z, C1302d dVar) {
        dVar.mo5465u(1955749013);
        return C0388a.m1047b(z ? this.f2672c : this.f2675f, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(C1272z.class), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1272z zVar = (C1272z) obj;
        return C1545s.m3357c(this.f2670a, zVar.f2670a) && C1545s.m3357c(this.f2671b, zVar.f2671b) && C1545s.m3357c(this.f2672c, zVar.f2672c) && C1545s.m3357c(this.f2673d, zVar.f2673d) && C1545s.m3357c(this.f2674e, zVar.f2674e) && C1545s.m3357c(this.f2675f, zVar.f2675f);
    }

    public final int hashCode() {
        long j = this.f2670a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(this.f2675f) + C13983i.m21487f(this.f2674e, C13983i.m21487f(this.f2673d, C13983i.m21487f(this.f2672c, C13983i.m21487f(this.f2671b, C19356i.m32678a(j) * 31, 31), 31), 31), 31);
    }
}
