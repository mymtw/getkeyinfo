package androidx.compose.animation.core;

import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.u */
public interface C0456u extends C0422e<Float> {
    /* renamed from: b */
    float mo3530b(float f, float f2, float f3) {
        return mo3532d(mo3533e(f, f2, f3), f, f2, f3);
    }

    /* renamed from: c */
    float mo3531c(long j, float f, float f2, float f3);

    /* renamed from: d */
    float mo3532d(long j, float f, float f2, float f3);

    /* renamed from: e */
    long mo3533e(float f, float f2, float f3);

    /* renamed from: a */
    <V extends C0432j> C0452s0<V> m1198a(C0435k0<Float, V> k0Var) {
        C19383o.m32797g(k0Var, "converter");
        return new C0452s0<>(this);
    }
}
