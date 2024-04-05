package com.etsy.android.lib.util;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;

public enum NotificationType {
    UNKNOWN("", 0),
    CONVERSATION(ResponseConstants.CONVO, 1),
    SOLD_ORDER("sold_order", 2),
    BLAST("blast", 0),
    SHIPPING("shipping", 4),
    ETSY_ANNOUNCEMENT("etsy_announcements", 0),
    FOLLOWING("following", 0),
    CONTACT_ON_ETSY("contact_on_etsy", 0),
    RESERVED_LISTING("reserved_listing", 0),
    BUYER_REVIEW_AVAILABLE("review_available", 10),
    BUYER_LEFT_REVIEW("buyer_leaves_review", 11),
    BUYER_FAVORITE("buyer_favorites_listing", 12),
    BUYER_FAVORITES_SHOP("buyer_favorites_shop", 12),
    PROMOTED_OFFER("promoted_offer", 26),
    ABOUT_VIDEO_UPLOAD("about_video_upload", 30),
    UNSEEN_UPDATES("updates_unseen", 31),
    EVENT_HORIZON("event_horizon", 98),
    ADMIN_TOOLBAR("admin_toolbar", 99);
    
    public static final C8877a Companion = null;
    /* access modifiers changed from: private */
    public static final C19285c<Map<String, NotificationType>> typeMap$delegate = null;

    /* renamed from: id */
    private final int f19623id;
    private final String type;

    /* renamed from: com.etsy.android.lib.util.NotificationType$a */
    public static final class C8877a {
        /* renamed from: a */
        public static NotificationType m17313a(String str) {
            if (str != null) {
                NotificationType.Companion.getClass();
                NotificationType notificationType = (NotificationType) ((Map) NotificationType.typeMap$delegate.getValue()).get(str);
                if (notificationType != null) {
                    return notificationType;
                }
            }
            return NotificationType.UNKNOWN;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8877a();
        typeMap$delegate = C19350d.m32677b(NotificationType$Companion$typeMap$2.INSTANCE);
    }

    private NotificationType(String str, int i) {
        this.type = str;
        this.f19623id = i;
    }

    public static final NotificationType fromString(String str) {
        Companion.getClass();
        return C8877a.m17313a(str);
    }

    public final int getId() {
        return this.f19623id;
    }

    public final String getType() {
        return this.type;
    }
}
