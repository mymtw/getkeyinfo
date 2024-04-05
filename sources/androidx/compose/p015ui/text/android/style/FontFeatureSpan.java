package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.FontFeatureSpan */
public final class FontFeatureSpan extends MetricAffectingSpan {
    private final String fontFeatureSettings;

    public FontFeatureSpan(String str) {
        C19383o.m32797g(str, "fontFeatureSettings");
        this.fontFeatureSettings = str;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }
}
