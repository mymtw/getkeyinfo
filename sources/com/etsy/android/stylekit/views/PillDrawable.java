package com.etsy.android.stylekit.views;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C19383o;

public final class PillDrawable extends Drawable {
    public static final int $stable = 8;
    private final Paint paint;

    public PillDrawable(int i) {
        Paint paint2 = new Paint();
        paint2.setColor(i);
        paint2.setAntiAlias(true);
        this.paint = paint2;
    }

    public void draw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        float height = (float) getBounds().height();
        float f = height / 2.0f;
        canvas.drawCircle(f, f, f, this.paint);
        float width = ((float) getBounds().width()) - f;
        canvas.drawCircle(width, f, f, this.paint);
        canvas.drawRect(f, 0.0f, width, height, this.paint);
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setPaintColor(int i) {
        this.paint.setColor(i);
        invalidateSelf();
    }
}
