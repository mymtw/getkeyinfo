package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$wakeScreenIfAppropriate$3 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$wakeScreenIfAppropriate$3 INSTANCE = new BrazeNotificationUtils$wakeScreenIfAppropriate$3();

    public BrazeNotificationUtils$wakeScreenIfAppropriate$3() {
        super(0);
    }

    public final String invoke() {
        return "Not waking screen on Android O+ device, could not find notification channel.";
    }
}
