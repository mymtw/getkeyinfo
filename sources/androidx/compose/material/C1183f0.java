package androidx.compose.material;

import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p504ai.C13983i;

/* renamed from: androidx.compose.material.f0 */
public final class C1183f0 implements C1267x1 {

    /* renamed from: a */
    public final long f2434a;

    /* renamed from: b */
    public final long f2435b;

    /* renamed from: c */
    public final long f2436c;

    /* renamed from: d */
    public final long f2437d;

    /* renamed from: e */
    public final long f2438e;

    /* renamed from: f */
    public final long f2439f;

    /* renamed from: g */
    public final long f2440g;

    /* renamed from: h */
    public final long f2441h;

    public C1183f0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f2434a = j;
        this.f2435b = j2;
        this.f2436c = j3;
        this.f2437d = j4;
        this.f2438e = j5;
        this.f2439f = j6;
        this.f2440g = j7;
        this.f2441h = j8;
    }

    /* renamed from: a */
    public final C1338j0 mo5253a(boolean z, boolean z2, C1302d dVar) {
        dVar.mo5465u(-1176343362);
        return C0388a.m1047b(z ? z2 ? this.f2435b : this.f2437d : z2 ? this.f2439f : this.f2441h, dVar);
    }

    /* renamed from: b */
    public final C1338j0 mo5254b(boolean z, boolean z2, C1302d dVar) {
        dVar.mo5465u(-66424183);
        return C0388a.m1047b(z ? z2 ? this.f2434a : this.f2436c : z2 ? this.f2438e : this.f2440g, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(C1183f0.class), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1183f0 f0Var = (C1183f0) obj;
        return C1545s.m3357c(this.f2434a, f0Var.f2434a) && C1545s.m3357c(this.f2435b, f0Var.f2435b) && C1545s.m3357c(this.f2436c, f0Var.f2436c) && C1545s.m3357c(this.f2437d, f0Var.f2437d) && C1545s.m3357c(this.f2438e, f0Var.f2438e) && C1545s.m3357c(this.f2439f, f0Var.f2439f) && C1545s.m3357c(this.f2440g, f0Var.f2440g) && C1545s.m3357c(this.f2441h, f0Var.f2441h);
    }

    public final int hashCode() {
        long j = this.f2434a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(this.f2441h) + C13983i.m21487f(this.f2440g, C13983i.m21487f(this.f2439f, C13983i.m21487f(this.f2438e, C13983i.m21487f(this.f2437d, C13983i.m21487f(this.f2436c, C13983i.m21487f(this.f2435b, C19356i.m32678a(j) * 31, 31), 31), 31), 31), 31), 31);
    }
}
