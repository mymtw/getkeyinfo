package com.braze.push;

import com.appboy.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ BrazeNotificationPayload $publicPayload;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$2(BrazeNotificationPayload brazeNotificationPayload) {
        super(0);
        this.$publicPayload = brazeNotificationPayload;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$publicPayload, "Setting public version of notification with payload: ");
    }
}
