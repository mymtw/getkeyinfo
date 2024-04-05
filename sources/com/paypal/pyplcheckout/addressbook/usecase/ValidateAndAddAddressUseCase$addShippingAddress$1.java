package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase", mo70541f = "ValidateAndAddAddressUseCase.kt", mo70542l = {80}, mo70543m = "addShippingAddress")
public final class ValidateAndAddAddressUseCase$addShippingAddress$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ValidateAndAddAddressUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateAndAddAddressUseCase$addShippingAddress$1(ValidateAndAddAddressUseCase validateAndAddAddressUseCase, C19340c<? super ValidateAndAddAddressUseCase$addShippingAddress$1> cVar) {
        super(cVar);
        this.this$0 = validateAndAddAddressUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addShippingAddress((PortableShippingAddressRequest) null, this);
    }
}
