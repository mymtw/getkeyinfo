package com.braze.push;

import com.appboy.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handlePushNotificationPayload$9 extends Lambda implements C19846a<String> {
    public final /* synthetic */ BrazeNotificationPayload $payload;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handlePushNotificationPayload$9(BrazeNotificationPayload brazeNotificationPayload) {
        super(0);
        this.$payload = brazeNotificationPayload;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$payload, "Creating notification with payload:\n");
    }
}
