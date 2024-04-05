package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.u0 */
public final class C0457u0<V extends C0432j> implements C0439m0<V> {

    /* renamed from: a */
    public final C0447q0<V> f1180a;

    /* renamed from: b */
    public final RepeatMode f1181b;

    /* renamed from: c */
    public final long f1182c;

    /* renamed from: d */
    public final long f1183d;

    public C0457u0(C0447q0 q0Var, RepeatMode repeatMode, long j) {
        this.f1180a = q0Var;
        this.f1181b = repeatMode;
        this.f1182c = ((long) (q0Var.mo3527e() + q0Var.mo3526c())) * 1000000;
        this.f1183d = j * 1000000;
    }

    /* renamed from: a */
    public final boolean mo3517a() {
        return true;
    }

    /* renamed from: b */
    public final long mo3518b(V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        return Long.MAX_VALUE;
    }

    /* renamed from: f */
    public final V mo3520f(long j, V v, V v2, V v3) {
        V v4;
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        V v5 = v3;
        C19383o.m32797g(v5, "initialVelocity");
        C0447q0<V> q0Var = this.f1180a;
        long h = mo3534h(j);
        long j2 = this.f1183d;
        long j3 = this.f1182c;
        if (j + j2 > j3) {
            v4 = mo3520f(j3 - j2, v, v3, v2);
        } else {
            v4 = v5;
        }
        return q0Var.mo3520f(h, v, v2, v4);
    }

    /* renamed from: g */
    public final V mo3521g(long j, V v, V v2, V v3) {
        V v4;
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        V v5 = v3;
        C19383o.m32797g(v5, "initialVelocity");
        C0447q0<V> q0Var = this.f1180a;
        long h = mo3534h(j);
        long j2 = this.f1183d;
        long j3 = this.f1182c;
        if (j + j2 > j3) {
            v4 = mo3520f(j3 - j2, v, v3, v2);
        } else {
            v4 = v5;
        }
        return q0Var.mo3521g(h, v, v2, v4);
    }

    /* renamed from: h */
    public final long mo3534h(long j) {
        long j2 = this.f1183d;
        if (j + j2 <= 0) {
            return 0;
        }
        long j3 = j + j2;
        long j4 = this.f1182c;
        long j5 = j3 / j4;
        return (this.f1181b == RepeatMode.Restart || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }
}
