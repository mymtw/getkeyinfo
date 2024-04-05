package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$isUninstallTrackingPush$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$isUninstallTrackingPush$1 INSTANCE = new BrazeNotificationUtils$isUninstallTrackingPush$1();

    public BrazeNotificationUtils$isUninstallTrackingPush$1() {
        super(0);
    }

    public final String invoke() {
        return "Failed to determine if push is uninstall tracking. Returning false.";
    }
}
