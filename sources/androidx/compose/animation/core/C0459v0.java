package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import androidx.compose.animation.core.C0450s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p568fn.C17782b;

/* renamed from: androidx.compose.animation.core.v0 */
public final class C0459v0<V extends C0432j> implements C0447q0<V> {

    /* renamed from: a */
    public final Map<Integer, Pair<V, C0448r>> f1184a;

    /* renamed from: b */
    public final int f1185b;

    /* renamed from: c */
    public final int f1186c = 0;

    /* renamed from: d */
    public V f1187d;

    /* renamed from: e */
    public V f1188e;

    public C0459v0(LinkedHashMap linkedHashMap, int i) {
        this.f1184a = linkedHashMap;
        this.f1185b = i;
    }

    /* renamed from: c */
    public final int mo3526c() {
        return this.f1186c;
    }

    /* renamed from: e */
    public final int mo3527e() {
        return this.f1185b;
    }

    /* renamed from: f */
    public final V mo3520f(long j, V v, V v2, V v3) {
        V v4 = v3;
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v4, "initialVelocity");
        long N = C19388s.m32835N((j / 1000000) - ((long) mo3526c()), (long) mo3527e());
        if (N <= 0) {
            return v4;
        }
        V v5 = v;
        V v6 = v2;
        V v7 = v3;
        C0432j a0 = C17782b.m29861a0(this, N - 1, v5, v6, v7);
        C0432j a02 = C17782b.m29861a0(this, N, v5, v6, v7);
        if (this.f1187d == null) {
            this.f1187d = v.mo3490c();
            this.f1188e = v.mo3490c();
        }
        int i = 0;
        int b = a0.mo3489b();
        while (i < b) {
            V v8 = this.f1188e;
            if (v8 != null) {
                v8.mo3492e((a0.mo3488a(i) - a02.mo3488a(i)) * 1000.0f, i);
                i++;
            } else {
                C19383o.m32805o("velocityVector");
                throw null;
            }
        }
        V v9 = this.f1188e;
        if (v9 != null) {
            return v9;
        }
        C19383o.m32805o("velocityVector");
        throw null;
    }

    /* renamed from: g */
    public final V mo3521g(long j, V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        int N = (int) C19388s.m32835N((j / 1000000) - ((long) mo3526c()), (long) mo3527e());
        if (this.f1184a.containsKey(Integer.valueOf(N))) {
            return (C0432j) ((Pair) C19294b0.m32560q0(Integer.valueOf(N), this.f1184a)).getFirst();
        }
        int i = this.f1185b;
        if (N >= i) {
            return v2;
        }
        if (N <= 0) {
            return v;
        }
        C0448r rVar = C0450s.C0451a.f1169a;
        int i2 = 0;
        V v4 = v;
        int i3 = 0;
        for (Map.Entry next : this.f1184a.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            Pair pair = (Pair) next.getValue();
            if (N > intValue && intValue >= i3) {
                v4 = (C0432j) pair.getFirst();
                rVar = (C0448r) pair.getSecond();
                i3 = intValue;
            } else if (N < intValue && intValue <= i) {
                v2 = (C0432j) pair.getFirst();
                i = intValue;
            }
        }
        float a = rVar.mo3514a(((float) (N - i3)) / ((float) (i - i3)));
        if (this.f1187d == null) {
            this.f1187d = v.mo3490c();
            this.f1188e = v.mo3490c();
        }
        int b = v4.mo3489b();
        while (i2 < b) {
            V v5 = this.f1187d;
            if (v5 != null) {
                float a2 = v4.mo3488a(i2);
                float a3 = v2.mo3488a(i2);
                C0437l0 l0Var = VectorConvertersKt.f1076a;
                v5.mo3492e((a3 * a) + ((((float) 1) - a) * a2), i2);
                i2++;
            } else {
                C19383o.m32805o("valueVector");
                throw null;
            }
        }
        V v6 = this.f1187d;
        if (v6 != null) {
            return v6;
        }
        C19383o.m32805o("valueVector");
        throw null;
    }
}
