package com.paypal.pyplcheckout.fundingOptions.usecase;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.extensions.FlowExtensionsKt;
import com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19656n1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase$payLaterEventListener$1$1", mo70541f = "GetSelectedFundingOptionUseCase.kt", mo70542l = {71}, mo70543m = "invokeSuspend")
public final class GetSelectedFundingOptionUseCase$payLaterEventListener$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ GetSelectedFundingOptionUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSelectedFundingOptionUseCase$payLaterEventListener$1$1(GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase, C19340c<? super GetSelectedFundingOptionUseCase$payLaterEventListener$1$1> cVar) {
        super(2, cVar);
        this.this$0 = getSelectedFundingOptionUseCase;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new GetSelectedFundingOptionUseCase$payLaterEventListener$1$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((GetSelectedFundingOptionUseCase$payLaterEventListener$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19656n1 access$getState = this.this$0.getState();
            SelectedOptionState.CreditsOffer creditsOffer = new SelectedOptionState.CreditsOffer(SelectedOptionState.CreditsOffer.Type.PAY_LATER);
            this.label = 1;
            if (FlowExtensionsKt.emitOnce(access$getState, creditsOffer, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
