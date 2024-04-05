package com.appboy.p043ui;

import android.content.Context;
import android.provider.SearchRecentSuggestions;
import com.etsy.android.contentproviders.EtsyProvider;
import com.etsy.android.p327ui.search.p330v2.suggestions.SearchSuggestionsLayout;
import com.etsy.android.p327ui.user.review.CreateReviewActivity;
import com.etsy.android.uikit.webview.EtsyChromeClient;
import com.etsy.android.vespa.VespaBaseFragment;
import com.google.android.exoplayer2.source.C14304h;
import com.google.android.exoplayer2.source.C14355m;
import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence;
import com.paypal.pyplcheckout.services.callbacks.CryptoCurrencyQuoteCallback;

/* renamed from: com.appboy.ui.e */
public final /* synthetic */ class C4950e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f11145b;

    /* renamed from: c */
    public final /* synthetic */ Object f11146c;

    public /* synthetic */ C4950e(Object obj, int i) {
        this.f11145b = i;
        this.f11146c = obj;
    }

    public final void run() {
        switch (this.f11145b) {
            case 0:
                ((AppboyFeedFragment) this.f11146c).lambda$onRefresh$5();
                return;
            case 1:
                Context context = (Context) this.f11146c;
                context.getContentResolver().delete(EtsyProvider.C6429b.f14247a, (String) null, (String[]) null);
                new SearchRecentSuggestions(context, EtsyProvider.AUTHORITY, 1).clearHistory();
                return;
            case 2:
                SearchSuggestionsLayout.m35050showSearchSuggestions$lambda1((SearchSuggestionsLayout) this.f11146c);
                return;
            case 3:
                CreateReviewActivity.m35089showTooltipForNewVideoReviews$lambda46((CreateReviewActivity) this.f11146c);
                return;
            case 4:
                EtsyChromeClient.m35098onProgressChanged$lambda0((EtsyChromeClient) this.f11146c);
                return;
            case 5:
                ((VespaBaseFragment) this.f11146c).lambda$stopEndless$1();
                return;
            case 6:
                C14355m mVar = (C14355m) this.f11146c;
                if (!mVar.f32194M) {
                    C14304h.C14305a aVar = mVar.f32211r;
                    aVar.getClass();
                    aVar.mo47674l(mVar);
                    return;
                }
                return;
            case 7:
                CheckoutAnimationSequence.m35208hideView$lambda0((CheckoutAnimationSequence) this.f11146c);
                return;
            default:
                CryptoCurrencyQuoteCallback.m35426onApiError$lambda0((Exception) this.f11146c);
                return;
        }
    }
}
