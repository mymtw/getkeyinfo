package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import p166l1.C7218b;
import p166l1.C7232c;
import p166l1.C7233d;
import p166l1.C7234e;
import p728zk.C18939a;
import p728zk.C18940b;
import p728zk.C18941c;
import p728zk.C18947g;
import p728zk.C18948h;
import p728zk.C18952i;
import p728zk.C18954k;
import p728zk.C18962q;

public final class DeterminateDrawable<S extends C18940b> extends C18948h {
    private static final C7232c<DeterminateDrawable> INDICATOR_LENGTH_IN_LEVEL = new C15395a();
    private static final int MAX_DRAWABLE_LEVEL = 10000;
    private static final float SPRING_FORCE_STIFFNESS = 50.0f;
    private C18952i<S> drawingDelegate;
    private float indicatorFraction;
    private boolean skipAnimationOnLevelChange = false;
    private final C7233d springAnimation;
    private final C7234e springForce;

    /* renamed from: com.google.android.material.progressindicator.DeterminateDrawable$a */
    public static class C15395a extends C7232c<DeterminateDrawable> {
        /* renamed from: a */
        public final float mo19502a(Object obj) {
            return ((DeterminateDrawable) obj).getIndicatorFraction() * 10000.0f;
        }

        /* renamed from: b */
        public final void mo19503b(float f, Object obj) {
            ((DeterminateDrawable) obj).setIndicatorFraction(f / 10000.0f);
        }
    }

    public DeterminateDrawable(Context context, C18940b bVar, C18952i<S> iVar) {
        super(context, bVar);
        setDrawingDelegate(iVar);
        C7234e eVar = new C7234e();
        this.springForce = eVar;
        eVar.f16043b = (double) 1.0f;
        eVar.f16044c = false;
        eVar.f16042a = Math.sqrt((double) SPRING_FORCE_STIFFNESS);
        eVar.f16044c = false;
        C7233d dVar = new C7233d(this, INDICATOR_LENGTH_IN_LEVEL);
        this.springAnimation = dVar;
        dVar.f16039u = eVar;
        setGrowFraction(1.0f);
    }

    public static DeterminateDrawable<C18947g> createCircularDrawable(Context context, C18947g gVar) {
        return new DeterminateDrawable<>(context, gVar, new C18941c(gVar));
    }

    public static DeterminateDrawable<C18962q> createLinearDrawable(Context context, C18962q qVar) {
        return new DeterminateDrawable<>(context, qVar, new C18954k(qVar));
    }

    /* access modifiers changed from: private */
    public float getIndicatorFraction() {
        return this.indicatorFraction;
    }

    /* access modifiers changed from: private */
    public void setIndicatorFraction(float f) {
        this.indicatorFraction = f;
        invalidateSelf();
    }

    public void addSpringAnimationEndListener(C7218b.C7229k kVar) {
        C7233d dVar = this.springAnimation;
        if (!dVar.f16035j.contains(kVar)) {
            dVar.f16035j.add(kVar);
        }
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
            Canvas canvas2 = canvas;
            this.drawingDelegate.mo70378b(canvas2, this.paint, 0.0f, getIndicatorFraction(), C1993m.m4375u(this.baseSpec.f42226c[0], getAlpha()));
            canvas.restore();
        }
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
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

    public void jumpToCurrentState() {
        this.springAnimation.mo19507d();
        setIndicatorFraction(((float) getLevel()) / 10000.0f);
    }

    public boolean onLevelChange(int i) {
        if (this.skipAnimationOnLevelChange) {
            this.springAnimation.mo19507d();
            setIndicatorFraction(((float) i) / 10000.0f);
        } else {
            C7233d dVar = this.springAnimation;
            dVar.f16027b = getIndicatorFraction() * 10000.0f;
            dVar.f16028c = true;
            this.springAnimation.mo19506c((float) i);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void registerAnimationCallback(Animatable2Compat.C3306a aVar) {
        super.registerAnimationCallback(aVar);
    }

    public void removeSpringAnimationEndListener(C7218b.C7229k kVar) {
        ArrayList<C7218b.C7229k> arrayList = this.springAnimation.f16035j;
        int indexOf = arrayList.indexOf(kVar);
        if (indexOf >= 0) {
            arrayList.set(indexOf, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(C18952i<S> iVar) {
        this.drawingDelegate = iVar;
        iVar.f42255b = this;
    }

    public void setLevelByFraction(float f) {
        setLevel((int) (f * 10000.0f));
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        boolean visibleInternal = super.setVisibleInternal(z, z2, z3);
        C18939a aVar = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        aVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.skipAnimationOnLevelChange = true;
        } else {
            this.skipAnimationOnLevelChange = false;
            C7234e eVar = this.springForce;
            float f2 = SPRING_FORCE_STIFFNESS / f;
            eVar.getClass();
            if (f2 > 0.0f) {
                eVar.f16042a = Math.sqrt((double) f2);
                eVar.f16044c = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
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
