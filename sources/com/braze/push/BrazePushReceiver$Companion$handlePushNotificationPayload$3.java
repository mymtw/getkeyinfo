package com.braze.push;

import android.os.Bundle;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handlePushNotificationPayload$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Bundle $notificationExtras;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handlePushNotificationPayload$3(Bundle bundle) {
        super(0);
        this.$notificationExtras = bundle;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$notificationExtras, "Push message payload received: ");
    }
}
