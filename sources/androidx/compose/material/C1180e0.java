package androidx.compose.material;

import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p504ai.C13983i;

/* renamed from: androidx.compose.material.e0 */
public final class C1180e0 implements C1228r1 {

    /* renamed from: a */
    public final long f2421a;

    /* renamed from: b */
    public final long f2422b;

    /* renamed from: c */
    public final long f2423c;

    /* renamed from: d */
    public final long f2424d;

    /* renamed from: e */
    public final long f2425e;

    /* renamed from: f */
    public final long f2426f;

    /* renamed from: g */
    public final long f2427g;

    /* renamed from: h */
    public final long f2428h;

    /* renamed from: i */
    public final long f2429i;

    /* renamed from: j */
    public final long f2430j;

    public C1180e0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f2421a = j;
        this.f2422b = j2;
        this.f2423c = j3;
        this.f2424d = j4;
        this.f2425e = j5;
        this.f2426f = j6;
        this.f2427g = j7;
        this.f2428h = j8;
        this.f2429i = j9;
        this.f2430j = j10;
    }

    /* renamed from: a */
    public final C1338j0 mo5245a(boolean z, boolean z2, C1302d dVar) {
        dVar.mo5465u(1575395620);
        return C0388a.m1047b(z ? z2 ? this.f2423c : this.f2424d : z2 ? this.f2425e : this.f2426f, dVar);
    }

    /* renamed from: b */
    public final C1338j0 mo5246b(boolean z, C1302d dVar) {
        dVar.mo5465u(-1733795637);
        return C0388a.m1047b(z ? this.f2421a : this.f2422b, dVar);
    }

    /* renamed from: c */
    public final C1338j0 mo5247c(boolean z, boolean z2, C1302d dVar) {
        dVar.mo5465u(-1491563694);
        return C0388a.m1047b(z ? z2 ? this.f2427g : this.f2428h : z2 ? this.f2429i : this.f2430j, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(C1180e0.class), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1180e0 e0Var = (C1180e0) obj;
        return C1545s.m3357c(this.f2421a, e0Var.f2421a) && C1545s.m3357c(this.f2422b, e0Var.f2422b) && C1545s.m3357c(this.f2423c, e0Var.f2423c) && C1545s.m3357c(this.f2424d, e0Var.f2424d) && C1545s.m3357c(this.f2425e, e0Var.f2425e) && C1545s.m3357c(this.f2426f, e0Var.f2426f) && C1545s.m3357c(this.f2427g, e0Var.f2427g) && C1545s.m3357c(this.f2428h, e0Var.f2428h) && C1545s.m3357c(this.f2429i, e0Var.f2429i) && C1545s.m3357c(this.f2430j, e0Var.f2430j);
    }

    public final int hashCode() {
        long j = this.f2421a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(this.f2430j) + C13983i.m21487f(this.f2429i, C13983i.m21487f(this.f2428h, C13983i.m21487f(this.f2427g, C13983i.m21487f(this.f2426f, C13983i.m21487f(this.f2425e, C13983i.m21487f(this.f2424d, C13983i.m21487f(this.f2423c, C13983i.m21487f(this.f2422b, C19356i.m32678a(j) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
