package p288y;

import android.support.p013v4.media.C0071c;
import androidx.compose.foundation.layout.C0761x;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: y.e */
public final class C8346e {

    /* renamed from: a */
    public final float f18305a;

    /* renamed from: b */
    public final float f18306b;

    /* renamed from: c */
    public final float f18307c;

    /* renamed from: d */
    public final float f18308d;

    /* renamed from: e */
    public final long f18309e;

    /* renamed from: f */
    public final long f18310f;

    /* renamed from: g */
    public final long f18311g;

    /* renamed from: h */
    public final long f18312h;

    static {
        int i = C8341a.f18290b;
        C0761x.m1712c(0.0f, 0.0f, 0.0f, 0.0f, C8341a.f18289a);
    }

    public C8346e(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f18305a = f;
        this.f18306b = f2;
        this.f18307c = f3;
        this.f18308d = f4;
        this.f18309e = j;
        this.f18310f = j2;
        this.f18311g = j3;
        this.f18312h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8346e)) {
            return false;
        }
        C8346e eVar = (C8346e) obj;
        return C19383o.m32792b(Float.valueOf(this.f18305a), Float.valueOf(eVar.f18305a)) && C19383o.m32792b(Float.valueOf(this.f18306b), Float.valueOf(eVar.f18306b)) && C19383o.m32792b(Float.valueOf(this.f18307c), Float.valueOf(eVar.f18307c)) && C19383o.m32792b(Float.valueOf(this.f18308d), Float.valueOf(eVar.f18308d)) && C8341a.m16634a(this.f18309e, eVar.f18309e) && C8341a.m16634a(this.f18310f, eVar.f18310f) && C8341a.m16634a(this.f18311g, eVar.f18311g) && C8341a.m16634a(this.f18312h, eVar.f18312h);
    }

    public final int hashCode() {
        int c = C0023f.m104c(this.f18308d, C0023f.m104c(this.f18307c, C0023f.m104c(this.f18306b, Float.hashCode(this.f18305a) * 31, 31), 31), 31);
        long j = this.f18309e;
        int i = C8341a.f18290b;
        return Long.hashCode(this.f18312h) + C0071c.m190b(this.f18311g, C0071c.m190b(this.f18310f, C0071c.m190b(j, c, 31), 31), 31);
    }

    public final String toString() {
        long j = this.f18309e;
        long j2 = this.f18310f;
        long j3 = this.f18311g;
        long j4 = this.f18312h;
        String str = C0761x.m1700W0(this.f18305a) + ", " + C0761x.m1700W0(this.f18306b) + ", " + C0761x.m1700W0(this.f18307c) + ", " + C0761x.m1700W0(this.f18308d);
        if (!C8341a.m16634a(j, j2) || !C8341a.m16634a(j2, j3) || !C8341a.m16634a(j3, j4)) {
            StringBuilder l = C0023f.m111l("RoundRect(rect=", str, ", topLeft=");
            l.append(C8341a.m16637d(j));
            l.append(", topRight=");
            l.append(C8341a.m16637d(j2));
            l.append(", bottomRight=");
            l.append(C8341a.m16637d(j3));
            l.append(", bottomLeft=");
            l.append(C8341a.m16637d(j4));
            l.append(')');
            return l.toString();
        }
        if (C8341a.m16635b(j) == C8341a.m16636c(j)) {
            StringBuilder l2 = C0023f.m111l("RoundRect(rect=", str, ", radius=");
            l2.append(C0761x.m1700W0(C8341a.m16635b(j)));
            l2.append(')');
            return l2.toString();
        }
        StringBuilder l3 = C0023f.m111l("RoundRect(rect=", str, ", x=");
        l3.append(C0761x.m1700W0(C8341a.m16635b(j)));
        l3.append(", y=");
        l3.append(C0761x.m1700W0(C8341a.m16636c(j)));
        l3.append(')');
        return l3.toString();
    }
}
