package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
public final class C14844v6<T> implements C14602c7<T> {

    /* renamed from: a */
    public final C14796r6 f33134a;

    /* renamed from: b */
    public final C14745n7<?, ?> f33135b;

    /* renamed from: c */
    public final boolean f33136c;

    /* renamed from: d */
    public final C14678i5<?> f33137d;

    public C14844v6(C14745n7<?, ?> n7Var, C14678i5<?> i5Var, C14796r6 r6Var) {
        this.f33135b = n7Var;
        this.f33136c = i5Var.mo50591c(r6Var);
        this.f33137d = i5Var;
        this.f33134a = r6Var;
    }

    /* renamed from: a */
    public final void mo50435a(T t) {
        this.f33135b.mo50742g(t);
        this.f33137d.mo50590b(t);
    }

    /* renamed from: b */
    public final int mo50436b(T t) {
        int hashCode = this.f33135b.mo50738c(t).hashCode();
        if (!this.f33136c) {
            return hashCode;
        }
        this.f33137d.mo50589a(t);
        throw null;
    }

    /* renamed from: c */
    public final void mo50437c(T t, byte[] bArr, int i, int i2, C14854w4 w4Var) throws IOException {
        C14819t5 t5Var = (C14819t5) t;
        if (t5Var.zzc == C14758o7.f33020f) {
            t5Var.zzc = C14758o7.m23822b();
        }
        C14795r5 r5Var = (C14795r5) t;
        throw null;
    }

    /* renamed from: d */
    public final int mo50438d(T t) {
        C14745n7<?, ?> n7Var = this.f33135b;
        int b = n7Var.mo50737b(n7Var.mo50738c(t));
        if (!this.f33136c) {
            return b;
        }
        this.f33137d.mo50589a(t);
        throw null;
    }

    /* renamed from: e */
    public final void mo50439e(T t, T t2) {
        C14745n7<?, ?> n7Var = this.f33135b;
        Class<?> cls = C14615d7.f32807a;
        n7Var.mo50743h(t, n7Var.mo50739d(n7Var.mo50738c(t), n7Var.mo50738c(t2)));
        if (this.f33136c) {
            this.f33137d.mo50589a(t2);
            throw null;
        }
    }

    /* renamed from: f */
    public final boolean mo50440f(T t, T t2) {
        if (!this.f33135b.mo50738c(t).equals(this.f33135b.mo50738c(t2))) {
            return false;
        }
        if (!this.f33136c) {
            return true;
        }
        this.f33137d.mo50589a(t);
        this.f33137d.mo50589a(t2);
        throw null;
    }

    /* renamed from: g */
    public final void mo50441g(T t, C14626e5 e5Var) throws IOException {
        this.f33137d.mo50589a(t);
        throw null;
    }

    /* renamed from: h */
    public final boolean mo50442h(T t) {
        this.f33137d.mo50589a(t);
        throw null;
    }

    public final T zze() {
        return this.f33134a.mo50828f().mo50808i();
    }
}
