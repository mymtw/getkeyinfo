package androidx.compose.material;

import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p504ai.C13983i;

/* renamed from: androidx.compose.material.d0 */
public final class C1176d0 implements C1222p1 {

    /* renamed from: a */
    public final long f2391a;

    /* renamed from: b */
    public final long f2392b;

    /* renamed from: c */
    public final long f2393c;

    /* renamed from: d */
    public final long f2394d;

    /* renamed from: e */
    public final long f2395e;

    /* renamed from: f */
    public final long f2396f;

    /* renamed from: g */
    public final long f2397g;

    /* renamed from: h */
    public final long f2398h;

    /* renamed from: i */
    public final long f2399i;

    public C1176d0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f2391a = j;
        this.f2392b = j2;
        this.f2393c = j3;
        this.f2394d = j4;
        this.f2395e = j5;
        this.f2396f = j6;
        this.f2397g = j7;
        this.f2398h = j8;
        this.f2399i = j9;
    }

    /* renamed from: a */
    public final C1338j0 mo5237a(boolean z, boolean z2, C1302d dVar) {
        dVar.mo5465u(189838188);
        return C0388a.m1047b(!z ? this.f2396f : !z2 ? this.f2393c : this.f2399i, dVar);
    }

    /* renamed from: b */
    public final C1338j0 mo5238b(boolean z, boolean z2, C1302d dVar) {
        dVar.mo5465u(-403836585);
        return C0388a.m1047b(!z ? this.f2394d : !z2 ? this.f2391a : this.f2397g, dVar);
    }

    /* renamed from: c */
    public final C1338j0 mo5239c(boolean z, boolean z2, C1302d dVar) {
        dVar.mo5465u(2025240134);
        return C0388a.m1047b(!z ? this.f2395e : !z2 ? this.f2392b : this.f2398h, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(C1176d0.class), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1176d0 d0Var = (C1176d0) obj;
        return C1545s.m3357c(this.f2391a, d0Var.f2391a) && C1545s.m3357c(this.f2392b, d0Var.f2392b) && C1545s.m3357c(this.f2393c, d0Var.f2393c) && C1545s.m3357c(this.f2394d, d0Var.f2394d) && C1545s.m3357c(this.f2395e, d0Var.f2395e) && C1545s.m3357c(this.f2396f, d0Var.f2396f) && C1545s.m3357c(this.f2397g, d0Var.f2397g) && C1545s.m3357c(this.f2398h, d0Var.f2398h) && C1545s.m3357c(this.f2399i, d0Var.f2399i);
    }

    public final int hashCode() {
        long j = this.f2391a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(this.f2399i) + C13983i.m21487f(this.f2398h, C13983i.m21487f(this.f2397g, C13983i.m21487f(this.f2396f, C13983i.m21487f(this.f2395e, C13983i.m21487f(this.f2394d, C13983i.m21487f(this.f2393c, C13983i.m21487f(this.f2392b, C19356i.m32678a(j) * 31, 31), 31), 31), 31), 31), 31), 31);
    }
}
