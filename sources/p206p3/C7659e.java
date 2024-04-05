package p206p3;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;
import p772tq.C20203a;

/* renamed from: p3.e */
public final class C7659e {

    /* renamed from: a */
    public static final PathMeasure f16963a = new PathMeasure();

    /* renamed from: b */
    public static final Path f16964b = new Path();

    /* renamed from: c */
    public static final Path f16965c = new Path();

    /* renamed from: d */
    public static final float[] f16966d = new float[4];

    /* renamed from: e */
    public static final float f16967e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    public static float f16968f = -1.0f;

    /* renamed from: a */
    public static void m14700a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = f16963a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C20203a.m34518A();
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C20203a.m34518A();
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C7658d.m14698c(min, length);
                max = (float) C7658d.m14698c(max, length);
            }
            if (min < 0.0f) {
                min = (float) C7658d.m14698c(min, length);
            }
            if (max < 0.0f) {
                max = (float) C7658d.m14698c(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C20203a.m34518A();
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            Path path2 = f16964b;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                Path path3 = f16965c;
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                Path path4 = f16965c;
                path4.reset();
                pathMeasure.getSegment(min + length, length, path4, true);
                path2.addPath(path4);
            }
            path.set(path2);
            C20203a.m34518A();
        }
    }

    /* renamed from: b */
    public static void m14701b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static float m14702c() {
        if (f16968f == -1.0f) {
            f16968f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f16968f;
    }

    /* renamed from: d */
    public static float m14703d(Matrix matrix) {
        float[] fArr = f16966d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f16967e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return ((float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]))) / 2.0f;
    }
}
