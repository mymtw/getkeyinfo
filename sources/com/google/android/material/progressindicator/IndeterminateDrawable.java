package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import p728zk.C18939a;
import p728zk.C18940b;
import p728zk.C18941c;
import p728zk.C18944f;
import p728zk.C18947g;
import p728zk.C18948h;
import p728zk.C18952i;
import p728zk.C18953j;
import p728zk.C18954k;
import p728zk.C18956m;
import p728zk.C18960p;
import p728zk.C18962q;

public final class IndeterminateDrawable<S extends C18940b> extends C18948h {
    private C18953j<ObjectAnimator> animatorDelegate;
    private C18952i<S> drawingDelegate;

    public IndeterminateDrawable(Context context, C18940b bVar, C18952i<S> iVar, C18953j<ObjectAnimator> jVar) {
        super(context, bVar);
        setDrawingDelegate(iVar);
        setAnimatorDelegate(jVar);
    }

    public static IndeterminateDrawable<C18947g> createCircularDrawable(Context context, C18947g gVar) {
        return new IndeterminateDrawable<>(context, gVar, new C18941c(gVar), new C18944f(gVar));
    }

    public static IndeterminateDrawable<C18962q> createLinearDrawable(Context context, C18962q qVar) {
        return new IndeterminateDrawable<>(context, qVar, new C18954k(qVar), qVar.f42283g == 0 ? new C18956m(qVar) : new C18960p(context, qVar));
    }

    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            C18952i<S> iVar = this.drawingDelegate;
            float growFraction = getGrowFraction();
            iVar.f42254a.mo70376a();
            iVar.mo70377a(canvas, growFraction);
            this.drawingDelegate.mo70379c(canvas, this.paint);
            int i = 0;
            while (true) {
                C18953j<ObjectAnimator> jVar = this.animatorDelegate;
                int[] iArr = jVar.f42258c;
                if (i < iArr.length) {
                    C18952i<S> iVar2 = this.drawingDelegate;
                    Paint paint = this.paint;
                    float[] fArr = jVar.f42257b;
                    int i2 = i * 2;
                    iVar2.mo70378b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public C18953j<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    public C18952i<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    public int getIntrinsicHeight() {
        return this.drawingDelegate.mo70380d();
    }

    public int getIntrinsicWidth() {
        return this.drawingDelegate.mo70381e();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    public /* bridge */ /* synthetic */ void registerAnimationCallback(Animatable2Compat.C3306a aVar) {
        super.registerAnimationCallback(aVar);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public void setAnimatorDelegate(C18953j<ObjectAnimator> jVar) {
        this.animatorDelegate = jVar;
        jVar.f42256a = this;
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(C18952i<S> iVar) {
        this.drawingDelegate = iVar;
        iVar.f42255b = this;
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        if (!isRunning()) {
            this.animatorDelegate.mo70384a();
        }
        C18939a aVar = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.animatorDelegate.mo70388e();
        }
        return visibleInternal;
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(Animatable2Compat.C3306a aVar) {
        return super.unregisterAnimationCallback(aVar);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }
}
