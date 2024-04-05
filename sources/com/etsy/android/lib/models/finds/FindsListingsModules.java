package com.etsy.android.lib.models.finds;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ListingCard;
import java.util.List;
import p415of.C13186o;

public class FindsListingsModules extends FindsModule {
    public List<? extends C13186o> getCardViewElements() {
        return getListings();
    }

    public List<ListingCard> getListings() {
        return this.mListings;
    }

    public int getViewType() {
        return R.id.view_type_listing_card;
    }

    public void setFromGeneric(FindsModule findsModule) {
        super.setFromGeneric(findsModule);
        this.mListings = findsModule.mListings;
    }
}
