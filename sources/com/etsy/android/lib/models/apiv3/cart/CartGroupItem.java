package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.apiv3.OfferingSelect;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.etsy.android.lib.models.apiv3.vespa.ViewTypeMapping;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import p193o.C7494b;

public class CartGroupItem extends BaseActionableItem {
    public static final String ELEMENT_ADD_PROMOTION = "addPromotion";
    public static final String ELEMENT_CARBON_EMISSION_SIGNAL = "carbonEmissionSignal";
    public static final String ELEMENT_CART_GROUP_DIVIDER = "cartGroupDivider";
    public static final String ELEMENT_CART_GROUP_ITEM_DIVIDER = "cartGroupItemDivider";
    public static final String ELEMENT_CART_LISTING = "cartListing";
    public static final String ELEMENT_CART_LISTING_GIFT_CARD = "cartListingGiftCard";
    public static final String ELEMENT_CART_LISTING_UNAVAILABLE = "cartListingUnavailable";
    public static final String ELEMENT_EMPTY_CART = "emptyCart";
    public static final String ELEMENT_GIFT_OPTIONS = "giftOptions";
    public static final String ELEMENT_MESSAGE_BANNER = "messageBanner";
    public static final String ELEMENT_MESSAGE_BUBBLE = "messageBubble";
    public static final String ELEMENT_MESSAGE_TO_SELLER = "messageToSeller";
    public static final String ELEMENT_OFFERING_SELECT = "offeringSelect";
    public static final String ELEMENT_PAYMENT_ADD_COUPON = "addCoupon";
    public static final String ELEMENT_PAYMENT_APPLY_GIFTCARD = "applyGiftCard";
    public static final String ELEMENT_PAYMENT_CHECKOUT = "checkout";
    public static final String ELEMENT_PAYMENT_CHECKOUT_GOOGLE_PAY = "checkout_google_pay";
    public static final String ELEMENT_PAYMENT_COUPON = "appliedCoupon";
    public static final String ELEMENT_PAYMENT_GRAND_TOTAL_LINE_ITEM = "grandTotalLineItem";
    public static final String ELEMENT_PAYMENT_HEADER = "paymentHeader";
    public static final String ELEMENT_PAYMENT_OPTIONS = "paymentOptions";
    public static final String ELEMENT_PAYMENT_TOTALS_DISCOUNT_LINE_ITEM = "discountLineItem";
    public static final String ELEMENT_PAYMENT_TOTALS_LINE_ITEM = "totalsLineItem";
    public static final String ELEMENT_PAYMENT_TOTALS_NOTE = "totalsNote";
    public static final String ELEMENT_PAYMENT_UPDATE_SHIPPING_COUNTRY = "updateShippingCountry";
    public static final String ELEMENT_PROMOTION = "promotion";
    public static final String ELEMENT_RECEIPT = "receipt";
    public static final String ELEMENT_SAVED_FOR_LATER_CARD = "savedForLaterCard";
    public static final String ELEMENT_SAVED_FOR_LATER_CAROUSEL_HEADER = "savedForLaterCarouselHeader";
    public static final String ELEMENT_SHIPPING = "shipping";
    public static final String ELEMENT_SHOP_HEADER = "shopHeader";
    private static final long serialVersionUID = 8801840983365848669L;

