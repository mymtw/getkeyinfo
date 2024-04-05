package com.etsy.android.p327ui.conversation.details.models;

/* renamed from: com.etsy.android.ui.conversation.details.models.MessageSource */
public enum MessageSource {
    LISTING_PAGE("listing_page"),
    PRIVATE_LISTING_REQUEST("private_listing"),
    ORDER_HELP_REQUEST("order_help_request"),
    AUTO_REPLY("auto_reply"),
    CUSTOM_SHOP_LISTING_PAGE("custom_shop_listing"),
    CUSTOM_SHOP_ORDER_EMAIL("custom_shop_email"),
    CUSTOM_SHOP_CONTACT_FORM("custom_shop_contact"),
    ORDER_PAGE("order_page"),
    ATLAS_MASS_CONVERSATIONS("atlas_mass_convos"),
    POST_PURCHASE_CONVERSATIONS("post_purchase_convos"),
    HELP_WITH_ORDER_FEEDBACK_LOOP("still_need_hwo"),
    NONE("none");
    
    public static final C9557a Companion = null;
    private final String source;

    /* renamed from: com.etsy.android.ui.conversation.details.models.MessageSource$a */
    public static final class C9557a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C9557a();
    }

    private MessageSource(String str) {
        this.source = str;
    }

    public final String getSource() {
        return this.source;
    }
}
