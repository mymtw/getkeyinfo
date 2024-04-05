package p289y0;

import android.graphics.Color;
import android.support.p013v4.media.C0072d;

/* renamed from: y0.c */
public final class C8351c {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f18318a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m16659a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = 360.0f;
        float f9 = (f * 60.0f) % 360.0f;
        if (f9 < 0.0f) {
            f9 += 360.0f;
        }
        if (f9 < 0.0f) {
            f8 = 0.0f;
        } else if (f9 <= 360.0f) {
            f8 = f9;
        }
        fArr[0] = f8;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        fArr[2] = f7;
    }

    /* renamed from: b */
    public static int m16660b(double d, double d2, double d3) {
        double d4 = ((-0.4986d * d3) + ((-1.5372d * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + (-0.9689d * d))) / 100.0d;
        double d6 = ((1.057d * d3) + ((-0.204d * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(m16665g((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), m16665g((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), m16665g((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    /* renamed from: c */
    public static double m16661c(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m16664f(i, i2);
            }
            double d = m16662d(i) + 0.05d;
            double d2 = m16662d(i2) + 0.05d;
            return Math.max(d, d2) / Math.min(d, d2);
        }
        StringBuilder h = C0072d.m201h("background can not be translucent: #");
        h.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: d */
    public static double m16662d(int i) {
        ThreadLocal<double[]> threadLocal = f18318a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = ((double) red) / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) green) / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) blue) / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return d4 / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: e */
    public static int m16663e(float f, int i, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m16661c(m16666h(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m16661c(m16666h(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        StringBuilder h = C0072d.m201h("background can not be translucent: #");
        h.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(h.toString());
    }

    /* renamed from: f */
    public static int m16664f(int i, int i2) {
        int i3;
        int i4;
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i5 = 255 - alpha2;
        int i6 = 255 - (((255 - alpha) * i5) / 255);
        int red = Color.red(i);
        int red2 = Color.red(i2);
        int i7 = 0;
        if (i6 == 0) {
            i3 = 0;
        } else {
            i3 = (((red2 * alpha) * i5) + ((red * 255) * alpha2)) / (i6 * 255);
        }
        int green = Color.green(i);
        int green2 = Color.green(i2);
        if (i6 == 0) {
            i4 = 0;
        } else {
            i4 = (((green2 * alpha) * i5) + ((green * 255) * alpha2)) / (i6 * 255);
        }
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i6 != 0) {
            i7 = (((blue2 * alpha) * i5) + ((blue * 255) * alpha2)) / (i6 * 255);
        }
        return Color.argb(i6, i3, i4, i7);
    }

    /* renamed from: g */
    public static int m16665g(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* renamed from: h */
    public static int m16666h(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
