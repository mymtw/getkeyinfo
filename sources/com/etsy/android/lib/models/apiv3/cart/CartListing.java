package com.etsy.android.lib.models.apiv3.cart;

import android.text.TextUtils;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.CartPersonalization;
import com.etsy.android.lib.models.GiftCardInfo;
import com.etsy.android.lib.models.Nudge;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingState;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CartListing extends BaseFieldModel {
    private static final long serialVersionUID = 8945828275579736344L;
    public String groupId = "";
    public String mComplianceDescription = "";
    public GiftCardInfo mGiftCardInfo;
    public boolean mHasFreeShipping;
    public boolean mIsCustomOrder;
    public boolean mIsDigital;
    public boolean mIsGiftCard;
    public boolean mIsSingleQuantity;
    public Money mItemPrice;
    public EtsyId mListingId = new EtsyId();
    public ListingImage mListingImage;
    public Nudge mNudge;
    public Promotion mPromotion;
    public int mPurchaseQuantity;
    public int mQuantity = -1;
    public String mRegistryName;
    public int mState;
    public String mTitle = "";
    public Money mTotalPrice;
    public String mUnitPriceString;
    public List<CartVariation> mVariations = new ArrayList();
    public CartPersonalization personalization;

    public String getComplianceDescription() {
        return this.mComplianceDescription;
    }

    public GiftCardInfo getGiftCardInfo() {
        return this.mGiftCardInfo;
    }

    public Money getItemPrice() {
        return this.mItemPrice;
    }

    public String getItemPriceString() {
        Money money = this.mItemPrice;
        return money != null ? money.toString() : "";
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public ListingImage getListingImage() {
        return this.mListingImage;
    }

    public Nudge getNudge() {
        return this.mNudge;
    }

    public CartPersonalization getPersonalization() {
        return this.personalization;
    }

    public Promotion getPromotion() {
        return this.mPromotion;
    }

    public int getPurchaseQuantity() {
        return this.mPurchaseQuantity;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public CharSequence getRegistryName() {
        return this.mRegistryName;
    }

    public int getState() {
        return this.mState;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getTotalPriceString() {
        Money money = this.mTotalPrice;
        return money != null ? money.toString() : "";
    }

    public String getUnitPriceString() {
        return this.mUnitPriceString;
    }

    public List<CartVariation> getVariations() {
        return this.mVariations;
    }

    public boolean hasFreeShipping() {
        return this.mHasFreeShipping;
    }

    public boolean hasVariations() {
        return !this.mVariations.isEmpty();
    }

    public boolean isAvailable() {
        return ListingState.isActive(getState());
    }

    public boolean isCustomOrder() {
        return this.mIsCustomOrder;
    }

    public boolean isDigital() {
        return this.mIsDigital;
    }

    public boolean isGiftCard() {
        return this.mIsGiftCard;
    }

    public boolean isRegistryItem() {
        return !TextUtils.isEmpty(this.mRegistryName);
    }

    public boolean isSingleQuantity() {
        return this.mIsSingleQuantity;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("listing_id".equals(str)) {
            this.mListingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        } else if (ResponseConstants.IMG.equals(str)) {
            this.mListingImage = (ListingImage) BaseModel.parseObject(jsonParser, ListingImage.class);
            return true;
        } else if (ResponseConstants.QUANTITY.equals(str)) {
            this.mQuantity = jsonParser.getValueAsInt();
            return true;
        } else if (ResponseConstants.PURCHASE_QUANTITY.equals(str)) {
            this.mPurchaseQuantity = jsonParser.getIntValue();
            return true;
        } else if (ResponseConstants.IS_SINGLE_QUANTITY.equals(str)) {
            this.mIsSingleQuantity = jsonParser.getBooleanValue();
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
        } else if (ResponseConstants.ITEM_PRICE.equals(str)) {
            this.mItemPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if (ResponseConstants.TOTAL_PRICE.equals(str)) {
            this.mTotalPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            return true;
        } else if (ResponseConstants.VARIATIONS.equals(str)) {
            this.mVariations = BaseModel.parseArray(jsonParser, CartVariation.class);
            return true;
        } else if (ResponseConstants.GIFT_CARD_INFO.equals(str)) {
            this.mGiftCardInfo = (GiftCardInfo) BaseModel.parseObject(jsonParser, GiftCardInfo.class);
            return true;
        } else if (ResponseConstants.COMPLIANCE_DESCRIPTION.equals(str)) {
            this.mComplianceDescription = BaseModel.parseString(jsonParser);
            return true;
        } else if ("promotion".equals(str)) {
            this.mPromotion = (Promotion) BaseModel.parseObject(jsonParser, Promotion.class);
            return true;
        } else if (ResponseConstants.NUDGE.equals(str)) {
            this.mNudge = (Nudge) BaseModel.parseObject(jsonParser, Nudge.class);
            return true;
        } else if (ResponseConstants.HAS_FREE_SHIPPING.equals(str)) {
            this.mHasFreeShipping = jsonParser.getBooleanValue();
            return true;
        } else if (ResponseConstants.UNIT_PRICE_STRING.equals(str)) {
            this.mUnitPriceString = BaseModel.parseString(jsonParser);
            return true;
        } else if (!ResponseConstants.PERSONALIZATION.equals(str)) {
            return false;
        } else {
            this.personalization = (CartPersonalization) BaseModel.parseObject(jsonParser, CartPersonalization.class);
            return true;
        }
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, this.mListingId.getId());
        return hashMap;
    }
}
