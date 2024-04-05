package com.paypal.platform.authsdk.partnerauth.platform;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthChallengeRouter", mo70541f = "PartnerAuthChallengeRouter.kt", mo70542l = {88, 87, 95, 94, 100, 99}, mo70543m = "delegateChallenge")
public final class PartnerAuthChallengeRouter$delegateChallenge$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PartnerAuthChallengeRouter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PartnerAuthChallengeRouter$delegateChallenge$1(PartnerAuthChallengeRouter partnerAuthChallengeRouter, C19340c<? super PartnerAuthChallengeRouter$delegateChallenge$1> cVar) {
        super(cVar);
        this.this$0 = partnerAuthChallengeRouter;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo62602c((Challenge) null, this);
    }
}
