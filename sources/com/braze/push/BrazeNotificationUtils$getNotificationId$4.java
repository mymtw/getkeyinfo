package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$getNotificationId$4 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $notificationId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$getNotificationId$4(int i) {
        super(0);
        this.$notificationId = i;
    }

    public final String invoke() {
        return C19383o.m32802l(Integer.valueOf(this.$notificationId), "Message without notification id provided in the extras bundle received. Using a hash of the message: ");
    }
}
