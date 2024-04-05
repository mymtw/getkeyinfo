package com.paypal.pyplcheckout.home.viewmodel;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.home.viewmodel.PostAuthSuccessHandler$doAfterAuth$1", mo70541f = "PostAuthSuccessHandler.kt", mo70542l = {41}, mo70543m = "invokeSuspend")
public final class PostAuthSuccessHandler$doAfterAuth$1 extends SuspendLambda implements C19861p<C19600e<? super String>, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public int label;

    public PostAuthSuccessHandler$doAfterAuth$1(C19340c<? super PostAuthSuccessHandler$doAfterAuth$1> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PostAuthSuccessHandler$doAfterAuth$1 postAuthSuccessHandler$doAfterAuth$1 = new PostAuthSuccessHandler$doAfterAuth$1(cVar);
        postAuthSuccessHandler$doAfterAuth$1.L$0 = obj;
        return postAuthSuccessHandler$doAfterAuth$1;
    }

    public final Object invoke(C19600e<? super String> eVar, C19340c<? super C19394m> cVar) {
        return ((PostAuthSuccessHandler$doAfterAuth$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.label = 1;
            if (((C19600e) this.L$0).emit("success", this) == coroutineSingletons) {
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
