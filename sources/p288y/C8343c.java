package p288y;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import kotlin.reflect.C19421p;

/* renamed from: y.c */
public final class C8343c {

    /* renamed from: b */
    public static final long f18295b = C19421p.m32952q(0.0f, 0.0f);

    /* renamed from: c */
    public static final long f18296c = C19421p.m32952q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d */
    public static final long f18297d = C19421p.m32952q(Float.NaN, Float.NaN);

    /* renamed from: e */
    public static final /* synthetic */ int f18298e = 0;

    /* renamed from: a */
    public final long f18299a;

    /* renamed from: y.c$a */
    public static final class C8344a {
    }

    static {
        new C8344a();
    }

    public /* synthetic */ C8343c(long j) {
        this.f18299a = j;
    }

    /* renamed from: a */
    public static final boolean m16640a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final float m16641b(long j) {
        return (float) Math.sqrt((double) ((m16643d(j) * m16643d(j)) + (m16642c(j) * m16642c(j))));
    }

    /* renamed from: c */
    public static final float m16642c(long j) {
        if (j != f18297d) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: d */
    public static final float m16643d(long j) {
        if (j != f18297d) {
            return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: e */
    public static final long m16644e(long j, long j2) {
        return C19421p.m32952q(m16642c(j) - m16642c(j2), m16643d(j) - m16643d(j2));
    }

    /* renamed from: f */
    public static final long m16645f(long j, long j2) {
        return C19421p.m32952q(m16642c(j2) + m16642c(j), m16643d(j2) + m16643d(j));
    }

    /* renamed from: g */
    public static final long m16646g(long j, float f) {
        return C19421p.m32952q(m16642c(j) * f, m16643d(j) * f);
    }

    /* renamed from: h */
    public static String m16647h(long j) {
        if (!C19421p.m32928R(j)) {
            return "Offset.Unspecified";
        }
        StringBuilder h = C0072d.m201h("Offset(");
        h.append(C0761x.m1700W0(m16642c(j)));
        h.append(", ");
        h.append(C0761x.m1700W0(m16643d(j)));
        h.append(')');
        return h.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8343c) && this.f18299a == ((C8343c) obj).f18299a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18299a);
    }

    public final String toString() {
        return m16647h(this.f18299a);
    }
}
