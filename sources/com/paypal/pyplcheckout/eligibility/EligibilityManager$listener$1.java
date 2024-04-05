package com.paypal.pyplcheckout.eligibility;

import com.paypal.pyplcheckout.events.EventListener;

public final class EligibilityManager$listener$1 implements EventListener {
    public final /* synthetic */ EligibilityManager this$0;

    public EligibilityManager$listener$1(EligibilityManager eligibilityManager) {
        this.this$0 = eligibilityManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r0 = r14.getMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEvent(com.paypal.pyplcheckout.events.EventType r14, com.paypal.pyplcheckout.events.ResultData r15) {
        /*
            r13 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            boolean r14 = r15 instanceof com.paypal.pyplcheckout.events.Error
            if (r14 == 0) goto L_0x004d
            com.paypal.pyplcheckout.events.Error r15 = (com.paypal.pyplcheckout.events.Error) r15
            java.lang.Object r14 = r15.getData()
            com.paypal.pyplcheckout.events.model.EligibilityResultError r14 = (com.paypal.pyplcheckout.events.model.EligibilityResultError) r14
            com.paypal.pyplcheckout.common.instrumentation.PEnums$FallbackReason r15 = com.paypal.pyplcheckout.common.instrumentation.PEnums.FallbackReason.UNKNOWN_ELIGIBILITY_ISSUE
            java.lang.String r0 = "Error in finding message"
            if (r14 != 0) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            java.lang.String r1 = r14.getMessage()
            if (r1 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$FallbackReason r3 = r15.setFallbackReason(r0)
            com.paypal.pyplcheckout.eligibility.EligibilityManager r15 = r13.this$0
            com.paypal.pyplcheckout.utils.PYPLCheckoutUtils r1 = r15.checkoutUtils
            com.paypal.pyplcheckout.common.instrumentation.PEnums$FallbackCategory r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.FallbackCategory.INELIGIBLE_TRAFFIC
            java.lang.String r15 = "no data provided"
            if (r14 != 0) goto L_0x0032
        L_0x0030:
            r5 = r15
            goto L_0x003a
        L_0x0032:
            java.lang.String r0 = r14.getMessage()
            if (r0 != 0) goto L_0x0039
            goto L_0x0030
        L_0x0039:
            r5 = r0
        L_0x003a:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_XO_POST_AUTH_ELIGIBILITY_CHECK
            com.paypal.checkout.error.ErrorReason r7 = com.paypal.checkout.error.ErrorReason.ELIGIBILITY_ERROR
            if (r14 != 0) goto L_0x0042
            r14 = 0
            goto L_0x0046
        L_0x0042:
            java.lang.Exception r14 = r14.getException()
        L_0x0046:
            r8 = r14
            java.lang.String r2 = "PYPLPaysheetActivity"
            r1.fallBack(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0075
        L_0x004d:
            boolean r14 = r15 instanceof com.paypal.pyplcheckout.events.Success
            if (r14 == 0) goto L_0x0075
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_XO_POST_AUTH_ELIGIBILITY_CHECK
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E212
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.REVIEW
            java.lang.String r4 = ""
            r5 = 0
            com.paypal.pyplcheckout.events.Success r15 = (com.paypal.pyplcheckout.events.Success) r15
            java.lang.Object r14 = r15.getData()
            java.lang.String r6 = java.lang.String.valueOf(r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1920(0x780, float:2.69E-42)
            r12 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.paypal.pyplcheckout.eligibility.EligibilityManager r14 = r13.this$0
            r14.handleCCTFallback()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.eligibility.EligibilityManager$listener$1.onEvent(com.paypal.pyplcheckout.events.EventType, com.paypal.pyplcheckout.events.ResultData):void");
    }
}
