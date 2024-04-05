package androidx.compose.p015ui.text.android.style;

import android.graphics.Paint;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.LineHeightSpan */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    private final float lineHeight;

    public LineHeightSpan(float f) {
        this.lineHeight = f;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        C19383o.m32797g(charSequence, "text");
        C19383o.m32797g(fontMetricsInt, "fontMetricsInt");
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.lineHeight));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) i5))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}
