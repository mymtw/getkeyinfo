package com.braze.push;

import com.braze.push.BrazeNotificationUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeNotificationUtils$sendPushActionIntent$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ BrazeNotificationUtils.BrazeNotificationBroadcastType $broadcastType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$sendPushActionIntent$2(BrazeNotificationUtils.BrazeNotificationBroadcastType brazeNotificationBroadcastType) {
        super(0);
        this.$broadcastType = brazeNotificationBroadcastType;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$broadcastType, "Sending Braze broadcast receiver intent for ");
    }
}
