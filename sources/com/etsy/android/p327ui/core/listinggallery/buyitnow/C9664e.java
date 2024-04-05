package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import androidx.lifecycle.C2843a0;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b;
import com.etsy.android.stylekit.views.ProgressButton;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.e */
public final /* synthetic */ class C9664e implements C2843a0 {

    /* renamed from: b */
    public final /* synthetic */ C9665f f21399b;

    /* renamed from: c */
    public final /* synthetic */ ProgressButton f21400c;

    public /* synthetic */ C9664e(C9665f fVar, ProgressButton progressButton) {
        this.f21399b = fVar;
        this.f21400c = progressButton;
    }

    public final void onChanged(Object obj) {
        C9665f fVar = this.f21399b;
        ProgressButton progressButton = this.f21400c;
        C9649b bVar = (C9649b) obj;
        C19383o.m32797g(fVar, "this$0");
        C19383o.m32797g(progressButton, "$buyItNowButton");
        if (bVar instanceof C9649b.C9653d ? true : C19383o.m32792b(bVar, C9649b.C9652c.f21371a)) {
            ViewExtensions.m12860d(progressButton);
            progressButton.setText((int) R.string.listing_gallery_buy_it_now);
            progressButton.hideLoading();
        } else if (bVar instanceof C9649b.C9654e) {
            ViewExtensions.m12860d(progressButton);
        } else if (C19383o.m32792b(bVar, C9649b.C9650a.f21369a)) {
            ViewExtensions.m12869m(progressButton);
            progressButton.setText((int) R.string.listing_gallery_buy_it_now);
            progressButton.hideLoading();
        } else if (C19383o.m32792b(bVar, C9649b.C9651b.f21370a)) {
            ViewExtensions.m12869m(progressButton);
            progressButton.showLoading();
        }
        ViewExtensions.m12866j(progressButton, new BuyItNowPresenter$handleBuyItNowButtonState$1$1(fVar));
    }
}
