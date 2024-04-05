package p145io.branch.referral;

import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/* renamed from: io.branch.referral.Defines$Jsonkey */
public enum Defines$Jsonkey {
    RandomizedBundleToken("randomized_bundle_token"),
    Identity("identity"),
    RandomizedDeviceToken("randomized_device_token"),
    SessionID("session_id"),
    LinkClickID("link_click_id"),
    GoogleSearchInstallReferrer("google_search_install_referrer"),
    GooglePlayInstallReferrer("install_referrer_extras"),
    ClickedReferrerTimeStamp("clicked_referrer_ts"),
    ReferrerExtraGclidParam("gclid"),
    ReferrerGclid("referrer_gclid"),
    InstallBeginTimeStamp("install_begin_ts"),
    FaceBookAppLinkChecked("facebook_app_link_checked"),
    BranchLinkUsed("branch_used"),
    ReferringBranchIdentity("referring_branch_identity"),
    BranchIdentity("branch_identity"),
    BranchKey("branch_key"),
    BranchData("branch_data"),
    PlayAutoInstalls("play-auto-installs"),
    UTMCampaign("utm_campaign"),
    UTMMedium("utm_medium"),
    InitialReferrer("initial_referrer"),
    Bucket("bucket"),
    DefaultBucket("default"),
    Amount(ResponseConstants.AMOUNT),
    CalculationType("calculation_type"),
    Location("location"),
    Type("type"),
    CreationSource("creation_source"),
    Prefix("prefix"),
    Expiration("expiration"),
    Event("event"),
    Metadata(ResponseConstants.METADATA),
    CommerceData("commerce_data"),
    ReferralCode("referral_code"),
    Total(ResponseConstants.TOTAL),
    Unique("unique"),
    Length("length"),
    Direction("direction"),
    BeginAfterID("begin_after_id"),
    Link(ResponseConstants.LINK),
    ReferringData("referring_data"),
    ReferringLink("referring_link"),
    IsFullAppConv("is_full_app_conversion"),
    Data("data"),
    OS("os"),
    HardwareID("hardware_id"),
    AndroidID("android_id"),
    UnidentifiedDevice("unidentified_device"),
    HardwareIDType("hardware_id_type"),
    HardwareIDTypeVendor("vendor_id"),
    HardwareIDTypeRandom("random"),
    IsHardwareIDReal("is_hardware_id_real"),
    AppVersion("app_version"),
    APILevel("os_version"),
    Country("country"),
    Language("language"),
    Update("update"),
    OriginalInstallTime("first_install_time"),
    FirstInstallTime("latest_install_time"),
    LastUpdateTime("latest_update_time"),
    PreviousUpdateTime("previous_update_time"),
    URIScheme("uri_scheme"),
    AppLinks("app_links"),
    AppIdentifier("app_identifier"),
    LinkIdentifier("link_identifier"),
    GoogleAdvertisingID("google_advertising_id"),
    AAID("aaid"),
    FireAdId("fire_ad_id"),
    OpenAdvertisingID("oaid"),
    LATVal("lat_val"),
    LimitedAdTracking("limit_ad_tracking"),
    limitFacebookTracking("limit_facebook_tracking"),
    Debug("debug"),
    Brand("brand"),
    Model("model"),
    ScreenDpi("screen_dpi"),
    ScreenHeight("screen_height"),
    ScreenWidth("screen_width"),
    WiFi("wifi"),
    LocalIP("local_ip"),
    UserData("user_data"),
    AdvertisingIDs("advertising_ids"),
    DeveloperIdentity("developer_identity"),
    UserAgent("user_agent"),
    SDK("sdk"),
    SdkVersion("sdk_version"),
    UIMode("ui_mode"),
    InstallMetadata("install_metadata"),
    LATDAttributionWindow("attribution_window"),
    Clicked_Branch_Link("+clicked_branch_link"),
    IsFirstSession("+is_first_session"),
    AndroidDeepLinkPath("$android_deeplink_path"),
    DeepLinkPath("$deeplink_path"),
    AndroidAppLinkURL("android_app_link_url"),
    AndroidPushNotificationKey("branch"),
    AndroidPushIdentifier("push_identifier"),
    CanonicalIdentifier("$canonical_identifier"),
    ContentTitle("$og_title"),
    ContentDesc("$og_description"),
    ContentImgUrl("$og_image_url"),
    CanonicalUrl("$canonical_url"),
    ContentType("$content_type"),
    PublicallyIndexable("$publicly_indexable"),
    LocallyIndexable("$locally_indexable"),
    ContentKeyWords("$keywords"),
    ContentExpiryTime("$exp_date"),
    Params(ResponseConstants.PARAMS),
    SharedLink("$shared_link"),
    ShareError("$share_error"),
    External_Intent_URI("external_intent_uri"),
    External_Intent_Extra("external_intent_extra"),
    Last_Round_Trip_Time("lrtt"),
    Branch_Round_Trip_Time("brtt"),
    Branch_Instrumentation("instrumentation"),
    Queue_Wait_Time("qwt"),
    InstantDeepLinkSession("instant_dl_session"),
    BranchViewData("branch_view_data"),
    BranchViewID("id"),
    BranchViewAction(ResponseConstants.ACTION),
    BranchViewNumOfUse("number_of_use"),
    BranchViewUrl("url"),
    BranchViewHtml("html"),
    Path(ResponseConstants.PATH),
    ViewList("view_list"),
    ContentActionView("view"),
    ContentPath("content_path"),
    ContentNavPath("content_nav_path"),
    ReferralLink("referral_link"),
    ContentData("content_data"),
    ContentEvents("events"),
    ContentAnalyticsMode("content_analytics_mode"),
    Environment("environment"),
    InstantApp("INSTANT_APP"),
    NativeApp("FULL_APP"),
    CustomerEventAlias("customer_event_alias"),
    TransactionID(ResponseConstants.TRANSACTION_ID),
    Currency("currency"),
    Revenue("revenue"),
    Shipping("shipping"),
    Tax("tax"),
    Coupon("coupon"),
    Affiliation("affiliation"),
    Description("description"),
    SearchQuery("search_query"),
    AdType("ad_type"),
    CPUType("cpu_type"),
    DeviceBuildId(JsonPOJOBuilder.DEFAULT_BUILD_METHOD),
    Locale("locale"),
    ConnectionType("connection_type"),
    DeviceCarrier("device_carrier"),
    PluginName("plugin_name"),
    PluginVersion("plugin_version"),
    OSVersionAndroid("os_version_android"),
    Name("name"),
    CustomData("custom_data"),
    EventData("event_data"),
    ContentItems("content_items"),
    ContentSchema("$content_schema"),
    Price("$price"),
    PriceCurrency("$currency"),
    Quantity("$quantity"),
    SKU("$sku"),
    ProductName("$product_name"),
    ProductBrand("$product_brand"),
    ProductCategory("$product_category"),
    ProductVariant("$product_variant"),
    Rating("$rating"),
    RatingAverage("$rating_average"),
    RatingCount("$rating_count"),
    RatingMax("$rating_max"),
    AddressStreet("$address_street"),
    AddressCity("$address_city"),
    AddressRegion("$address_region"),
    AddressCountry("$address_country"),
    AddressPostalCode("$address_postal_code"),
    Latitude("$latitude"),
    Longitude("$longitude"),
    ImageCaptions("$image_captions"),
    Condition("$condition"),
    CreationTimestamp("$creation_timestamp"),
    TrackingDisabled("tracking_disabled"),
    DisableAdNetworkCallouts("disable_ad_network_callouts"),
    PartnerData("partner_data"),
    Instant("instant"),
    QRCodeTag("qr-code"),
    CodeColor("code_color"),
    BackgroundColor(ResponseConstants.BACKGROUND_COLOR),
    Width(ResponseConstants.WIDTH),
    Margin("margin"),
    ImageFormat("image_format"),
    CenterLogo("center_logo_url"),
    QRCodeSettings("qr_code_settings"),
    QRCodeData("data"),
    QRCodeBranchKey("branch_key"),
    QRCodeResponseString("QRCodeString"),
    App_Store("app_store"),
    Google_Play_Store("PlayStore"),
    Huawei_App_Gallery("AppGallery"),
    Samsung_Galaxy_Store("GalaxyStore"),
    Xiaomi_Get_Apps("GetApps");
    
    private final String key;

    private Defines$Jsonkey(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return this.key;
    }
}
