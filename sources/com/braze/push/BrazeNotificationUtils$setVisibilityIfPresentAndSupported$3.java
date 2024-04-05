package com.braze.push;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

final class BrazeNotificationUtils$setVisibilityIfPresentAndSupported$3 extends Lambda implements C19846a<String> {
    public final /* synthetic */ Integer $visibility;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeNotificationUtils$setVisibilityIfPresentAndSupported$3(Integer num) {
        super(0);
        this.$visibility = num;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$visibility, "Received invalid notification visibility ");
    }
}
