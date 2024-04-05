package com.braze.p044ui;

import com.braze.IBrazeDeeplinkHandler;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.ui.BrazeDeeplinkHandler$Companion$setBrazeDeeplinkHandler$1 */
final class BrazeDeeplinkHandler$Companion$setBrazeDeeplinkHandler$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ IBrazeDeeplinkHandler $brazeDeeplinkHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrazeDeeplinkHandler$Companion$setBrazeDeeplinkHandler$1(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
        super(0);
        this.$brazeDeeplinkHandler = iBrazeDeeplinkHandler;
    }

    public final String invoke() {
        return C19383o.m32802l(this.$brazeDeeplinkHandler == null ? "cleared" : "set", "Custom IBrazeDeeplinkHandler ");
    }
}
