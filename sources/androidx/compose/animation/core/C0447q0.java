package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.q0 */
public interface C0447q0<V extends C0432j> extends C0449r0<V> {
    /* renamed from: b */
    long mo3518b(V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return ((long) (mo3527e() + mo3526c())) * 1000000;
    }

    /* renamed from: c */
    int mo3526c();

    /* renamed from: e */
    int mo3527e();
}
