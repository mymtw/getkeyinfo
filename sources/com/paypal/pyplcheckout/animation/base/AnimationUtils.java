package com.paypal.pyplcheckout.animation.base;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.profileinstaller.C3067i;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.extensions.ViewExtensionsKt;
import java.util.WeakHashMap;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p186n2.C7408l;
import p186n2.C7426q;
import p753kq.C19846a;

public final class AnimationUtils {
    private static final long EXPAND_DURATION = 800;
    private static final int FAVORITE_LONG_DURATION = 1000;
    private static final int FAVORITE_SHORT_DURATION = 500;
    public static final AnimationUtils INSTANCE = new AnimationUtils();
    private static final long SHRINK_DURATION = 500;
    private static final String TAG = "AnimationUtils";
    private static final Interpolator easeInOutQuartInterpolator = new PathInterpolator(0.77f, 0.0f, 0.175f, 1.0f);

    private AnimationUtils() {
    }

    public static /* synthetic */ long computeAnimationDurationFromHeight$default(AnimationUtils animationUtils, View view, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return animationUtils.computeAnimationDurationFromHeight(view, i);
    }

    public static /* synthetic */ Animation expand$default(AnimationUtils animationUtils, View view, long j, long j2, Interpolator interpolator, boolean z, C19846a aVar, int i, Object obj) {
        return animationUtils.expand(view, (i & 2) != 0 ? EXPAND_DURATION : j, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? new DecelerateInterpolator() : interpolator, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: expand$lambda-1  reason: not valid java name */
    public static final void m35199expand$lambda1(View view, Animation animation) {
        C19383o.m32797g(animation, "$expandAnimation");
        view.startAnimation(animation);
        view.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: expandFavorite$lambda-8  reason: not valid java name */
    public static final void m35200expandFavorite$lambda8(View view, View view2) {
        C19383o.m32797g(view, "$v");
        C19383o.m32797g(view2, "$parent");
        C7408l lVar = new C7408l();
        lVar.mo19762Q(8388613);
        lVar.f16523z = 1;
        lVar.f16563e = new AccelerateDecelerateInterpolator();
        lVar.f16562d = SHRINK_DURATION;
        lVar.mo19776a(new AnimationUtils$expandFavorite$1$1$1(view2, view));
        lVar.mo19777b(view);
        ViewParent parent = view.getParent();
        if (parent != null) {
            C7426q.m14342a((ViewGroup) parent, lVar);
            view.setVisibility(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static /* synthetic */ void fadeIn$default(AnimationUtils animationUtils, View view, long j, long j2, C19846a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = SHRINK_DURATION;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            aVar = null;
        }
        animationUtils.fadeIn(view, j3, j4, aVar);
    }

    public static /* synthetic */ void fadeOut$default(AnimationUtils animationUtils, View view, long j, long j2, C19846a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 400;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            aVar = null;
        }
        animationUtils.fadeOut(view, j3, j4, aVar);
    }

    /* access modifiers changed from: private */
    public final void fixPaddingChangeBackground(int i, View view) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        int paddingTop = view.getPaddingTop();
        view.setBackgroundResource(i);
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* access modifiers changed from: private */
    public final void setAsFading(View view, boolean z) {
        view.setTag(C17165R.C17167id.IS_VIEW_FADING_TAG, Boolean.valueOf(z));
    }

    public static /* synthetic */ ValueAnimator shrink$default(AnimationUtils animationUtils, View view, long j, long j2, Interpolator interpolator, boolean z, C19846a aVar, int i, Object obj) {
        return animationUtils.shrink(view, (i & 2) != 0 ? SHRINK_DURATION : j, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? new DecelerateInterpolator() : interpolator, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: shrink$lambda-5$lambda-3  reason: not valid java name */
    public static final void m35201shrink$lambda5$lambda3(View view, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.requestLayout();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: shrinkFavorite$lambda-9  reason: not valid java name */
    public static final void m35202shrinkFavorite$lambda9(View view, View view2, float f) {
        C19383o.m32797g(view, "$v");
        C19383o.m32797g(view2, "$parent");
        int width = view.getWidth();
        if (view2.getRootView() != null) {
            View rootView = view2.getRootView();
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2369e.m5233d(rootView) == 1) {
                width = ((int) (view2.getResources().getDisplayMetrics().xdpi * ((float) -1))) / 2;
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, (float) width});
        ofFloat.setDuration(SHRINK_DURATION);
        ofFloat.addListener(new AnimationUtils$shrinkFavorite$1$1(view, view2, f));
        ofFloat.start();
    }

    public final long computeAnimationDurationFromHeight(View view, int i) {
        C19383o.m32797g(view, "view");
        return (long) ((((float) (view.getHeight() > 0 ? view.getHeight() : ViewExtensionsKt.measureExpectedHeight(view))) / view.getContext().getResources().getDisplayMetrics().density) * ((float) i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.view.animation.Animation expand(android.view.View r14, long r15, long r17, android.view.animation.Interpolator r19, boolean r20, p753kq.C19846a<kotlin.C19394m> r21) {
        /*
            r13 = this;
            r0 = r14
            r4 = r19
            monitor-enter(r13)
            java.lang.String r1 = "interpolator"
            kotlin.jvm.internal.C19383o.m32797g(r4, r1)     // Catch:{ all -> 0x0091 }
            r10 = 1
            r1 = 0
            if (r0 != 0) goto L_0x000f
        L_0x000d:
            r2 = r1
            goto L_0x0016
        L_0x000f:
            int r2 = r14.getVisibility()     // Catch:{ all -> 0x0091 }
            if (r2 != 0) goto L_0x000d
            r2 = r10
        L_0x0016:
            r3 = 0
            if (r2 != 0) goto L_0x0073
            if (r0 != 0) goto L_0x001c
            goto L_0x0073
        L_0x001c:
            int r2 = com.paypal.pyplcheckout.extensions.ViewExtensionsKt.measureExpectedHeight(r14)     // Catch:{ all -> 0x0091 }
            int r5 = r14.getHeight()     // Catch:{ all -> 0x0091 }
            if (r5 != r2) goto L_0x0036
            java.lang.String r0 = TAG     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "Can't run animation. View height is already matching its expected expanded height"
            r4 = 4
            com.paypal.pyplcheckout.common.instrumentation.PLog.i$default(r0, r2, r1, r4, r3)     // Catch:{ all -> 0x0091 }
            if (r21 != 0) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            r21.invoke()     // Catch:{ all -> 0x0091 }
        L_0x0034:
            monitor-exit(r13)
            return r3
        L_0x0036:
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0042
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()     // Catch:{ all -> 0x0091 }
            r1.height = r10     // Catch:{ all -> 0x0091 }
        L_0x0042:
            com.paypal.pyplcheckout.animation.base.AnimationUtils$expand$expandAnimation$1 r11 = new com.paypal.pyplcheckout.animation.base.AnimationUtils$expand$expandAnimation$1     // Catch:{ all -> 0x0091 }
            r11.<init>(r14, r2)     // Catch:{ all -> 0x0091 }
            r5 = r15
            r11.setDuration(r5)     // Catch:{ all -> 0x0091 }
            r11.setInterpolator(r4)     // Catch:{ all -> 0x0091 }
            com.paypal.pyplcheckout.animation.base.AnimationUtils$expand$expandAnimation$2$1 r12 = new com.paypal.pyplcheckout.animation.base.AnimationUtils$expand$expandAnimation$2$1     // Catch:{ all -> 0x0091 }
            r1 = r12
            r2 = r20
            r3 = r14
            r4 = r19
            r5 = r15
            r7 = r17
            r9 = r21
            r1.<init>(r2, r3, r4, r5, r7, r9)     // Catch:{ all -> 0x0091 }
            r11.setAnimationListener(r12)     // Catch:{ all -> 0x0091 }
            if (r20 == 0) goto L_0x0067
            r1 = 0
            r14.setAlpha(r1)     // Catch:{ all -> 0x0091 }
        L_0x0067:
            kn.a r1 = new kn.a     // Catch:{ all -> 0x0091 }
            r1.<init>(r10, r14, r11)     // Catch:{ all -> 0x0091 }
            r2 = r17
            r14.postDelayed(r1, r2)     // Catch:{ all -> 0x0091 }
            monitor-exit(r13)
            return r11
        L_0x0073:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "Can't run animation. View visibility is either VISIBLE or view is null"
            r2 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r6
            com.paypal.pyplcheckout.common.instrumentation.PLog.e$default(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0091 }
            if (r21 != 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r21.invoke()     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r13)
            return r3
        L_0x0091:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.animation.base.AnimationUtils.expand(android.view.View, long, long, android.view.animation.Interpolator, boolean, kq.a):android.view.animation.Animation");
    }

    public final void expandFavorite(View view, View view2) {
        C19383o.m32797g(view, "v");
        C19383o.m32797g(view2, ResponseConstants.PARENT);
        view.post(new C3067i(6, view, view2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if ((r4.getAlpha() == 1.0f) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void fadeIn(android.view.View r4, long r5, long r7, p753kq.C19846a<kotlin.C19394m> r9) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            int r0 = r4.getVisibility()
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x001b
            float r0 = r4.getAlpha()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 != 0) goto L_0x0021
        L_0x001b:
            boolean r0 = com.paypal.pyplcheckout.extensions.ViewExtensionsKt.isFading(r4)
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            if (r9 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r9.invoke()
        L_0x0027:
            return
        L_0x0028:
            r4.setVisibility(r1)
            r0 = 0
            r4.setAlpha(r0)
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.alpha(r2)
            com.paypal.pyplcheckout.animation.base.AnimationUtils$fadeIn$1$1 r1 = new com.paypal.pyplcheckout.animation.base.AnimationUtils$fadeIn$1$1
            r1.<init>(r4, r9)
            r0.setListener(r1)
            r0.setDuration(r5)
            r0.setStartDelay(r7)
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.animation.base.AnimationUtils.fadeIn(android.view.View, long, long, kq.a):void");
    }

    public final void fadeOut(View view, long j, long j2, C19846a<C19394m> aVar) {
        C19383o.m32797g(view, "view");
        if (view.getVisibility() == 0) {
            if (!(view.getAlpha() == 0.0f) && !ViewExtensionsKt.isFading(view)) {
                view.setAlpha(1.0f);
                ViewPropertyAnimator animate = view.animate();
                animate.alpha(0.0f);
                animate.setListener(new AnimationUtils$fadeOut$1$1(view, aVar));
                animate.setDuration(j);
                animate.setStartDelay(j2);
                animate.start();
                return;
            }
        }
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final Interpolator getEaseInOutQuartInterpolator() {
        return easeInOutQuartInterpolator;
    }

    public final String getTAG() {
        return TAG;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.ValueAnimator shrink(android.view.View r8, long r9, long r11, android.view.animation.Interpolator r13, boolean r14, p753kq.C19846a<kotlin.C19394m> r15) {
        /*
            r7 = this;
            java.lang.String r0 = "interpolator"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x000b
        L_0x0009:
            r2 = r1
            goto L_0x0014
        L_0x000b:
            int r2 = r8.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x0009
            r2 = r0
        L_0x0014:
            if (r2 != 0) goto L_0x0073
            if (r8 != 0) goto L_0x001a
        L_0x0018:
            r2 = r1
            goto L_0x0026
        L_0x001a:
            int r2 = r8.getHeight()
            if (r2 > 0) goto L_0x0022
            r2 = r0
            goto L_0x0023
        L_0x0022:
            r2 = r1
        L_0x0023:
            if (r2 != r0) goto L_0x0018
            r2 = r0
        L_0x0026:
            if (r2 != 0) goto L_0x0073
            if (r8 != 0) goto L_0x002b
            goto L_0x0073
        L_0x002b:
            int r2 = r8.getHeight()
            r3 = 2
            int[] r3 = new int[r3]
            r3[r1] = r2
            r3[r0] = r1
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r3)
            r0.setInterpolator(r13)
            r0.setDuration(r9)
            if (r14 == 0) goto L_0x0045
            long r1 = r11 + r9
            goto L_0x0046
        L_0x0045:
            r1 = r11
        L_0x0046:
            r0.setStartDelay(r1)
            com.paypal.pyplcheckout.animation.base.b r1 = new com.paypal.pyplcheckout.animation.base.b
            r1.<init>(r8)
            r0.addUpdateListener(r1)
            com.paypal.pyplcheckout.animation.base.AnimationUtils$shrink$lambda-5$$inlined$addListener$default$1 r1 = new com.paypal.pyplcheckout.animation.base.AnimationUtils$shrink$lambda-5$$inlined$addListener$default$1
            r1.<init>(r15, r8)
            r0.addListener(r1)
            r0.start()
            if (r14 == 0) goto L_0x0072
            android.view.ViewPropertyAnimator r8 = r8.animate()
            r14 = 0
            r8.alpha(r14)
            r8.setInterpolator(r13)
            r8.setDuration(r9)
            r8.setStartDelay(r11)
            r8.start()
        L_0x0072:
            return r0
        L_0x0073:
            java.lang.String r1 = TAG
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            java.lang.String r2 = "Can't run animation. View visibility is either GONE, view is null, or view height is <= 0"
            com.paypal.pyplcheckout.common.instrumentation.PLog.e$default(r1, r2, r3, r4, r5, r6)
            if (r15 != 0) goto L_0x0082
            goto L_0x0085
        L_0x0082:
            r15.invoke()
        L_0x0085:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.animation.base.AnimationUtils.shrink(android.view.View, long, long, android.view.animation.Interpolator, boolean, kq.a):android.animation.ValueAnimator");
    }

    public final void shrinkFavorite(View view, View view2) {
        C19383o.m32797g(view, "v");
        C19383o.m32797g(view2, ResponseConstants.PARENT);
        view.postDelayed(new C17194a(view, view2, view.getTranslationX()), 1000);
    }
}
