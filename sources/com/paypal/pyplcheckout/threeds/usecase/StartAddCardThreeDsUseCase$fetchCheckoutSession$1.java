package com.paypal.pyplcheckout.threeds.usecase;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase", mo70541f = "StartAddCardThreeDsUseCase.kt", mo70542l = {83, 93}, mo70543m = "fetchCheckoutSession")
public final class StartAddCardThreeDsUseCase$fetchCheckoutSession$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StartAddCardThreeDsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartAddCardThreeDsUseCase$fetchCheckoutSession$1(StartAddCardThreeDsUseCase startAddCardThreeDsUseCase, C19340c<? super StartAddCardThreeDsUseCase$fetchCheckoutSession$1> cVar) {
        super(cVar);
        this.this$0 = startAddCardThreeDsUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchCheckoutSession((String) null, this);
    }
}
