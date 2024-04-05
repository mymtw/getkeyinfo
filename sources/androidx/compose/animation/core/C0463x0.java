package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.x0 */
public final class C0463x0<V extends C0432j> implements C0449r0<V> {

    /* renamed from: a */
    public final /* synthetic */ C0452s0<V> f1195a;

    public C0463x0(float f, float f2, V v) {
        this.f1195a = new C0452s0<>(v != null ? new C0441n0(f, f2, v) : new C0443o0(f, f2));
    }

    /* renamed from: a */
    public final boolean mo3517a() {
        this.f1195a.getClass();
        return false;
    }

    /* renamed from: b */
    public final long mo3518b(V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return this.f1195a.mo3518b(v, v2, v3);
    }

    /* renamed from: d */
    public final V mo3519d(V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return this.f1195a.mo3519d(v, v2, v3);
    }

    /* renamed from: f */
    public final V mo3520f(long j, V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return this.f1195a.mo3520f(j, v, v2, v3);
    }

    /* renamed from: g */
    public final V mo3521g(long j, V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return this.f1195a.mo3521g(j, v, v2, v3);
    }
}
