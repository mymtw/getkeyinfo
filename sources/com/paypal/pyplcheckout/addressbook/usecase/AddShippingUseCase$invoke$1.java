package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addressbook.usecase.AddShippingUseCase", mo70541f = "AddShippingUseCase.kt", mo70542l = {14}, mo70543m = "invoke")
public final class AddShippingUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddShippingUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddShippingUseCase$invoke$1(AddShippingUseCase addShippingUseCase, C19340c<? super AddShippingUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = addShippingUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((PortableShippingAddressRequest) null, this);
    }
}
