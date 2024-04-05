package com.paypal.pyplcheckout.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.C19383o;

public final class WhiteSpaceSpan extends ReplacementSpan {
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C19383o.m32797g(canvas, "canvas");
        C19383o.m32797g(paint, "paint");
        if (!(charSequence == null || charSequence.length() == 0)) {
            canvas.drawText(charSequence.subSequence(i, i2) + " ", f, (float) i4, paint);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C19383o.m32797g(paint, "paint");
        return (int) (paint.measureText(charSequence, i, i2) + paint.measureText(" ", 0, 1));
    }
}
