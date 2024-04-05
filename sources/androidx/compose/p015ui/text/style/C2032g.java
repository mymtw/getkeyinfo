package androidx.compose.p015ui.text.style;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;

/* renamed from: androidx.compose.ui.text.style.g */
public final class C2032g {

    /* renamed from: c */
    public static final C2032g f4617c = new C2032g(1.0f, 0.0f);

    /* renamed from: a */
    public final float f4618a;

    /* renamed from: b */
    public final float f4619b;

    public C2032g(float f, float f2) {
        this.f4618a = f;
        this.f4619b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2032g)) {
            return false;
        }
        C2032g gVar = (C2032g) obj;
        if (!(this.f4618a == gVar.f4618a)) {
            return false;
        }
        return (this.f4619b > gVar.f4619b ? 1 : (this.f4619b == gVar.f4619b ? 0 : -1)) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4619b) + (Float.hashCode(this.f4618a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextGeometricTransform(scaleX=");
        h.append(this.f4618a);
        h.append(", skewX=");
        return C0388a.m1048d(h, this.f4619b, ')');
    }

    public C2032g() {
        this(1.0f, 0.0f);
    }
}
