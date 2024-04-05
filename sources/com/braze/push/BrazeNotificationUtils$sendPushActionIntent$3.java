package com.braze.push;

import android.content.Intent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$sendPushActionIntent$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Intent $pushIntent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$sendPushActionIntent$3(Intent intent) {
        super(0);
        this.$pushIntent = intent;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$pushIntent, "Sending push action intent: ");
    }
}
