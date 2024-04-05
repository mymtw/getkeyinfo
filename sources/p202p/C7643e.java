package p202p;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p288y.C8347f;

/* renamed from: p.e */
public final class C7643e implements C7639b {

    /* renamed from: a */
    public final float f16940a;

    public C7643e(float f) {
        this.f16940a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    /* renamed from: a */
    public final float mo20045a(C7282b bVar, long j) {
        C19383o.m32797g(bVar, "density");
        return (this.f16940a / 100.0f) * C8347f.m16655c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7643e) && C19383o.m32792b(Float.valueOf(this.f16940a), Float.valueOf(((C7643e) obj).f16940a));
    }

    public final int hashCode() {
        return Float.hashCode(this.f16940a);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CornerSize(size = ");
        h.append(this.f16940a);
        h.append("%)");
        return h.toString();
    }
}
