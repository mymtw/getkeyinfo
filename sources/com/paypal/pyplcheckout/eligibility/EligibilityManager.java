package com.paypal.pyplcheckout.eligibility;

import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.AppBuildConfig;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;

public final class EligibilityManager {
    private final AbManager abManager;
    /* access modifiers changed from: private */
    public final PYPLCheckoutUtils checkoutUtils;
    private final DebugConfigManager debugConfigManager;
    private final Events events;
    private final EligibilityManager$listener$1 listener = new EligibilityManager$listener$1(this);
    private final Repository repository;

    public EligibilityManager(Events events2, PYPLCheckoutUtils pYPLCheckoutUtils, DebugConfigManager debugConfigManager2, AbManager abManager2, Repository repository2) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(pYPLCheckoutUtils, "checkoutUtils");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(abManager2, "abManager");
        C19383o.m32797g(repository2, "repository");
        this.events = events2;
        this.checkoutUtils = pYPLCheckoutUtils;
        this.debugConfigManager = debugConfigManager2;
        this.abManager = abManager2;
        this.repository = repository2;
    }

    /* access modifiers changed from: private */
    public final void handleCCTFallback() {
        if (shouldFallbackToCCTExperiment() && this.debugConfigManager.isSmartPaymentCheckout() && this.debugConfigManager.shouldTurnOnFallbackExperiment() && !AppBuildConfig.INSTANCE.getDebug()) {
            this.checkoutUtils.fallBack("EligibilityViewModel", PEnums.FallbackReason.AB_TEST, PEnums.FallbackCategory.AB_TEST, "fallback to CCT for ab test", (PEnums.TransitionName) null, ErrorReason.NONE, (Exception) null);
        }
    }

    public final void createEligibilityListener() {
        this.events.listen(PayPalEventTypes.FINISHED_ELIGIBILITY_CALL, this.listener);
    }

    public final void performEligibilityCall() {
        this.repository.performEligibility();
    }

    public final boolean shouldFallbackToCCTExperiment() {
        return this.abManager.evaluateExperimentResponse(ElmoAbExperiment.FALLBACK_TO_CCT_EXPERIMENT, ElmoTreatment.FALLBACK_TO_CCT_EXPERIMENT_TRMT.treatmentName(), "shouldFallbackToCCTExperiment()");
    }
}
