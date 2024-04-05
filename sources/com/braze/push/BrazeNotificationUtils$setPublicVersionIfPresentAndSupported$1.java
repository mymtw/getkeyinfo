package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1 INSTANCE = new BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1();

    public BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$1() {
        super(0);
    }

    public final String invoke() {
        return "Cannot set public version before Lollipop";
    }
}
