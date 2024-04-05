package androidx.compose.animation.core;

import com.google.logging.type.LogSeverity;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.j0 */
public final class C0433j0<T> implements C0446q<T> {

    /* renamed from: a */
    public final int f1145a;

    /* renamed from: b */
    public final int f1146b;

    /* renamed from: c */
    public final C0448r f1147c;

    public C0433j0() {
        this(0, (C0448r) null, 7);
    }

    public C0433j0(int i, int i2, C0448r rVar) {
        C19383o.m32797g(rVar, "easing");
        this.f1145a = i;
        this.f1146b = i2;
        this.f1147c = rVar;
    }

    /* renamed from: a */
    public final C0439m0 mo3470a(C0435k0 k0Var) {
        C19383o.m32797g(k0Var, "converter");
        return new C0465y0(this.f1145a, this.f1146b, this.f1147c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0433j0)) {
            return false;
        }
        C0433j0 j0Var = (C0433j0) obj;
        return j0Var.f1145a == this.f1145a && j0Var.f1146b == this.f1146b && C19383o.m32792b(j0Var.f1147c, this.f1147c);
    }

    public final int hashCode() {
        return ((this.f1147c.hashCode() + (this.f1145a * 31)) * 31) + this.f1146b;
    }

    /* renamed from: a */
    public final C0447q0 m1159a(C0435k0 k0Var) {
        C19383o.m32797g(k0Var, "converter");
        return new C0465y0(this.f1145a, this.f1146b, this.f1147c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0433j0(int i, C0448r rVar, int i2) {
        this((i2 & 1) != 0 ? LogSeverity.NOTICE_VALUE : i, 0, (i2 & 4) != 0 ? C0450s.f1167a : rVar);
    }
}
