package com.paypal.pyplcheckout.domain.usecase.address;

import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase", mo70541f = "GetLocaleMetadataUseCase.kt", mo70542l = {22}, mo70543m = "invoke-gIAlu-s")
public final class GetLocaleMetadataUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetLocaleMetadataUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetLocaleMetadataUseCase$invoke$1(GetLocaleMetadataUseCase getLocaleMetadataUseCase, C19340c<? super GetLocaleMetadataUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = getLocaleMetadataUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m35251invokegIAlus((String) null, this);
        return r2 == CoroutineSingletons.COROUTINE_SUSPENDED ? r2 : Result.m35479boximpl(r2);
    }
}
