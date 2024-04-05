package com.paypal.pyplcheckout.sca;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.services.callbacks.BaseCallback;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class CompleteStrongCustomerAuthenticationCallback extends BaseCallback {
    public CompleteStrongCustomerAuthenticationCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiSuccess$lambda-0  reason: not valid java name */
    public static final void m35421onApiSuccess$lambda0(CompleteStrongCustomerAuthenticationCallback completeStrongCustomerAuthenticationCallback) {
        C19383o.m32797g(completeStrongCustomerAuthenticationCallback, "this$0");
        completeStrongCustomerAuthenticationCallback.onSuccess();
    }

    private final void strongCustomerAuthFailProtocol(String str, Exception exc, String str2, PEnums.FallbackCategory fallbackCategory, PEnums.EventCode eventCode) {
        ScaUiListenerKt.runOnUiThread(new C17268x2e222ed9(eventCode, str, exc, str2, fallbackCategory));
    }

    public static /* synthetic */ void strongCustomerAuthFailProtocol$default(CompleteStrongCustomerAuthenticationCallback completeStrongCustomerAuthenticationCallback, String str, Exception exc, String str2, PEnums.FallbackCategory fallbackCategory, PEnums.EventCode eventCode, int i, Object obj) {
        if (obj == null) {
            completeStrongCustomerAuthenticationCallback.strongCustomerAuthFailProtocol(str, (i & 2) != 0 ? null : exc, (i & 4) != 0 ? null : str2, fallbackCategory, eventCode);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: strongCustomerAuthFailProtocol");
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        Exception exc2 = exc;
        strongCustomerAuthFailProtocol(C0326j.m864i("error fetching completeStrongCustomerAuthentication response: ", exc.getMessage()), exc2, "CompleteSCaCallback onApiError", PEnums.FallbackCategory.STRONG_CUSTOMER_AUTHENTICATION, PEnums.EventCode.E582);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[Catch:{ Exception -> 0x0078 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onApiSuccess(java.lang.String r22) {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            java.lang.String r1 = "result"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            com.google.gson.i r1 = new com.google.gson.i     // Catch:{ Exception -> 0x0078 }
            r1.<init>()     // Catch:{ Exception -> 0x0078 }
            java.io.StringReader r2 = new java.io.StringReader     // Catch:{ Exception -> 0x0078 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0078 }
            java.lang.Class<com.paypal.pyplcheckout.sca.CompleteScaResponse> r3 = com.paypal.pyplcheckout.sca.CompleteScaResponse.class
            java.lang.Object r1 = r1.mo59457d(r2, r3)     // Catch:{ Exception -> 0x0078 }
            com.paypal.pyplcheckout.sca.CompleteScaResponse r1 = (com.paypal.pyplcheckout.sca.CompleteScaResponse) r1     // Catch:{ Exception -> 0x0078 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            boolean r4 = r1.isContingencyCleared()     // Catch:{ Exception -> 0x0078 }
            if (r4 != r2) goto L_0x0028
            r4 = r2
            goto L_0x0029
        L_0x0028:
            r4 = r3
        L_0x0029:
            if (r4 == 0) goto L_0x0063
            java.util.List r1 = r1.getErrors()     // Catch:{ Exception -> 0x0078 }
            if (r1 == 0) goto L_0x0039
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0078 }
            if (r1 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r2 = r3
        L_0x0039:
            if (r2 == 0) goto L_0x0063
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.STRONG_CUSTOMER_AUTHENTICATION_CLEARED     // Catch:{ Exception -> 0x0078 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r9 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS     // Catch:{ Exception -> 0x0078 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E231     // Catch:{ Exception -> 0x0078 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION     // Catch:{ Exception -> 0x0078 }
            java.lang.String r12 = "call_to_action_button_view"
            java.lang.String r13 = r8.toString()     // Catch:{ Exception -> 0x0078 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 1920(0x780, float:2.69E-42)
            r20 = 0
            r14 = r22
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0078 }
            com.etsy.android.uikit.view.draggable.a r0 = new com.etsy.android.uikit.view.draggable.a     // Catch:{ Exception -> 0x0078 }
            r1 = 4
            r0.<init>(r7, r1)     // Catch:{ Exception -> 0x0078 }
            r7.runOnUiThread(r0)     // Catch:{ Exception -> 0x0078 }
            goto L_0x008f
        L_0x0063:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0078 }
            java.lang.String r0 = "Strong Customer Authentication contingency did not clear"
            r3.<init>(r0)     // Catch:{ Exception -> 0x0078 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E588     // Catch:{ Exception -> 0x0078 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$FallbackCategory r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.FallbackCategory.STRONG_CUSTOMER_AUTHENTICATION     // Catch:{ Exception -> 0x0078 }
            java.lang.String r2 = "completeStrongCustomerAuthentication contingency did not clear"
            java.lang.String r4 = "CompleteSCaCallback onApiError"
            r1 = r21
            r1.strongCustomerAuthFailProtocol(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0078 }
            goto L_0x008f
        L_0x0078:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = "error parsing completeStrongCustomerAuthentication response: "
            java.lang.String r2 = androidx.appcompat.widget.C0326j.m864i(r1, r0)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E583
            com.paypal.pyplcheckout.common.instrumentation.PEnums$FallbackCategory r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.FallbackCategory.DATA_PARSING_ERROR
            java.lang.String r4 = "CompleteSCaCallback onApiSuccess: JSON Parse catch"
            r1 = r21
            r1.strongCustomerAuthFailProtocol(r2, r3, r4, r5, r6)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationCallback.onApiSuccess(java.lang.String):void");
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        String access$getTAG$p = CompleteStrongCustomerAuthenticationApiKt.TAG;
        C19383o.m32796f(access$getTAG$p, "TAG");
        PLog.m28728dR(access$getTAG$p, "complete strong customer authentication correlationId: " + str);
        return super.onSaveCorrelationId(str, internalCorrelationIds);
    }

    public abstract void onSuccess();
}