    static {
        C7494b<String, ViewTypeMapping> bVar = BaseActionableItem.sTypeToClassMap;
        bVar.put(ELEMENT_SHOP_HEADER, new ViewTypeMapping(R.id.view_type_multishop_shop_header, ShopHeader.class));
        bVar.put("cartListing", new ViewTypeMapping(R.id.view_type_multishop_cart_listing, CartListing.class));
        bVar.put(ELEMENT_CART_LISTING_UNAVAILABLE, new ViewTypeMapping(R.id.view_type_multishop_cart_listing_unavailable, CartListing.class));
        bVar.put(ELEMENT_CART_LISTING_GIFT_CARD, new ViewTypeMapping(R.id.view_type_multishop_cart_listing_gift_card, CartListing.class));
        bVar.put("savedForLaterCard", new ViewTypeMapping(R.id.view_type_multishop_saved_for_later_card, SavedCart.class));
        bVar.put(ELEMENT_SAVED_FOR_LATER_CAROUSEL_HEADER, new ViewTypeMapping(R.id.view_type_multishop_saved_for_later_carousel_header, SavedForLaterCarouselHeader.class));
        bVar.put("shipping", new ViewTypeMapping(R.id.view_type_multishop_shipping, ShippingDetails.class));
        bVar.put(ELEMENT_MESSAGE_TO_SELLER, new ViewTypeMapping(R.id.view_type_multishop_message_to_seller, MessageToSeller.class));
        bVar.put("giftOptions", new ViewTypeMapping(R.id.view_type_gift_options, GiftOptions.class));
        bVar.put(ELEMENT_PAYMENT_ADD_COUPON, new ViewTypeMapping(R.id.view_type_multishop_payment_add_coupon, PaymentAddCoupon.class));
        bVar.put(ELEMENT_PAYMENT_COUPON, new ViewTypeMapping(R.id.view_type_multishop_payment_applied_coupon, PaymentAppliedCoupon.class));
        bVar.put(ELEMENT_ADD_PROMOTION, new ViewTypeMapping(R.id.view_type_multishop_add_promotion, PaymentAddCoupon.class));
        bVar.put("applyCoupon", new ViewTypeMapping(R.id.view_type_apply_coupon, ApplyCoupon.class));
        bVar.put("appliedEtsyCoupon", new ViewTypeMapping(R.id.view_type_applied_coupon, AppliedCoupon.class));
        bVar.put(ELEMENT_PAYMENT_TOTALS_LINE_ITEM, new ViewTypeMapping(R.id.view_type_total_line_item, TotalsLineItem.class));
        bVar.put(ELEMENT_PAYMENT_GRAND_TOTAL_LINE_ITEM, new ViewTypeMapping(R.id.view_type_grand_total_line_item, TotalsLineItem.class));
        bVar.put(ELEMENT_PAYMENT_TOTALS_DISCOUNT_LINE_ITEM, new ViewTypeMapping(R.id.view_type_discount_total_line_item, TotalsLineItem.class));
        bVar.put(ELEMENT_PAYMENT_TOTALS_NOTE, new ViewTypeMapping(R.id.view_type_totals_note, TotalsNote.class));
        bVar.put(ELEMENT_PAYMENT_CHECKOUT, new ViewTypeMapping(R.id.view_type_multishop_checkout_section, CheckoutSection.class));
        bVar.put(ELEMENT_MESSAGE_BUBBLE, new ViewTypeMapping(R.id.view_type_multishop_message_bubble, CartMessageBubble.class));
        bVar.put(ELEMENT_PAYMENT_HEADER, new ViewTypeMapping(R.id.view_type_multishop_payment_header, PaymentHeader.class));
        bVar.put(ELEMENT_PAYMENT_APPLY_GIFTCARD, new ViewTypeMapping(R.id.view_type_multishop_payment_apply_gift_card, PaymentApplyGiftCard.class));
        bVar.put(ELEMENT_PAYMENT_OPTIONS, new ViewTypeMapping(R.id.view_type_multishop_payment_options, PaymentOptions.class));
        bVar.put(ELEMENT_MESSAGE_BANNER, new ViewTypeMapping(R.id.view_type_multishop_message_banner, MessageBanner.class));
        bVar.put(ELEMENT_PAYMENT_UPDATE_SHIPPING_COUNTRY, new ViewTypeMapping(R.id.view_type_multishop_payment_update_shipping_country, PaymentUpdateShippingCountry.class));
        bVar.put("promotion", new ViewTypeMapping(R.id.view_type_promotion, Promotion.class));
        bVar.put("receipt", new ViewTypeMapping(R.id.view_type_multishop_cart_receipt, CartReceipt.class));
        bVar.put("offeringSelect", new ViewTypeMapping(0, OfferingSelect.class));
        bVar.put(ELEMENT_CART_GROUP_DIVIDER, new ViewTypeMapping(R.id.view_type_cart_group_divider, CartGroupDivider.class));
        bVar.put(ELEMENT_CART_GROUP_ITEM_DIVIDER, new ViewTypeMapping(R.id.view_type_cart_group_item_divider, CartGroupItemDivider.class));
        bVar.put(ELEMENT_CARBON_EMISSION_SIGNAL, new ViewTypeMapping(R.id.view_type_carbon_emission_signal, CarbonEmissionSignal.class));
        bVar.put(ELEMENT_EMPTY_CART, new ViewTypeMapping(R.id.view_type_multishop_empty_cart, EmptyCart.class));
        bVar.put("collageAlert", new ViewTypeMapping(R.id.view_type_collage_alert, CartCollageAlert.class));
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (!ELEMENT_PAYMENT_CHECKOUT.equals(str)) {
            return super.parseField(jsonParser, str);
        }
        CheckoutSection checkoutSection = (CheckoutSection) BaseModel.parseObject(jsonParser, CheckoutSection.class);
        this.mData = checkoutSection;
        if (checkoutSection == null) {
            return true;
        }
        setViewType(R.id.view_type_multishop_checkout_section);
        return true;
    }
}
