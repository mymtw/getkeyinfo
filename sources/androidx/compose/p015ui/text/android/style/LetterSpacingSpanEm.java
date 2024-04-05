package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.LetterSpacingSpanEm */
public final class LetterSpacingSpanEm extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpanEm(float f) {
        this.letterSpacing = f;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.letterSpacing);
    }
}
