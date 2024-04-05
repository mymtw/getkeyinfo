package com.braze.push;

import android.content.Intent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$1 */
public final class C5517x5d7a691b extends Lambda implements C19846a<String> {
    public final /* synthetic */ Intent $intent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5517x5d7a691b(Intent intent) {
        super(0);
        this.$intent = intent;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$intent, "Received ADM registration. Message: ");
    }
}
