package androidx.compose.animation;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.C0454t;
import androidx.compose.p015ui.graphics.C1540p0;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.q */
public final class C0482q {

    /* renamed from: a */
    public final float f1226a;

    /* renamed from: b */
    public final long f1227b;

    /* renamed from: c */
    public final C0454t<Float> f1228c;

    public C0482q() {
        throw null;
    }

    public C0482q(float f, long j, C0454t tVar) {
        this.f1226a = f;
        this.f1227b = j;
        this.f1228c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0482q)) {
            return false;
        }
        C0482q qVar = (C0482q) obj;
        if (!C19383o.m32792b(Float.valueOf(this.f1226a), Float.valueOf(qVar.f1226a))) {
            return false;
        }
        long j = this.f1227b;
        long j2 = qVar.f1227b;
        int i = C1540p0.f3338c;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && C19383o.m32792b(this.f1228c, qVar.f1228c);
    }

    public final int hashCode() {
        long j = this.f1227b;
        int i = C1540p0.f3338c;
        return this.f1228c.hashCode() + C0071c.m190b(j, Float.hashCode(this.f1226a) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Scale(scale=");
        h.append(this.f1226a);
        h.append(", transformOrigin=");
        h.append(C1540p0.m3343b(this.f1227b));
        h.append(", animationSpec=");
        h.append(this.f1228c);
        h.append(')');
        return h.toString();
    }
}
