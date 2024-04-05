package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import p003a2.C0023f;

/* renamed from: androidx.compose.material.m1 */
public final class C1213m1 {

    /* renamed from: a */
    public final float f2529a;

    /* renamed from: b */
    public final float f2530b;

    /* renamed from: c */
    public final float f2531c;

    public C1213m1(float f, float f2, float f3) {
        this.f2529a = f;
        this.f2530b = f2;
        this.f2531c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1213m1)) {
            return false;
        }
        C1213m1 m1Var = (C1213m1) obj;
        if (!(this.f2529a == m1Var.f2529a)) {
            return false;
        }
        if (!(this.f2530b == m1Var.f2530b)) {
            return false;
        }
        return (this.f2531c > m1Var.f2531c ? 1 : (this.f2531c == m1Var.f2531c ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2531c) + C0023f.m104c(this.f2530b, Float.hashCode(this.f2529a) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ResistanceConfig(basis=");
        h.append(this.f2529a);
        h.append(", factorAtMin=");
        h.append(this.f2530b);
        h.append(", factorAtMax=");
        return C0388a.m1048d(h, this.f2531c, ')');
    }
}
