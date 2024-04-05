package androidx.compose.p015ui.graphics;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.graphics.p0 */
public final class C1540p0 {

    /* renamed from: b */
    public static final long f3337b = C18263b.m30840e(0.5f, 0.5f);

    /* renamed from: c */
    public static final /* synthetic */ int f3338c = 0;

    /* renamed from: a */
    public final long f3339a;

    public /* synthetic */ C1540p0(long j) {
        this.f3339a = j;
    }

    /* renamed from: a */
    public static final float m3342a(long j) {
        return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
    }

    /* renamed from: b */
    public static String m3343b(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1540p0) && this.f3339a == ((C1540p0) obj).f3339a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3339a);
    }

    public final String toString() {
        return m3343b(this.f3339a);
    }
}
