package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import android.animation.ValueAnimator;
import android.view.View;
import com.paypal.pyplcheckout.animation.sliders.SlideInRightAnimation;
import kotlin.jvm.internal.C19383o;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.e */
public final /* synthetic */ class C10269e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f22563a;

    /* renamed from: b */
    public final /* synthetic */ Object f22564b;

    public /* synthetic */ C10269e(Object obj, int i) {
        this.f22563a = i;
        this.f22564b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22563a) {
            case 0:
                C10270f fVar = (C10270f) this.f22564b;
                C19383o.m32797g(fVar, "this$0");
                C19383o.m32797g(valueAnimator, "it");
                if (valueAnimator.getAnimatedFraction() >= 0.99f) {
                    fVar.f22566c.mo38043a(C13597g.C13761x1.f30289a);
                    return;
                }
                return;
            default:
                SlideInRightAnimation.m35210prepare$lambda0((View) this.f22564b, valueAnimator);
                return;
        }
    }
}
