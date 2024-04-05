package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$getValidNotificationChannel$1 extends Lambda implements C19846a<String> {
    public static final BrazeNotificationUtils$getValidNotificationChannel$1 INSTANCE = new BrazeNotificationUtils$getValidNotificationChannel$1();

    public BrazeNotificationUtils$getValidNotificationChannel$1() {
        super(0);
    }

    public final String invoke() {
        return "Notification extras bundle was null. Could not find a valid notification channel";
    }
}
