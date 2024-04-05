package com.paypal.pyplcheckout.addressvalidation;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addressvalidation.AddressRepository", mo70541f = "AddressRepository.kt", mo70542l = {125, 128}, mo70543m = "getLocaleMetaData")
public final class AddressRepository$getLocaleMetaData$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddressRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressRepository$getLocaleMetaData$1(AddressRepository addressRepository, C19340c<? super AddressRepository$getLocaleMetaData$1> cVar) {
        super(cVar);
        this.this$0 = addressRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getLocaleMetaData((String) null, this);
    }
}
