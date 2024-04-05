package p548dj;

import android.opengl.Matrix;
import p513bj.C14085x;

/* renamed from: dj.c */
public final class C17562c {

    /* renamed from: a */
    public final float[] f38398a = new float[16];

    /* renamed from: b */
    public final float[] f38399b = new float[16];

    /* renamed from: c */
    public final C14085x<float[]> f38400c = new C14085x<>();

    /* renamed from: d */
    public boolean f38401d;

    /* renamed from: a */
    public static void m29435a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }
}
