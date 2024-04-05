package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setCategoryIfPresentAndSupported$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$setCategoryIfPresentAndSupported$1 INSTANCE = new BrazeNotificationUtils$setCategoryIfPresentAndSupported$1();

    public BrazeNotificationUtils$setCategoryIfPresentAndSupported$1() {
        super(0);
    }

    public final String invoke() {
        return "Notification category not supported on this android version. Not setting category for notification.";
    }
}
