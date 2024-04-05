package com.etsy.android.lib.models;

import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

public final class ListingCardFormatPresenter {
    public static final int $stable = 8;
    private final ListingCardSize listingCardSize;

    public ListingCardFormatPresenter(ListingCardSize listingCardSize2) {
        C19383o.m32797g(listingCardSize2, "listingCardSize");
        this.listingCardSize = listingCardSize2;
    }

    public final void updateListingCardFormat(String str) {
        C19383o.m32797g(str, "cardSize");
        switch (str.hashCode()) {
            case -1623661049:
                if (str.equals(ListingCardSize.XXSMALL)) {
                    this.listingCardSize.setCardPerScreen(5);
                    this.listingCardSize.setAspectRatio(1.0f);
                    this.listingCardSize.setMargins(Integer.valueOf(R.dimen.grid_card_margins));
                    return;
                }
                return;
            case -756726333:
                if (str.equals(ListingCardSize.XLARGE)) {
                    this.listingCardSize.setCardPerScreen(1);
                    this.listingCardSize.setAspectRatio(0.75f);
                    return;
                }
                return;
            case 102742843:
                if (str.equals(ListingCardSize.LARGE)) {
                    this.listingCardSize.setCardPerScreen(2);
                    this.listingCardSize.setAspectRatio(0.75f);
                    return;
                }
                return;
            case 109548807:
                if (str.equals(ListingCardSize.SMALL)) {
                    this.listingCardSize.setCardPerScreen(3);
                    this.listingCardSize.setAspectRatio(1.0f);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
