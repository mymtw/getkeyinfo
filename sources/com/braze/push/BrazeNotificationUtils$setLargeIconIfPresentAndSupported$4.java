package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4 INSTANCE = new BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4();

    public BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4() {
        super(0);
    }

    public final String invoke() {
        return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
    }
}
