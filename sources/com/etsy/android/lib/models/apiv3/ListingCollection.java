package com.etsy.android.lib.models.apiv3;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class ListingCollection extends Collection {
    private boolean mIncludesListing;

    public ListingCollection() {
    }

    public boolean getIncludesListing() {
        return this.mIncludesListing;
    }

    public void parseCollectionField(JsonParser jsonParser, String str) throws IOException {
        if ("includes_listing".equals(str)) {
            this.mIncludesListing = jsonParser.getValueAsBoolean();
        } else {
            super.parseCollectionField(jsonParser, str);
        }
    }

    public void setIncludesListing(boolean z) {
        this.mIncludesListing = z;
    }

    public ListingCollection(Collection collection) {
        super(collection);
        this.mIncludesListing = false;
    }

    public ListingCollection(ListingCollection listingCollection) {
        super((Collection) listingCollection);
        this.mIncludesListing = listingCollection.getIncludesListing();
    }
}
