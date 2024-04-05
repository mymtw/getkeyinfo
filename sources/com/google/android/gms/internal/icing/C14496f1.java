package com.google.android.gms.internal.icing;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.icing.f1 */
public final class C14496f1<T> implements C14524m1<T> {

    /* renamed from: a */
    public final C14480b1 f32636a;

    /* renamed from: b */
    public final C14561x1<?, ?> f32637b;

    /* renamed from: c */
    public final boolean f32638c;

    /* renamed from: d */
    public final C14553v<?> f32639d;

    public C14496f1(C14561x1<?, ?> x1Var, C14553v<?> vVar, C14480b1 b1Var) {
        this.f32637b = x1Var;
        this.f32638c = vVar.mo49945a(b1Var);
        this.f32639d = vVar;
        this.f32636a = b1Var;
    }

    /* renamed from: a */
    public final boolean mo49762a(T t) {
        this.f32639d.mo49946b(t);
        throw null;
    }

    /* renamed from: b */
    public final int mo49763b(T t) {
        this.f32637b.mo49950b(t).getClass();
        if (!this.f32638c) {
            return 506991;
        }
        this.f32639d.mo49946b(t);
        throw null;
    }

    /* renamed from: c */
    public final int mo49764c(T t) {
        C14561x1<?, ?> x1Var = this.f32637b;
        int e = x1Var.mo49953e(x1Var.mo49950b(t));
        if (!this.f32638c) {
            return e;
        }
        this.f32639d.mo49946b(t);
        throw null;
    }

    /* renamed from: d */
    public final void mo49765d(T t, C14544s sVar) throws IOException {
        this.f32639d.mo49946b(t);
        throw null;
    }

    /* renamed from: e */
    public final void mo49766e(T t, T t2) {
        C14561x1<?, ?> x1Var = this.f32637b;
        Class<?> cls = C14528n1.f32673a;
        x1Var.mo49949a(t, x1Var.mo49952d(x1Var.mo49950b(t), x1Var.mo49950b(t2)));
        if (this.f32638c) {
            this.f32639d.mo49946b(t2);
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo49767f(C14491e0 e0Var) {
        this.f32637b.mo49951c(e0Var);
        this.f32639d.mo49947c(e0Var);
    }

    /* renamed from: g */
    public final boolean mo49768g(T t, T t2) {
        if (!this.f32637b.mo49950b(t).equals(this.f32637b.mo49950b(t2))) {
            return false;
        }
        if (!this.f32638c) {
            return true;
        }
        this.f32639d.mo49946b(t);
        this.f32639d.mo49946b(t2);
        throw null;
    }
}
