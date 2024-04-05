package com.braze.push;

import android.content.Intent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Intent $mainActivityIntent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$3(Intent intent) {
        super(0);
        this.$mainActivityIntent = intent;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$mainActivityIntent, "Push notification had no deep link. Opening main activity: ");
    }
}
