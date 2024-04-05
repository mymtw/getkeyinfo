package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeFirebaseMessagingService$onNewToken$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $newToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeFirebaseMessagingService$onNewToken$1(String str) {
        super(0);
        this.$newToken = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$newToken, "No configured API key, not registering token in onNewToken. Token: ");
    }
}
