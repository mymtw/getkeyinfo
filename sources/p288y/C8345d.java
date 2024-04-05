package p288y;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p003a2.C0023f;

/* renamed from: y.d */
public final class C8345d {

    /* renamed from: e */
    public static final C8345d f18300e = new C8345d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public final float f18301a;

    /* renamed from: b */
    public final float f18302b;

    /* renamed from: c */
    public final float f18303c;

    /* renamed from: d */
    public final float f18304d;

    public C8345d(float f, float f2, float f3, float f4) {
        this.f18301a = f;
        this.f18302b = f2;
        this.f18303c = f3;
        this.f18304d = f4;
    }

    /* renamed from: a */
    public final boolean mo20926a(long j) {
        return C8343c.m16642c(j) >= this.f18301a && C8343c.m16642c(j) < this.f18303c && C8343c.m16643d(j) >= this.f18302b && C8343c.m16643d(j) < this.f18304d;
    }

    /* renamed from: b */
    public final long mo20927b() {
        float f = this.f18301a;
        float f2 = ((this.f18303c - f) / 2.0f) + f;
        float f3 = this.f18302b;
        return C19421p.m32952q(f2, ((this.f18304d - f3) / 2.0f) + f3);
    }

    /* renamed from: c */
    public final boolean mo20928c(C8345d dVar) {
        C19383o.m32797g(dVar, "other");
        return this.f18303c > dVar.f18301a && dVar.f18303c > this.f18301a && this.f18304d > dVar.f18302b && dVar.f18304d > this.f18302b;
    }

    /* renamed from: d */
    public final C8345d mo20929d(float f, float f2) {
        return new C8345d(this.f18301a + f, this.f18302b + f2, this.f18303c + f, this.f18304d + f2);
    }

    /* renamed from: e */
    public final C8345d mo20930e(long j) {
        return new C8345d(C8343c.m16642c(j) + this.f18301a, C8343c.m16643d(j) + this.f18302b, C8343c.m16642c(j) + this.f18303c, C8343c.m16643d(j) + this.f18304d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8345d)) {
            return false;
        }
        C8345d dVar = (C8345d) obj;
        return C19383o.m32792b(Float.valueOf(this.f18301a), Float.valueOf(dVar.f18301a)) && C19383o.m32792b(Float.valueOf(this.f18302b), Float.valueOf(dVar.f18302b)) && C19383o.m32792b(Float.valueOf(this.f18303c), Float.valueOf(dVar.f18303c)) && C19383o.m32792b(Float.valueOf(this.f18304d), Float.valueOf(dVar.f18304d));
    }

    public final int hashCode() {
        return Float.hashCode(this.f18304d) + C0023f.m104c(this.f18303c, C0023f.m104c(this.f18302b, Float.hashCode(this.f18301a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Rect.fromLTRB(");
        h.append(C0761x.m1700W0(this.f18301a));
        h.append(", ");
        h.append(C0761x.m1700W0(this.f18302b));
        h.append(", ");
        h.append(C0761x.m1700W0(this.f18303c));
        h.append(", ");
        h.append(C0761x.m1700W0(this.f18304d));
        h.append(')');
        return h.toString();
    }
}
