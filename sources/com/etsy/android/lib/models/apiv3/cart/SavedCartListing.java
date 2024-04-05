package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.GiftCardInfo;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Variation;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ListingState;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SavedCartListing extends ListingCard {
    private static final long serialVersionUID = 8525951090074315044L;
    public EtsyId mCartListingCustomizationId;
    public String mDescription = "";
    public GiftCardInfo mGiftCardInfo;
    public boolean mIsCustomOrder;
    public boolean mIsDigital;
    public boolean mIsGiftCard;
    public Money mItemPrice;
    public int mPurchaseQuantity;
    public String mRegistryName;
    public List<Variation> mSelectedVariations = new ArrayList();
    public int mState;
    public Money mTotalPrice;

    public String getDescription() {
        return this.mDescription;
    }

    public String getItemPriceString() {
        Money money = this.mItemPrice;
        return money != null ? money.toString() : "";
    }

    public int getPurchaseQuantity() {
        return this.mPurchaseQuantity;
    }

    public List<Variation> getSelectedVariations() {
        return this.mSelectedVariations;
    }

    public int getState() {
        return this.mState;
    }

    public boolean hasVariations() {
        return false;
    }

    public boolean isAvailable() {
        return ListingState.isActive(getState());
    }

    public boolean isDigital() {
        return this.mIsDigital;
    }

    public boolean isGiftCard() {
        return this.mIsGiftCard;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.CART_LISTING_CUSTOMIZATION_ID.equals(str)) {
            this.mCartListingCustomizationId = new EtsyId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.PURCHASE_QUANTITY.equals(str)) {
            this.mPurchaseQuantity = jsonParser.getIntValue();
            return true;
        } else if (ResponseConstants.PRICE.equals(str)) {
            this.price = this.price.withAmount(String.valueOf(jsonParser.getDoubleValue()));
            return true;
        } else if (ResponseConstants.SELECTED_VARIATIONS.equals(str)) {
            this.mSelectedVariations.addAll(BaseModel.parseArray(jsonParser, Variation.class));
            return true;
        } else if ("state".equals(str)) {
            this.mState = jsonParser.getIntValue();
            return true;
        } else if ("is_digital".equals(str)) {
            this.mIsDigital = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.IS_CUSTOM_ORDER.equals(str)) {
            this.mIsCustomOrder = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.REGISTRY_NAME.equals(str)) {
            this.mRegistryName = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.IS_GIFT_CARD.equals(str)) {
            this.mIsGiftCard = jsonParser.getBooleanValue();
            return true;
        } else if ("description".equals(str)) {
            this.mDescription = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.ITEM_PRICE.equals(str)) {
            this.mItemPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if (ResponseConstants.TOTAL_PRICE.equals(str)) {
            this.mTotalPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if (ResponseConstants.GIFT_CARD_INFO.equals(str)) {
            this.mGiftCardInfo = (GiftCardInfo) BaseModel.parseObject(jsonParser, GiftCardInfo.class);
            return true;
        } else if (!ResponseConstants.DISCOUNT_PRICE.equals(str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.discountedPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        }
    }

    public void setDiscountPrice(Money money) {
        this.discountedPrice = money;
    }

    public void setIsDigital(boolean z) {
        this.mIsDigital = z;
    }

    public void setIsGiftCard(boolean z) {
        this.mIsGiftCard = z;
    }

    public void setItemPrice(Money money) {
        this.mItemPrice = money;
    }

    public void setPurchaseQuantity(int i) {
        this.mPurchaseQuantity = i;
    }

    public void setSelectedVariations(List<Variation> list) {
        this.mSelectedVariations = list;
    }

    public void setState(int i) {
        this.mState = i;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, this.listingId.getId());
        return hashMap;
    }
}
