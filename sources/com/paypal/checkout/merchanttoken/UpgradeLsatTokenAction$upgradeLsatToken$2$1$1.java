package com.paypal.checkout.merchanttoken;

import com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class UpgradeLsatTokenAction$upgradeLsatToken$2$1$1 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ C19340c<UpgradeLsatTokenResponse> $continuation;
    public final /* synthetic */ String $lsatToken;
    public final /* synthetic */ UpgradeLsatTokenAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpgradeLsatTokenAction$upgradeLsatToken$2$1$1(C19340c<? super UpgradeLsatTokenResponse> cVar, String str, UpgradeLsatTokenAction upgradeLsatTokenAction) {
        super(1);
        this.$continuation = cVar;
        this.$lsatToken = str;
        this.this$0 = upgradeLsatTokenAction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.$continuation.resumeWith(Result.m35480constructorimpl(new UpgradeLsatTokenResponse.Success(this.$lsatToken)));
            return;
        }
        this.this$0.logError("fetchLsatUpgradeStatus failed.");
        this.$continuation.resumeWith(Result.m35480constructorimpl(UpgradeLsatTokenResponse.Failed.INSTANCE));
    }
}
