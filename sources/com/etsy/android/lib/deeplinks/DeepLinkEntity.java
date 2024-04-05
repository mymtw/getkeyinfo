package com.etsy.android.lib.deeplinks;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19456j;

public enum DeepLinkEntity {
    CONVERSATION("conversation", 1, false),
    CONVERSATIONS("conversations", -1, false),
    CONVERSATION_COMPOSE("conversation_compose", -1, false),
    ORDER(ResponseConstants.ORDER, 2, false),
    LISTING(ResponseConstants.LISTING, 3, false),
    LISTINGS_SIMILAR("similar", -1, true),
    LISTING_COLLECTION("listing-collection", -1, true),
    SHOP(ResponseConstants.SHOP, 4, true),
    SHOP_POLICY("policy", 5, true),
    PEOPLE("people", 6, true),
    RECEIPT("receipt", 8, false),
    CART("cart", 9, false),
    HOME("etsy.com", 10, true),
    HOMESCREEN("home", -1, false),
    CREATE_REVIEW("create-review", 11, false),
    TRACK_ORDER("track_order", 15, false),
    HELP("help", -1, false),
    SEARCH("search", -1, true),
    TAXONOMY_CATEGORY("c", -1, true),
    MARKET("market", -1, true),
    BROWSE("browse", -1, true),
    SHOP_ABOUT("about", -1, true),
    SHOP_REVIEWS(ResponseConstants.REVIEWS, -1, true),
    SHOP_FAVORITE("favorite", -1, false),
    SHOP_LISTING_FAVORITES("shop_listing_favorites", 13, true),
    SHOP_FAVORITES("shop_favorites", 14, true),
    ALL_CONVOS("all_convos", -1, false),
    PURCHASES("purchases", -1, false),
    YOUR("your", -1, false),
    SALES("sales", -1, false),
    COMPOSE_REVIEW("compose_review", -1, false),
    FEATURED("featured", -1, true),
    FEATURED_HUB("hub", -1, true),
    LISTING_LANDING_PAGE("listing-landing-page", -1, false),
    BUY_GIFT_CARD("buy-gift-card", -1, false),
    VESPA_DEMO_PAGE("vespa_demo_page", -1, false),
    VESPA_ARBITRARY_DEMO_PAGE("vespa_arbitrary_demo_page", -1, false),
    CREATE_GIFT_CARD("giftcards", -1, false),
    PUSH_NOTIFICATION_SETTINGS("push-notification-settings", -1, false),
    CURRENCY_SETTINGS("currency-settings", -1, false),
    LANDING_PAGE("landing-page", -1, false),
    REGISTER("register", -1, false),
    SIGN_IN("sign-in", -1, false),
    TRANSACTION("transaction", -1, false),
    SIGN_IN_AS("sign-in-as", -1, false),
    FAVORITES(Collection.TYPE_FAVORITES, -1, false),
    FAVORITE_ITEMS(ResponseConstants.ITEMS, -1, false),
    FAVORITE_SHOPS("shops", -1, false),
    FAVORITE_SEARCHES("searches", -1, false),
    CYBER_WEEK_SALES("cyber-week-sales", -1, false),
    REDEEM_ETSY_COUPON("redeem-etsy-coupon", -1, false),
    UPDATES("updates", 25, false),
    PROMOTED_OFFERS("promoted-offers", -1, false),
    ORDERS("orders", -1, false),
    ORDER_TRACKING("order_tracking", -1, false),
    REVIEW("review", -1, false),
    SWEEPSTAKES("sweepstakes", -1, false),
    CATEGORY(ResponseConstants.CATEGORY, -1, false),
    CLAIM("claim", -1, false),
    MAGIC_LINK("magic", -1, false);
    
    public static final C8657a Companion = null;
    private static final int MAX_NOTIFICATION_ID = 26;
    /* access modifiers changed from: private */
    public static final Map<String, DeepLinkEntity> map = null;
    /* access modifiers changed from: private */
    public static final DeepLinkEntity[] notificationIds = null;
    private final boolean allowStringIds;
    private final String entityName;
    private final int pushNotificationId;

    /* renamed from: com.etsy.android.lib.deeplinks.DeepLinkEntity$a */
    public static final class C8657a {
        /* renamed from: a */
        public static DeepLinkEntity m17039a(String str) {
            C19383o.m32797g(str, "entityName");
            return (DeepLinkEntity) DeepLinkEntity.map.get(str);
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8657a();
        map = new HashMap();
        notificationIds = new DeepLinkEntity[27];
        for (DeepLinkEntity deepLinkEntity : values()) {
            map.put(deepLinkEntity.entityName, deepLinkEntity);
            int i = deepLinkEntity.pushNotificationId;
            if (i >= 0) {
                notificationIds[i] = deepLinkEntity;
            }
        }
    }

    private DeepLinkEntity(String str, int i, boolean z) {
        this.entityName = str;
        this.pushNotificationId = i;
        this.allowStringIds = z;
    }

    public static final DeepLinkEntity fromEntityName(String str) {
        Companion.getClass();
        return C8657a.m17039a(str);
    }

    public static final DeepLinkEntity fromPushNotificationId(String str) {
        Companion.getClass();
        Integer T0 = str != null ? C19456j.m33016T0(str) : null;
        if (T0 == null) {
            return HOME;
        }
        int intValue = T0.intValue();
        return (intValue <= 0 || intValue >= notificationIds.length) ? HOME : notificationIds[intValue];
    }

    public final boolean allowsStringIds() {
        return this.allowStringIds;
    }

    public final String getEntityName() {
        return this.entityName;
    }
}
