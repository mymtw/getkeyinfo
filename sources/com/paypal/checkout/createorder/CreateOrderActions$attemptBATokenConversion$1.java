package com.paypal.checkout.createorder;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.checkout.createorder.CreateOrderActions", mo70541f = "CreateOrderActions.kt", mo70542l = {73}, mo70543m = "attemptBATokenConversion")
public final class CreateOrderActions$attemptBATokenConversion$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreateOrderActions this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateOrderActions$attemptBATokenConversion$1(CreateOrderActions createOrderActions, C19340c<? super CreateOrderActions$attemptBATokenConversion$1> cVar) {
        super(cVar);
        this.this$0 = createOrderActions;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.attemptBATokenConversion((String) null, this);
    }
}
