package com.paypal.checkout.order.billingagreements;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.merchanttoken.CreateLsatTokenAction;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl$createLsatToken$2", mo70541f = "ExecuteBillingAgreementActionImpl.kt", mo70542l = {100}, mo70543m = "invokeSuspend")
public final class ExecuteBillingAgreementActionImpl$createLsatToken$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super String>, Object> {
    public int label;
    public final /* synthetic */ ExecuteBillingAgreementActionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExecuteBillingAgreementActionImpl$createLsatToken$2(ExecuteBillingAgreementActionImpl executeBillingAgreementActionImpl, C19340c<? super ExecuteBillingAgreementActionImpl$createLsatToken$2> cVar) {
        super(2, cVar);
        this.this$0 = executeBillingAgreementActionImpl;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ExecuteBillingAgreementActionImpl$createLsatToken$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super String> cVar) {
        return ((ExecuteBillingAgreementActionImpl$createLsatToken$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            String nullIfNullOrEmpty = StringExtensionsKt.nullIfNullOrEmpty(this.this$0.repository.getLsatToken());
            if (nullIfNullOrEmpty != null) {
                return nullIfNullOrEmpty;
            }
            CreateLsatTokenAction access$getCreateLsatTokenAction$p = this.this$0.createLsatTokenAction;
            this.label = 1;
            obj = access$getCreateLsatTokenAction$p.execute(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) obj;
        this.this$0.repository.setLsatToken(str);
        return str;
    }
}
