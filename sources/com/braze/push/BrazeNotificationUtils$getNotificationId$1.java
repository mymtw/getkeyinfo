package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$getNotificationId$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Integer $customNotificationId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$getNotificationId$1(Integer num) {
        super(0);
        this.$customNotificationId = num;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$customNotificationId, "Using notification id provided in the message's extras bundle: ");
    }
}
