package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;

public enum SavableSearchQueryType {
    SAVED(CartWithSavedKey.SAVED_TAB),
    RECENT("recent");
    
    private final String key;

    private SavableSearchQueryType(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
