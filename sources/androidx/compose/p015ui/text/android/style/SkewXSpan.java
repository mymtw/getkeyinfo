package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.SkewXSpan */
public class SkewXSpan extends MetricAffectingSpan {
    private final float skewX;

    public SkewXSpan(float f) {
        this.skewX = f;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.skewX);
    }
}
