package com.etsy.android.p327ui.shop;

import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.shop.u0 */
public final /* synthetic */ class C11247u0 implements C19846a {

    /* renamed from: b */
    public final /* synthetic */ C11249v0 f24827b;

    public /* synthetic */ C11247u0(C11249v0 v0Var) {
        this.f24827b = v0Var;
    }

    public final Object invoke() {
        C11249v0 v0Var = this.f24827b;
        v0Var.f24833m.mo21333d("shop_home_see_all_reviews_title_tapped", (Map<? extends AnalyticsProperty, Object>) null);
        v0Var.f24835o.navigateToAllReviews();
        return null;
    }
}
