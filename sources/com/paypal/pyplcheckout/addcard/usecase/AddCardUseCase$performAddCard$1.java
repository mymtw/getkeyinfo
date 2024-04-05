package com.paypal.pyplcheckout.addcard.usecase;

import com.paypal.pyplcheckout.pojo.AddCardQueryParams;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase", mo70541f = "AddCardUseCase.kt", mo70542l = {141}, mo70543m = "performAddCard")
public final class AddCardUseCase$performAddCard$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddCardUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardUseCase$performAddCard$1(AddCardUseCase addCardUseCase, C19340c<? super AddCardUseCase$performAddCard$1> cVar) {
        super(cVar);
        this.this$0 = addCardUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performAddCard((AddCardQueryParams) null, this);
    }
}
