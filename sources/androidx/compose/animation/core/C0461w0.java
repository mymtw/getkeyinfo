package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.w0 */
public final class C0461w0<V extends C0432j> implements C0447q0<V> {

    /* renamed from: a */
    public final int f1191a;

    public C0461w0(int i) {
        this.f1191a = i;
    }

    /* renamed from: c */
    public final int mo3526c() {
        return this.f1191a;
    }

    /* renamed from: e */
    public final int mo3527e() {
        return 0;
    }

    /* renamed from: f */
    public final V mo3520f(long j, V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return v3;
    }

    /* renamed from: g */
    public final V mo3521g(long j, V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return j < ((long) this.f1191a) * 1000000 ? v : v2;
    }
}
