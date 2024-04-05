package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import p515bl.C14091a;
import p550dl.C17585k;

public class RippleDrawableCompat extends Drawable implements C17585k {
    private C15397b drawableState;

    public void draw(Canvas canvas) {
        C15397b bVar = this.drawableState;
        if (bVar.f34546b) {
            bVar.f34545a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public int getOpacity() {
        return this.drawableState.f34545a.getOpacity();
    }

    public C15401a getShapeAppearanceModel() {
        return this.drawableState.f34545a.getShapeAppearanceModel();
    }

    public boolean isStateful() {
        return true;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawableState.f34545a.setBounds(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.drawableState.f34545a.setState(iArr)) {
            onStateChange = true;
        }
        boolean d = C14091a.m21810d(iArr);
        C15397b bVar = this.drawableState;
        if (bVar.f34546b == d) {
            return onStateChange;
        }
        bVar.f34546b = d;
        return true;
    }

    public void setAlpha(int i) {
        this.drawableState.f34545a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.f34545a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C15401a aVar) {
        this.drawableState.f34545a.setShapeAppearanceModel(aVar);
    }

    public void setTint(int i) {
        this.drawableState.f34545a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.f34545a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.drawableState.f34545a.setTintMode(mode);
    }

    public RippleDrawableCompat(C15401a aVar) {
        this(new C15397b(new MaterialShapeDrawable(aVar)));
    }

    public RippleDrawableCompat mutate() {
        this.drawableState = new C15397b(this.drawableState);
        return this;
    }

    /* renamed from: com.google.android.material.ripple.RippleDrawableCompat$b */
    public static final class C15397b extends Drawable.ConstantState {

        /* renamed from: a */
        public MaterialShapeDrawable f34545a;

        /* renamed from: b */
        public boolean f34546b;

        public C15397b(MaterialShapeDrawable materialShapeDrawable) {
            this.f34545a = materialShapeDrawable;
            this.f34546b = false;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new RippleDrawableCompat(new C15397b(this));
        }

        public C15397b(C15397b bVar) {
            this.f34545a = (MaterialShapeDrawable) bVar.f34545a.getConstantState().newDrawable();
            this.f34546b = bVar.f34546b;
        }
    }

    private RippleDrawableCompat(C15397b bVar) {
        this.drawableState = bVar;
    }
}
