package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import android.widget.ImageView;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.uikit.util.TrackingOnClickListener;

/* renamed from: com.etsy.android.ui.cardview.viewholders.k1 */
public final class C9192k1 extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ShopCard f20278b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f20279c;

    /* renamed from: d */
    public final /* synthetic */ C9195l1 f20280d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9192k1(C9195l1 l1Var, C8698l[] lVarArr, ShopCard shopCard, ImageView imageView) {
        super(lVarArr);
        this.f20280d = l1Var;
        this.f20278b = shopCard;
        this.f20279c = imageView;
    }

    public final void onViewClick(View view) {
        ShopCardClickHandler shopCardClickHandler = this.f20280d.f20294m;
        if (shopCardClickHandler != null) {
            ShopCard shopCard = this.f20278b;
            shopCardClickHandler.mo31337d(shopCard, this.f20279c, shopCard.isFavorite());
            this.f20280d.mo31431g(this.f20278b);
        }
    }
}
