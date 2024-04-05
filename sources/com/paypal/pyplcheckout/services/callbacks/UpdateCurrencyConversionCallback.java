package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.google.gson.C16708i;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UpdateCurrencyConversionCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "UpdateCurrencyConversionCallback";
    private final ApprovePaymentCallback approvePaymentCallback;
    private final C16708i gson;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateCurrencyConversionCallback(ApprovePaymentCallback approvePaymentCallback2, C16708i iVar) {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        C19383o.m32797g(approvePaymentCallback2, "approvePaymentCallback");
        C19383o.m32797g(iVar, "gson");
        this.approvePaymentCallback = approvePaymentCallback2;
        this.gson = iVar;
    }

    private final void updateCurrencyConversionTypeFailProtocol(String str, Exception exc) {
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E118, C0326j.m864i("UPDATE CURRENCY CONVERSION SERVICE: UNABLE TO UPDATE BACKEND WITH CURRENCY CONVERSION: ", str), (String) null, (Throwable) null, PEnums.TransitionName.CURRENCY_SELECTION_SUBMITTED, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "updateCurrencyConversionType API", PEnums.FallbackReason.CURRENCY_CONVERT_FAIL, PEnums.FallbackCategory.DATA_PARSING_ERROR, str, (PEnums.TransitionName) null, ErrorReason.CURRENCY_CONVERSION_ERROR, exc, 16, (Object) null);
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        updateCurrencyConversionTypeFailProtocol(C0326j.m864i("failed updateCurrencyConversionApi: ", exc.getMessage()), exc);
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.d$default(str2, "updateCurrencyConversionType response " + str, 0, 4, (Object) null);
        AuthenticatedApiFactory.Companion.getApproveMemberPaymentApiFactory().create().enqueueRequest(this.approvePaymentCallback);
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        return InternalCorrelationIds.copy$default(internalCorrelationIds, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, 95, (Object) null);
    }
}
