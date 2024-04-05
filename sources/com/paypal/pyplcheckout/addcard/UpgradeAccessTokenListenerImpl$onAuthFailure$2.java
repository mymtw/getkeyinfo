package com.paypal.pyplcheckout.addcard;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class UpgradeAccessTokenListenerImpl$onAuthFailure$2 extends Lambda implements C19861p<Exception, String, C19394m> {
    public final /* synthetic */ UpgradeAccessTokenListenerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpgradeAccessTokenListenerImpl$onAuthFailure$2(UpgradeAccessTokenListenerImpl upgradeAccessTokenListenerImpl) {
        super(2);
        this.this$0 = upgradeAccessTokenListenerImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Exception) obj, (String) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Exception exc, String str) {
        C19383o.m32797g(exc, "exception");
        C19383o.m32797g(str, "message");
        this.this$0.handleFailure(exc, str);
    }
}
