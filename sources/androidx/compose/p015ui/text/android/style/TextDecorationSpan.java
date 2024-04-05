package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.TextDecorationSpan */
public final class TextDecorationSpan extends CharacterStyle {
    private final boolean isStrikethroughText;
    private final boolean isUnderlineText;

    public TextDecorationSpan(boolean z, boolean z2) {
        this.isUnderlineText = z;
        this.isStrikethroughText = z2;
    }

    public final boolean isStrikethroughText() {
        return this.isStrikethroughText;
    }

    public final boolean isUnderlineText() {
        return this.isUnderlineText;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "textPaint");
        textPaint.setUnderlineText(this.isUnderlineText);
        textPaint.setStrikeThruText(this.isStrikethroughText);
    }
}
