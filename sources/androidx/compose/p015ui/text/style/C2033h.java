package androidx.compose.p015ui.text.style;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import p174m0.C7292j;
import p174m0.C7293k;

/* renamed from: androidx.compose.ui.text.style.h */
public final class C2033h {

    /* renamed from: c */
    public static final C2033h f4620c = new C2033h(C0114h.m302g0(0), C0114h.m302g0(0));

    /* renamed from: a */
    public final long f4621a;

    /* renamed from: b */
    public final long f4622b;

    public C2033h(long j, long j2) {
        this.f4621a = j;
        this.f4622b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2033h)) {
            return false;
        }
        C2033h hVar = (C2033h) obj;
        return C7292j.m13997a(this.f4621a, hVar.f4621a) && C7292j.m13997a(this.f4622b, hVar.f4622b);
    }

    public final int hashCode() {
        long j = this.f4621a;
        C7293k[] kVarArr = C7292j.f16172b;
        return Long.hashCode(this.f4622b) + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextIndent(firstLine=");
        h.append(C7292j.m14000d(this.f4621a));
        h.append(", restLine=");
        h.append(C7292j.m14000d(this.f4622b));
        h.append(')');
        return h.toString();
    }
}
