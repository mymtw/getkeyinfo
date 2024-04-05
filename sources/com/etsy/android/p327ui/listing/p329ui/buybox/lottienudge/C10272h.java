package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.C19383o;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.h */
public final /* synthetic */ class C10272h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C10273i f22571a;

    public /* synthetic */ C10272h(C10273i iVar) {
        this.f22571a = iVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C10273i iVar = this.f22571a;
        C19383o.m32797g(iVar, "this$0");
        C19383o.m32797g(valueAnimator, "it");
        if (valueAnimator.getAnimatedFraction() >= 0.99f) {
            iVar.f22572b.mo38043a(C13597g.C13761x1.f30289a);
        }
    }
}
