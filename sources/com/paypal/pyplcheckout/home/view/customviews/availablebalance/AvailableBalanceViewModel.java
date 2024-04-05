package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import android.util.Log;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17183a;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementState;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetTypeUseCase;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.C17203a;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.AddCardViewStateUpdateEvent;
import com.paypal.pyplcheckout.events.model.CheckoutFinishedEventModel;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17224a;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.home.view.customviews.C17240d;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceState;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.SplitBalanceType;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import com.paypal.pyplcheckout.utils.SplitBalanceUtils;
import com.paypal.pyplcheckout.viewmodels.BaseViewModel;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

public final class AvailableBalanceViewModel extends BaseViewModel {
    private EventListener carouselAddCardListener;
    private EventListener carouselCreditOfferListener;
    private EventListener carouselFundingInstrumentListener;
    private EventListener carouselPayInFourListener;
    private EventListener checkoutButtonListener;
    private EventListener disableViewsTouchListener;
    private final Events events;
    private EventListener finalizeCheckoutListener;
    private final BillingAgreementsGetTypeUseCase getBillingAgreementType;
    private C2895z<AvailableBalanceState> internalViewState;
    private boolean primarySplitBalanceToggleState;
    private final Repository repository;
    private boolean secondarySplitBalanceToggleState;
    private final LiveData<AvailableBalanceState> viewState;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ContingencyType.values().length];
            iArr[ContingencyType.THREE_DS_V1_CONTINGENCY.ordinal()] = 1;
            iArr[ContingencyType.THREE_DS_V2_CONTINGENCY.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContingencyProcessingStatus.values().length];
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_STARTED.ordinal()] = 1;
            iArr2[ContingencyProcessingStatus.THREE_DS_SUBMIT_CLICKED.ordinal()] = 2;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_FAILED.ordinal()] = 3;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_2_FAILED.ordinal()] = 4;
            iArr2[ContingencyProcessingStatus.THREE_DS_LOOK_UP_FAILED.ordinal()] = 5;
            iArr2[ContingencyProcessingStatus.THREE_DS_AUTHENTICATE_FAILED.ordinal()] = 6;
            iArr2[ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE.ordinal()] = 7;
            iArr2[ContingencyProcessingStatus.THREE_DS_CANCEL_CLICKED.ordinal()] = 8;
            iArr2[ContingencyProcessingStatus.THREE_DS_RESOLVE_FAILED.ordinal()] = 9;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SplitBalanceType.Type.values().length];
            iArr3[SplitBalanceType.Type.NO_SPLIT_BALANCE.ordinal()] = 1;
            iArr3[SplitBalanceType.Type.SINGLE_SPLIT_BALANCE.ordinal()] = 2;
            iArr3[SplitBalanceType.Type.MULTIPLE_SPLIT_BALANCE.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public AvailableBalanceViewModel(Repository repository2, Events events2, BillingAgreementsGetTypeUseCase billingAgreementsGetTypeUseCase) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(billingAgreementsGetTypeUseCase, "getBillingAgreementType");
        this.repository = repository2;
        this.events = events2;
        this.getBillingAgreementType = billingAgreementsGetTypeUseCase;
        C2895z<AvailableBalanceState> zVar = new C2895z<>(AvailableBalanceState.NoSplitBalance.INSTANCE);
        this.internalViewState = zVar;
        this.viewState = zVar;
        Log.d("viewModelTest", String.valueOf(zVar.hasObservers()));
    }

    private final int getBalanceStringId() {
        return this.getBillingAgreementType.invoke().getValue() instanceof BillingAgreementState.UnsupportedState ? C17165R.string.paypal_checkout_use_paypal_balance : C17165R.string.f37652x31bc3c13;
    }

    private final Integer getErrorStringIdForSplitBalance(String str) {
        if (str == null || C19457k.m33020X0(str)) {
            return null;
        }
        if (PaymentTypes.PAYPAL_CREDIT.equals(str, true)) {
            return Integer.valueOf(C17165R.string.paypal_checkout_your_balance_can_not_be_used_with_paypal_credit);
        }
        String paymentTypes = PaymentTypes.BALANCE.toString();
        C19383o.m32796f(paymentTypes, "BALANCE.toString()");
        if (C19459m.m33036e1(str, paymentTypes, true)) {
            return Integer.valueOf(C17165R.string.paypal_checkout_your_balance_can_not_be_used_with_your_balance);
        }
        if (PaymentTypes.CREDIT_CARD.equals(str, true)) {
            return Integer.valueOf(C17165R.string.f37657x15cc124b);
        }
        if (PaymentTypes.BANK_ACCOUNT.equals(str, true)) {
            return Integer.valueOf(C17165R.string.f37656x68405c15);
        }
        return null;
    }

    private final String getFirstSplitBalanceId() {
        return SplitBalanceUtils.getFirstSplitBalanceId();
    }

    private final SplitBalanceInfo getSecondSplitBalance(String str, Integer num) {
        String str2 = null;
        if (getSplitBalanceTypeOfAllFundingOption() != SplitBalanceType.Type.MULTIPLE_SPLIT_BALANCE) {
            return null;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        String secondSplitBalanceId = getSecondSplitBalanceId();
        if (secondSplitBalanceId != null) {
            String paymentTypes = PaymentTypes.BALANCE.toString();
            C19383o.m32796f(paymentTypes, "BALANCE.toString()");
            str2 = C19457k.m33023a1(secondSplitBalanceId, paymentTypes, "", false);
        }
        return new SplitBalanceInfo(str, num, str2);
    }

    private final String getSecondSplitBalanceId() {
        return SplitBalanceUtils.getSecondSplitBalanceId();
    }

    private final SplitBalanceType.Type getSplitBalanceTypeOfAllFundingOption() {
        return SplitBalanceUtils.getSplitBalanceTypeOfAllFundingOptions();
    }

    private final void handleFundingOption(String str, String str2, boolean z, boolean z2) {
        String str3;
        String firstSplitBalanceAmount = SplitBalanceUtils.getFirstSplitBalanceAmount();
        if (firstSplitBalanceAmount == null || firstSplitBalanceAmount.length() == 0) {
            this.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
            return;
        }
        String str4 = str;
        String str5 = PaymentTypes.PAYPAL_CREDIT.equals(str4, true) ? str4 : str2;
        PaymentTypes paymentTypes = PaymentTypes.BALANCE;
        String paymentTypes2 = paymentTypes.toString();
        C19383o.m32796f(paymentTypes2, "BALANCE.toString()");
        if (C19459m.m33036e1(str5, paymentTypes2, true)) {
            String paymentTypes3 = paymentTypes.toString();
            C19383o.m32796f(paymentTypes3, "BALANCE.toString()");
            str3 = C19457k.m33023a1(str5, paymentTypes3, "", false);
        } else {
            str3 = "";
        }
        String str6 = null;
        Integer errorStringIdForSplitBalance = !z ? getErrorStringIdForSplitBalance(str) : null;
        Integer errorStringIdForSplitBalance2 = !z2 ? getErrorStringIdForSplitBalance(str) : null;
        String firstSplitBalanceId = getFirstSplitBalanceId();
        if (firstSplitBalanceId != null) {
            String paymentTypes4 = paymentTypes.toString();
            C19383o.m32796f(paymentTypes4, "BALANCE.toString()");
            str6 = C19457k.m33023a1(firstSplitBalanceId, paymentTypes4, "", false);
        }
        this.internalViewState.setValue(new AvailableBalanceState.ShowSplitBalance(new SplitBalanceInfo(firstSplitBalanceAmount, errorStringIdForSplitBalance, str6), getSecondSplitBalance(SplitBalanceUtils.getSecondSplitBalanceAmount(), errorStringIdForSplitBalance2), str3, getBalanceStringId()));
        PLog.impression$default(PEnums.TransitionName.BALANCE_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, "review_your_information_screen", "balance_view", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEventListeners$lambda-0  reason: not valid java name */
    public static final void m35396initEventListeners$lambda0(AvailableBalanceViewModel availableBalanceViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(availableBalanceViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData != null) {
            Object data = ((Success) resultData).getData();
            if (data != null) {
                CheckoutFinishedEventModel checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
                if (checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
                    availableBalanceViewModel.storeSelectedPlan();
                    availableBalanceViewModel.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.model.CheckoutFinishedEventModel");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.Success<*>");
    }

    /* access modifiers changed from: private */
    /* renamed from: initEventListeners$lambda-1  reason: not valid java name */
    public static final void m35397initEventListeners$lambda1(AvailableBalanceViewModel availableBalanceViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(availableBalanceViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData != null) {
            Object data = ((Success) resultData).getData();
            if (data != null) {
                AddCardViewStateUpdateEvent addCardViewStateUpdateEvent = (AddCardViewStateUpdateEvent) data;
                if (addCardViewStateUpdateEvent.getListOfPaymentCards().get(addCardViewStateUpdateEvent.getAddCardPosition()) instanceof CardUiModel.AddCardUiModel) {
                    availableBalanceViewModel.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.model.AddCardViewStateUpdateEvent");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.pyplcheckout.events.Success<*>");
    }

    /* access modifiers changed from: private */
    /* renamed from: initEventListeners$lambda-2  reason: not valid java name */
    public static final void m35398initEventListeners$lambda2(AvailableBalanceViewModel availableBalanceViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(availableBalanceViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        availableBalanceViewModel.updateSplitBalance();
    }

    /* access modifiers changed from: private */
    /* renamed from: initEventListeners$lambda-3  reason: not valid java name */
    public static final void m35399initEventListeners$lambda3(AvailableBalanceViewModel availableBalanceViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(availableBalanceViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        availableBalanceViewModel.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEventListeners$lambda-4  reason: not valid java name */
    public static final void m35400initEventListeners$lambda4(AvailableBalanceViewModel availableBalanceViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(availableBalanceViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        availableBalanceViewModel.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEventListeners$lambda-5  reason: not valid java name */
    public static final void m35401initEventListeners$lambda5(AvailableBalanceViewModel availableBalanceViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(availableBalanceViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        availableBalanceViewModel.internalViewState.setValue(AvailableBalanceState.EnabledState.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEventListeners$lambda-6  reason: not valid java name */
    public static final void m35402initEventListeners$lambda6(AvailableBalanceViewModel availableBalanceViewModel, EventType eventType, ResultData resultData) {
        C19383o.m32797g(availableBalanceViewModel, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        availableBalanceViewModel.internalViewState.setValue(AvailableBalanceState.DisabledState.INSTANCE);
    }

    private final void storeSelectedPlan() {
        boolean z;
        int i = WhenMappings.$EnumSwitchMapping$2[getSplitBalanceTypeOfAllFundingOption().ordinal()];
        boolean z2 = false;
        if (i != 1) {
            if (i == 2) {
                z2 = this.primarySplitBalanceToggleState;
                z = false;
            } else if (i == 3) {
                z2 = this.primarySplitBalanceToggleState;
                z = this.secondarySplitBalanceToggleState;
            }
            this.repository.setUserSelectedPlan(SplitBalanceUtils.findPlanMatchingSelectedSplitBalance(this.repository.getSelectedFundingOption(), z2, z));
        }
        z = false;
        this.repository.setUserSelectedPlan(SplitBalanceUtils.findPlanMatchingSelectedSplitBalance(this.repository.getSelectedFundingOption(), z2, z));
    }

    private final void updateSplitBalance() {
        String str;
        CurrencyConversionType selectedCurrencyConversionType = this.repository.getSelectedCurrencyConversionType();
        FundingOption selectedFundingOption = this.repository.getSelectedFundingOption();
        if (selectedFundingOption != null) {
            String type = selectedFundingOption.getFundingInstrument().getType();
            if (type == null) {
                type = "";
            }
            String id = selectedFundingOption.getId();
            if (id == null) {
                id = "";
            }
            if (getSplitBalanceTypeOfAllFundingOption() == SplitBalanceType.Type.NO_SPLIT_BALANCE) {
                this.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
            } else if (PaymentTypes.ADD_CARD.equals(id, true)) {
                this.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
            } else {
                if (!PaymentTypes.PAYPAL_CREDIT.equals(type, true)) {
                    PaymentTypes paymentTypes = PaymentTypes.BALANCE;
                    String paymentTypes2 = paymentTypes.toString();
                    C19383o.m32796f(paymentTypes2, "BALANCE.toString()");
                    if (!C19459m.m33036e1(id, paymentTypes2, true)) {
                        if (selectedCurrencyConversionType == CurrencyConversionType.VENDOR) {
                            String cartCurrencyCode = this.repository.getCartCurrencyCode();
                            String firstSplitBalanceId = getFirstSplitBalanceId();
                            String str2 = null;
                            if (firstSplitBalanceId == null) {
                                str = null;
                            } else {
                                String paymentTypes3 = paymentTypes.toString();
                                C19383o.m32796f(paymentTypes3, "BALANCE.toString()");
                                str = C19457k.m33023a1(firstSplitBalanceId, paymentTypes3, "", false);
                            }
                            String secondSplitBalanceId = getSecondSplitBalanceId();
                            if (secondSplitBalanceId != null) {
                                String paymentTypes4 = paymentTypes.toString();
                                C19383o.m32796f(paymentTypes4, "BALANCE.toString()");
                                str2 = C19457k.m33023a1(secondSplitBalanceId, paymentTypes4, "", false);
                            }
                            handleFundingOption(type, id, C19457k.m33019W0(cartCurrencyCode, str, true), C19457k.m33019W0(cartCurrencyCode, str2, true));
                            return;
                        }
                        handleFundingOption(type, id, true, true);
                        return;
                    }
                }
                handleFundingOption(type, id, false, false);
            }
        }
    }

    public final void clearLiveData() {
        this.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
    }

    public final LiveData<AvailableBalanceState> getViewState() {
        return this.viewState;
    }

    public final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        if (contingencyEventsModel != null) {
            ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
            ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
            int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
            if (i == 1 || i == 2) {
                switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                    case 1:
                    case 2:
                        this.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
                        return;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        updateSplitBalance();
                        return;
                    default:
                        String str = AvailablePpBalanceView.TAG;
                        PLog.i$default(str, "ContingencyProcessingStatus of type " + contingencyProcessingStatus + " not handled", 0, 4, (Object) null);
                        return;
                }
            } else {
                String str2 = AvailablePpBalanceView.TAG;
                PLog.i$default(str2, "ContingencyType of type " + contingencyType + " not handled", 0, 4, (Object) null);
            }
        }
    }

    public final void initEventListeners() {
        C17224a aVar = new C17224a(this, 4);
        this.checkoutButtonListener = aVar;
        this.carouselAddCardListener = new C17193a(this, 7);
        this.carouselFundingInstrumentListener = new C17225b(this, 6);
        this.carouselCreditOfferListener = new C17203a(this, 7);
        this.carouselPayInFourListener = new C17198a(this, 7);
        this.finalizeCheckoutListener = new C17240d(this, 4);
        this.disableViewsTouchListener = new C17183a(this, 2);
        this.events.listen(PayPalEventTypes.CHECKOUT_BUTTON_CLICKED, aVar);
        Events events2 = this.events;
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED;
        EventListener eventListener = this.carouselAddCardListener;
        if (eventListener != null) {
            events2.listen(payPalEventTypes, eventListener);
            Events events3 = this.events;
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
            EventListener eventListener2 = this.carouselFundingInstrumentListener;
            if (eventListener2 != null) {
                events3.listen(payPalEventTypes2, eventListener2);
                Events events4 = this.events;
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
                EventListener eventListener3 = this.carouselCreditOfferListener;
                if (eventListener3 != null) {
                    events4.listen(payPalEventTypes3, eventListener3);
                    Events events5 = this.events;
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
                    EventListener eventListener4 = this.carouselPayInFourListener;
                    if (eventListener4 != null) {
                        events5.listen(payPalEventTypes4, eventListener4);
                        Events events6 = this.events;
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                        EventListener eventListener5 = this.finalizeCheckoutListener;
                        if (eventListener5 != null) {
                            events6.listen(payPalEventTypes5, eventListener5);
                            Events events7 = this.events;
                            PayPalEventTypes payPalEventTypes6 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                            EventListener eventListener6 = this.disableViewsTouchListener;
                            if (eventListener6 != null) {
                                events7.listen(payPalEventTypes6, eventListener6);
                            } else {
                                C19383o.m32805o("disableViewsTouchListener");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("finalizeCheckoutListener");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("carouselPayInFourListener");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("carouselCreditOfferListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("carouselFundingInstrumentListener");
                throw null;
            }
        } else {
            C19383o.m32805o("carouselAddCardListener");
            throw null;
        }
    }

    public final void onFetchingUserDataCompleted(boolean z) {
        if (this.repository.getContingencyEventsModel() == null && z) {
            updateSplitBalance();
        }
    }

    public final void onLogoutCompleted() {
        this.internalViewState.setValue(AvailableBalanceState.NoSplitBalance.INSTANCE);
    }

    public final void primarySplitBalanceToggleUpdated(boolean z) {
        this.primarySplitBalanceToggleState = z;
    }

    public final void removeAllListeners() {
        Events events2 = this.events;
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
        EventListener eventListener = this.carouselPayInFourListener;
        if (eventListener != null) {
            events2.removeListener(payPalEventTypes, eventListener);
            Events events3 = this.events;
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
            EventListener eventListener2 = this.carouselCreditOfferListener;
            if (eventListener2 != null) {
                events3.removeListener(payPalEventTypes2, eventListener2);
                Events events4 = this.events;
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                EventListener eventListener3 = this.carouselFundingInstrumentListener;
                if (eventListener3 != null) {
                    events4.removeListener(payPalEventTypes3, eventListener3);
                    Events events5 = this.events;
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                    EventListener eventListener4 = this.finalizeCheckoutListener;
                    if (eventListener4 != null) {
                        events5.removeListener(payPalEventTypes4, eventListener4);
                        Events events6 = this.events;
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                        EventListener eventListener5 = this.disableViewsTouchListener;
                        if (eventListener5 != null) {
                            events6.removeListener(payPalEventTypes5, eventListener5);
                        } else {
                            C19383o.m32805o("disableViewsTouchListener");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("finalizeCheckoutListener");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("carouselFundingInstrumentListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("carouselCreditOfferListener");
                throw null;
            }
        } else {
            C19383o.m32805o("carouselPayInFourListener");
            throw null;
        }
    }

    public final void secondarySplitBalanceToggleUpdated(boolean z) {
        this.secondarySplitBalanceToggleState = z;
    }
}
