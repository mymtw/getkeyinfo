package androidx.compose.foundation;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.C0760w;
import androidx.compose.p015ui.graphics.C1545s;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p628nj.C18263b;

/* renamed from: androidx.compose.foundation.v */
public final class C1029v {

    /* renamed from: a */
    public final long f2158a;

    /* renamed from: b */
    public final C0759v f2159b;

    public C1029v() {
        long c = C18263b.m30836c(4284900966L);
        float f = (float) 0;
        C0760w wVar = new C0760w(f, f, f, f);
        this.f2158a = c;
        this.f2159b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(C1029v.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C1029v vVar = (C1029v) obj;
            return C1545s.m3357c(this.f2158a, vVar.f2158a) && C19383o.m32792b(this.f2159b, vVar.f2159b);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
    }

    public final int hashCode() {
        long j = this.f2158a;
        int i = C1545s.f3365j;
        return this.f2159b.hashCode() + (C19356i.m32678a(j) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OverscrollConfiguration(glowColor=");
        C0048b.m165d(this.f2158a, h, ", drawPadding=");
        h.append(this.f2159b);
        h.append(')');
        return h.toString();
    }
}
