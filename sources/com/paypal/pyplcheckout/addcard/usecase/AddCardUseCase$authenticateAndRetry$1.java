package com.paypal.pyplcheckout.addcard.usecase;

import androidx.appcompat.app.AppCompatActivity;
import com.paypal.pyplcheckout.pojo.Card;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase", mo70541f = "AddCardUseCase.kt", mo70542l = {99, 101}, mo70543m = "authenticateAndRetry-BWLJW6A")
public final class AddCardUseCase$authenticateAndRetry$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AddCardUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardUseCase$authenticateAndRetry$1(AddCardUseCase addCardUseCase, C19340c<? super AddCardUseCase$authenticateAndRetry$1> cVar) {
        super(cVar);
        this.this$0 = addCardUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m35154authenticateAndRetryBWLJW6A((AppCompatActivity) null, (Card) null, (String) null, this);
        return r2 == CoroutineSingletons.COROUTINE_SUSPENDED ? r2 : Result.m35479boximpl(r2);
    }
}
