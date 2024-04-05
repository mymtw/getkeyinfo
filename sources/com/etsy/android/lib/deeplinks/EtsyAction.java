package com.etsy.android.lib.deeplinks;

import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import java.util.HashMap;

public enum EtsyAction {
    VIEW("com.etsy.android.action.VIEW", (int) null),
    VIEW_FEED("com.etsy.android.action.VIEW", "feed"),
    FOLLOW("com.etsy.android.action.FOLLOW", "follow"),
    CONTACT_USER("com.etsy.android.action.CONTACT", "contact"),
    FAVORITE("com.etsy.android.action.FAVORITE", "favorite"),
    FAVORITE_SHOP("com.etsy.android.action.FAVORITE_SHOP", "favorite_shop"),
    ADD_TO_CART("com.etsy.android.action.ADD_TO_CART", "add_to_cart"),
    MANAGE_ITEM_COLLECTIONS("com.etsy.android.action.ADD_TO_COLLECTION", "manage_item_collections"),
    PURCHASE("com.etsy.android.action.PURCHASE", "purchase"),
    PURCHASE_GPAY("com.etsy.android.action.PURCHASE_GPAY", "purchase_gpay"),
    STATE_CHANGE("com.etsy.android.STATE_CHANGE", "state_changed"),
    VIEW_ORDER("com.etsy.android.action.VIEW_ORDER", "view_order"),
    VIEW_PURCHASES("com.etsy.android.action.VIEW_PURCHASES", "view_purchases"),
    SUBSCRIBE_VACATION_NOTIFICATION("com.etsy.android.action.SUBSCRIBE_VACATION_NOTIFICATION", "subscribe_vacation_notification"),
    CART_COUNTS_UPDATED("com.etsy.android.action.CART_COUNTS_UPDATED", "cart_counts_updated"),
    CART_ACTION("com.etsy.android.action.CART_ACTION", "cart_action"),
    SHOW_ORDER_RELATED_HELP("com.etsy.android.action.SHOW_ORDER_RELATED_HELP", "show_order_related_help"),
    COLLECTION_EDITED("com.etsy.android.action.COLLECTION_EDITED", "collection_edited"),
    COLLECTION_DELETED("com.etsy.android.action.COLLECTION_DELETED", "collection_deleted"),
    GOOGLE_PAY_RESULT("com.etsy.android.action.GOOGLE_PAY_RESULT", "google_pay_result"),
    REPORT_LISTING("com.etsy.android.action.REPORT_LISTING", UserAction.TYPE_REPORT_LISTING),
    PURCHASE_REVIEW("com.etsy.android.action.PURCHASE_REVIEW", "purchase_review"),
    APPLY_COUPON("com.etsy.android.action.APPLY_COUPON", ServerDrivenAction.TYPE_APPLY_COUPON),
    VIEW_COUPON_BANNER("com.etsy.android.action.VIEW_COUPON_BANNER", "view_coupon_banner"),
    CLAIM_PURCHASE("com.etsy.android.action.CLAIM_PURCHASE", "claim_purchase");
    
    public static final String ACTION_TYPE_NAME = "etsy_action_type";
    public static final C8658a Companion = null;
    public static final String STATE_COLLECTIONS = "col";
    public static final String STATE_FAVORITE = "fav";
    public static final String STATE_ID = "id";
    /* access modifiers changed from: private */
    public static final HashMap<String, EtsyAction> intentActions = null;
    /* access modifiers changed from: private */
    public static final HashMap<String, EtsyAction> types = null;
    private final String intentAction;
    private final String type;

    /* renamed from: com.etsy.android.lib.deeplinks.EtsyAction$a */
    public static final class C8658a {
    }

    /* access modifiers changed from: public */
    static {
        int i;
        Companion = new C8658a();
        intentActions = new HashMap<>();
        types = new HashMap<>();
        for (EtsyAction etsyAction : values()) {
            intentActions.put(etsyAction.intentAction, etsyAction);
            types.put(etsyAction.type, etsyAction);
        }
    }

    private EtsyAction(String str, String str2) {
        this.intentAction = str;
        this.type = str2;
    }

    public static final EtsyAction fromIntentAction(String str) {
        Companion.getClass();
        return (EtsyAction) intentActions.get(str);
    }

    public static final EtsyAction fromType(String str) {
        Companion.getClass();
        return (EtsyAction) types.get(str);
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public final String getType() {
        return this.type;
    }
}
