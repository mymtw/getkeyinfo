package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.sdl.Page;
import com.google.android.gms.common.api.Api;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingFetchJsonAdapter extends JsonAdapter<ListingFetch> {
    public static final int $stable = 8;
    private volatile Constructor<ListingFetch> constructorRef;
    private final JsonAdapter<Listing> listingAdapter;
    private final JsonAdapter<AppsInventoryAddToCartContext> nullableAppsInventoryAddToCartContextAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<EstimatedDeliveryDateNudge> nullableEstimatedDeliveryDateNudgeAdapter;
    private final JsonAdapter<List<ItemDetail>> nullableListOfItemDetailAdapter;
    private final JsonAdapter<List<ListingCard>> nullableListOfListingCardAdapter;
    private final JsonAdapter<List<ListingImage>> nullableListOfListingImageAdapter;
    private final JsonAdapter<List<ReviewImage>> nullableListOfReviewImageAdapter;
    private final JsonAdapter<List<ReviewVideo>> nullableListOfReviewVideoAdapter;
    private final JsonAdapter<List<ShopReview>> nullableListOfShopReviewAdapter;
    private final JsonAdapter<List<ShopSection>> nullableListOfShopSectionAdapter;
    private final JsonAdapter<List<ShopsAboutMember>> nullableListOfShopsAboutMemberAdapter;
    private final JsonAdapter<List<ShopsFrequentlyAskedQuestion>> nullableListOfShopsFrequentlyAskedQuestionAdapter;
    private final JsonAdapter<List<ShopsManufacturer>> nullableListOfShopsManufacturerAdapter;
    private final JsonAdapter<List<ShopsProductionPartner>> nullableListOfShopsProductionPartnerAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<List<Variation>> nullableListOfVariationAdapter;
    private final JsonAdapter<ListingCard> nullableListingCardAdapter;
    private final JsonAdapter<ListingDetailedFreeShipping> nullableListingDetailedFreeShippingAdapter;
    private final JsonAdapter<ListingExpressCheckout> nullableListingExpressCheckoutAdapter;
    private final JsonAdapter<ListingGiftInfo> nullableListingGiftInfoAdapter;
    private final JsonAdapter<ListingLevelReturnPolicies> nullableListingLevelReturnPoliciesAdapter;
    private final JsonAdapter<ListingMachineTranslationData> nullableListingMachineTranslationDataAdapter;
    private final JsonAdapter<ListingPersonalization> nullableListingPersonalizationAdapter;
    private final JsonAdapter<ListingReviewsAggregateRating> nullableListingReviewsAggregateRatingAdapter;
    private final JsonAdapter<ListingSustainabilitySignals> nullableListingSustainabilitySignalsAdapter;
    private final JsonAdapter<ListingVideo> nullableListingVideoAdapter;
    private final JsonAdapter<Map<Long, Long>> nullableMapOfLongLongAtEmptyArrayToMapAdapter;
    private final JsonAdapter<Map<String, List<Integer>>> nullableMapOfStringListOfIntAdapter;
    private final JsonAdapter<Nudge> nullableNudgeAdapter;
    private final JsonAdapter<Page> nullablePageAdapter;
    private final JsonAdapter<PriceMessaging> nullablePriceMessagingAdapter;
    private final JsonAdapter<ProductSafetyNotice> nullableProductSafetyNoticeAdapter;
    private final JsonAdapter<Reviews> nullableReviewsAdapter;
    private final JsonAdapter<SellerMarketingBOEMessage> nullableSellerMarketingBOEMessageAdapter;
    private final JsonAdapter<Shipping> nullableShippingAdapter;
    private final JsonAdapter<ShippingOption> nullableShippingOptionAdapter;
    private final JsonAdapter<Shop> nullableShopAdapter;
    private final JsonAdapter<ShopRating> nullableShopRatingAdapter;
    private final JsonAdapter<ShopStructuredPolicies> nullableShopStructuredPoliciesAdapter;
    private final JsonAdapter<ShopsPolicy> nullableShopsPolicyAdapter;
    private final JsonAdapter<ShopsSellerPersonalDetails> nullableShopsSellerPersonalDetailsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<User> nullableUserAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("detailed_free_shipping", "faqs", "featured_listings", ResponseConstants.GIFT_INFO, "has_more_related_listings", ResponseConstants.LISTING, "listing_card", ResponseConstants.LISTING_IMAGES, "listing_nudge", ResponseConstants.EDD_NUDGE, "listing_rating", "machine_translation", "manufacturers", ResponseConstants.OFFERINGS, ResponseConstants.OVERVIEW, ResponseConstants.PERSONALIZATION, ResponseConstants.POLICIES, "item_details", "price_messaging", "production_partners", "promo_message", "recent_listings", "related_listings", "seller", "seller_details", "shipping", "shipping_standard_option", ResponseConstants.SHOP, "shop_owners", "shop_rating", "shop_reviews", ResponseConstants.REVIEWS, "shop_sections", ResponseConstants.SINGLE_LISTING_CHECKOUT, "structured_policies", "return_policies", "use_listing_level_return_policies", "sustainability", ResponseConstants.TRANSPARENT_PRICE_MESSAGE, ResponseConstants.VARIATIONS, "review_images", "review_videos", "images_by_variation", "should_push_to_cart", "recommendations", "listing_video", "product_safety_notice", "visually_similar_api_path", "recent_listings_mmx_request_uuid_map", "is_shop_favorited");

    public ListingFetchJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<Long> cls = Long.class;
        Class<ListingCard> cls2 = ListingCard.class;
        Class<String> cls3 = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListingDetailedFreeShippingAdapter = yVar2.mo68558c(ListingDetailedFreeShipping.class, emptySet, "detailedFreeShipping");
        this.nullableListOfShopsFrequentlyAskedQuestionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopsFrequentlyAskedQuestion.class), emptySet, "faqs");
        this.nullableListOfListingCardAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls2), emptySet, "featuredListings");
        this.nullableListingGiftInfoAdapter = yVar2.mo68558c(ListingGiftInfo.class, emptySet, "giftInfo");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "hasMoreRelatedListings");
        this.listingAdapter = yVar2.mo68558c(Listing.class, emptySet, ResponseConstants.LISTING);
        this.nullableListingCardAdapter = yVar2.mo68558c(cls2, emptySet, ListingCard.LISTING_CARD_ITEM_TYPE);
        this.nullableListOfListingImageAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ListingImage.class), emptySet, "listingImages");
        this.nullableNudgeAdapter = yVar2.mo68558c(Nudge.class, emptySet, "listingNudge");
        this.nullableEstimatedDeliveryDateNudgeAdapter = yVar2.mo68558c(EstimatedDeliveryDateNudge.class, emptySet, "estimatedDeliveryDateNudge");
        this.nullableListingReviewsAggregateRatingAdapter = yVar2.mo68558c(ListingReviewsAggregateRating.class, emptySet, "listingRating");
        this.nullableListingMachineTranslationDataAdapter = yVar2.mo68558c(ListingMachineTranslationData.class, emptySet, "machineTranslation");
        this.nullableListOfShopsManufacturerAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopsManufacturer.class), emptySet, "manufacturers");
        this.nullableAppsInventoryAddToCartContextAdapter = yVar2.mo68558c(AppsInventoryAddToCartContext.class, emptySet, ResponseConstants.OFFERINGS);
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls3), emptySet, ResponseConstants.OVERVIEW);
        this.nullableListingPersonalizationAdapter = yVar2.mo68558c(ListingPersonalization.class, emptySet, ResponseConstants.PERSONALIZATION);
        this.nullableShopsPolicyAdapter = yVar2.mo68558c(ShopsPolicy.class, emptySet, ResponseConstants.POLICIES);
        this.nullableListOfItemDetailAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ItemDetail.class), emptySet, "itemDetails");
        this.nullablePriceMessagingAdapter = yVar2.mo68558c(PriceMessaging.class, emptySet, "priceMessaging");
        this.nullableListOfShopsProductionPartnerAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopsProductionPartner.class), emptySet, "productionPartners");
        this.nullableSellerMarketingBOEMessageAdapter = yVar2.mo68558c(SellerMarketingBOEMessage.class, emptySet, "promoMessage");
        this.nullableUserAdapter = yVar2.mo68558c(User.class, emptySet, "seller");
        this.nullableShopsSellerPersonalDetailsAdapter = yVar2.mo68558c(ShopsSellerPersonalDetails.class, emptySet, "sellerDetails");
        this.nullableShippingAdapter = yVar2.mo68558c(Shipping.class, emptySet, "shipping");
        this.nullableShippingOptionAdapter = yVar2.mo68558c(ShippingOption.class, emptySet, "shippingStandardOption");
        this.nullableShopAdapter = yVar2.mo68558c(Shop.class, emptySet, ResponseConstants.SHOP);
        this.nullableListOfShopsAboutMemberAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopsAboutMember.class), emptySet, "shopOwners");
        this.nullableShopRatingAdapter = yVar2.mo68558c(ShopRating.class, emptySet, "shopRating");
        this.nullableListOfShopReviewAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopReview.class), emptySet, "shopReviews");
        this.nullableReviewsAdapter = yVar2.mo68558c(Reviews.class, emptySet, ResponseConstants.REVIEWS);
        this.nullableListOfShopSectionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopSection.class), emptySet, "shopSections");
        this.nullableListingExpressCheckoutAdapter = yVar2.mo68558c(ListingExpressCheckout.class, emptySet, "singleListingCheckout");
        this.nullableShopStructuredPoliciesAdapter = yVar2.mo68558c(ShopStructuredPolicies.class, emptySet, "structuredPolicies");
        this.nullableListingLevelReturnPoliciesAdapter = yVar2.mo68558c(ListingLevelReturnPolicies.class, emptySet, "listingLevelReturnPolicies");
        this.nullableListingSustainabilitySignalsAdapter = yVar2.mo68558c(ListingSustainabilitySignals.class, emptySet, "sustainability");
        this.nullableStringAdapter = yVar2.mo68558c(cls3, emptySet, "transparentPriceMessage");
        this.nullableListOfVariationAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Variation.class), emptySet, ResponseConstants.VARIATIONS);
        this.nullableListOfReviewImageAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ReviewImage.class), emptySet, "reviewImages");
        this.nullableListOfReviewVideoAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ReviewVideo.class), emptySet, "reviewVideos");
        this.nullableMapOfLongLongAtEmptyArrayToMapAdapter = yVar2.mo68558c(C17387a0.m29126d(Map.class, cls, cls), C19382n.m32702C0(new C8717xe130e33d()), "variationImages");
        this.nullablePageAdapter = yVar2.mo68558c(Page.class, emptySet, "recommendations");
        this.nullableListingVideoAdapter = yVar2.mo68558c(ListingVideo.class, emptySet, "listingVideo");
        this.nullableProductSafetyNoticeAdapter = yVar2.mo68558c(ProductSafetyNotice.class, emptySet, "productSafetyNotice");
        this.nullableMapOfStringListOfIntAdapter = yVar2.mo68558c(C17387a0.m29126d(Map.class, cls3, C17387a0.m29126d(List.class, Integer.class)), emptySet, "mmxRequestUuidMap");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingFetch)";
    }

    public ListingFetch fromJson(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i2 = -1;
        int i3 = -1;
        ListingDetailedFreeShipping listingDetailedFreeShipping = null;
        List list = null;
        List list2 = null;
        ListingGiftInfo listingGiftInfo = null;
        Boolean bool = null;
        Listing listing = null;
        ListingCard listingCard = null;
        List list3 = null;
        Nudge nudge = null;
        EstimatedDeliveryDateNudge estimatedDeliveryDateNudge = null;
        ListingReviewsAggregateRating listingReviewsAggregateRating = null;
        ListingMachineTranslationData listingMachineTranslationData = null;
        List list4 = null;
        AppsInventoryAddToCartContext appsInventoryAddToCartContext = null;
        List list5 = null;
        ListingPersonalization listingPersonalization = null;
        ShopsPolicy shopsPolicy = null;
        List list6 = null;
        PriceMessaging priceMessaging = null;
        List list7 = null;
        SellerMarketingBOEMessage sellerMarketingBOEMessage = null;
        List list8 = null;
        List list9 = null;
        User user = null;
        ShopsSellerPersonalDetails shopsSellerPersonalDetails = null;
        Shipping shipping = null;
        ShippingOption shippingOption = null;
        Shop shop = null;
        List list10 = null;
        ShopRating shopRating = null;
        List list11 = null;
        Reviews reviews = null;
        List list12 = null;
        ListingExpressCheckout listingExpressCheckout = null;
        ShopStructuredPolicies shopStructuredPolicies = null;
        ListingLevelReturnPolicies listingLevelReturnPolicies = null;
        Boolean bool2 = null;
        ListingSustainabilitySignals listingSustainabilitySignals = null;
        String str = null;
        List list13 = null;
        List list14 = null;
        List list15 = null;
        Map map = null;
        Boolean bool3 = null;
        Page page = null;
        ListingVideo listingVideo = null;
        ProductSafetyNotice productSafetyNotice = null;
        String str2 = null;
        Map map2 = null;
        Boolean bool4 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    listingDetailedFreeShipping = this.nullableListingDetailedFreeShippingAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    continue;
                case 1:
                    list = this.nullableListOfShopsFrequentlyAskedQuestionAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    continue;
                case 2:
                    list2 = this.nullableListOfListingCardAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    continue;
                case 3:
                    listingGiftInfo = this.nullableListingGiftInfoAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    continue;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    listing = this.listingAdapter.fromJson(jsonReader2);
                    if (listing != null) {
                        continue;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.LISTING, ResponseConstants.LISTING, jsonReader2);
                    }
                case 6:
                    listingCard = this.nullableListingCardAdapter.fromJson(jsonReader2);
                    i2 &= -65;
                    continue;
                case 7:
                    list3 = this.nullableListOfListingImageAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    nudge = this.nullableNudgeAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    continue;
                case 9:
                    estimatedDeliveryDateNudge = this.nullableEstimatedDeliveryDateNudgeAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    listingReviewsAggregateRating = this.nullableListingReviewsAggregateRatingAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    continue;
                case 11:
                    listingMachineTranslationData = this.nullableListingMachineTranslationDataAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 12:
                    list4 = this.nullableListOfShopsManufacturerAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 13:
                    appsInventoryAddToCartContext = this.nullableAppsInventoryAddToCartContextAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 14:
                    list5 = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 15:
                    listingPersonalization = this.nullableListingPersonalizationAdapter.fromJson(jsonReader2);
                    i2 &= -32769;
                    continue;
                case 16:
                    shopsPolicy = this.nullableShopsPolicyAdapter.fromJson(jsonReader2);
                    i2 &= -65537;
                    continue;
                case 17:
                    list6 = this.nullableListOfItemDetailAdapter.fromJson(jsonReader2);
                    i2 &= -131073;
                    continue;
                case 18:
                    priceMessaging = this.nullablePriceMessagingAdapter.fromJson(jsonReader2);
                    i = -262145;
                    break;
                case 19:
                    list7 = this.nullableListOfShopsProductionPartnerAdapter.fromJson(jsonReader2);
                    i = -524289;
                    break;
                case 20:
                    sellerMarketingBOEMessage = this.nullableSellerMarketingBOEMessageAdapter.fromJson(jsonReader2);
                    i = -1048577;
                    break;
                case 21:
                    list8 = this.nullableListOfListingCardAdapter.fromJson(jsonReader2);
                    i = -2097153;
                    break;
                case 22:
                    list9 = this.nullableListOfListingCardAdapter.fromJson(jsonReader2);
                    i = -4194305;
                    break;
                case 23:
                    user = this.nullableUserAdapter.fromJson(jsonReader2);
                    i = -8388609;
                    break;
                case 24:
                    shopsSellerPersonalDetails = this.nullableShopsSellerPersonalDetailsAdapter.fromJson(jsonReader2);
                    i = -16777217;
                    break;
                case 25:
                    shipping = this.nullableShippingAdapter.fromJson(jsonReader2);
                    i = -33554433;
                    break;
                case 26:
                    shippingOption = this.nullableShippingOptionAdapter.fromJson(jsonReader2);
                    i = -67108865;
                    break;
                case 27:
                    shop = this.nullableShopAdapter.fromJson(jsonReader2);
                    i = -134217729;
                    break;
                case 28:
                    list10 = this.nullableListOfShopsAboutMemberAdapter.fromJson(jsonReader2);
                    i = -268435457;
                    break;
                case 29:
                    shopRating = this.nullableShopRatingAdapter.fromJson(jsonReader2);
                    i = -536870913;
                    break;
                case 30:
                    list11 = this.nullableListOfShopReviewAdapter.fromJson(jsonReader2);
                    i = -1073741825;
                    break;
                case 31:
                    reviews = this.nullableReviewsAdapter.fromJson(jsonReader2);
                    i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    break;
                case 32:
                    list12 = this.nullableListOfShopSectionAdapter.fromJson(jsonReader2);
                    i3 &= -2;
                    continue;
                case 33:
                    listingExpressCheckout = this.nullableListingExpressCheckoutAdapter.fromJson(jsonReader2);
                    i3 &= -3;
                    continue;
                case 34:
                    shopStructuredPolicies = this.nullableShopStructuredPoliciesAdapter.fromJson(jsonReader2);
                    i3 &= -5;
                    continue;
                case 35:
                    listingLevelReturnPolicies = this.nullableListingLevelReturnPoliciesAdapter.fromJson(jsonReader2);
                    i3 &= -9;
                    continue;
                case 36:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i3 &= -17;
                    continue;
                case 37:
                    listingSustainabilitySignals = this.nullableListingSustainabilitySignalsAdapter.fromJson(jsonReader2);
                    i3 &= -33;
                    continue;
                case 38:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i3 &= -65;
                    continue;
                case 39:
                    list13 = this.nullableListOfVariationAdapter.fromJson(jsonReader2);
                    i3 &= -129;
                    continue;
                case 40:
                    list14 = this.nullableListOfReviewImageAdapter.fromJson(jsonReader2);
                    i3 &= -257;
                    continue;
                case 41:
                    list15 = this.nullableListOfReviewVideoAdapter.fromJson(jsonReader2);
                    i3 &= -513;
                    continue;
                case 42:
                    map = this.nullableMapOfLongLongAtEmptyArrayToMapAdapter.fromJson(jsonReader2);
                    i3 &= -1025;
                    continue;
                case 43:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i3 &= -2049;
                    continue;
                case 44:
                    page = this.nullablePageAdapter.fromJson(jsonReader2);
                    i3 &= -4097;
                    continue;
                case 45:
                    listingVideo = this.nullableListingVideoAdapter.fromJson(jsonReader2);
                    i3 &= -8193;
                    continue;
                case 46:
                    productSafetyNotice = this.nullableProductSafetyNoticeAdapter.fromJson(jsonReader2);
                    i3 &= -16385;
                    continue;
                case 47:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i3 &= -32769;
                    continue;
                case 48:
                    map2 = this.nullableMapOfStringListOfIntAdapter.fromJson(jsonReader2);
                    i3 &= -65537;
                    continue;
                case 49:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i3 &= -131073;
                    continue;
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 != 32 || i3 != -262144) {
            Constructor<ListingFetch> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls2 = Integer.TYPE;
                constructor = ListingFetch.class.getDeclaredConstructor(new Class[]{ListingDetailedFreeShipping.class, List.class, List.class, ListingGiftInfo.class, cls, Listing.class, ListingCard.class, List.class, Nudge.class, EstimatedDeliveryDateNudge.class, ListingReviewsAggregateRating.class, ListingMachineTranslationData.class, List.class, AppsInventoryAddToCartContext.class, List.class, ListingPersonalization.class, ShopsPolicy.class, List.class, PriceMessaging.class, List.class, SellerMarketingBOEMessage.class, List.class, List.class, User.class, ShopsSellerPersonalDetails.class, Shipping.class, ShippingOption.class, Shop.class, List.class, ShopRating.class, List.class, Reviews.class, List.class, ListingExpressCheckout.class, ShopStructuredPolicies.class, ListingLevelReturnPolicies.class, cls, ListingSustainabilitySignals.class, String.class, List.class, List.class, List.class, Map.class, cls, Page.class, ListingVideo.class, ProductSafetyNotice.class, String.class, Map.class, cls, cls2, cls2, C18215a.f39928c});
                this.constructorRef = constructor;
                C19394m mVar = C19394m.f43287a;
                C19383o.m32796f(constructor, "ListingFetch::class.java…his.constructorRef = it }");
            }
            Object[] objArr = new Object[53];
            objArr[0] = listingDetailedFreeShipping;
            objArr[1] = list;
            objArr[2] = list2;
            objArr[3] = listingGiftInfo;
            objArr[4] = bool;
            if (listing != null) {
                objArr[5] = listing;
                objArr[6] = listingCard;
                objArr[7] = list3;
                objArr[8] = nudge;
                objArr[9] = estimatedDeliveryDateNudge;
                objArr[10] = listingReviewsAggregateRating;
                objArr[11] = listingMachineTranslationData;
                objArr[12] = list4;
                objArr[13] = appsInventoryAddToCartContext;
                objArr[14] = list5;
                objArr[15] = listingPersonalization;
                objArr[16] = shopsPolicy;
                objArr[17] = list6;
                objArr[18] = priceMessaging;
                objArr[19] = list7;
                objArr[20] = sellerMarketingBOEMessage;
                objArr[21] = list8;
                objArr[22] = list9;
                objArr[23] = user;
                objArr[24] = shopsSellerPersonalDetails;
                objArr[25] = shipping;
                objArr[26] = shippingOption;
                objArr[27] = shop;
                objArr[28] = list10;
                objArr[29] = shopRating;
                objArr[30] = list11;
                objArr[31] = reviews;
                objArr[32] = list12;
                objArr[33] = listingExpressCheckout;
                objArr[34] = shopStructuredPolicies;
                objArr[35] = listingLevelReturnPolicies;
                objArr[36] = bool2;
                objArr[37] = listingSustainabilitySignals;
                objArr[38] = str;
                objArr[39] = list13;
                objArr[40] = list14;
                objArr[41] = list15;
                objArr[42] = map;
                objArr[43] = bool3;
                objArr[44] = page;
                objArr[45] = listingVideo;
                objArr[46] = productSafetyNotice;
                objArr[47] = str2;
                objArr[48] = map2;
                objArr[49] = bool4;
                objArr[50] = Integer.valueOf(i2);
                objArr[51] = Integer.valueOf(i3);
                objArr[52] = null;
                ListingFetch newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g(ResponseConstants.LISTING, ResponseConstants.LISTING, jsonReader);
        } else if (listing != null) {
            return new ListingFetch(listingDetailedFreeShipping, list, list2, listingGiftInfo, bool, listing, listingCard, list3, nudge, estimatedDeliveryDateNudge, listingReviewsAggregateRating, listingMachineTranslationData, list4, appsInventoryAddToCartContext, list5, listingPersonalization, shopsPolicy, list6, priceMessaging, list7, sellerMarketingBOEMessage, list8, list9, user, shopsSellerPersonalDetails, shipping, shippingOption, shop, list10, shopRating, list11, reviews, list12, listingExpressCheckout, shopStructuredPolicies, listingLevelReturnPolicies, bool2, listingSustainabilitySignals, str, list13, list14, list15, map, bool3, page, listingVideo, productSafetyNotice, str2, map2, bool4);
        } else {
            throw C18215a.m30728g(ResponseConstants.LISTING, ResponseConstants.LISTING, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, ListingFetch listingFetch) {
        C19383o.m32797g(wVar, "writer");
        if (listingFetch != null) {
            wVar.mo68522b();
            wVar.mo68529h("detailed_free_shipping");
            this.nullableListingDetailedFreeShippingAdapter.toJson(wVar, listingFetch.getDetailedFreeShipping());
            wVar.mo68529h("faqs");
            this.nullableListOfShopsFrequentlyAskedQuestionAdapter.toJson(wVar, listingFetch.getFaqs());
            wVar.mo68529h("featured_listings");
            this.nullableListOfListingCardAdapter.toJson(wVar, listingFetch.getFeaturedListings());
            wVar.mo68529h(ResponseConstants.GIFT_INFO);
            this.nullableListingGiftInfoAdapter.toJson(wVar, listingFetch.getGiftInfo());
            wVar.mo68529h("has_more_related_listings");
            this.nullableBooleanAdapter.toJson(wVar, listingFetch.getHasMoreRelatedListings());
            wVar.mo68529h(ResponseConstants.LISTING);
            this.listingAdapter.toJson(wVar, listingFetch.getListing());
            wVar.mo68529h("listing_card");
            this.nullableListingCardAdapter.toJson(wVar, listingFetch.getListingCard());
            wVar.mo68529h(ResponseConstants.LISTING_IMAGES);
            this.nullableListOfListingImageAdapter.toJson(wVar, listingFetch.getListingImages());
            wVar.mo68529h("listing_nudge");
            this.nullableNudgeAdapter.toJson(wVar, listingFetch.getListingNudge());
            wVar.mo68529h(ResponseConstants.EDD_NUDGE);
            this.nullableEstimatedDeliveryDateNudgeAdapter.toJson(wVar, listingFetch.getEstimatedDeliveryDateNudge());
            wVar.mo68529h("listing_rating");
            this.nullableListingReviewsAggregateRatingAdapter.toJson(wVar, listingFetch.getListingRating());
            wVar.mo68529h("machine_translation");
            this.nullableListingMachineTranslationDataAdapter.toJson(wVar, listingFetch.getMachineTranslation());
            wVar.mo68529h("manufacturers");
            this.nullableListOfShopsManufacturerAdapter.toJson(wVar, listingFetch.getManufacturers());
            wVar.mo68529h(ResponseConstants.OFFERINGS);
            this.nullableAppsInventoryAddToCartContextAdapter.toJson(wVar, listingFetch.getOfferings());
            wVar.mo68529h(ResponseConstants.OVERVIEW);
            this.nullableListOfStringAdapter.toJson(wVar, listingFetch.getOverview());
            wVar.mo68529h(ResponseConstants.PERSONALIZATION);
            this.nullableListingPersonalizationAdapter.toJson(wVar, listingFetch.getPersonalization());
            wVar.mo68529h(ResponseConstants.POLICIES);
            this.nullableShopsPolicyAdapter.toJson(wVar, listingFetch.getPolicies());
            wVar.mo68529h("item_details");
            this.nullableListOfItemDetailAdapter.toJson(wVar, listingFetch.getItemDetails());
            wVar.mo68529h("price_messaging");
            this.nullablePriceMessagingAdapter.toJson(wVar, listingFetch.getPriceMessaging());
            wVar.mo68529h("production_partners");
            this.nullableListOfShopsProductionPartnerAdapter.toJson(wVar, listingFetch.getProductionPartners());
            wVar.mo68529h("promo_message");
            this.nullableSellerMarketingBOEMessageAdapter.toJson(wVar, listingFetch.getPromoMessage());
            wVar.mo68529h("recent_listings");
            this.nullableListOfListingCardAdapter.toJson(wVar, listingFetch.getRecentListings());
            wVar.mo68529h("related_listings");
            this.nullableListOfListingCardAdapter.toJson(wVar, listingFetch.getRelatedListings());
            wVar.mo68529h("seller");
            this.nullableUserAdapter.toJson(wVar, listingFetch.getSeller());
            wVar.mo68529h("seller_details");
            this.nullableShopsSellerPersonalDetailsAdapter.toJson(wVar, listingFetch.getSellerDetails());
            wVar.mo68529h("shipping");
            this.nullableShippingAdapter.toJson(wVar, listingFetch.getShipping());
            wVar.mo68529h("shipping_standard_option");
            this.nullableShippingOptionAdapter.toJson(wVar, listingFetch.getShippingStandardOption());
            wVar.mo68529h(ResponseConstants.SHOP);
            this.nullableShopAdapter.toJson(wVar, listingFetch.getShop());
            wVar.mo68529h("shop_owners");
            this.nullableListOfShopsAboutMemberAdapter.toJson(wVar, listingFetch.getShopOwners());
            wVar.mo68529h("shop_rating");
            this.nullableShopRatingAdapter.toJson(wVar, listingFetch.getShopRating());
            wVar.mo68529h("shop_reviews");
            this.nullableListOfShopReviewAdapter.toJson(wVar, listingFetch.getShopReviews());
            wVar.mo68529h(ResponseConstants.REVIEWS);
            this.nullableReviewsAdapter.toJson(wVar, listingFetch.getReviews());
            wVar.mo68529h("shop_sections");
            this.nullableListOfShopSectionAdapter.toJson(wVar, listingFetch.getShopSections());
            wVar.mo68529h(ResponseConstants.SINGLE_LISTING_CHECKOUT);
            this.nullableListingExpressCheckoutAdapter.toJson(wVar, listingFetch.getSingleListingCheckout());
            wVar.mo68529h("structured_policies");
            this.nullableShopStructuredPoliciesAdapter.toJson(wVar, listingFetch.getStructuredPolicies());
            wVar.mo68529h("return_policies");
            this.nullableListingLevelReturnPoliciesAdapter.toJson(wVar, listingFetch.getListingLevelReturnPolicies());
            wVar.mo68529h("use_listing_level_return_policies");
            this.nullableBooleanAdapter.toJson(wVar, listingFetch.getShouldUseListingLevelReturnPolicies());
            wVar.mo68529h("sustainability");
            this.nullableListingSustainabilitySignalsAdapter.toJson(wVar, listingFetch.getSustainability());
            wVar.mo68529h(ResponseConstants.TRANSPARENT_PRICE_MESSAGE);
            this.nullableStringAdapter.toJson(wVar, listingFetch.getTransparentPriceMessage());
            wVar.mo68529h(ResponseConstants.VARIATIONS);
            this.nullableListOfVariationAdapter.toJson(wVar, listingFetch.getVariations());
            wVar.mo68529h("review_images");
            this.nullableListOfReviewImageAdapter.toJson(wVar, listingFetch.getReviewImages());
            wVar.mo68529h("review_videos");
            this.nullableListOfReviewVideoAdapter.toJson(wVar, listingFetch.getReviewVideos());
            wVar.mo68529h("images_by_variation");
            this.nullableMapOfLongLongAtEmptyArrayToMapAdapter.toJson(wVar, listingFetch.getVariationImages());
            wVar.mo68529h("should_push_to_cart");
            this.nullableBooleanAdapter.toJson(wVar, listingFetch.getShouldPushToCart());
            wVar.mo68529h("recommendations");
            this.nullablePageAdapter.toJson(wVar, listingFetch.getRecommendations());
            wVar.mo68529h("listing_video");
            this.nullableListingVideoAdapter.toJson(wVar, listingFetch.getListingVideo());
            wVar.mo68529h("product_safety_notice");
            this.nullableProductSafetyNoticeAdapter.toJson(wVar, listingFetch.getProductSafetyNotice());
            wVar.mo68529h("visually_similar_api_path");
            this.nullableStringAdapter.toJson(wVar, listingFetch.getVisuallySimilarApiPath());
            wVar.mo68529h("recent_listings_mmx_request_uuid_map");
            this.nullableMapOfStringListOfIntAdapter.toJson(wVar, listingFetch.getMmxRequestUuidMap());
            wVar.mo68529h("is_shop_favorited");
            this.nullableBooleanAdapter.toJson(wVar, listingFetch.isShopFavorited());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
