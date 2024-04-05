package p728zk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.List;
import p629nk.C18268a;

/* renamed from: zk.h */
public abstract class C18948h extends Drawable implements Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final int GROW_DURATION = 500;
    private static final Property<C18948h, Float> GROW_FRACTION = new C18951c();
    private List<Animatable2Compat.C3306a> animationCallbacks;
    public C18939a animatorDurationScaleProvider;
    public final C18940b baseSpec;
    public final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private Animatable2Compat.C3306a internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    public final Paint paint = new Paint();
    private ValueAnimator showAnimator;
    private int totalAlpha;

    /* renamed from: zk.h$a */
    public class C18949a extends AnimatorListenerAdapter {
        public C18949a() {
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C18948h.this.dispatchAnimationStart();
        }
    }

    /* renamed from: zk.h$b */
    public class C18950b extends AnimatorListenerAdapter {
        public C18950b() {
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = C18948h.super.setVisible(false, false);
            C18948h.this.dispatchAnimationEnd();
        }
    }

    /* renamed from: zk.h$c */
    public static class C18951c extends Property<C18948h, Float> {
        public C18951c() {
            super(Float.class, "growFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((C18948h) obj).getGrowFraction());
        }

        public final void set(Object obj, Object obj2) {
            ((C18948h) obj).setGrowFraction(((Float) obj2).floatValue());
        }
    }

    public C18948h(Context context2, C18940b bVar) {
        this.context = context2;
        this.baseSpec = bVar;
        this.animatorDurationScaleProvider = new C18939a();
        setAlpha(255);
    }

    /* access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        Animatable2Compat.C3306a aVar = this.internalAnimationCallback;
        if (aVar != null) {
            aVar.mo12418a();
        }
        List<Animatable2Compat.C3306a> list = this.animationCallbacks;
        if (list != null && !this.ignoreCallbacks) {
            for (Animatable2Compat.C3306a a : list) {
                a.mo12418a();
            }
        }
    }

    /* access modifiers changed from: private */
    public void dispatchAnimationStart() {
        Animatable2Compat.C3306a aVar = this.internalAnimationCallback;
        if (aVar != null) {
            aVar.getClass();
        }
        List<Animatable2Compat.C3306a> list = this.animationCallbacks;
        if (list != null && !this.ignoreCallbacks) {
            for (Animatable2Compat.C3306a aVar2 : list) {
                aVar2.getClass();
            }
        }
    }

    private void endAnimatorWithoutCallbacks(ValueAnimator... valueAnimatorArr) {
        boolean z = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.ignoreCallbacks = z;
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, GROW_FRACTION, new float[]{0.0f, 1.0f});
            this.showAnimator = ofFloat;
            ofFloat.setDuration(500);
            this.showAnimator.setInterpolator(C18268a.f40092b);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, GROW_FRACTION, new float[]{1.0f, 0.0f});
            this.hideAnimator = ofFloat2;
            ofFloat2.setDuration(500);
            this.hideAnimator.setInterpolator(C18268a.f40092b);
            setHideAnimator(this.hideAnimator);
        }
    }

    private void setHideAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.hideAnimator = valueAnimator;
            valueAnimator.addListener(new C18950b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    private void setShowAnimator(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.showAnimator = valueAnimator;
            valueAnimator.addListener(new C18949a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    public int getAlpha() {
        return this.totalAlpha;
    }

    public float getGrowFraction() {
        C18940b bVar = this.baseSpec;
        boolean z = true;
        if (!(bVar.f42228e != 0)) {
            if (bVar.f42229f == 0) {
                z = false;
            }
            if (!z) {
                return 1.0f;
            }
        }
        return (this.mockHideAnimationRunning || this.mockShowAnimationRunning) ? this.mockGrowFraction : this.growFraction;
    }

    public ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.hideAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning;
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.showAnimator;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning;
    }

    public void registerAnimationCallback(Animatable2Compat.C3306a aVar) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (!this.animationCallbacks.contains(aVar)) {
            this.animationCallbacks.add(aVar);
        }
    }

    public void setAlpha(int i) {
        this.totalAlpha = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowFraction(float f) {
        if (this.growFraction != f) {
            this.growFraction = f;
            invalidateSelf();
        }
    }

    public void setInternalAnimationCallback(Animatable2Compat.C3306a aVar) {
        this.internalAnimationCallback = aVar;
    }

    public void setMockHideAnimationRunning(boolean z, float f) {
        this.mockHideAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    public void setMockShowAnimationRunning(boolean z, float f) {
        this.mockShowAnimationRunning = z;
        this.mockGrowFraction = f;
    }

    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }

    public boolean setVisibleInternal(boolean z, boolean z2, boolean z3) {
        maybeInitializeAnimators();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.showAnimator : this.hideAnimator;
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            boolean z4 = !z || super.setVisible(z, false);
            if (!(!z ? this.baseSpec.f42229f != 0 : this.baseSpec.f42228e != 0)) {
                endAnimatorWithoutCallbacks(valueAnimator);
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean unregisterAnimationCallback(Animatable2Compat.C3306a aVar) {
        List<Animatable2Compat.C3306a> list = this.animationCallbacks;
        if (list == null || !list.contains(aVar)) {
            return false;
        }
        this.animationCallbacks.remove(aVar);
        if (!this.animationCallbacks.isEmpty()) {
            return true;
        }
        this.animationCallbacks = null;
        return true;
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        C18939a aVar = this.animatorDurationScaleProvider;
        ContentResolver contentResolver = this.context.getContentResolver();
        aVar.getClass();
        return setVisibleInternal(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }
}
