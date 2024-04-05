package com.paypal.pyplcheckout.userprofile.usecase;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.extensions.FlowExtensionsKt;
import com.paypal.pyplcheckout.pojo.Data;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19656n1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.userprofile.usecase.GetUserUseCase$onUserSuccess$1", mo70541f = "GetUserUseCase.kt", mo70542l = {63}, mo70543m = "invokeSuspend")
public final class GetUserUseCase$onUserSuccess$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ UserCheckoutResponse $response;
    public int label;
    public final /* synthetic */ GetUserUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetUserUseCase$onUserSuccess$1(UserCheckoutResponse userCheckoutResponse, GetUserUseCase getUserUseCase, C19340c<? super GetUserUseCase$onUserSuccess$1> cVar) {
        super(2, cVar);
        this.$response = userCheckoutResponse;
        this.this$0 = getUserUseCase;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new GetUserUseCase$onUserSuccess$1(this.$response, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((GetUserUseCase$onUserSuccess$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Data data;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            UserCheckoutResponse userCheckoutResponse = this.$response;
            User user = null;
            if (!(userCheckoutResponse == null || (data = userCheckoutResponse.getData()) == null)) {
                user = data.getUser();
            }
            C19656n1 access$getState$p = this.this$0.state;
            UserState state = UserStateKt.toState(user);
            this.label = 1;
            if (FlowExtensionsKt.emitOnce(access$getState$p, state, this) == coroutineSingletons) {
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
