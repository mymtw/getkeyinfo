package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setCategoryIfPresentAndSupported$3 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$setCategoryIfPresentAndSupported$3 INSTANCE = new BrazeNotificationUtils$setCategoryIfPresentAndSupported$3();

    public BrazeNotificationUtils$setCategoryIfPresentAndSupported$3() {
        super(0);
    }

    public final String invoke() {
        return "Category not present in notification extras. Not setting category for notification.";
    }
}
