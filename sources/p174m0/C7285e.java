package p174m0;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import kotlin.jvm.internal.C19388s;

/* renamed from: m0.e */
public final class C7285e {

    /* renamed from: b */
    public static final long f16156b;

    /* renamed from: c */
    public static final long f16157c = C19388s.m32858d(Float.NaN, Float.NaN);

    /* renamed from: d */
    public static final /* synthetic */ int f16158d = 0;

    /* renamed from: a */
    public final long f16159a;

    static {
        float f = (float) 0;
        f16156b = C19388s.m32858d(f, f);
    }

    public /* synthetic */ C7285e(long j) {
        this.f16159a = j;
    }

    /* renamed from: a */
    public static final float m13985a(long j) {
        if (j != f16157c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: b */
    public static final float m13986b(long j) {
        if (j != f16157c) {
            return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: c */
    public static String m13987c(long j) {
        if (!(j != f16157c)) {
            return "DpOffset.Unspecified";
        }
        StringBuilder k = C0326j.m866k('(');
        k.append(C7284d.m13984c(m13985a(j)));
        k.append(", ");
        k.append(C7284d.m13984c(m13986b(j)));
        k.append(')');
        return k.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7285e) && this.f16159a == ((C7285e) obj).f16159a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16159a);
    }

    public final String toString() {
        return m13987c(this.f16159a);
    }
}
