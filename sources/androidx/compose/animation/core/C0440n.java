package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import androidx.compose.p015ui.text.input.C1993m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.animation.core.n */
public final class C0440n<T, V extends C0432j> implements C0413b<T, V> {

    /* renamed from: a */
    public final C0445p0<V> f1156a;

    /* renamed from: b */
    public final C0435k0<T, V> f1157b;

    /* renamed from: c */
    public final T f1158c;

    /* renamed from: d */
    public final V f1159d;

    /* renamed from: e */
    public final V f1160e;

    /* renamed from: f */
    public final V f1161f;

    /* renamed from: g */
    public final T f1162g;

    /* renamed from: h */
    public final long f1163h;

    public C0440n(C0442o<T> oVar, C0435k0<T, V> k0Var, T t, V v) {
        C19383o.m32797g(oVar, "animationSpec");
        C19383o.m32797g(k0Var, "typeConverter");
        C19383o.m32797g(v, "initialVelocityVector");
        C0455t0 a = oVar.mo3522a(k0Var);
        C19383o.m32797g(a, "animationSpec");
        this.f1156a = a;
        this.f1157b = k0Var;
        this.f1158c = t;
        V v2 = (C0432j) k0Var.mo3509a().invoke(t);
        this.f1159d = v2;
        this.f1160e = C1993m.m4377w(v);
        this.f1162g = k0Var.mo3510b().invoke(a.mo3529e(v2, v));
        long d = a.mo3528d(v2, v);
        this.f1163h = d;
        V w = C1993m.m4377w(a.mo3524b(d, v2, v));
        this.f1161f = w;
        int b = w.mo3489b();
        for (int i = 0; i < b; i++) {
            V v3 = this.f1161f;
            v3.mo3492e(C19388s.m32831L(v3.mo3488a(i), -this.f1156a.mo3523a(), this.f1156a.mo3523a()), i);
        }
    }

    /* renamed from: a */
    public final boolean mo3463a() {
        return false;
    }

    /* renamed from: b */
    public final V mo3464b(long j) {
        return !mo3465c(j) ? this.f1156a.mo3524b(j, this.f1159d, this.f1160e) : this.f1161f;
    }

    /* renamed from: d */
    public final long mo3466d() {
        return this.f1163h;
    }

    /* renamed from: e */
    public final C0435k0<T, V> mo3467e() {
        return this.f1157b;
    }

    /* renamed from: f */
    public final T mo3468f(long j) {
        return !mo3465c(j) ? this.f1157b.mo3510b().invoke(this.f1156a.mo3525c(j, this.f1159d, this.f1160e)) : this.f1162g;
    }

    /* renamed from: g */
    public final T mo3469g() {
        return this.f1162g;
    }
}
