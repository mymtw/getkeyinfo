package com.etsy.android.lib.models.finds;

import com.etsy.android.R;
import java.util.ArrayList;
import java.util.List;
import p415of.C13186o;

public class GiftCardBanner extends FindsModule {
    public List<? extends C13186o> getCardViewElements() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        return arrayList;
    }

    public String getCta() {
        return this.mCta;
    }

    public int getViewType() {
        return R.id.view_type_finds_gift_card_banner;
    }

    public void setFromGeneric(FindsModule findsModule) {
        this.mText = findsModule.getText();
        this.mGiftCardBannerImage = findsModule.getGiftCardBannerImages();
        this.mCta = findsModule.getCta();
    }
}
