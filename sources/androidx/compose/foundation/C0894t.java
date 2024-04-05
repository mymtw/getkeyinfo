package androidx.compose.foundation;

import android.os.Build;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.semantics.C1909p;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p174m0.C7284d;
import p174m0.C7286f;
import p288y.C8343c;
import p753kq.C19846a;

/* renamed from: androidx.compose.foundation.t */
public final class C0894t {

    /* renamed from: g */
    public static final C0894t f1896g;

    /* renamed from: h */
    public static final C0894t f1897h;

    /* renamed from: a */
    public final boolean f1898a;

    /* renamed from: b */
    public final long f1899b;

    /* renamed from: c */
    public final float f1900c;

    /* renamed from: d */
    public final float f1901d;

    /* renamed from: e */
    public final boolean f1902e;

    /* renamed from: f */
    public final boolean f1903f;

    static {
        long j = C7286f.f16161c;
        f1896g = new C0894t(false, j, Float.NaN, Float.NaN, true, false);
        f1897h = new C0894t(true, j, Float.NaN, Float.NaN, true, false);
    }

    public C0894t(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.f1898a = z;
        this.f1899b = j;
        this.f1900c = f;
        this.f1901d = f2;
        this.f1902e = z2;
        this.f1903f = z3;
    }

    /* renamed from: a */
    public final boolean mo4429a() {
        int i = Build.VERSION.SDK_INT;
        C1909p<C19846a<C8343c>> pVar = C0885s.f1894a;
        return (i >= 28) && !this.f1903f && (this.f1898a || C19383o.m32792b(this, f1896g) || i >= 29);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0894t)) {
            return false;
        }
        C0894t tVar = (C0894t) obj;
        if (this.f1898a != tVar.f1898a) {
            return false;
        }
        return ((this.f1899b > tVar.f1899b ? 1 : (this.f1899b == tVar.f1899b ? 0 : -1)) == 0) && C7284d.m13983a(this.f1900c, tVar.f1900c) && C7284d.m13983a(this.f1901d, tVar.f1901d) && this.f1902e == tVar.f1902e && this.f1903f == tVar.f1903f;
    }

    public final int hashCode() {
        long j = this.f1899b;
        int i = C7286f.f16162d;
        int c = C0023f.m104c(this.f1901d, C0023f.m104c(this.f1900c, C0071c.m190b(j, Boolean.hashCode(this.f1898a) * 31, 31), 31), 31);
        return Boolean.hashCode(this.f1903f) + ((Boolean.hashCode(this.f1902e) + c) * 31);
    }

    public final String toString() {
        if (this.f1898a) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder h = C0072d.m201h("MagnifierStyle(size=");
        h.append(C7286f.m13990c(this.f1899b));
        h.append(", cornerRadius=");
        h.append(C7284d.m13984c(this.f1900c));
        h.append(", elevation=");
        h.append(C7284d.m13984c(this.f1901d));
        h.append(", clippingEnabled=");
        h.append(this.f1902e);
        h.append(", fishEyeEnabled=");
        return C0391c.m1058d(h, this.f1903f, ')');
    }
}
