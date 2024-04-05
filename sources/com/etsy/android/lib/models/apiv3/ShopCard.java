package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.GiftOptions;
import com.etsy.android.lib.models.apiv3.cart.ShippingDetails;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.models.interfaces.ShopLike;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopCard extends BaseFieldModel implements ShopLike {
    public static final String SHOP_CARD = "shopCard";
    private static final long serialVersionUID = 9060218421854219479L;
    public String contentSource = "";
    public GiftOptions giftOptions;
    public int mActiveListingCount;
    public List<ListingCard> mDisplayListings = new ArrayList();
    public boolean mHasIcon;
    public String mHeadline = "";
    public Image mIcon;
    public boolean mIsFavorite;
    public boolean mIsVacation;
    private ListingCardSize mListingCardSize;
    public String mLocation = "";
    public String mLoginName = "";
    public Date mOpenDate;
    public Rating mRating;
    public String mSellerAvatar = "";
    public EtsyId mShopId = new EtsyId();
    public String mShopName = "";
    public String mShopUrl = "";
    public EtsyId mUserId = new EtsyId();
    public int mViewType = R.id.view_type_shop_card;
    public ShippingDetails shippingDetails;

    public int getActiveListingCount() {
        return this.mActiveListingCount;
    }

    public String getAvatarUrl() {
        return this.mSellerAvatar;
    }

    public double getAverageRating() {
        Rating rating = this.mRating;
        return rating != null ? rating.getRating() : ShadowDrawableWrapper.COS_45;
    }

    public List<? extends ListingLike> getCardListings() {
        return this.mDisplayListings;
    }

    public String getContentSource() {
        return this.contentSource;
    }

    public GiftOptions getGiftOptions() {
        return this.giftOptions;
    }

    public String getHeadline() {
        return this.mHeadline;
    }

    public Image getIcon() {
        return this.mIcon;
    }

    public String getIconUrl(int i) {
        Image image = this.mIcon;
        return image != null ? image.pickBestImageSource(i, i) : this.mSellerAvatar;
    }

    public ListingCardSize getListingCardSize() {
        return this.mListingCardSize;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public String getLoginName() {
        return this.mLoginName;
    }

    public int getNumRatings() {
        Rating rating = this.mRating;
        if (rating != null) {
            return rating.getRatingCount();
        }
        return 0;
    }

    public Date getOpenDate() {
        return this.mOpenDate;
    }

    public ShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public EtsyId getShopId() {
        return this.mShopId;
    }

    public String getShopName() {
        return this.mShopName;
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(PredefinedAnalyticsProperty.SHOP_ID, this.mShopId.getId());
        return hashMap;
    }

    public String getUrl() {
        return this.mShopUrl;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean hasIcon() {
        return this.mHasIcon;
    }

    public boolean hasRatings() {
        Rating rating = this.mRating;
        return rating != null && rating.getRatingCount() > 0;
    }

    public boolean isFavorite() {
        return this.mIsFavorite;
    }

    public boolean isVacation() {
        return this.mIsVacation;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("shop_id".equals(str)) {
            this.mShopId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("user_id".equals(str)) {
            this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.SHOP_NAME.equals(str)) {
            this.mShopName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.HEADLINE.equals(str)) {
            this.mHeadline = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.SELLER_AVATAR.equals(str)) {
            this.mSellerAvatar = BaseModel.parseStringURL(jsonParser);
            return true;
        } else if (ResponseConstants.SHOP_URL.equals(str)) {
            this.mShopUrl = BaseModel.parseStringURL(jsonParser);
            return true;
        } else if ("location".equals(str)) {
            this.mLocation = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.ACTIVE_LISTING_COUNT.equals(str)) {
            this.mActiveListingCount = jsonParser.getValueAsInt();
            return true;
        } else if (ResponseConstants.DISPLAY_LISTINGS.equals(str)) {
            this.mDisplayListings = BaseModel.parseArray(jsonParser, ListingCard.class);
            return true;
        } else if (ResponseConstants.RATING.equals(str)) {
            this.mRating = (Rating) BaseModel.parseObject(jsonParser, Rating.class);
            return true;
        } else if ("is_favorite".equals(str)) {
            this.mIsFavorite = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.IS_VACATION.equals(str)) {
            this.mIsVacation = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.HAS_ICON.equals(str)) {
            this.mHasIcon = jsonParser.getValueAsBoolean();
            return true;
        } else if (ResponseConstants.OPEN_DATE.equals(str)) {
            this.mOpenDate = BaseModel.parseIntoDate(jsonParser);
            return true;
        } else if (ResponseConstants.ICON.equals(str)) {
            this.mIcon = (Image) BaseModel.parseObject(jsonParser, Image.class);
            return true;
        } else if ("login_name".equals(str)) {
            this.mLoginName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.CONTENT_SOURCE.equals(str)) {
            this.contentSource = BaseModel.parseString(jsonParser);
            return true;
        } else if ("shipping".equals(str)) {
            this.shippingDetails = (ShippingDetails) BaseModel.parseObject(jsonParser, ShippingDetails.class);
            return true;
        } else if (!"giftOptions".equals(str)) {
            return false;
        } else {
            this.giftOptions = (GiftOptions) BaseModel.parseObject(jsonParser, GiftOptions.class);
            return true;
        }
    }

    public void setIsFavorite(boolean z) {
        this.mIsFavorite = z;
    }

    public void setListingCardSize(ListingCardSize listingCardSize) {
        this.mListingCardSize = listingCardSize;
    }

    public void setShopId(EtsyId etsyId) {
        this.mShopId = etsyId;
    }

    public void setShopName(String str) {
        this.mShopName = str;
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        super.setTrackingParameters(map);
    }

    public void setVacation(boolean z) {
        this.mIsVacation = z;
    }

    public void setViewType(int i) {
        this.mViewType = i;
    }
}
