package com.braze.push;

import android.content.Intent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazePushReceiver$Companion$handlePush$performWork$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Intent $intent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handlePush$performWork$1(Intent intent) {
        super(0);
        this.$intent = intent;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$intent, "Received broadcast message. Message: ");
    }
}
