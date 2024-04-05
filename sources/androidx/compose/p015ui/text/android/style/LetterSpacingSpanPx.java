package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.LetterSpacingSpanPx */
public final class LetterSpacingSpanPx extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpanPx(float f) {
        this.letterSpacing = f;
    }

    private final void updatePaint(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (!(textScaleX == 0.0f)) {
            textPaint.setLetterSpacing(this.letterSpacing / textScaleX);
        }
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        updatePaint(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        updatePaint(textPaint);
    }
}
