package p174m0;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: m0.i */
public final class C7290i {

    /* renamed from: a */
    public final long f16171a;

    /* renamed from: m0.i$a */
    public static final class C7291a {
    }

    static {
        new C7291a();
    }

    public /* synthetic */ C7290i(long j) {
        this.f16171a = j;
    }

    /* renamed from: a */
    public static final boolean m13994a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final int m13995b(long j) {
        return (int) (j & UnsignedInteger.INT_MASK);
    }

    /* renamed from: c */
    public static String m13996c(long j) {
        return ((int) (j >> 32)) + " x " + m13995b(j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7290i) && this.f16171a == ((C7290i) obj).f16171a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16171a);
    }

    public final String toString() {
        return m13996c(this.f16171a);
    }
}
