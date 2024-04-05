package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p186n2.C7408l;
import p186n2.C7426q;
import p356ge.C12790b;
import p466vc.C13597g;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.c */
public final /* synthetic */ class C10202c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AddToCartInterstitialHelper f22434b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f22435c;

    /* renamed from: d */
    public final /* synthetic */ Fragment f22436d;

    public /* synthetic */ C10202c(AddToCartInterstitialHelper addToCartInterstitialHelper, ViewGroup viewGroup, Fragment fragment) {
        this.f22434b = addToCartInterstitialHelper;
        this.f22435c = viewGroup;
        this.f22436d = fragment;
    }

    public final void onClick(View view) {
        AddToCartInterstitialHelper addToCartInterstitialHelper = this.f22434b;
        ViewGroup viewGroup = this.f22435c;
        Fragment fragment = this.f22436d;
        C19383o.m32797g(addToCartInterstitialHelper, "this$0");
        C19383o.m32797g(viewGroup, "$bottomSheet");
        C19383o.m32797g(fragment, "$fragment");
        addToCartInterstitialHelper.f22428u = true;
        CoordinatorLayout coordinatorLayout = addToCartInterstitialHelper.f22420m;
        C19383o.m32794d(coordinatorLayout);
        C7408l lVar = new C7408l(0);
        lVar.f16565g.add(viewGroup);
        C7426q.m14342a(coordinatorLayout, lVar);
        BottomSheetBehavior<View> bottomSheetBehavior = addToCartInterstitialHelper.f22426s;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(5);
        }
        addToCartInterstitialHelper.f22418k.mo21333d("add_to_cart_interstitial_view_cart_clicked", (Map<? extends AnalyticsProperty, Object>) null);
        C12790b.m20430b(fragment, new CartWithSavedKey(C12790b.m20432d(fragment), (String) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
        addToCartInterstitialHelper.f22409b.mo38043a(C13597g.C13619d.f30094a);
    }
}
