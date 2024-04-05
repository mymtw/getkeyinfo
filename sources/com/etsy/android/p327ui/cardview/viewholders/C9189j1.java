package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cardview.viewholders.j1 */
public final class C9189j1 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ShopCard f20263b;

    /* renamed from: c */
    public final /* synthetic */ C9195l1 f20264c;

    public C9189j1(C9195l1 l1Var, ShopCard shopCard) {
        this.f20264c = l1Var;
        this.f20263b = shopCard;
    }

    public final void onViewClick(View view) {
        ShopCardClickHandler shopCardClickHandler = this.f20264c.f20294m;
        if (shopCardClickHandler != null) {
            ShopCard shopCard = this.f20263b;
            shopCardClickHandler.mo31338e(shopCard, shopCard.getContentSource());
        }
    }
}
