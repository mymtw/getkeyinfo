package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeFirebaseMessagingService$onNewToken$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $newToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeFirebaseMessagingService$onNewToken$2(String str) {
        super(0);
        this.$newToken = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$newToken, "Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: ");
    }
}
