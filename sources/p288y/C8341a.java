package p288y;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;

/* renamed from: y.a */
public final class C8341a {

    /* renamed from: a */
    public static final long f18289a = C0114h.m317s(0.0f, 0.0f);

    /* renamed from: b */
    public static final /* synthetic */ int f18290b = 0;

    /* renamed from: a */
    public static final boolean m16634a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final float m16635b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: c */
    public static final float m16636c(long j) {
        return Float.intBitsToFloat((int) (j & UnsignedInteger.INT_MASK));
    }

    /* renamed from: d */
    public static String m16637d(long j) {
        if (m16635b(j) == m16636c(j)) {
            StringBuilder h = C0072d.m201h("CornerRadius.circular(");
            h.append(C0761x.m1700W0(m16635b(j)));
            h.append(')');
            return h.toString();
        }
        StringBuilder h2 = C0072d.m201h("CornerRadius.elliptical(");
        h2.append(C0761x.m1700W0(m16635b(j)));
        h2.append(", ");
        h2.append(C0761x.m1700W0(m16636c(j)));
        h2.append(')');
        return h2.toString();
    }
}
