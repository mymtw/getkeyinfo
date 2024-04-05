package com.etsy.android.lib.logger;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0087d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.editable.EditableListing;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.favorites.recommendations.ListRecommendationsFragment;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

public enum PredefinedAnalyticsProperty implements AnalyticsProperty {
    TARGET_USER_ID("target_user_id"),
    TARGET_USERNAME("target_username"),
    USER_NAME("user_name"),
    USER_ADDRESS_ID(ResponseConstants.USER_ADDRESS_ID),
    CONTEXT(ResponseConstants.CONTEXT),
    LISTING_ID("listing_id"),
    LISTING_IDS(ResponseConstants.LISTING_IDS),
    LISTINGS_COUNT(ResponseConstants.LISTINGS_COUNT),
    VARIATION_PROPERTY_ID("variation_property_id"),
    CONTENT_SOURCE(ResponseConstants.CONTENT_SOURCE),
    HAPTIC_PREF("haptic_pref"),
    ATTRIBUTE_ID("attribute_id"),
    ATTRIBUTE_DISPLAY_NAME("attribute_display_name"),
    ATTRIBUTE_VALUES("attribute_values"),
    FAILURE_REASON("failure_reason"),
    EMBEDDED_IN_PLAYLIST("embedded_in_playlist"),
    IS_AD("is_ad"),
    LISTING_IS_FAVED("is_faved"),
    LISTING_IS_COLLECTED("is_collected"),
    LISTING_IS_SHOP_FAV("is_shop_fav"),
    LISTING_IS_SOLD_OUT(ResponseConstants.IS_SOLD_OUT),
    LISTING_IS_AVAILABLE("is_available"),
    MODULE_PLACEMENT("module_placement"),
    TARGET_LISTING_ID("target_listing_id"),
    MMX_REQUEST_UUID_MAP("mmx_request_uuid_map"),
    IMAGE_ID(ResponseConstants.IMAGE_ID),
    COUNTRY_ID(ResponseConstants.COUNTRY_ID),
    LANGUAGE("language"),
    CURRENCY("currency"),
    LANGUAGE_ID("language_id"),
    LANGUAGE_NAME("language_name"),
    PREVIOUS_LANGUAGE("previous_language"),
    CATEGORY_ID(ResponseConstants.CATEGORY_ID),
    CART_ID(ResponseConstants.CART_ID),
    GROUPED_CART_IDS("grouped_cart_ids"),
    IS_PAYPAL("is_paypal"),
    RECEIPT_ID(ResponseConstants.RECEIPT_ID),
    TRANSACTION_ID(ResponseConstants.TRANSACTION_ID),
    RECEIPT_SHIPPING_ID(ResponseConstants.RECEIPT_SHIPPING_ID),
    SHIPPING_STATUS("shipping_status"),
    USER_NOTE_ID("user_note_id"),
    PAYMENT_ID(ResponseConstants.PAYMENT_ID),
    PAYMENT_METHOD("payment_method"),
    PAYMENT_METHODS(ResponseConstants.PAYMENT_METHODS),
    QUANTITY(ResponseConstants.QUANTITY),
    STATUS(ResponseConstants.STATUS),
    SHOP_ID("shop_id"),
    SHOP_USER_ID(ResponseConstants.SHOP_USER_ID),
    SHOP_SHOP_ID("shop_shop_id"),
    OPTION_VALUE_ID("option_value_id"),
    SHOP_SECTION_ID(ResponseConstants.SHOP_SECTION_ID),
    SHIPPING_TEMPLATE_ID(EditableListing.FIELD_SHIPPING_TEMPLATE_ID),
    SHIPPING_TEMPLATE_ENTRY_ID("shipping_template_entry_id"),
    MEMBER_ID("member_id"),
    CARRIER_NAME(ResponseConstants.CARRIER_NAME),
    ACCEPTED_STRUCTURED_POLICIES("accepted_structured_policies"),
    SHARE_ID(ResponseConstants.SHARE_ID),
    ANNOTATION_OBJECT_ID("annotation_object_id"),
    TARGET_NAME("target_name"),
    STATS_PAGE_ID("page_id"),
    STATS_LIST_SECTION_ID("section_id"),
    STATS_VERSION("stats_version"),
    COLLECTION_KEY(ListRecommendationsFragment.COLLECTION_KEY),
    COLLECTION_NAME("collection_name"),
    COLLECTION_ID(ResponseConstants.COLLECTION_ID),
    COLLECTION_SLUG("slug_name"),
    CLUSTER_SOURCE("cluster_source"),
    TREASURY_ID("treasury_id"),
    CONVERSATION_ID("convo_id"),
    SNIPPET_ID("snippet_id"),
    TEAM_ID("team_id"),
    NOTIFICATION_ID("notification_id"),
    LOC("loc"),
    NOTIFICATION_TYPE("notification_type"),
    UTM_SOURCE("utm_source"),
    UTM_MEDIUM("utm_medium"),
    UTM_CAMPAIGN("utm_campaign"),
    NOTIFICATIONS_ENABLED("notifications_enabled"),
    NOTIFICATION_CHANNELS_ENABLED("notification_channels_enabled"),
    PUSH_OPT_IN_DISPLAY_LOCATION("pushOptInDisplayLocation"),
    CHANNEL_ID_CONVOS("convos"),
    CHANNEL_ID_ETSY_NEWS("etsy_news"),
    CHANNEL_ID_MY_ACTIVITY("my_activity"),
    CHANNEL_ID_ORDERS("orders"),
    CHANNEL_ID_PROMOTIONS(ResponseConstants.PROMOTIONS),
    CHANNEL_ID_RECOMMENDATIONS("recommendations"),
    LANDING_SCREEN("landing_screen"),
    SHOP_RECS_HIGHLIGHTED_STATE("empty_state"),
    NEW_DEFAULT_ADDRESS_ID("new_default_address_id"),
    OLD_COUNTRY_ID("old_country_id"),
    NEW_COUNTRY_ID("new_country_id"),
    BRANCH_DEEPLINK_PATH("$deeplink_path"),
    BRANCH_CREATION_SOURCE("~creation_source"),
    BRANCH_VIEW_NAME("~view_id"),
    BRANCH_CLICK_TIMESTAMP("+click_timestamp"),
    BRANCH_JOURNEY_ID("~journey_id"),
    BRANCH_URI_REDIRECT_MODE("$uri_redirect_mode"),
    BRANCH_FEATURE("~feature"),
    BRANCH_BRANCH_MATCH_ID("_branch_match_id"),
    BRANCH_MATCH_GUARANTEED("+match_guaranteed"),
    BRANCH_VIEW_ID("~view_name"),
    BRANCH_REFERRER("referrer"),
    BRANCH_CLICKED_BRANCH_LINK("+clicked_branch_link"),
    BRANCH_JOURNEY_NAME("~journey_name"),
    BRANCH_ONE_TIME_USE("$one_time_use"),
    BRANCH_ID("~id"),
    BRANCH_CAMPAIGN("~campaign"),
    BRANCH_CANONICAL_URL("$canonical_url"),
    BRANCH_IS_FIRST_SESSION("+is_first_session"),
    BRANCH_REFERRING_LINK("~referring_link"),
    BRANCH_CHANNEL("~channel"),
    BRANCH_REFERRER_BROWSER_ID("referring_browser_id"),
    CODE(ResponseConstants.CODE),
    ETSY_URL("etsy_url"),
    ORIGINAL_BITLINK("original_bitlink"),
    URL("URL"),
    SI_CHANNEL("si_channel"),
    LOCAL_MARKET_ID("local_market_id"),
    LOCAL_MARKET_TYPE("local_market_type"),
    QUERY("query"),
    TAXONOMY_NODE_ID("taxonomy_node_id"),
    CATEGORY(ResponseConstants.CATEGORY),
    LISTING_CARD_SIZE("listing_card_size"),
    SHOP_NAME(ResponseConstants.SHOP_NAME),
    ROW_NUMBER("row_number"),
    GIFT_GUIDE_DEEPLINK("gift_guide_deeplink"),
    FILTER_IDENTIFIER("filter_identifier"),
    FILTER_OPTION_SELECTED("filter_option_selected"),
    FILTER_OPTION_DESELECTED("filter_option_deselected"),
    FILTER_PRICE_MIN("filter_price_min"),
    FILTER_PRICE_MAX("filter_price_max"),
    FILTER_CUSTOM_INPUT("filter_custom_input"),
    FILTER_SHOP_LOCATION_TYPE("filter_shop_location_type"),
    FILTER_SHOP_LOCATION_VALUE("filter_shop_location_value"),
    CATEGORY_NODE_WHEN_FILTERS_BUTTON_TAPPED("category_node_when_filters_button_tapped"),
    FINDS_PAGE_ID(ResponseConstants.FINDS_PAGE_ID),
    FINDS_PAGE_PUBLISHED_ID(ResponseConstants.FINDS_PAGE_PUBLISHED_ID),
    FINDS_PAGE_SLUG("finds_page_slug"),
    PROMO_VERSION("promo_version"),
    UPGRADE_APP_BUILD_ID("upgrade_app_build_id"),
    POSITION("position"),
    CHANNEL_ITEM_TYPE("channel_item_type"),
    CHANNEL_NAME("channel_name"),
    FLOW_TYPE("flow_type"),
    PAGE("page"),
    SEARCH_FAB_VARIANT("search_fab_variant"),
    ERROR_TYPE("error_type"),
    ERROR_MESSAGE(ResponseConstants.ERROR_MESSAGE),
    REFERRER(EtsyWebFragment.PARAM_REF),
    FEATURED_LISTING_IDS("featured_listing_ids"),
    MODULE_ABOUT_ENABLED("module_about_enabled"),
    MODULE_FEATURED_ITEMS_ENABLED("module_featured_items_enabled"),
    PAGE_SOLD_ITEMS_ENABLED("page_sold_items_enabled"),
    BRANDING_TYPE("branding_type"),
    SORT_OPTION_ID("sort_option_id"),
    NETWORK("network"),
    HASHTAGS("hashtags"),
    CHARACTER_COUNT("character_count"),
    TAXONOMY_ID(ResponseConstants.TAXONOMY_ID),
    LINK_CARD("link_card"),
    LINK_CARD_URL("link_card_url"),
    DEEP_LINK_ROW("deep_link_row"),
    DEEP_LINK_ROW_URL("deep_link_row_url"),
    ACTION(ResponseConstants.ACTION),
    TYPE("type"),
    SHIPPING_OPTION_ID("shipping_option_id"),
    TAB_NAME("tab_name"),
    NOTIFICATION_FEED_ID("notification_feed_id"),
    NOTIFICATION_FEED_INDEX("notification_feed_index"),
    UPDATES_TAB_CONTEXT("tab_context"),
    UPDATES_TAB_COUNT("total_num_of_updates"),
    UPDATES_SCROLL_DEPTH("scroll_depth"),
    BUTTON_PLACEMENT("button_placement"),
    AY11_SETTINGS_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED("ay11_settings_accessibility_display_inversion_enabled"),
    AY11_SETTINGS_TOUCH_EXPLORATION_ENABLED("ay11_settings_touch_exploration_enabled"),
    AY11_SETTINGS_FONT_SCALE("ay11_settings_font_scale"),
    NATIVE_PAYPAL_ERROR_MSG("paypal_error_msg"),
    RATING_VALUE("rating_value");
    
    public static final Parcelable.Creator<PredefinedAnalyticsProperty> CREATOR = null;
    public static final C8666a Companion = null;
    private final String propertyName;

    public static final class Creator implements Parcelable.Creator<PredefinedAnalyticsProperty> {
        public final PredefinedAnalyticsProperty createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return PredefinedAnalyticsProperty.valueOf(parcel.readString());
        }

        public final PredefinedAnalyticsProperty[] newArray(int i) {
            return new PredefinedAnalyticsProperty[i];
        }
    }

    /* renamed from: com.etsy.android.lib.logger.PredefinedAnalyticsProperty$a */
    public static final class C8666a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8666a();
        CREATOR = new Creator();
    }

    private PredefinedAnalyticsProperty(String str) {
        this.propertyName = str;
    }

    public int describeContents() {
        return 0;
    }

    public String readPropertyName() {
        String str = this.propertyName;
        Locale locale = Locale.US;
        return C0087d.m237g(locale, UserStateKt.US_COUNTRY, str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public String toString() {
        return readPropertyName();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(name());
    }
}
