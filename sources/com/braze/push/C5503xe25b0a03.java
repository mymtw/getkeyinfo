package com.braze.push;

import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$2 */
public final class C5503xe25b0a03 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Map<String, String> $remoteMessageData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5503xe25b0a03(Map<String, String> map) {
        super(0);
        this.$remoteMessageData = map;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$remoteMessageData, "Got remote message from FCM: ");
    }
}
