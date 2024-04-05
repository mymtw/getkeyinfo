package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.FreeShippingListingData;
import com.etsy.android.lib.models.apiv3.GiftInfo;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.apiv3.OfferingResponse;
import com.etsy.android.lib.models.apiv3.TranslatedListing;
import com.etsy.android.lib.models.apiv3.VenueOverrides;
import com.etsy.android.lib.models.apiv3.cart.GooglePayLineItemContract;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.BasicListingLike;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Listing extends BaseModel implements ListingLike, BasicListingLike, GooglePayLineItemContract {
    public static final String ACTIVE_STATE = "active";
    public static final String CLOSED_STATE = "a_closed";
    public static final String CLOSED_STATE_M = "m_closed";
    public static final String DRAFT_STATE = "draft";
    public static final String EDIT_STATE = "edit";
    public static final String EXPIRED_STATE = "expired";
    public static final String INACTIVE_STATE = "inactive";
    public static final String REMOVED_STATE = "removed";
    public static final String SOLD_OUT_STATE = "sold_out";
    public static final String UNAVAILABLE_STATE = "unavailable";
    public static final String VACATION_STATE = "vacation";
    private static final long serialVersionUID = 2370637788962572030L;
    public boolean isVintage;
    public EtsyMoney mBuyerDisplayPrice;
    public List<Collection> mCollections;
    @Deprecated
    public String mConvertedPrice;
    public Date mCreationDate;
    public String mDescription;
    public Money mDiscountedPrice;
    public FreeShippingListingData mFreeShippingData;
    public GiftInfo mGiftInfo;
    public boolean mHasCollections;
    public List<ListingImage> mImages;
    public boolean mIsDigitalDownload;
    public boolean mIsFavorite;
    public boolean mIsPersonalizable;
    public boolean mIsPrivate;
    public boolean mIsVATInclusive;
    public String mLanguage;
    public EtsyId mListingId;
    public ListingPromotion mListingPromotion;
    public ListingVideos mListingVideos;
    public transient TranslatedListing mMachineTranslation;
    public List<Manufacturer> mManufacturers;
    public Nudge mNudge;
    public int mNumFavorers;
    public OfferingResponse mOfferings;
    public String mOriginalLanguage;
    public List<String> mOverview;
    public PaymentTemplate mPaymentInfo;
    public String mPersonalizationInstructions;
    public int mPersonalizationMaxChars;
    public boolean mPersonalizationRequired;
    public EtsyMoney mPrice;
    public int mProcessingMax;
    public int mProcessingMin;
    public int mQuantity;
    public boolean mRenewalOptionChosen;
    public List<ShippingInfo> mShippingInfo;
    public Shop mShop;
    public boolean mShouldAutoRenew;
    public SingleListingCheckout mSingleListingCheckout;
    public String mState;
    public String mTitle;
    public transient List<Listing> mTranslations;
    public String mTransparentPriceMessage;
    public String mUrl;
    public EtsyId mUserId;
    public List<Variation> mVariations;
    public List<VenueOverrides> mVenueOverrides;
    public QuickDelivery quickDelivery;
    public List<ReviewImage> reviewImages;
    public boolean shouldShowRelatedListings;
    public SustainabilitySignals sustainabilitySignals;
    public List<VariationImage> variationImages;

    public Listing() {
        this.mTitle = "";
        this.mPrice = C8630b.f18964e.mo21250c();
        this.mState = "";
        this.mShouldAutoRenew = false;
        this.mRenewalOptionChosen = false;
        this.mDescription = "";
        this.mUrl = "";
        this.mLanguage = "";
        this.mOriginalLanguage = "";
        this.mConvertedPrice = "";
        this.mBuyerDisplayPrice = C8630b.f18964e.mo21250c();
        this.mIsPrivate = false;
        this.mIsDigitalDownload = false;
        this.mIsVATInclusive = false;
        this.mTransparentPriceMessage = "";
        this.mHasCollections = false;
        this.mVenueOverrides = new ArrayList();
        this.shouldShowRelatedListings = true;
        this.mListingId = new EtsyId();
        this.mUserId = new EtsyId();
        this.mImages = new ArrayList(0);
        this.mShippingInfo = new ArrayList(0);
        this.mVariations = new ArrayList(0);
        this.mManufacturers = new ArrayList(0);
        this.mCollections = new ArrayList(0);
        this.mOverview = new ArrayList(0);
        this.variationImages = new ArrayList(0);
    }

    public boolean canAddToCart() {
        return !isSoldOut() && !isExpired() && !isUnavailable() && !isRemoved() && !isOnVacation() && !isInactiveOrEdit() && !isClosed();
    }

    public boolean canFavorite() {
        return !isExpired() && !isUnavailable() && !isRemoved() && !isInactiveOrEdit() && !isClosed();
    }

    public boolean containsReviewForListing() {
        if (getShop() != null) {
            return getShop().containsReviewForListing(getListingId());
        }
        return false;
    }

    public boolean equals(Object obj) {
        return obj instanceof Listing ? ((Listing) obj).getListingId().equals(getListingId()) : super.equals(obj);
    }

    public List<Collection> getCollections() {
        return this.mCollections;
    }

    public Date getCreationDate() {
        return this.mCreationDate;
    }

    public String getCurrencyCode() {
        return (this.mBuyerDisplayPrice.getAmount().equals(new BigDecimal(0)) ? this.mPrice : this.mBuyerDisplayPrice).getCurrency().getCurrencyCode();
    }

    public String getDescription() {
        return this.mDescription;
    }

    public Money getDiscountedPrice() {
        return this.mDiscountedPrice;
    }

    public FreeShippingListingData getFreeShippingData() {
        return this.mFreeShippingData;
    }

    public GiftInfo getGiftInfo() {
        return this.mGiftInfo;
    }

    public ListingImage getImage() {
        if (this.mImages.size() > 0) {
            return this.mImages.get(0);
        }
        return null;
    }

    public List<ListingImage> getImages() {
        return this.mImages;
    }

    public String getLanguage() {
        return this.mLanguage;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public ListingImage getListingImage() {
        return getImage();
    }

    public ListingPromotion getListingPromotion() {
        return this.mListingPromotion;
    }

    public ListingVideos getListingVideos() {
        return this.mListingVideos;
    }

    public List<Manufacturer> getManufacturers() {
        return this.mManufacturers;
    }

    public Nudge getNudge() {
        return this.mNudge;
    }

    public int getNumFavorers() {
        return this.mNumFavorers;
    }

    public OfferingResponse getOfferings() {
        return this.mOfferings;
    }

    public String getOriginalLanguage() {
        return "".equals(this.mOriginalLanguage) ? this.mLanguage : this.mOriginalLanguage;
    }

    public Listing getOriginalTranslation() {
        List<Listing> list = this.mTranslations;
        if (list != null) {
            for (Listing next : list) {
                if (this.mOriginalLanguage.equals(next.getLanguage())) {
                    return next;
                }
            }
        }
        return this;
    }

    public List<String> getOverview() {
        return this.mOverview;
    }

    public PaymentTemplate getPaymentInfo() {
        return this.mPaymentInfo;
    }

    public String getPersonalizationInstructions() {
        return this.mPersonalizationInstructions;
    }

    public int getPersonalizationMaxChars() {
        return this.mPersonalizationMaxChars;
    }

    public EtsyMoney getPrice() {
        return this.mBuyerDisplayPrice.getAmount().equals(new BigDecimal(0)) ? this.mPrice : this.mBuyerDisplayPrice;
    }

    public int getProcessingDaysMax() {
        return this.mProcessingMax;
    }

    public int getProcessingDaysMin() {
        return this.mProcessingMin;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public QuickDelivery getQuickDelivery() {
        return this.quickDelivery;
    }

    public boolean getRenewalOptionChosen() {
        return this.mRenewalOptionChosen;
    }

    public List<ReviewImage> getReviewImages() {
        return this.reviewImages;
    }

    public int getRole() {
        return 0;
    }

    public int getSelectedVariationCount() {
        int i = 0;
        if (this.mVariations.size() > 0) {
            for (Variation hasOptionSet : this.mVariations) {
                if (hasOptionSet.hasOptionSet()) {
                    i++;
                }
            }
        }
        return i;
    }

    public String getSelectedVariations() {
        JSONObject jSONObject = new JSONObject();
        for (Variation next : this.mVariations) {
            if (next.hasOptionSet()) {
                try {
                    jSONObject.put(next.getPropertyId() + "", next.getValueId());
                } catch (JSONException e) {
                    C8694h.f19097a.mo21309d("error parsing variation to JSON", e);
                }
            }
        }
        return jSONObject.toString();
    }

    public List<ShippingInfo> getShippingInfo() {
        return this.mShippingInfo;
    }

    public Shop getShop() {
        return this.mShop;
    }

    public EtsyId getShopId() {
        Shop shop = this.mShop;
        if (shop != null) {
            return shop.getShopId();
        }
        return null;
    }

    public String getShopName() {
        Shop shop = this.mShop;
        if (shop != null) {
            return shop.getShopName();
        }
        return null;
    }

    public boolean getShouldAutoRenew() {
        return this.mShouldAutoRenew;
    }

    public SingleListingCheckout getSingleListingCheckout() {
        return this.mSingleListingCheckout;
    }

    public String getState() {
        return this.mState;
    }

    public SustainabilitySignals getSustainabilitySignals() {
        return this.sustainabilitySignals;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public List<Listing> getTranslations() {
        return this.mTranslations;
    }

    public String getTransparentPriceMessage() {
        return this.mTransparentPriceMessage;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public Variation getVariation(int i) {
        for (Variation next : this.mVariations) {
            if (next.getPropertyId() == ((long) i)) {
                return next;
            }
        }
        return null;
    }

    public int getVariationCount() {
        return this.mVariations.size();
    }

    public List<VariationImage> getVariationImages() {
        return this.variationImages;
    }

    public List<Variation> getVariations() {
        return this.mVariations;
    }

    public List<VenueOverrides> getVenueOverrides() {
        return this.mVenueOverrides;
    }

    public boolean hasCollections() {
        return this.mHasCollections;
    }

    public boolean hasFreeShipping() {
        return this.mFreeShippingData != null;
    }

    public boolean hasManufacturers() {
        return this.mManufacturers.size() > 0;
    }

    public boolean hasOverview() {
        List<String> list = this.mOverview;
        return list != null && list.size() > 0;
    }

    public boolean hasPriceDiffVariation() {
        for (Variation hasPriceDiff : this.mVariations) {
            if (hasPriceDiff.hasPriceDiff()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSellerDiscountDescription() {
        return getListingPromotion() != null && !TextUtils.isEmpty(getListingPromotion().getSellerDescription());
    }

    public boolean hasSellerFreeShippingDescription() {
        return getFreeShippingData() != null && !TextUtils.isEmpty(getFreeShippingData().getSellerDescription());
    }

    public boolean hasTransparentPriceMessage() {
        return C8885d0.m17323g(getTransparentPriceMessage());
    }

    public boolean hasVariations() {
        return this.mVariations.size() > 0;
    }

    public boolean hasVideos() {
        ListingVideos listingVideos = this.mListingVideos;
        return (listingVideos == null || listingVideos.getVideos() == null || this.mListingVideos.getVideos().size() == 0) ? false : true;
    }

    public int hashCode() {
        return this.mListingId.hashCode();
    }

    public boolean isActive() {
        return "active".equalsIgnoreCase(this.mState);
    }

    public boolean isAd() {
        return false;
    }

    public boolean isClosed() {
        return CLOSED_STATE.equalsIgnoreCase(this.mState) || CLOSED_STATE_M.equalsIgnoreCase(this.mState);
    }

    public boolean isConverted() {
        return !this.mConvertedPrice.equals("");
    }

    public boolean isDigitalDownload() {
        return this.mIsDigitalDownload;
    }

    public boolean isDraft() {
        return DRAFT_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isEditState() {
        return EDIT_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isExpired() {
        return EXPIRED_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isFavorite() {
        return this.mIsFavorite;
    }

    public boolean isInactive() {
        return INACTIVE_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isInactiveOrEdit() {
        return isInactive() || isEditState();
    }

    public boolean isOnVacation() {
        return VACATION_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isPersonalizable() {
        return this.mIsPersonalizable;
    }

    public boolean isPersonalizationRequired() {
        return this.mPersonalizationRequired;
    }

    public boolean isPrivate() {
        return this.mIsPrivate;
    }

    public boolean isRemoved() {
        return REMOVED_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isSingleListingCheckoutAvailable() {
        SingleListingCheckout singleListingCheckout = this.mSingleListingCheckout;
        return singleListingCheckout != null && singleListingCheckout.isExpressCheckoutEligible();
    }

    public boolean isSoldOut() {
        return SOLD_OUT_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isUnavailable() {
        return UNAVAILABLE_STATE.equalsIgnoreCase(this.mState);
    }

    public boolean isVATInclusive() {
        return this.mIsVATInclusive;
    }

    public boolean isVintage() {
        return this.isVintage;
    }

    public boolean isVisible() {
        return !isUnavailable() && !isRemoved() && !isInactiveOrEdit() && !isExpired() && !isClosed();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                parseListingField(jsonParser, currentName);
            }
        }
    }

    public void parseListingField(JsonParser jsonParser, String str) throws IOException {
        if ("listing_id".equals(str)) {
            this.mListingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if ("user_id".equals(str)) {
            this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if ("title".equals(str)) {
            this.mTitle = BaseModel.parseString(jsonParser);
        } else if ("description".equals(str)) {
            this.mDescription = BaseModel.parseString(jsonParser).trim();
        } else if (ResponseConstants.PRICE.equals(str)) {
            this.mPrice = this.mPrice.withAmount(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.CURRENCY_CODE.equals(str)) {
            this.mPrice = this.mPrice.withCurrency(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.BUYER_DISPLAY_PRICE.equals(str)) {
            this.mBuyerDisplayPrice = this.mBuyerDisplayPrice.withAmount(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.BUYER_DISPLAY_CURRENCY_CODE.equals(str)) {
            this.mBuyerDisplayPrice = this.mBuyerDisplayPrice.withCurrency(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.CONVERTED_PRICE.equals(str)) {
            this.mConvertedPrice = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.QUANTITY.equals(str)) {
            this.mQuantity = jsonParser.getValueAsInt();
        } else if (ResponseConstants.PROCESSING_MIN.equals(str)) {
            this.mProcessingMin = jsonParser.getValueAsInt();
        } else if (ResponseConstants.PROCESSING_MAX.equals(str)) {
            this.mProcessingMax = jsonParser.getValueAsInt();
        } else if ("is_favorite".equals(str)) {
            this.mIsFavorite = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_PRIVATE.equals(str)) {
            this.mIsPrivate = jsonParser.getValueAsBoolean();
        } else if ("is_digital".equals(str)) {
            this.mIsDigitalDownload = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_VAT_INCLUSIVE.equals(str)) {
            this.mIsVATInclusive = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.TRANSPARENT_PRICE_MESSAGE.equals(str)) {
            this.mTransparentPriceMessage = BaseModel.parseString(jsonParser);
        } else if ("url".equals(str)) {
            this.mUrl = BaseModel.parseStringURL(jsonParser);
        } else if ("state".equals(str)) {
            this.mState = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.NUM_FAVORERS.equals(str)) {
            this.mNumFavorers = jsonParser.getValueAsInt();
        } else if (ResponseConstants.CREATION_TSZ.equals(str)) {
            this.mCreationDate = BaseModel.parseIntoDate(jsonParser);
        } else if (ResponseConstants.Includes.SHOP.equals(str)) {
            this.mShop = (Shop) BaseModel.parseObject(jsonParser, Shop.class);
        } else if ("Images".equals(str) || ResponseConstants.IMG.equals(str) || ResponseConstants.LISTING_IMAGES.equals(str)) {
            this.mImages = BaseModel.parseArray(jsonParser, ListingImage.class);
        } else if (ResponseConstants.Includes.VARIATIONS.equals(str)) {
            this.mVariations = BaseModel.parseArray(jsonParser, Variation.class);
        } else if (ResponseConstants.Includes.MANUFACTURERS.equals(str)) {
            this.mManufacturers = BaseModel.parseArray(jsonParser, Manufacturer.class);
        } else {
            boolean z = false;
            if (ResponseConstants.IN_COLLECTIONS.equals(str)) {
                this.mCollections = BaseModel.parseArray(jsonParser, Collection.class);
                removeFavoritesCollection();
                if (this.mCollections.size() > 0) {
                    z = true;
                }
                setHasCollections(z);
            } else if (ResponseConstants.Includes.SHIPPING_INFO.equals(str)) {
                this.mShippingInfo = BaseModel.parseArray(jsonParser, ShippingInfo.class);
            } else if (ResponseConstants.Includes.PAYMENT_INFO.equals(str)) {
                this.mPaymentInfo = (PaymentTemplate) BaseModel.parseObject(jsonParser, PaymentTemplate.class);
            } else if (ResponseConstants.OVERVIEW.equals(str)) {
                this.mOverview = BaseModel.parseStringArray(jsonParser);
            } else if ("language".equals(str)) {
                this.mLanguage = BaseModel.parseString(jsonParser);
            } else if (ResponseConstants.ALTERNATE_LANGUAGE.equals(str)) {
                this.mOriginalLanguage = BaseModel.parseString(jsonParser);
            } else if (ResponseConstants.TRANSLATIONS.equals(str)) {
                this.mTranslations = BaseModel.parseArray(jsonParser, Listing.class);
            } else if (ResponseConstants.Includes.VIDEOS.equals(str)) {
                List<ListingVideos> parseArray = BaseModel.parseArray(jsonParser, ListingVideos.class);
                this.mListingVideos = (parseArray == null || parseArray.size() <= 0) ? null : parseArray.get(0);
            } else if (ResponseConstants.OFFERINGS.equals(str)) {
                this.mOfferings = (OfferingResponse) BaseModel.parseObject(jsonParser, OfferingResponse.class);
            } else if (ResponseConstants.SINGLE_LISTING_CHECKOUT.equals(str)) {
                this.mSingleListingCheckout = (SingleListingCheckout) BaseModel.parseObject(jsonParser, SingleListingCheckout.class);
            } else if (ResponseConstants.VENUE_OVERRIDES.equals(str)) {
                this.mVenueOverrides = BaseModel.parseArray(jsonParser, VenueOverrides.class);
            } else if ("promotion".equals(str)) {
                this.mListingPromotion = (ListingPromotion) BaseModel.parseObject(jsonParser, ListingPromotion.class);
            } else if (ResponseConstants.DISCOUNTED_PRICE.equals(str)) {
                this.mDiscountedPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
            } else if (ResponseConstants.FREE_SHIPPING_DATA.equals(str)) {
                this.mFreeShippingData = (FreeShippingListingData) BaseModel.parseObject(jsonParser, FreeShippingListingData.class);
            } else if (ResponseConstants.GIFT_INFO.equals(str)) {
                this.mGiftInfo = (GiftInfo) BaseModel.parseObject(jsonParser, GiftInfo.class);
            } else if (ResponseConstants.NUDGE.equals(str)) {
                this.mNudge = (Nudge) BaseModel.parseObject(jsonParser, Nudge.class);
            } else if (ResponseConstants.IS_PERSONALIZABLE.equals(str)) {
                this.mIsPersonalizable = jsonParser.getValueAsBoolean();
            } else if (ResponseConstants.PERSONALIZATION_INSTRUCTIONS.equals(str)) {
                this.mPersonalizationInstructions = BaseModel.parseString(jsonParser);
            } else if (ResponseConstants.PERSONALIZATION_MAXCHARS.equals(str)) {
                this.mPersonalizationMaxChars = jsonParser.getValueAsInt();
            } else if (ResponseConstants.PERSONALIZATION_REQUIRED.equals(str)) {
                this.mPersonalizationRequired = jsonParser.getValueAsBoolean();
            } else if (ResponseConstants.VARIATION_IMAGES.equals(str)) {
                this.variationImages = BaseModel.parseArray(jsonParser, VariationImage.class);
            } else if ("is_vintage".equals(str)) {
                this.isVintage = jsonParser.getValueAsBoolean();
            } else {
                jsonParser.skipChildren();
            }
        }
    }

    public void removeFavoritesCollection() {
        Iterator<Collection> it = this.mCollections.iterator();
        while (it.hasNext()) {
            if (Collection.TYPE_FAVORITES.equals(it.next().getType())) {
                it.remove();
            }
        }
    }

    public void setBuyerDisplayPrice(EtsyMoney etsyMoney) {
        this.mBuyerDisplayPrice = etsyMoney;
    }

    public void setConvertedPrice(String str) {
        this.mConvertedPrice = str;
    }

    public void setCreationDate(Date date) {
        this.mCreationDate = date;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDigitalDownload(boolean z) {
        this.mIsDigitalDownload = z;
    }

    public void setDiscountedPrice(Money money) {
        this.mDiscountedPrice = money;
    }

    public void setFavorite(boolean z) {
        this.mIsFavorite = z;
    }

    public void setFreeShippingData(FreeShippingListingData freeShippingListingData) {
        this.mFreeShippingData = freeShippingListingData;
    }

    public void setGiftInfo(GiftInfo giftInfo) {
        this.mGiftInfo = giftInfo;
    }

    public void setHasCollections(boolean z) {
        this.mHasCollections = z;
    }

    public void setImages(List<ListingImage> list) {
        this.mImages = list;
    }

    public void setIsFavorite(boolean z) {
        this.mIsFavorite = z;
    }

    public void setLanguage(String str) {
        this.mLanguage = str;
    }

    public void setListingId(EtsyId etsyId) {
        this.mListingId = etsyId;
    }

    public void setListingPromotion(ListingPromotion listingPromotion) {
        this.mListingPromotion = listingPromotion;
    }

    public void setMachineTranslation(TranslatedListing translatedListing) {
        this.mMachineTranslation = translatedListing;
    }

    public void setManufacturers(List<Manufacturer> list) {
        this.mManufacturers = list;
    }

    public void setNudge(Nudge nudge) {
        this.mNudge = nudge;
    }

    public void setNumFavorers(int i) {
        this.mNumFavorers = i;
    }

    public void setOfferings(OfferingResponse offeringResponse) {
        this.mOfferings = offeringResponse;
    }

    public void setOriginalLanguage(String str) {
        this.mOriginalLanguage = str;
    }

    public void setOverview(List<String> list) {
        this.mOverview = list;
    }

    public void setPaymentInfo(PaymentTemplate paymentTemplate) {
        this.mPaymentInfo = paymentTemplate;
    }

    public void setPersonalizable(boolean z) {
        this.mIsPersonalizable = z;
    }

    public void setPersonalizationInstructions(String str) {
        this.mPersonalizationInstructions = str;
    }

    public void setPersonalizationMaxChars(int i) {
        this.mPersonalizationMaxChars = i;
    }

    public void setPersonalizationRequired(boolean z) {
        this.mPersonalizationRequired = z;
    }

    public void setPrice(EtsyMoney etsyMoney) {
        this.mPrice = etsyMoney;
    }

    public void setPrivate(boolean z) {
        this.mIsPrivate = z;
    }

    public void setProcessingMax(int i) {
        this.mProcessingMax = i;
    }

    public void setProcessingMin(int i) {
        this.mProcessingMin = i;
    }

    public void setQuantity(int i) {
        this.mQuantity = i;
    }

    public void setQuickDelivery(QuickDelivery quickDelivery2) {
        this.quickDelivery = quickDelivery2;
    }

    public void setReviewImages(List<ReviewImage> list) {
        this.reviewImages = list;
    }

    public void setShippingInfo(List<ShippingInfo> list) {
        this.mShippingInfo = list;
    }

    public void setShop(Shop shop) {
        this.mShop = shop;
    }

    public void setShouldShowRelatedListings(boolean z) {
        this.shouldShowRelatedListings = z;
    }

    public void setSingleListingCheckout(SingleListingCheckout singleListingCheckout) {
        this.mSingleListingCheckout = singleListingCheckout;
    }

    public void setState(String str) {
        this.mState = str;
    }

    public void setSustainabilitySignals(SustainabilitySignals sustainabilitySignals2) {
        this.sustainabilitySignals = sustainabilitySignals2;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setTranslations(List<Listing> list) {
        this.mTranslations = list;
    }

    public void setTransparentPriceMessage(String str) {
        this.mTransparentPriceMessage = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setUserId(EtsyId etsyId) {
        this.mUserId = etsyId;
    }

    public void setVATInclusive(boolean z) {
        this.mIsVATInclusive = z;
    }

    public void setVariationImages(List<VariationImage> list) {
        this.variationImages = list;
    }

    public void setVariations(List<Variation> list) {
        this.mVariations = list;
    }

    public void setVenueOverrides(List<VenueOverrides> list) {
        this.mVenueOverrides = list;
    }

    public boolean shouldShowRelatedListings() {
        return this.shouldShowRelatedListings;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("{\"Listing\":");
        h.append(super.toString());
        h.append(", \"mListingId\":");
        h.append(this.mListingId);
        h.append(", \"mUserId\":");
        h.append(this.mUserId);
        h.append(", \"mTitle\":\"");
        h.append(this.mTitle);
        h.append("\", \"mPrice\":");
        h.append(this.mPrice);
        h.append(", \"mState\":\"");
        h.append(this.mState);
        h.append("\", \"mQuantity\":\"");
        h.append(this.mQuantity);
        h.append("\", \"mShouldAutoRenew\":\"");
        h.append(this.mShouldAutoRenew);
        h.append("\", \"mRenewalOptionChosen\":\"");
        h.append(this.mRenewalOptionChosen);
        h.append("\", \"mDescription\":\"");
        h.append(this.mDescription);
        h.append("\", \"mUrl\":\"");
        h.append(this.mUrl);
        h.append("\", \"mLanguage\":\"");
        h.append(this.mLanguage);
        h.append("\", \"mOriginalLanguage\":\"");
        h.append(this.mOriginalLanguage);
        h.append("\", \"mTranslations\":");
        h.append(this.mTranslations);
        h.append(", \"mMachineTranslation\":");
        h.append(this.mMachineTranslation);
        h.append(", \"mSingleListingCheckout\":");
        h.append(this.mSingleListingCheckout);
        h.append(", \"mGiftInfo\":");
        h.append(this.mGiftInfo);
        h.append(", \"mIsPersonalizable\":\"");
        h.append(this.mIsPersonalizable);
        h.append("\", \"mPersonalizationInstructions\":\"");
        h.append(this.mPersonalizationInstructions);
        h.append("\", \"mPersonalizationMaxChars\":\"");
        h.append(this.mPersonalizationMaxChars);
        h.append("\", \"mPersonalizationRequired\":\"");
        h.append(this.mPersonalizationRequired);
        h.append("\", \"mConvertedPrice\":\"");
        h.append(this.mConvertedPrice);
        h.append("\", \"mBuyerDisplayPrice\":");
        h.append(this.mBuyerDisplayPrice);
        h.append(", \"mProcessingMin\":\"");
        h.append(this.mProcessingMin);
        h.append("\", \"mProcessingMax\":\"");
        h.append(this.mProcessingMax);
        h.append("\", \"mNumFavorers\":\"");
        h.append(this.mNumFavorers);
        h.append("\", \"mIsFavorite\":\"");
        h.append(this.mIsFavorite);
        h.append("\", \"mIsPrivate\":\"");
        h.append(this.mIsPrivate);
        h.append("\", \"mIsDigitalDownload\":\"");
        h.append(this.mIsDigitalDownload);
        h.append("\", \"mIsVATInclusive\":\"");
        h.append(this.mIsVATInclusive);
        h.append("\", \"mTransparentPriceMessage\":\"");
        h.append(this.mTransparentPriceMessage);
        h.append("\", \"mHasCollections\":\"");
        h.append(this.mHasCollections);
        h.append("\", \"mCreationDate\":");
        h.append(this.mCreationDate);
        h.append(", \"mShop\":");
        h.append(this.mShop);
        h.append(", \"mPaymentInfo\":");
        h.append(this.mPaymentInfo);
        h.append(", \"mImages\":");
        h.append(this.mImages);
        h.append(", \"mShippingInfo\":");
        h.append(this.mShippingInfo);
        h.append(", \"mVariations\":");
        h.append(this.mVariations);
        h.append(", \"mManufacturers\":");
        h.append(this.mManufacturers);
        h.append(", \"mCollections\":");
        h.append(this.mCollections);
        h.append(", \"mOverview\":");
        h.append(this.mOverview);
        h.append(", \"reviewImages\":");
        h.append(this.reviewImages);
        h.append(", \"mListingVideos\":");
        h.append(this.mListingVideos);
        h.append(", \"mOfferings\":");
        h.append(this.mOfferings);
        h.append(", \"mVenueOverrides\":");
        h.append(this.mVenueOverrides);
        h.append(", \"mListingPromotion\":");
        h.append(this.mListingPromotion);
        h.append(", \"mDiscountedPrice\":");
        h.append(this.mDiscountedPrice);
        h.append(", \"mFreeShippingData\":");
        h.append(this.mFreeShippingData);
        h.append(", \"quickDelivery\":");
        h.append(this.quickDelivery);
        h.append(", \"sustainabilitySignals\":");
        h.append(this.sustainabilitySignals);
        h.append(", \"mNudge\":");
        h.append(this.mNudge);
        h.append(", \"variationImages\":");
        h.append(this.variationImages);
        h.append(", \"isVintage\":\"");
        h.append(this.isVintage);
        h.append("\"}");
        return h.toString();
    }

    public static boolean isActive(String str) {
        return "active".equalsIgnoreCase(str);
    }

    public static boolean isClosed(String str) {
        return CLOSED_STATE.equalsIgnoreCase(str);
    }

    public static boolean isDraft(String str) {
        return DRAFT_STATE.equalsIgnoreCase(str);
    }

    public static boolean isEditState(String str) {
        return EDIT_STATE.equalsIgnoreCase(str);
    }

    public static boolean isExpired(String str) {
        return EXPIRED_STATE.equalsIgnoreCase(str);
    }

    public static boolean isInactive(String str) {
        return INACTIVE_STATE.equalsIgnoreCase(str);
    }

    public static boolean isInactiveOrEdit(String str) {
        return isInactive(str) || isEditState(str);
    }

    public static boolean isOnVacation(String str) {
        return VACATION_STATE.equalsIgnoreCase(str);
    }

    public static boolean isRemoved(String str) {
        return REMOVED_STATE.equalsIgnoreCase(str);
    }

    public static boolean isSoldOut(String str) {
        return SOLD_OUT_STATE.equalsIgnoreCase(str);
    }

    public static boolean isUnavailable(String str) {
        return UNAVAILABLE_STATE.equalsIgnoreCase(str);
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, this.mListingId.getId());
        if (getShopId() != null) {
            hashMap.put(PredefinedAnalyticsProperty.SHOP_SHOP_ID, getShopId().getId());
        }
        return hashMap;
    }

    public Listing(EtsyId etsyId, String str) {
        this();
        this.mListingId = etsyId;
        this.mImages.add(ListingImage.createCompat(str, 0));
    }

    public Listing(EtsyId etsyId, String str, String str2, String str3, String str4, int i) {
        this.mTitle = "";
        this.mPrice = C8630b.f18964e.mo21250c();
        this.mState = "";
        this.mShouldAutoRenew = false;
        this.mRenewalOptionChosen = false;
        this.mDescription = "";
        this.mUrl = "";
        this.mLanguage = "";
        this.mOriginalLanguage = "";
        this.mConvertedPrice = "";
        this.mBuyerDisplayPrice = C8630b.f18964e.mo21250c();
        this.mIsPrivate = false;
        this.mIsDigitalDownload = false;
        this.mIsVATInclusive = false;
        this.mTransparentPriceMessage = "";
        this.mHasCollections = false;
        this.mVenueOverrides = new ArrayList();
        this.shouldShowRelatedListings = true;
        this.mUserId = new EtsyId();
        this.mImages = new ArrayList(0);
        this.mShippingInfo = new ArrayList(0);
        this.mVariations = new ArrayList(0);
        this.mManufacturers = new ArrayList(0);
        this.mCollections = new ArrayList(0);
        this.mOverview = new ArrayList(0);
        this.variationImages = new ArrayList(0);
        this.mListingId = etsyId;
        this.mTitle = str;
        EtsyMoney withAmount = this.mPrice.withAmount(str2);
        this.mPrice = withAmount;
        this.mPrice = withAmount.withCurrency(str3);
        this.mImages.add(ListingImage.createCompat(str4, i));
    }
}
