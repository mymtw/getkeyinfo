package com.paypal.checkout.merchanttoken;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.checkout.merchanttoken.CreateLsatTokenAction", mo70541f = "CreateLsatTokenAction.kt", mo70542l = {60, 66, 67}, mo70543m = "getResponse")
public final class CreateLsatTokenAction$getResponse$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreateLsatTokenAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateLsatTokenAction$getResponse$1(CreateLsatTokenAction createLsatTokenAction, C19340c<? super CreateLsatTokenAction$getResponse$1> cVar) {
        super(cVar);
        this.this$0 = createLsatTokenAction;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getResponse(0, this);
    }
}
