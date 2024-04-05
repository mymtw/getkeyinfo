package com.paypal.checkout.order.patch;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.checkout.order.patch.PatchOrderAction", mo70541f = "PatchOrderAction.kt", mo70542l = {27, 29}, mo70543m = "execute")
public final class PatchOrderAction$execute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PatchOrderAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PatchOrderAction$execute$1(PatchOrderAction patchOrderAction, C19340c<? super PatchOrderAction$execute$1> cVar) {
        super(cVar);
        this.this$0 = patchOrderAction;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute((PatchOrderRequest) null, this);
    }
}
