package com.etsy.android.uikit.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class TopAlignedCompoundDrawable extends Drawable {
    private final Drawable mDrawable;

    public TopAlignedCompoundDrawable(Drawable drawable) {
        this.mDrawable = drawable;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.mDrawable;
        canvas.save();
        canvas.translate(0.0f, (float) ((-(canvas.getHeight() >> 1)) + (drawable.getIntrinsicHeight() >> 1)));
        drawable.draw(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    public void setAlpha(int i) {
        this.mDrawable.setAlpha(i);
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.mDrawable.setBounds(rect);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.mDrawable.setBounds(i, i2, i3, i4);
    }
}
