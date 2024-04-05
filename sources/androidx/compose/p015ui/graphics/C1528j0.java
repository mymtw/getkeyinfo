package androidx.compose.p015ui.graphics;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import kotlin.C19356i;
import p010a9.C0048b;
import p288y.C8343c;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.graphics.j0 */
public final class C1528j0 {

    /* renamed from: d */
    public static final C1528j0 f3322d = new C1528j0();

    /* renamed from: a */
    public final long f3323a;

    /* renamed from: b */
    public final long f3324b;

    /* renamed from: c */
    public final float f3325c;

    public C1528j0(long j, long j2, float f) {
        this.f3323a = j;
        this.f3324b = j2;
        this.f3325c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1528j0)) {
            return false;
        }
        C1528j0 j0Var = (C1528j0) obj;
        if (!C1545s.m3357c(this.f3323a, j0Var.f3323a) || !C8343c.m16640a(this.f3324b, j0Var.f3324b)) {
            return false;
        }
        return (this.f3325c > j0Var.f3325c ? 1 : (this.f3325c == j0Var.f3325c ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        long j = this.f3323a;
        int i = C1545s.f3365j;
        long j2 = this.f3324b;
        int i2 = C8343c.f18298e;
        return Float.hashCode(this.f3325c) + C0071c.m190b(j2, C19356i.m32678a(j) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Shadow(color=");
        C0048b.m165d(this.f3323a, h, ", offset=");
        h.append(C8343c.m16647h(this.f3324b));
        h.append(", blurRadius=");
        return C0388a.m1048d(h, this.f3325c, ')');
    }

    public C1528j0() {
        this(C18263b.m30836c(4278190080L), C8343c.f18295b, 0.0f);
    }
}
