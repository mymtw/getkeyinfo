package androidx.compose.animation.core;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.f0 */
public final class C0425f0<T> implements C0446q<T> {

    /* renamed from: a */
    public final int f1115a;

    public C0425f0(int i) {
        this.f1115a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0425f0) && ((C0425f0) obj).f1115a == this.f1115a;
    }

    public final int hashCode() {
        return this.f1115a;
    }

    /* renamed from: a */
    public final <V extends C0432j> C0447q0<V> m1129a(C0435k0<T, V> k0Var) {
        C19383o.m32797g(k0Var, "converter");
        return new C0461w0(this.f1115a);
    }

    public C0425f0() {
        this(0);
    }
}
