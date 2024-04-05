package com.etsy.android.p327ui.cardview.viewholders;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.cardview.clickhandlers.SavedCartClickHandler;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12788a;
import p356ge.C12790b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.SavedCartListingView$bindShop$1 */
public final class SavedCartListingView$bindShop$1 extends TrackingOnClickListener {
    public final /* synthetic */ C9163b1 $uiModel;
    public final /* synthetic */ SavedCartListingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedCartListingView$bindShop$1(SavedCartListingView savedCartListingView, C9163b1 b1Var, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = savedCartListingView;
        this.$uiModel = b1Var;
    }

    public void onViewClick(View view) {
        EtsyId etsyId;
        C19383o.m32797g(view, "v");
        SavedCartClickHandler clickListener = this.this$0.getClickListener();
        if (clickListener != null && (etsyId = this.$uiModel.f20157f) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(PredefinedAnalyticsProperty.SHOP_ID, etsyId.toString());
            clickListener.f28980b.mo21333d("save_for_later_tapped_shop", hashMap);
            C12788a.m20424c(clickListener.mo45889a().getActivity(), new ShopHomeKey(C12790b.m20432d(clickListener.mo45889a()), etsyId, (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 256, (DefaultConstructorMarker) null));
        }
    }
}
