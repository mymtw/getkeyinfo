package com.etsy.android.p327ui.listing.p329ui.buybox.title;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.title.a */
public final /* synthetic */ class C10309a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup.LayoutParams f22655a;

    /* renamed from: b */
    public final /* synthetic */ TextView f22656b;

    public /* synthetic */ C10309a(ViewGroup.LayoutParams layoutParams, TextView textView) {
        this.f22655a = layoutParams;
        this.f22656b = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = this.f22655a;
        TextView textView = this.f22656b;
        C19383o.m32797g(textView, "$listingTitle");
        C19383o.m32797g(valueAnimator, ResponseConstants.ANIMATION);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C19383o.m32795e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        textView.requestLayout();
    }
}
