package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.y0 */
public final class C0465y0<V extends C0432j> implements C0447q0<V> {

    /* renamed from: a */
    public final int f1196a;

    /* renamed from: b */
    public final int f1197b;

    /* renamed from: c */
    public final C0448r f1198c;

    /* renamed from: d */
    public final C0452s0<V> f1199d;

    public C0465y0(int i, int i2, C0448r rVar) {
        C19383o.m32797g(rVar, "easing");
        this.f1196a = i;
        this.f1197b = i2;
        this.f1198c = rVar;
        this.f1199d = new C0452s0<>((C0456u) new C0462x(i, i2, rVar));
    }

    /* renamed from: c */
    public final int mo3526c() {
        return this.f1197b;
    }

    /* renamed from: e */
    public final int mo3527e() {
        return this.f1196a;
    }

    /* renamed from: f */
    public final V mo3520f(long j, V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return this.f1199d.mo3520f(j, v, v2, v3);
    }

    /* renamed from: g */
    public final V mo3521g(long j, V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return this.f1199d.mo3521g(j, v, v2, v3);
    }
}
