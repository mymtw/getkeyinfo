package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$logBaiduNotificationClick$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ String $customContentString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$logBaiduNotificationClick$3(String str) {
        super(0);
        this.$customContentString = str;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$customContentString, "Caught an exception processing customContentString: ");
    }
}
