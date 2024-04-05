package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$getValidNotificationChannel$4 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$getValidNotificationChannel$4 INSTANCE = new BrazeNotificationUtils$getValidNotificationChannel$4();

    public BrazeNotificationUtils$getValidNotificationChannel$4() {
        super(0);
    }

    public final String invoke() {
        return "Braze default notification channel does not exist on device.";
    }
}
