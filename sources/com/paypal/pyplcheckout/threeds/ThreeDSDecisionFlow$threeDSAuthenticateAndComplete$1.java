package com.paypal.pyplcheckout.threeds;

import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1", mo70541f = "ThreeDSDecisionFlow.kt", mo70542l = {151}, mo70543m = "invokeSuspend")
public final class ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19857l<ContingencyEventsModel, C19394m> $onError;
    public int label;
    public final /* synthetic */ ThreeDSDecisionFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1(ThreeDSDecisionFlow threeDSDecisionFlow, C19857l<? super ContingencyEventsModel, C19394m> lVar, C19340c<? super ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1> cVar) {
        super(2, cVar);
        this.this$0 = threeDSDecisionFlow;
        this.$onError = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1(this.this$0, this.$onError, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031 A[Catch:{ Exception -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[Catch:{ Exception -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb A[Catch:{ Exception -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7 A[Catch:{ Exception -> 0x000d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)     // Catch:{ Exception -> 0x000d }
            goto L_0x0061
        L_0x000d:
            r11 = move-exception
            r3 = r11
            goto L_0x00d3
        L_0x0011:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0019:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r11 = r10.this$0     // Catch:{ Exception -> 0x000d }
            java.lang.String r11 = r11.getTransactionId()     // Catch:{ Exception -> 0x000d }
            r1 = 0
            if (r11 == 0) goto L_0x002e
            boolean r3 = kotlin.text.C19457k.m33020X0(r11)     // Catch:{ Exception -> 0x000d }
            if (r3 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r3 = r1
            goto L_0x002f
        L_0x002e:
            r3 = r2
        L_0x002f:
            if (r3 != 0) goto L_0x00c7
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r3 = r10.this$0     // Catch:{ Exception -> 0x000d }
            java.lang.String r3 = r3.getPaymentAuthenticationRequest()     // Catch:{ Exception -> 0x000d }
            if (r3 == 0) goto L_0x0042
            boolean r4 = kotlin.text.C19457k.m33020X0(r3)     // Catch:{ Exception -> 0x000d }
            if (r4 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r4 = r1
            goto L_0x0043
        L_0x0042:
            r4 = r2
        L_0x0043:
            if (r4 != 0) goto L_0x00bb
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r4 = r10.this$0     // Catch:{ Exception -> 0x000d }
            java.lang.String r4 = r4.getThreeDSProcessorTraceNumber()     // Catch:{ Exception -> 0x000d }
            if (r4 == 0) goto L_0x0053
            boolean r5 = kotlin.text.C19457k.m33020X0(r4)     // Catch:{ Exception -> 0x000d }
            if (r5 == 0) goto L_0x0054
        L_0x0053:
            r1 = r2
        L_0x0054:
            if (r1 != 0) goto L_0x00af
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r1 = r10.this$0     // Catch:{ Exception -> 0x000d }
            r10.label = r2     // Catch:{ Exception -> 0x000d }
            java.lang.Object r11 = r1.postStepUpFinalize(r11, r3, r4, r10)     // Catch:{ Exception -> 0x000d }
            if (r11 != r0) goto L_0x0061
            return r0
        L_0x0061:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ Exception -> 0x000d }
            boolean r11 = r11.booleanValue()     // Catch:{ Exception -> 0x000d }
            if (r11 == 0) goto L_0x0095
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r11 = r10.this$0     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_CONTINGENCY_FLOW_FINISHED     // Catch:{ Exception -> 0x000d }
            java.lang.String r1 = "3ds contingency isCleared true"
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E614     // Catch:{ Exception -> 0x000d }
            r11.logDecision(r0, r1, r2, r3)     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r11 = r10.this$0     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.events.Events r11 = r11.events     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.events.PayPalEventTypes r0 = com.paypal.pyplcheckout.events.PayPalEventTypes.CLEARED_THREE_DS_CONTINGENCIES     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.events.Success r1 = new com.paypal.pyplcheckout.events.Success     // Catch:{ Exception -> 0x000d }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x000d }
            r1.<init>(r2)     // Catch:{ Exception -> 0x000d }
            r11.fire(r0, r1)     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r3 = r10.this$0     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.events.model.ContingencyType r4 = com.paypal.pyplcheckout.events.model.ContingencyType.THREE_DS_V2_CONTINGENCY     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r5 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_RESOLVE_SUCCESS     // Catch:{ Exception -> 0x000d }
            r6 = 0
            r7 = 4
            r8 = 0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.emitStatus$default(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x000d }
            goto L_0x00fc
        L_0x0095:
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r11 = r10.this$0     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_CONTINGENCY_FLOW_FINISHED     // Catch:{ Exception -> 0x000d }
            java.lang.String r1 = "3ds contingency isCleared false"
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.FAILURE     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E614     // Catch:{ Exception -> 0x000d }
            r11.logDecision(r0, r1, r2, r3)     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r4 = r10.this$0     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.events.model.ContingencyType r5 = com.paypal.pyplcheckout.events.model.ContingencyType.THREE_DS_V2_CONTINGENCY     // Catch:{ Exception -> 0x000d }
            com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r6 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_RESOLVE_FAILED     // Catch:{ Exception -> 0x000d }
            r7 = 0
            r8 = 4
            r9 = 0
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow.emitStatus$default(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x000d }
            goto L_0x00fc
        L_0x00af:
            java.lang.String r11 = "threeDSProcessorTraceNumber"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x000d }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x000d }
            r0.<init>(r11)     // Catch:{ Exception -> 0x000d }
            throw r0     // Catch:{ Exception -> 0x000d }
        L_0x00bb:
            java.lang.String r11 = "paymentAuthenticationRequest is null or blank"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x000d }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x000d }
            r0.<init>(r11)     // Catch:{ Exception -> 0x000d }
            throw r0     // Catch:{ Exception -> 0x000d }
        L_0x00c7:
            java.lang.String r11 = "transaction id is null or blank"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x000d }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x000d }
            r0.<init>(r11)     // Catch:{ Exception -> 0x000d }
            throw r0     // Catch:{ Exception -> 0x000d }
        L_0x00d3:
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r11 = r10.this$0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.THREE_DS_CONTINGENCY_FLOW_FINISHED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.FAILURE
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E614
            java.lang.String r4 = "3ds flow finished"
            r11.logDecision(r0, r4, r1, r2)
            com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow r11 = r10.this$0
            r11.logException(r3)
            kq.l<com.paypal.pyplcheckout.events.model.ContingencyEventsModel, kotlin.m> r11 = r10.$onError
            com.paypal.pyplcheckout.events.model.ContingencyEventsModel r8 = new com.paypal.pyplcheckout.events.model.ContingencyEventsModel
            com.paypal.pyplcheckout.events.model.ContingencyType r1 = com.paypal.pyplcheckout.events.model.ContingencyType.THREE_DS_V2_CONTINGENCY
            com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r2 = com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE
            java.lang.String r4 = r3.getMessage()
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.invoke(r8)
        L_0x00fc:
            kotlin.m r11 = kotlin.C19394m.f43287a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.threeds.ThreeDSDecisionFlow$threeDSAuthenticateAndComplete$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
