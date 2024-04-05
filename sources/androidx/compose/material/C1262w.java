package androidx.compose.material;

import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p504ai.C13983i;

/* renamed from: androidx.compose.material.w */
public final class C1262w implements C1214n {

    /* renamed from: a */
    public final long f2646a;

    /* renamed from: b */
    public final long f2647b;

    /* renamed from: c */
    public final long f2648c;

    /* renamed from: d */
    public final long f2649d;

    public C1262w(long j, long j2, long j3, long j4) {
        this.f2646a = j;
        this.f2647b = j2;
        this.f2648c = j3;
        this.f2649d = j4;
    }

    /* renamed from: a */
    public final C1338j0 mo5292a(boolean z, C1302d dVar) {
        dVar.mo5465u(-2133647540);
        return C0388a.m1047b(z ? this.f2647b : this.f2649d, dVar);
    }

    /* renamed from: b */
    public final C1338j0 mo5293b(boolean z, C1302d dVar) {
        dVar.mo5465u(-655254499);
        return C0388a.m1047b(z ? this.f2646a : this.f2648c, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(C1262w.class), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1262w wVar = (C1262w) obj;
        return C1545s.m3357c(this.f2646a, wVar.f2646a) && C1545s.m3357c(this.f2647b, wVar.f2647b) && C1545s.m3357c(this.f2648c, wVar.f2648c) && C1545s.m3357c(this.f2649d, wVar.f2649d);
    }

    public final int hashCode() {
        long j = this.f2646a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(this.f2649d) + C13983i.m21487f(this.f2648c, C13983i.m21487f(this.f2647b, C19356i.m32678a(j) * 31, 31), 31);
    }
}
