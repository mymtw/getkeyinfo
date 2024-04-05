package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setNotificationBadgeNumberIfPresent$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$setNotificationBadgeNumberIfPresent$1 INSTANCE = new BrazeNotificationUtils$setNotificationBadgeNumberIfPresent$1();

    public BrazeNotificationUtils$setNotificationBadgeNumberIfPresent$1() {
        super(0);
    }

    public final String invoke() {
        return "Notification badge number not supported on this android version. Not setting badge number for notification.";
    }
}
