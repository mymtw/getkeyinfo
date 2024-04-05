package com.etsy.android.uikit.text.typeface;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

public final class CustomTypefaceSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final Typeface font;

    public CustomTypefaceSpan(Typeface typeface) {
        this.font = typeface;
    }

    private final void update(TextPaint textPaint) {
        C19383o.m32794d(textPaint);
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface(Typeface.create(this.font, typeface != null ? typeface.getStyle() : 0));
    }

    public final Typeface getFont() {
        return this.font;
    }

    public void updateDrawState(TextPaint textPaint) {
        update(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        update(textPaint);
    }
}
