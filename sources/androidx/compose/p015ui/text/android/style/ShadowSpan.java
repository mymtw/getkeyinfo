package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.style.ShadowSpan */
public final class ShadowSpan extends CharacterStyle {
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowSpan(int i, float f, float f2, float f3) {
        this.color = i;
        this.offsetX = f;
        this.offsetY = f2;
        this.radius = f3;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public void updateDrawState(TextPaint textPaint) {
        C19383o.m32797g(textPaint, "tp");
        textPaint.setShadowLayer(this.radius, this.offsetX, this.offsetY, this.color);
    }
}
