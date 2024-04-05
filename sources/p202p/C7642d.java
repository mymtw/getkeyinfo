package p202p;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p174m0.C7284d;

/* renamed from: p.d */
public final class C7642d implements C7639b {

    /* renamed from: a */
    public final float f16939a;

    public C7642d(float f) {
        this.f16939a = f;
    }

    /* renamed from: a */
    public final float mo20045a(C7282b bVar, long j) {
        C19383o.m32797g(bVar, "density");
        return bVar.mo3789B0(this.f16939a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7642d) && C7284d.m13983a(this.f16939a, ((C7642d) obj).f16939a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f16939a);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CornerSize(size = ");
        h.append(this.f16939a);
        h.append(".dp)");
        return h.toString();
    }
}
