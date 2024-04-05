package com.paypal.pyplcheckout.userprofile.usecase;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.extensions.FlowExtensionsKt;
import com.paypal.pyplcheckout.services.ApiErrorException;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19656n1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase$onUserError$1", mo70541f = "GetUserUseCase.kt", mo70542l = {70}, mo70543m = "invokeSuspend")
public final class GetUserUseCase$onUserError$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $errorMessage;
    public int label;
    public final /* synthetic */ GetUserUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetUserUseCase$onUserError$1(String str, GetUserUseCase getUserUseCase, C19340c<? super GetUserUseCase$onUserError$1> cVar) {
        super(2, cVar);
        this.$errorMessage = str;
        this.this$0 = getUserUseCase;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new GetUserUseCase$onUserError$1(this.$errorMessage, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((GetUserUseCase$onUserError$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            String str = this.$errorMessage;
            if (str == null) {
                str = "Unknown Api error";
            }
            C19656n1 access$getState$p = this.this$0.state;
            UserState.Error error = new UserState.Error(new ApiErrorException(str));
            this.label = 1;
            if (FlowExtensionsKt.emitOnce(access$getState$p, error, this) == coroutineSingletons) {
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
