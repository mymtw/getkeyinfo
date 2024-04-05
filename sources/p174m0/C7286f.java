package p174m0;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import kotlin.jvm.internal.C19388s;

/* renamed from: m0.f */
public final class C7286f {

    /* renamed from: b */
    public static final long f16160b;

    /* renamed from: c */
    public static final long f16161c = C19388s.m32859e(Float.NaN, Float.NaN);

    /* renamed from: d */
    public static final /* synthetic */ int f16162d = 0;

    /* renamed from: a */
    public final long f16163a;

    static {
        float f = (float) 0;
        f16160b = C19388s.m32859e(f, f);
    }

    public /* synthetic */ C7286f(long j) {
        this.f16163a = j;
    }

    /* renamed from: a */
    public static final float m13988a(long j) {
        if (j != f16161c) {
            return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: b */
    public static final float m13989b(long j) {
        if (j != f16161c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: c */
    public static String m13990c(long j) {
        if (!(j != f16161c)) {
            return "DpSize.Unspecified";
        }
        return C7284d.m13984c(m13989b(j)) + " x " + C7284d.m13984c(m13988a(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7286f) && this.f16163a == ((C7286f) obj).f16163a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16163a);
    }

    public final String toString() {
        return m13990c(this.f16163a);
    }
}
