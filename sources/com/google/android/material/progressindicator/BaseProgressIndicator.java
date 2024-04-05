package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.etsy.android.R;
import com.google.android.material.internal.C15367g;
import java.util.Arrays;
import java.util.WeakHashMap;
import p574gl.C17790a;
import p610kp.C18161c;
import p728zk.C18939a;
import p728zk.C18940b;
import p728zk.C18948h;
import p728zk.C18952i;

public abstract class BaseProgressIndicator<S extends C18940b> extends ProgressBar {
    public static final float DEFAULT_OPACITY = 0.2f;
    public static final int DEF_STYLE_RES = 2132018640;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    public static final int MAX_ALPHA = 255;
    public static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    public C18939a animatorDurationScaleProvider;
    private final Runnable delayedHide = new C15392b();
    private final Runnable delayedShow = new C15391a();
    private final Animatable2Compat.C3306a hideAnimationCallback = new C15394d();
    /* access modifiers changed from: private */
    public boolean isIndeterminateModeChangeRequested = false;
    private boolean isParentDoneInitializing;
    /* access modifiers changed from: private */
    public long lastShowStartTime = -1;
    private final int minHideDelay;
    private final int showDelay;
    public S spec;
    /* access modifiers changed from: private */
    public int storedProgress;
    /* access modifiers changed from: private */
    public boolean storedProgressAnimated;
    private final Animatable2Compat.C3306a switchIndeterminateModeCallback = new C15393c();
    /* access modifiers changed from: private */
    public int visibilityAfterHide = 4;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    public class C15391a implements Runnable {
        public C15391a() {
        }

        public final void run() {
            BaseProgressIndicator.this.internalShow();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    public class C15392b implements Runnable {
        public C15392b() {
        }

        public final void run() {
            BaseProgressIndicator.this.internalHide();
            long unused = BaseProgressIndicator.this.lastShowStartTime = -1;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    public class C15393c extends Animatable2Compat.C3306a {
        public C15393c() {
        }

        /* renamed from: a */
        public final void mo12418a() {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.storedProgress, BaseProgressIndicator.this.storedProgressAnimated);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    public class C15394d extends Animatable2Compat.C3306a {
        public C15394d() {
        }

        /* renamed from: a */
        public final void mo12418a() {
            if (!BaseProgressIndicator.this.isIndeterminateModeChangeRequested) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.visibilityAfterHide);
            }
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C17790a.m29918a(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        Context context2 = getContext();
        this.spec = createSpec(context2, attributeSet);
        TypedArray d = C15367g.m24957d(context2, attributeSet, C18161c.f39687f, i, i2, new int[0]);
        this.showDelay = d.getInt(5, -1);
        this.minHideDelay = Math.min(d.getInt(3, -1), 1000);
        d.recycle();
        this.animatorDurationScaleProvider = new C18939a();
        this.isParentDoneInitializing = true;
    }

    private C18952i<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().getDrawingDelegate();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().getDrawingDelegate();
        }
    }

    /* access modifiers changed from: private */
    public void internalHide() {
        ((C18948h) getCurrentDrawable()).setVisible(false, false, true);
        if (isNoLongerNeedToBeVisible()) {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public void internalShow() {
        if (this.minHideDelay > 0) {
            this.lastShowStartTime = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean isNoLongerNeedToBeVisible() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void registerAnimationCallbacks() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().getAnimatorDelegate().mo70386c(this.switchIndeterminateModeCallback);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
    }

    private void unregisterAnimationCallbacks() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
            getIndeterminateDrawable().getAnimatorDelegate().mo70389f();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
        }
    }

    public void applyNewVisibility(boolean z) {
        if (this.isParentDoneInitializing) {
            ((C18948h) getCurrentDrawable()).setVisible(visibleToUser(), false, z);
        }
    }

    public abstract S createSpec(Context context, AttributeSet attributeSet);

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.spec.f42229f;
    }

    public int[] getIndicatorColor() {
        return this.spec.f42226c;
    }

    public int getShowAnimationBehavior() {
        return this.spec.f42228e;
    }

    public int getTrackColor() {
        return this.spec.f42227d;
    }

    public int getTrackCornerRadius() {
        return this.spec.f42225b;
    }

    public int getTrackThickness() {
        return this.spec.f42224a;
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.delayedShow);
            return;
        }
        removeCallbacks(this.delayedHide);
        long uptimeMillis = SystemClock.uptimeMillis() - this.lastShowStartTime;
        int i = this.minHideDelay;
        if (uptimeMillis >= ((long) i)) {
            this.delayedHide.run();
        } else {
            postDelayed(this.delayedHide, ((long) i) - uptimeMillis);
        }
    }

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerAnimationCallbacks();
        if (visibleToUser()) {
            internalShow();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.delayedHide);
        removeCallbacks(this.delayedShow);
        ((C18948h) getCurrentDrawable()).hideNow();
        unregisterAnimationCallbacks();
        super.onDetachedFromWindow();
    }

    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C18952i currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo70381e();
            int d = currentDrawingDelegate.mo70380d();
            setMeasuredDimension(e < 0 ? getMeasuredWidth() : e + getPaddingLeft() + getPaddingRight(), d < 0 ? getMeasuredHeight() : d + getPaddingTop() + getPaddingBottom());
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        applyNewVisibility(i == 0);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        applyNewVisibility(false);
    }

    public void setAnimatorDurationScaleProvider(C18939a aVar) {
        this.animatorDurationScaleProvider = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().animatorDurationScaleProvider = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().animatorDurationScaleProvider = aVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.spec.f42229f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            C18948h hVar = (C18948h) getCurrentDrawable();
            if (hVar != null) {
                hVar.hideNow();
            }
            super.setIndeterminate(z);
            C18948h hVar2 = (C18948h) getCurrentDrawable();
            if (hVar2 != null) {
                hVar2.setVisible(visibleToUser(), false, false);
            }
            if ((hVar2 instanceof IndeterminateDrawable) && visibleToUser()) {
                ((IndeterminateDrawable) hVar2).getAnimatorDelegate().mo70388e();
            }
            this.isIndeterminateModeChangeRequested = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof IndeterminateDrawable) {
            ((C18948h) drawable).hideNow();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C1993m.m4343D(R.attr.colorPrimary, getContext(), -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.spec.f42226c = iArr;
            getIndeterminateDrawable().getAnimatorDelegate().mo70385b();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            setProgressCompat(i, false);
        }
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.storedProgress = i;
            this.storedProgressAnimated = z;
            this.isIndeterminateModeChangeRequested = true;
            if (getIndeterminateDrawable().isVisible()) {
                C18939a aVar = this.animatorDurationScaleProvider;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().getAnimatorDelegate().mo70387d();
                    return;
                }
            }
            Animatable2Compat.C3306a aVar2 = this.switchIndeterminateModeCallback;
            getIndeterminateDrawable();
            aVar2.mo12418a();
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof DeterminateDrawable) {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.hideNow();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevelByFraction(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.spec.f42228e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.spec;
        if (s.f42227d != i) {
            s.f42227d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.spec;
        if (s.f42225b != i) {
            s.f42225b = Math.min(i, s.f42224a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.spec;
        if (s.f42224a != i) {
            s.f42224a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.visibilityAfterHide = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public void show() {
        if (this.showDelay > 0) {
            removeCallbacks(this.delayedShow);
            postDelayed(this.delayedShow, (long) this.showDelay);
            return;
        }
        this.delayedShow.run();
    }

    public boolean visibleToUser() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2371g.m5245b(this) && getWindowVisibility() == 0 && isEffectivelyVisible();
    }

    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
