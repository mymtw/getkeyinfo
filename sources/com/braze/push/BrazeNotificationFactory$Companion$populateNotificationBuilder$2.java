package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeNotificationFactory$Companion$populateNotificationBuilder$2 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationFactory$Companion$populateNotificationBuilder$2 INSTANCE = new BrazeNotificationFactory$Companion$populateNotificationBuilder$2();

    public BrazeNotificationFactory$Companion$populateNotificationBuilder$2() {
        super(0);
    }

    public final String invoke() {
        return "BrazeNotificationPayload has null context. Not creating notification";
    }
}
