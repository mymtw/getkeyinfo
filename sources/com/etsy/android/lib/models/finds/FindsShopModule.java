package com.etsy.android.lib.models.finds;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopCard;
import java.util.List;
import p415of.C13186o;

public class FindsShopModule extends FindsModule {
    public List<? extends C13186o> getCardViewElements() {
        return getShops();
    }

    public List<ShopCard> getShops() {
        return this.mShops;
    }

    public int getViewType() {
        return R.id.view_type_shop_card;
    }

    public void setFromGeneric(FindsModule findsModule) {
        super.setFromGeneric(findsModule);
        this.mShops = findsModule.mShops;
    }
}
