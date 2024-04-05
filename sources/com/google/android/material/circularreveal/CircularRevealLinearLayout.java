package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.circularreveal.CircularRevealWidget;

public class CircularRevealLinearLayout extends LinearLayout implements CircularRevealWidget {
    private final C15250b helper;

    public CircularRevealLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    public void buildCircularRevealCache() {
        this.helper.getClass();
    }

    public void destroyCircularRevealCache() {
        this.helper.getClass();
    }

    public void draw(Canvas canvas) {
        C15250b bVar = this.helper;
        if (bVar != null) {
            bVar.mo53729a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.helper.f34205e;
    }

    public int getCircularRevealScrimColor() {
        return this.helper.mo53730b();
    }

    public CircularRevealWidget.C15248a getRevealInfo() {
        return this.helper.mo53731c();
    }

    public boolean isOpaque() {
        C15250b bVar = this.helper;
        return bVar != null ? bVar.mo53732d() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.helper.mo53733e(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.helper.mo53734f(i);
    }

    public void setRevealInfo(CircularRevealWidget.C15248a aVar) {
        this.helper.mo53735g(aVar);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.helper = new C15250b(this);
    }
}
