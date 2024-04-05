package com.paypal.pyplcheckout.sca;

import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationCallback$strongCustomerAuthFailProtocol$1 */
public final class C17268x2e222ed9 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ String $calledFrom;
    public final /* synthetic */ String $error;
    public final /* synthetic */ PEnums.EventCode $eventCode;
    public final /* synthetic */ Exception $exception;
    public final /* synthetic */ PEnums.FallbackCategory $fallbackCategory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17268x2e222ed9(PEnums.EventCode eventCode, String str, Exception exc, String str2, PEnums.FallbackCategory fallbackCategory) {
        super(0);
        this.$eventCode = eventCode;
        this.$error = str;
        this.$exception = exc;
        this.$calledFrom = str2;
        this.$fallbackCategory = fallbackCategory;
    }

    public final void invoke() {
        PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = this.$eventCode;
        String str = this.$error;
        Exception exc = this.$exception;
        PLog.error$default(errorType, eventCode, str, exc == null ? null : exc.getMessage(), this.$exception, PEnums.TransitionName.GRAPH_QL_PAYLOAD, PEnums.StateName.STRONG_CUSTOMER_AUTHENTICATION, this.$calledFrom, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1792, (Object) null);
        PYPLCheckoutUtils.Companion.getInstance().fallBack("CompleteSCaCallback fail protocol", PEnums.FallbackReason.STRONG_CUSTOMER_AUTHENTICATION_CLEARED_FAILURE, this.$fallbackCategory, this.$error, (PEnums.TransitionName) null, ErrorReason.CONTINGENCY_CLEARED_ERROR, this.$exception);
    }
}
