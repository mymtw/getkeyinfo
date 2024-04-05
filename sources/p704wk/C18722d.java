package p704wk;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* renamed from: wk.d */
public final class C18722d implements TypeEvaluator<Float> {

    /* renamed from: a */
    public FloatEvaluator f41495a = new FloatEvaluator();

    public final Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.f41495a.evaluate(f, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
