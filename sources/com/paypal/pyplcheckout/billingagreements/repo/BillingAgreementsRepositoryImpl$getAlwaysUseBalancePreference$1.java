package com.paypal.pyplcheckout.billingagreements.repo;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.pyplcheckout.extensions.FlowExtensionsKt;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19656n1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1", mo70541f = "BillingAgreementsRepositoryImpl.kt", mo70542l = {46}, mo70543m = "invokeSuspend")
public final class BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ BillingAgreementsRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1(BillingAgreementsRepositoryImpl billingAgreementsRepositoryImpl, C19340c<? super BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1> cVar) {
        super(2, cVar);
        this.this$0 = billingAgreementsRepositoryImpl;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BillingAgreementsRepositoryImpl$getAlwaysUseBalancePreference$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19656n1 access$get_balancePreferenceState$p = this.this$0._balancePreferenceState;
            Boolean valueOf = Boolean.valueOf(this.this$0.dao.getAlwaysUseBalancePreference());
            this.label = 1;
            if (FlowExtensionsKt.emitOnce(access$get_balancePreferenceState$p, valueOf, this) == coroutineSingletons) {
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
