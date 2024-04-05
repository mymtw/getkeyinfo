package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.activity.C0114h;

public class FixedSizeDrawable extends Drawable {
    private final RectF bounds;
    private final Matrix matrix;
    private boolean mutated;
    private C6131a state;
    private Drawable wrapped;
    private final RectF wrappedRect;

    /* renamed from: com.bumptech.glide.request.target.FixedSizeDrawable$a */
    public static final class C6131a extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f13244a;

        /* renamed from: b */
        public final int f13245b;

        /* renamed from: c */
        public final int f13246c;

        public C6131a(Drawable.ConstantState constantState, int i, int i2) {
            this.f13244a = constantState;
            this.f13245b = i;
            this.f13246c = i2;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new FixedSizeDrawable(this, this.f13244a.newDrawable());
        }

        public final Drawable newDrawable(Resources resources) {
            return new FixedSizeDrawable(this, this.f13244a.newDrawable(resources));
        }
    }

    public FixedSizeDrawable(Drawable drawable, int i, int i2) {
        this(new C6131a(drawable.getConstantState(), i, i2), drawable);
    }

    private void updateMatrix() {
        this.matrix.setRectToRect(this.wrappedRect, this.bounds, Matrix.ScaleToFit.CENTER);
    }

    public void clearColorFilter() {
        this.wrapped.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.concat(this.matrix);
        this.wrapped.draw(canvas);
        canvas.restore();
    }

    public int getAlpha() {
        return this.wrapped.getAlpha();
    }

    public Drawable.Callback getCallback() {
        return this.wrapped.getCallback();
    }

    public int getChangingConfigurations() {
        return this.wrapped.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        return this.state;
    }

    public Drawable getCurrent() {
        return this.wrapped.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.state.f13246c;
    }

    public int getIntrinsicWidth() {
        return this.state.f13245b;
    }

    public int getMinimumHeight() {
        return this.wrapped.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.wrapped.getMinimumWidth();
    }

    public int getOpacity() {
        return this.wrapped.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.wrapped.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.wrapped.invalidateSelf();
    }

    public Drawable mutate() {
        if (!this.mutated && super.mutate() == this) {
            this.wrapped = this.wrapped.mutate();
            C6131a aVar = this.state;
            this.state = new C6131a(aVar.f13244a, aVar.f13245b, aVar.f13246c);
            this.mutated = true;
        }
        return this;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.wrapped.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.wrapped.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.bounds.set((float) i, (float) i2, (float) i3, (float) i4);
        updateMatrix();
    }

    public void setChangingConfigurations(int i) {
        this.wrapped.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.wrapped.setColorFilter(i, mode);
    }

    @Deprecated
    public void setDither(boolean z) {
        this.wrapped.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.wrapped.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.wrapped.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.wrapped.unscheduleSelf(runnable);
    }

    public FixedSizeDrawable(C6131a aVar, Drawable drawable) {
        C0114h.m281L(aVar);
        this.state = aVar;
        C0114h.m281L(drawable);
        this.wrapped = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.matrix = new Matrix();
        this.wrappedRect = new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        this.bounds = new RectF();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.wrapped.setColorFilter(colorFilter);
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.bounds.set(rect);
        updateMatrix();
    }
}
