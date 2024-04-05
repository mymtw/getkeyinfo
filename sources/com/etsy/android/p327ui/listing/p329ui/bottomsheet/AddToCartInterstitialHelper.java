package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p456ua.C13461f;
import p466vc.C13573c;
import p472wb.C13808f;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper */
public final class AddToCartInterstitialHelper implements C2857f {

    /* renamed from: b */
    public final C13573c f22409b;

    /* renamed from: c */
    public final C11780h f22410c;

    /* renamed from: d */
    public final C13461f f22411d;

    /* renamed from: e */
    public final C8267e f22412e;

    /* renamed from: f */
    public final C12724a f22413f;

    /* renamed from: g */
    public final C12741o f22414g;

    /* renamed from: h */
    public final C13851a f22415h;

    /* renamed from: i */
    public final C10865h f22416i;

    /* renamed from: j */
    public final C12796e f22417j;

    /* renamed from: k */
    public final C8703p f22418k;

    /* renamed from: l */
    public ViewGroup f22419l;

    /* renamed from: m */
    public CoordinatorLayout f22420m;

    /* renamed from: n */
    public ViewGroup f22421n;

    /* renamed from: o */
    public View f22422o;

    /* renamed from: p */
    public Button f22423p;

    /* renamed from: q */
    public RecyclerView f22424q;

    /* renamed from: r */
    public C13808f f22425r;

    /* renamed from: s */
    public BottomSheetBehavior<View> f22426s;

    /* renamed from: t */
    public boolean f22427t;

    /* renamed from: u */
    public boolean f22428u;

    /* renamed from: v */
    public Integer f22429v;

    /* renamed from: w */
    public final AddToCartInterstitialHelper$viewCartButtonGlobalLayoutListener$1 f22430w = new AddToCartInterstitialHelper$viewCartButtonGlobalLayoutListener$1(this);

    /* renamed from: x */
    public final AddToCartInterstitialHelper$recyclerViewGlobalLayoutListener$1 f22431x = new AddToCartInterstitialHelper$recyclerViewGlobalLayoutListener$1(this);

    /* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper$a */
    public static final class C10198a extends C9125j {

        /* renamed from: g */
        public final C8703p f22432g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10198a(Fragment fragment, C13808f fVar, C8703p pVar, C8267e eVar, C8703p pVar2) {
            super(fragment, fVar, pVar, (C9126k.C9128b) null, eVar);
            C19383o.m32797g(fragment, "fragment");
            C19383o.m32797g(pVar, "viewTracker");
            C19383o.m32797g(eVar, "adImpressionRepository");
            C19383o.m32797g(pVar2, "analyticsTracker");
            this.f22432g = pVar2;
        }

        /* renamed from: e */
        public final void mo31349e(ListingLike listingLike, boolean z, Bundle bundle) {
            C19383o.m32797g(listingLike, ResponseConstants.LISTING);
            this.f22432g.mo21333d("add_to_cart_interstitial_recommendation_clicked", (Map<? extends AnalyticsProperty, Object>) null);
            super.mo31349e(listingLike, false, bundle);
        }
    }

    public AddToCartInterstitialHelper(C13573c cVar, C11780h hVar, C13461f fVar, C8267e eVar, C12724a aVar, C12741o oVar, C13851a aVar2, C10865h hVar2, C12796e eVar2, C8703p pVar) {
        C19383o.m32797g(eVar, "adImpressionRepository");
        C19383o.m32797g(aVar, "deepLinkEligibility");
        this.f22409b = cVar;
        this.f22410c = hVar;
        this.f22411d = fVar;
        this.f22412e = eVar;
        this.f22413f = aVar;
        this.f22414g = oVar;
        this.f22415h = aVar2;
        this.f22416i = hVar2;
        this.f22417j = eVar2;
        this.f22418k = pVar;
    }

    public final void onDestroy(C2887s sVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        BottomSheetBehavior<View> bottomSheetBehavior = this.f22426s;
        if (bottomSheetBehavior != null) {
            this.f22429v = (bottomSheetBehavior.getState() == 1 || bottomSheetBehavior.getState() == 2) ? 4 : Integer.valueOf(bottomSheetBehavior.getState());
        }
        Button button = this.f22423p;
        if (!(button == null || (viewTreeObserver2 = button.getViewTreeObserver()) == null)) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.f22430w);
        }
        RecyclerView recyclerView = this.f22424q;
        if (!(recyclerView == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f22431x);
        }
        RecyclerView recyclerView2 = this.f22424q;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((RecyclerView.Adapter) null);
        }
        this.f22424q = null;
        this.f22420m = null;
        this.f22421n = null;
        this.f22422o = null;
        this.f22426s = null;
    }
}
