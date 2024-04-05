package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import android.text.TextUtils;
import androidx.appcompat.widget.C0326j;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.events.Error;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.EligibilityResultError;
import com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.pojo.Eligibility;
import com.paypal.pyplcheckout.pojo.EligibilityData;
import com.paypal.pyplcheckout.pojo.EligibilityResponse;
import com.paypal.pyplcheckout.pojo.EligibilityResponseKt;
import com.paypal.pyplcheckout.pojo.MobileSdkEligibility;
import com.paypal.pyplcheckout.services.ApiErrorException;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import java.io.StringReader;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EligibilityCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "EligibilityCallback";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EligibilityCallback get() {
            return new EligibilityCallback();
        }
    }

    public EligibilityCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        SdkComponentKt.inject((BaseCallback) this);
    }

    private final void eligibilityFailProtocol(String str, Exception exc) {
        handleCallbackFailure("eligibility false: " + str, exc);
        getEvents().fire(PayPalEventTypes.FINISHED_ELIGIBILITY_CALL, new Error(new EligibilityResultError(str, exc)));
    }

    public static final EligibilityCallback get() {
        return Companion.get();
    }

    private final String getIneligibilityInfo(String str, EligibilityResponse eligibilityResponse) {
        MobileSdkEligibility mobileSDKEligibility;
        Eligibility venmo;
        String ineligibilityReasonAndErrorMessage;
        MobileSdkEligibility mobileSDKEligibility2;
        Eligibility paypal;
        if (C19383o.m32792b(str, PEnums.FundingSource.PAYPAL.toString())) {
            EligibilityData data = eligibilityResponse.getData();
            if (data == null || (mobileSDKEligibility2 = data.getMobileSDKEligibility()) == null || (paypal = mobileSDKEligibility2.getPaypal()) == null || (ineligibilityReasonAndErrorMessage = EligibilityResponseKt.ineligibilityReasonAndErrorMessage(paypal)) == null) {
                return "ineligibility info from server is null";
            }
        } else if (!C19383o.m32792b(str, PEnums.FundingSource.VENMO.toString())) {
            return "invalid funding source";
        } else {
            EligibilityData data2 = eligibilityResponse.getData();
            if (data2 == null || (mobileSDKEligibility = data2.getMobileSDKEligibility()) == null || (venmo = mobileSDKEligibility.getVenmo()) == null || (ineligibilityReasonAndErrorMessage = EligibilityResponseKt.ineligibilityReasonAndErrorMessage(venmo)) == null) {
                return "ineligibility info from server is null";
            }
        }
        return ineligibilityReasonAndErrorMessage;
    }

    private final boolean isGivenFundingSourceEligible(String str, EligibilityResponse eligibilityResponse) {
        EligibilityData data;
        MobileSdkEligibility mobileSDKEligibility;
        Eligibility venmo;
        MobileSdkEligibility mobileSDKEligibility2;
        Eligibility paypal;
        if (C19383o.m32792b(str, PEnums.FundingSource.PAYPAL.toString())) {
            EligibilityData data2 = eligibilityResponse.getData();
            if (data2 == null || (mobileSDKEligibility2 = data2.getMobileSDKEligibility()) == null || (paypal = mobileSDKEligibility2.getPaypal()) == null) {
                return false;
            }
            return C19383o.m32792b(paypal.getEligibility(), Boolean.TRUE);
        } else if (!C19383o.m32792b(str, PEnums.FundingSource.VENMO.toString()) || (data = eligibilityResponse.getData()) == null || (mobileSDKEligibility = data.getMobileSDKEligibility()) == null || (venmo = mobileSDKEligibility.getVenmo()) == null) {
            return false;
        } else {
            return C19383o.m32792b(venmo.getEligibility(), Boolean.TRUE);
        }
    }

    private final boolean shouldFailEligibilityCall() {
        return DebugConfigManager.getInstance().shouldFailEligibilityCall();
    }

    private final boolean shouldSkipEligibility() {
        return DebugConfigManager.getInstance().isSkipEligibility() || C19383o.m32792b(DebugConfigManager.getInstance().getCheckoutEnvironment().getEnvironment(), RunTimeEnvironment.SANDBOX.toString()) || (DebugConfigManager.getInstance().isSmartPaymentCheckout() && TextUtils.isEmpty(SdkComponent.Companion.getInstance().getRepository().getSmartPaymentButtonSessionId())) || C19383o.m32792b(DebugConfigManager.getInstance().getCheckoutEnvironment().getEnvironment(), RunTimeEnvironment.STAGE.toString());
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        eligibilityFailProtocol(C0326j.m864i("api error: ", exc.getMessage()), exc);
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
        if (shouldFailEligibilityCall()) {
            eligibilityFailProtocol("Eligibility fallback switch is ON to test web fallback!", new UnsupportedOperationException("Eligibility fallback switch is ON to test web fallback!"));
            return;
        }
        try {
            EligibilityResponse eligibilityResponse = (EligibilityResponse) new C16708i().mo59457d(new StringReader(str), EligibilityResponse.class);
            String fundingSource = DebugConfigManager.getInstance().getFundingSource();
            C19383o.m32796f(eligibilityResponse, "eligibilityResponse");
            if (isGivenFundingSourceEligible(fundingSource, eligibilityResponse)) {
                SdkComponent.Companion.getInstance().getRepository().setStage(PEnums.Stage.ELIGIBLE);
                getEvents().fire(PayPalEventTypes.FINISHED_ELIGIBILITY_CALL, new Success(Boolean.TRUE));
            } else if (!shouldSkipEligibility() || isGivenFundingSourceEligible(fundingSource, eligibilityResponse)) {
                eligibilityFailProtocol(getIneligibilityInfo(fundingSource, eligibilityResponse), new ApiErrorException("Eligibility API error"));
            } else {
                SdkComponent.Companion.getInstance().getRepository().setStage(PEnums.Stage.ELIGIBLE);
                getEvents().fire(PayPalEventTypes.FINISHED_ELIGIBILITY_CALL, new Success(Boolean.TRUE));
            }
        } catch (Exception e) {
            eligibilityFailProtocol(C0326j.m864i("failed to read eligibility response ", e.getMessage()), e);
        }
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        return InternalCorrelationIds.copy$default(internalCorrelationIds, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 126, (Object) null);
    }
}
