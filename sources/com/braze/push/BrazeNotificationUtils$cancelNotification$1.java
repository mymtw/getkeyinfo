package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeNotificationUtils$cancelNotification$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $notificationId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$cancelNotification$1(int i) {
        super(0);
        this.$notificationId = i;
    }

    public final String invoke() {
        return C19383o.m32802l(Integer.valueOf(this.$notificationId), "Cancelling notification action with id: ");
    }
}
