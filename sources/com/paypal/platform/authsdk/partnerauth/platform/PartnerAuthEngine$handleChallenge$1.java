package com.paypal.platform.authsdk.partnerauth.platform;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.platform.authsdk.partnerauth.platform.PartnerAuthEngine", mo70541f = "PartnerAuthEngine.kt", mo70542l = {32}, mo70543m = "handleChallenge")
public final class PartnerAuthEngine$handleChallenge$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PartnerAuthEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PartnerAuthEngine$handleChallenge$1(PartnerAuthEngine partnerAuthEngine, C19340c<? super PartnerAuthEngine$handleChallenge$1> cVar) {
        super(cVar);
        this.this$0 = partnerAuthEngine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo62605a((Challenge) null, this);
    }
}
