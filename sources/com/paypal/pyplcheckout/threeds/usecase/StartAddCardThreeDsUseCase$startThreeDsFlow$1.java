package com.paypal.pyplcheckout.threeds.usecase;

import android.app.Activity;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase", mo70541f = "StartAddCardThreeDsUseCase.kt", mo70542l = {65}, mo70543m = "startThreeDsFlow")
public final class StartAddCardThreeDsUseCase$startThreeDsFlow$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StartAddCardThreeDsUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartAddCardThreeDsUseCase$startThreeDsFlow$1(StartAddCardThreeDsUseCase startAddCardThreeDsUseCase, C19340c<? super StartAddCardThreeDsUseCase$startThreeDsFlow$1> cVar) {
        super(cVar);
        this.this$0 = startAddCardThreeDsUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startThreeDsFlow((Activity) null, (String) null, this);
    }
}
