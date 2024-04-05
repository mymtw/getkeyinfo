package com.etsy.android.uikit.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.p015ui.text.input.C1993m;
import p260v0.C8184a;

public class ForegroundImageView extends AppCompatImageView {
    private Drawable foreground;

    public ForegroundImageView(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1993m.f4492g);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                setForegroundCompat(drawable);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.foreground;
        if (drawable != null && drawable.isStateful()) {
            this.foreground.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            invalidate();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            invalidate();
        }
    }

    public void setForegroundCompat(Drawable drawable) {
        super.setForeground(drawable);
    }

    public void setForegroundResource(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setForegroundCompat(C8184a.C8187c.m16466b(context, i));
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.foreground;
    }

    public ForegroundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public ForegroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }
}
