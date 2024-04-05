package androidx.compose.p015ui.graphics;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.compose.ui.graphics.u */
public final class C1547u implements Comparable<C1547u> {

    /* renamed from: b */
    public static final C1548a f3368b = new C1548a();

    /* renamed from: c */
    public static final float f3369c = Float.intBitsToFloat(1056964608);

    /* renamed from: androidx.compose.ui.graphics.u$a */
    public static final class C1548a {
    }

    static {
        m3364a(1.0f);
        m3364a(-1.0f);
    }

    /* renamed from: a */
    public static short m3364a(float f) {
        int i;
        int i2;
        f3368b.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i3 = floatToRawIntBits >>> 31;
        int i4 = (floatToRawIntBits >>> 23) & 255;
        int i5 = floatToRawIntBits & 8388607;
        int i6 = 0;
        if (i4 == 255) {
            if (i5 != 0) {
                i6 = RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
            i = i6;
            i6 = 31;
        } else {
            int i7 = (i4 - 127) + 15;
            if (i7 >= 31) {
                i6 = 49;
                i = 0;
            } else if (i7 > 0) {
                int i8 = i5 >> 13;
                if ((i5 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i = ((i7 << 10) | i8) + 1;
                    i2 = i3 << 15;
                    return (short) (i | i2);
                }
                i = i8;
                i6 = i7;
            } else if (i7 >= -10) {
                int i9 = (i5 | 8388608) >> (1 - i7);
                if ((i9 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i9 += 8192;
                }
                i = i9 >> 13;
            } else {
                i = 0;
            }
        }
        i2 = (i3 << 15) | (i6 << 10);
        return (short) (i | i2);
    }

    /* renamed from: c */
    public static final float m3365c(short s) {
        int i;
        int i2;
        short s2 = s & 65535;
        short s3 = 32768 & s2;
        int i3 = (s2 >>> 10) & 31;
        short s4 = s2 & 1023;
        int i4 = 0;
        if (i3 != 0) {
            int i5 = s4 << 13;
            if (i3 == 31) {
                i2 = 255;
                if (i5 != 0) {
                    i5 |= 4194304;
                }
            } else {
                i2 = (i3 - 15) + 127;
            }
            int i6 = i5;
            i4 = i2;
            i = i6;
        } else if (s4 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(s4 + 1056964608) - f3369c;
            return s3 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (s3 << 16) | (i4 << 23));
    }
}
