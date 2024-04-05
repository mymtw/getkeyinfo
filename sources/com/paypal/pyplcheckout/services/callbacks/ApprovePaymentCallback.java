package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.SplitBalanceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;

public final class ApprovePaymentCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "ApprovePaymentCallback";
    private final DebugConfigManager debugConfigManager;
    private final PYPLCheckoutUtils pyplCheckoutUtils;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApprovePaymentCallback(DebugConfigManager debugConfigManager2, PYPLCheckoutUtils pYPLCheckoutUtils, Handler handler) {
        super(handler);
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        C19383o.m32797g(handler, "handler");
        this.debugConfigManager = debugConfigManager2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
    }

    private final void approvePaymentFailProtocol(String str, Exception exc) {
        PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = PEnums.EventCode.E113;
        PEnums.TransitionName transitionName = PEnums.TransitionName.PAYMENT_OUTCOME;
        PEnums.StateName stateName = PEnums.StateName.REVIEW;
        PLog.error$default(errorType, eventCode, str, (String) null, (Throwable) null, transitionName, stateName, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        if (SplitBalanceUtils.isSingleSplitBalanceVisible()) {
            List<FundingOption> fundingOptions = this.debugConfigManager.getFundingOptions();
            Map map = null;
            if (fundingOptions != null) {
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(fundingOptions));
                int i = 0;
                for (T next : fundingOptions) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList.add(new Pair(Integer.valueOf(i), (FundingOption) next));
                        i = i2;
                    } else {
                        C17782b.m29877o0();
                        throw null;
                    }
                }
                map = C19294b0.m32567x0(arrayList);
            }
            PEnums.TransitionName transitionName2 = PEnums.TransitionName.PAYMENT_OUTCOME;
            PEnums.Outcome outcome = PEnums.Outcome.FAILED;
            PEnums.EventCode eventCode2 = PEnums.EventCode.E215;
            PEnums.StateName stateName2 = PEnums.StateName.REVIEW;
            String transitionName3 = transitionName2.toString();
            if (map == null) {
                map = C19294b0.m32559p0();
            }
            FundingOption selectedFundingOption = this.debugConfigManager.getSelectedFundingOption();
            PLog.decision$default(transitionName2, outcome, eventCode2, stateName2, "call_to_action_button_view", transitionName3, map + ", Selected Funding Option: " + selectedFundingOption, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        } else {
            PLog.decision$default(transitionName, PEnums.Outcome.FAILED, PEnums.EventCode.E215, stateName, "call_to_action_button_view", transitionName.toString(), str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        }
        PYPLCheckoutUtils.fallBack$default(this.pyplCheckoutUtils, "CheckoutFinish GET approvePaymentData", PEnums.FallbackReason.USER_CHECKOUT_FAIL_FINISH_SERVICE, PEnums.FallbackCategory.DATA_PARSING_ERROR, str, (PEnums.TransitionName) null, ErrorReason.APPROVE_ORDER_ERROR, exc, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiSuccess$lambda-0  reason: not valid java name */
    public static final void m35425onApiSuccess$lambda0(ApprovePaymentCallback approvePaymentCallback, ApprovePaymentResponse approvePaymentResponse) {
        C19383o.m32797g(approvePaymentCallback, "this$0");
        approvePaymentCallback.getEvents().fire(PayPalEventTypes.FINISHED_APPROVE_PAYMENT_CALL, new Success(approvePaymentResponse));
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.e$default(str, "Checkout API failed", exc, 0, 8, (Object) null);
        approvePaymentFailProtocol(C0326j.m864i("checkout API error ", exc.getMessage()), exc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[Catch:{ Exception -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0061 A[Catch:{ Exception -> 0x0090 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onApiSuccess(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "result"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            com.google.gson.i r2 = new com.google.gson.i     // Catch:{ Exception -> 0x0090 }
            r2.<init>()     // Catch:{ Exception -> 0x0090 }
            java.io.StringReader r3 = new java.io.StringReader     // Catch:{ Exception -> 0x0090 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.Class<com.paypal.pyplcheckout.pojo.ApprovePaymentResponse> r4 = com.paypal.pyplcheckout.pojo.ApprovePaymentResponse.class
            java.lang.Object r2 = r2.mo59457d(r3, r4)     // Catch:{ Exception -> 0x0090 }
            r15 = r2
            com.paypal.pyplcheckout.pojo.ApprovePaymentResponse r15 = (com.paypal.pyplcheckout.pojo.ApprovePaymentResponse) r15     // Catch:{ Exception -> 0x0090 }
            java.util.List r2 = r15.getErrors()     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x002b
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            if (r2 == 0) goto L_0x0061
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.PAYMENT_OUTCOME     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E215     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.REVIEW     // Catch:{ Exception -> 0x0090 }
            java.lang.String r6 = "call_to_action_button_view"
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x0090 }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1920(0x780, float:2.69E-42)
            r14 = 0
            r8 = r17
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.di.SdkComponent$Companion r0 = com.paypal.pyplcheckout.p543di.SdkComponent.Companion     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.di.SdkComponent r0 = r0.getInstance()     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.services.Repository r0 = r0.getRepository()     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Stage r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Stage.APPROVING_CHECKOUT     // Catch:{ Exception -> 0x0090 }
            r0.setStage(r2)     // Catch:{ Exception -> 0x0090 }
            com.etsy.android.ui.cart.googlepay.d r0 = new com.etsy.android.ui.cart.googlepay.d     // Catch:{ Exception -> 0x0090 }
            r2 = 3
            r0.<init>(r2, r1, r15)     // Catch:{ Exception -> 0x0090 }
            r1.runOnUiThread(r0)     // Catch:{ Exception -> 0x0090 }
            goto L_0x009e
        L_0x0061:
            java.lang.String r0 = r15.getFirstErrorDetails()     // Catch:{ Exception -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r2.<init>()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "ApprovePayment failed. "
            r2.append(r3)     // Catch:{ Exception -> 0x0090 }
            r2.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0090 }
            com.paypal.pyplcheckout.services.ApiErrorException r3 = new com.paypal.pyplcheckout.services.ApiErrorException     // Catch:{ Exception -> 0x0090 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r4.<init>()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r5 = "API error. "
            r4.append(r5)     // Catch:{ Exception -> 0x0090 }
            r4.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0090 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0090 }
            r1.approvePaymentFailProtocol(r2, r3)     // Catch:{ Exception -> 0x0090 }
            goto L_0x009e
        L_0x0090:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "failed to read approve payment response "
            java.lang.String r2 = androidx.appcompat.widget.C0326j.m864i(r3, r2)
            r1.approvePaymentFailProtocol(r2, r0)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.callbacks.ApprovePaymentCallback.onApiSuccess(java.lang.String):void");
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.m28739vR(str2, "ApprovePayment correlation id: " + str);
        return InternalCorrelationIds.copy$default(internalCorrelationIds, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, 63, (Object) null);
    }
}
