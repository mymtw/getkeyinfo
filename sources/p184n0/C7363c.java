package p184n0;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Arrays;

/* renamed from: n0.c */
public class C7363c {

    /* renamed from: b */
    public static C7363c f16408b = new C7363c();

    /* renamed from: c */
    public static String[] f16409c = {"standard", "accelerate", "decelerate", ResponseConstants.LINEAR};

    /* renamed from: a */
    public String f16410a = "identity";

    /* renamed from: n0.c$a */
    public static class C7364a extends C7363c {

        /* renamed from: d */
        public double f16411d;

        /* renamed from: e */
        public double f16412e;

        /* renamed from: f */
        public double f16413f;

        /* renamed from: g */
        public double f16414g;

        public C7364a(String str) {
            this.f16410a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f16411d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f16412e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f16413f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f16414g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: a */
        public final double mo19654a(double d) {
            if (d <= ShadowDrawableWrapper.COS_45) {
                return ShadowDrawableWrapper.COS_45;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = mo19657d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = mo19657d(d4);
            double d6 = d3 + d2;
            double d7 = mo19657d(d6);
            double e = mo19658e(d4);
            return (((d - d5) * (mo19658e(d6) - e)) / (d7 - d5)) + e;
        }

        /* renamed from: b */
        public final double mo19655b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = mo19657d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (mo19658e(d5) - mo19658e(d4)) / (mo19657d(d5) - mo19657d(d4));
        }

        /* renamed from: d */
        public final double mo19657d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f16413f * d5) + (this.f16411d * d4) + (d * d * d);
        }

        /* renamed from: e */
        public final double mo19658e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f16414g * d5) + (this.f16412e * d4) + (d * d * d);
        }
    }

    /* renamed from: c */
    public static C7363c m14180c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C7364a(str);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(ResponseConstants.LINEAR)) {
                    c = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C7364a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C7364a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C7364a("cubic(1, 1, 0, 0)");
            case 3:
                return new C7364a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                StringBuilder h = C0072d.m201h("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                h.append(Arrays.toString(f16409c));
                Log.e("ConstraintSet", h.toString());
                return f16408b;
        }
    }

    /* renamed from: a */
    public double mo19654a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo19655b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.f16410a;
    }
}
