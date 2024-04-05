package p087e0;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p288y.C8343c;

/* renamed from: e0.e */
public final class C6686e {

    /* renamed from: e */
    public static final C6686e f14751e;

    /* renamed from: a */
    public final long f14752a;

    /* renamed from: b */
    public final float f14753b;

    /* renamed from: c */
    public final long f14754c;

    /* renamed from: d */
    public final long f14755d;

    static {
        long j = C8343c.f18295b;
        f14751e = new C6686e(j, 1.0f, 0, j);
    }

    public C6686e(long j, float f, long j2, long j3) {
        this.f14752a = j;
        this.f14753b = f;
        this.f14754c = j2;
        this.f14755d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6686e)) {
            return false;
        }
        C6686e eVar = (C6686e) obj;
        return C8343c.m16640a(this.f14752a, eVar.f14752a) && C19383o.m32792b(Float.valueOf(this.f14753b), Float.valueOf(eVar.f14753b)) && this.f14754c == eVar.f14754c && C8343c.m16640a(this.f14755d, eVar.f14755d);
    }

    public final int hashCode() {
        long j = this.f14752a;
        int i = C8343c.f18298e;
        return Long.hashCode(this.f14755d) + C0071c.m190b(this.f14754c, C0023f.m104c(this.f14753b, Long.hashCode(j) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VelocityEstimate(pixelsPerSecond=");
        h.append(C8343c.m16647h(this.f14752a));
        h.append(", confidence=");
        h.append(this.f14753b);
        h.append(", durationMillis=");
        h.append(this.f14754c);
        h.append(", offset=");
        h.append(C8343c.m16647h(this.f14755d));
        h.append(')');
        return h.toString();
    }
}
