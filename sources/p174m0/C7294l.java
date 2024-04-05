package p174m0;

import androidx.appcompat.widget.C0326j;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: m0.l */
public final class C7294l {

    /* renamed from: b */
    public static final long f16176b = C1993m.m4370p(0.0f, 0.0f);

    /* renamed from: c */
    public static final /* synthetic */ int f16177c = 0;

    /* renamed from: a */
    public final long f16178a;

    public /* synthetic */ C7294l(long j) {
        this.f16178a = j;
    }

    /* renamed from: a */
    public static long m14003a(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = m14004b(j);
        }
        if ((i & 2) != 0) {
            f2 = m14005c(j);
        }
        return C1993m.m4370p(f, f2);
    }

    /* renamed from: b */
    public static final float m14004b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: c */
    public static final float m14005c(long j) {
        return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
    }

    /* renamed from: d */
    public static final long m14006d(long j, long j2) {
        return C1993m.m4370p(m14004b(j) - m14004b(j2), m14005c(j) - m14005c(j2));
    }

    /* renamed from: e */
    public static final long m14007e(long j, long j2) {
        return C1993m.m4370p(m14004b(j2) + m14004b(j), m14005c(j2) + m14005c(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7294l) && this.f16178a == ((C7294l) obj).f16178a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16178a);
    }

    public final String toString() {
        long j = this.f16178a;
        StringBuilder k = C0326j.m866k('(');
        k.append(m14004b(j));
        k.append(", ");
        k.append(m14005c(j));
        k.append(") px/sec");
        return k.toString();
    }
}
