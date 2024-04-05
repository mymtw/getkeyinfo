package com.etsy.android.lib.models;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShopSection extends BaseModel {
    private static final long serialVersionUID = 5450494864709068115L;
    public List<ListingCard> listings;
    public int mListingActiveCount;
    public int mRank;
    public EtsyId mShopSectionId;
    public String mTitle;
    public String titleTranslated;

    public ShopSection() {
        this.mTitle = "";
        this.titleTranslated = null;
        this.mShopSectionId = new EtsyId();
    }

    public static ShopSection allItemsSection(Resources resources) {
        return new ShopSection(resources.getString(R.string.all_items), "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ShopSection)) {
            return false;
        }
        ShopSection shopSection = (ShopSection) obj;
        return shopSection.getTitle().equals(this.mTitle) && shopSection.getShopSectionId().equals(this.mShopSectionId);
    }

    public int getListingActiveCount() {
        return this.mListingActiveCount;
    }

    public List<ListingCard> getListings() {
        return this.listings;
    }

    public int getRank() {
        return this.mRank;
    }

    public EtsyId getShopSectionId() {
        return this.mShopSectionId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getTitleTranslated() {
        return this.titleTranslated;
    }

    public int hashCode() {
        return new HashCodeBuilder().append((Object) this.mTitle).append((Object) this.mShopSectionId).build().intValue();
    }

    public boolean isAllItemsSection() {
        return !this.mShopSectionId.hasId();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.SHOP_SECTION_ID.equals(currentName) || "section_id".equals(currentName)) {
                    this.mShopSectionId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.ACTIVE_LISTING_COUNT.equals(currentName)) {
                    this.mListingActiveCount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.RANK.equals(currentName)) {
                    this.mRank = jsonParser.getValueAsInt();
                } else if ("title".equals(currentName)) {
                    this.mTitle = BaseModel.parseString(jsonParser);
                } else if ("title_machine_translated".equals(currentName)) {
                    this.titleTranslated = BaseModel.parseString(jsonParser);
                } else if ("listings".equals(currentName)) {
                    this.listings = BaseModel.parseArray(jsonParser, ListingCard.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setListingActiveCount(int i) {
        this.mListingActiveCount = i;
    }

    public void setListings(List<ListingCard> list) {
        this.listings = new ArrayList(list);
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String toString() {
        return this.mTitle;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.SHOP_SECTION_ID, this.mShopSectionId.getId());
        return hashMap;
    }

    public ShopSection(String str, String str2) {
        this.titleTranslated = null;
        this.mTitle = str;
        this.mShopSectionId = new EtsyId(str2);
    }

    public ShopSection(String str, String str2, List<ListingCard> list, int i) {
        this.titleTranslated = null;
        this.mTitle = str;
        this.mShopSectionId = new EtsyId(str2);
        this.listings = new ArrayList(list);
        this.mListingActiveCount = i;
    }
}
