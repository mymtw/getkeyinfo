package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setSmallIcon$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$setSmallIcon$1 INSTANCE = new BrazeNotificationUtils$setSmallIcon$1();

    public BrazeNotificationUtils$setSmallIcon$1() {
        super(0);
    }

    public final String invoke() {
        return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
    }
}
