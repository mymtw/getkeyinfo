package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

public abstract class AutoScrollHelper implements View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    public boolean mAnimating;
    private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mMaximumVelocity = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mMinimumVelocity = {0.0f, 0.0f};
    public boolean mNeedsCancel;
    public boolean mNeedsReset;
    private float[] mRelativeEdges = {0.0f, 0.0f};
    private float[] mRelativeVelocity = {0.0f, 0.0f};
    private Runnable mRunnable;
    public final C2388a mScroller = new C2388a();
    public final View mTarget;

    /* renamed from: androidx.core.widget.AutoScrollHelper$a */
    public static class C2388a {

        /* renamed from: a */
        public int f5665a;

        /* renamed from: b */
        public int f5666b;

        /* renamed from: c */
        public float f5667c;

        /* renamed from: d */
        public float f5668d;

        /* renamed from: e */
        public long f5669e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f5670f = 0;

        /* renamed from: g */
        public long f5671g = -1;

        /* renamed from: h */
        public float f5672h;

        /* renamed from: i */
        public int f5673i;

        /* renamed from: a */
        public final float mo9012a(long j) {
            long j2 = this.f5669e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f5671g;
            if (j3 < 0 || j < j3) {
                return AutoScrollHelper.constrain(((float) (j - j2)) / ((float) this.f5665a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f5672h;
            return (AutoScrollHelper.constrain(((float) (j - j3)) / ((float) this.f5673i), 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    /* renamed from: androidx.core.widget.AutoScrollHelper$b */
    public class C2389b implements Runnable {
        public C2389b() {
        }

        public final void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.mAnimating) {
                if (autoScrollHelper.mNeedsReset) {
                    autoScrollHelper.mNeedsReset = false;
                    C2388a aVar = autoScrollHelper.mScroller;
                    aVar.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f5669e = currentAnimationTimeMillis;
                    aVar.f5671g = -1;
                    aVar.f5670f = currentAnimationTimeMillis;
                    aVar.f5672h = 0.5f;
                }
                C2388a aVar2 = AutoScrollHelper.this.mScroller;
                if ((aVar2.f5671g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f5671g + ((long) aVar2.f5673i)) || !AutoScrollHelper.this.shouldAnimate()) {
                    AutoScrollHelper.this.mAnimating = false;
                    return;
                }
                AutoScrollHelper autoScrollHelper2 = AutoScrollHelper.this;
                if (autoScrollHelper2.mNeedsCancel) {
                    autoScrollHelper2.mNeedsCancel = false;
                    autoScrollHelper2.cancelTargetTouch();
                }
                if (aVar2.f5670f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar2.mo9012a(currentAnimationTimeMillis2);
                    aVar2.f5670f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - aVar2.f5670f)) * ((a * 4.0f) + (-4.0f * a * a));
                    AutoScrollHelper.this.scrollTargetBy((int) (aVar2.f5667c * f), (int) (f * aVar2.f5668d));
                    View view = AutoScrollHelper.this.mTarget;
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5223m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public AutoScrollHelper(View view) {
        this.mTarget = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        setMaximumVelocity(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    private float computeTargetVelocity(int i, float f, float f2, float f3) {
        float edgeValue = getEdgeValue(this.mRelativeEdges[i], f2, this.mMaximumEdges[i], f);
        int i2 = (edgeValue > 0.0f ? 1 : (edgeValue == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.mRelativeVelocity[i];
        float f5 = this.mMinimumVelocity[i];
        float f6 = this.mMaximumVelocity[i];
        float f7 = f4 * f3;
        return i2 > 0 ? constrain(edgeValue * f7, f5, f6) : -constrain((-edgeValue) * f7, f5, f6);
    }

    public static float constrain(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int constrain(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    private float constrainEdgeValue(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.mEdgeType;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.mAnimating || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    private float getEdgeValue(float f, float f2, float f3, float f4) {
        float f5;
        float constrain = constrain(f * f2, 0.0f, f3);
        float constrainEdgeValue = constrainEdgeValue(f2 - f4, constrain) - constrainEdgeValue(f4, constrain);
        if (constrainEdgeValue < 0.0f) {
            f5 = -this.mEdgeInterpolator.getInterpolation(-constrainEdgeValue);
        } else if (constrainEdgeValue <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.mEdgeInterpolator.getInterpolation(constrainEdgeValue);
        }
        return constrain(f5, -1.0f, 1.0f);
    }

    private void requestStop() {
        if (this.mNeedsReset) {
            this.mAnimating = false;
            return;
        }
        C2388a aVar = this.mScroller;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        aVar.f5673i = constrain((int) (currentAnimationTimeMillis - aVar.f5669e), 0, aVar.f5666b);
        aVar.f5672h = aVar.mo9012a(currentAnimationTimeMillis);
        aVar.f5671g = currentAnimationTimeMillis;
    }

    private void startAnimating() {
        int i;
        if (this.mRunnable == null) {
            this.mRunnable = new C2389b();
        }
        this.mAnimating = true;
        this.mNeedsReset = true;
        if (this.mAlreadyDelayed || (i = this.mActivationDelay) <= 0) {
            this.mRunnable.run();
        } else {
            View view = this.mTarget;
            Runnable runnable = this.mRunnable;
            long j = (long) i;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5224n(view, runnable, j);
        }
        this.mAlreadyDelayed = true;
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public void cancelTargetTouch() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean isExclusive() {
        return this.mExclusive;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.mEnabled
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0059
        L_0x0016:
            r5.requestStop()
            goto L_0x0059
        L_0x001a:
            r5.mNeedsCancel = r2
            r5.mAlreadyDelayed = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.mTarget
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.computeTargetVelocity(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.mTarget
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.computeTargetVelocity(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$a r7 = r5.mScroller
            r7.f5667c = r0
            r7.f5668d = r6
            boolean r6 = r5.mAnimating
            if (r6 != 0) goto L_0x0059
            boolean r6 = r5.shouldAnimate()
            if (r6 == 0) goto L_0x0059
            r5.startAnimating()
        L_0x0059:
            boolean r6 = r5.mExclusive
            if (r6 == 0) goto L_0x0062
            boolean r6 = r5.mAnimating
            if (r6 == 0) goto L_0x0062
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void scrollTargetBy(int i, int i2);

    public AutoScrollHelper setActivationDelay(int i) {
        this.mActivationDelay = i;
        return this;
    }

    public AutoScrollHelper setEdgeType(int i) {
        this.mEdgeType = i;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z) {
        if (this.mEnabled && !z) {
            requestStop();
        }
        this.mEnabled = z;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z) {
        this.mExclusive = z;
        return this;
    }

    public AutoScrollHelper setMaximumEdges(float f, float f2) {
        float[] fArr = this.mMaximumEdges;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AutoScrollHelper setMaximumVelocity(float f, float f2) {
        float[] fArr = this.mMaximumVelocity;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setMinimumVelocity(float f, float f2) {
        float[] fArr = this.mMinimumVelocity;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setRampDownDuration(int i) {
        this.mScroller.f5666b = i;
        return this;
    }

    public AutoScrollHelper setRampUpDuration(int i) {
        this.mScroller.f5665a = i;
        return this;
    }

    public AutoScrollHelper setRelativeEdges(float f, float f2) {
        float[] fArr = this.mRelativeEdges;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AutoScrollHelper setRelativeVelocity(float f, float f2) {
        float[] fArr = this.mRelativeVelocity;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean shouldAnimate() {
        C2388a aVar = this.mScroller;
        float f = aVar.f5668d;
        int abs = (int) (f / Math.abs(f));
        float f2 = aVar.f5667c;
        int abs2 = (int) (f2 / Math.abs(f2));
        return (abs != 0 && canTargetScrollVertically(abs)) || (abs2 != 0 && canTargetScrollHorizontally(abs2));
    }
}
