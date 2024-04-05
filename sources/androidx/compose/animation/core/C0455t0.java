package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.t0 */
public final class C0455t0<V extends C0432j> implements C0445p0<V> {

    /* renamed from: a */
    public final C0458v f1175a;

    /* renamed from: b */
    public V f1176b;

    /* renamed from: c */
    public V f1177c;

    /* renamed from: d */
    public V f1178d;

    /* renamed from: e */
    public final float f1179e = 0.0f;

    public C0455t0(C0458v vVar) {
        C19383o.m32797g(vVar, "floatDecaySpec");
        this.f1175a = vVar;
        vVar.mo3535a();
    }

    /* renamed from: a */
    public final float mo3523a() {
        return this.f1179e;
    }

    /* renamed from: b */
    public final V mo3524b(long j, V v, V v2) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "initialVelocity");
        if (this.f1177c == null) {
            this.f1177c = v.mo3490c();
        }
        int i = 0;
        V v3 = this.f1177c;
        if (v3 != null) {
            int b = v3.mo3489b();
            while (i < b) {
                V v4 = this.f1177c;
                if (v4 != null) {
                    C0458v vVar = this.f1175a;
                    v.mo3488a(i);
                    v4.mo3492e(vVar.mo3539e(j, v2.mo3488a(i)), i);
                    i++;
                } else {
                    C19383o.m32805o("velocityVector");
                    throw null;
                }
            }
            V v5 = this.f1177c;
            if (v5 != null) {
                return v5;
            }
            C19383o.m32805o("velocityVector");
            throw null;
        }
        C19383o.m32805o("velocityVector");
        throw null;
    }

    /* renamed from: c */
    public final V mo3525c(long j, V v, V v2) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "initialVelocity");
        if (this.f1176b == null) {
            this.f1176b = v.mo3490c();
        }
        int i = 0;
        V v3 = this.f1176b;
        if (v3 != null) {
            int b = v3.mo3489b();
            while (i < b) {
                V v4 = this.f1176b;
                if (v4 != null) {
                    v4.mo3492e(this.f1175a.mo3536b(v.mo3488a(i), j, v2.mo3488a(i)), i);
                    i++;
                } else {
                    C19383o.m32805o("valueVector");
                    throw null;
                }
            }
            V v5 = this.f1176b;
            if (v5 != null) {
                return v5;
            }
            C19383o.m32805o("valueVector");
            throw null;
        }
        C19383o.m32805o("valueVector");
        throw null;
    }

    /* renamed from: d */
    public final long mo3528d(V v, V v2) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "initialVelocity");
        if (this.f1177c == null) {
            this.f1177c = v.mo3490c();
        }
        V v3 = this.f1177c;
        if (v3 != null) {
            int b = v3.mo3489b();
            long j = 0;
            for (int i = 0; i < b; i++) {
                C0458v vVar = this.f1175a;
                v.mo3488a(i);
                j = Math.max(j, vVar.mo3537c(v2.mo3488a(i)));
            }
            return j;
        }
        C19383o.m32805o("velocityVector");
        throw null;
    }

    /* renamed from: e */
    public final V mo3529e(V v, V v2) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "initialVelocity");
        if (this.f1178d == null) {
            this.f1178d = v.mo3490c();
        }
        int i = 0;
        V v3 = this.f1178d;
        if (v3 != null) {
            int b = v3.mo3489b();
            while (i < b) {
                V v4 = this.f1178d;
                if (v4 != null) {
                    v4.mo3492e(this.f1175a.mo3538d(v.mo3488a(i), v2.mo3488a(i)), i);
                    i++;
                } else {
                    C19383o.m32805o("targetVector");
                    throw null;
                }
            }
            V v5 = this.f1178d;
            if (v5 != null) {
                return v5;
            }
            C19383o.m32805o("targetVector");
            throw null;
        }
        C19383o.m32805o("targetVector");
        throw null;
    }
}
