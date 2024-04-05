package p036c5;

import android.os.SystemClock;

/* renamed from: c5.h */
public final class C4421h {

    /* renamed from: a */
    public static final double f9698a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: b */
    public static final /* synthetic */ int f9699b = 0;

    /* renamed from: a */
    public static double m10119a(long j) {
        return ((double) (SystemClock.elapsedRealtimeNanos() - j)) * f9698a;
    }
}
