package p174m0;

import androidx.activity.C0114h;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: m0.j */
public final class C7292j {

    /* renamed from: b */
    public static final C7293k[] f16172b = {new C7293k(0), new C7293k(4294967296L), new C7293k(8589934592L)};

    /* renamed from: c */
    public static final long f16173c = C0114h.m316r0(0, Float.NaN);

    /* renamed from: a */
    public final long f16174a;

    public /* synthetic */ C7292j(long j) {
        this.f16174a = j;
    }

    /* renamed from: a */
    public static final boolean m13997a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final long m13998b(long j) {
        return f16172b[(int) ((j & 1095216660480L) >>> 32)].f16175a;
    }

    /* renamed from: c */
    public static final float m13999c(long j) {
        return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
    }

    /* renamed from: d */
    public static String m14000d(long j) {
        long b = m13998b(j);
        if (C7293k.m14001a(b, 0)) {
            return "Unspecified";
        }
        if (C7293k.m14001a(b, 4294967296L)) {
            return m13999c(j) + ".sp";
        } else if (!C7293k.m14001a(b, 8589934592L)) {
            return "Invalid";
        } else {
            return m13999c(j) + ".em";
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7292j) && this.f16174a == ((C7292j) obj).f16174a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16174a);
    }

    public final String toString() {
        return m14000d(this.f16174a);
    }
}
