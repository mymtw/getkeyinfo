package com.braze.push;

import com.google.firebase.messaging.RemoteMessage;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$1 */
public final class C5502xe25b0a02 extends Lambda implements C19846a<String> {
    public final /* synthetic */ RemoteMessage $remoteMessage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5502xe25b0a02(RemoteMessage remoteMessage) {
        super(0);
        this.$remoteMessage = remoteMessage;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$remoteMessage, "Remote message did not originate from Braze. Not consuming remote message: ");
    }
}
