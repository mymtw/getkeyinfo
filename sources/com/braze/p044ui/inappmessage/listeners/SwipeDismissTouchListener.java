package com.braze.p044ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import p114g4.C6861b;
import p114g4.C6872j;

/* renamed from: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener */
public class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    /* access modifiers changed from: private */
    public final C5669c mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    /* access modifiers changed from: private */
    public final Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    /* access modifiers changed from: private */
    public final View mView;
    private int mViewWidth = 1;

    /* renamed from: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener$a */
    public class C5667a extends AnimatorListenerAdapter {
        public C5667a() {
        }

        public final void onAnimationEnd(Animator animator) {
            SwipeDismissTouchListener.this.performDismiss();
        }
    }

    /* renamed from: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener$b */
    public class C5668b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f12079a;

        /* renamed from: b */
        public final /* synthetic */ int f12080b;

        public C5668b(ViewGroup.LayoutParams layoutParams, int i) {
            this.f12079a = layoutParams;
            this.f12080b = i;
        }

        public final void onAnimationEnd(Animator animator) {
            C5669c access$200 = SwipeDismissTouchListener.this.mCallbacks;
            View unused = SwipeDismissTouchListener.this.mView;
            Object unused2 = SwipeDismissTouchListener.this.mToken;
            ((C6872j) access$200).f15213a.f15197b.mo15963S(false);
            C6861b.m13319e().mo18985f(true);
            SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
            SwipeDismissTouchListener.this.mView.setTranslationX(0.0f);
            this.f12079a.height = this.f12080b;
            SwipeDismissTouchListener.this.mView.setLayoutParams(this.f12079a);
        }
    }

    /* renamed from: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener$c */
    public interface C5669c {
    }

    public SwipeDismissTouchListener(View view, Object obj, C5669c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mAnimationTime = (long) view.getContext().getResources().getInteger(17694720);
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performDismiss$0(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mView.setLayoutParams(layoutParams);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        motionEvent.offsetLocation(this.mTranslationX, 0.0f);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z2 = true;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.mDownX;
                        float rawY = motionEvent.getRawY() - this.mDownY;
                        if (Math.abs(rawX) > ((float) this.mSlop) && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.mSwiping = true;
                            this.mSwipingSlop = rawX > 0.0f ? this.mSlop : -this.mSlop;
                            this.mView.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.mView.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.mSwiping) {
                            this.mTranslationX = rawX;
                            this.mView.setTranslationX(rawX - ((float) this.mSwipingSlop));
                            return true;
                        }
                    }
                } else if (actionMasked == 3 && this.mVelocityTracker != null) {
                    this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener((Animator.AnimatorListener) null);
                    this.mVelocityTracker.recycle();
                    this.mVelocityTracker = null;
                    this.mTranslationX = 0.0f;
                    this.mDownX = 0.0f;
                    this.mDownY = 0.0f;
                    this.mSwiping = false;
                }
            } else if (this.mVelocityTracker != null) {
                float rawX2 = motionEvent.getRawX() - this.mDownX;
                this.mVelocityTracker.addMovement(motionEvent);
                this.mVelocityTracker.computeCurrentVelocity(1000);
                float xVelocity = this.mVelocityTracker.getXVelocity();
                float abs = Math.abs(xVelocity);
                float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
                if (Math.abs(rawX2) > ((float) (this.mViewWidth / 2)) && this.mSwiping) {
                    z = rawX2 > 0.0f;
                } else if (((float) this.mMinFlingVelocity) > abs || abs > ((float) this.mMaxFlingVelocity) || abs2 >= abs || !this.mSwiping) {
                    z = false;
                    z2 = false;
                } else {
                    boolean z3 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                    if (this.mVelocityTracker.getXVelocity() <= 0.0f) {
                        z2 = false;
                    }
                    boolean z4 = z2;
                    z2 = z3;
                    z = z4;
                }
                if (z2) {
                    this.mView.animate().translationX((float) (z ? this.mViewWidth : -this.mViewWidth)).alpha(0.0f).setDuration(this.mAnimationTime).setListener(new C5667a());
                } else if (this.mSwiping) {
                    this.mView.animate().translationX(0.0f).alpha(1.0f).setDuration(this.mAnimationTime).setListener((Animator.AnimatorListener) null);
                }
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
                this.mTranslationX = 0.0f;
                this.mDownX = 0.0f;
                this.mDownY = 0.0f;
                this.mSwiping = false;
            }
            return false;
        }
        this.mDownX = motionEvent.getRawX();
        this.mDownY = motionEvent.getRawY();
        this.mCallbacks.getClass();
        VelocityTracker obtain2 = VelocityTracker.obtain();
        this.mVelocityTracker = obtain2;
        obtain2.addMovement(motionEvent);
        return false;
    }

    @TargetApi(12)
    public void performDismiss() {
        ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{height, 1}).setDuration(this.mAnimationTime);
        duration.addListener(new C5668b(layoutParams, height));
        duration.addUpdateListener(new C5675e(this, layoutParams));
        duration.start();
    }
}
