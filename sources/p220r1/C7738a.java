package p220r1;

import android.view.animation.Interpolator;
import p003a2.C0023f;

/* renamed from: r1.a */
public abstract class C7738a implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public C7738a(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.mStepSize;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.mValues;
        float f4 = fArr2[min];
        return C0023f.m103b(fArr2[min + 1], f4, f3, f4);
    }
}
