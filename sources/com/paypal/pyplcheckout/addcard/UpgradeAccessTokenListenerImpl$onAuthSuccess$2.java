package com.paypal.pyplcheckout.addcard;

import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class UpgradeAccessTokenListenerImpl$onAuthSuccess$2 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ UpgradeAccessTokenListenerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpgradeAccessTokenListenerImpl$onAuthSuccess$2(UpgradeAccessTokenListenerImpl upgradeAccessTokenListenerImpl) {
        super(1);
        this.this$0 = upgradeAccessTokenListenerImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        this.this$0.handleSuccess(str);
    }
}
