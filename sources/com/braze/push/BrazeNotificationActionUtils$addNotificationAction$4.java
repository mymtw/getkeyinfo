package com.braze.push;

import android.os.Bundle;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationActionUtils$addNotificationAction$4 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Bundle $actionExtras;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationActionUtils$addNotificationAction$4(Bundle bundle) {
        super(0);
        this.$actionExtras = bundle;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$actionExtras, "Added action with bundle: ");
    }
}
