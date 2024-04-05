package com.paypal.pyplcheckout.threeds;

import com.paypal.pyplcheckout.pojo.ThreeDSLookUpResponse;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow", mo70541f = "ThreeDSDecisionFlow.kt", mo70542l = {409}, mo70543m = "threeDS10StepUp")
public final class ThreeDSDecisionFlow$threeDS10StepUp$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ThreeDSDecisionFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSDecisionFlow$threeDS10StepUp$1(ThreeDSDecisionFlow threeDSDecisionFlow, C19340c<? super ThreeDSDecisionFlow$threeDS10StepUp$1> cVar) {
        super(cVar);
        this.this$0 = threeDSDecisionFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.threeDS10StepUp((String) null, (String) null, (ThreeDSLookUpResponse) null, this);
    }
}
