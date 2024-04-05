package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handlePushNotificationPayload$4 extends Lambda implements C19846a<String> {
    public static final BrazePushReceiver$Companion$handlePushNotificationPayload$4 INSTANCE = new BrazePushReceiver$Companion$handlePushNotificationPayload$4();

    public BrazePushReceiver$Companion$handlePushNotificationPayload$4() {
        super(0);
    }

    public final String invoke() {
        return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
    }
}
