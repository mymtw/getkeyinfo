package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handleAdmRegistrationIntent$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $registrationId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleAdmRegistrationIntent$2(String str) {
        super(0);
        this.$registrationId = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$registrationId, "Registering for ADM messages with registrationId: ");
    }
}
