package com.paypal.pyplcheckout.threeds;

import android.app.Activity;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow", mo70541f = "ThreeDSDecisionFlow.kt", mo70542l = {339, 383, 384}, mo70543m = "decisioningFlow")
public final class ThreeDSDecisionFlow$decisioningFlow$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ThreeDSDecisionFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSDecisionFlow$decisioningFlow$1(ThreeDSDecisionFlow threeDSDecisionFlow, C19340c<? super ThreeDSDecisionFlow$decisioningFlow$1> cVar) {
        super(cVar);
        this.this$0 = threeDSDecisionFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decisioningFlow((Activity) null, this);
    }
}
