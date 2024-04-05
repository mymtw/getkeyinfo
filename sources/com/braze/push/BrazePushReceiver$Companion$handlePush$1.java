package com.braze.push;

import android.content.Intent;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazePushReceiver$Companion$handlePush$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $action;
    public final /* synthetic */ Intent $intent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handlePush$1(String str, Intent intent) {
        super(0);
        this.$action = str;
        this.$intent = intent;
    }

    public final String invoke() {
        StringBuilder h = C0072d.m201h("Caught exception while performing the push notification handling work. Action: ");
        h.append(this.$action);
        h.append(" Intent: ");
        h.append(this.$intent);
        return h.toString();
    }
}
