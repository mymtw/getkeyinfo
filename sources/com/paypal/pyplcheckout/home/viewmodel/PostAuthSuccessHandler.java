package com.paypal.pyplcheckout.home.viewmodel;

import androidx.compose.animation.C0388a;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.paymentbutton.PaymentButtonFundingType;
import com.paypal.pyplcheckout.auth.AuthenticationSuccess;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.IgnoreGeneratedTestReport;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19665q1;
import p753kq.C19857l;

public final class PostAuthSuccessHandler {
    private final DebugConfigManager debugConfigManager;
    private final Events events;
    public C19597d<String> flows;
    private final PYPLCheckoutUtils pyplCheckoutUtils;
    private final Repository repository;

    public PostAuthSuccessHandler(DebugConfigManager debugConfigManager2, Repository repository2, PYPLCheckoutUtils pYPLCheckoutUtils, Events events2) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        C19383o.m32797g(events2, "events");
        this.debugConfigManager = debugConfigManager2;
        this.repository = repository2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
        this.events = events2;
    }

    private final void fetchUserCheckoutResponse() {
        this.events.fire(PayPalEventTypes.FETCH_USER_AND_CHECKOUT_ATTEMPTED, (ResultData) null);
        this.repository.fetchUserCheckoutResponse();
    }

    private final void handleFlowAfterAuth() {
        if (this.repository.isVaultFlow()) {
            PYPLCheckoutUtils.Companion.getInstance().fallBack("user checkout", PEnums.FallbackReason.UNSUPPORTED_FLOW, PEnums.FallbackCategory.FEATURE_NOT_SUPPORTED, "Vault V2 flow is not supported, going to web fallback.", (PEnums.TransitionName) null, ErrorReason.FEATURE_NOT_SUPPORTED_ERROR, new UnsupportedOperationException("Vault V2 flow is not supported, going to web fallback."));
            return;
        }
        this.repository.performEligibility();
        fetchUserCheckoutResponse();
    }

    @IgnoreGeneratedTestReport
    private final boolean isFundingTypeEligibleForNative(PaymentButtonFundingType paymentButtonFundingType) {
        return paymentButtonFundingType == PaymentButtonFundingType.PAYPAL;
    }

    @IgnoreGeneratedTestReport
    private final void makeLsatUpgradeCall() {
        this.repository.fetchLsatUpgradeStatus((C19857l<? super Boolean, C19394m>) null);
    }

    public final void doAfterAuth(AuthenticationSuccess authenticationSuccess) {
        PLog.decision$default(PEnums.TransitionName.NATIVE_XO_POST_AUTH, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E214, PEnums.StateName.REVIEW, "PostAuthSuccessHandler", (String) null, (authenticationSuccess == null ? null : authenticationSuccess.getExtras()) != null ? authenticationSuccess.toLog() : "", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        Events.Companion.getInstance().fire(PayPalEventTypes.POST_AUTH_SUCCESS_HANDLER_RESPONSE, (ResultData) null);
        setFlows(new C19665q1(new PostAuthSuccessHandler$doAfterAuth$1((C19340c<? super PostAuthSuccessHandler$doAfterAuth$1>) null)));
        if (this.debugConfigManager.isSmartPaymentCheckout()) {
            makeLsatUpgradeCall();
        }
        PaymentButtonFundingType paymentButtonFundingType = this.debugConfigManager.getPaymentButtonFundingType();
        if (paymentButtonFundingType == null || isFundingTypeEligibleForNative(paymentButtonFundingType)) {
            handleFlowAfterAuth();
            return;
        }
        String e = C0388a.m1049e(new Object[]{paymentButtonFundingType}, 1, "Funding type of %s is not eligible", "format(format, *args)");
        this.pyplCheckoutUtils.fallBack("PYPLPaysheetActivity", PEnums.FallbackReason.INELIGIBLE_TRAFFIC, PEnums.FallbackCategory.INELIGIBLE_TRAFFIC, e, PEnums.TransitionName.NATIVE_XO_POST_AUTH_ELIGIBILITY_CHECK, ErrorReason.FUNDING_ELIGIBILITY_ERROR, new IllegalArgumentException(e));
    }

    public final Events getEvents() {
        return this.events;
    }

    public final C19597d<String> getFlows() {
        C19597d<String> dVar = this.flows;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("flows");
        throw null;
    }

    public final PYPLCheckoutUtils getPyplCheckoutUtils() {
        return this.pyplCheckoutUtils;
    }

    public final Repository getRepository() {
        return this.repository;
    }

    public final void setFlows(C19597d<String> dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.flows = dVar;
    }
}
