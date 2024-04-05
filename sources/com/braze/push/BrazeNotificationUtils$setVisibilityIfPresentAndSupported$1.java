package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setVisibilityIfPresentAndSupported$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$setVisibilityIfPresentAndSupported$1 INSTANCE = new BrazeNotificationUtils$setVisibilityIfPresentAndSupported$1();

    public BrazeNotificationUtils$setVisibilityIfPresentAndSupported$1() {
        super(0);
    }

    public final String invoke() {
        return "Notification visibility not supported on this android version. Not setting visibility for notification.";
    }
}
