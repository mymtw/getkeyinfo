package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.Listing;

public enum CollectionPrivacyLevel {
    PRIVATE("private"),
    DRAFT(Listing.DRAFT_STATE),
    PUBLIC("public");
    
    private final String privacyLevelString;

    private CollectionPrivacyLevel(String str) {
        this.privacyLevelString = str;
    }

    public final String getPrivacyLevelString() {
        return this.privacyLevelString;
    }
}
