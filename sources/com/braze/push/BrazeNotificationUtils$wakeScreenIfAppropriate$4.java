package com.braze.push;

import android.app.NotificationChannel;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$wakeScreenIfAppropriate$4 extends Lambda implements C19846a<String> {
    public final /* synthetic */ NotificationChannel $notificationChannel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$wakeScreenIfAppropriate$4(NotificationChannel notificationChannel) {
        super(0);
        this.$notificationChannel = notificationChannel;
    }

    public final String invoke() {
        return C19383o.m32802l(Integer.valueOf(this.$notificationChannel.getImportance()), "Not acquiring wake-lock for Android O+ notification with importance: ");
    }
}
