package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.sdl.Page;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import org.apache.commons.lang3.StringEscapeUtils;
import org.json.JSONObject;

@C17403o(generateAdapter = true)
public final class ListingFetch implements ITrackedObject {
    public static final int $stable = 8;
    private final ListingDetailedFreeShipping detailedFreeShipping;
    private final EstimatedDeliveryDateNudge estimatedDeliveryDateNudge;
    private final List<ShopsFrequentlyAskedQuestion> faqs;
    private final List<ListingCard> featuredListings;
    private final ListingGiftInfo giftInfo;
    private final Boolean hasMoreRelatedListings;
    private final Boolean isShopFavorited;
    private final List<ItemDetail> itemDetails;
    private final Listing listing;
    private final ListingCard listingCard;
    private final List<ListingImage> listingImages;
    private final ListingLevelReturnPolicies listingLevelReturnPolicies;
    private final Nudge listingNudge;
    private final ListingReviewsAggregateRating listingRating;
    private final ListingVideo listingVideo;
    private final ListingMachineTranslationData machineTranslation;
    private final List<ShopsManufacturer> manufacturers;
    private final Map<String, List<Integer>> mmxRequestUuidMap;
    private AppsInventoryAddToCartContext offerings;
    private final List<String> overview;
    private final ListingPersonalization personalization;
    private final ShopsPolicy policies;
    private final PriceMessaging priceMessaging;
    private final ProductSafetyNotice productSafetyNotice;
    private final List<ShopsProductionPartner> productionPartners;
    private final SellerMarketingBOEMessage promoMessage;
    private final List<ListingCard> recentListings;
    private final Page recommendations;
    private final List<ListingCard> relatedListings;
    private final List<ReviewImage> reviewImages;
    private final List<ReviewVideo> reviewVideos;
    private final Reviews reviews;
    private final User seller;
    private final ShopsSellerPersonalDetails sellerDetails;
    private final Shipping shipping;
    private final ShippingOption shippingStandardOption;
    private final Shop shop;
    private final List<ShopsAboutMember> shopOwners;
    private final ShopRating shopRating;
    private final List<ShopReview> shopReviews;
    private final List<ShopSection> shopSections;
    private final Boolean shouldPushToCart;
    private final Boolean shouldUseListingLevelReturnPolicies;
    private final ListingExpressCheckout singleListingCheckout;
    private final ShopStructuredPolicies structuredPolicies;
    private final ListingSustainabilitySignals sustainability;
    private final String transparentPriceMessage;
    @EmptyArrayToMap
    private final Map<Long, Long> variationImages;
    private final List<Variation> variations;
    private final String visuallySimilarApiPath;

    public ListingFetch(@C17402n(name = "detailed_free_shipping") ListingDetailedFreeShipping listingDetailedFreeShipping, @C17402n(name = "faqs") List<ShopsFrequentlyAskedQuestion> list, @C17402n(name = "featured_listings") List<ListingCard> list2, @C17402n(name = "gift_info") ListingGiftInfo listingGiftInfo, @C17402n(name = "has_more_related_listings") Boolean bool, @C17402n(name = "listing") Listing listing2, @C17402n(name = "listing_card") ListingCard listingCard2, @C17402n(name = "listing_images") List<ListingImage> list3, @C17402n(name = "listing_nudge") Nudge nudge, @C17402n(name = "estimated_delivery_date_nudge") EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2, @C17402n(name = "listing_rating") ListingReviewsAggregateRating listingReviewsAggregateRating, @C17402n(name = "machine_translation") ListingMachineTranslationData listingMachineTranslationData, @C17402n(name = "manufacturers") List<ShopsManufacturer> list4, @C17402n(name = "offerings") AppsInventoryAddToCartContext appsInventoryAddToCartContext, @C17402n(name = "overview") List<String> list5, @C17402n(name = "personalization") ListingPersonalization listingPersonalization, @C17402n(name = "policies") ShopsPolicy shopsPolicy, @C17402n(name = "item_details") List<ItemDetail> list6, @C17402n(name = "price_messaging") PriceMessaging priceMessaging2, @C17402n(name = "production_partners") List<ShopsProductionPartner> list7, @C17402n(name = "promo_message") SellerMarketingBOEMessage sellerMarketingBOEMessage, @C17402n(name = "recent_listings") List<ListingCard> list8, @C17402n(name = "related_listings") List<ListingCard> list9, @C17402n(name = "seller") User user, @C17402n(name = "seller_details") ShopsSellerPersonalDetails shopsSellerPersonalDetails, @C17402n(name = "shipping") Shipping shipping2, @C17402n(name = "shipping_standard_option") ShippingOption shippingOption, @C17402n(name = "shop") Shop shop2, @C17402n(name = "shop_owners") List<ShopsAboutMember> list10, @C17402n(name = "shop_rating") ShopRating shopRating2, @C17402n(name = "shop_reviews") List<ShopReview> list11, @C17402n(name = "reviews") Reviews reviews2, @C17402n(name = "shop_sections") List<ShopSection> list12, @C17402n(name = "single_listing_checkout") ListingExpressCheckout listingExpressCheckout, @C17402n(name = "structured_policies") ShopStructuredPolicies shopStructuredPolicies, @C17402n(name = "return_policies") ListingLevelReturnPolicies listingLevelReturnPolicies2, @C17402n(name = "use_listing_level_return_policies") Boolean bool2, @C17402n(name = "sustainability") ListingSustainabilitySignals listingSustainabilitySignals, @C17402n(name = "transparent_price_message") String str, @C17402n(name = "variations") List<Variation> list13, @C17402n(name = "review_images") List<ReviewImage> list14, @C17402n(name = "review_videos") List<ReviewVideo> list15, @C17402n(name = "images_by_variation") Map<Long, Long> map, @C17402n(name = "should_push_to_cart") Boolean bool3, @C17402n(name = "recommendations") Page page, @C17402n(name = "listing_video") ListingVideo listingVideo2, @C17402n(name = "product_safety_notice") ProductSafetyNotice productSafetyNotice2, @C17402n(name = "visually_similar_api_path") String str2, @C17402n(name = "recent_listings_mmx_request_uuid_map") Map<String, ? extends List<Integer>> map2, @C17402n(name = "is_shop_favorited") Boolean bool4) {
        C19383o.m32797g(listing2, ResponseConstants.LISTING);
        this.detailedFreeShipping = listingDetailedFreeShipping;
        this.faqs = list;
        this.featuredListings = list2;
        this.giftInfo = listingGiftInfo;
        this.hasMoreRelatedListings = bool;
        this.listing = listing2;
        this.listingCard = listingCard2;
        this.listingImages = list3;
        this.listingNudge = nudge;
        this.estimatedDeliveryDateNudge = estimatedDeliveryDateNudge2;
        this.listingRating = listingReviewsAggregateRating;
        this.machineTranslation = listingMachineTranslationData;
        this.manufacturers = list4;
        this.offerings = appsInventoryAddToCartContext;
        this.overview = list5;
        this.personalization = listingPersonalization;
        this.policies = shopsPolicy;
        this.itemDetails = list6;
        this.priceMessaging = priceMessaging2;
        this.productionPartners = list7;
        this.promoMessage = sellerMarketingBOEMessage;
        this.recentListings = list8;
        this.relatedListings = list9;
        this.seller = user;
        this.sellerDetails = shopsSellerPersonalDetails;
        this.shipping = shipping2;
        this.shippingStandardOption = shippingOption;
        this.shop = shop2;
        this.shopOwners = list10;
        this.shopRating = shopRating2;
        this.shopReviews = list11;
        this.reviews = reviews2;
        this.shopSections = list12;
        this.singleListingCheckout = listingExpressCheckout;
        this.structuredPolicies = shopStructuredPolicies;
        this.listingLevelReturnPolicies = listingLevelReturnPolicies2;
        this.shouldUseListingLevelReturnPolicies = bool2;
        this.sustainability = listingSustainabilitySignals;
        this.transparentPriceMessage = str;
        this.variations = list13;
        this.reviewImages = list14;
        this.reviewVideos = list15;
        this.variationImages = map;
        this.shouldPushToCart = bool3;
        this.recommendations = page;
        this.listingVideo = listingVideo2;
        this.productSafetyNotice = productSafetyNotice2;
        this.visuallySimilarApiPath = str2;
        this.mmxRequestUuidMap = map2;
        this.isShopFavorited = bool4;
    }

