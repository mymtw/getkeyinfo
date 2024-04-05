package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FormattedMoney;
import com.etsy.android.lib.models.apiv3.ListingState;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.viewstate.CartViewState;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.HashMap;

public class SavedCart extends BaseFieldModel {
    public static final String SAVED_CART_LISTING_TYPE = "cartListing";
    public static final String SAVED_FOR_LATER_CARD_TYPE = "savedForLaterCard";
    private static final long serialVersionUID = -3049154309863884368L;
    public EtsyId mCartId;
    public SavedCartListing mCartListing;
    public CartViewState mCartViewState = new CartViewState();
    public FormattedMoney mDiscountDescription;
    public ShopCard mShopCard;
    private int viewType = R.id.view_type_saved_cart_listing_card;

    public SavedCartListing getCartListing() {
        return this.mCartListing;
    }

    public FormattedMoney getDiscountDescription() {
        return this.mDiscountDescription;
    }

    public EtsyId getId() {
        return this.mCartId;
    }

    public ShopCard getShopCard() {
        return this.mShopCard;
    }

    public CartViewState getViewState() {
        return this.mCartViewState;
    }

    public int getViewType() {
        return this.viewType;
    }

    public boolean isAvailable() {
        return !this.mShopCard.isVacation() && ListingState.isActive(this.mCartListing.getState());
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (ResponseConstants.CART_ID.equals(str)) {
            this.mCartId = new EtsyId(BaseModel.parseStringIdOrNumericValue(jsonParser));
            return true;
        } else if (ResponseConstants.SHOP.equals(str)) {
            this.mShopCard = (ShopCard) BaseModel.parseObject(jsonParser, ShopCard.class);
            return true;
        } else if (ResponseConstants.LISTING.equals(str)) {
            this.mCartListing = (SavedCartListing) BaseModel.parseObject(jsonParser, SavedCartListing.class);
            return true;
        } else if (ResponseConstants.DISCOUNT_DESCRIPTION.equals(str)) {
            this.mDiscountDescription = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
            return true;
        } else {
            jsonParser.skipChildren();
            return false;
        }
    }

    public void setCartListing(SavedCartListing savedCartListing) {
        this.mCartListing = savedCartListing;
    }

    public void setCartViewState(CartViewState cartViewState) {
        this.mCartViewState = cartViewState;
    }

    public void setDiscountDescription(FormattedMoney formattedMoney) {
        this.mDiscountDescription = formattedMoney;
    }

    public void setId(EtsyId etsyId) {
        this.mCartId = etsyId;
    }

    public void setShopCard(ShopCard shopCard) {
        this.mShopCard = shopCard;
    }

    public void setViewType(int i) {
        this.viewType = i;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.CART_ID, this.mCartId);
        return hashMap;
    }
}
