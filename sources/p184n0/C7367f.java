package p184n0;

import android.support.p013v4.media.C0072d;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Arrays;

/* renamed from: n0.f */
public final class C7367f {

    /* renamed from: a */
    public float[] f16420a = new float[0];

    /* renamed from: b */
    public double[] f16421b = new double[0];

    /* renamed from: c */
    public double[] f16422c;

    /* renamed from: d */
    public int f16423d;

    /* renamed from: a */
    public final void mo19659a(double d, float f) {
        int length = this.f16420a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f16421b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f16421b = Arrays.copyOf(this.f16421b, length);
        this.f16420a = Arrays.copyOf(this.f16420a, length);
        this.f16422c = new double[length];
        double[] dArr = this.f16421b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f16421b[binarySearch] = d;
        this.f16420a[binarySearch] = f;
    }

    /* renamed from: b */
    public final double mo19660b(double d) {
        if (d <= ShadowDrawableWrapper.COS_45) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f16421b, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return ShadowDrawableWrapper.COS_45;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f16420a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = (double) (f - f2);
        double[] dArr = this.f16421b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return (((double) f2) - (d5 * d4)) + (d * d5);
    }

    /* renamed from: c */
    public final double mo19661c(double d) {
        if (d < ShadowDrawableWrapper.COS_45) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f16421b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return ShadowDrawableWrapper.COS_45;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f16420a;
        float f = fArr[i];
        int i2 = i - 1;
        float f2 = fArr[i2];
        double d2 = (double) (f - f2);
        double[] dArr = this.f16421b;
        double d3 = dArr[i];
        double d4 = dArr[i2];
        double d5 = d2 / (d3 - d4);
        return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + ((d - d4) * (((double) f2) - (d5 * d4))) + this.f16422c[i2];
    }

    /* renamed from: d */
    public final double mo19662d(double d) {
        double d2;
        switch (this.f16423d) {
            case 1:
                return Math.signum(0.5d - (mo19661c(d) % 1.0d));
            case 2:
                d2 = Math.abs((((mo19661c(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((mo19661c(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                d2 = ((mo19661c(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(mo19661c(d) * 6.283185307179586d);
            case 6:
                double abs = 1.0d - Math.abs(((mo19661c(d) * 4.0d) % 4.0d) - 2.0d);
                d2 = abs * abs;
                break;
            default:
                return Math.sin(mo19661c(d) * 6.283185307179586d);
        }
        return 1.0d - d2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("pos =");
        h.append(Arrays.toString(this.f16421b));
        h.append(" period=");
        h.append(Arrays.toString(this.f16420a));
        return h.toString();
    }
}
