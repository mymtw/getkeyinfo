package p288y;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: y.f */
public final class C8347f {

    /* renamed from: b */
    public static final long f18313b = C0114h.m319t(0.0f, 0.0f);

    /* renamed from: c */
    public static final long f18314c = C0114h.m319t(Float.NaN, Float.NaN);

    /* renamed from: d */
    public static final /* synthetic */ int f18315d = 0;

    /* renamed from: a */
    public final long f18316a;

    /* renamed from: y.f$a */
    public static final class C8348a {
    }

    static {
        new C8348a();
    }

    public /* synthetic */ C8347f(long j) {
        this.f18316a = j;
    }

    /* renamed from: a */
    public static final boolean m16653a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final float m16654b(long j) {
        if (j != f18314c) {
            return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: c */
    public static final float m16655c(long j) {
        return Math.min(Math.abs(m16656d(j)), Math.abs(m16654b(j)));
    }

    /* renamed from: d */
    public static final float m16656d(long j) {
        if (j != f18314c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: e */
    public static String m16657e(long j) {
        if (!(j != f18314c)) {
            return "Size.Unspecified";
        }
        StringBuilder h = C0072d.m201h("Size(");
        h.append(C0761x.m1700W0(m16656d(j)));
        h.append(", ");
        h.append(C0761x.m1700W0(m16654b(j)));
        h.append(')');
        return h.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8347f) && this.f18316a == ((C8347f) obj).f18316a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18316a);
    }

    public final String toString() {
        return m16657e(this.f18316a);
    }
}