    public static /* synthetic */ ListingFetch copy$default(ListingFetch listingFetch, ListingDetailedFreeShipping listingDetailedFreeShipping, List list, List list2, ListingGiftInfo listingGiftInfo, Boolean bool, Listing listing2, ListingCard listingCard2, List list3, Nudge nudge, EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2, ListingReviewsAggregateRating listingReviewsAggregateRating, ListingMachineTranslationData listingMachineTranslationData, List list4, AppsInventoryAddToCartContext appsInventoryAddToCartContext, List list5, ListingPersonalization listingPersonalization, ShopsPolicy shopsPolicy, List list6, PriceMessaging priceMessaging2, List list7, SellerMarketingBOEMessage sellerMarketingBOEMessage, List list8, List list9, User user, ShopsSellerPersonalDetails shopsSellerPersonalDetails, Shipping shipping2, ShippingOption shippingOption, Shop shop2, List list10, ShopRating shopRating2, List list11, Reviews reviews2, List list12, ListingExpressCheckout listingExpressCheckout, ShopStructuredPolicies shopStructuredPolicies, ListingLevelReturnPolicies listingLevelReturnPolicies2, Boolean bool2, ListingSustainabilitySignals listingSustainabilitySignals, String str, List list13, List list14, List list15, Map map, Boolean bool3, Page page, ListingVideo listingVideo2, ProductSafetyNotice productSafetyNotice2, String str2, Map map2, Boolean bool4, int i, int i2, Object obj) {
        ListingFetch listingFetch2 = listingFetch;
        int i3 = i;
        int i4 = i2;
        return listingFetch.copy((i3 & 1) != 0 ? listingFetch2.detailedFreeShipping : listingDetailedFreeShipping, (i3 & 2) != 0 ? listingFetch2.faqs : list, (i3 & 4) != 0 ? listingFetch2.featuredListings : list2, (i3 & 8) != 0 ? listingFetch2.giftInfo : listingGiftInfo, (i3 & 16) != 0 ? listingFetch2.hasMoreRelatedListings : bool, (i3 & 32) != 0 ? listingFetch2.listing : listing2, (i3 & 64) != 0 ? listingFetch2.listingCard : listingCard2, (i3 & 128) != 0 ? listingFetch2.listingImages : list3, (i3 & 256) != 0 ? listingFetch2.listingNudge : nudge, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingFetch2.estimatedDeliveryDateNudge : estimatedDeliveryDateNudge2, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingFetch2.listingRating : listingReviewsAggregateRating, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listingFetch2.machineTranslation : listingMachineTranslationData, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listingFetch2.manufacturers : list4, (i3 & 8192) != 0 ? listingFetch2.offerings : appsInventoryAddToCartContext, (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listingFetch2.overview : list5, (i3 & 32768) != 0 ? listingFetch2.personalization : listingPersonalization, (i3 & 65536) != 0 ? listingFetch2.policies : shopsPolicy, (i3 & 131072) != 0 ? listingFetch2.itemDetails : list6, (i3 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? listingFetch2.priceMessaging : priceMessaging2, (i3 & 524288) != 0 ? listingFetch2.productionPartners : list7, (i3 & 1048576) != 0 ? listingFetch2.promoMessage : sellerMarketingBOEMessage, (i3 & 2097152) != 0 ? listingFetch2.recentListings : list8, (i3 & 4194304) != 0 ? listingFetch2.relatedListings : list9, (i3 & 8388608) != 0 ? listingFetch2.seller : user, (i3 & 16777216) != 0 ? listingFetch2.sellerDetails : shopsSellerPersonalDetails, (i3 & 33554432) != 0 ? listingFetch2.shipping : shipping2, (i3 & 67108864) != 0 ? listingFetch2.shippingStandardOption : shippingOption, (i3 & 134217728) != 0 ? listingFetch2.shop : shop2, (i3 & 268435456) != 0 ? listingFetch2.shopOwners : list10, (i3 & 536870912) != 0 ? listingFetch2.shopRating : shopRating2, (i3 & 1073741824) != 0 ? listingFetch2.shopReviews : list11, (i3 & Integer.MIN_VALUE) != 0 ? listingFetch2.reviews : reviews2, (i4 & 1) != 0 ? listingFetch2.shopSections : list12, (i4 & 2) != 0 ? listingFetch2.singleListingCheckout : listingExpressCheckout, (i4 & 4) != 0 ? listingFetch2.structuredPolicies : shopStructuredPolicies, (i4 & 8) != 0 ? listingFetch2.listingLevelReturnPolicies : listingLevelReturnPolicies2, (i4 & 16) != 0 ? listingFetch2.shouldUseListingLevelReturnPolicies : bool2, (i4 & 32) != 0 ? listingFetch2.sustainability : listingSustainabilitySignals, (i4 & 64) != 0 ? listingFetch2.transparentPriceMessage : str, (i4 & 128) != 0 ? listingFetch2.variations : list13, (i4 & 256) != 0 ? listingFetch2.reviewImages : list14, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? listingFetch2.reviewVideos : list15, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? listingFetch2.variationImages : map, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? listingFetch2.shouldPushToCart : bool3, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listingFetch2.recommendations : page, (i4 & 8192) != 0 ? listingFetch2.listingVideo : listingVideo2, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? listingFetch2.productSafetyNotice : productSafetyNotice2, (i4 & 32768) != 0 ? listingFetch2.visuallySimilarApiPath : str2, (i4 & 65536) != 0 ? listingFetch2.mmxRequestUuidMap : map2, (i4 & 131072) != 0 ? listingFetch2.isShopFavorited : bool4);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    public final ListingDetailedFreeShipping component1() {
        return this.detailedFreeShipping;
    }

    public final EstimatedDeliveryDateNudge component10() {
        return this.estimatedDeliveryDateNudge;
    }

    public final ListingReviewsAggregateRating component11() {
        return this.listingRating;
    }

    public final ListingMachineTranslationData component12() {
        return this.machineTranslation;
    }

    public final List<ShopsManufacturer> component13() {
        return this.manufacturers;
    }

    public final AppsInventoryAddToCartContext component14() {
        return this.offerings;
    }

    public final List<String> component15() {
        return this.overview;
    }

    public final ListingPersonalization component16() {
        return this.personalization;
    }

    public final ShopsPolicy component17() {
        return this.policies;
    }

    public final List<ItemDetail> component18() {
        return this.itemDetails;
    }

    public final PriceMessaging component19() {
        return this.priceMessaging;
    }

    public final List<ShopsFrequentlyAskedQuestion> component2() {
        return this.faqs;
    }

    public final List<ShopsProductionPartner> component20() {
        return this.productionPartners;
    }

    public final SellerMarketingBOEMessage component21() {
        return this.promoMessage;
    }

    public final List<ListingCard> component22() {
        return this.recentListings;
    }

    public final List<ListingCard> component23() {
        return this.relatedListings;
    }

    public final User component24() {
        return this.seller;
    }

    public final ShopsSellerPersonalDetails component25() {
        return this.sellerDetails;
    }

    public final Shipping component26() {
        return this.shipping;
    }

    public final ShippingOption component27() {
        return this.shippingStandardOption;
    }

    public final Shop component28() {
        return this.shop;
    }

    public final List<ShopsAboutMember> component29() {
        return this.shopOwners;
    }

    public final List<ListingCard> component3() {
        return this.featuredListings;
    }

    public final ShopRating component30() {
        return this.shopRating;
    }

    public final List<ShopReview> component31() {
        return this.shopReviews;
    }

    public final Reviews component32() {
        return this.reviews;
    }

    public final List<ShopSection> component33() {
        return this.shopSections;
    }

    public final ListingExpressCheckout component34() {
        return this.singleListingCheckout;
    }

    public final ShopStructuredPolicies component35() {
        return this.structuredPolicies;
    }

    public final ListingLevelReturnPolicies component36() {
        return this.listingLevelReturnPolicies;
    }

    public final Boolean component37() {
        return this.shouldUseListingLevelReturnPolicies;
    }

    public final ListingSustainabilitySignals component38() {
        return this.sustainability;
    }

    public final String component39() {
        return this.transparentPriceMessage;
    }

    public final ListingGiftInfo component4() {
        return this.giftInfo;
    }

    public final List<Variation> component40() {
        return this.variations;
    }

    public final List<ReviewImage> component41() {
        return this.reviewImages;
    }

    public final List<ReviewVideo> component42() {
        return this.reviewVideos;
    }

    public final Map<Long, Long> component43() {
        return this.variationImages;
    }

    public final Boolean component44() {
        return this.shouldPushToCart;
    }

    public final Page component45() {
        return this.recommendations;
    }

    public final ListingVideo component46() {
        return this.listingVideo;
    }

    public final ProductSafetyNotice component47() {
        return this.productSafetyNotice;
    }

    public final String component48() {
        return this.visuallySimilarApiPath;
    }

    public final Map<String, List<Integer>> component49() {
        return this.mmxRequestUuidMap;
    }

    public final Boolean component5() {
        return this.hasMoreRelatedListings;
    }

    public final Boolean component50() {
        return this.isShopFavorited;
    }

    public final Listing component6() {
        return this.listing;
    }

    public final ListingCard component7() {
        return this.listingCard;
    }

    public final List<ListingImage> component8() {
        return this.listingImages;
    }

    public final Nudge component9() {
        return this.listingNudge;
    }

    public final ListingFetch copy(@C17402n(name = "detailed_free_shipping") ListingDetailedFreeShipping listingDetailedFreeShipping, @C17402n(name = "faqs") List<ShopsFrequentlyAskedQuestion> list, @C17402n(name = "featured_listings") List<ListingCard> list2, @C17402n(name = "gift_info") ListingGiftInfo listingGiftInfo, @C17402n(name = "has_more_related_listings") Boolean bool, @C17402n(name = "listing") Listing listing2, @C17402n(name = "listing_card") ListingCard listingCard2, @C17402n(name = "listing_images") List<ListingImage> list3, @C17402n(name = "listing_nudge") Nudge nudge, @C17402n(name = "estimated_delivery_date_nudge") EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2, @C17402n(name = "listing_rating") ListingReviewsAggregateRating listingReviewsAggregateRating, @C17402n(name = "machine_translation") ListingMachineTranslationData listingMachineTranslationData, @C17402n(name = "manufacturers") List<ShopsManufacturer> list4, @C17402n(name = "offerings") AppsInventoryAddToCartContext appsInventoryAddToCartContext, @C17402n(name = "overview") List<String> list5, @C17402n(name = "personalization") ListingPersonalization listingPersonalization, @C17402n(name = "policies") ShopsPolicy shopsPolicy, @C17402n(name = "item_details") List<ItemDetail> list6, @C17402n(name = "price_messaging") PriceMessaging priceMessaging2, @C17402n(name = "production_partners") List<ShopsProductionPartner> list7, @C17402n(name = "promo_message") SellerMarketingBOEMessage sellerMarketingBOEMessage, @C17402n(name = "recent_listings") List<ListingCard> list8, @C17402n(name = "related_listings") List<ListingCard> list9, @C17402n(name = "seller") User user, @C17402n(name = "seller_details") ShopsSellerPersonalDetails shopsSellerPersonalDetails, @C17402n(name = "shipping") Shipping shipping2, @C17402n(name = "shipping_standard_option") ShippingOption shippingOption, @C17402n(name = "shop") Shop shop2, @C17402n(name = "shop_owners") List<ShopsAboutMember> list10, @C17402n(name = "shop_rating") ShopRating shopRating2, @C17402n(name = "shop_reviews") List<ShopReview> list11, @C17402n(name = "reviews") Reviews reviews2, @C17402n(name = "shop_sections") List<ShopSection> list12, @C17402n(name = "single_listing_checkout") ListingExpressCheckout listingExpressCheckout, @C17402n(name = "structured_policies") ShopStructuredPolicies shopStructuredPolicies, @C17402n(name = "return_policies") ListingLevelReturnPolicies listingLevelReturnPolicies2, @C17402n(name = "use_listing_level_return_policies") Boolean bool2, @C17402n(name = "sustainability") ListingSustainabilitySignals listingSustainabilitySignals, @C17402n(name = "transparent_price_message") String str, @C17402n(name = "variations") List<Variation> list13, @C17402n(name = "review_images") List<ReviewImage> list14, @C17402n(name = "review_videos") List<ReviewVideo> list15, @C17402n(name = "images_by_variation") Map<Long, Long> map, @C17402n(name = "should_push_to_cart") Boolean bool3, @C17402n(name = "recommendations") Page page, @C17402n(name = "listing_video") ListingVideo listingVideo2, @C17402n(name = "product_safety_notice") ProductSafetyNotice productSafetyNotice2, @C17402n(name = "visually_similar_api_path") String str2, @C17402n(name = "recent_listings_mmx_request_uuid_map") Map<String, ? extends List<Integer>> map2, @C17402n(name = "is_shop_favorited") Boolean bool4) {
        ListingDetailedFreeShipping listingDetailedFreeShipping2 = listingDetailedFreeShipping;
        C19383o.m32797g(listing2, ResponseConstants.LISTING);
        return new ListingFetch(listingDetailedFreeShipping, list, list2, listingGiftInfo, bool, listing2, listingCard2, list3, nudge, estimatedDeliveryDateNudge2, listingReviewsAggregateRating, listingMachineTranslationData, list4, appsInventoryAddToCartContext, list5, listingPersonalization, shopsPolicy, list6, priceMessaging2, list7, sellerMarketingBOEMessage, list8, list9, user, shopsSellerPersonalDetails, shipping2, shippingOption, shop2, list10, shopRating2, list11, reviews2, list12, listingExpressCheckout, shopStructuredPolicies, listingLevelReturnPolicies2, bool2, listingSustainabilitySignals, str, list13, list14, list15, map, bool3, page, listingVideo2, productSafetyNotice2, str2, map2, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingFetch)) {
            return false;
        }
        ListingFetch listingFetch = (ListingFetch) obj;
        return C19383o.m32792b(this.detailedFreeShipping, listingFetch.detailedFreeShipping) && C19383o.m32792b(this.faqs, listingFetch.faqs) && C19383o.m32792b(this.featuredListings, listingFetch.featuredListings) && C19383o.m32792b(this.giftInfo, listingFetch.giftInfo) && C19383o.m32792b(this.hasMoreRelatedListings, listingFetch.hasMoreRelatedListings) && C19383o.m32792b(this.listing, listingFetch.listing) && C19383o.m32792b(this.listingCard, listingFetch.listingCard) && C19383o.m32792b(this.listingImages, listingFetch.listingImages) && C19383o.m32792b(this.listingNudge, listingFetch.listingNudge) && C19383o.m32792b(this.estimatedDeliveryDateNudge, listingFetch.estimatedDeliveryDateNudge) && C19383o.m32792b(this.listingRating, listingFetch.listingRating) && C19383o.m32792b(this.machineTranslation, listingFetch.machineTranslation) && C19383o.m32792b(this.manufacturers, listingFetch.manufacturers) && C19383o.m32792b(this.offerings, listingFetch.offerings) && C19383o.m32792b(this.overview, listingFetch.overview) && C19383o.m32792b(this.personalization, listingFetch.personalization) && C19383o.m32792b(this.policies, listingFetch.policies) && C19383o.m32792b(this.itemDetails, listingFetch.itemDetails) && C19383o.m32792b(this.priceMessaging, listingFetch.priceMessaging) && C19383o.m32792b(this.productionPartners, listingFetch.productionPartners) && C19383o.m32792b(this.promoMessage, listingFetch.promoMessage) && C19383o.m32792b(this.recentListings, listingFetch.recentListings) && C19383o.m32792b(this.relatedListings, listingFetch.relatedListings) && C19383o.m32792b(this.seller, listingFetch.seller) && C19383o.m32792b(this.sellerDetails, listingFetch.sellerDetails) && C19383o.m32792b(this.shipping, listingFetch.shipping) && C19383o.m32792b(this.shippingStandardOption, listingFetch.shippingStandardOption) && C19383o.m32792b(this.shop, listingFetch.shop) && C19383o.m32792b(this.shopOwners, listingFetch.shopOwners) && C19383o.m32792b(this.shopRating, listingFetch.shopRating) && C19383o.m32792b(this.shopReviews, listingFetch.shopReviews) && C19383o.m32792b(this.reviews, listingFetch.reviews) && C19383o.m32792b(this.shopSections, listingFetch.shopSections) && C19383o.m32792b(this.singleListingCheckout, listingFetch.singleListingCheckout) && C19383o.m32792b(this.structuredPolicies, listingFetch.structuredPolicies) && C19383o.m32792b(this.listingLevelReturnPolicies, listingFetch.listingLevelReturnPolicies) && C19383o.m32792b(this.shouldUseListingLevelReturnPolicies, listingFetch.shouldUseListingLevelReturnPolicies) && C19383o.m32792b(this.sustainability, listingFetch.sustainability) && C19383o.m32792b(this.transparentPriceMessage, listingFetch.transparentPriceMessage) && C19383o.m32792b(this.variations, listingFetch.variations) && C19383o.m32792b(this.reviewImages, listingFetch.reviewImages) && C19383o.m32792b(this.reviewVideos, listingFetch.reviewVideos) && C19383o.m32792b(this.variationImages, listingFetch.variationImages) && C19383o.m32792b(this.shouldPushToCart, listingFetch.shouldPushToCart) && C19383o.m32792b(this.recommendations, listingFetch.recommendations) && C19383o.m32792b(this.listingVideo, listingFetch.listingVideo) && C19383o.m32792b(this.productSafetyNotice, listingFetch.productSafetyNotice) && C19383o.m32792b(this.visuallySimilarApiPath, listingFetch.visuallySimilarApiPath) && C19383o.m32792b(this.mmxRequestUuidMap, listingFetch.mmxRequestUuidMap) && C19383o.m32792b(this.isShopFavorited, listingFetch.isShopFavorited);
    }

    public final ListingDetailedFreeShipping getDetailedFreeShipping() {
        return this.detailedFreeShipping;
    }

    public final EstimatedDeliveryDateNudge getEstimatedDeliveryDateNudge() {
        return this.estimatedDeliveryDateNudge;
    }

    public final List<ShopsFrequentlyAskedQuestion> getFaqs() {
        return this.faqs;
    }

    public final List<ListingCard> getFeaturedListings() {
        return this.featuredListings;
    }

    public final ListingGiftInfo getGiftInfo() {
        return this.giftInfo;
    }

    public final Boolean getHasMoreRelatedListings() {
        return this.hasMoreRelatedListings;
    }

    public final List<ItemDetail> getItemDetails() {
        return this.itemDetails;
    }

    public final Listing getListing() {
        return this.listing;
    }

    public final ListingCard getListingCard() {
        return this.listingCard;
    }

    public final List<ListingImage> getListingImages() {
        return this.listingImages;
    }

    public final ListingLevelReturnPolicies getListingLevelReturnPolicies() {
        return this.listingLevelReturnPolicies;
    }

    public final Nudge getListingNudge() {
        return this.listingNudge;
    }

    public final ListingReviewsAggregateRating getListingRating() {
        return this.listingRating;
    }

    public final ListingVideo getListingVideo() {
        return this.listingVideo;
    }

    public final ListingMachineTranslationData getMachineTranslation() {
        return this.machineTranslation;
    }

    public final List<ShopsManufacturer> getManufacturers() {
        return this.manufacturers;
    }

    public final Map<String, List<Integer>> getMmxRequestUuidMap() {
        return this.mmxRequestUuidMap;
    }

    public final AppsInventoryAddToCartContext getOfferings() {
        return this.offerings;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    public final List<String> getOverview() {
        return this.overview;
    }

    public final ListingPersonalization getPersonalization() {
        return this.personalization;
    }

    public final ShopsPolicy getPolicies() {
        return this.policies;
    }

    public final PriceMessaging getPriceMessaging() {
        return this.priceMessaging;
    }

    public final ProductSafetyNotice getProductSafetyNotice() {
        return this.productSafetyNotice;
    }

    public final List<ShopsProductionPartner> getProductionPartners() {
        return this.productionPartners;
    }

    public final SellerMarketingBOEMessage getPromoMessage() {
        return this.promoMessage;
    }

    public final List<ListingCard> getRecentListings() {
        return this.recentListings;
    }

    public final Page getRecommendations() {
        return this.recommendations;
    }

    public final List<ListingCard> getRelatedListings() {
        return this.relatedListings;
    }

    public final List<ReviewImage> getReviewImages() {
        return this.reviewImages;
    }

    public final List<ReviewVideo> getReviewVideos() {
        return this.reviewVideos;
    }

    public final Reviews getReviews() {
        return this.reviews;
    }

    public final String getSelectedVariationValues() {
        JSONObject jSONObject = new JSONObject();
        List<Variation> list = this.variations;
        if (list != null) {
            for (Variation variation : list) {
                VariationValue selectedValue = variation.getSelectedValue();
                if (selectedValue != null) {
                    Long propertyId = variation.getPropertyId();
                    long j = 0;
                    long longValue = propertyId != null ? propertyId.longValue() : 0;
                    Long valueId = selectedValue.getValueId();
                    if (valueId != null) {
                        j = valueId.longValue();
                    }
                    jSONObject.put(String.valueOf(longValue), String.valueOf(j));
                }
            }
        }
        String jSONObject2 = jSONObject.toString();
        C19383o.m32796f(jSONObject2, "selectedValues.toString()");
        return jSONObject2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r3 = r3.getValueId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getSelectedVariations() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.List<com.etsy.android.lib.models.apiv3.listing.Variation> r1 = r8.variations
            if (r1 == 0) goto L_0x0050
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r1.next()
            com.etsy.android.lib.models.apiv3.listing.Variation r2 = (com.etsy.android.lib.models.apiv3.listing.Variation) r2
            com.etsy.android.lib.models.apiv3.listing.VariationValue r3 = r2.getSelectedValue()
            r4 = 0
            if (r3 == 0) goto L_0x002c
            java.lang.Long r3 = r3.getValueId()
            if (r3 == 0) goto L_0x002c
            long r6 = r3.longValue()
            goto L_0x002d
        L_0x002c:
            r6 = r4
        L_0x002d:
            boolean r3 = r2.hasOptionSet()
            if (r3 == 0) goto L_0x000d
            java.lang.Long r2 = r2.getPropertyId()     // Catch:{ JSONException -> 0x0045 }
            if (r2 == 0) goto L_0x003d
            long r4 = r2.longValue()     // Catch:{ JSONException -> 0x0045 }
        L_0x003d:
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x0045 }
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x0045 }
            goto L_0x000d
        L_0x0045:
            r2 = move-exception
            com.etsy.android.lib.logger.h r3 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            java.lang.String r4 = "Error parsing variation to JSON"
            r3.mo21309d(r4, r2)
            goto L_0x000d
        L_0x0050:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingFetch.getSelectedVariations():java.lang.String");
    }

    public final User getSeller() {
        return this.seller;
    }

    public final ShopsSellerPersonalDetails getSellerDetails() {
        return this.sellerDetails;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public final ShippingOption getShippingStandardOption() {
        return this.shippingStandardOption;
    }

    public final Shop getShop() {
        return this.shop;
    }

    public final List<ShopsAboutMember> getShopOwners() {
        return this.shopOwners;
    }

    public final ShopRating getShopRating() {
        return this.shopRating;
    }

    public final List<ShopReview> getShopReviews() {
        return this.shopReviews;
    }

    public final List<ShopSection> getShopSections() {
        return this.shopSections;
    }

    public final Boolean getShouldPushToCart() {
        return this.shouldPushToCart;
    }

    public final Boolean getShouldUseListingLevelReturnPolicies() {
        return this.shouldUseListingLevelReturnPolicies;
    }

    public final ListingExpressCheckout getSingleListingCheckout() {
        return this.singleListingCheckout;
    }

    public final ShopStructuredPolicies getStructuredPolicies() {
        return this.structuredPolicies;
    }

    public final ListingSustainabilitySignals getSustainability() {
        return this.sustainability;
    }

    public final String getTitle() {
        String unescapeHtml4;
        ListingMachineTranslationTranslatedFields untranslated;
        ListingMachineTranslationData listingMachineTranslationData = this.machineTranslation;
        if (listingMachineTranslationData == null || (untranslated = listingMachineTranslationData.getUntranslated()) == null) {
            String title = this.listing.getTitle();
            if (title == null || (unescapeHtml4 = StringEscapeUtils.unescapeHtml4(title)) == null) {
                return "";
            }
        } else {
            String title2 = untranslated.getTitle();
            if (title2 == null || (unescapeHtml4 = StringEscapeUtils.unescapeHtml4(title2)) == null) {
                return "";
            }
        }
        return unescapeHtml4;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    @JsonIgnore
    public String getTrackingName() {
        return "";
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        Long shopId;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PredefinedAnalyticsProperty.LISTING_ID, String.valueOf(this.listing.getListingId()));
        Shop shop2 = this.shop;
        if (!(shop2 == null || (shopId = shop2.getShopId()) == null)) {
            linkedHashMap.put(PredefinedAnalyticsProperty.SHOP_SHOP_ID, String.valueOf(shopId.longValue()));
        }
        return linkedHashMap;
    }

    public final String getTransparentPriceMessage() {
        return this.transparentPriceMessage;
    }

    public final List<AppsInventoryUiSelect> getUnselectedInventoryVariations() {
        AppsInventoryAddToCartUi ui;
        List<AppsInventoryUiSelect> selects;
        ArrayList arrayList = new ArrayList();
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = this.offerings;
        if (!(appsInventoryAddToCartContext == null || (ui = appsInventoryAddToCartContext.getUi()) == null || (selects = ui.getSelects()) == null)) {
            for (AppsInventoryUiSelect appsInventoryUiSelect : selects) {
                if (appsInventoryUiSelect.selectedOption() == null) {
                    arrayList.add(appsInventoryUiSelect);
                }
            }
        }
        return arrayList;
    }

    public final Map<Long, Long> getVariationImages() {
        return this.variationImages;
    }

    public final List<Variation> getVariations() {
        return this.variations;
    }

    public final String getVisuallySimilarApiPath() {
        return this.visuallySimilarApiPath;
    }

    public final boolean hasPriceDiffVariation() {
        List<Variation> list = this.variations;
        T t = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((Variation) next).hasPriceDifference()) {
                    t = next;
                    break;
                }
            }
            t = (Variation) t;
        }
        return t != null;
    }

    public final boolean hasSelectedAllVariations() {
        List<Variation> list = this.variations;
        if (list == null) {
            return true;
        }
        for (Variation selectedValue : list) {
            if (selectedValue.getSelectedValue() == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasSplitReviews() {
        Reviews reviews2 = this.reviews;
        return reviews2 != null && (C19543e0.m33306Y(reviews2.getListingReviews()) || C19543e0.m33306Y(this.reviews.getShopReviews()));
    }

    public final boolean hasVariations() {
        return C19543e0.m33306Y(this.variations);
    }

    public int hashCode() {
        ListingDetailedFreeShipping listingDetailedFreeShipping = this.detailedFreeShipping;
        int i = 0;
        int hashCode = (listingDetailedFreeShipping == null ? 0 : listingDetailedFreeShipping.hashCode()) * 31;
        List<ShopsFrequentlyAskedQuestion> list = this.faqs;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ListingCard> list2 = this.featuredListings;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ListingGiftInfo listingGiftInfo = this.giftInfo;
        int hashCode4 = (hashCode3 + (listingGiftInfo == null ? 0 : listingGiftInfo.hashCode())) * 31;
        Boolean bool = this.hasMoreRelatedListings;
        int hashCode5 = (this.listing.hashCode() + ((hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        ListingCard listingCard2 = this.listingCard;
        int hashCode6 = (hashCode5 + (listingCard2 == null ? 0 : listingCard2.hashCode())) * 31;
        List<ListingImage> list3 = this.listingImages;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Nudge nudge = this.listingNudge;
        int hashCode8 = (hashCode7 + (nudge == null ? 0 : nudge.hashCode())) * 31;
        EstimatedDeliveryDateNudge estimatedDeliveryDateNudge2 = this.estimatedDeliveryDateNudge;
        int hashCode9 = (hashCode8 + (estimatedDeliveryDateNudge2 == null ? 0 : estimatedDeliveryDateNudge2.hashCode())) * 31;
        ListingReviewsAggregateRating listingReviewsAggregateRating = this.listingRating;
        int hashCode10 = (hashCode9 + (listingReviewsAggregateRating == null ? 0 : listingReviewsAggregateRating.hashCode())) * 31;
        ListingMachineTranslationData listingMachineTranslationData = this.machineTranslation;
        int hashCode11 = (hashCode10 + (listingMachineTranslationData == null ? 0 : listingMachineTranslationData.hashCode())) * 31;
        List<ShopsManufacturer> list4 = this.manufacturers;
        int hashCode12 = (hashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = this.offerings;
        int hashCode13 = (hashCode12 + (appsInventoryAddToCartContext == null ? 0 : appsInventoryAddToCartContext.hashCode())) * 31;
        List<String> list5 = this.overview;
        int hashCode14 = (hashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        ListingPersonalization listingPersonalization = this.personalization;
        int hashCode15 = (hashCode14 + (listingPersonalization == null ? 0 : listingPersonalization.hashCode())) * 31;
        ShopsPolicy shopsPolicy = this.policies;
        int hashCode16 = (hashCode15 + (shopsPolicy == null ? 0 : shopsPolicy.hashCode())) * 31;
        List<ItemDetail> list6 = this.itemDetails;
        int hashCode17 = (hashCode16 + (list6 == null ? 0 : list6.hashCode())) * 31;
        PriceMessaging priceMessaging2 = this.priceMessaging;
        int hashCode18 = (hashCode17 + (priceMessaging2 == null ? 0 : priceMessaging2.hashCode())) * 31;
        List<ShopsProductionPartner> list7 = this.productionPartners;
        int hashCode19 = (hashCode18 + (list7 == null ? 0 : list7.hashCode())) * 31;
        SellerMarketingBOEMessage sellerMarketingBOEMessage = this.promoMessage;
        int hashCode20 = (hashCode19 + (sellerMarketingBOEMessage == null ? 0 : sellerMarketingBOEMessage.hashCode())) * 31;
        List<ListingCard> list8 = this.recentListings;
        int hashCode21 = (hashCode20 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<ListingCard> list9 = this.relatedListings;
        int hashCode22 = (hashCode21 + (list9 == null ? 0 : list9.hashCode())) * 31;
        User user = this.seller;
        int hashCode23 = (hashCode22 + (user == null ? 0 : user.hashCode())) * 31;
        ShopsSellerPersonalDetails shopsSellerPersonalDetails = this.sellerDetails;
        int hashCode24 = (hashCode23 + (shopsSellerPersonalDetails == null ? 0 : shopsSellerPersonalDetails.hashCode())) * 31;
        Shipping shipping2 = this.shipping;
        int hashCode25 = (hashCode24 + (shipping2 == null ? 0 : shipping2.hashCode())) * 31;
        ShippingOption shippingOption = this.shippingStandardOption;
        int hashCode26 = (hashCode25 + (shippingOption == null ? 0 : shippingOption.hashCode())) * 31;
        Shop shop2 = this.shop;
        int hashCode27 = (hashCode26 + (shop2 == null ? 0 : shop2.hashCode())) * 31;
        List<ShopsAboutMember> list10 = this.shopOwners;
        int hashCode28 = (hashCode27 + (list10 == null ? 0 : list10.hashCode())) * 31;
        ShopRating shopRating2 = this.shopRating;
        int hashCode29 = (hashCode28 + (shopRating2 == null ? 0 : shopRating2.hashCode())) * 31;
        List<ShopReview> list11 = this.shopReviews;
        int hashCode30 = (hashCode29 + (list11 == null ? 0 : list11.hashCode())) * 31;
        Reviews reviews2 = this.reviews;
        int hashCode31 = (hashCode30 + (reviews2 == null ? 0 : reviews2.hashCode())) * 31;
        List<ShopSection> list12 = this.shopSections;
        int hashCode32 = (hashCode31 + (list12 == null ? 0 : list12.hashCode())) * 31;
        ListingExpressCheckout listingExpressCheckout = this.singleListingCheckout;
        int hashCode33 = (hashCode32 + (listingExpressCheckout == null ? 0 : listingExpressCheckout.hashCode())) * 31;
        ShopStructuredPolicies shopStructuredPolicies = this.structuredPolicies;
        int hashCode34 = (hashCode33 + (shopStructuredPolicies == null ? 0 : shopStructuredPolicies.hashCode())) * 31;
        ListingLevelReturnPolicies listingLevelReturnPolicies2 = this.listingLevelReturnPolicies;
        int hashCode35 = (hashCode34 + (listingLevelReturnPolicies2 == null ? 0 : listingLevelReturnPolicies2.hashCode())) * 31;
        Boolean bool2 = this.shouldUseListingLevelReturnPolicies;
        int hashCode36 = (hashCode35 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ListingSustainabilitySignals listingSustainabilitySignals = this.sustainability;
        int hashCode37 = (hashCode36 + (listingSustainabilitySignals == null ? 0 : listingSustainabilitySignals.hashCode())) * 31;
        String str = this.transparentPriceMessage;
        int hashCode38 = (hashCode37 + (str == null ? 0 : str.hashCode())) * 31;
        List<Variation> list13 = this.variations;
        int hashCode39 = (hashCode38 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<ReviewImage> list14 = this.reviewImages;
        int hashCode40 = (hashCode39 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<ReviewVideo> list15 = this.reviewVideos;
        int hashCode41 = (hashCode40 + (list15 == null ? 0 : list15.hashCode())) * 31;
        Map<Long, Long> map = this.variationImages;
        int hashCode42 = (hashCode41 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool3 = this.shouldPushToCart;
        int hashCode43 = (hashCode42 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Page page = this.recommendations;
        int hashCode44 = (hashCode43 + (page == null ? 0 : page.hashCode())) * 31;
        ListingVideo listingVideo2 = this.listingVideo;
        int hashCode45 = (hashCode44 + (listingVideo2 == null ? 0 : listingVideo2.hashCode())) * 31;
        ProductSafetyNotice productSafetyNotice2 = this.productSafetyNotice;
        int hashCode46 = (hashCode45 + (productSafetyNotice2 == null ? 0 : productSafetyNotice2.hashCode())) * 31;
        String str2 = this.visuallySimilarApiPath;
        int hashCode47 = (hashCode46 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, List<Integer>> map2 = this.mmxRequestUuidMap;
        int hashCode48 = (hashCode47 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool4 = this.isShopFavorited;
        if (bool4 != null) {
            i = bool4.hashCode();
        }
        return hashCode48 + i;
    }

    public final Boolean isShopFavorited() {
        return this.isShopFavorited;
    }

    public final boolean isVatInclusive() {
        Boolean isVatInclusive;
        PriceMessaging priceMessaging2 = this.priceMessaging;
        if (priceMessaging2 == null || (isVatInclusive = priceMessaging2.isVatInclusive()) == null) {
            return false;
        }
        return isVatInclusive.booleanValue();
    }

    public final void setOfferings(AppsInventoryAddToCartContext appsInventoryAddToCartContext) {
        this.offerings = appsInventoryAddToCartContext;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "onSeenTrackingEvents");
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    @JsonIgnore
    public void setTrackingName(String str) {
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ListingFetch(detailedFreeShipping=");
        h.append(this.detailedFreeShipping);
        h.append(", faqs=");
        h.append(this.faqs);
        h.append(", featuredListings=");
        h.append(this.featuredListings);
        h.append(", giftInfo=");
        h.append(this.giftInfo);
        h.append(", hasMoreRelatedListings=");
        h.append(this.hasMoreRelatedListings);
        h.append(", listing=");
        h.append(this.listing);
        h.append(", listingCard=");
        h.append(this.listingCard);
        h.append(", listingImages=");
        h.append(this.listingImages);
        h.append(", listingNudge=");
        h.append(this.listingNudge);
        h.append(", estimatedDeliveryDateNudge=");
        h.append(this.estimatedDeliveryDateNudge);
        h.append(", listingRating=");
        h.append(this.listingRating);
        h.append(", machineTranslation=");
        h.append(this.machineTranslation);
        h.append(", manufacturers=");
        h.append(this.manufacturers);
        h.append(", offerings=");
        h.append(this.offerings);
        h.append(", overview=");
        h.append(this.overview);
        h.append(", personalization=");
        h.append(this.personalization);
        h.append(", policies=");
        h.append(this.policies);
        h.append(", itemDetails=");
        h.append(this.itemDetails);
        h.append(", priceMessaging=");
        h.append(this.priceMessaging);
        h.append(", productionPartners=");
        h.append(this.productionPartners);
        h.append(", promoMessage=");
        h.append(this.promoMessage);
        h.append(", recentListings=");
        h.append(this.recentListings);
        h.append(", relatedListings=");
        h.append(this.relatedListings);
        h.append(", seller=");
        h.append(this.seller);
        h.append(", sellerDetails=");
        h.append(this.sellerDetails);
        h.append(", shipping=");
        h.append(this.shipping);
        h.append(", shippingStandardOption=");
        h.append(this.shippingStandardOption);
        h.append(", shop=");
        h.append(this.shop);
        h.append(", shopOwners=");
        h.append(this.shopOwners);
        h.append(", shopRating=");
        h.append(this.shopRating);
        h.append(", shopReviews=");
        h.append(this.shopReviews);
        h.append(", reviews=");
        h.append(this.reviews);
        h.append(", shopSections=");
        h.append(this.shopSections);
        h.append(", singleListingCheckout=");
        h.append(this.singleListingCheckout);
        h.append(", structuredPolicies=");
        h.append(this.structuredPolicies);
        h.append(", listingLevelReturnPolicies=");
        h.append(this.listingLevelReturnPolicies);
        h.append(", shouldUseListingLevelReturnPolicies=");
        h.append(this.shouldUseListingLevelReturnPolicies);
        h.append(", sustainability=");
        h.append(this.sustainability);
        h.append(", transparentPriceMessage=");
        h.append(this.transparentPriceMessage);
        h.append(", variations=");
        h.append(this.variations);
        h.append(", reviewImages=");
        h.append(this.reviewImages);
        h.append(", reviewVideos=");
        h.append(this.reviewVideos);
        h.append(", variationImages=");
        h.append(this.variationImages);
        h.append(", shouldPushToCart=");
        h.append(this.shouldPushToCart);
        h.append(", recommendations=");
        h.append(this.recommendations);
        h.append(", listingVideo=");
        h.append(this.listingVideo);
        h.append(", productSafetyNotice=");
        h.append(this.productSafetyNotice);
        h.append(", visuallySimilarApiPath=");
        h.append(this.visuallySimilarApiPath);
        h.append(", mmxRequestUuidMap=");
        h.append(this.mmxRequestUuidMap);
        h.append(", isShopFavorited=");
        h.append(this.isShopFavorited);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ListingFetch(com.etsy.android.lib.models.apiv3.listing.ListingDetailedFreeShipping r56, java.util.List r57, java.util.List r58, com.etsy.android.lib.models.apiv3.listing.ListingGiftInfo r59, java.lang.Boolean r60, com.etsy.android.lib.models.apiv3.listing.Listing r61, com.etsy.android.lib.models.apiv3.listing.ListingCard r62, java.util.List r63, com.etsy.android.lib.models.apiv3.listing.Nudge r64, com.etsy.android.lib.models.apiv3.listing.EstimatedDeliveryDateNudge r65, com.etsy.android.lib.models.apiv3.listing.ListingReviewsAggregateRating r66, com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r67, java.util.List r68, com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r69, java.util.List r70, com.etsy.android.lib.models.apiv3.listing.ListingPersonalization r71, com.etsy.android.lib.models.apiv3.listing.ShopsPolicy r72, java.util.List r73, com.etsy.android.lib.models.apiv3.listing.PriceMessaging r74, java.util.List r75, com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage r76, java.util.List r77, java.util.List r78, com.etsy.android.lib.models.apiv3.listing.User r79, com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails r80, com.etsy.android.lib.models.apiv3.listing.Shipping r81, com.etsy.android.lib.models.apiv3.listing.ShippingOption r82, com.etsy.android.lib.models.apiv3.listing.Shop r83, java.util.List r84, com.etsy.android.lib.models.apiv3.listing.ShopRating r85, java.util.List r86, com.etsy.android.lib.models.apiv3.listing.Reviews r87, java.util.List r88, com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout r89, com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies r90, com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies r91, java.lang.Boolean r92, com.etsy.android.lib.models.apiv3.listing.ListingSustainabilitySignals r93, java.lang.String r94, java.util.List r95, java.util.List r96, java.util.List r97, java.util.Map r98, java.lang.Boolean r99, com.etsy.android.lib.models.apiv3.sdl.Page r100, com.etsy.android.lib.models.apiv3.listing.ListingVideo r101, com.etsy.android.lib.models.apiv3.listing.ProductSafetyNotice r102, java.lang.String r103, java.util.Map r104, java.lang.Boolean r105, int r106, int r107, kotlin.jvm.internal.DefaultConstructorMarker r108) {
        /*
            r55 = this;
            r0 = r106
            r1 = r107
            r2 = r0 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r5 = r3
            goto L_0x000d
        L_0x000b:
            r5 = r56
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0013
            r6 = r3
            goto L_0x0015
        L_0x0013:
            r6 = r57
        L_0x0015:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x001b
            r7 = r3
            goto L_0x001d
        L_0x001b:
            r7 = r58
        L_0x001d:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0023
            r8 = r3
            goto L_0x0025
        L_0x0023:
            r8 = r59
        L_0x0025:
            r2 = r0 & 16
            if (r2 == 0) goto L_0x002b
            r9 = r3
            goto L_0x002d
        L_0x002b:
            r9 = r60
        L_0x002d:
            r2 = r0 & 64
            if (r2 == 0) goto L_0x0033
            r11 = r3
            goto L_0x0035
        L_0x0033:
            r11 = r62
        L_0x0035:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x003b
            r12 = r3
            goto L_0x003d
        L_0x003b:
            r12 = r63
        L_0x003d:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0043
            r13 = r3
            goto L_0x0045
        L_0x0043:
            r13 = r64
        L_0x0045:
            r2 = r0 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x004b
            r14 = r3
            goto L_0x004d
        L_0x004b:
            r14 = r65
        L_0x004d:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0053
            r15 = r3
            goto L_0x0055
        L_0x0053:
            r15 = r66
        L_0x0055:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x005c
            r16 = r3
            goto L_0x005e
        L_0x005c:
            r16 = r67
        L_0x005e:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0065
            r17 = r3
            goto L_0x0067
        L_0x0065:
            r17 = r68
        L_0x0067:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x006e
            r18 = r3
            goto L_0x0070
        L_0x006e:
            r18 = r69
        L_0x0070:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0077
            r19 = r3
            goto L_0x0079
        L_0x0077:
            r19 = r70
        L_0x0079:
            r2 = 32768(0x8000, float:4.5918E-41)
            r4 = r0 & r2
            if (r4 == 0) goto L_0x0083
            r20 = r3
            goto L_0x0085
        L_0x0083:
            r20 = r71
        L_0x0085:
            r4 = 65536(0x10000, float:9.18355E-41)
            r10 = r0 & r4
            if (r10 == 0) goto L_0x008e
            r21 = r3
            goto L_0x0090
        L_0x008e:
            r21 = r72
        L_0x0090:
            r10 = 131072(0x20000, float:1.83671E-40)
            r22 = r0 & r10
            if (r22 == 0) goto L_0x0099
            r22 = r3
            goto L_0x009b
        L_0x0099:
            r22 = r73
        L_0x009b:
            r23 = 262144(0x40000, float:3.67342E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00a4
            r23 = r3
            goto L_0x00a6
        L_0x00a4:
            r23 = r74
        L_0x00a6:
            r24 = 524288(0x80000, float:7.34684E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00af
            r24 = r3
            goto L_0x00b1
        L_0x00af:
            r24 = r75
        L_0x00b1:
            r25 = 1048576(0x100000, float:1.469368E-39)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00ba
            r25 = r3
            goto L_0x00bc
        L_0x00ba:
            r25 = r76
        L_0x00bc:
            r26 = 2097152(0x200000, float:2.938736E-39)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00c5
            r26 = r3
            goto L_0x00c7
        L_0x00c5:
            r26 = r77
        L_0x00c7:
            r27 = 4194304(0x400000, float:5.877472E-39)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00d0
            r27 = r3
            goto L_0x00d2
        L_0x00d0:
            r27 = r78
        L_0x00d2:
            r28 = 8388608(0x800000, float:1.17549435E-38)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x00db
            r28 = r3
            goto L_0x00dd
        L_0x00db:
            r28 = r79
        L_0x00dd:
            r29 = 16777216(0x1000000, float:2.3509887E-38)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x00e6
            r29 = r3
            goto L_0x00e8
        L_0x00e6:
            r29 = r80
        L_0x00e8:
            r30 = 33554432(0x2000000, float:9.403955E-38)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x00f1
            r30 = r3
            goto L_0x00f3
        L_0x00f1:
            r30 = r81
        L_0x00f3:
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x00fc
            r31 = r3
            goto L_0x00fe
        L_0x00fc:
            r31 = r82
        L_0x00fe:
            r32 = 134217728(0x8000000, float:3.85186E-34)
            r32 = r0 & r32
            if (r32 == 0) goto L_0x0107
            r32 = r3
            goto L_0x0109
        L_0x0107:
            r32 = r83
        L_0x0109:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
            r33 = r0 & r33
            if (r33 == 0) goto L_0x0112
            r33 = r3
            goto L_0x0114
        L_0x0112:
            r33 = r84
        L_0x0114:
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            r34 = r0 & r34
            if (r34 == 0) goto L_0x011d
            r34 = r3
            goto L_0x011f
        L_0x011d:
            r34 = r85
        L_0x011f:
            r35 = 1073741824(0x40000000, float:2.0)
            r35 = r0 & r35
            if (r35 == 0) goto L_0x0128
            r35 = r3
            goto L_0x012a
        L_0x0128:
            r35 = r86
        L_0x012a:
            r36 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r36
            if (r0 == 0) goto L_0x0133
            r36 = r3
            goto L_0x0135
        L_0x0133:
            r36 = r87
        L_0x0135:
            r0 = r1 & 1
            if (r0 == 0) goto L_0x013c
            r37 = r3
            goto L_0x013e
        L_0x013c:
            r37 = r88
        L_0x013e:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0145
            r38 = r3
            goto L_0x0147
        L_0x0145:
            r38 = r89
        L_0x0147:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x014e
            r39 = r3
            goto L_0x0150
        L_0x014e:
            r39 = r90
        L_0x0150:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0157
            r40 = r3
            goto L_0x0159
        L_0x0157:
            r40 = r91
        L_0x0159:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0160
            r41 = r3
            goto L_0x0162
        L_0x0160:
            r41 = r92
        L_0x0162:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0169
            r42 = r3
            goto L_0x016b
        L_0x0169:
            r42 = r93
        L_0x016b:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0172
            r43 = r3
            goto L_0x0174
        L_0x0172:
            r43 = r94
        L_0x0174:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x017b
            r44 = r3
            goto L_0x017d
        L_0x017b:
            r44 = r95
        L_0x017d:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0184
            r45 = r3
            goto L_0x0186
        L_0x0184:
            r45 = r96
        L_0x0186:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x018d
            r46 = r3
            goto L_0x018f
        L_0x018d:
            r46 = r97
        L_0x018f:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0196
            r47 = r3
            goto L_0x0198
        L_0x0196:
            r47 = r98
        L_0x0198:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01a1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r48 = r0
            goto L_0x01a3
        L_0x01a1:
            r48 = r99
        L_0x01a3:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01aa
            r49 = r3
            goto L_0x01ac
        L_0x01aa:
            r49 = r100
        L_0x01ac:
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x01b3
            r50 = r3
            goto L_0x01b5
        L_0x01b3:
            r50 = r101
        L_0x01b5:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x01bc
            r51 = r3
            goto L_0x01be
        L_0x01bc:
            r51 = r102
        L_0x01be:
            r0 = r1 & r2
            if (r0 == 0) goto L_0x01c5
            r52 = r3
            goto L_0x01c7
        L_0x01c5:
            r52 = r103
        L_0x01c7:
            r0 = r1 & r4
            if (r0 == 0) goto L_0x01ce
            r53 = r3
            goto L_0x01d0
        L_0x01ce:
            r53 = r104
        L_0x01d0:
            r0 = r1 & r10
            if (r0 == 0) goto L_0x01d7
            r54 = r3
            goto L_0x01d9
        L_0x01d7:
            r54 = r105
        L_0x01d9:
            r4 = r55
            r10 = r61
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.listing.ListingFetch.<init>(com.etsy.android.lib.models.apiv3.listing.ListingDetailedFreeShipping, java.util.List, java.util.List, com.etsy.android.lib.models.apiv3.listing.ListingGiftInfo, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.Listing, com.etsy.android.lib.models.apiv3.listing.ListingCard, java.util.List, com.etsy.android.lib.models.apiv3.listing.Nudge, com.etsy.android.lib.models.apiv3.listing.EstimatedDeliveryDateNudge, com.etsy.android.lib.models.apiv3.listing.ListingReviewsAggregateRating, com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData, java.util.List, com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext, java.util.List, com.etsy.android.lib.models.apiv3.listing.ListingPersonalization, com.etsy.android.lib.models.apiv3.listing.ShopsPolicy, java.util.List, com.etsy.android.lib.models.apiv3.listing.PriceMessaging, java.util.List, com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage, java.util.List, java.util.List, com.etsy.android.lib.models.apiv3.listing.User, com.etsy.android.lib.models.apiv3.listing.ShopsSellerPersonalDetails, com.etsy.android.lib.models.apiv3.listing.Shipping, com.etsy.android.lib.models.apiv3.listing.ShippingOption, com.etsy.android.lib.models.apiv3.listing.Shop, java.util.List, com.etsy.android.lib.models.apiv3.listing.ShopRating, java.util.List, com.etsy.android.lib.models.apiv3.listing.Reviews, java.util.List, com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout, com.etsy.android.lib.models.apiv3.listing.ShopStructuredPolicies, com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies, java.lang.Boolean, com.etsy.android.lib.models.apiv3.listing.ListingSustainabilitySignals, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.Map, java.lang.Boolean, com.etsy.android.lib.models.apiv3.sdl.Page, com.etsy.android.lib.models.apiv3.listing.ListingVideo, com.etsy.android.lib.models.apiv3.listing.ProductSafetyNotice, java.lang.String, java.util.Map, java.lang.Boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
