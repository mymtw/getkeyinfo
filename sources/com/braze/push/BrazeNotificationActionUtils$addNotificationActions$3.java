package com.braze.push;

import com.appboy.models.push.BrazeNotificationPayload;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationActionUtils$addNotificationActions$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ BrazeNotificationPayload.ActionButton $actionButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationActionUtils$addNotificationActions$3(BrazeNotificationPayload.ActionButton actionButton) {
        super(0);
        this.$actionButton = actionButton;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$actionButton, "Adding action button: ");
    }
}
