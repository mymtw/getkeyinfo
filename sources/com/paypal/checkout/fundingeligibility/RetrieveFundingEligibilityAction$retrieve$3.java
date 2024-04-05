package com.paypal.checkout.fundingeligibility;

import com.paypal.checkout.config.PaymentButtonIntent;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import okhttp3.C20011u;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction$retrieve$3", mo70541f = "RetrieveFundingEligibilityAction.kt", mo70542l = {74, 36, 37, 42, 43}, mo70543m = "invokeSuspend")
public final class RetrieveFundingEligibilityAction$retrieve$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super FundingEligibilityResponse>, Object> {
    public final /* synthetic */ int $attempt;
    public final /* synthetic */ PaymentButtonIntent $intent;
    public final /* synthetic */ C20011u $request;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ RetrieveFundingEligibilityAction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetrieveFundingEligibilityAction$retrieve$3(RetrieveFundingEligibilityAction retrieveFundingEligibilityAction, C20011u uVar, int i, PaymentButtonIntent paymentButtonIntent, C19340c<? super RetrieveFundingEligibilityAction$retrieve$3> cVar) {
        super(2, cVar);
        this.this$0 = retrieveFundingEligibilityAction;
        this.$request = uVar;
        this.$attempt = i;
        this.$intent = paymentButtonIntent;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new RetrieveFundingEligibilityAction$retrieve$3(this.this$0, this.$request, this.$attempt, this.$intent, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super FundingEligibilityResponse> cVar) {
        return ((RetrieveFundingEligibilityAction$retrieve$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0 A[Catch:{ Exception -> 0x00b4 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r24
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r1.label
            r3 = 250(0xfa, double:1.235E-321)
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 3
            r9 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 == r10) goto L_0x0039
            if (r0 == r7) goto L_0x0035
            if (r0 == r8) goto L_0x002e
            if (r0 == r6) goto L_0x0029
            if (r0 != r5) goto L_0x0021
            androidx.compose.foundation.layout.C0761x.m1684O0(r25)
            r0 = r25
            goto L_0x00d7
        L_0x0021:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0029:
            androidx.compose.foundation.layout.C0761x.m1684O0(r25)
            goto L_0x00c7
        L_0x002e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r25)     // Catch:{ Exception -> 0x00b4 }
            r0 = r25
            goto L_0x00b1
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r25)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00a1
        L_0x0039:
            java.lang.Object r0 = r1.L$1
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r0 = r1.L$0
            okhttp3.e r0 = (okhttp3.C19944e) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r25)     // Catch:{ Exception -> 0x00b4 }
            r0 = r25
            goto L_0x0084
        L_0x0047:
            androidx.compose.foundation.layout.C0761x.m1684O0(r25)
            com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction r0 = r1.this$0     // Catch:{ Exception -> 0x00b4 }
            okhttp3.t r0 = r0.okHttpClient     // Catch:{ Exception -> 0x00b4 }
            okhttp3.u r11 = r1.$request     // Catch:{ Exception -> 0x00b4 }
            okhttp3.e r0 = r0.mo20743a(r11)     // Catch:{ Exception -> 0x00b4 }
            java.lang.Class<com.paypal.checkout.fundingeligibility.FundingEligibilityResponse> r11 = com.paypal.checkout.fundingeligibility.FundingEligibilityResponse.class
            r1.L$0 = r0     // Catch:{ Exception -> 0x00b4 }
            r1.L$1 = r11     // Catch:{ Exception -> 0x00b4 }
            r1.label = r10     // Catch:{ Exception -> 0x00b4 }
            kotlinx.coroutines.l r12 = new kotlinx.coroutines.l     // Catch:{ Exception -> 0x00b4 }
            kotlin.coroutines.c r13 = kotlin.jvm.internal.C19388s.m32873m0(r24)     // Catch:{ Exception -> 0x00b4 }
            r12.<init>(r10, r13)     // Catch:{ Exception -> 0x00b4 }
            r12.mo72548n()     // Catch:{ Exception -> 0x00b4 }
            com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$1 r13 = new com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$1     // Catch:{ Exception -> 0x00b4 }
            r13.<init>(r11, r12)     // Catch:{ Exception -> 0x00b4 }
            r11 = r0
            okhttp3.internal.connection.e r11 = (okhttp3.internal.connection.C19971e) r11     // Catch:{ Exception -> 0x00b4 }
            r11.mo72857S(r13)     // Catch:{ Exception -> 0x00b4 }
            com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$2 r11 = new com.paypal.pyplcheckout.ab.NetworkExtensionsKt$await$2$2     // Catch:{ Exception -> 0x00b4 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00b4 }
            r12.mo72497O(r11)     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r0 = r12.mo72547l()     // Catch:{ Exception -> 0x00b4 }
            if (r0 != r2) goto L_0x0084
            return r2
        L_0x0084:
            com.paypal.checkout.fundingeligibility.FundingEligibilityResponse r0 = (com.paypal.checkout.fundingeligibility.FundingEligibilityResponse) r0     // Catch:{ Exception -> 0x00b4 }
            com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction r11 = r1.this$0     // Catch:{ Exception -> 0x00b4 }
            boolean r11 = r11.validate(r0)     // Catch:{ Exception -> 0x00b4 }
            if (r11 != 0) goto L_0x0108
            int r11 = r1.$attempt     // Catch:{ Exception -> 0x00b4 }
            if (r11 < r8) goto L_0x0094
            goto L_0x0108
        L_0x0094:
            r1.L$0 = r9     // Catch:{ Exception -> 0x00b4 }
            r1.L$1 = r9     // Catch:{ Exception -> 0x00b4 }
            r1.label = r7     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r0 = p628nj.C18263b.m30814I(r3, r1)     // Catch:{ Exception -> 0x00b4 }
            if (r0 != r2) goto L_0x00a1
            return r2
        L_0x00a1:
            com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction r0 = r1.this$0     // Catch:{ Exception -> 0x00b4 }
            int r7 = r1.$attempt     // Catch:{ Exception -> 0x00b4 }
            int r7 = r7 + r10
            com.paypal.checkout.config.PaymentButtonIntent r11 = r1.$intent     // Catch:{ Exception -> 0x00b4 }
            r1.label = r8     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r0 = r0.retrieve(r7, r11, r1)     // Catch:{ Exception -> 0x00b4 }
            if (r0 != r2) goto L_0x00b1
            return r2
        L_0x00b1:
            com.paypal.checkout.fundingeligibility.FundingEligibilityResponse r0 = (com.paypal.checkout.fundingeligibility.FundingEligibilityResponse) r0     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0108
        L_0x00b4:
            r0 = move-exception
            r15 = r0
            int r0 = r1.$attempt
            if (r0 >= r8) goto L_0x00db
            r1.L$0 = r9
            r1.L$1 = r9
            r1.label = r6
            java.lang.Object r0 = p628nj.C18263b.m30814I(r3, r1)
            if (r0 != r2) goto L_0x00c7
            return r2
        L_0x00c7:
            com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction r0 = r1.this$0
            int r3 = r1.$attempt
            int r3 = r3 + r10
            com.paypal.checkout.config.PaymentButtonIntent r4 = r1.$intent
            r1.label = r5
            java.lang.Object r0 = r0.retrieve(r3, r4, r1)
            if (r0 != r2) goto L_0x00d7
            return r2
        L_0x00d7:
            r9 = r0
            com.paypal.checkout.fundingeligibility.FundingEligibilityResponse r9 = (com.paypal.checkout.fundingeligibility.FundingEligibilityResponse) r9
            goto L_0x0107
        L_0x00db:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.WARNING
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r12 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E579
            java.lang.Class r0 = r15.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r2 = r15.getMessage()
            java.lang.String r3 = "Encountered an "
            java.lang.String r4 = " with message: "
            java.lang.String r13 = p003a2.C0015b.m90i(r3, r0, r4, r2)
            r14 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r16 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.FUNDING_ELIGIBILITY_EXECUTED
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1992(0x7c8, float:2.791E-42)
            r23 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0107:
            r0 = r9
        L_0x0108:
            com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction r2 = r1.this$0
            r2.logResult(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.fundingeligibility.RetrieveFundingEligibilityAction$retrieve$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
