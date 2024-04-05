package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.BaselineShiftSpan */
public class BaselineShiftSpan extends MetricAffectingSpan {
    private final float multiplier;

    public BaselineShiftSpan(float f) {
        this.multiplier = f;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.multiplier)));
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.multiplier)));
    }
}
