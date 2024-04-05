package com.etsy.android.lib.models.apiv3;

import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.SearchImpressionMetadata;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.ListingVideo;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListingCard extends BaseFieldModel implements ListingLike {
    public static final String ANCHOR_LISTING_ITEM_TYPE = "anchorListing";
    public static final String DISCOVER_LISTING_ITEM_TYPE = "discoverListing";
    public static final String FREE_SHIPPING = "free_shipping";
    public static final String IMAGES = "Images";
    public static final String LISTING_CARD_ITEM_TYPE = "listingCard";
    private static final String LOGGING_KEY = "logging_key";
    public static final String PROLIST_LOGGING_KEY = "prolist_logging_key";
    public static final String PROMOTION = "promotion";
    private static final String SHOP = "Shop";
    private static final long serialVersionUID = -1388981174596987905L;
    public String contentSource = "";
    public FormattedMoney discountDescription;
    public Money discountedPrice;
    public String formattedDiscountDescription = null;
    public FreeShippingData freeShippingData = new FreeShippingData();
    private String groupId = "";
    public boolean hasCollections;
    public boolean hasColorVariations;
    public boolean hasError;
    public boolean hasPopularNowSignal;
    public boolean hasStarSellerSignal;
    public boolean hasVariationPrices;
    public int inCartCount;
    public boolean isBestseller;
    public boolean isCustomizable;
    public boolean isDownload;
    public boolean isFavorite;
    public boolean isInCart;
    public boolean isScarce;
    public boolean isSoldOut;
    public boolean isVintage;
    private ListingCardSize listingCardSize;
    public EtsyId listingId = new EtsyId();
    public int listingImageCount;
    public List<ListingImage> listingImages = new ArrayList();
    public List<ListingVideo> listingVideos = new ArrayList();
    public EtsyMoney price = C8630b.f18964e.mo21250c();
    public double priceUnformatted;
    public String prolistDisplayLocation;
    public String prolistLoggingKey = "";
    private PromotionData promotionData;
    private List<Promotion> promotions;
    public int quantity = -1;
    public SearchImpressionMetadata searchImpressionMetadata;
    public String serverFormattedPrice = "";
    public float shopAverageRating = 0.0f;
    public EtsyId shopId = new EtsyId();
    public String shopName = "";
    public int shopTotalRatingCount = -1;
    public boolean shouldShowRelatedListings = true;
    public boolean showPricePill;
    public List<String> signalPeckingOrderList;
    public String title = "";
    public String url = "";
    public int viewType = R.id.view_type_listing_card;

    public ListingCard() {
    }

    private void addListingImage(ListingImage listingImage) {
        if (!this.listingImages.contains(listingImage)) {
            this.listingImages.add(listingImage);
        }
    }

    private void addListingImages(List<ListingImage> list) {
        for (ListingImage addListingImage : list) {
            addListingImage(addListingImage);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.listingId, ((ListingCard) obj).listingId);
    }

    public String getContentSource() {
        return this.contentSource;
    }

    public Money getDiscountedPrice() {
        return this.discountedPrice;
    }

    public String getFormattedDiscountDescription() {
        String str = this.formattedDiscountDescription;
        if (str != null) {
            return str;
        }
        FormattedMoney formattedMoney = this.discountDescription;
        return formattedMoney != null ? formattedMoney.toString() : "";
    }

    public String getFormattedDiscountedPrice() {
        Money money = this.discountedPrice;
        return money != null ? money.toString() : "";
    }

    public FreeShippingData getFreeShippingData() {
        return this.freeShippingData;
    }

    public ListingCardSize getListingCardSize() {
        return this.listingCardSize;
    }

    public EtsyId getListingId() {
        return this.listingId;
    }

    public ListingImage getListingImage() {
        if (this.listingImages.isEmpty()) {
            return null;
        }
        return this.listingImages.get(0);
    }

    public int getListingImageCount() {
        return this.listingImageCount;
    }

    public List<ListingImage> getListingImages() {
        return this.listingImages;
    }

    public List<ListingVideo> getListingVideos() {
        return this.listingVideos;
    }

    public EtsyMoney getPrice() {
        return this.price;
    }

    public String getPriceAsString() {
        return getPrice().format();
    }

    public double getPriceUnformatted() {
        return this.priceUnformatted;
    }

    public String getProlistDisplayLocation() {
        return this.prolistDisplayLocation;
    }

    public String getProlistLoggingKey() {
        return this.prolistLoggingKey;
    }

    public PromotionData getPromotionData() {
        return this.promotionData;
    }

    public List<Promotion> getPromotions() {
        return this.promotions;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public SearchImpressionMetadata getSearchImpressionMetadata() {
        return this.searchImpressionMetadata;
    }

    public float getShopAverageRating() {
        return this.shopAverageRating;
    }

    public EtsyId getShopId() {
        return this.shopId;
    }

    public String getShopName() {
        return this.shopName;
    }

    public int getShopTotalRatingCount() {
        return this.shopTotalRatingCount;
    }

    public List<String> getSignalPeckingOrderList() {
        return this.signalPeckingOrderList;
    }

    public String getTitle() {
        return this.title;
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(PredefinedAnalyticsProperty.LISTING_ID, this.listingId.getId());
        hashMap.put(PredefinedAnalyticsProperty.IS_AD, Boolean.valueOf(isAd()));
        return hashMap;
    }

    public String getUrl() {
        return this.url;
    }

    public int getViewType() {
        return this.viewType;
    }

    public boolean hasCollections() {
        return this.hasCollections;
    }

    public boolean hasColorVariations() {
        return this.hasColorVariations;
    }

    public boolean hasError() {
        return this.hasError;
    }

    public boolean hasVariationPrices() {
        return this.hasVariationPrices;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.listingId});
    }

    public int inCartCount() {
        return this.inCartCount;
    }

    public boolean isAd() {
        String str = this.prolistLoggingKey;
        return str != null && !str.isEmpty();
    }

    public boolean isBestseller() {
        return this.isBestseller;
    }

    public boolean isCustomizable() {
        return this.isCustomizable;
    }

    public boolean isDownload() {
        return this.isDownload;
    }

    public boolean isFavorite() {
        return this.isFavorite;
    }

    public boolean isInCart() {
        return this.isInCart;
    }

    public boolean isPopularNow() {
        return this.hasPopularNowSignal;
    }

    public boolean isScarce() {
        return this.isScarce;
    }

    public boolean isSoldOut() {
        return this.isSoldOut;
    }

    public boolean isStarSeller() {
        return this.hasStarSellerSignal;
    }

    public boolean isVintage() {
        return this.isVintage;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("listing_id".equals(str)) {
            this.listingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if ("shop_id".equals(str)) {
            this.shopId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if ("Shop".equals(str)) {
            Shop shop = (Shop) BaseModel.parseObject(jsonParser, Shop.class);
            if (shop != null) {
                this.shopId = shop.getShopId();
                this.shopName = shop.getShopName();
            }
        } else if (ResponseConstants.SHOP_NAME.equals(str)) {
            this.shopName = BaseModel.parseString(jsonParser);
        } else if ("title".equals(str)) {
            this.title = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.IS_SOLD_OUT.equals(str)) {
            this.isSoldOut = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.SHOP_AVERAGE_RATING.equals(str)) {
            this.shopAverageRating = (float) jsonParser.getValueAsDouble();
        } else if (ResponseConstants.SHOP_TOTAL_RATING_COUNT.equals(str)) {
            this.shopTotalRatingCount = jsonParser.getValueAsInt();
        } else if (ResponseConstants.QUANTITY.equals(str)) {
            this.quantity = jsonParser.getValueAsInt();
        } else if (ResponseConstants.PRICE.equals(str)) {
            this.serverFormattedPrice = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.PRICE_UNFORMATTED.equals(str)) {
            this.priceUnformatted = jsonParser.getValueAsDouble();
            this.price = this.price.withAmount(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.DISCOUNTED_PRICE.equals(str)) {
            this.discountedPrice = (Money) BaseModel.parseObject(jsonParser, Money.class);
        } else if (ResponseConstants.DISCOUNT_DESCRIPTION.equals(str)) {
            this.discountDescription = (FormattedMoney) BaseModel.parseObject(jsonParser, FormattedMoney.class);
        } else if (ResponseConstants.CURRENCY_CODE.equals(str)) {
            this.price = this.price.withCurrency(BaseModel.parseString(jsonParser));
        } else if ("url".equals(str)) {
            this.url = BaseModel.parseStringURL(jsonParser);
        } else if (ResponseConstants.IMG.equals(str)) {
            addListingImage((ListingImage) BaseModel.parseObject(jsonParser, ListingImage.class));
        } else if (PROLIST_LOGGING_KEY.equals(str) || "logging_key".equals(str)) {
            this.prolistLoggingKey = BaseModel.parseString(jsonParser);
        } else if ("display_loc".equals(str)) {
            this.prolistDisplayLocation = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.SEARCH_IMPRESSION.equals(str)) {
            this.searchImpressionMetadata = (SearchImpressionMetadata) BaseModel.parseObject(jsonParser, SearchImpressionMetadata.class);
        } else if ("Images".equals(str)) {
            addListingImages(BaseModel.parseArray(jsonParser, ListingImage.class));
        } else if ("is_favorite".equals(str)) {
            this.isFavorite = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_IN_COLLECTIONS.equals(str)) {
            this.hasCollections = jsonParser.getValueAsBoolean();
        } else if ("error".equals(str)) {
            this.hasError = true;
        } else if (ResponseConstants.CONTENT_SOURCE.equals(str)) {
            this.contentSource = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.IS_IN_CART.equals(str)) {
            this.isInCart = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IN_CART_COUNT.equals(str)) {
            this.inCartCount = jsonParser.getValueAsInt();
        } else if (ResponseConstants.FREE_SHIPPING_DATA.equals(str)) {
            this.freeShippingData = (FreeShippingData) BaseModel.parseObject(jsonParser, FreeShippingData.class);
        } else if (ResponseConstants.SIGNAL_PECKING_ORDER.equals(str)) {
            this.signalPeckingOrderList = BaseModel.parseStringArray(jsonParser);
        } else if (ResponseConstants.IS_BESTSELLER.equals(str)) {
            this.isBestseller = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.HAS_STAR_SELLER_SIGNAL.equals(str)) {
            this.hasStarSellerSignal = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_POPULAR_NOW.equals(str)) {
            this.hasPopularNowSignal = jsonParser.getBooleanValue();
        } else if (ResponseConstants.HAS_VARIATION_PRICES.equals(str)) {
            this.hasVariationPrices = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.HAS_COLOR_VARIATIONS.equals(str)) {
            this.hasColorVariations = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_CUSTOMIZABLE.equals(str)) {
            this.isCustomizable = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_DOWNLOAD.equals(str)) {
            this.isDownload = jsonParser.getValueAsBoolean();
        } else if ("is_vintage".equals(str)) {
            this.isVintage = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_SCARCE.equals(str)) {
            this.isScarce = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.PROMOTIONS.equals(str)) {
            this.promotions = BaseModel.parseArray(jsonParser, Promotion.class);
        } else if (ResponseConstants.PROMOTION_DATA.equals(str)) {
            this.promotionData = (PromotionData) BaseModel.parseObject(jsonParser, PromotionData.class);
        } else if (ResponseConstants.LISTING_IMAGES.equals(str)) {
            addListingImages(BaseModel.parseArray(jsonParser, ListingImage.class));
        } else if (ResponseConstants.LISTING_IMAGE_COUNT.equals(str)) {
            this.listingImageCount = jsonParser.getValueAsInt();
        } else if ("video".equals(str)) {
            this.listingVideos.addAll(BaseModel.parseArray(jsonParser, ListingVideo.class));
        } else if (!ResponseConstants.SHOW_PRICE_PILL.equals(str)) {
            return false;
        } else {
            this.showPricePill = jsonParser.getValueAsBoolean();
        }
        return true;
    }

    public void setBestseller(boolean z) {
        this.isBestseller = z;
    }

    public void setContentSource(String str) {
        this.contentSource = str;
    }

    public void setCustomizable(boolean z) {
        this.isCustomizable = z;
    }

    public void setDiscountDescription(FormattedMoney formattedMoney) {
        this.discountDescription = formattedMoney;
    }

    public void setDiscountedPrice(Money money) {
        this.discountedPrice = money;
    }

    public void setDownload(boolean z) {
        this.isDownload = z;
    }

    public void setFormattedDiscountDescription(String str) {
        this.formattedDiscountDescription = str;
    }

    public void setFreeShippingData(FreeShippingData freeShippingData2) {
        this.freeShippingData = freeShippingData2;
    }

    public void setHasCollections(boolean z) {
        this.hasCollections = z;
    }

    public void setHasColorVariations(boolean z) {
        this.hasColorVariations = z;
    }

    public void setHasError(boolean z) {
        this.hasError = z;
    }

    public void setInCart(boolean z) {
        this.isInCart = z;
    }

    public void setInCartCount(int i) {
        this.inCartCount = i;
    }

    public void setIsFavorite(boolean z) {
        this.isFavorite = z;
    }

    public void setIsSoldOut(boolean z) {
        this.isSoldOut = z;
    }

    public void setListingCardSize(ListingCardSize listingCardSize2) {
        this.listingCardSize = listingCardSize2;
    }

    public void setListingId(String str) {
        this.listingId = new EtsyId(str);
    }

    public void setListingImageCount(int i) {
        this.listingImageCount = i;
    }

    public void setListingImages(List<ListingImage> list) {
        this.listingImages = list;
    }

    public void setPrice(EtsyMoney etsyMoney) {
        this.price = etsyMoney;
    }

    public void setPriceUnformatted(double d) {
        this.priceUnformatted = d;
    }

    public void setProlistDisplayLocation(String str) {
        this.prolistDisplayLocation = str;
    }

    public void setProlistLoggingKey(String str) {
        this.prolistLoggingKey = str;
    }

    public void setPromotionData(PromotionData promotionData2) {
        this.promotionData = promotionData2;
    }

    public void setPromotions(List<Promotion> list) {
        this.promotions = list;
    }

    public void setQuantity(int i) {
        this.quantity = i;
    }

    public void setScarce(boolean z) {
        this.isScarce = z;
    }

    public void setSearchImpressionMetadata(SearchImpressionMetadata searchImpressionMetadata2) {
        this.searchImpressionMetadata = searchImpressionMetadata2;
    }

    public void setServerFormattedPrice(String str) {
        this.serverFormattedPrice = str;
    }

    public void setShopAverageRating(float f) {
        this.shopAverageRating = f;
    }

    public void setShopId(String str) {
        this.shopId = new EtsyId(str);
    }

    public void setShopName(String str) {
        this.shopName = str;
    }

    public void setShopTotalRatingCount(int i) {
        this.shopTotalRatingCount = i;
    }

    public void setShouldShowRelatedListings(boolean z) {
        this.shouldShowRelatedListings = z;
    }

    public void setSignalPeckingOrderList(List<String> list) {
        this.signalPeckingOrderList = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        super.setTrackingParameters(map);
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setViewType(int i) {
        this.viewType = i;
    }

    public void setVintage(boolean z) {
        this.isVintage = z;
    }

    public boolean shouldShowPricePill() {
        return this.showPricePill;
    }

    public boolean shouldShowRelatedListings() {
        return this.shouldShowRelatedListings;
    }

    public ListingCard(String str) {
        this.listingId = new EtsyId(str);
    }
}
