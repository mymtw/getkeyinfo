package androidx.compose.p015ui.graphics.colorspace;

import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: androidx.compose.ui.graphics.colorspace.b */
public final class C1504b {

    /* renamed from: a */
    public static final long f3260a;

    /* renamed from: b */
    public static final long f3261b;

    /* renamed from: c */
    public static final long f3262c;

    /* renamed from: d */
    public static final long f3263d;

    /* renamed from: e */
    public static final /* synthetic */ int f3264e = 0;

    static {
        long j = (long) 3;
        long j2 = j << 32;
        f3260a = (((long) 0) & UnsignedInteger.INT_MASK) | j2;
        f3261b = (((long) 1) & UnsignedInteger.INT_MASK) | j2;
        f3262c = j2 | (((long) 2) & UnsignedInteger.INT_MASK);
        f3263d = (j & UnsignedInteger.INT_MASK) | (((long) 4) << 32);
    }

    /* renamed from: a */
    public static final boolean m3215a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static String m3216b(long j) {
        return m3215a(j, f3260a) ? "Rgb" : m3215a(j, f3261b) ? "Xyz" : m3215a(j, f3262c) ? "Lab" : m3215a(j, f3263d) ? "Cmyk" : "Unknown";
    }
}
