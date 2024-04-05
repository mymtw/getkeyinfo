package com.paypal.pyplcheckout.addcard.usecase;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase", mo70541f = "AddCardUseCase.kt", mo70542l = {73, 75, 79}, mo70543m = "invoke-bMdYcbs")
public final class AddCardUseCase$invoke$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddCardUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardUseCase$invoke$1(AddCardUseCase addCardUseCase, C19340c<? super AddCardUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = addCardUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r9 = this.this$0.m35155invokebMdYcbs((AppCompatActivity) null, (String) null, (String) null, (String) null, (String) null, (String) null, this);
        return r9 == CoroutineSingletons.COROUTINE_SUSPENDED ? r9 : Result.m35479boximpl(r9);
    }
}
