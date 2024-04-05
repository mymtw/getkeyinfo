package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeNotificationUtils$getOrCreateNotificationChannelId$3 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$getOrCreateNotificationChannelId$3 INSTANCE = new BrazeNotificationUtils$getOrCreateNotificationChannelId$3();

    public BrazeNotificationUtils$getOrCreateNotificationChannelId$3() {
        super(0);
    }

    public final String invoke() {
        return "Braze default notification channel does not exist on device. Creating default channel.";
    }
}
