package com.etsy.android.lib.models.interfaces;

import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.vespa.FormattedListingCard;
import java.util.List;

public interface IFormattedListingCard {
    ListingCard getCard();

    List<FormattedListingCard.Format> getFormats();

    ListingCardSize getListingCardSize();

    void setCard(ListingCard listingCard);

    void setFormats(List<? extends FormattedListingCard.Format> list);

    void setListingCardSize(ListingCardSize listingCardSize);
}
