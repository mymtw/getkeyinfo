package com.etsy.android.p327ui.user.profile.viewholders;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p311af.C8515a;

/* renamed from: com.etsy.android.ui.user.profile.viewholders.ProfileUserShopViewHolder$bind$2 */
public final class ProfileUserShopViewHolder$bind$2 extends TrackingOnClickListener {
    public final /* synthetic */ ShopCard $shopData;
    public final /* synthetic */ C8515a this$0;

    public ProfileUserShopViewHolder$bind$2(C8515a aVar, ShopCard shopCard) {
        this.this$0 = aVar;
        this.$shopData = shopCard;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        Context context = this.this$0.itemView.getContext();
        ShopCard shopCard = this.$shopData;
        ShopHomeKey shopHomeKey = r3;
        ShopHomeKey shopHomeKey2 = new ShopHomeKey(C19421p.m32935c0(context), shopCard.getShopId(), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, (String) null, (Bundle) null, 1020, (DefaultConstructorMarker) null);
        C19421p.m32933W(context, shopHomeKey);
    }
}
