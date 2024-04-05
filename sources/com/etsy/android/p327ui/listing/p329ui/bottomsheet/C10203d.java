package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.d */
public final class C10203d extends BottomSheetBehavior.C15221f {

    /* renamed from: a */
    public final /* synthetic */ AddToCartInterstitialHelper f22437a;

    public C10203d(AddToCartInterstitialHelper addToCartInterstitialHelper) {
        this.f22437a = addToCartInterstitialHelper;
    }

    public final void onSlide(View view, float f) {
        C19383o.m32797g(view, "bottomSheet");
        AddToCartInterstitialHelper addToCartInterstitialHelper = this.f22437a;
        if (!addToCartInterstitialHelper.f22427t && f > 0.0f) {
            addToCartInterstitialHelper.f22418k.mo21333d("add_to_cart_interstitial_recommendations_scrolled", (Map<? extends AnalyticsProperty, Object>) null);
            this.f22437a.f22427t = true;
        }
    }

    public final void onStateChanged(View view, int i) {
        C19383o.m32797g(view, "bottomSheet");
        if (i == 5) {
            AddToCartInterstitialHelper addToCartInterstitialHelper = this.f22437a;
            addToCartInterstitialHelper.getClass();
            ViewExtensions.m12860d(view);
            ViewExtensions.m12860d(addToCartInterstitialHelper.f22422o);
            ViewGroup viewGroup = addToCartInterstitialHelper.f22419l;
            if (viewGroup != null) {
                viewGroup.setImportantForAccessibility(1);
            }
            addToCartInterstitialHelper.f22409b.mo38043a(C13597g.C13619d.f30094a);
            addToCartInterstitialHelper.f22429v = null;
            if (!addToCartInterstitialHelper.f22428u) {
                addToCartInterstitialHelper.f22418k.mo21333d("add_to_cart_interstitial_canceled", (Map<? extends AnalyticsProperty, Object>) null);
            }
        }
    }
}
