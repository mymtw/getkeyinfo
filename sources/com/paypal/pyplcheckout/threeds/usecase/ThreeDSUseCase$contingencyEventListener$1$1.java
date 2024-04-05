package com.paypal.pyplcheckout.threeds.usecase;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.usecase.ThreeDSUseCase$contingencyEventListener$1$1", mo70541f = "ThreeDSUseCase.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class ThreeDSUseCase$contingencyEventListener$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ ResultData $resultData;
    public int label;
    public final /* synthetic */ ThreeDSUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSUseCase$contingencyEventListener$1$1(ResultData resultData, ThreeDSUseCase threeDSUseCase, C19340c<? super ThreeDSUseCase$contingencyEventListener$1$1> cVar) {
        super(2, cVar);
        this.$resultData = resultData;
        this.this$0 = threeDSUseCase;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ThreeDSUseCase$contingencyEventListener$1$1(this.$resultData, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ThreeDSUseCase$contingencyEventListener$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            ResultData resultData = this.$resultData;
            if (resultData instanceof Success) {
                Object data = ((Success) resultData).getData();
                ContingencyEventsModel contingencyEventsModel = data instanceof ContingencyEventsModel ? (ContingencyEventsModel) data : null;
                if (contingencyEventsModel != null) {
                    this.this$0.handleContingencyEvent(contingencyEventsModel);
                }
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
