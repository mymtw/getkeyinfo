package com.paypal.platform.authsdk.partnerauth.lls.p537ui;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.platform.authsdk.partnerauth.lls.ui.PartnerAuthLLSHandler", mo70541f = "PartnerAuthLLSHandler.kt", mo70542l = {68}, mo70543m = "handleChallenge")
/* renamed from: com.paypal.platform.authsdk.partnerauth.lls.ui.PartnerAuthLLSHandler$handleChallenge$1 */
public final class PartnerAuthLLSHandler$handleChallenge$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PartnerAuthLLSHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PartnerAuthLLSHandler$handleChallenge$1(PartnerAuthLLSHandler partnerAuthLLSHandler, C19340c<? super PartnerAuthLLSHandler$handleChallenge$1> cVar) {
        super(cVar);
        this.this$0 = partnerAuthLLSHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handleChallenge((Challenge) null, this);
    }
}
