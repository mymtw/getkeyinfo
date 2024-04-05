package androidx.compose.animation.core;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.animation.core.x */
public final class C0462x implements C0456u {

    /* renamed from: a */
    public final int f1192a;

    /* renamed from: b */
    public final int f1193b;

    /* renamed from: c */
    public final C0448r f1194c;

    public C0462x(int i, int i2, C0448r rVar) {
        C19383o.m32797g(rVar, "easing");
        this.f1192a = i;
        this.f1193b = i2;
        this.f1194c = rVar;
    }

    /* renamed from: c */
    public final float mo3531c(long j, float f, float f2, float f3) {
        long N = C19388s.m32835N((j / 1000000) - ((long) this.f1193b), (long) this.f1192a);
        int i = this.f1192a;
        float a = this.f1194c.mo3514a(C19388s.m32831L(i == 0 ? 1.0f : ((float) N) / ((float) i), 0.0f, 1.0f));
        C0437l0 l0Var = VectorConvertersKt.f1076a;
        return (f2 * a) + ((((float) 1) - a) * f);
    }

    /* renamed from: d */
    public final float mo3532d(long j, float f, float f2, float f3) {
        long N = C19388s.m32835N((j / 1000000) - ((long) this.f1193b), (long) this.f1192a);
        int i = (N > 0 ? 1 : (N == 0 ? 0 : -1));
        if (i < 0) {
            return 0.0f;
        }
        if (i == 0) {
            return f3;
        }
        return (mo3531c(N * 1000000, f, f2, f3) - mo3531c((N - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    /* renamed from: e */
    public final long mo3533e(float f, float f2, float f3) {
        return ((long) (this.f1193b + this.f1192a)) * 1000000;
    }
}
