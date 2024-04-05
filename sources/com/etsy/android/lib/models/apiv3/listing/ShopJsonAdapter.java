package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.StarSeller;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopJsonAdapter extends JsonAdapter<Shop> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Float> nullableFloatAdapter;
    private final JsonAdapter<Image> nullableImageAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<ShopLanguage>> nullableListOfShopLanguageAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<SellerResponseTime> nullableSellerResponseTimeAdapter;
    private final JsonAdapter<ShopHighlight> nullableShopHighlightAdapter;
    private final JsonAdapter<ShopIcon> nullableShopIconAdapter;
    private final JsonAdapter<StarSeller> nullableStarSellerAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<User> nullableUserAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ABOUT_INFO_EXISTS, ResponseConstants.ACCEPTS_BANK_TRANSFERS, ResponseConstants.ACCEPTS_CHECKS, "accepts_custom_requests", ResponseConstants.ACCEPTS_DIRECT_CHECKOUT, ResponseConstants.ACCEPTS_GIFT_CARD, ResponseConstants.ACCEPTS_MONEY_ORDERS, "accepts_other", ResponseConstants.ACCEPTS_PAYPAL, ResponseConstants.ACTIVE_LISTING_COUNT, ResponseConstants.AVERAGE_RATING, ResponseConstants.BANNER_URL, ResponseConstants.BRANDING_OPTION, "city", ResponseConstants.COUNTRY_CODE, ResponseConstants.CREATE_DATE, ResponseConstants.CURRENCY_CODE, ResponseConstants.DIGITAL_LISTING_COUNT, ResponseConstants.FAVORITES_COUNT, "geoname_id", ResponseConstants.GOOGLE_ANALYTICS_PROPERTY_ID, ResponseConstants.HAS_ABOUT, ResponseConstants.HAS_ABOUT_PAGE, ResponseConstants.HAS_BANNER, ResponseConstants.HAS_CURRENCY_CODE, ResponseConstants.HAS_ICON, "has_language_preferences", ResponseConstants.HAS_LARGE_BANNER, ResponseConstants.HAS_ONBOARDED_STRUCTURED_POLICIES, ResponseConstants.HAS_OWNERS, ResponseConstants.HAS_PUBLISHED_STRUCTURED_REFUNDS_POLICY, ResponseConstants.HEADLINE, ResponseConstants.ICON, "imported_rating_count", "is_nipsa", ResponseConstants.IS_OPEN, "is_shop_location_in_germany", "is_suspended_payments_mandate", ResponseConstants.IS_USING_STRUCTURED_POLICIES, ResponseConstants.IS_VACATION, ResponseConstants.BANNER, ResponseConstants.LARGE_BANNER, ResponseConstants.LAT, "location", ResponseConstants.LON, "message", "message_to_buyers", ResponseConstants.MESSAGE_UPDATE_DATE, ResponseConstants.MODULES, "name", ResponseConstants.ONBOARDING_STATUS, ResponseConstants.OPEN_DATE, ResponseConstants.OWNER, ResponseConstants.HAS_PRIVATE_RECEIPT_INFO, "policy_seller_info", "primary_language_id", ResponseConstants.PULL_QUOTE, ResponseConstants.REARRANGE_ENABLED, "region", ResponseConstants.RELATED_LINKS, ResponseConstants.SELLER_AVATAR, ResponseConstants.SELLER_NAME, "shop_id", ResponseConstants.SHOP_LANGUAGES, ResponseConstants.SHOP_NAME, ResponseConstants.SHOP_URL, ResponseConstants.SOLD_COUNT, "sold_hidden", ResponseConstants.STATUS, "status_date", ResponseConstants.STORY, ResponseConstants.STORY_HEADLINE, ResponseConstants.STORY_LEADING_PARAGRAPH, ResponseConstants.TOTAL_RATING_COUNT, "total_share_count", ResponseConstants.UPDATE_DATE, "url", "user_id", ResponseConstants.VACATION_MESSAGE, "vacation_autoreply", "vacation_message_update_date", "seller_response_time", "shop_highlight", "star_seller");

    public ShopJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "aboutInfoExists");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, "activeListingCount");
        this.nullableFloatAdapter = yVar2.mo68558c(Float.class, emptySet, "averageRating");
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "bannerUrl");
        this.nullableShopIconAdapter = yVar2.mo68558c(ShopIcon.class, emptySet, ResponseConstants.ICON);
        this.nullableImageAdapter = yVar2.mo68558c(Image.class, emptySet, ResponseConstants.BANNER);
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, ResponseConstants.MODULES);
        this.nullableUserAdapter = yVar2.mo68558c(User.class, emptySet, ResponseConstants.OWNER);
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "shopId");
        this.nullableListOfShopLanguageAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopLanguage.class), emptySet, "shopLanguages");
        this.nullableSellerResponseTimeAdapter = yVar2.mo68558c(SellerResponseTime.class, emptySet, "sellerResponseTime");
        this.nullableShopHighlightAdapter = yVar2.mo68558c(ShopHighlight.class, emptySet, "shopHighlight");
        this.nullableStarSellerAdapter = yVar2.mo68558c(StarSeller.class, emptySet, "starSeller");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Shop)";
    }

    public Shop fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Integer num = null;
        Float f = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str5 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Boolean bool12 = null;
        Boolean bool13 = null;
        Boolean bool14 = null;
        Boolean bool15 = null;
        Boolean bool16 = null;
        Boolean bool17 = null;
        Boolean bool18 = null;
        Boolean bool19 = null;
        String str6 = null;
        ShopIcon shopIcon = null;
        Integer num7 = null;
        Boolean bool20 = null;
        Boolean bool21 = null;
        Boolean bool22 = null;
        Boolean bool23 = null;
        Boolean bool24 = null;
        Integer num8 = null;
        Image image = null;
        Image image2 = null;
        Float f2 = null;
        String str7 = null;
        Float f3 = null;
        String str8 = null;
        String str9 = null;
        Integer num9 = null;
        List list = null;
        String str10 = null;
        String str11 = null;
        Integer num10 = null;
        User user = null;
        Boolean bool25 = null;
        String str12 = null;
        Integer num11 = null;
        String str13 = null;
        Boolean bool26 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Long l = null;
        List list2 = null;
        String str18 = null;
        String str19 = null;
        Integer num12 = null;
        Boolean bool27 = null;
        String str20 = null;
        Integer num13 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        Integer num14 = null;
        Integer num15 = null;
        Long l2 = null;
        String str24 = null;
        Long l3 = null;
        String str25 = null;
        String str26 = null;
        Integer num16 = null;
        SellerResponseTime sellerResponseTime = null;
        ShopHighlight shopHighlight = null;
        StarSeller starSeller = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 1:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 2:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 3:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 4:
                    bool5 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 5:
                    bool6 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 6:
                    bool7 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 7:
                    bool8 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 8:
                    bool9 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 9:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 10:
                    f = this.nullableFloatAdapter.fromJson(jsonReader2);
                    break;
                case 11:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 12:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 13:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 14:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 15:
                    num3 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 16:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 17:
                    num4 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 18:
                    num5 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 19:
                    num6 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 20:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 21:
                    bool10 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 22:
                    bool11 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 23:
                    bool12 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 24:
                    bool13 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 25:
                    bool14 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 26:
                    bool15 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 27:
                    bool16 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 28:
                    bool17 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 29:
                    bool18 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 30:
                    bool19 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 31:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 32:
                    shopIcon = this.nullableShopIconAdapter.fromJson(jsonReader2);
                    break;
                case 33:
                    num7 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 34:
                    bool20 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 35:
                    bool21 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 36:
                    bool22 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 37:
                    bool23 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 38:
                    bool24 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 39:
                    num8 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 40:
                    image = this.nullableImageAdapter.fromJson(jsonReader2);
                    break;
                case 41:
                    image2 = this.nullableImageAdapter.fromJson(jsonReader2);
                    break;
                case 42:
                    f2 = this.nullableFloatAdapter.fromJson(jsonReader2);
                    break;
                case 43:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 44:
                    f3 = this.nullableFloatAdapter.fromJson(jsonReader2);
                    break;
                case 45:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 46:
                    str9 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 47:
                    num9 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 48:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    break;
                case 49:
                    str10 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 50:
                    str11 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 51:
                    num10 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 52:
                    user = this.nullableUserAdapter.fromJson(jsonReader2);
                    break;
                case 53:
                    bool25 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 54:
                    str12 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 55:
                    num11 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 56:
                    str13 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 57:
                    bool26 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 58:
                    str14 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 59:
                    str15 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 60:
                    str16 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 61:
                    str17 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 62:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 63:
                    list2 = this.nullableListOfShopLanguageAdapter.fromJson(jsonReader2);
                    break;
                case 64:
                    str18 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 65:
                    str19 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 66:
                    num12 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 67:
                    bool27 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    break;
                case 68:
                    str20 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 69:
                    num13 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 70:
                    str21 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 71:
                    str22 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 72:
                    str23 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 73:
                    num14 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 74:
                    num15 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 75:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 76:
                    str24 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 77:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    break;
                case 78:
                    str25 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 79:
                    str26 = this.nullableStringAdapter.fromJson(jsonReader2);
                    break;
                case 80:
                    num16 = this.nullableIntAdapter.fromJson(jsonReader2);
                    break;
                case 81:
                    sellerResponseTime = this.nullableSellerResponseTimeAdapter.fromJson(jsonReader2);
                    break;
                case 82:
                    shopHighlight = this.nullableShopHighlightAdapter.fromJson(jsonReader2);
                    break;
                case 83:
                    starSeller = this.nullableStarSellerAdapter.fromJson(jsonReader2);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new Shop(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, f, str, num2, str2, str3, num3, str4, num4, num5, num6, str5, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, str6, shopIcon, num7, bool20, bool21, bool22, bool23, bool24, num8, image, image2, f2, str7, f3, str8, str9, num9, list, str10, str11, num10, user, bool25, str12, num11, str13, bool26, str14, str15, str16, str17, l, list2, str18, str19, num12, bool27, str20, num13, str21, str22, str23, num14, num15, l2, str24, l3, str25, str26, num16, sellerResponseTime, shopHighlight, starSeller);
    }

    public void toJson(C17412w wVar, Shop shop) {
        C19383o.m32797g(wVar, "writer");
        if (shop != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ABOUT_INFO_EXISTS);
            this.nullableBooleanAdapter.toJson(wVar, shop.getAboutInfoExists());
            wVar.mo68529h(ResponseConstants.ACCEPTS_BANK_TRANSFERS);
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsBankTransfers());
            wVar.mo68529h(ResponseConstants.ACCEPTS_CHECKS);
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsChecks());
            wVar.mo68529h("accepts_custom_requests");
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsCustomRequests());
            wVar.mo68529h(ResponseConstants.ACCEPTS_DIRECT_CHECKOUT);
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsDirectCheckout());
            wVar.mo68529h(ResponseConstants.ACCEPTS_GIFT_CARD);
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsGiftCard());
            wVar.mo68529h(ResponseConstants.ACCEPTS_MONEY_ORDERS);
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsMoneyOrders());
            wVar.mo68529h("accepts_other");
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsOther());
            wVar.mo68529h(ResponseConstants.ACCEPTS_PAYPAL);
            this.nullableBooleanAdapter.toJson(wVar, shop.getAcceptsPaypal());
            wVar.mo68529h(ResponseConstants.ACTIVE_LISTING_COUNT);
            this.nullableIntAdapter.toJson(wVar, shop.getActiveListingCount());
            wVar.mo68529h(ResponseConstants.AVERAGE_RATING);
            this.nullableFloatAdapter.toJson(wVar, shop.getAverageRating());
            wVar.mo68529h(ResponseConstants.BANNER_URL);
            this.nullableStringAdapter.toJson(wVar, shop.getBannerUrl());
            wVar.mo68529h(ResponseConstants.BRANDING_OPTION);
            this.nullableIntAdapter.toJson(wVar, shop.getBrandingOption());
            wVar.mo68529h("city");
            this.nullableStringAdapter.toJson(wVar, shop.getCity());
            wVar.mo68529h(ResponseConstants.COUNTRY_CODE);
            this.nullableStringAdapter.toJson(wVar, shop.getCountryCode());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableIntAdapter.toJson(wVar, shop.getCreateDate());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, shop.getCurrencyCode());
            wVar.mo68529h(ResponseConstants.DIGITAL_LISTING_COUNT);
            this.nullableIntAdapter.toJson(wVar, shop.getDigitalListingCount());
            wVar.mo68529h(ResponseConstants.FAVORITES_COUNT);
            this.nullableIntAdapter.toJson(wVar, shop.getFavoritesCount());
            wVar.mo68529h("geoname_id");
            this.nullableIntAdapter.toJson(wVar, shop.getGeonameId());
            wVar.mo68529h(ResponseConstants.GOOGLE_ANALYTICS_PROPERTY_ID);
            this.nullableStringAdapter.toJson(wVar, shop.getGoogleAnalyticsPropertyId());
            wVar.mo68529h(ResponseConstants.HAS_ABOUT);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasAbout());
            wVar.mo68529h(ResponseConstants.HAS_ABOUT_PAGE);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasAboutPage());
            wVar.mo68529h(ResponseConstants.HAS_BANNER);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasBanner());
            wVar.mo68529h(ResponseConstants.HAS_CURRENCY_CODE);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasCurrencyCode());
            wVar.mo68529h(ResponseConstants.HAS_ICON);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasIcon());
            wVar.mo68529h("has_language_preferences");
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasLanguagePreferences());
            wVar.mo68529h(ResponseConstants.HAS_LARGE_BANNER);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasLargeBanner());
            wVar.mo68529h(ResponseConstants.HAS_ONBOARDED_STRUCTURED_POLICIES);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasOnboardedStructuredPolicies());
            wVar.mo68529h(ResponseConstants.HAS_OWNERS);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasOwners());
            wVar.mo68529h(ResponseConstants.HAS_PUBLISHED_STRUCTURED_REFUNDS_POLICY);
            this.nullableBooleanAdapter.toJson(wVar, shop.getHasPublishedStructuredRefundsPolicy());
            wVar.mo68529h(ResponseConstants.HEADLINE);
            this.nullableStringAdapter.toJson(wVar, shop.getHeadline());
            wVar.mo68529h(ResponseConstants.ICON);
            this.nullableShopIconAdapter.toJson(wVar, shop.getIcon());
            wVar.mo68529h("imported_rating_count");
            this.nullableIntAdapter.toJson(wVar, shop.getImportedRatingCount());
            wVar.mo68529h("is_nipsa");
            this.nullableBooleanAdapter.toJson(wVar, shop.isNipsa());
            wVar.mo68529h(ResponseConstants.IS_OPEN);
            this.nullableBooleanAdapter.toJson(wVar, shop.isOpen());
            wVar.mo68529h("is_shop_location_in_germany");
            this.nullableBooleanAdapter.toJson(wVar, shop.isShopLocationInGermany());
            wVar.mo68529h("is_suspended_payments_mandate");
            this.nullableBooleanAdapter.toJson(wVar, shop.isSuspendedPaymentsMandate());
            wVar.mo68529h(ResponseConstants.IS_USING_STRUCTURED_POLICIES);
            this.nullableBooleanAdapter.toJson(wVar, shop.isUsingStructuredPolicies());
            wVar.mo68529h(ResponseConstants.IS_VACATION);
            this.nullableIntAdapter.toJson(wVar, shop.isVacation());
            wVar.mo68529h(ResponseConstants.BANNER);
            this.nullableImageAdapter.toJson(wVar, shop.getBanner());
            wVar.mo68529h(ResponseConstants.LARGE_BANNER);
            this.nullableImageAdapter.toJson(wVar, shop.getLargeBanner());
            wVar.mo68529h(ResponseConstants.LAT);
            this.nullableFloatAdapter.toJson(wVar, shop.getLat());
            wVar.mo68529h("location");
            this.nullableStringAdapter.toJson(wVar, shop.getLocation());
            wVar.mo68529h(ResponseConstants.LON);
            this.nullableFloatAdapter.toJson(wVar, shop.getLon());
            wVar.mo68529h("message");
            this.nullableStringAdapter.toJson(wVar, shop.getMessage());
            wVar.mo68529h("message_to_buyers");
            this.nullableStringAdapter.toJson(wVar, shop.getMessageToBuyers());
            wVar.mo68529h(ResponseConstants.MESSAGE_UPDATE_DATE);
            this.nullableIntAdapter.toJson(wVar, shop.getMessageUpdateDate());
            wVar.mo68529h(ResponseConstants.MODULES);
            this.nullableListOfStringAdapter.toJson(wVar, shop.getModules());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, shop.getName());
            wVar.mo68529h(ResponseConstants.ONBOARDING_STATUS);
            this.nullableStringAdapter.toJson(wVar, shop.getOnboardingStatus());
            wVar.mo68529h(ResponseConstants.OPEN_DATE);
            this.nullableIntAdapter.toJson(wVar, shop.getOpenDate());
            wVar.mo68529h(ResponseConstants.OWNER);
            this.nullableUserAdapter.toJson(wVar, shop.getOwner());
            wVar.mo68529h(ResponseConstants.HAS_PRIVATE_RECEIPT_INFO);
            this.nullableBooleanAdapter.toJson(wVar, shop.getPolicyHasPrivateReceiptInfo());
            wVar.mo68529h("policy_seller_info");
            this.nullableStringAdapter.toJson(wVar, shop.getPolicySellerInfo());
            wVar.mo68529h("primary_language_id");
            this.nullableIntAdapter.toJson(wVar, shop.getPrimaryLanguageId());
            wVar.mo68529h(ResponseConstants.PULL_QUOTE);
            this.nullableStringAdapter.toJson(wVar, shop.getPullQuote());
            wVar.mo68529h(ResponseConstants.REARRANGE_ENABLED);
            this.nullableBooleanAdapter.toJson(wVar, shop.getRearrangeEnabled());
            wVar.mo68529h("region");
            this.nullableStringAdapter.toJson(wVar, shop.getRegion());
            wVar.mo68529h(ResponseConstants.RELATED_LINKS);
            this.nullableStringAdapter.toJson(wVar, shop.getRelatedLinks());
            wVar.mo68529h(ResponseConstants.SELLER_AVATAR);
            this.nullableStringAdapter.toJson(wVar, shop.getSellerAvatar());
            wVar.mo68529h(ResponseConstants.SELLER_NAME);
            this.nullableStringAdapter.toJson(wVar, shop.getSellerName());
            wVar.mo68529h("shop_id");
            this.nullableLongAdapter.toJson(wVar, shop.getShopId());
            wVar.mo68529h(ResponseConstants.SHOP_LANGUAGES);
            this.nullableListOfShopLanguageAdapter.toJson(wVar, shop.getShopLanguages());
            wVar.mo68529h(ResponseConstants.SHOP_NAME);
            this.nullableStringAdapter.toJson(wVar, shop.getShopName());
            wVar.mo68529h(ResponseConstants.SHOP_URL);
            this.nullableStringAdapter.toJson(wVar, shop.getShopUrl());
            wVar.mo68529h(ResponseConstants.SOLD_COUNT);
            this.nullableIntAdapter.toJson(wVar, shop.getSoldCount());
            wVar.mo68529h("sold_hidden");
            this.nullableBooleanAdapter.toJson(wVar, shop.getSoldHidden());
            wVar.mo68529h(ResponseConstants.STATUS);
            this.nullableStringAdapter.toJson(wVar, shop.getStatus());
            wVar.mo68529h("status_date");
            this.nullableIntAdapter.toJson(wVar, shop.getStatusDate());
            wVar.mo68529h(ResponseConstants.STORY);
            this.nullableStringAdapter.toJson(wVar, shop.getStory());
            wVar.mo68529h(ResponseConstants.STORY_HEADLINE);
            this.nullableStringAdapter.toJson(wVar, shop.getStoryHeadline());
            wVar.mo68529h(ResponseConstants.STORY_LEADING_PARAGRAPH);
            this.nullableStringAdapter.toJson(wVar, shop.getStoryLeadingParagraph());
            wVar.mo68529h(ResponseConstants.TOTAL_RATING_COUNT);
            this.nullableIntAdapter.toJson(wVar, shop.getTotalRatingCount());
            wVar.mo68529h("total_share_count");
            this.nullableIntAdapter.toJson(wVar, shop.getTotalShareCount());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableLongAdapter.toJson(wVar, shop.getUpdateDate());
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, shop.getUrl());
            wVar.mo68529h("user_id");
            this.nullableLongAdapter.toJson(wVar, shop.getUserId());
            wVar.mo68529h(ResponseConstants.VACATION_MESSAGE);
            this.nullableStringAdapter.toJson(wVar, shop.getVacationMessage());
            wVar.mo68529h("vacation_autoreply");
            this.nullableStringAdapter.toJson(wVar, shop.getVacationAutoreply());
            wVar.mo68529h("vacation_message_update_date");
            this.nullableIntAdapter.toJson(wVar, shop.getVacationMessageUpdateDate());
            wVar.mo68529h("seller_response_time");
            this.nullableSellerResponseTimeAdapter.toJson(wVar, shop.getSellerResponseTime());
            wVar.mo68529h("shop_highlight");
            this.nullableShopHighlightAdapter.toJson(wVar, shop.getShopHighlight());
            wVar.mo68529h("star_seller");
            this.nullableStarSellerAdapter.toJson(wVar, shop.getStarSeller());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
