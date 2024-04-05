package androidx.compose.p015ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.TypefaceSpan */
public final class TypefaceSpan extends MetricAffectingSpan {
    private final Typeface typeface;

    public TypefaceSpan(Typeface typeface2) {
        C19383o.m32797g(typeface2, "typeface");
        this.typeface = typeface2;
    }

    private final void updateTypeface(Paint paint) {
        paint.setTypeface(this.typeface);
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "ds");
        updateTypeface(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "paint");
        updateTypeface(textPaint);
    }
}
