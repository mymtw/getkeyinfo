package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import p003a2.C0023f;

public class ArgbEvaluator implements TypeEvaluator {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float b = C0023f.m103b(((float) ((intValue2 >> 24) & 255)) / 255.0f, f2, f, f2);
        float b2 = C0023f.m103b(pow4, pow, f, pow);
        float b3 = C0023f.m103b((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d), pow2, f, pow2);
        float b4 = C0023f.m103b((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow((double) b2, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow((double) b4, 0.45454545454545453d)) * 255.0f) | round | (Math.round(b * 255.0f) << 24) | (Math.round(((float) Math.pow((double) b3, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
