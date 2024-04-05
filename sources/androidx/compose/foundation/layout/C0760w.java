package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p174m0.C7284d;

/* renamed from: androidx.compose.foundation.layout.w */
public final class C0760w implements C0759v {

    /* renamed from: a */
    public final float f1554a;

    /* renamed from: b */
    public final float f1555b;

    /* renamed from: c */
    public final float f1556c;

    /* renamed from: d */
    public final float f1557d;

    public C0760w(float f, float f2, float f3, float f4) {
        this.f1554a = f;
        this.f1555b = f2;
        this.f1556c = f3;
        this.f1557d = f4;
    }

    /* renamed from: a */
    public final float mo4150a() {
        return this.f1557d;
    }

    /* renamed from: b */
    public final float mo4151b(LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.f1554a : this.f1556c;
    }

    /* renamed from: c */
    public final float mo4152c(LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.f1556c : this.f1554a;
    }

    /* renamed from: d */
    public final float mo4153d() {
        return this.f1555b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0760w)) {
            return false;
        }
        C0760w wVar = (C0760w) obj;
        return C7284d.m13983a(this.f1554a, wVar.f1554a) && C7284d.m13983a(this.f1555b, wVar.f1555b) && C7284d.m13983a(this.f1556c, wVar.f1556c) && C7284d.m13983a(this.f1557d, wVar.f1557d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1557d) + C0023f.m104c(this.f1556c, C0023f.m104c(this.f1555b, Float.hashCode(this.f1554a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PaddingValues(start=");
        h.append(C7284d.m13984c(this.f1554a));
        h.append(", top=");
        h.append(C7284d.m13984c(this.f1555b));
        h.append(", end=");
        h.append(C7284d.m13984c(this.f1556c));
        h.append(", bottom=");
        h.append(C7284d.m13984c(this.f1557d));
        h.append(')');
        return h.toString();
    }
}
