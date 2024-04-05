package com.braze.push;

import androidx.core.app.NotificationManagerCompat;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handlePushNotificationPayload$11 extends Lambda implements C19846a<String> {
    public final /* synthetic */ NotificationManagerCompat $notificationManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handlePushNotificationPayload$11(NotificationManagerCompat notificationManagerCompat) {
        super(0);
        this.$notificationManager = notificationManagerCompat;
    }

    public final String invoke() {
        return C19383o.m32802l(Boolean.valueOf(this.$notificationManager.areNotificationsEnabled()), "Value of notificationManager.areNotificationsEnabled() = ");
    }
}
