package com.paypal.pyplcheckout.addressbook.usecase;

import com.paypal.pyplcheckout.pojo.PortableShippingAddressRequest;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addressbook.usecase.ValidateAndAddAddressUseCase", mo70541f = "ValidateAndAddAddressUseCase.kt", mo70542l = {35, 37, 44}, mo70543m = "invoke")
public final class ValidateAndAddAddressUseCase$invoke$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ValidateAndAddAddressUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateAndAddAddressUseCase$invoke$1(ValidateAndAddAddressUseCase validateAndAddAddressUseCase, C19340c<? super ValidateAndAddAddressUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = validateAndAddAddressUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke((PortableShippingAddressRequest) null, this);
    }
}
