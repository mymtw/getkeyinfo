package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.StarSeller;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Shop implements ITrackedObject {
    public static final int $stable = 8;
    private final Boolean aboutInfoExists;
    private final Boolean acceptsBankTransfers;
    private final Boolean acceptsChecks;
    private final Boolean acceptsCustomRequests;
    private final Boolean acceptsDirectCheckout;
    private final Boolean acceptsGiftCard;
    private final Boolean acceptsMoneyOrders;
    private final Boolean acceptsOther;
    private final Boolean acceptsPaypal;
    private final Integer activeListingCount;
    private final Float averageRating;
    private final Image banner;
    private final String bannerUrl;
    private final Integer brandingOption;
    private final String city;
    private final String countryCode;
    private final Integer createDate;
    private final String currencyCode;
    private final Integer digitalListingCount;
    private final Integer favoritesCount;
    private final Integer geonameId;
    private final String googleAnalyticsPropertyId;
    private final Boolean hasAbout;
    private final Boolean hasAboutPage;
    private final Boolean hasBanner;
    private final Boolean hasCurrencyCode;
    private final Boolean hasIcon;
    private final Boolean hasLanguagePreferences;
    private final Boolean hasLargeBanner;
    private final Boolean hasOnboardedStructuredPolicies;
    private final Boolean hasOwners;
    private final Boolean hasPublishedStructuredRefundsPolicy;
    private final String headline;
    private final ShopIcon icon;
    private final Integer importedRatingCount;
    private final Boolean isNipsa;
    private final Boolean isOpen;
    private final Boolean isShopLocationInGermany;
    private final Boolean isSuspendedPaymentsMandate;
    private final Boolean isUsingStructuredPolicies;
    private final Integer isVacation;
    private final Image largeBanner;
    private final Float lat;
    private final String location;
    private final Float lon;
    private final String message;
    private final String messageToBuyers;
    private final Integer messageUpdateDate;
    private final List<String> modules;
    private final String name;
    private final String onboardingStatus;
    private final Integer openDate;
    private final User owner;
    private final Boolean policyHasPrivateReceiptInfo;
    private final String policySellerInfo;
    private final Integer primaryLanguageId;
    private final String pullQuote;
    private final Boolean rearrangeEnabled;
    private final String region;
    private final String relatedLinks;
    private final String sellerAvatar;
    private final String sellerName;
    private final SellerResponseTime sellerResponseTime;
    private final ShopHighlight shopHighlight;
    private final Long shopId;
    private final List<ShopLanguage> shopLanguages;
    private final String shopName;
    private final String shopUrl;
    private final Integer soldCount;
    private final Boolean soldHidden;
    private final StarSeller starSeller;
    private final String status;
    private final Integer statusDate;
    private final String story;
    private final String storyHeadline;
    private final String storyLeadingParagraph;
    private final Integer totalRatingCount;
    private final Integer totalShareCount;
    private final Long updateDate;
    private final String url;
    private final Long userId;
    private final String vacationAutoreply;
    private final String vacationMessage;
    private final Integer vacationMessageUpdateDate;

    public Shop(@C17402n(name = "about_info_exists") Boolean bool, @C17402n(name = "accepts_bank_transfers") Boolean bool2, @C17402n(name = "accepts_checks") Boolean bool3, @C17402n(name = "accepts_custom_requests") Boolean bool4, @C17402n(name = "accepts_direct_checkout") Boolean bool5, @C17402n(name = "accepts_gift_card") Boolean bool6, @C17402n(name = "accepts_money_orders") Boolean bool7, @C17402n(name = "accepts_other") Boolean bool8, @C17402n(name = "accepts_paypal") Boolean bool9, @C17402n(name = "active_listing_count") Integer num, @C17402n(name = "average_rating") Float f, @C17402n(name = "banner_url") String str, @C17402n(name = "branding_option") Integer num2, @C17402n(name = "city") String str2, @C17402n(name = "country_code") String str3, @C17402n(name = "create_date") Integer num3, @C17402n(name = "currency_code") String str4, @C17402n(name = "digital_listing_count") Integer num4, @C17402n(name = "favorites_count") Integer num5, @C17402n(name = "geoname_id") Integer num6, @C17402n(name = "google_analytics_property_id") String str5, @C17402n(name = "has_about") Boolean bool10, @C17402n(name = "has_about_page") Boolean bool11, @C17402n(name = "has_banner") Boolean bool12, @C17402n(name = "has_currency_code") Boolean bool13, @C17402n(name = "has_icon") Boolean bool14, @C17402n(name = "has_language_preferences") Boolean bool15, @C17402n(name = "has_large_banner") Boolean bool16, @C17402n(name = "has_onboarded_structured_policies") Boolean bool17, @C17402n(name = "has_owners") Boolean bool18, @C17402n(name = "has_published_structured_refunds_policy") Boolean bool19, @C17402n(name = "headline") String str6, @C17402n(name = "icon") ShopIcon shopIcon, @C17402n(name = "imported_rating_count") Integer num7, @C17402n(name = "is_nipsa") Boolean bool20, @C17402n(name = "is_open") Boolean bool21, @C17402n(name = "is_shop_location_in_germany") Boolean bool22, @C17402n(name = "is_suspended_payments_mandate") Boolean bool23, @C17402n(name = "is_using_structured_policies") Boolean bool24, @C17402n(name = "is_vacation") Integer num8, @C17402n(name = "banner") Image image, @C17402n(name = "large_banner") Image image2, @C17402n(name = "lat") Float f2, @C17402n(name = "location") String str7, @C17402n(name = "lon") Float f3, @C17402n(name = "message") String str8, @C17402n(name = "message_to_buyers") String str9, @C17402n(name = "message_update_date") Integer num9, @C17402n(name = "modules") List<String> list, @C17402n(name = "name") String str10, @C17402n(name = "onboarding_status") String str11, @C17402n(name = "open_date") Integer num10, @C17402n(name = "owner") User user, @C17402n(name = "policy_has_private_receipt_info") Boolean bool25, @C17402n(name = "policy_seller_info") String str12, @C17402n(name = "primary_language_id") Integer num11, @C17402n(name = "pull_quote") String str13, @C17402n(name = "rearrange_enabled") Boolean bool26, @C17402n(name = "region") String str14, @C17402n(name = "related_links") String str15, @C17402n(name = "seller_avatar") String str16, @C17402n(name = "seller_name") String str17, @C17402n(name = "shop_id") Long l, @C17402n(name = "shop_languages") List<ShopLanguage> list2, @C17402n(name = "shop_name") String str18, @C17402n(name = "shop_url") String str19, @C17402n(name = "sold_count") Integer num12, @C17402n(name = "sold_hidden") Boolean bool27, @C17402n(name = "status") String str20, @C17402n(name = "status_date") Integer num13, @C17402n(name = "story") String str21, @C17402n(name = "story_headline") String str22, @C17402n(name = "story_leading_paragraph") String str23, @C17402n(name = "total_rating_count") Integer num14, @C17402n(name = "total_share_count") Integer num15, @C17402n(name = "update_date") Long l2, @C17402n(name = "url") String str24, @C17402n(name = "user_id") Long l3, @C17402n(name = "vacation_message") String str25, @C17402n(name = "vacation_autoreply") String str26, @C17402n(name = "vacation_message_update_date") Integer num16, @C17402n(name = "seller_response_time") SellerResponseTime sellerResponseTime2, @C17402n(name = "shop_highlight") ShopHighlight shopHighlight2, @C17402n(name = "star_seller") StarSeller starSeller2) {
        this.aboutInfoExists = bool;
        this.acceptsBankTransfers = bool2;
        this.acceptsChecks = bool3;
        this.acceptsCustomRequests = bool4;
        this.acceptsDirectCheckout = bool5;
        this.acceptsGiftCard = bool6;
        this.acceptsMoneyOrders = bool7;
        this.acceptsOther = bool8;
        this.acceptsPaypal = bool9;
        this.activeListingCount = num;
        this.averageRating = f;
        this.bannerUrl = str;
        this.brandingOption = num2;
        this.city = str2;
        this.countryCode = str3;
        this.createDate = num3;
        this.currencyCode = str4;
        this.digitalListingCount = num4;
        this.favoritesCount = num5;
        this.geonameId = num6;
        this.googleAnalyticsPropertyId = str5;
        this.hasAbout = bool10;
        this.hasAboutPage = bool11;
        this.hasBanner = bool12;
        this.hasCurrencyCode = bool13;
        this.hasIcon = bool14;
        this.hasLanguagePreferences = bool15;
        this.hasLargeBanner = bool16;
        this.hasOnboardedStructuredPolicies = bool17;
        this.hasOwners = bool18;
        this.hasPublishedStructuredRefundsPolicy = bool19;
        this.headline = str6;
        this.icon = shopIcon;
        this.importedRatingCount = num7;
        this.isNipsa = bool20;
        this.isOpen = bool21;
        this.isShopLocationInGermany = bool22;
        this.isSuspendedPaymentsMandate = bool23;
        this.isUsingStructuredPolicies = bool24;
        this.isVacation = num8;
        this.banner = image;
        this.largeBanner = image2;
        this.lat = f2;
        this.location = str7;
        this.lon = f3;
        this.message = str8;
        this.messageToBuyers = str9;
        this.messageUpdateDate = num9;
        this.modules = list;
        this.name = str10;
        this.onboardingStatus = str11;
        this.openDate = num10;
        this.owner = user;
        this.policyHasPrivateReceiptInfo = bool25;
        this.policySellerInfo = str12;
        this.primaryLanguageId = num11;
        this.pullQuote = str13;
        this.rearrangeEnabled = bool26;
        this.region = str14;
        this.relatedLinks = str15;
        this.sellerAvatar = str16;
        this.sellerName = str17;
        this.shopId = l;
        this.shopLanguages = list2;
        this.shopName = str18;
        this.shopUrl = str19;
        this.soldCount = num12;
        this.soldHidden = bool27;
        this.status = str20;
        this.statusDate = num13;
        this.story = str21;
        this.storyHeadline = str22;
        this.storyLeadingParagraph = str23;
        this.totalRatingCount = num14;
        this.totalShareCount = num15;
        this.updateDate = l2;
        this.url = str24;
        this.userId = l3;
        this.vacationMessage = str25;
        this.vacationAutoreply = str26;
        this.vacationMessageUpdateDate = num16;
        this.sellerResponseTime = sellerResponseTime2;
        this.shopHighlight = shopHighlight2;
        this.starSeller = starSeller2;
    }

    public static /* synthetic */ Shop copy$default(Shop shop, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Float f, String str, Integer num2, String str2, String str3, Integer num3, String str4, Integer num4, Integer num5, Integer num6, String str5, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, String str6, ShopIcon shopIcon, Integer num7, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Integer num8, Image image, Image image2, Float f2, String str7, Float f3, String str8, String str9, Integer num9, List list, String str10, String str11, Integer num10, User user, Boolean bool25, String str12, Integer num11, String str13, Boolean bool26, String str14, String str15, String str16, String str17, Long l, List list2, String str18, String str19, Integer num12, Boolean bool27, String str20, Integer num13, String str21, String str22, String str23, Integer num14, Integer num15, Long l2, String str24, Long l3, String str25, String str26, Integer num16, SellerResponseTime sellerResponseTime2, ShopHighlight shopHighlight2, StarSeller starSeller2, int i, int i2, int i3, Object obj) {
        Shop shop2 = shop;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        return shop.copy((i4 & 1) != 0 ? shop2.aboutInfoExists : bool, (i4 & 2) != 0 ? shop2.acceptsBankTransfers : bool2, (i4 & 4) != 0 ? shop2.acceptsChecks : bool3, (i4 & 8) != 0 ? shop2.acceptsCustomRequests : bool4, (i4 & 16) != 0 ? shop2.acceptsDirectCheckout : bool5, (i4 & 32) != 0 ? shop2.acceptsGiftCard : bool6, (i4 & 64) != 0 ? shop2.acceptsMoneyOrders : bool7, (i4 & 128) != 0 ? shop2.acceptsOther : bool8, (i4 & 256) != 0 ? shop2.acceptsPaypal : bool9, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shop2.activeListingCount : num, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shop2.averageRating : f, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shop2.bannerUrl : str, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shop2.brandingOption : num2, (i4 & 8192) != 0 ? shop2.city : str2, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shop2.countryCode : str3, (i4 & 32768) != 0 ? shop2.createDate : num3, (i4 & 65536) != 0 ? shop2.currencyCode : str4, (i4 & 131072) != 0 ? shop2.digitalListingCount : num4, (i4 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? shop2.favoritesCount : num5, (i4 & 524288) != 0 ? shop2.geonameId : num6, (i4 & 1048576) != 0 ? shop2.googleAnalyticsPropertyId : str5, (i4 & 2097152) != 0 ? shop2.hasAbout : bool10, (i4 & 4194304) != 0 ? shop2.hasAboutPage : bool11, (i4 & 8388608) != 0 ? shop2.hasBanner : bool12, (i4 & 16777216) != 0 ? shop2.hasCurrencyCode : bool13, (i4 & 33554432) != 0 ? shop2.hasIcon : bool14, (i4 & 67108864) != 0 ? shop2.hasLanguagePreferences : bool15, (i4 & 134217728) != 0 ? shop2.hasLargeBanner : bool16, (i4 & 268435456) != 0 ? shop2.hasOnboardedStructuredPolicies : bool17, (i4 & 536870912) != 0 ? shop2.hasOwners : bool18, (i4 & 1073741824) != 0 ? shop2.hasPublishedStructuredRefundsPolicy : bool19, (i4 & Integer.MIN_VALUE) != 0 ? shop2.headline : str6, (i5 & 1) != 0 ? shop2.icon : shopIcon, (i5 & 2) != 0 ? shop2.importedRatingCount : num7, (i5 & 4) != 0 ? shop2.isNipsa : bool20, (i5 & 8) != 0 ? shop2.isOpen : bool21, (i5 & 16) != 0 ? shop2.isShopLocationInGermany : bool22, (i5 & 32) != 0 ? shop2.isSuspendedPaymentsMandate : bool23, (i5 & 64) != 0 ? shop2.isUsingStructuredPolicies : bool24, (i5 & 128) != 0 ? shop2.isVacation : num8, (i5 & 256) != 0 ? shop2.banner : image, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shop2.largeBanner : image2, (i5 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shop2.lat : f2, (i5 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shop2.location : str7, (i5 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shop2.lon : f3, (i5 & 8192) != 0 ? shop2.message : str8, (i5 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shop2.messageToBuyers : str9, (i5 & 32768) != 0 ? shop2.messageUpdateDate : num9, (i5 & 65536) != 0 ? shop2.modules : list, (i5 & 131072) != 0 ? shop2.name : str10, (i5 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? shop2.onboardingStatus : str11, (i5 & 524288) != 0 ? shop2.openDate : num10, (i5 & 1048576) != 0 ? shop2.owner : user, (i5 & 2097152) != 0 ? shop2.policyHasPrivateReceiptInfo : bool25, (i5 & 4194304) != 0 ? shop2.policySellerInfo : str12, (i5 & 8388608) != 0 ? shop2.primaryLanguageId : num11, (i5 & 16777216) != 0 ? shop2.pullQuote : str13, (i5 & 33554432) != 0 ? shop2.rearrangeEnabled : bool26, (i5 & 67108864) != 0 ? shop2.region : str14, (i5 & 134217728) != 0 ? shop2.relatedLinks : str15, (i5 & 268435456) != 0 ? shop2.sellerAvatar : str16, (i5 & 536870912) != 0 ? shop2.sellerName : str17, (i5 & 1073741824) != 0 ? shop2.shopId : l, (i5 & Integer.MIN_VALUE) != 0 ? shop2.shopLanguages : list2, (i6 & 1) != 0 ? shop2.shopName : str18, (i6 & 2) != 0 ? shop2.shopUrl : str19, (i6 & 4) != 0 ? shop2.soldCount : num12, (i6 & 8) != 0 ? shop2.soldHidden : bool27, (i6 & 16) != 0 ? shop2.status : str20, (i6 & 32) != 0 ? shop2.statusDate : num13, (i6 & 64) != 0 ? shop2.story : str21, (i6 & 128) != 0 ? shop2.storyHeadline : str22, (i6 & 256) != 0 ? shop2.storyLeadingParagraph : str23, (i6 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? shop2.totalRatingCount : num14, (i6 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? shop2.totalShareCount : num15, (i6 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? shop2.updateDate : l2, (i6 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shop2.url : str24, (i6 & 8192) != 0 ? shop2.userId : l3, (i6 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? shop2.vacationMessage : str25, (i6 & 32768) != 0 ? shop2.vacationAutoreply : str26, (i6 & 65536) != 0 ? shop2.vacationMessageUpdateDate : num16, (i6 & 131072) != 0 ? shop2.sellerResponseTime : sellerResponseTime2, (i6 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? shop2.shopHighlight : shopHighlight2, (i6 & 524288) != 0 ? shop2.starSeller : starSeller2);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    public final Boolean component1() {
        return this.aboutInfoExists;
    }

    public final Integer component10() {
        return this.activeListingCount;
    }

    public final Float component11() {
        return this.averageRating;
    }

    public final String component12() {
        return this.bannerUrl;
    }

    public final Integer component13() {
        return this.brandingOption;
    }

    public final String component14() {
        return this.city;
    }

    public final String component15() {
        return this.countryCode;
    }

    public final Integer component16() {
        return this.createDate;
    }

    public final String component17() {
        return this.currencyCode;
    }

    public final Integer component18() {
        return this.digitalListingCount;
    }

    public final Integer component19() {
        return this.favoritesCount;
    }

    public final Boolean component2() {
        return this.acceptsBankTransfers;
    }

    public final Integer component20() {
        return this.geonameId;
    }

    public final String component21() {
        return this.googleAnalyticsPropertyId;
    }

    public final Boolean component22() {
        return this.hasAbout;
    }

    public final Boolean component23() {
        return this.hasAboutPage;
    }

    public final Boolean component24() {
        return this.hasBanner;
    }

    public final Boolean component25() {
        return this.hasCurrencyCode;
    }

    public final Boolean component26() {
        return this.hasIcon;
    }

    public final Boolean component27() {
        return this.hasLanguagePreferences;
    }

    public final Boolean component28() {
        return this.hasLargeBanner;
    }

    public final Boolean component29() {
        return this.hasOnboardedStructuredPolicies;
    }

    public final Boolean component3() {
        return this.acceptsChecks;
    }

    public final Boolean component30() {
        return this.hasOwners;
    }

    public final Boolean component31() {
        return this.hasPublishedStructuredRefundsPolicy;
    }

    public final String component32() {
        return this.headline;
    }

    public final ShopIcon component33() {
        return this.icon;
    }

    public final Integer component34() {
        return this.importedRatingCount;
    }

    public final Boolean component35() {
        return this.isNipsa;
    }

    public final Boolean component36() {
        return this.isOpen;
    }

    public final Boolean component37() {
        return this.isShopLocationInGermany;
    }

    public final Boolean component38() {
        return this.isSuspendedPaymentsMandate;
    }

    public final Boolean component39() {
        return this.isUsingStructuredPolicies;
    }

    public final Boolean component4() {
        return this.acceptsCustomRequests;
    }

    public final Integer component40() {
        return this.isVacation;
    }

    public final Image component41() {
        return this.banner;
    }

    public final Image component42() {
        return this.largeBanner;
    }

    public final Float component43() {
        return this.lat;
    }

    public final String component44() {
        return this.location;
    }

    public final Float component45() {
        return this.lon;
    }

    public final String component46() {
        return this.message;
    }

    public final String component47() {
        return this.messageToBuyers;
    }

    public final Integer component48() {
        return this.messageUpdateDate;
    }

    public final List<String> component49() {
        return this.modules;
    }

    public final Boolean component5() {
        return this.acceptsDirectCheckout;
    }

    public final String component50() {
        return this.name;
    }

    public final String component51() {
        return this.onboardingStatus;
    }

    public final Integer component52() {
        return this.openDate;
    }

    public final User component53() {
        return this.owner;
    }

    public final Boolean component54() {
        return this.policyHasPrivateReceiptInfo;
    }

    public final String component55() {
        return this.policySellerInfo;
    }

    public final Integer component56() {
        return this.primaryLanguageId;
    }

    public final String component57() {
        return this.pullQuote;
    }

    public final Boolean component58() {
        return this.rearrangeEnabled;
    }

    public final String component59() {
        return this.region;
    }

    public final Boolean component6() {
        return this.acceptsGiftCard;
    }

    public final String component60() {
        return this.relatedLinks;
    }

    public final String component61() {
        return this.sellerAvatar;
    }

    public final String component62() {
        return this.sellerName;
    }

    public final Long component63() {
        return this.shopId;
    }

    public final List<ShopLanguage> component64() {
        return this.shopLanguages;
    }

    public final String component65() {
        return this.shopName;
    }

    public final String component66() {
        return this.shopUrl;
    }

    public final Integer component67() {
        return this.soldCount;
    }

    public final Boolean component68() {
        return this.soldHidden;
    }

    public final String component69() {
        return this.status;
    }

    public final Boolean component7() {
        return this.acceptsMoneyOrders;
    }

    public final Integer component70() {
        return this.statusDate;
    }

    public final String component71() {
        return this.story;
    }

    public final String component72() {
        return this.storyHeadline;
    }

    public final String component73() {
        return this.storyLeadingParagraph;
    }

    public final Integer component74() {
        return this.totalRatingCount;
    }

    public final Integer component75() {
        return this.totalShareCount;
    }

    public final Long component76() {
        return this.updateDate;
    }

    public final String component77() {
        return this.url;
    }

    public final Long component78() {
        return this.userId;
    }

    public final String component79() {
        return this.vacationMessage;
    }

    public final Boolean component8() {
        return this.acceptsOther;
    }

    public final String component80() {
        return this.vacationAutoreply;
    }

    public final Integer component81() {
        return this.vacationMessageUpdateDate;
    }

    public final SellerResponseTime component82() {
        return this.sellerResponseTime;
    }

    public final ShopHighlight component83() {
        return this.shopHighlight;
    }

    public final StarSeller component84() {
        return this.starSeller;
    }

    public final Boolean component9() {
        return this.acceptsPaypal;
    }

    public final Shop copy(@C17402n(name = "about_info_exists") Boolean bool, @C17402n(name = "accepts_bank_transfers") Boolean bool2, @C17402n(name = "accepts_checks") Boolean bool3, @C17402n(name = "accepts_custom_requests") Boolean bool4, @C17402n(name = "accepts_direct_checkout") Boolean bool5, @C17402n(name = "accepts_gift_card") Boolean bool6, @C17402n(name = "accepts_money_orders") Boolean bool7, @C17402n(name = "accepts_other") Boolean bool8, @C17402n(name = "accepts_paypal") Boolean bool9, @C17402n(name = "active_listing_count") Integer num, @C17402n(name = "average_rating") Float f, @C17402n(name = "banner_url") String str, @C17402n(name = "branding_option") Integer num2, @C17402n(name = "city") String str2, @C17402n(name = "country_code") String str3, @C17402n(name = "create_date") Integer num3, @C17402n(name = "currency_code") String str4, @C17402n(name = "digital_listing_count") Integer num4, @C17402n(name = "favorites_count") Integer num5, @C17402n(name = "geoname_id") Integer num6, @C17402n(name = "google_analytics_property_id") String str5, @C17402n(name = "has_about") Boolean bool10, @C17402n(name = "has_about_page") Boolean bool11, @C17402n(name = "has_banner") Boolean bool12, @C17402n(name = "has_currency_code") Boolean bool13, @C17402n(name = "has_icon") Boolean bool14, @C17402n(name = "has_language_preferences") Boolean bool15, @C17402n(name = "has_large_banner") Boolean bool16, @C17402n(name = "has_onboarded_structured_policies") Boolean bool17, @C17402n(name = "has_owners") Boolean bool18, @C17402n(name = "has_published_structured_refunds_policy") Boolean bool19, @C17402n(name = "headline") String str6, @C17402n(name = "icon") ShopIcon shopIcon, @C17402n(name = "imported_rating_count") Integer num7, @C17402n(name = "is_nipsa") Boolean bool20, @C17402n(name = "is_open") Boolean bool21, @C17402n(name = "is_shop_location_in_germany") Boolean bool22, @C17402n(name = "is_suspended_payments_mandate") Boolean bool23, @C17402n(name = "is_using_structured_policies") Boolean bool24, @C17402n(name = "is_vacation") Integer num8, @C17402n(name = "banner") Image image, @C17402n(name = "large_banner") Image image2, @C17402n(name = "lat") Float f2, @C17402n(name = "location") String str7, @C17402n(name = "lon") Float f3, @C17402n(name = "message") String str8, @C17402n(name = "message_to_buyers") String str9, @C17402n(name = "message_update_date") Integer num9, @C17402n(name = "modules") List<String> list, @C17402n(name = "name") String str10, @C17402n(name = "onboarding_status") String str11, @C17402n(name = "open_date") Integer num10, @C17402n(name = "owner") User user, @C17402n(name = "policy_has_private_receipt_info") Boolean bool25, @C17402n(name = "policy_seller_info") String str12, @C17402n(name = "primary_language_id") Integer num11, @C17402n(name = "pull_quote") String str13, @C17402n(name = "rearrange_enabled") Boolean bool26, @C17402n(name = "region") String str14, @C17402n(name = "related_links") String str15, @C17402n(name = "seller_avatar") String str16, @C17402n(name = "seller_name") String str17, @C17402n(name = "shop_id") Long l, @C17402n(name = "shop_languages") List<ShopLanguage> list2, @C17402n(name = "shop_name") String str18, @C17402n(name = "shop_url") String str19, @C17402n(name = "sold_count") Integer num12, @C17402n(name = "sold_hidden") Boolean bool27, @C17402n(name = "status") String str20, @C17402n(name = "status_date") Integer num13, @C17402n(name = "story") String str21, @C17402n(name = "story_headline") String str22, @C17402n(name = "story_leading_paragraph") String str23, @C17402n(name = "total_rating_count") Integer num14, @C17402n(name = "total_share_count") Integer num15, @C17402n(name = "update_date") Long l2, @C17402n(name = "url") String str24, @C17402n(name = "user_id") Long l3, @C17402n(name = "vacation_message") String str25, @C17402n(name = "vacation_autoreply") String str26, @C17402n(name = "vacation_message_update_date") Integer num16, @C17402n(name = "seller_response_time") SellerResponseTime sellerResponseTime2, @C17402n(name = "shop_highlight") ShopHighlight shopHighlight2, @C17402n(name = "star_seller") StarSeller starSeller2) {
        return new Shop(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, f, str, num2, str2, str3, num3, str4, num4, num5, num6, str5, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, str6, shopIcon, num7, bool20, bool21, bool22, bool23, bool24, num8, image, image2, f2, str7, f3, str8, str9, num9, list, str10, str11, num10, user, bool25, str12, num11, str13, bool26, str14, str15, str16, str17, l, list2, str18, str19, num12, bool27, str20, num13, str21, str22, str23, num14, num15, l2, str24, l3, str25, str26, num16, sellerResponseTime2, shopHighlight2, starSeller2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shop)) {
            return false;
        }
        Shop shop = (Shop) obj;
        return C19383o.m32792b(this.aboutInfoExists, shop.aboutInfoExists) && C19383o.m32792b(this.acceptsBankTransfers, shop.acceptsBankTransfers) && C19383o.m32792b(this.acceptsChecks, shop.acceptsChecks) && C19383o.m32792b(this.acceptsCustomRequests, shop.acceptsCustomRequests) && C19383o.m32792b(this.acceptsDirectCheckout, shop.acceptsDirectCheckout) && C19383o.m32792b(this.acceptsGiftCard, shop.acceptsGiftCard) && C19383o.m32792b(this.acceptsMoneyOrders, shop.acceptsMoneyOrders) && C19383o.m32792b(this.acceptsOther, shop.acceptsOther) && C19383o.m32792b(this.acceptsPaypal, shop.acceptsPaypal) && C19383o.m32792b(this.activeListingCount, shop.activeListingCount) && C19383o.m32792b(this.averageRating, shop.averageRating) && C19383o.m32792b(this.bannerUrl, shop.bannerUrl) && C19383o.m32792b(this.brandingOption, shop.brandingOption) && C19383o.m32792b(this.city, shop.city) && C19383o.m32792b(this.countryCode, shop.countryCode) && C19383o.m32792b(this.createDate, shop.createDate) && C19383o.m32792b(this.currencyCode, shop.currencyCode) && C19383o.m32792b(this.digitalListingCount, shop.digitalListingCount) && C19383o.m32792b(this.favoritesCount, shop.favoritesCount) && C19383o.m32792b(this.geonameId, shop.geonameId) && C19383o.m32792b(this.googleAnalyticsPropertyId, shop.googleAnalyticsPropertyId) && C19383o.m32792b(this.hasAbout, shop.hasAbout) && C19383o.m32792b(this.hasAboutPage, shop.hasAboutPage) && C19383o.m32792b(this.hasBanner, shop.hasBanner) && C19383o.m32792b(this.hasCurrencyCode, shop.hasCurrencyCode) && C19383o.m32792b(this.hasIcon, shop.hasIcon) && C19383o.m32792b(this.hasLanguagePreferences, shop.hasLanguagePreferences) && C19383o.m32792b(this.hasLargeBanner, shop.hasLargeBanner) && C19383o.m32792b(this.hasOnboardedStructuredPolicies, shop.hasOnboardedStructuredPolicies) && C19383o.m32792b(this.hasOwners, shop.hasOwners) && C19383o.m32792b(this.hasPublishedStructuredRefundsPolicy, shop.hasPublishedStructuredRefundsPolicy) && C19383o.m32792b(this.headline, shop.headline) && C19383o.m32792b(this.icon, shop.icon) && C19383o.m32792b(this.importedRatingCount, shop.importedRatingCount) && C19383o.m32792b(this.isNipsa, shop.isNipsa) && C19383o.m32792b(this.isOpen, shop.isOpen) && C19383o.m32792b(this.isShopLocationInGermany, shop.isShopLocationInGermany) && C19383o.m32792b(this.isSuspendedPaymentsMandate, shop.isSuspendedPaymentsMandate) && C19383o.m32792b(this.isUsingStructuredPolicies, shop.isUsingStructuredPolicies) && C19383o.m32792b(this.isVacation, shop.isVacation) && C19383o.m32792b(this.banner, shop.banner) && C19383o.m32792b(this.largeBanner, shop.largeBanner) && C19383o.m32792b(this.lat, shop.lat) && C19383o.m32792b(this.location, shop.location) && C19383o.m32792b(this.lon, shop.lon) && C19383o.m32792b(this.message, shop.message) && C19383o.m32792b(this.messageToBuyers, shop.messageToBuyers) && C19383o.m32792b(this.messageUpdateDate, shop.messageUpdateDate) && C19383o.m32792b(this.modules, shop.modules) && C19383o.m32792b(this.name, shop.name) && C19383o.m32792b(this.onboardingStatus, shop.onboardingStatus) && C19383o.m32792b(this.openDate, shop.openDate) && C19383o.m32792b(this.owner, shop.owner) && C19383o.m32792b(this.policyHasPrivateReceiptInfo, shop.policyHasPrivateReceiptInfo) && C19383o.m32792b(this.policySellerInfo, shop.policySellerInfo) && C19383o.m32792b(this.primaryLanguageId, shop.primaryLanguageId) && C19383o.m32792b(this.pullQuote, shop.pullQuote) && C19383o.m32792b(this.rearrangeEnabled, shop.rearrangeEnabled) && C19383o.m32792b(this.region, shop.region) && C19383o.m32792b(this.relatedLinks, shop.relatedLinks) && C19383o.m32792b(this.sellerAvatar, shop.sellerAvatar) && C19383o.m32792b(this.sellerName, shop.sellerName) && C19383o.m32792b(this.shopId, shop.shopId) && C19383o.m32792b(this.shopLanguages, shop.shopLanguages) && C19383o.m32792b(this.shopName, shop.shopName) && C19383o.m32792b(this.shopUrl, shop.shopUrl) && C19383o.m32792b(this.soldCount, shop.soldCount) && C19383o.m32792b(this.soldHidden, shop.soldHidden) && C19383o.m32792b(this.status, shop.status) && C19383o.m32792b(this.statusDate, shop.statusDate) && C19383o.m32792b(this.story, shop.story) && C19383o.m32792b(this.storyHeadline, shop.storyHeadline) && C19383o.m32792b(this.storyLeadingParagraph, shop.storyLeadingParagraph) && C19383o.m32792b(this.totalRatingCount, shop.totalRatingCount) && C19383o.m32792b(this.totalShareCount, shop.totalShareCount) && C19383o.m32792b(this.updateDate, shop.updateDate) && C19383o.m32792b(this.url, shop.url) && C19383o.m32792b(this.userId, shop.userId) && C19383o.m32792b(this.vacationMessage, shop.vacationMessage) && C19383o.m32792b(this.vacationAutoreply, shop.vacationAutoreply) && C19383o.m32792b(this.vacationMessageUpdateDate, shop.vacationMessageUpdateDate) && C19383o.m32792b(this.sellerResponseTime, shop.sellerResponseTime) && C19383o.m32792b(this.shopHighlight, shop.shopHighlight) && C19383o.m32792b(this.starSeller, shop.starSeller);
    }

    public final Boolean getAboutInfoExists() {
        return this.aboutInfoExists;
    }

    public final Boolean getAcceptsBankTransfers() {
        return this.acceptsBankTransfers;
    }

    public final Boolean getAcceptsChecks() {
        return this.acceptsChecks;
    }

    public final Boolean getAcceptsCustomRequests() {
        return this.acceptsCustomRequests;
    }

    public final Boolean getAcceptsDirectCheckout() {
        return this.acceptsDirectCheckout;
    }

    public final Boolean getAcceptsGiftCard() {
        return this.acceptsGiftCard;
    }

    public final Boolean getAcceptsMoneyOrders() {
        return this.acceptsMoneyOrders;
    }

    public final Boolean getAcceptsOther() {
        return this.acceptsOther;
    }

    public final Boolean getAcceptsPaypal() {
        return this.acceptsPaypal;
    }

    public final Integer getActiveListingCount() {
        return this.activeListingCount;
    }

    public final Float getAverageRating() {
        return this.averageRating;
    }

    public final Image getBanner() {
        return this.banner;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final Integer getBrandingOption() {
        return this.brandingOption;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final Integer getCreateDate() {
        return this.createDate;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Integer getDigitalListingCount() {
        return this.digitalListingCount;
    }

    public final Integer getFavoritesCount() {
        return this.favoritesCount;
    }

    public final Integer getGeonameId() {
        return this.geonameId;
    }

    public final String getGoogleAnalyticsPropertyId() {
        return this.googleAnalyticsPropertyId;
    }

    public final Boolean getHasAbout() {
        return this.hasAbout;
    }

    public final Boolean getHasAboutPage() {
        return this.hasAboutPage;
    }

    public final Boolean getHasBanner() {
        return this.hasBanner;
    }

    public final Boolean getHasCurrencyCode() {
        return this.hasCurrencyCode;
    }

    public final Boolean getHasIcon() {
        return this.hasIcon;
    }

    public final Boolean getHasLanguagePreferences() {
        return this.hasLanguagePreferences;
    }

    public final Boolean getHasLargeBanner() {
        return this.hasLargeBanner;
    }

    public final Boolean getHasOnboardedStructuredPolicies() {
        return this.hasOnboardedStructuredPolicies;
    }

    public final Boolean getHasOwners() {
        return this.hasOwners;
    }

    public final Boolean getHasPublishedStructuredRefundsPolicy() {
        return this.hasPublishedStructuredRefundsPolicy;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final ShopIcon getIcon() {
        return this.icon;
    }

    public final Integer getImportedRatingCount() {
        return this.importedRatingCount;
    }

    public final Image getLargeBanner() {
        return this.largeBanner;
    }

    public final Float getLat() {
        return this.lat;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Float getLon() {
        return this.lon;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageToBuyers() {
        return this.messageToBuyers;
    }

    public final Integer getMessageUpdateDate() {
        return this.messageUpdateDate;
    }

    public final List<String> getModules() {
        return this.modules;
    }

    public final String getName() {
        return this.name;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    public final String getOnboardingStatus() {
        return this.onboardingStatus;
    }

    public final Integer getOpenDate() {
        return this.openDate;
    }

    public final User getOwner() {
        return this.owner;
    }

    public final Boolean getPolicyHasPrivateReceiptInfo() {
        return this.policyHasPrivateReceiptInfo;
    }

    public final String getPolicySellerInfo() {
        return this.policySellerInfo;
    }

    public final Integer getPrimaryLanguageId() {
        return this.primaryLanguageId;
    }

    public final String getPullQuote() {
        return this.pullQuote;
    }

    public final Boolean getRearrangeEnabled() {
        return this.rearrangeEnabled;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getRelatedLinks() {
        return this.relatedLinks;
    }

    public final String getSellerAvatar() {
        return this.sellerAvatar;
    }

    public final String getSellerName() {
        return this.sellerName;
    }

    public final SellerResponseTime getSellerResponseTime() {
        return this.sellerResponseTime;
    }

    public final ShopHighlight getShopHighlight() {
        return this.shopHighlight;
    }

    public final Long getShopId() {
        return this.shopId;
    }

    public final List<ShopLanguage> getShopLanguages() {
        return this.shopLanguages;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final String getShopUrl() {
        return this.shopUrl;
    }

    public final Integer getSoldCount() {
        return this.soldCount;
    }

    public final Boolean getSoldHidden() {
        return this.soldHidden;
    }

    public final StarSeller getStarSeller() {
        return this.starSeller;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getStatusDate() {
        return this.statusDate;
    }

    public final String getStory() {
        return this.story;
    }

    public final String getStoryHeadline() {
        return this.storyHeadline;
    }

    public final String getStoryLeadingParagraph() {
        return this.storyLeadingParagraph;
    }

    public final Integer getTotalRatingCount() {
        return this.totalRatingCount;
    }

    public final Integer getTotalShareCount() {
        return this.totalShareCount;
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
        Pair[] pairArr = new Pair[1];
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.SHOP_ID;
        Long l = this.shopId;
        String l2 = l != null ? l.toString() : null;
        if (l2 == null) {
            l2 = "";
        }
        pairArr[0] = new Pair(predefinedAnalyticsProperty, l2);
        return C19294b0.m32561r0(pairArr);
    }

    public final Long getUpdateDate() {
        return this.updateDate;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final String getVacationAutoreply() {
        return this.vacationAutoreply;
    }

    public final String getVacationMessage() {
        return this.vacationMessage;
    }

    public final Integer getVacationMessageUpdateDate() {
        return this.vacationMessageUpdateDate;
    }

    public int hashCode() {
        Boolean bool = this.aboutInfoExists;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.acceptsBankTransfers;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.acceptsChecks;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.acceptsCustomRequests;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.acceptsDirectCheckout;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.acceptsGiftCard;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.acceptsMoneyOrders;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.acceptsOther;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.acceptsPaypal;
        int hashCode9 = (hashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Integer num = this.activeListingCount;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.averageRating;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.bannerUrl;
        int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.brandingOption;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.city;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.createDate;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.currencyCode;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.digitalListingCount;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.favoritesCount;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.geonameId;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.googleAnalyticsPropertyId;
        int hashCode21 = (hashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool10 = this.hasAbout;
        int hashCode22 = (hashCode21 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.hasAboutPage;
        int hashCode23 = (hashCode22 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.hasBanner;
        int hashCode24 = (hashCode23 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.hasCurrencyCode;
        int hashCode25 = (hashCode24 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.hasIcon;
        int hashCode26 = (hashCode25 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.hasLanguagePreferences;
        int hashCode27 = (hashCode26 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.hasLargeBanner;
        int hashCode28 = (hashCode27 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.hasOnboardedStructuredPolicies;
        int hashCode29 = (hashCode28 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.hasOwners;
        int hashCode30 = (hashCode29 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.hasPublishedStructuredRefundsPolicy;
        int hashCode31 = (hashCode30 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        String str6 = this.headline;
        int hashCode32 = (hashCode31 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ShopIcon shopIcon = this.icon;
        int hashCode33 = (hashCode32 + (shopIcon == null ? 0 : shopIcon.hashCode())) * 31;
        Integer num7 = this.importedRatingCount;
        int hashCode34 = (hashCode33 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool20 = this.isNipsa;
        int hashCode35 = (hashCode34 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.isOpen;
        int hashCode36 = (hashCode35 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.isShopLocationInGermany;
        int hashCode37 = (hashCode36 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.isSuspendedPaymentsMandate;
        int hashCode38 = (hashCode37 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.isUsingStructuredPolicies;
        int hashCode39 = (hashCode38 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Integer num8 = this.isVacation;
        int hashCode40 = (hashCode39 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Image image = this.banner;
        int hashCode41 = (hashCode40 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.largeBanner;
        int hashCode42 = (hashCode41 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Float f2 = this.lat;
        int hashCode43 = (hashCode42 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str7 = this.location;
        int hashCode44 = (hashCode43 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f3 = this.lon;
        int hashCode45 = (hashCode44 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str8 = this.message;
        int hashCode46 = (hashCode45 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.messageToBuyers;
        int hashCode47 = (hashCode46 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num9 = this.messageUpdateDate;
        int hashCode48 = (hashCode47 + (num9 == null ? 0 : num9.hashCode())) * 31;
        List<String> list = this.modules;
        int hashCode49 = (hashCode48 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.name;
        int hashCode50 = (hashCode49 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.onboardingStatus;
        int hashCode51 = (hashCode50 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num10 = this.openDate;
        int hashCode52 = (hashCode51 + (num10 == null ? 0 : num10.hashCode())) * 31;
        User user = this.owner;
        int hashCode53 = (hashCode52 + (user == null ? 0 : user.hashCode())) * 31;
        Boolean bool25 = this.policyHasPrivateReceiptInfo;
        int hashCode54 = (hashCode53 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        String str12 = this.policySellerInfo;
        int hashCode55 = (hashCode54 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num11 = this.primaryLanguageId;
        int hashCode56 = (hashCode55 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str13 = this.pullQuote;
        int hashCode57 = (hashCode56 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool26 = this.rearrangeEnabled;
        int hashCode58 = (hashCode57 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        String str14 = this.region;
        int hashCode59 = (hashCode58 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.relatedLinks;
        int hashCode60 = (hashCode59 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sellerAvatar;
        int hashCode61 = (hashCode60 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.sellerName;
        int hashCode62 = (hashCode61 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Long l = this.shopId;
        int hashCode63 = (hashCode62 + (l == null ? 0 : l.hashCode())) * 31;
        List<ShopLanguage> list2 = this.shopLanguages;
        int hashCode64 = (hashCode63 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str18 = this.shopName;
        int hashCode65 = (hashCode64 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.shopUrl;
        int hashCode66 = (hashCode65 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num12 = this.soldCount;
        int hashCode67 = (hashCode66 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Boolean bool27 = this.soldHidden;
        int hashCode68 = (hashCode67 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        String str20 = this.status;
        int hashCode69 = (hashCode68 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Integer num13 = this.statusDate;
        int hashCode70 = (hashCode69 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str21 = this.story;
        int hashCode71 = (hashCode70 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.storyHeadline;
        int hashCode72 = (hashCode71 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.storyLeadingParagraph;
        int hashCode73 = (hashCode72 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Integer num14 = this.totalRatingCount;
        int hashCode74 = (hashCode73 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.totalShareCount;
        int hashCode75 = (hashCode74 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Long l2 = this.updateDate;
        int hashCode76 = (hashCode75 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str24 = this.url;
        int hashCode77 = (hashCode76 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Long l3 = this.userId;
        int hashCode78 = (hashCode77 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str25 = this.vacationMessage;
        int hashCode79 = (hashCode78 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.vacationAutoreply;
        int hashCode80 = (hashCode79 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Integer num16 = this.vacationMessageUpdateDate;
        int hashCode81 = (hashCode80 + (num16 == null ? 0 : num16.hashCode())) * 31;
        SellerResponseTime sellerResponseTime2 = this.sellerResponseTime;
        int hashCode82 = (hashCode81 + (sellerResponseTime2 == null ? 0 : sellerResponseTime2.hashCode())) * 31;
        ShopHighlight shopHighlight2 = this.shopHighlight;
        int hashCode83 = (hashCode82 + (shopHighlight2 == null ? 0 : shopHighlight2.hashCode())) * 31;
        StarSeller starSeller2 = this.starSeller;
        if (starSeller2 != null) {
            i = starSeller2.hashCode();
        }
        return hashCode83 + i;
    }

    public final Boolean isNipsa() {
        return this.isNipsa;
    }

    public final Boolean isOpen() {
        return this.isOpen;
    }

    public final Boolean isShopLocationInGermany() {
        return this.isShopLocationInGermany;
    }

    public final Boolean isSuspendedPaymentsMandate() {
        return this.isSuspendedPaymentsMandate;
    }

    public final Boolean isUsingStructuredPolicies() {
        return this.isUsingStructuredPolicies;
    }

    public final Integer isVacation() {
        return this.isVacation;
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
        StringBuilder h = C0072d.m201h("Shop(aboutInfoExists=");
        h.append(this.aboutInfoExists);
        h.append(", acceptsBankTransfers=");
        h.append(this.acceptsBankTransfers);
        h.append(", acceptsChecks=");
        h.append(this.acceptsChecks);
        h.append(", acceptsCustomRequests=");
        h.append(this.acceptsCustomRequests);
        h.append(", acceptsDirectCheckout=");
        h.append(this.acceptsDirectCheckout);
        h.append(", acceptsGiftCard=");
        h.append(this.acceptsGiftCard);
        h.append(", acceptsMoneyOrders=");
        h.append(this.acceptsMoneyOrders);
        h.append(", acceptsOther=");
        h.append(this.acceptsOther);
        h.append(", acceptsPaypal=");
        h.append(this.acceptsPaypal);
        h.append(", activeListingCount=");
        h.append(this.activeListingCount);
        h.append(", averageRating=");
        h.append(this.averageRating);
        h.append(", bannerUrl=");
        h.append(this.bannerUrl);
        h.append(", brandingOption=");
        h.append(this.brandingOption);
        h.append(", city=");
        h.append(this.city);
        h.append(", countryCode=");
        h.append(this.countryCode);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", currencyCode=");
        h.append(this.currencyCode);
        h.append(", digitalListingCount=");
        h.append(this.digitalListingCount);
        h.append(", favoritesCount=");
        h.append(this.favoritesCount);
        h.append(", geonameId=");
        h.append(this.geonameId);
        h.append(", googleAnalyticsPropertyId=");
        h.append(this.googleAnalyticsPropertyId);
        h.append(", hasAbout=");
        h.append(this.hasAbout);
        h.append(", hasAboutPage=");
        h.append(this.hasAboutPage);
        h.append(", hasBanner=");
        h.append(this.hasBanner);
        h.append(", hasCurrencyCode=");
        h.append(this.hasCurrencyCode);
        h.append(", hasIcon=");
        h.append(this.hasIcon);
        h.append(", hasLanguagePreferences=");
        h.append(this.hasLanguagePreferences);
        h.append(", hasLargeBanner=");
        h.append(this.hasLargeBanner);
        h.append(", hasOnboardedStructuredPolicies=");
        h.append(this.hasOnboardedStructuredPolicies);
        h.append(", hasOwners=");
        h.append(this.hasOwners);
        h.append(", hasPublishedStructuredRefundsPolicy=");
        h.append(this.hasPublishedStructuredRefundsPolicy);
        h.append(", headline=");
        h.append(this.headline);
        h.append(", icon=");
        h.append(this.icon);
        h.append(", importedRatingCount=");
        h.append(this.importedRatingCount);
        h.append(", isNipsa=");
        h.append(this.isNipsa);
        h.append(", isOpen=");
        h.append(this.isOpen);
        h.append(", isShopLocationInGermany=");
        h.append(this.isShopLocationInGermany);
        h.append(", isSuspendedPaymentsMandate=");
        h.append(this.isSuspendedPaymentsMandate);
        h.append(", isUsingStructuredPolicies=");
        h.append(this.isUsingStructuredPolicies);
        h.append(", isVacation=");
        h.append(this.isVacation);
        h.append(", banner=");
        h.append(this.banner);
        h.append(", largeBanner=");
        h.append(this.largeBanner);
        h.append(", lat=");
        h.append(this.lat);
        h.append(", location=");
        h.append(this.location);
        h.append(", lon=");
        h.append(this.lon);
        h.append(", message=");
        h.append(this.message);
        h.append(", messageToBuyers=");
        h.append(this.messageToBuyers);
        h.append(", messageUpdateDate=");
        h.append(this.messageUpdateDate);
        h.append(", modules=");
        h.append(this.modules);
        h.append(", name=");
        h.append(this.name);
        h.append(", onboardingStatus=");
        h.append(this.onboardingStatus);
        h.append(", openDate=");
        h.append(this.openDate);
        h.append(", owner=");
        h.append(this.owner);
        h.append(", policyHasPrivateReceiptInfo=");
        h.append(this.policyHasPrivateReceiptInfo);
        h.append(", policySellerInfo=");
        h.append(this.policySellerInfo);
        h.append(", primaryLanguageId=");
        h.append(this.primaryLanguageId);
        h.append(", pullQuote=");
        h.append(this.pullQuote);
        h.append(", rearrangeEnabled=");
        h.append(this.rearrangeEnabled);
        h.append(", region=");
        h.append(this.region);
        h.append(", relatedLinks=");
        h.append(this.relatedLinks);
        h.append(", sellerAvatar=");
        h.append(this.sellerAvatar);
        h.append(", sellerName=");
        h.append(this.sellerName);
        h.append(", shopId=");
        h.append(this.shopId);
        h.append(", shopLanguages=");
        h.append(this.shopLanguages);
        h.append(", shopName=");
        h.append(this.shopName);
        h.append(", shopUrl=");
        h.append(this.shopUrl);
        h.append(", soldCount=");
        h.append(this.soldCount);
        h.append(", soldHidden=");
        h.append(this.soldHidden);
        h.append(", status=");
        h.append(this.status);
        h.append(", statusDate=");
        h.append(this.statusDate);
        h.append(", story=");
        h.append(this.story);
        h.append(", storyHeadline=");
        h.append(this.storyHeadline);
        h.append(", storyLeadingParagraph=");
        h.append(this.storyLeadingParagraph);
        h.append(", totalRatingCount=");
        h.append(this.totalRatingCount);
        h.append(", totalShareCount=");
        h.append(this.totalShareCount);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(", url=");
        h.append(this.url);
        h.append(", userId=");
        h.append(this.userId);
        h.append(", vacationMessage=");
        h.append(this.vacationMessage);
        h.append(", vacationAutoreply=");
        h.append(this.vacationAutoreply);
        h.append(", vacationMessageUpdateDate=");
        h.append(this.vacationMessageUpdateDate);
        h.append(", sellerResponseTime=");
        h.append(this.sellerResponseTime);
        h.append(", shopHighlight=");
        h.append(this.shopHighlight);
        h.append(", starSeller=");
        h.append(this.starSeller);
        h.append(')');
        return h.toString();
    }
}
