package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.gms.common.api.Api;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ListingCard {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String SIGNAL_FREE_SHIPPING = "free_shipping";
    /* access modifiers changed from: private */
    public static final String SIGNAL_PROMOTION = "promotion";
    private final Boolean acceptsGiftCard;
    private final Float bestsellerV2Score;
    private final Boolean canBeWaitlisted;
    private Integer collectionsCount;
    private final String contentSource;
    private final String currencyCode;
    private final String currencySymbol;
    private final FormattedMoney discountDescription;
    private final String discountDescriptionUnescaped;
    private final Money discountedPrice;
    private final String discountedPriceFormattedWithLocale;
    private final Boolean forPatternConsumption;
    private final Boolean forPublicConsumption;
    private final FreeShippingData freeShippingData;
    private final Boolean hasColorVariations;
    private final Boolean hasManuallyAdjustedThumbnail;
    private final Boolean hasVariations;
    private final String image;
    private final String image170;
    private final ListingImage img;
    private final Boolean isBestseller;
    private final Boolean isCustomizable;
    private final Boolean isDownload;
    private Boolean isFavorite;
    private final Boolean isInCart;
    private Boolean isInCollections;
    private final Boolean isInMerchLibrary;
    private final Boolean isListingImageLandscape;
    private final Boolean isMachineTranslated;
    private final Boolean isPattern;
    private final Boolean isRetail;
    private final Boolean isScarce;
    private final Boolean isSoldOut;
    private final Boolean isTopRated;
    private final Boolean isUnique;
    private final Boolean isVacation;
    private final Boolean isVintage;
    private final Boolean isWholesale;
    private final Long lastSaleDate;
    private final Long listingId;
    private final String loggingKey;
    private final Integer maxProcessingDays;
    private final Integer originCountryId;
    private final String price;
    private final String priceFormatted;
    private final String priceFormattedWithLocale;
    private final Integer priceInt;
    private final String priceUnformatted;
    private final String prolistDisplayLocation;
    private final SellerMarketingPromotionData promotionData;
    private final List<SellerMarketingPromotion> promotions;
    private final Integer quantity;
    private final Integer sellerTaxonomyId;
    private final String shopAverageRating;
    private final Long shopId;
    private final String shopName;
    private final String shopTotalRatingCount;
    private final String shopUrl;
    private final List<String> signalPeckingOrder;
    private final Integer state;
    private final String title;
    private final String url;
    private final String wholesaleUrl;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getSIGNAL_FREE_SHIPPING() {
            return ListingCard.SIGNAL_FREE_SHIPPING;
        }

        public final String getSIGNAL_PROMOTION() {
            return ListingCard.SIGNAL_PROMOTION;
        }
    }

    public ListingCard() {
        this((Boolean) null, (Float) null, (Boolean) null, (String) null, (String) null, (String) null, (FormattedMoney) null, (String) null, (Money) null, (String) null, (Boolean) null, (Boolean) null, (FreeShippingData) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (ListingImage) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (SellerMarketingPromotionData) null, (List) null, (Integer) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, -1, Api.BaseClientBuilder.API_PRIORITY_OTHER, (DefaultConstructorMarker) null);
    }

    public ListingCard(@C17402n(name = "accepts_gift_card") Boolean bool, @C17402n(name = "bestseller_v2_score") Float f, @C17402n(name = "can_be_waitlisted") Boolean bool2, @C17402n(name = "content_source") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "currency_symbol") String str3, @C17402n(name = "discount_description") FormattedMoney formattedMoney, @C17402n(name = "discount_description_unescaped") String str4, @C17402n(name = "discounted_price") Money money, @C17402n(name = "discounted_price_formatted_with_locale") String str5, @C17402n(name = "for_pattern_consumption") Boolean bool3, @C17402n(name = "for_public_consumption") Boolean bool4, @C17402n(name = "free_shipping_data") FreeShippingData freeShippingData2, @C17402n(name = "has_color_variations") Boolean bool5, @C17402n(name = "has_manually_adjusted_thumbnail") Boolean bool6, @C17402n(name = "has_variations") Boolean bool7, @C17402n(name = "image") String str6, @C17402n(name = "image170") String str7, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_bestseller") Boolean bool8, @C17402n(name = "is_customizable") Boolean bool9, @C17402n(name = "is_download") Boolean bool10, @C17402n(name = "is_favorite") Boolean bool11, @C17402n(name = "is_in_cart") Boolean bool12, @C17402n(name = "is_in_collections") Boolean bool13, @C17402n(name = "collections_count") Integer num, @C17402n(name = "is_in_merch_library") Boolean bool14, @C17402n(name = "is_listing_image_landscape") Boolean bool15, @C17402n(name = "is_machine_translated") Boolean bool16, @C17402n(name = "is_pattern") Boolean bool17, @C17402n(name = "is_retail") Boolean bool18, @C17402n(name = "is_scarce") Boolean bool19, @C17402n(name = "is_sold_out") Boolean bool20, @C17402n(name = "is_top_rated") Boolean bool21, @C17402n(name = "is_unique") Boolean bool22, @C17402n(name = "is_vacation") Boolean bool23, @C17402n(name = "is_vintage") Boolean bool24, @C17402n(name = "is_wholesale") Boolean bool25, @C17402n(name = "last_sale_date") Long l, @C17402n(name = "listing_id") Long l2, @C17402n(name = "logging_key") String str8, @C17402n(name = "display_loc") String str9, @C17402n(name = "max_processing_days") Integer num2, @C17402n(name = "origin_country_id") Integer num3, @C17402n(name = "price") String str10, @C17402n(name = "price_formatted") String str11, @C17402n(name = "price_formatted_with_locale") String str12, @C17402n(name = "price_int") Integer num4, @C17402n(name = "price_unformatted") String str13, @C17402n(name = "promotion_data") SellerMarketingPromotionData sellerMarketingPromotionData, @C17402n(name = "promotions") List<SellerMarketingPromotion> list, @C17402n(name = "quantity") Integer num5, @C17402n(name = "shop_average_rating") String str14, @C17402n(name = "shop_id") Long l3, @C17402n(name = "shop_name") String str15, @C17402n(name = "shop_total_rating_count") String str16, @C17402n(name = "shop_url") String str17, @C17402n(name = "signal_pecking_order") List<String> list2, @C17402n(name = "state") Integer num6, @C17402n(name = "seller_taxonomy_id") Integer num7, @C17402n(name = "title") String str18, @C17402n(name = "url") String str19, @C17402n(name = "wholesale_url") String str20) {
        this.acceptsGiftCard = bool;
        this.bestsellerV2Score = f;
        this.canBeWaitlisted = bool2;
        this.contentSource = str;
        this.currencyCode = str2;
        this.currencySymbol = str3;
        this.discountDescription = formattedMoney;
        this.discountDescriptionUnescaped = str4;
        this.discountedPrice = money;
        this.discountedPriceFormattedWithLocale = str5;
        this.forPatternConsumption = bool3;
        this.forPublicConsumption = bool4;
        this.freeShippingData = freeShippingData2;
        this.hasColorVariations = bool5;
        this.hasManuallyAdjustedThumbnail = bool6;
        this.hasVariations = bool7;
        this.image = str6;
        this.image170 = str7;
        this.img = listingImage;
        this.isBestseller = bool8;
        this.isCustomizable = bool9;
        this.isDownload = bool10;
        this.isFavorite = bool11;
        this.isInCart = bool12;
        this.isInCollections = bool13;
        this.collectionsCount = num;
        this.isInMerchLibrary = bool14;
        this.isListingImageLandscape = bool15;
        this.isMachineTranslated = bool16;
        this.isPattern = bool17;
        this.isRetail = bool18;
        this.isScarce = bool19;
        this.isSoldOut = bool20;
        this.isTopRated = bool21;
        this.isUnique = bool22;
        this.isVacation = bool23;
        this.isVintage = bool24;
        this.isWholesale = bool25;
        this.lastSaleDate = l;
        this.listingId = l2;
        this.loggingKey = str8;
        this.prolistDisplayLocation = str9;
        this.maxProcessingDays = num2;
        this.originCountryId = num3;
        this.price = str10;
        this.priceFormatted = str11;
        this.priceFormattedWithLocale = str12;
        this.priceInt = num4;
        this.priceUnformatted = str13;
        this.promotionData = sellerMarketingPromotionData;
        this.promotions = list;
        this.quantity = num5;
        this.shopAverageRating = str14;
        this.shopId = l3;
        this.shopName = str15;
        this.shopTotalRatingCount = str16;
        this.shopUrl = str17;
        this.signalPeckingOrder = list2;
        this.state = num6;
        this.sellerTaxonomyId = num7;
        this.title = str18;
        this.url = str19;
        this.wholesaleUrl = str20;
    }

    public static /* synthetic */ ListingCard copy$default(ListingCard listingCard, Boolean bool, Float f, Boolean bool2, String str, String str2, String str3, FormattedMoney formattedMoney, String str4, Money money, String str5, Boolean bool3, Boolean bool4, FreeShippingData freeShippingData2, Boolean bool5, Boolean bool6, Boolean bool7, String str6, String str7, ListingImage listingImage, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Integer num, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Long l, Long l2, String str8, String str9, Integer num2, Integer num3, String str10, String str11, String str12, Integer num4, String str13, SellerMarketingPromotionData sellerMarketingPromotionData, List list, Integer num5, String str14, Long l3, String str15, String str16, String str17, List list2, Integer num6, Integer num7, String str18, String str19, String str20, int i, int i2, Object obj) {
        ListingCard listingCard2 = listingCard;
        int i3 = i;
        int i4 = i2;
        return listingCard.copy((i3 & 1) != 0 ? listingCard2.acceptsGiftCard : bool, (i3 & 2) != 0 ? listingCard2.bestsellerV2Score : f, (i3 & 4) != 0 ? listingCard2.canBeWaitlisted : bool2, (i3 & 8) != 0 ? listingCard2.contentSource : str, (i3 & 16) != 0 ? listingCard2.currencyCode : str2, (i3 & 32) != 0 ? listingCard2.currencySymbol : str3, (i3 & 64) != 0 ? listingCard2.discountDescription : formattedMoney, (i3 & 128) != 0 ? listingCard2.discountDescriptionUnescaped : str4, (i3 & 256) != 0 ? listingCard2.discountedPrice : money, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingCard2.discountedPriceFormattedWithLocale : str5, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingCard2.forPatternConsumption : bool3, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listingCard2.forPublicConsumption : bool4, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listingCard2.freeShippingData : freeShippingData2, (i3 & 8192) != 0 ? listingCard2.hasColorVariations : bool5, (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listingCard2.hasManuallyAdjustedThumbnail : bool6, (i3 & 32768) != 0 ? listingCard2.hasVariations : bool7, (i3 & 65536) != 0 ? listingCard2.image : str6, (i3 & 131072) != 0 ? listingCard2.image170 : str7, (i3 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? listingCard2.img : listingImage, (i3 & 524288) != 0 ? listingCard2.isBestseller : bool8, (i3 & 1048576) != 0 ? listingCard2.isCustomizable : bool9, (i3 & 2097152) != 0 ? listingCard2.isDownload : bool10, (i3 & 4194304) != 0 ? listingCard2.isFavorite : bool11, (i3 & 8388608) != 0 ? listingCard2.isInCart : bool12, (i3 & 16777216) != 0 ? listingCard2.isInCollections : bool13, (i3 & 33554432) != 0 ? listingCard2.collectionsCount : num, (i3 & 67108864) != 0 ? listingCard2.isInMerchLibrary : bool14, (i3 & 134217728) != 0 ? listingCard2.isListingImageLandscape : bool15, (i3 & 268435456) != 0 ? listingCard2.isMachineTranslated : bool16, (i3 & 536870912) != 0 ? listingCard2.isPattern : bool17, (i3 & 1073741824) != 0 ? listingCard2.isRetail : bool18, (i3 & Integer.MIN_VALUE) != 0 ? listingCard2.isScarce : bool19, (i4 & 1) != 0 ? listingCard2.isSoldOut : bool20, (i4 & 2) != 0 ? listingCard2.isTopRated : bool21, (i4 & 4) != 0 ? listingCard2.isUnique : bool22, (i4 & 8) != 0 ? listingCard2.isVacation : bool23, (i4 & 16) != 0 ? listingCard2.isVintage : bool24, (i4 & 32) != 0 ? listingCard2.isWholesale : bool25, (i4 & 64) != 0 ? listingCard2.lastSaleDate : l, (i4 & 128) != 0 ? listingCard2.listingId : l2, (i4 & 256) != 0 ? listingCard2.loggingKey : str8, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingCard2.prolistDisplayLocation : str9, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingCard2.maxProcessingDays : num2, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listingCard2.originCountryId : num3, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listingCard2.price : str10, (i4 & 8192) != 0 ? listingCard2.priceFormatted : str11, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listingCard2.priceFormattedWithLocale : str12, (i4 & 32768) != 0 ? listingCard2.priceInt : num4, (i4 & 65536) != 0 ? listingCard2.priceUnformatted : str13, (i4 & 131072) != 0 ? listingCard2.promotionData : sellerMarketingPromotionData, (i4 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? listingCard2.promotions : list, (i4 & 524288) != 0 ? listingCard2.quantity : num5, (i4 & 1048576) != 0 ? listingCard2.shopAverageRating : str14, (i4 & 2097152) != 0 ? listingCard2.shopId : l3, (i4 & 4194304) != 0 ? listingCard2.shopName : str15, (i4 & 8388608) != 0 ? listingCard2.shopTotalRatingCount : str16, (i4 & 16777216) != 0 ? listingCard2.shopUrl : str17, (i4 & 33554432) != 0 ? listingCard2.signalPeckingOrder : list2, (i4 & 67108864) != 0 ? listingCard2.state : num6, (i4 & 134217728) != 0 ? listingCard2.sellerTaxonomyId : num7, (i4 & 268435456) != 0 ? listingCard2.title : str18, (i4 & 536870912) != 0 ? listingCard2.url : str19, (i4 & 1073741824) != 0 ? listingCard2.wholesaleUrl : str20);
    }

    public final Boolean component1() {
        return this.acceptsGiftCard;
    }

    public final String component10() {
        return this.discountedPriceFormattedWithLocale;
    }

    public final Boolean component11() {
        return this.forPatternConsumption;
    }

    public final Boolean component12() {
        return this.forPublicConsumption;
    }

    public final FreeShippingData component13() {
        return this.freeShippingData;
    }

    public final Boolean component14() {
        return this.hasColorVariations;
    }

    public final Boolean component15() {
        return this.hasManuallyAdjustedThumbnail;
    }

    public final Boolean component16() {
        return this.hasVariations;
    }

    public final String component17() {
        return this.image;
    }

    public final String component18() {
        return this.image170;
    }

    public final ListingImage component19() {
        return this.img;
    }

    public final Float component2() {
        return this.bestsellerV2Score;
    }

    public final Boolean component20() {
        return this.isBestseller;
    }

    public final Boolean component21() {
        return this.isCustomizable;
    }

    public final Boolean component22() {
        return this.isDownload;
    }

    public final Boolean component23() {
        return this.isFavorite;
    }

    public final Boolean component24() {
        return this.isInCart;
    }

    public final Boolean component25() {
        return this.isInCollections;
    }

    public final Integer component26() {
        return this.collectionsCount;
    }

    public final Boolean component27() {
        return this.isInMerchLibrary;
    }

    public final Boolean component28() {
        return this.isListingImageLandscape;
    }

    public final Boolean component29() {
        return this.isMachineTranslated;
    }

    public final Boolean component3() {
        return this.canBeWaitlisted;
    }

    public final Boolean component30() {
        return this.isPattern;
    }

    public final Boolean component31() {
        return this.isRetail;
    }

    public final Boolean component32() {
        return this.isScarce;
    }

    public final Boolean component33() {
        return this.isSoldOut;
    }

    public final Boolean component34() {
        return this.isTopRated;
    }

    public final Boolean component35() {
        return this.isUnique;
    }

    public final Boolean component36() {
        return this.isVacation;
    }

    public final Boolean component37() {
        return this.isVintage;
    }

    public final Boolean component38() {
        return this.isWholesale;
    }

    public final Long component39() {
        return this.lastSaleDate;
    }

    public final String component4() {
        return this.contentSource;
    }

    public final Long component40() {
        return this.listingId;
    }

    public final String component41() {
        return this.loggingKey;
    }

    public final String component42() {
        return this.prolistDisplayLocation;
    }

    public final Integer component43() {
        return this.maxProcessingDays;
    }

    public final Integer component44() {
        return this.originCountryId;
    }

    public final String component45() {
        return this.price;
    }

    public final String component46() {
        return this.priceFormatted;
    }

    public final String component47() {
        return this.priceFormattedWithLocale;
    }

    public final Integer component48() {
        return this.priceInt;
    }

    public final String component49() {
        return this.priceUnformatted;
    }

    public final String component5() {
        return this.currencyCode;
    }

    public final SellerMarketingPromotionData component50() {
        return this.promotionData;
    }

    public final List<SellerMarketingPromotion> component51() {
        return this.promotions;
    }

    public final Integer component52() {
        return this.quantity;
    }

    public final String component53() {
        return this.shopAverageRating;
    }

    public final Long component54() {
        return this.shopId;
    }

    public final String component55() {
        return this.shopName;
    }

    public final String component56() {
        return this.shopTotalRatingCount;
    }

    public final String component57() {
        return this.shopUrl;
    }

    public final List<String> component58() {
        return this.signalPeckingOrder;
    }

    public final Integer component59() {
        return this.state;
    }

    public final String component6() {
        return this.currencySymbol;
    }

    public final Integer component60() {
        return this.sellerTaxonomyId;
    }

    public final String component61() {
        return this.title;
    }

    public final String component62() {
        return this.url;
    }

    public final String component63() {
        return this.wholesaleUrl;
    }

    public final FormattedMoney component7() {
        return this.discountDescription;
    }

    public final String component8() {
        return this.discountDescriptionUnescaped;
    }

    public final Money component9() {
        return this.discountedPrice;
    }

    public final ListingCard copy(@C17402n(name = "accepts_gift_card") Boolean bool, @C17402n(name = "bestseller_v2_score") Float f, @C17402n(name = "can_be_waitlisted") Boolean bool2, @C17402n(name = "content_source") String str, @C17402n(name = "currency_code") String str2, @C17402n(name = "currency_symbol") String str3, @C17402n(name = "discount_description") FormattedMoney formattedMoney, @C17402n(name = "discount_description_unescaped") String str4, @C17402n(name = "discounted_price") Money money, @C17402n(name = "discounted_price_formatted_with_locale") String str5, @C17402n(name = "for_pattern_consumption") Boolean bool3, @C17402n(name = "for_public_consumption") Boolean bool4, @C17402n(name = "free_shipping_data") FreeShippingData freeShippingData2, @C17402n(name = "has_color_variations") Boolean bool5, @C17402n(name = "has_manually_adjusted_thumbnail") Boolean bool6, @C17402n(name = "has_variations") Boolean bool7, @C17402n(name = "image") String str6, @C17402n(name = "image170") String str7, @C17402n(name = "img") ListingImage listingImage, @C17402n(name = "is_bestseller") Boolean bool8, @C17402n(name = "is_customizable") Boolean bool9, @C17402n(name = "is_download") Boolean bool10, @C17402n(name = "is_favorite") Boolean bool11, @C17402n(name = "is_in_cart") Boolean bool12, @C17402n(name = "is_in_collections") Boolean bool13, @C17402n(name = "collections_count") Integer num, @C17402n(name = "is_in_merch_library") Boolean bool14, @C17402n(name = "is_listing_image_landscape") Boolean bool15, @C17402n(name = "is_machine_translated") Boolean bool16, @C17402n(name = "is_pattern") Boolean bool17, @C17402n(name = "is_retail") Boolean bool18, @C17402n(name = "is_scarce") Boolean bool19, @C17402n(name = "is_sold_out") Boolean bool20, @C17402n(name = "is_top_rated") Boolean bool21, @C17402n(name = "is_unique") Boolean bool22, @C17402n(name = "is_vacation") Boolean bool23, @C17402n(name = "is_vintage") Boolean bool24, @C17402n(name = "is_wholesale") Boolean bool25, @C17402n(name = "last_sale_date") Long l, @C17402n(name = "listing_id") Long l2, @C17402n(name = "logging_key") String str8, @C17402n(name = "display_loc") String str9, @C17402n(name = "max_processing_days") Integer num2, @C17402n(name = "origin_country_id") Integer num3, @C17402n(name = "price") String str10, @C17402n(name = "price_formatted") String str11, @C17402n(name = "price_formatted_with_locale") String str12, @C17402n(name = "price_int") Integer num4, @C17402n(name = "price_unformatted") String str13, @C17402n(name = "promotion_data") SellerMarketingPromotionData sellerMarketingPromotionData, @C17402n(name = "promotions") List<SellerMarketingPromotion> list, @C17402n(name = "quantity") Integer num5, @C17402n(name = "shop_average_rating") String str14, @C17402n(name = "shop_id") Long l3, @C17402n(name = "shop_name") String str15, @C17402n(name = "shop_total_rating_count") String str16, @C17402n(name = "shop_url") String str17, @C17402n(name = "signal_pecking_order") List<String> list2, @C17402n(name = "state") Integer num6, @C17402n(name = "seller_taxonomy_id") Integer num7, @C17402n(name = "title") String str18, @C17402n(name = "url") String str19, @C17402n(name = "wholesale_url") String str20) {
        return new ListingCard(bool, f, bool2, str, str2, str3, formattedMoney, str4, money, str5, bool3, bool4, freeShippingData2, bool5, bool6, bool7, str6, str7, listingImage, bool8, bool9, bool10, bool11, bool12, bool13, num, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, l, l2, str8, str9, num2, num3, str10, str11, str12, num4, str13, sellerMarketingPromotionData, list, num5, str14, l3, str15, str16, str17, list2, num6, num7, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingCard)) {
            return false;
        }
        ListingCard listingCard = (ListingCard) obj;
        return C19383o.m32792b(this.acceptsGiftCard, listingCard.acceptsGiftCard) && C19383o.m32792b(this.bestsellerV2Score, listingCard.bestsellerV2Score) && C19383o.m32792b(this.canBeWaitlisted, listingCard.canBeWaitlisted) && C19383o.m32792b(this.contentSource, listingCard.contentSource) && C19383o.m32792b(this.currencyCode, listingCard.currencyCode) && C19383o.m32792b(this.currencySymbol, listingCard.currencySymbol) && C19383o.m32792b(this.discountDescription, listingCard.discountDescription) && C19383o.m32792b(this.discountDescriptionUnescaped, listingCard.discountDescriptionUnescaped) && C19383o.m32792b(this.discountedPrice, listingCard.discountedPrice) && C19383o.m32792b(this.discountedPriceFormattedWithLocale, listingCard.discountedPriceFormattedWithLocale) && C19383o.m32792b(this.forPatternConsumption, listingCard.forPatternConsumption) && C19383o.m32792b(this.forPublicConsumption, listingCard.forPublicConsumption) && C19383o.m32792b(this.freeShippingData, listingCard.freeShippingData) && C19383o.m32792b(this.hasColorVariations, listingCard.hasColorVariations) && C19383o.m32792b(this.hasManuallyAdjustedThumbnail, listingCard.hasManuallyAdjustedThumbnail) && C19383o.m32792b(this.hasVariations, listingCard.hasVariations) && C19383o.m32792b(this.image, listingCard.image) && C19383o.m32792b(this.image170, listingCard.image170) && C19383o.m32792b(this.img, listingCard.img) && C19383o.m32792b(this.isBestseller, listingCard.isBestseller) && C19383o.m32792b(this.isCustomizable, listingCard.isCustomizable) && C19383o.m32792b(this.isDownload, listingCard.isDownload) && C19383o.m32792b(this.isFavorite, listingCard.isFavorite) && C19383o.m32792b(this.isInCart, listingCard.isInCart) && C19383o.m32792b(this.isInCollections, listingCard.isInCollections) && C19383o.m32792b(this.collectionsCount, listingCard.collectionsCount) && C19383o.m32792b(this.isInMerchLibrary, listingCard.isInMerchLibrary) && C19383o.m32792b(this.isListingImageLandscape, listingCard.isListingImageLandscape) && C19383o.m32792b(this.isMachineTranslated, listingCard.isMachineTranslated) && C19383o.m32792b(this.isPattern, listingCard.isPattern) && C19383o.m32792b(this.isRetail, listingCard.isRetail) && C19383o.m32792b(this.isScarce, listingCard.isScarce) && C19383o.m32792b(this.isSoldOut, listingCard.isSoldOut) && C19383o.m32792b(this.isTopRated, listingCard.isTopRated) && C19383o.m32792b(this.isUnique, listingCard.isUnique) && C19383o.m32792b(this.isVacation, listingCard.isVacation) && C19383o.m32792b(this.isVintage, listingCard.isVintage) && C19383o.m32792b(this.isWholesale, listingCard.isWholesale) && C19383o.m32792b(this.lastSaleDate, listingCard.lastSaleDate) && C19383o.m32792b(this.listingId, listingCard.listingId) && C19383o.m32792b(this.loggingKey, listingCard.loggingKey) && C19383o.m32792b(this.prolistDisplayLocation, listingCard.prolistDisplayLocation) && C19383o.m32792b(this.maxProcessingDays, listingCard.maxProcessingDays) && C19383o.m32792b(this.originCountryId, listingCard.originCountryId) && C19383o.m32792b(this.price, listingCard.price) && C19383o.m32792b(this.priceFormatted, listingCard.priceFormatted) && C19383o.m32792b(this.priceFormattedWithLocale, listingCard.priceFormattedWithLocale) && C19383o.m32792b(this.priceInt, listingCard.priceInt) && C19383o.m32792b(this.priceUnformatted, listingCard.priceUnformatted) && C19383o.m32792b(this.promotionData, listingCard.promotionData) && C19383o.m32792b(this.promotions, listingCard.promotions) && C19383o.m32792b(this.quantity, listingCard.quantity) && C19383o.m32792b(this.shopAverageRating, listingCard.shopAverageRating) && C19383o.m32792b(this.shopId, listingCard.shopId) && C19383o.m32792b(this.shopName, listingCard.shopName) && C19383o.m32792b(this.shopTotalRatingCount, listingCard.shopTotalRatingCount) && C19383o.m32792b(this.shopUrl, listingCard.shopUrl) && C19383o.m32792b(this.signalPeckingOrder, listingCard.signalPeckingOrder) && C19383o.m32792b(this.state, listingCard.state) && C19383o.m32792b(this.sellerTaxonomyId, listingCard.sellerTaxonomyId) && C19383o.m32792b(this.title, listingCard.title) && C19383o.m32792b(this.url, listingCard.url) && C19383o.m32792b(this.wholesaleUrl, listingCard.wholesaleUrl);
    }

    public final Boolean getAcceptsGiftCard() {
        return this.acceptsGiftCard;
    }

    public final Float getBestsellerV2Score() {
        return this.bestsellerV2Score;
    }

    public final Boolean getCanBeWaitlisted() {
        return this.canBeWaitlisted;
    }

    public final Integer getCollectionsCount() {
        return this.collectionsCount;
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final FormattedMoney getDiscountDescription() {
        return this.discountDescription;
    }

    public final String getDiscountDescriptionUnescaped() {
        return this.discountDescriptionUnescaped;
    }

    public final Money getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final String getDiscountedPriceFormattedWithLocale() {
        return this.discountedPriceFormattedWithLocale;
    }

    public final Boolean getForPatternConsumption() {
        return this.forPatternConsumption;
    }

    public final Boolean getForPublicConsumption() {
        return this.forPublicConsumption;
    }

    public final FreeShippingData getFreeShippingData() {
        return this.freeShippingData;
    }

    public final Boolean getHasColorVariations() {
        return this.hasColorVariations;
    }

    public final Boolean getHasManuallyAdjustedThumbnail() {
        return this.hasManuallyAdjustedThumbnail;
    }

    public final Boolean getHasVariations() {
        return this.hasVariations;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImage170() {
        return this.image170;
    }

    public final ListingImage getImg() {
        return this.img;
    }

    public final Long getLastSaleDate() {
        return this.lastSaleDate;
    }

    public final Long getListingId() {
        return this.listingId;
    }

    public final String getLoggingKey() {
        return this.loggingKey;
    }

    public final Integer getMaxProcessingDays() {
        return this.maxProcessingDays;
    }

    public final Integer getOriginCountryId() {
        return this.originCountryId;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    public final String getPriceFormattedWithLocale() {
        return this.priceFormattedWithLocale;
    }

    public final Integer getPriceInt() {
        return this.priceInt;
    }

    public final String getPriceUnformatted() {
        return this.priceUnformatted;
    }

    public final String getProlistDisplayLocation() {
        return this.prolistDisplayLocation;
    }

    public final SellerMarketingPromotionData getPromotionData() {
        return this.promotionData;
    }

    public final List<SellerMarketingPromotion> getPromotions() {
        return this.promotions;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Integer getSellerTaxonomyId() {
        return this.sellerTaxonomyId;
    }

    public final String getShopAverageRating() {
        return this.shopAverageRating;
    }

    public final Long getShopId() {
        return this.shopId;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final String getShopTotalRatingCount() {
        return this.shopTotalRatingCount;
    }

    public final String getShopUrl() {
        return this.shopUrl;
    }

    public final List<String> getSignalPeckingOrder() {
        return this.signalPeckingOrder;
    }

    public final Integer getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWholesaleUrl() {
        return this.wholesaleUrl;
    }

    public int hashCode() {
        Boolean bool = this.acceptsGiftCard;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Float f = this.bestsellerV2Score;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool2 = this.canBeWaitlisted;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.contentSource;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyCode;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencySymbol;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FormattedMoney formattedMoney = this.discountDescription;
        int hashCode7 = (hashCode6 + (formattedMoney == null ? 0 : formattedMoney.hashCode())) * 31;
        String str4 = this.discountDescriptionUnescaped;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Money money = this.discountedPrice;
        int hashCode9 = (hashCode8 + (money == null ? 0 : money.hashCode())) * 31;
        String str5 = this.discountedPriceFormattedWithLocale;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.forPatternConsumption;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.forPublicConsumption;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        FreeShippingData freeShippingData2 = this.freeShippingData;
        int hashCode13 = (hashCode12 + (freeShippingData2 == null ? 0 : freeShippingData2.hashCode())) * 31;
        Boolean bool5 = this.hasColorVariations;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasManuallyAdjustedThumbnail;
        int hashCode15 = (hashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasVariations;
        int hashCode16 = (hashCode15 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str6 = this.image;
        int hashCode17 = (hashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.image170;
        int hashCode18 = (hashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ListingImage listingImage = this.img;
        int hashCode19 = (hashCode18 + (listingImage == null ? 0 : listingImage.hashCode())) * 31;
        Boolean bool8 = this.isBestseller;
        int hashCode20 = (hashCode19 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.isCustomizable;
        int hashCode21 = (hashCode20 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isDownload;
        int hashCode22 = (hashCode21 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isFavorite;
        int hashCode23 = (hashCode22 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.isInCart;
        int hashCode24 = (hashCode23 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.isInCollections;
        int hashCode25 = (hashCode24 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Integer num = this.collectionsCount;
        int hashCode26 = (hashCode25 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool14 = this.isInMerchLibrary;
        int hashCode27 = (hashCode26 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.isListingImageLandscape;
        int hashCode28 = (hashCode27 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.isMachineTranslated;
        int hashCode29 = (hashCode28 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.isPattern;
        int hashCode30 = (hashCode29 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.isRetail;
        int hashCode31 = (hashCode30 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.isScarce;
        int hashCode32 = (hashCode31 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.isSoldOut;
        int hashCode33 = (hashCode32 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.isTopRated;
        int hashCode34 = (hashCode33 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.isUnique;
        int hashCode35 = (hashCode34 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.isVacation;
        int hashCode36 = (hashCode35 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.isVintage;
        int hashCode37 = (hashCode36 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.isWholesale;
        int hashCode38 = (hashCode37 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Long l = this.lastSaleDate;
        int hashCode39 = (hashCode38 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.listingId;
        int hashCode40 = (hashCode39 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str8 = this.loggingKey;
        int hashCode41 = (hashCode40 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.prolistDisplayLocation;
        int hashCode42 = (hashCode41 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.maxProcessingDays;
        int hashCode43 = (hashCode42 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.originCountryId;
        int hashCode44 = (hashCode43 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.price;
        int hashCode45 = (hashCode44 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.priceFormatted;
        int hashCode46 = (hashCode45 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.priceFormattedWithLocale;
        int hashCode47 = (hashCode46 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.priceInt;
        int hashCode48 = (hashCode47 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str13 = this.priceUnformatted;
        int hashCode49 = (hashCode48 + (str13 == null ? 0 : str13.hashCode())) * 31;
        SellerMarketingPromotionData sellerMarketingPromotionData = this.promotionData;
        int hashCode50 = (hashCode49 + (sellerMarketingPromotionData == null ? 0 : sellerMarketingPromotionData.hashCode())) * 31;
        List<SellerMarketingPromotion> list = this.promotions;
        int hashCode51 = (hashCode50 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.quantity;
        int hashCode52 = (hashCode51 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str14 = this.shopAverageRating;
        int hashCode53 = (hashCode52 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l3 = this.shopId;
        int hashCode54 = (hashCode53 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str15 = this.shopName;
        int hashCode55 = (hashCode54 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.shopTotalRatingCount;
        int hashCode56 = (hashCode55 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.shopUrl;
        int hashCode57 = (hashCode56 + (str17 == null ? 0 : str17.hashCode())) * 31;
        List<String> list2 = this.signalPeckingOrder;
        int hashCode58 = (hashCode57 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num6 = this.state;
        int hashCode59 = (hashCode58 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.sellerTaxonomyId;
        int hashCode60 = (hashCode59 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str18 = this.title;
        int hashCode61 = (hashCode60 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.url;
        int hashCode62 = (hashCode61 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.wholesaleUrl;
        if (str20 != null) {
            i = str20.hashCode();
        }
        return hashCode62 + i;
    }

    public final Boolean isBestseller() {
        return this.isBestseller;
    }

    public final Boolean isCustomizable() {
        return this.isCustomizable;
    }

    public final Boolean isDownload() {
        return this.isDownload;
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    public final Boolean isInCart() {
        return this.isInCart;
    }

    public final Boolean isInCollections() {
        return this.isInCollections;
    }

    public final Boolean isInMerchLibrary() {
        return this.isInMerchLibrary;
    }

    public final Boolean isListingImageLandscape() {
        return this.isListingImageLandscape;
    }

    public final Boolean isMachineTranslated() {
        return this.isMachineTranslated;
    }

    public final Boolean isPattern() {
        return this.isPattern;
    }

    public final Boolean isRetail() {
        return this.isRetail;
    }

    public final Boolean isScarce() {
        return this.isScarce;
    }

    public final Boolean isSoldOut() {
        return this.isSoldOut;
    }

    public final Boolean isTopRated() {
        return this.isTopRated;
    }

    public final Boolean isUnique() {
        return this.isUnique;
    }

    public final Boolean isVacation() {
        return this.isVacation;
    }

    public final Boolean isVintage() {
        return this.isVintage;
    }

    public final Boolean isWholesale() {
        return this.isWholesale;
    }

    public final void setCollectionsCount(Integer num) {
        this.collectionsCount = num;
    }

    public final void setFavorite(Boolean bool) {
        this.isFavorite = bool;
    }

    public final void setInCollections(Boolean bool) {
        this.isInCollections = bool;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingCard(acceptsGiftCard=");
        h.append(this.acceptsGiftCard);
        h.append(", bestsellerV2Score=");
        h.append(this.bestsellerV2Score);
        h.append(", canBeWaitlisted=");
        h.append(this.canBeWaitlisted);
        h.append(", contentSource=");
        h.append(this.contentSource);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", currencySymbol=");
        h.append(this.currencySymbol);
        h.append(", discountDescription=");
        h.append(this.discountDescription);
        h.append(", discountDescriptionUnescaped=");
        h.append(this.discountDescriptionUnescaped);
        h.append(", discountedPrice=");
        h.append(this.discountedPrice);
        h.append(", discountedPriceFormattedWithLocale=");
        h.append(this.discountedPriceFormattedWithLocale);
        h.append(", forPatternConsumption=");
        h.append(this.forPatternConsumption);
        h.append(", forPublicConsumption=");
        h.append(this.forPublicConsumption);
        h.append(", freeShippingData=");
        h.append(this.freeShippingData);
        h.append(", hasColorVariations=");
        h.append(this.hasColorVariations);
        h.append(", hasManuallyAdjustedThumbnail=");
        h.append(this.hasManuallyAdjustedThumbnail);
        h.append(", hasVariations=");
        h.append(this.hasVariations);
        h.append(", image=");
        h.append(this.image);
        h.append(", image170=");
        h.append(this.image170);
        h.append(", img=");
        h.append(this.img);
        h.append(", isBestseller=");
        h.append(this.isBestseller);
        h.append(", isCustomizable=");
        h.append(this.isCustomizable);
        h.append(", isDownload=");
        h.append(this.isDownload);
        h.append(", isFavorite=");
        h.append(this.isFavorite);
        h.append(", isInCart=");
        h.append(this.isInCart);
        h.append(", isInCollections=");
        h.append(this.isInCollections);
        h.append(", collectionsCount=");
        h.append(this.collectionsCount);
        h.append(", isInMerchLibrary=");
        h.append(this.isInMerchLibrary);
        h.append(", isListingImageLandscape=");
        h.append(this.isListingImageLandscape);
        h.append(", isMachineTranslated=");
        h.append(this.isMachineTranslated);
        h.append(", isPattern=");
        h.append(this.isPattern);
        h.append(", isRetail=");
        h.append(this.isRetail);
        h.append(", isScarce=");
        h.append(this.isScarce);
        h.append(", isSoldOut=");
        h.append(this.isSoldOut);
        h.append(", isTopRated=");
        h.append(this.isTopRated);
        h.append(", isUnique=");
        h.append(this.isUnique);
        h.append(", isVacation=");
        h.append(this.isVacation);
        h.append(", isVintage=");
        h.append(this.isVintage);
        h.append(", isWholesale=");
        h.append(this.isWholesale);
        h.append(", lastSaleDate=");
        h.append(this.lastSaleDate);
        h.append(", listingId=");
        h.append(this.listingId);
        h.append(", loggingKey=");
        h.append(this.loggingKey);
        h.append(", prolistDisplayLocation=");
        h.append(this.prolistDisplayLocation);
        h.append(", maxProcessingDays=");
        h.append(this.maxProcessingDays);
        h.append(", originCountryId=");
        h.append(this.originCountryId);
        h.append(", price=");
        h.append(this.price);
        h.append(", priceFormatted=");
        h.append(this.priceFormatted);
        h.append(", priceFormattedWithLocale=");
        h.append(this.priceFormattedWithLocale);
        h.append(", priceInt=");
        h.append(this.priceInt);
        h.append(", priceUnformatted=");
        h.append(this.priceUnformatted);
        h.append(", promotionData=");
        h.append(this.promotionData);
        h.append(", promotions=");
        h.append(this.promotions);
        h.append(", quantity=");
        h.append(this.quantity);
        h.append(", shopAverageRating=");
        h.append(this.shopAverageRating);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", shopName=");
        h.append(this.shopName);
        h.append(", shopTotalRatingCount=");
        h.append(this.shopTotalRatingCount);
        h.append(", shopUrl=");
        h.append(this.shopUrl);
        h.append(", signalPeckingOrder=");
        h.append(this.signalPeckingOrder);
        h.append(", state=");
        h.append(this.state);
        h.append(", sellerTaxonomyId=");
        h.append(this.sellerTaxonomyId);
        h.append(", title=");
        h.append(this.title);
        h.append(", url=");
        h.append(this.url);
        h.append(", wholesaleUrl=");
        return C0391c.m1057c(h, this.wholesaleUrl, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingCard(java.lang.Boolean r64, java.lang.Float r65, java.lang.Boolean r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, com.etsy.android.lib.models.apiv3.listing.FormattedMoney r70, java.lang.String r71, com.etsy.android.lib.models.apiv3.listing.Money r72, java.lang.String r73, java.lang.Boolean r74, java.lang.Boolean r75, com.etsy.android.lib.models.apiv3.listing.FreeShippingData r76, java.lang.Boolean r77, java.lang.Boolean r78, java.lang.Boolean r79, java.lang.String r80, java.lang.String r81, com.etsy.android.lib.models.apiv3.listing.ListingImage r82, java.lang.Boolean r83, java.lang.Boolean r84, java.lang.Boolean r85, java.lang.Boolean r86, java.lang.Boolean r87, java.lang.Boolean r88, java.lang.Integer r89, java.lang.Boolean r90, java.lang.Boolean r91, java.lang.Boolean r92, java.lang.Boolean r93, java.lang.Boolean r94, java.lang.Boolean r95, java.lang.Boolean r96, java.lang.Boolean r97, java.lang.Boolean r98, java.lang.Boolean r99, java.lang.Boolean r100, java.lang.Boolean r101, java.lang.Long r102, java.lang.Long r103, java.lang.String r104, java.lang.String r105, java.lang.Integer r106, java.lang.Integer r107, java.lang.String r108, java.lang.String r109, java.lang.String r110, java.lang.Integer r111, java.lang.String r112, com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotionData r113, java.util.List r114, java.lang.Integer r115, java.lang.String r116, java.lang.Long r117, java.lang.String r118, java.lang.String r119, java.lang.String r120, java.util.List r121, java.lang.Integer r122, java.lang.Integer r123, java.lang.String r124, java.lang.String r125, java.lang.String r126, int r127, int r128, kotlin.jvm.internal.DefaultConstructorMarker r129) {
        /*
            r63 = this;
            r0 = r127
            r1 = r128
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r64
        L_0x000c:
            r4 = r0 & 2
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r65
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = 0
            goto L_0x001c
        L_0x001a:
            r5 = r66
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = 0
            goto L_0x0024
        L_0x0022:
            r6 = r67
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r68
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r69
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r70
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r71
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r72
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0054
        L_0x0052:
            r12 = r73
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = 0
            goto L_0x005c
        L_0x005a:
            r13 = r74
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = 0
            goto L_0x0064
        L_0x0062:
            r14 = r75
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = 0
            goto L_0x006c
        L_0x006a:
            r15 = r76
        L_0x006c:
            r3 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0072
            r3 = 0
            goto L_0x0074
        L_0x0072:
            r3 = r77
        L_0x0074:
            r16 = r3
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007c
            r3 = 0
            goto L_0x007e
        L_0x007c:
            r3 = r78
        L_0x007e:
            r17 = 32768(0x8000, float:4.5918E-41)
            r18 = r0 & r17
            if (r18 == 0) goto L_0x0088
            r18 = 0
            goto L_0x008a
        L_0x0088:
            r18 = r79
        L_0x008a:
            r19 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r19
            if (r20 == 0) goto L_0x0093
            r20 = 0
            goto L_0x0095
        L_0x0093:
            r20 = r80
        L_0x0095:
            r21 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r21
            if (r22 == 0) goto L_0x009e
            r22 = 0
            goto L_0x00a0
        L_0x009e:
            r22 = r81
        L_0x00a0:
            r23 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r23
            if (r24 == 0) goto L_0x00a9
            r24 = 0
            goto L_0x00ab
        L_0x00a9:
            r24 = r82
        L_0x00ab:
            r25 = 524288(0x80000, float:7.34684E-40)
            r26 = r0 & r25
            if (r26 == 0) goto L_0x00b4
            r26 = 0
            goto L_0x00b6
        L_0x00b4:
            r26 = r83
        L_0x00b6:
            r27 = 1048576(0x100000, float:1.469368E-39)
            r28 = r0 & r27
            if (r28 == 0) goto L_0x00bf
            r28 = 0
            goto L_0x00c1
        L_0x00bf:
            r28 = r84
        L_0x00c1:
            r29 = 2097152(0x200000, float:2.938736E-39)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00ca
            r29 = 0
            goto L_0x00cc
        L_0x00ca:
            r29 = r85
        L_0x00cc:
            r30 = 4194304(0x400000, float:5.877472E-39)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00d5
            r30 = 0
            goto L_0x00d7
        L_0x00d5:
            r30 = r86
        L_0x00d7:
            r31 = 8388608(0x800000, float:1.17549435E-38)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x00e0
            r31 = 0
            goto L_0x00e2
        L_0x00e0:
            r31 = r87
        L_0x00e2:
            r32 = 16777216(0x1000000, float:2.3509887E-38)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x00eb
            r32 = 0
            goto L_0x00ed
        L_0x00eb:
            r32 = r88
        L_0x00ed:
            r33 = 33554432(0x2000000, float:9.403955E-38)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x00f6
            r33 = 0
            goto L_0x00f8
        L_0x00f6:
            r33 = r89
        L_0x00f8:
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x0101
            r34 = 0
            goto L_0x0103
        L_0x0101:
            r34 = r90
        L_0x0103:
            r35 = 134217728(0x8000000, float:3.85186E-34)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x010c
            r35 = 0
            goto L_0x010e
        L_0x010c:
            r35 = r91
        L_0x010e:
            r36 = 268435456(0x10000000, float:2.5243549E-29)
            r36 = r0 & r36
            if (r36 == 0) goto L_0x0117
            r36 = 0
            goto L_0x0119
        L_0x0117:
            r36 = r92
        L_0x0119:
            r37 = 536870912(0x20000000, float:1.0842022E-19)
            r37 = r0 & r37
            if (r37 == 0) goto L_0x0122
            r37 = 0
            goto L_0x0124
        L_0x0122:
            r37 = r93
        L_0x0124:
            r38 = 1073741824(0x40000000, float:2.0)
            r38 = r0 & r38
            if (r38 == 0) goto L_0x012d
            r38 = 0
            goto L_0x012f
        L_0x012d:
            r38 = r94
        L_0x012f:
            r39 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r39
            if (r0 == 0) goto L_0x0137
            r0 = 0
            goto L_0x0139
        L_0x0137:
            r0 = r95
        L_0x0139:
            r39 = r1 & 1
            if (r39 == 0) goto L_0x0140
            r39 = 0
            goto L_0x0142
        L_0x0140:
            r39 = r96
        L_0x0142:
            r40 = r1 & 2
            if (r40 == 0) goto L_0x0149
            r40 = 0
            goto L_0x014b
        L_0x0149:
            r40 = r97
        L_0x014b:
            r41 = r1 & 4
            if (r41 == 0) goto L_0x0152
            r41 = 0
            goto L_0x0154
        L_0x0152:
            r41 = r98
        L_0x0154:
            r42 = r1 & 8
            if (r42 == 0) goto L_0x015b
            r42 = 0
            goto L_0x015d
        L_0x015b:
            r42 = r99
        L_0x015d:
            r43 = r1 & 16
            if (r43 == 0) goto L_0x0164
            r43 = 0
            goto L_0x0166
        L_0x0164:
            r43 = r100
        L_0x0166:
            r44 = r1 & 32
            if (r44 == 0) goto L_0x016d
            r44 = 0
            goto L_0x016f
        L_0x016d:
            r44 = r101
        L_0x016f:
            r45 = r1 & 64
            if (r45 == 0) goto L_0x0176
            r45 = 0
            goto L_0x0178
        L_0x0176:
            r45 = r102
        L_0x0178:
            r127 = r0
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0180
            r0 = 0
            goto L_0x0182
        L_0x0180:
            r0 = r103
        L_0x0182:
            r46 = r0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x018a
            r0 = 0
            goto L_0x018c
        L_0x018a:
            r0 = r104
        L_0x018c:
            r47 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0194
            r0 = 0
            goto L_0x0196
        L_0x0194:
            r0 = r105
        L_0x0196:
            r48 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x019e
            r0 = 0
            goto L_0x01a0
        L_0x019e:
            r0 = r106
        L_0x01a0:
            r49 = r0
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01a8
            r0 = 0
            goto L_0x01aa
        L_0x01a8:
            r0 = r107
        L_0x01aa:
            r50 = r0
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01b2
            r0 = 0
            goto L_0x01b4
        L_0x01b2:
            r0 = r108
        L_0x01b4:
            r51 = r0
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01bc
            r0 = 0
            goto L_0x01be
        L_0x01bc:
            r0 = r109
        L_0x01be:
            r52 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01c6
            r0 = 0
            goto L_0x01c8
        L_0x01c6:
            r0 = r110
        L_0x01c8:
            r17 = r1 & r17
            if (r17 == 0) goto L_0x01cf
            r17 = 0
            goto L_0x01d1
        L_0x01cf:
            r17 = r111
        L_0x01d1:
            r19 = r1 & r19
            if (r19 == 0) goto L_0x01d8
            r19 = 0
            goto L_0x01da
        L_0x01d8:
            r19 = r112
        L_0x01da:
            r21 = r1 & r21
            if (r21 == 0) goto L_0x01e1
            r21 = 0
            goto L_0x01e3
        L_0x01e1:
            r21 = r113
        L_0x01e3:
            r23 = r1 & r23
            if (r23 == 0) goto L_0x01ea
            r23 = 0
            goto L_0x01ec
        L_0x01ea:
            r23 = r114
        L_0x01ec:
            r25 = r1 & r25
            if (r25 == 0) goto L_0x01f3
            r25 = 0
            goto L_0x01f5
        L_0x01f3:
            r25 = r115
        L_0x01f5:
            r27 = r1 & r27
            if (r27 == 0) goto L_0x01fc
            r27 = 0
            goto L_0x01fe
        L_0x01fc:
            r27 = r116
        L_0x01fe:
            r53 = 2097152(0x200000, float:2.938736E-39)
            r53 = r1 & r53
            if (r53 == 0) goto L_0x0207
            r53 = 0
            goto L_0x0209
        L_0x0207:
            r53 = r117
        L_0x0209:
            r54 = 4194304(0x400000, float:5.877472E-39)
            r54 = r1 & r54
            if (r54 == 0) goto L_0x0212
            r54 = 0
            goto L_0x0214
        L_0x0212:
            r54 = r118
        L_0x0214:
            r55 = 8388608(0x800000, float:1.17549435E-38)
            r55 = r1 & r55
            if (r55 == 0) goto L_0x021d
            r55 = 0
            goto L_0x021f
        L_0x021d:
            r55 = r119
        L_0x021f:
            r56 = 16777216(0x1000000, float:2.3509887E-38)
            r56 = r1 & r56
            if (r56 == 0) goto L_0x0228
            r56 = 0
            goto L_0x022a
        L_0x0228:
            r56 = r120
        L_0x022a:
            r57 = 33554432(0x2000000, float:9.403955E-38)
            r57 = r1 & r57
            if (r57 == 0) goto L_0x0233
            r57 = 0
            goto L_0x0235
        L_0x0233:
            r57 = r121
        L_0x0235:
            r58 = 67108864(0x4000000, float:1.5046328E-36)
            r58 = r1 & r58
            if (r58 == 0) goto L_0x023e
            r58 = 0
            goto L_0x0240
        L_0x023e:
            r58 = r122
        L_0x0240:
            r59 = 134217728(0x8000000, float:3.85186E-34)
            r59 = r1 & r59
            if (r59 == 0) goto L_0x0249
            r59 = 0
            goto L_0x024b
        L_0x0249:
            r59 = r123
        L_0x024b:
            r60 = 268435456(0x10000000, float:2.5243549E-29)
            r60 = r1 & r60
            if (r60 == 0) goto L_0x0254
            r60 = 0
            goto L_0x0256
        L_0x0254:
            r60 = r124
        L_0x0256:
            r61 = 536870912(0x20000000, float:1.0842022E-19)
            r61 = r1 & r61
            if (r61 == 0) goto L_0x025f
            r61 = 0
            goto L_0x0261
        L_0x025f:
            r61 = r125
        L_0x0261:
            r62 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r62
            if (r1 == 0) goto L_0x0269
            r1 = 0
            goto L_0x026b
        L_0x0269:
            r1 = r126
        L_0x026b:
            r64 = r63
            r65 = r2
            r66 = r4
            r67 = r5
            r68 = r6
            r69 = r7
            r70 = r8
            r71 = r9
            r72 = r10
            r73 = r11
            r74 = r12
            r75 = r13
            r76 = r14
            r77 = r15
            r78 = r16
            r79 = r3
            r80 = r18
            r81 = r20
            r82 = r22
            r83 = r24
            r84 = r26
            r85 = r28
            r86 = r29
            r87 = r30
            r88 = r31
            r89 = r32
            r90 = r33
            r91 = r34
            r92 = r35
            r93 = r36
            r94 = r37
            r95 = r38
            r96 = r127
            r97 = r39
            r98 = r40
            r99 = r41
            r100 = r42
            r101 = r43
            r102 = r44
            r103 = r45
            r104 = r46
            r105 = r47
            r106 = r48
            r107 = r49
            r108 = r50
            r109 = r51
            r110 = r52
            r111 = r0
            r112 = r17
            r113 = r19
            r114 = r21
            r115 = r23
            r116 = r25
            r117 = r27
            r118 = r53
            r119 = r54
            r120 = r55
            r121 = r56
            r122 = r57
            r123 = r58
            r124 = r59
            r125 = r60
            r126 = r61
            r127 = r1
            r64.<init>(r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingCard.<init>(java.lang.Boolean, java.lang.Float, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.FormattedMoney, java.lang.String, com.etsy.android.lib.models.apiv3.listing.Money, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.FreeShippingData, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.ListingImage, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.etsy.android.lib.models.apiv3.listing.SellerMarketingPromotionData, java.util.List, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
