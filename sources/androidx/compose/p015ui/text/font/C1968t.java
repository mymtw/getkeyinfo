package androidx.compose.p015ui.text.font;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.font.t */
public final class C1968t implements C1950f {

    /* renamed from: a */
    public final int f4423a;

    /* renamed from: b */
    public final C1959m f4424b;

    /* renamed from: c */
    public final int f4425c;

    /* renamed from: d */
    public final int f4426d;

    public C1968t(int i, C1959m mVar, int i2, int i3) {
        this.f4423a = i;
        this.f4424b = mVar;
        this.f4425c = i2;
        this.f4426d = i3;
    }

    /* renamed from: b */
    public final C1959m mo7535b() {
        return this.f4424b;
    }

    /* renamed from: c */
    public final int mo7526c() {
        return this.f4426d;
    }

    /* renamed from: d */
    public final int mo7536d() {
        return this.f4425c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1968t)) {
            return false;
        }
        C1968t tVar = (C1968t) obj;
        if (this.f4423a != tVar.f4423a || !C19383o.m32792b(this.f4424b, tVar.f4424b)) {
            return false;
        }
        if (!(this.f4425c == tVar.f4425c)) {
            return false;
        }
        return this.f4426d == tVar.f4426d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4426d) + C0069a.m170a(this.f4425c, ((this.f4423a * 31) + this.f4424b.f4417b) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ResourceFont(resId=");
        h.append(this.f4423a);
        h.append(", weight=");
        h.append(this.f4424b);
        h.append(", style=");
        h.append(C1957k.m4284a(this.f4425c));
        h.append(", loadingStrategy=");
        h.append(C19382n.m32716J0(this.f4426d));
        h.append(')');
        return h.toString();
    }
}
