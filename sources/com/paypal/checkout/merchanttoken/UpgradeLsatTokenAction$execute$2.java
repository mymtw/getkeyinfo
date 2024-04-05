package com.paypal.checkout.merchanttoken;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction$execute$2", mo70541f = "UpgradeLsatTokenAction.kt", mo70542l = {19}, mo70543m = "invokeSuspend")
public final class UpgradeLsatTokenAction$execute$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super UpgradeLsatTokenResponse>, Object> {
    public int label;
    public final /* synthetic */ UpgradeLsatTokenAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpgradeLsatTokenAction$execute$2(UpgradeLsatTokenAction upgradeLsatTokenAction, C19340c<? super UpgradeLsatTokenAction$execute$2> cVar) {
        super(2, cVar);
        this.this$0 = upgradeLsatTokenAction;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new UpgradeLsatTokenAction$execute$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super UpgradeLsatTokenResponse> cVar) {
        return ((UpgradeLsatTokenAction$execute$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            UpgradeLsatTokenAction upgradeLsatTokenAction = this.this$0;
            this.label = 1;
            obj = upgradeLsatTokenAction.upgradeLsatToken(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
