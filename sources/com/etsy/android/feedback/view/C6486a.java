package com.etsy.android.feedback.view;

import android.view.View;
import com.etsy.android.p327ui.login.ThirdPartySignInFragment;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import com.etsy.android.p327ui.search.toplevelcategories.TopLevelCategoriesFragment;
import com.etsy.android.stylekit.views.CollageColorSwatch;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginFragment;
import com.paypal.pyplcheckout.info.view.customviews.PYPLTransactionDetailsView;

/* renamed from: com.etsy.android.feedback.view.a */
public final /* synthetic */ class C6486a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f14387b;

    /* renamed from: c */
    public final /* synthetic */ Object f14388c;

    public /* synthetic */ C6486a(Object obj, int i) {
        this.f14387b = i;
        this.f14388c = obj;
    }

    public final void onClick(View view) {
        switch (this.f14387b) {
            case 0:
                ReviewsSortFilterHeader.m34862_init_$lambda0((ReviewsSortFilterHeader) this.f14388c, view);
                return;
            case 1:
                CollageColorSwatch.m34883setOnCheckedListener$lambda1((CollageColorSwatch) this.f14388c, view);
                return;
            case 2:
                ThirdPartySignInFragment.m35018onViewCreated$lambda5((ThirdPartySignInFragment) this.f14388c, view);
                return;
            case 3:
                SearchResultsListingsFragment.m35045showSaveSearchOnboardingPrompt$lambda21((SearchResultsListingsFragment) this.f14388c, view);
                return;
            case 4:
                TopLevelCategoriesFragment.m35049onCreateView$lambda2((TopLevelCategoriesFragment) this.f14388c, view);
                return;
            case 5:
                SplitLoginFragment.m35140setUpViewsAction$lambda4((SplitLoginFragment) this.f14388c, view);
                return;
            default:
                PYPLTransactionDetailsView.m35418_init_$lambda0((PYPLTransactionDetailsView) this.f14388c, view);
                return;
        }
    }
}
