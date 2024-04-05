package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingSocialShare;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.apiv3.ShopSocialShare;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CartReceipt extends BaseFieldModel {
    private static final String SOCIAL_ORGANIC_SHARE_LISTING = "share_listing";
    private static final String SOCIAL_ORGANIC_SHARE_SHOP = "share_shop";
    private static final long serialVersionUID = -8604225301065147340L;
    public ListSection listingRecommendationsSection = null;
    public String mDescription = "";
    public boolean mIsFavorite;
    public boolean mIsPrivateShop = false;
    public List<String> mListingIds = new ArrayList();
    public List<ListingImage> mListingImages = new ArrayList();
    public ListingSocialShare mListingSocialShare = null;
    public String mLoginName = "";
    public EtsyId mReceiptId = new EtsyId();
    public Money mReceiptTotal = new Money();
    public EtsyId mShopId = new EtsyId();
    public String mShopName = "";
    public ShopSocialShare mShopSocialShare = null;
    public EtsyId mShopUserId = new EtsyId();
    public String mSubtitle = "";
    public String mTitle = "";

    public String getDescription() {
        return this.mDescription;
    }

    public boolean getIsFavorite() {
        return this.mIsFavorite;
    }

    public List<String> getListingIds() {
        return this.mListingIds;
    }

    public List<ListingImage> getListingImages() {
        return this.mListingImages;
    }

    public ListSection getListingRecommendationsSection() {
        return this.listingRecommendationsSection;
    }

    public ListingSocialShare getListingSocialShare() {
        return this.mListingSocialShare;
    }

    public String getLoginName() {
        return this.mLoginName;
    }

    public EtsyId getReceiptId() {
        return this.mReceiptId;
    }

    public Money getReceiptTotal() {
        return this.mReceiptTotal;
    }

    public EtsyId getShopId() {
        return this.mShopId;
    }

    public String getShopName() {
        return this.mShopName;
    }

    public ShopSocialShare getShopSocialShare() {
        return this.mShopSocialShare;
    }

    public EtsyId getShopUserId() {
        return this.mShopUserId;
    }

    public String getSubtitle() {
        return this.mSubtitle;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isPrivateShop() {
        return this.mIsPrivateShop;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if ("subtitle".equals(str)) {
            this.mSubtitle = BaseModel.parseString(jsonParser);
            return true;
        } else if ("description".equals(str)) {
            this.mDescription = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.RECEIPT_ID.equals(str)) {
            this.mReceiptId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("login_name".equals(str)) {
            this.mLoginName = BaseModel.parseString(jsonParser);
            return true;
        } else if ("shop_id".equals(str)) {
            this.mShopId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.SHOP_USER_ID.equals(str)) {
            this.mShopUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.SHOP_NAME.equals(str)) {
            this.mShopName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.IS_FAVORITE_SHOP.equals(str)) {
            this.mIsFavorite = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.IS_PRIVATE_SHOP.equals(str)) {
            this.mIsPrivateShop = jsonParser.getBooleanValue();
            return true;
        } else if ("images".equals(str)) {
            this.mListingImages = BaseModel.parseArray(jsonParser, ListingImage.class);
            return true;
        } else if (ResponseConstants.LISTING_IDS.equals(str)) {
            this.mListingIds = BaseModel.parseStringArray(jsonParser);
            return true;
        } else if (ResponseConstants.RECEIPT_TOTAL.equals(str)) {
            this.mReceiptTotal = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if (SOCIAL_ORGANIC_SHARE_LISTING.equals(str)) {
            this.mListingSocialShare = (ListingSocialShare) BaseModel.parseObject(jsonParser, ListingSocialShare.class);
            return true;
        } else if (SOCIAL_ORGANIC_SHARE_SHOP.equals(str)) {
            this.mShopSocialShare = (ShopSocialShare) BaseModel.parseObject(jsonParser, ShopSocialShare.class);
            return true;
        } else if (!str.equals("listing_recommendations")) {
            return false;
        } else {
            this.listingRecommendationsSection = (ListSection) BaseModel.parseObject(jsonParser, ListSection.class);
            return true;
        }
    }

    public void setFavorite(boolean z) {
        this.mIsFavorite = z;
    }
}
