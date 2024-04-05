package androidx.compose.animation.core;

import androidx.compose.animation.core.C0432j;
import java.util.Iterator;
import kotlin.collections.C19332y;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.animation.core.s0 */
public final class C0452s0<V extends C0432j> implements C0449r0<V> {

    /* renamed from: a */
    public final C0434k f1170a;

    /* renamed from: b */
    public V f1171b;

    /* renamed from: c */
    public V f1172c;

    /* renamed from: d */
    public V f1173d;

    /* renamed from: androidx.compose.animation.core.s0$a */
    public static final class C0453a implements C0434k {

        /* renamed from: a */
        public final /* synthetic */ C0456u f1174a;

        public C0453a(C0456u uVar) {
            this.f1174a = uVar;
        }

        public final C0456u get(int i) {
            return this.f1174a;
        }
    }

    public C0452s0(C0434k kVar) {
        this.f1170a = kVar;
    }

    /* renamed from: b */
    public final long mo3518b(V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        Iterator it = C19388s.m32816D0(0, v.mo3489b()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((C19332y) it).nextInt();
            j = Math.max(j, this.f1170a.get(nextInt).mo3533e(v.mo3488a(nextInt), v2.mo3488a(nextInt), v3.mo3488a(nextInt)));
        }
        return j;
    }

    /* renamed from: d */
    public final V mo3519d(V v, V v2, V v3) {
        C19383o.m32797g(v, "initialValue");
        C19383o.m32797g(v2, "targetValue");
        C19383o.m32797g(v3, "initialVelocity");
        if (this.f1173d == null) {
            this.f1173d = v3.mo3490c();
        }
        int i = 0;
        V v4 = this.f1173d;
        if (v4 != null) {
            int b = v4.mo3489b();
            while (i < b) {
                V v5 = this.f1173d;
                if (v5 != null) {
                    v5.mo3492e(this.f1170a.get(i).mo3530b(v.mo3488a(i), v2.mo3488a(i), v3.mo3488a(i)), i);
                    i++;
                } else {
                    C19383o.m32805o("endVelocityVector");
                    throw null;
                }
            }
            V v6 = this.f1173d;
            if (v6 != null) {
                return v6;
            }
            C19383o.m32805o("endVelocityVector");
            throw null;
        }
        C19383o.m32805o("endVelocityVector");
        throw null;
    }

    /* renamed from: f */
    public final V mo3520f(long j, V v, V v2, V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        C19383o.m32797g(v4, "initialValue");
        C19383o.m32797g(v5, "targetValue");
        C19383o.m32797g(v6, "initialVelocity");
        if (this.f1172c == null) {
            this.f1172c = v3.mo3490c();
        }
        int i = 0;
        V v7 = this.f1172c;
        if (v7 != null) {
            int b = v7.mo3489b();
            while (i < b) {
                V v8 = this.f1172c;
                if (v8 != null) {
                    v8.mo3492e(this.f1170a.get(i).mo3532d(j, v4.mo3488a(i), v5.mo3488a(i), v6.mo3488a(i)), i);
                    i++;
                } else {
                    C19383o.m32805o("velocityVector");
                    throw null;
                }
            }
            V v9 = this.f1172c;
            if (v9 != null) {
                return v9;
            }
            C19383o.m32805o("velocityVector");
            throw null;
        }
        C19383o.m32805o("velocityVector");
        throw null;
    }

    /* renamed from: g */
    public final V mo3521g(long j, V v, V v2, V v3) {
        V v4 = v;
        V v5 = v2;
        V v6 = v3;
        C19383o.m32797g(v4, "initialValue");
        C19383o.m32797g(v5, "targetValue");
        C19383o.m32797g(v6, "initialVelocity");
        if (this.f1171b == null) {
            this.f1171b = v.mo3490c();
        }
        int i = 0;
        V v7 = this.f1171b;
        if (v7 != null) {
            int b = v7.mo3489b();
            while (i < b) {
                V v8 = this.f1171b;
                if (v8 != null) {
                    v8.mo3492e(this.f1170a.get(i).mo3531c(j, v4.mo3488a(i), v5.mo3488a(i), v6.mo3488a(i)), i);
                    i++;
                } else {
                    C19383o.m32805o("valueVector");
                    throw null;
                }
            }
            V v9 = this.f1171b;
            if (v9 != null) {
                return v9;
            }
            C19383o.m32805o("valueVector");
            throw null;
        }
        C19383o.m32805o("valueVector");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0452s0(C0456u uVar) {
        this((C0434k) new C0453a(uVar));
        C19383o.m32797g(uVar, "anim");
    }
}
