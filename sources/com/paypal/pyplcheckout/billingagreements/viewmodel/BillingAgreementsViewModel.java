package com.paypal.pyplcheckout.billingagreements.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementBalancePreference;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsRepository;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsCacheTypeUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetBalancePrefUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsSetBalancePrefUseCase;
import com.paypal.pyplcheckout.billingagreements.view.fragment.PYPLBillingAgreementsTermsFragment;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaInfoHeaderState;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTermsFooterState;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTermsState;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTextState;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaToggleState;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.fundingOptions.model.SelectedOptionState;
import com.paypal.pyplcheckout.fundingOptions.usecase.GetSelectedFundingOptionUseCase;
import com.paypal.pyplcheckout.pojo.Cart;
import com.paypal.pyplcheckout.pojo.CheckoutMerchant;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.CheckoutSessionType;
import com.paypal.pyplcheckout.pojo.Data;
import com.paypal.pyplcheckout.pojo.Locale;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.userprofile.model.UserCountry;
import com.paypal.pyplcheckout.userprofile.usecase.GetUserCountryUseCase;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PayPalConstants;
import com.paypal.pyplcheckout.utils.SplitBalanceUtils;
import com.paypal.pyplcheckout.viewmodels.BaseViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19689x1;

public final class BillingAgreementsViewModel extends BaseViewModel {
    /* access modifiers changed from: private */
    public final C2895z<BaInfoHeaderState> _baInfoHeaderState = new C2895z<>();
    /* access modifiers changed from: private */
    public final C2895z<BaTextState> _baPurchaseTextState = new C2895z<>();
    /* access modifiers changed from: private */
    public final C2895z<BaTermsFooterState> _baTermsFooterState = new C2895z<>();
    /* access modifiers changed from: private */
    public final C2895z<BaTermsState> _baTermsState = new C2895z<>();
    /* access modifiers changed from: private */
    public final C2895z<BaToggleState> _baToggleState = new C2895z<>();
    private final BillingAgreementsCacheTypeUseCase billingAgreementsCacheTypeUseCase;
    /* access modifiers changed from: private */
    public final BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase;
    private final BillingAgreementsRepository billingAgreementsRepository;
    private final Events events;
    private final BillingAgreementsGetBalancePrefUseCase getBalancePrefUseCase;
    /* access modifiers changed from: private */
    public final GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase;
    private final GetUserCountryUseCase getUserCountryUseCase;
    /* access modifiers changed from: private */
    public final PYPLCheckoutUtils pyplCheckoutUtils;
    private final Repository repository;
    private final BillingAgreementsSetBalancePrefUseCase setBalancePrefUseCase;
    private final EventListener userCheckoutEventListener = new C17203a(this, 0);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BillingAgreementType.values().length];
            iArr[BillingAgreementType.WITH_PURCHASE.ordinal()] = 1;
            iArr[BillingAgreementType.WITHOUT_PURCHASE.ordinal()] = 2;
            iArr[BillingAgreementType.NOT_SUPPORTED.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BillingAgreementBalancePreference.values().length];
            iArr2[BillingAgreementBalancePreference.NONE.ordinal()] = 1;
            iArr2[BillingAgreementBalancePreference.ENABLED.ordinal()] = 2;
            iArr2[BillingAgreementBalancePreference.DISABLED.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public BillingAgreementsViewModel(Events events2, Repository repository2, BillingAgreementsGetBalancePrefUseCase billingAgreementsGetBalancePrefUseCase, BillingAgreementsSetBalancePrefUseCase billingAgreementsSetBalancePrefUseCase, BillingAgreementsCacheTypeUseCase billingAgreementsCacheTypeUseCase2, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase2, GetSelectedFundingOptionUseCase getSelectedFundingOptionUseCase2, GetUserCountryUseCase getUserCountryUseCase2, PYPLCheckoutUtils pYPLCheckoutUtils, BillingAgreementsRepository billingAgreementsRepository2) {
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(billingAgreementsGetBalancePrefUseCase, "getBalancePrefUseCase");
        C19383o.m32797g(billingAgreementsSetBalancePrefUseCase, "setBalancePrefUseCase");
        C19383o.m32797g(billingAgreementsCacheTypeUseCase2, "billingAgreementsCacheTypeUseCase");
        C19383o.m32797g(billingAgreementsGetTypeUseCase2, "billingAgreementsGetTypeUseCase");
        C19383o.m32797g(getSelectedFundingOptionUseCase2, "getSelectedFundingOptionUseCase");
        C19383o.m32797g(getUserCountryUseCase2, "getUserCountryUseCase");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        C19383o.m32797g(billingAgreementsRepository2, "billingAgreementsRepository");
        this.events = events2;
        this.repository = repository2;
        this.getBalancePrefUseCase = billingAgreementsGetBalancePrefUseCase;
        this.setBalancePrefUseCase = billingAgreementsSetBalancePrefUseCase;
        this.billingAgreementsCacheTypeUseCase = billingAgreementsCacheTypeUseCase2;
        this.billingAgreementsGetTypeUseCase = billingAgreementsGetTypeUseCase2;
        this.getSelectedFundingOptionUseCase = getSelectedFundingOptionUseCase2;
        this.getUserCountryUseCase = getUserCountryUseCase2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
        this.billingAgreementsRepository = billingAgreementsRepository2;
        collect();
    }

    private final void collect() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new BillingAgreementsViewModel$collect$1(this, (C19340c<? super BillingAgreementsViewModel$collect$1>) null), 3);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new BillingAgreementsViewModel$collect$2(this, (C19340c<? super BillingAgreementsViewModel$collect$2>) null), 3);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new BillingAgreementsViewModel$collect$3(this, (C19340c<? super BillingAgreementsViewModel$collect$3>) null), 3);
    }

    /* access modifiers changed from: private */
    public final C19689x1<BillingAgreementBalancePreference> getBalancePreference() {
        return this.getBalancePrefUseCase.invoke();
    }

    private final C19689x1<SelectedOptionState> getSelectedFundingOption() {
        return this.getSelectedFundingOptionUseCase.invoke();
    }

    private final BaTermsState getTermsStateForEU(BillingAgreementType billingAgreementType) {
        int i;
        CheckoutMerchant merchant;
        int i2 = WhenMappings.$EnumSwitchMapping$0[billingAgreementType.ordinal()];
        if (i2 == 1) {
            i = C17165R.string.paypal_checkout_billing_agreements_terms_eu_purchase;
        } else if (i2 == 2) {
            i = C17165R.string.paypal_checkout_billing_agreements_terms_eu_no_purchase;
        } else if (i2 == 3) {
            return BaTermsState.Hide.INSTANCE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutSession checkoutSession = this.repository.getCheckoutSession();
        String str = null;
        if (!(checkoutSession == null || (merchant = checkoutSession.getMerchant()) == null)) {
            str = merchant.getName();
        }
        if (str == null) {
            str = "";
        }
        return new BaTermsState.ShowLinkText(i, str, PayPalConstants.getUserAgreementUrl(getUserCountry().getLocale(), getUserCountry().getCountry()));
    }

    private final boolean isVisibleForSelectedFundingOption() {
        SelectedOptionState value = getSelectedFundingOption().getValue();
        return (value instanceof SelectedOptionState.PaymentSource) || (value instanceof SelectedOptionState.PayPalBalance) || (value instanceof SelectedOptionState.Crypto);
    }

    /* access modifiers changed from: private */
    public final BaInfoHeaderState mapInfoHeaderState(BillingAgreementState billingAgreementState) {
        CheckoutMerchant merchant;
        CheckoutSession checkoutSession = this.repository.getCheckoutSession();
        String str = null;
        if (!(checkoutSession == null || (merchant = checkoutSession.getMerchant()) == null)) {
            str = merchant.getName();
        }
        if (str == null) {
            str = "";
        }
        return !(billingAgreementState instanceof BillingAgreementState.SupportedState) ? BaInfoHeaderState.Hide.INSTANCE : ((BillingAgreementState.SupportedState) billingAgreementState).getType() != BillingAgreementType.WITHOUT_PURCHASE ? BaInfoHeaderState.Hide.INSTANCE : (!isVisibleForSelectedFundingOption() || shouldFallbackToWeb(billingAgreementState)) ? BaInfoHeaderState.Hide.INSTANCE : getUserCountry() instanceof UserCountry.C17272EU ? new BaInfoHeaderState.Show(str, C17165R.string.paypal_checkout_billing_agreements_info_header_title_eu, C17165R.string.paypal_checkout_billing_agreements_details) : new BaInfoHeaderState.Show(str, C17165R.string.paypal_checkout_billing_agreements_info_header_title, C17165R.string.paypal_checkout_billing_agreements_authorization_info);
    }

    /* access modifiers changed from: private */
    public final BaTextState mapPurchaseTextState(BillingAgreementState billingAgreementState) {
        CheckoutMerchant merchant;
        if (!isVisibleForSelectedFundingOption() || shouldFallbackToWeb(billingAgreementState)) {
            return BaTextState.Hide.INSTANCE;
        }
        int i = getUserCountry() instanceof UserCountry.C17272EU ? C17165R.string.paypal_checkout_billing_agreements_legal_text_eu : C17165R.string.paypal_checkout_billing_agreements_legal_text;
        Locale locale = null;
        BillingAgreementState.SupportedState supportedState = billingAgreementState instanceof BillingAgreementState.SupportedState ? (BillingAgreementState.SupportedState) billingAgreementState : null;
        BillingAgreementType type = supportedState == null ? null : supportedState.getType();
        if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) != 1) {
            return BaTextState.Hide.INSTANCE;
        }
        CheckoutSession checkoutSession = this.repository.getCheckoutSession();
        String name = (checkoutSession == null || (merchant = checkoutSession.getMerchant()) == null) ? null : merchant.getName();
        if (name == null) {
            name = "";
        }
        User user = this.repository.getUser();
        if (user != null) {
            locale = user.getLocale();
        }
        return new BaTextState.Show(name, locale, i);
    }

    /* access modifiers changed from: private */
    public final BaTermsFooterState mapTermsFooterState(BillingAgreementState billingAgreementState) {
        if (!(billingAgreementState instanceof BillingAgreementState.SupportedState) || !(getUserCountry() instanceof UserCountry.C17273US)) {
            return BaTermsFooterState.Hide.INSTANCE;
        }
        PayPalConstants payPalConstants = PayPalConstants.INSTANCE;
        return new BaTermsFooterState.ShowLink(PayPalConstants.getPolicyUrl(getUserCountry().getLocale(), getUserCountry().getCountry()));
    }

    /* access modifiers changed from: private */
    public final BaTermsState mapTermsState(BillingAgreementState billingAgreementState) {
        if (!(billingAgreementState instanceof BillingAgreementState.SupportedState)) {
            return BaTermsState.Hide.INSTANCE;
        }
        if (getUserCountry() instanceof UserCountry.C17272EU) {
            return getTermsStateForEU(((BillingAgreementState.SupportedState) billingAgreementState).getType());
        }
        BillingAgreementState.SupportedState supportedState = (BillingAgreementState.SupportedState) billingAgreementState;
        return supportedState.getType() == BillingAgreementType.WITH_PURCHASE ? new BaTermsState.ShowText(C17165R.string.paypal_checkout_billing_agreements_terms_purchase) : supportedState.getType() == BillingAgreementType.WITHOUT_PURCHASE ? new BaTermsState.ShowText(C17165R.string.paypal_checkout_billing_agreeements_terms_no_purchase) : BaTermsState.Hide.INSTANCE;
    }

    /* access modifiers changed from: private */
    public final BaToggleState mapToggleState(BillingAgreementBalancePreference billingAgreementBalancePreference) {
        if (!isVisibleForSelectedFundingOption()) {
            return BaToggleState.Hide.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[billingAgreementBalancePreference.ordinal()];
        if (i == 1) {
            return BaToggleState.Hide.INSTANCE;
        }
        if (i == 2) {
            return new BaToggleState.Show(true);
        }
        if (i == 3) {
            return new BaToggleState.Show(false);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    public final boolean shouldFallbackToWeb(BillingAgreementState billingAgreementState) {
        return (billingAgreementState instanceof BillingAgreementState.SupportedState) && ((BillingAgreementState.SupportedState) billingAgreementState).getType() == BillingAgreementType.WITH_PURCHASE && SplitBalanceUtils.isMultipleSplitBalanceVisible();
    }

    /* access modifiers changed from: private */
    /* renamed from: userCheckoutEventListener$lambda-2  reason: not valid java name */
    public static final void m35236userCheckoutEventListener$lambda2(BillingAgreementsViewModel billingAgreementsViewModel, EventType eventType, ResultData resultData) {
        Data data;
        CheckoutSession checkoutSession;
        Cart cart;
        Data data2;
        CheckoutSession checkoutSession2;
        CheckoutSessionType checkoutSessionType;
        C19383o.m32797g(billingAgreementsViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData instanceof Success) {
            Object data3 = ((Success) resultData).getData();
            UserCheckoutResponse userCheckoutResponse = data3 instanceof UserCheckoutResponse ? (UserCheckoutResponse) data3 : null;
            if (!(userCheckoutResponse == null || (data2 = userCheckoutResponse.getData()) == null || (checkoutSession2 = data2.getCheckoutSession()) == null || (checkoutSessionType = checkoutSession2.getCheckoutSessionType()) == null)) {
                billingAgreementsViewModel.billingAgreementsCacheTypeUseCase.invoke(checkoutSessionType);
            }
            if (userCheckoutResponse != null && (data = userCheckoutResponse.getData()) != null && (checkoutSession = data.getCheckoutSession()) != null && (cart = checkoutSession.getCart()) != null) {
                billingAgreementsViewModel.billingAgreementsRepository.setBillingAgreementToken(cart.getBillingToken());
            }
        }
    }

    public final void closeTermsFragment(Fragment fragment) {
        C19383o.m32797g(fragment, "fragment");
        ContentRouter contentRouter = ContentRouter.INSTANCE;
        String tag = PYPLBillingAgreementsTermsFragment.Companion.getTAG();
        C19383o.m32796f(tag, "PYPLBillingAgreementsTermsFragment.TAG");
        contentRouter.finishFragment(tag, fragment);
    }

    public final LiveData<BaInfoHeaderState> getBaInfoHeaderState() {
        return this._baInfoHeaderState;
    }

    public final LiveData<BaTextState> getBaPurchaseTextState() {
        return this._baPurchaseTextState;
    }

    public final LiveData<BaTermsFooterState> getBaTermsFooterState() {
        return this._baTermsFooterState;
    }

    public final LiveData<BaTermsState> getBaTermsState() {
        return this._baTermsState;
    }

    public final LiveData<BaToggleState> getBaToggleState() {
        return this._baToggleState;
    }

    public final BillingAgreementType getBillingAgreementType() {
        BillingAgreementState value = this.billingAgreementsGetTypeUseCase.invoke().getValue();
        if (value instanceof BillingAgreementState.UnsupportedState) {
            return BillingAgreementType.NOT_SUPPORTED;
        }
        if (value instanceof BillingAgreementState.SupportedState) {
            return ((BillingAgreementState.SupportedState) value).getType();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getBillingAgreementsTermsHeaderText() {
        return getUserCountry() instanceof UserCountry.C17272EU ? C17165R.string.paypal_checkout_billing_agreements_details : C17165R.string.paypal_checkout_billing_agreements_authorization_info;
    }

    public final int getCtaTextForBillingAgreements() {
        return getUserCountry() instanceof UserCountry.C17272EU ? C17165R.string.paypal_checkout_billing_agreements_authorize_and_continue : C17165R.string.paypal_checkout_billing_agreements_agree_and_continue;
    }

    public final boolean getShouldHidePoliciesLink() {
        return !(getUserCountry() instanceof UserCountry.C17273US) || getBillingAgreementType() != BillingAgreementType.NOT_SUPPORTED;
    }

    public final UserCountry getUserCountry() {
        return this.getUserCountryUseCase.invoke().getValue();
    }

    public final void listenForEvents() {
        this.events.listen(PayPalEventTypes.FINISHED_USER_CHECKOUT_RESPONSE, this.userCheckoutEventListener);
    }

    public final void openTermsFragment() {
        Events events2 = this.events;
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.START_FRAGMENT;
        PYPLBillingAgreementsTermsFragment.Companion companion = PYPLBillingAgreementsTermsFragment.Companion;
        PYPLBillingAgreementsTermsFragment newInstance = companion.newInstance();
        String tag = companion.getTAG();
        C19383o.m32796f(tag, "TAG");
        events2.fire(payPalEventTypes, new Success(new FragmentInfo(tag, newInstance)));
    }

    public final void setAlwaysUseBalancePreference(boolean z) {
        this.setBalancePrefUseCase.invoke(z);
    }
}
