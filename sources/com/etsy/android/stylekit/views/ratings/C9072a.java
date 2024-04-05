package com.etsy.android.stylekit.views.ratings;

import android.view.View;
import com.etsy.android.p327ui.search.container.SearchNavigationViewModel;
import com.etsy.android.p327ui.search.savedsearch.SavedSearchEmailPromptFragment;
import com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginFragment;
import kotlin.jvm.internal.C19383o;
import p430qe.C13301b;

/* renamed from: com.etsy.android.stylekit.views.ratings.a */
public final /* synthetic */ class C9072a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19954b;

    /* renamed from: c */
    public final /* synthetic */ Object f19955c;

    public /* synthetic */ C9072a(Object obj, int i) {
        this.f19954b = i;
        this.f19955c = obj;
    }

    public final void onClick(View view) {
        switch (this.f19954b) {
            case 0:
                CollageRatingButtons.m34911_init_$lambda5((CollageRatingButtons) this.f19955c, view);
                return;
            case 1:
                SearchNavigationViewModel searchNavigationViewModel = (SearchNavigationViewModel) this.f19955c;
                searchNavigationViewModel.getClass();
                C19383o.m32797g(view, "view");
                searchNavigationViewModel.f23672b.onNext(C13301b.C13305d.f29208a);
                return;
            case 2:
                SavedSearchEmailPromptFragment.m35048onCreateView$lambda2((SavedSearchEmailPromptFragment) this.f19955c, view);
                return;
            default:
                OtpLoginFragment.m35134onViewCreated$lambda8((OtpLoginFragment) this.f19955c, view);
                return;
        }
    }
}
