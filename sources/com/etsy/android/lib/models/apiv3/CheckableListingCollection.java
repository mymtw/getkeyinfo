package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class CheckableListingCollection extends ListingCollection {
    private static final long serialVersionUID = 1574795834917265206L;
    private boolean mIsChecked;
    private boolean syntheticCreateNewItem;

    public CheckableListingCollection() {
        this.syntheticCreateNewItem = false;
    }

    public static CheckableListingCollection newCreateListSyntheticItem() {
        CheckableListingCollection checkableListingCollection = new CheckableListingCollection();
        checkableListingCollection.syntheticCreateNewItem = true;
        return checkableListingCollection;
    }

    public boolean getIsChecked() {
        return this.mIsChecked;
    }

    public boolean getWasChanged() {
        return this.mIsChecked != getIncludesListing();
    }

    public boolean isSyntheticCreateNewItem() {
        return this.syntheticCreateNewItem;
    }

    public void parseCollectionField(JsonParser jsonParser, String str) throws IOException {
        if ("includes_listing".equals(str)) {
            this.mIsChecked = jsonParser.getValueAsBoolean();
        }
        super.parseCollectionField(jsonParser, str);
    }

    public void setIsChecked(boolean z) {
        this.mIsChecked = z;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("{\"CheckableListingCollection\":{\"mIsChecked\":\"");
        h.append(this.mIsChecked);
        h.append("\", \"mCollectionId\":");
        h.append(this.mCollectionId);
        h.append(", \"mPrivacyLevel\":\"");
        h.append(this.mPrivacyLevel);
        h.append("\", \"syntheticCreateNewItem\":\"");
        h.append(this.syntheticCreateNewItem);
        h.append("\", \"mType\":\"");
        h.append(this.mType);
        h.append("\", \"mName\":\"");
        h.append(this.mName);
        h.append("\", \"mSlug\":\"");
        h.append(this.mSlug);
        h.append("\", \"mKey\":\"");
        h.append(this.mKey);
        h.append("\", \"mUrl\":\"");
        h.append(this.mUrl);
        h.append("\", \"mCreator\":");
        h.append(this.mCreator);
        h.append(", \"mIsNew\":\"");
        h.append(this.mIsNew);
        h.append("\", \"mListingsCount\":\"");
        h.append(this.mListingsCount);
        h.append("\", \"mRepresentativeListings\":");
        return C0326j.m865j(h, this.mRepresentativeListings, "}}");
    }

    public CheckableListingCollection(ListingCollection listingCollection) {
        super(listingCollection);
        this.syntheticCreateNewItem = false;
        this.mIsChecked = false;
    }
}
