package com.etsy.android.lib.push.registration;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class FCMPushRegistration$unregisterWithEtsy$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ FCMPushRegistration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FCMPushRegistration$unregisterWithEtsy$2(FCMPushRegistration fCMPushRegistration) {
        super(0);
        this.this$0 = fCMPushRegistration;
    }

    public final void invoke() {
        this.this$0.f19400e.mo45475b("notification_token.unregister_token", 0.1d);
    }
}
