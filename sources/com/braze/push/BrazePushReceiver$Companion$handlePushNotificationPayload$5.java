package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handlePushNotificationPayload$5 extends Lambda implements C19846a<String> {
    public static final BrazePushReceiver$Companion$handlePushNotificationPayload$5 INSTANCE = new BrazePushReceiver$Companion$handlePushNotificationPayload$5();

    public BrazePushReceiver$Companion$handlePushNotificationPayload$5() {
        super(0);
    }

    public final String invoke() {
        return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
    }
}
