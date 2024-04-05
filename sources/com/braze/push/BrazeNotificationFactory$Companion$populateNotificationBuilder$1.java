package com.braze.push;

import com.appboy.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeNotificationFactory$Companion$populateNotificationBuilder$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ BrazeNotificationPayload $payload;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationFactory$Companion$populateNotificationBuilder$1(BrazeNotificationPayload brazeNotificationPayload) {
        super(0);
        this.$payload = brazeNotificationPayload;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$payload, "Using BrazeNotificationPayload: ");
    }
}
