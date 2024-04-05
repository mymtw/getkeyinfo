package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.material.t0 */
public final class C1253t0<T> {

    /* renamed from: a */
    public final T f2614a;

    /* renamed from: b */
    public final C19862q<C19861p<? super C1302d, ? super Integer, C19394m>, C1302d, Integer, C19394m> f2615b;

    public C1253t0(C1251s1 s1Var, ComposableLambdaImpl composableLambdaImpl) {
        this.f2614a = s1Var;
        this.f2615b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1253t0)) {
            return false;
        }
        C1253t0 t0Var = (C1253t0) obj;
        return C19383o.m32792b(this.f2614a, t0Var.f2614a) && C19383o.m32792b(this.f2615b, t0Var.f2615b);
    }

    public final int hashCode() {
        T t = this.f2614a;
        return this.f2615b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FadeInFadeOutAnimationItem(key=");
        h.append(this.f2614a);
        h.append(", transition=");
        h.append(this.f2615b);
        h.append(')');
        return h.toString();
    }
}
