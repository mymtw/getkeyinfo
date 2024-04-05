package com.paypal.checkout.order.billingagreements;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2", mo70541f = "ExecuteBillingAgreementActionImpl.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super ExecuteBillingAgreementResult>, Object> {
    public final /* synthetic */ String $baToken;
    public final /* synthetic */ String $merchantToken;
    public int label;
    public final /* synthetic */ ExecuteBillingAgreementActionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2(ExecuteBillingAgreementActionImpl executeBillingAgreementActionImpl, String str, String str2, C19340c<? super ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2> cVar) {
        super(2, cVar);
        this.this$0 = executeBillingAgreementActionImpl;
        this.$baToken = str;
        this.$merchantToken = str2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2(this.this$0, this.$baToken, this.$merchantToken, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super ExecuteBillingAgreementResult> cVar) {
        return ((ExecuteBillingAgreementActionImpl$fetchBillingAgreementId$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            try {
                C20018z e = ((C19971e) this.this$0.okHttpClient.mo20743a(this.this$0.executeBillingAgreementRequestFactory.create(this.$baToken, this.$merchantToken))).mo72859e();
                return e.mo73006d() ? this.this$0.parseBillingIdResponse(e) : this.this$0.parseBillingIdError(e);
            } catch (Throwable th) {
                ExecuteBillingAgreementActionImpl executeBillingAgreementActionImpl = this.this$0;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                return executeBillingAgreementActionImpl.createError(ExecuteBillingAgreementResult.Error.ERROR_REASON_BA_ID_FAILED, message);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
