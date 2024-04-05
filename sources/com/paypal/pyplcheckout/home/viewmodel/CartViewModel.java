package com.paypal.pyplcheckout.home.viewmodel;

import android.text.TextUtils;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.view.customviews.productviews.ProductDescription;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoAbExperiment;
import com.paypal.pyplcheckout.p539ab.elmo.ElmoTreatment;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentRequest;
import com.paypal.pyplcheckout.p539ab.experiment.ExperimentResponse;
import com.paypal.pyplcheckout.pojo.Item;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.AppBuildConfig;
import com.paypal.pyplcheckout.viewmodels.BaseViewModel;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CartViewModel extends BaseViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "CartViewModel";
    private final AbManager abManager;
    private final DebugConfigManager debugConfigManager;
    private final BillingAgreementsGetTypeUseCase getBillingAgreementUseCase;
    private final Repository repository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CartViewModel(Repository repository2, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase, AbManager abManager2, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(billingAgreementsGetTypeUseCase, "getBillingAgreementUseCase");
        C19383o.m32797g(abManager2, "abManager");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.repository = repository2;
        this.getBillingAgreementUseCase = billingAgreementsGetTypeUseCase;
        this.abManager = abManager2;
        this.debugConfigManager = debugConfigManager2;
    }

    private final boolean evaluateExperimentResponse(ElmoAbExperiment elmoAbExperiment, String str, String str2) {
        ExperimentResponse treatment = this.abManager.getTreatment(new ExperimentRequest(elmoAbExperiment, (String) null, 2, (DefaultConstructorMarker) null));
        if (treatment instanceof ExperimentResponse.Failure) {
            Exception error = ((ExperimentResponse.Failure) treatment).getError();
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E571, error.toString(), str2, error, PEnums.TransitionName.ELMO_PROCESS_CHECK, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
        } else if (!(treatment instanceof ExperimentResponse.Success)) {
            C19383o.m32792b(treatment, ExperimentResponse.Disable.INSTANCE);
            return false;
        } else if (C19383o.m32792b(((ExperimentResponse.Success) treatment).getResponse().getTreatmentName(), str)) {
            return true;
        }
        return false;
    }

    private final boolean isBillingAgreementWithPurchase() {
        BillingAgreementState value = this.getBillingAgreementUseCase.invoke().getValue();
        BillingAgreementType billingAgreementType = null;
        BillingAgreementState.SupportedState supportedState = value instanceof BillingAgreementState.SupportedState ? (BillingAgreementState.SupportedState) value : null;
        if (supportedState != null) {
            billingAgreementType = supportedState.getType();
        }
        return billingAgreementType == BillingAgreementType.WITH_PURCHASE;
    }

    public final AbManager getAbManager() {
        return this.abManager;
    }

    public final synchronized String getCartCurrencyCode() {
        return this.repository.getCartCurrencyCode();
    }

    public final synchronized String getGrandTotal() {
        String totalFormat;
        totalFormat = this.repository.getTotalFormat();
        if (totalFormat == null) {
            totalFormat = "";
        }
        return totalFormat;
    }

    public final synchronized String getInsurance() {
        return this.repository.getInsurance();
    }

    public final synchronized List<String> getItemCostList() {
        return this.repository.getListOfItemCosts();
    }

    public final synchronized List<List<ProductDescription>> getItemDescriptions() {
        return this.repository.getListOfItemDescriptions();
    }

    public final synchronized List<String> getItemNamesList() {
        return this.repository.getListOfItemNames();
    }

    public final synchronized List<String> getItemQuantityList() {
        return this.repository.getListOfItemQuantities();
    }

    public final List<Item> getListOfCartItems() {
        return this.repository.getCartItemsList();
    }

    public final synchronized String getShippingAndHandling() {
        return this.repository.getShippingAndHandling();
    }

    public final synchronized String getShippingDiscount() {
        return this.repository.getShippingDiscount();
    }

    public final synchronized String getSubTotal() {
        return this.repository.getSubtotal();
    }

    public final synchronized String getTax() {
        return this.repository.getTax();
    }

    public final String getTotalOverCaptureAmount() {
        return this.repository.getTotalOverCaptureAmount();
    }

    public final boolean isCartTotalVisible() {
        if (!AppBuildConfig.INSTANCE.getIsShippingCallbackEnabled()) {
            return Repository.PayModeEnum.PAY_NOW == this.repository.getPayMode();
        }
        boolean isSmartPaymentCheckout = this.debugConfigManager.isSmartPaymentCheckout();
        boolean z = !isSmartPaymentCheckout && !this.debugConfigManager.checkCheckoutJSSession();
        if ((Repository.PayModeEnum.PAY_NOW == this.repository.getPayMode()) || shouldShowOverCaptureAmount() || isSmartPaymentCheckout || isBillingAgreementWithPurchase()) {
            return true;
        }
        return z && this.debugConfigManager.getOnShippingChange() != null;
    }

    public final boolean isContinueCartExperiment() {
        if (TextUtils.isEmpty(getGrandTotal())) {
            return false;
        }
        ExperimentResponse treatment = this.abManager.getTreatment(new ExperimentRequest(ElmoAbExperiment.CONTINUE_CART_EXPERIMENT, (String) null, 2, (DefaultConstructorMarker) null));
        if (treatment instanceof ExperimentResponse.Success) {
            return C19383o.m32792b(((ExperimentResponse.Success) treatment).getResponse().getTreatmentName(), ElmoTreatment.CONTINUE_CART_EXPERIMENT_TRMT.getTreatmentName());
        }
        if (!(treatment instanceof ExperimentResponse.Failure)) {
            return false;
        }
        ExperimentResponse.Failure failure = (ExperimentResponse.Failure) treatment;
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E571, failure.getError().toString(), "fetchAndHandleExperiments()", failure.getError(), PEnums.TransitionName.ELMO_PROCESS_CHECK, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1984, (Object) null);
        return false;
    }

    public final boolean shouldShowOverCaptureAmount() {
        String currencyValue = this.repository.getCurrencyValue();
        String totalOverCaptureAmountValue = this.repository.getTotalOverCaptureAmountValue();
        if (!(currencyValue == null || totalOverCaptureAmountValue == null)) {
            try {
                return Double.parseDouble(currencyValue) < Double.parseDouble(totalOverCaptureAmountValue) && !this.repository.isVenmo();
            } catch (NumberFormatException e) {
                PLog.e$default(TAG, "Unable to format cart or over capture amount", e, 0, 8, (Object) null);
            }
        }
        return false;
    }

    public final boolean shouldShowShortOverCaptureText() {
        return evaluateExperimentResponse(ElmoAbExperiment.ANDROID_OVER_CAPTURE_TEXT, ElmoTreatment.ANDROID_OVER_CAPTURE_TEXT_TRMT.getTreatmentName(), "shouldShowShortOverCaptureText()");
    }
}
