package com.paypal.pyplcheckout.home.view.customviews;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.C0326j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.conversation.details.ccm.C9499h;
import com.etsy.android.p327ui.conversation.details.ccm.C9500i;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9663d;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17188f;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17189g;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17190h;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.conversionrate.view.fragments.PYPLConversionRateFragment;
import com.paypal.pyplcheckout.conversionrateprotection.view.fragments.PYPLRateProtectionFragment;
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
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.events.model.FundingInstrumentSelectedEvent;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17224a;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCurrencyConversionViewListener;
import com.paypal.pyplcheckout.home.viewmodel.CartViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import com.paypal.pyplcheckout.utils.ExpandableView;
import com.paypal.pyplcheckout.utils.ExpandableViewHelper;
import com.paypal.pyplcheckout.utils.ExpandableViewState;
import com.paypal.pyplcheckout.utils.ExpandableViewTransitionProperties;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PayPalConstants;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import com.paypal.pyplcheckout.utils.SplitBalanceUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p003a2.C0015b;
import p010a9.C0048b;
import p114g4.C6867g;
import p260v0.C8184a;
import p753kq.C19846a;

public final class PayPalCurrencyConversionView extends FrameLayout implements ContentView, ExpandableView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalCurrencyConversionView";
    private static final long VIEW_STATE_COLLAPSE_DELAY = 150;
    private static final long VIEW_STATE_COLLAPSE_DURATION = 250;
    private static final long VIEW_STATE_EXPAND_DELAY = 360;
    private static final long VIEW_STATE_INITIAL_EXPAND_DELAY = 610;
    public Map<Integer, View> _$_findViewCache;
    private String amountYouWillPayStr;
    private EventListener carouselAddCardListener;
    private EventListener carouselCreditOfferListener;
    private EventListener carouselFundingInstrumentListener;
    private EventListener carouselPayInFourListener;
    private final C19285c cartViewModel$delegate;
    private EventListener checkoutButtonListener;
    /* access modifiers changed from: private */
    public TextView conversionOptionsTv;
    private ImageView conversionRateIv;
    private String conversionRateStr;
    private TextView conversionRateTv;
    private LinkTextView conversionSpreadTV;
    private TextView conversionViewTitleTv;
    private String convertedAmount;
    private TextView cryptoCurrencySellingAmountTv;
    private ConstraintLayout currencyConversionRL;
    private EventListener disableViewsTouchListener;
    private final ExpandableViewHelper expandableViewHelper;
    private EventListener fetchCryptoQuoteResponseListener;
    private EventListener finalizeCheckoutListener;
    private final C19285c fundingOptionsViewModel$delegate;
    private boolean isPayPalConversionRLEnabled;
    private PayPalCurrencyConversionViewListener mPayPalCurrencyConversionViewListener;
    private final C19285c mainPaysheetViewModel$delegate;
    private boolean payPalBalanceModeEnabled;
    private TextView seeMore72HourTv;
    private final C19285c userViewModel$delegate;
    private final C19285c viewExpandTransitionDuration$delegate;
    private RelativeLayout wrapper72Hour;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

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
            iArr2[ContingencyProcessingStatus.THREE_DS_RESOLVE_SUCCESS.ordinal()] = 10;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ExpandableViewState.values().length];
            iArr3[ExpandableViewState.Expanded.ordinal()] = 1;
            iArr3[ExpandableViewState.Collapsed.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Class<PayPalCurrencyConversionView> cls = PayPalCurrencyConversionView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCurrencyConversionView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalCurrencyConversionViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCurrencyConversionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalCurrencyConversionViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCurrencyConversionView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalCurrencyConversionViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCurrencyConversionView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        this(context, attributeSet, i, fragment, (PayPalCurrencyConversionViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalCurrencyConversionView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment, (i2 & 16) != 0 ? null : payPalCurrencyConversionViewListener);
    }

    private final SpannableStringBuilder formatCryptoRatesAndFeesText() {
        String string = getResources().getString(C17165R.string.paypal_checkout_see_crypto_to_pay);
        C19383o.m32796f(string, "resources.getString(R.st…eckout_see_crypto_to_pay)");
        String string2 = getResources().getString(C17165R.string.paypal_checkout_rates_and_fees);
        C19383o.m32796f(string2, "resources.getString(R.st…_checkout_rates_and_fees)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(string);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.append(string2);
        Context context = getContext();
        int i = C17165R.color.blue_color_600;
        Object obj = C8184a.f17966a;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C8184a.C8188d.m16468a(context, i)), string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private final CartViewModel getCartViewModel() {
        return (CartViewModel) this.cartViewModel$delegate.getValue();
    }

    private final FundingOptionsViewModel getFundingOptionsViewModel() {
        return (FundingOptionsViewModel) this.fundingOptionsViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    private final long getViewExpandTransitionDuration() {
        return ((Number) this.viewExpandTransitionDuration$delegate.getValue()).longValue();
    }

    private final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        if (i == 1 || i == 2) {
            switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                case 1:
                case 2:
                    setVisibility(8);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    initCurrencyConversionViewInfo();
                    return;
                case 10:
                    if (contingencyEventsModel.isAddCardContingency()) {
                        initCurrencyConversionViewInfo();
                        return;
                    }
                    return;
                default:
                    String str = TAG;
                    PLog.i$default(str, "ContingencyProcessingStatus of type " + contingencyProcessingStatus + " not handled", 0, 4, (Object) null);
                    return;
            }
        } else {
            String str2 = TAG;
            PLog.i$default(str2, "ContingencyType of type " + contingencyType + " not handled", 0, 4, (Object) null);
        }
    }

    private final void initCurrencyConversionViewInfo() {
        PaymentTypes paymentTypes = PaymentTypes.BALANCE_USD;
        FundingOption selectedFundingOption = getFundingOptionsViewModel().getSelectedFundingOption();
        if (paymentTypes.equals(selectedFundingOption == null ? null : selectedFundingOption.getId(), true)) {
            turnOnPayPalBalanceMode();
        }
    }

    private final void initEvents() {
        this.checkoutButtonListener = new C17246j(this, 0);
        this.carouselAddCardListener = new C17247k(this, 0);
        this.carouselFundingInstrumentListener = new C17188f(this, 1);
        this.fetchCryptoQuoteResponseListener = new C17189g(this, 2);
        this.carouselCreditOfferListener = new C17190h(this, 2);
        this.carouselPayInFourListener = new C17224a(this, 1);
        this.finalizeCheckoutListener = new C17193a(this, 3);
        this.disableViewsTouchListener = new C17225b(this, 2);
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED;
            EventListener eventListener2 = this.carouselAddCardListener;
            if (eventListener2 != null) {
                instance2.listen(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                EventListener eventListener3 = this.carouselFundingInstrumentListener;
                if (eventListener3 != null) {
                    instance3.listen(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
                    EventListener eventListener4 = this.carouselCreditOfferListener;
                    if (eventListener4 != null) {
                        instance4.listen(payPalEventTypes4, eventListener4);
                        Events instance5 = companion.getInstance();
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
                        EventListener eventListener5 = this.carouselPayInFourListener;
                        if (eventListener5 != null) {
                            instance5.listen(payPalEventTypes5, eventListener5);
                            Events instance6 = companion.getInstance();
                            PayPalEventTypes payPalEventTypes6 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                            EventListener eventListener6 = this.finalizeCheckoutListener;
                            if (eventListener6 != null) {
                                instance6.listen(payPalEventTypes6, eventListener6);
                                Events instance7 = companion.getInstance();
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                                EventListener eventListener7 = this.disableViewsTouchListener;
                                if (eventListener7 != null) {
                                    instance7.listen(payPalEventTypes7, eventListener7);
                                    Events instance8 = companion.getInstance();
                                    PayPalEventTypes payPalEventTypes8 = PayPalEventTypes.FINISHED_CRYPTO_QUOTE_RESPONSE;
                                    EventListener eventListener8 = this.fetchCryptoQuoteResponseListener;
                                    if (eventListener8 != null) {
                                        instance8.listen(payPalEventTypes8, eventListener8);
                                    } else {
                                        C19383o.m32805o("fetchCryptoQuoteResponseListener");
                                        throw null;
                                    }
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
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-10  reason: not valid java name */
    public static final void m35302initEvents$lambda10(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "type");
        if (resultData instanceof Success) {
            payPalCurrencyConversionView.updateCryptoQuote();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-11  reason: not valid java name */
    public static final void m35303initEvents$lambda11(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ExpandableViewHelper.updateViewExpansionState$default(payPalCurrencyConversionView.expandableViewHelper, payPalCurrencyConversionView, ExpandableViewState.Collapsed, (C19846a) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-12  reason: not valid java name */
    public static final void m35304initEvents$lambda12(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ExpandableViewHelper.updateViewExpansionState$default(payPalCurrencyConversionView.expandableViewHelper, payPalCurrencyConversionView, ExpandableViewState.Collapsed, (C19846a) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-13  reason: not valid java name */
    public static final void m35305initEvents$lambda13(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalCurrencyConversionView.seeMore72HourTv.setClickable(true);
        payPalCurrencyConversionView.conversionOptionsTv.setClickable(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-14  reason: not valid java name */
    public static final void m35306initEvents$lambda14(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalCurrencyConversionView.seeMore72HourTv.setClickable(false);
        payPalCurrencyConversionView.conversionOptionsTv.setClickable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-6  reason: not valid java name */
    public static final void m35307initEvents$lambda6(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CheckoutFinishedEventModel checkoutFinishedEventModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CheckoutFinishedEventModel) {
            checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
        }
        if (checkoutFinishedEventModel != null && checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
            payPalCurrencyConversionView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-8  reason: not valid java name */
    public static final void m35308initEvents$lambda8(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CardUiModel cardUiModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        AddCardViewStateUpdateEvent addCardViewStateUpdateEvent = data instanceof AddCardViewStateUpdateEvent ? (AddCardViewStateUpdateEvent) data : null;
        Integer valueOf = addCardViewStateUpdateEvent == null ? null : Integer.valueOf(addCardViewStateUpdateEvent.getAddCardPosition());
        List<CardUiModel> listOfPaymentCards = addCardViewStateUpdateEvent == null ? null : addCardViewStateUpdateEvent.getListOfPaymentCards();
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (listOfPaymentCards != null) {
                cardUiModel = listOfPaymentCards.get(intValue);
            }
        }
        if (cardUiModel instanceof CardUiModel.AddCardUiModel) {
            ExpandableViewHelper.updateViewExpansionState$default(payPalCurrencyConversionView.expandableViewHelper, payPalCurrencyConversionView, ExpandableViewState.Collapsed, (C19846a) null, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-9  reason: not valid java name */
    public static final void m35309initEvents$lambda9(PayPalCurrencyConversionView payPalCurrencyConversionView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        String str = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        FundingInstrumentSelectedEvent fundingInstrumentSelectedEvent = data instanceof FundingInstrumentSelectedEvent ? (FundingInstrumentSelectedEvent) data : null;
        String selectedFundingOptionId = fundingInstrumentSelectedEvent == null ? null : fundingInstrumentSelectedEvent.getSelectedFundingOptionId();
        PaymentTypes paymentTypes = PaymentTypes.CRYPTOCURRENCY;
        if (fundingInstrumentSelectedEvent != null) {
            str = fundingInstrumentSelectedEvent.getSelectedFundingOptionType();
        }
        if (paymentTypes.equals(str, true)) {
            payPalCurrencyConversionView.setupCryptoCurrencyConversion();
        } else {
            payPalCurrencyConversionView.setupConversion();
        }
        if (PaymentTypes.BALANCE_USD.equals(selectedFundingOptionId, true)) {
            payPalCurrencyConversionView.turnOnPayPalBalanceMode();
        } else {
            payPalCurrencyConversionView.turnOffPayPalBalanceMode();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35310initViewModelObservers$lambda0(PayPalCurrencyConversionView payPalCurrencyConversionView, Boolean bool) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && payPalCurrencyConversionView.getMainPaysheetViewModel().getContingencyEventsModel().getValue() == null) {
            payPalCurrencyConversionView.initCurrencyConversionViewInfo();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35311initViewModelObservers$lambda1(PayPalCurrencyConversionView payPalCurrencyConversionView, CurrencyConversionType currencyConversionType) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32796f(currencyConversionType, "currencyConversionType");
        payPalCurrencyConversionView.updateCurrencyConversion(currencyConversionType);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35312initViewModelObservers$lambda2(PayPalCurrencyConversionView payPalCurrencyConversionView, Boolean bool) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            payPalCurrencyConversionView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35313initViewModelObservers$lambda3(PayPalCurrencyConversionView payPalCurrencyConversionView, Boolean bool) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        payPalCurrencyConversionView.setFocusForAccessibilityAnnouncement();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-5  reason: not valid java name */
    public static final void m35314initViewModelObservers$lambda5(PayPalCurrencyConversionView payPalCurrencyConversionView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        if (contingencyEventsModel != null) {
            payPalCurrencyConversionView.handleContingencyEvent(contingencyEventsModel);
        }
    }

    private final void linkToCryptoRatesAndFees() {
        Context context = getContext();
        String str = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            PLog.click$default(PEnums.TransitionName.CRYPTO_RATES_AND_FEES_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
            PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
            User user = getUserViewModel().getUser();
            String userLocale = user == null ? null : user.getUserLocale();
            User user2 = getUserViewModel().getUser();
            if (user2 != null) {
                str = user2.getCountry();
            }
            Uri parse = Uri.parse(PayPalConstants.getCryptoRatesAndFeesUrl(userLocale, str));
            C19383o.m32796f(parse, "parse(\n                P…          )\n            )");
            instance.openChromeCustomTabs(parse, activity);
            PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener = this.mPayPalCurrencyConversionViewListener;
            if (payPalCurrencyConversionViewListener != null) {
                payPalCurrencyConversionViewListener.onCryptoRatesAndFeesClickListener();
            }
        }
    }

    /* access modifiers changed from: private */
    public final C19394m resetConversionOptionsTextViewHeight() {
        ViewGroup.LayoutParams layoutParams = this.conversionOptionsTv.getLayoutParams();
        if (layoutParams == null) {
            return null;
        }
        layoutParams.height = -2;
        C19394m mVar = C19394m.f43287a;
        if (!isInLayout()) {
            this.conversionOptionsTv.requestLayout();
        }
        return C19394m.f43287a;
    }

    private final void revertToPayPalRateMode() {
        this.conversionRateTv.setText(this.conversionRateStr);
        this.conversionViewTitleTv.setText(getResources().getString(C17165R.string.paypal_checkout_paypal_conversion_rate));
    }

    private final void setAmountYouWillPayStr(String str) {
        this.amountYouWillPayStr = str;
    }

    private final void setCardIssuerRateMode(String str, String str2) {
        this.conversionViewTitleTv.setText(getResources().getString(C17165R.string.paypal_checkout_convert_with_card_issuer));
        this.conversionRateTv.setText(C0048b.m164c(getResources().getString(C17165R.string.paypal_checkout_total_before_conversion_dynamic), " ", str, " ", str2));
        AnimationUtils.shrink$default(AnimationUtils.INSTANCE, this.conversionSpreadTV, 0, 0, (Interpolator) null, false, (C19846a) null, 62, (Object) null);
    }

    private final void setConversionRateStr(String str) {
        this.conversionRateStr = str;
        this.conversionRateTv.setText(str);
        this.conversionRateTv.setVisibility(0);
    }

    private final void setCurrencyRateAndAmountPaid(String str, String str2) {
        String str3 = TAG;
        PLog.m28728dR(str3, "setCurrencyRatePaid " + str);
        this.conversionRateStr = str;
        this.convertedAmount = str2;
        updateWithIncomingConversionRateAndAmountYouWillPay();
    }

    private final void setFocusForAccessibilityAnnouncement() {
        if (!SplitBalanceUtils.isSingleSplitBalanceVisible() && !SplitBalanceUtils.isMultipleSplitBalanceVisible()) {
            this.conversionViewTitleTv.requestFocus();
            this.conversionViewTitleTv.sendAccessibilityEvent(8);
        }
    }

    private final void setOnClickListener() {
        this.seeMore72HourTv.setOnClickListener(this);
        this.conversionOptionsTv.setOnClickListener(this);
    }

    private final void setTVAndVisibility(TextView textView, CharSequence charSequence, int i) {
        textView.setText(charSequence);
        textView.setVisibility(i);
    }

    private final void setupConversion() {
        updateConversionOptionsVisibility(getMainPaysheetViewModel().isPayPalConversionShownFromRepo(), getMainPaysheetViewModel().shouldShow72Hour(), getMainPaysheetViewModel().isPayPalConversionOptionShown(), String.valueOf(getMainPaysheetViewModel().getConversionType().getValue()), getCartViewModel().getGrandTotal(), getMainPaysheetViewModel().getConversionRateStrFromRepo(), getMainPaysheetViewModel().getFormattedToConversionAmount(), getMainPaysheetViewModel().getToConversionFormat().getValue());
    }

    private final void setupCryptoCurrencyConversion() {
        updateCryptoCurrencyOptionsVisibility(getFundingOptionsViewModel().shouldShowCryptoCurrencyView());
    }

    private final void turnOffPayPalBalanceMode() {
        TextView textView = this.conversionOptionsTv;
        Context context = getContext();
        int i = C17165R.color.blue_color_600;
        Object obj = C8184a.f17966a;
        textView.setTextColor(C8184a.C8188d.m16468a(context, i));
        this.payPalBalanceModeEnabled = false;
    }

    private final void turnOnPayPalBalanceMode() {
        TextView textView = this.conversionOptionsTv;
        Context context = getContext();
        int i = C17165R.color.gray_color_500;
        Object obj = C8184a.f17966a;
        textView.setTextColor(C8184a.C8188d.m16468a(context, i));
        this.payPalBalanceModeEnabled = true;
    }

    private final void updateConversionOptionsState(ExpandableViewState expandableViewState) {
        ExpandableViewState viewExpansionState = this.expandableViewHelper.getViewExpansionState(this);
        ExpandableViewState expandableViewState2 = ExpandableViewState.Expanded;
        boolean z = viewExpansionState == expandableViewState2 && this.expandableViewHelper.hasViewPreviouslyExpanded(this);
        int i = WhenMappings.$EnumSwitchMapping$2[expandableViewState.ordinal()];
        if (i == 1) {
            ExpandableViewHelper.updateViewExpansionStateConditionally$default(this.expandableViewHelper, this.conversionOptionsTv, expandableViewState2, z, (C19846a) null, new PayPalCurrencyConversionView$updateConversionOptionsState$1(this), (C19846a) null, 40, (Object) null);
            PLog.impression$default(PEnums.TransitionName.CURRENCY_OPTIONS_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, "review_your_information_screen", "currency_conversion_view", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
        } else if (i == 2) {
            ExpandableViewHelper.updateViewExpansionStateConditionally$default(this.expandableViewHelper, this.conversionOptionsTv, ExpandableViewState.Collapsed, z, (C19846a) null, new PayPalCurrencyConversionView$updateConversionOptionsState$2(this), (C19846a) null, 40, (Object) null);
        }
    }

    private final void updateConversionOptionsVisibility(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5) {
        boolean z4 = z3;
        String str6 = str;
        if (!z) {
            ExpandableViewHelper.updateViewExpansionState$default(this.expandableViewHelper, this, ExpandableViewState.Collapsed, (C19846a) null, 4, (Object) null);
            return;
        }
        this.conversionRateIv.setImageResource(C17165R.C17166drawable.ic_calculator);
        this.conversionSpreadTV.setText(getResources().getString(C17165R.string.paypal_checkout_currency_conversion_spread));
        if (this.cryptoCurrencySellingAmountTv.getVisibility() == 0) {
            this.cryptoCurrencySellingAmountTv.setVisibility(8);
        }
        setCurrencyRateAndAmountPaid(str3, str4);
        this.isPayPalConversionRLEnabled = z4;
        if (C19457k.m33019W0(CardUiModel.PaymentSourceUiModel.PAYPAL, str6, true)) {
            revertToPayPalRateMode();
        } else if (C19457k.m33019W0("VENDOR", str6, true)) {
            setCardIssuerRateMode(str2, str5);
        }
        if (!z2 || !C19457k.m33019W0(CardUiModel.PaymentSourceUiModel.PAYPAL, str6, true)) {
            this.wrapper72Hour.setVisibility(8);
        } else {
            this.wrapper72Hour.setVisibility(0);
        }
        if (z4) {
            updateConversionOptionsState(ExpandableViewState.Expanded);
        } else {
            updateConversionOptionsState(ExpandableViewState.Collapsed);
        }
        ExpandableViewHelper.updateViewExpansionState$default(this.expandableViewHelper, this, ExpandableViewState.Expanded, (C19846a) null, 4, (Object) null);
        if (getVisibility() == 0) {
            PLog.impression$default(PEnums.TransitionName.CURRENCY_CONVERSION_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.CURRENCY_CONVERSION, (String) null, "review_your_information_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        }
    }

    private final void updateCryptoCurrencyOptionsVisibility(boolean z) {
        if (!z) {
            ExpandableViewHelper.updateViewExpansionState$default(this.expandableViewHelper, this, ExpandableViewState.Collapsed, (C19846a) null, 4, (Object) null);
            return;
        }
        PLog.impression$default(PEnums.TransitionName.CRYPTO_RATE_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E102, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        updateCryptoQuote();
        this.conversionRateIv.setImageResource(C17165R.C17166drawable.ic_crypto);
        this.conversionViewTitleTv.setText(getResources().getString(C17165R.string.paypal_checkout_selling_crypto));
        setTVAndVisibility(this.conversionSpreadTV, formatCryptoRatesAndFeesText(), 0);
        this.conversionSpreadTV.setOnClickListener(new C6867g(this, 4));
        this.wrapper72Hour.setVisibility(8);
        updateConversionOptionsState(ExpandableViewState.Collapsed);
        ExpandableViewHelper.updateViewExpansionState$default(this.expandableViewHelper, this, ExpandableViewState.Expanded, (C19846a) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: updateCryptoCurrencyOptionsVisibility$lambda-15  reason: not valid java name */
    public static final void m35315updateCryptoCurrencyOptionsVisibility$lambda15(PayPalCurrencyConversionView payPalCurrencyConversionView, View view) {
        C19383o.m32797g(payPalCurrencyConversionView, "this$0");
        payPalCurrencyConversionView.linkToCryptoRatesAndFees();
    }

    private final void updateCryptoQuote() {
        if (getFundingOptionsViewModel().shouldShowCryptoCurrencyView()) {
            String i = C0326j.m864i(getResources().getString(C17165R.string.paypal_checkout_crypto_exchange_rate), getFundingOptionsViewModel().getCryptoCurrencyExchangeRate());
            setTVAndVisibility(this.cryptoCurrencySellingAmountTv, C0048b.m163a(getFundingOptionsViewModel().getCryptoCurrencyValue(), " ", getFundingOptionsViewModel().getSelectedCryptoCurrencySymbol()), 0);
            setTVAndVisibility(this.conversionRateTv, i, 0);
        }
    }

    private final void updateCurrencyConversion(CurrencyConversionType currencyConversionType) {
        String str = HomeFragment.TAG;
        PLog.d$default(str, "Vendor? " + currencyConversionType, 0, 4, (Object) null);
        if (currencyConversionType == CurrencyConversionType.VENDOR) {
            setCardIssuerRateMode(getCartViewModel().getGrandTotal(), getMainPaysheetViewModel().getToConversionFormat().getValue());
        } else {
            revertToPayPalRateMode();
        }
    }

    private final void updateWithIncomingConversionRateAndAmountYouWillPay() {
        setConversionRateStr(this.conversionRateStr);
        setAmountYouWillPayStr(this.convertedAmount);
        PLog.impression$default(PEnums.TransitionName.CURRENCY_CONVERSION_VIEW_UPDATED, PEnums.Outcome.UPDATED, PEnums.EventCode.E103, PEnums.StateName.CURRENCY_CONVERSION, C0015b.m90i("conversionRate: ", this.conversionRateStr, " convAmount: ", this.convertedAmount), "review_your_information_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ComponentActivity getComponentActivity(Context context) {
        return ICustomViewsViewModel.DefaultImpls.getComponentActivity(this, context);
    }

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public C2887s getLifecycleOwner(View view) {
        return ICustomViewsViewModel.DefaultImpls.getLifecycleOwner(this, view);
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public ExpandableViewTransitionProperties getViewTransitionProperties(View view, ExpandableViewState expandableViewState) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(expandableViewState, "state");
        boolean b = C19383o.m32792b(view, this);
        long j = VIEW_STATE_EXPAND_DELAY;
        if (b) {
            int i = WhenMappings.$EnumSwitchMapping$2[expandableViewState.ordinal()];
            if (i == 1) {
                if (!this.expandableViewHelper.hasViewPreviouslyExpanded(this)) {
                    j = VIEW_STATE_INITIAL_EXPAND_DELAY;
                }
                return new ExpandableViewTransitionProperties(j, getViewExpandTransitionDuration());
            } else if (i == 2) {
                return new ExpandableViewTransitionProperties(VIEW_STATE_COLLAPSE_DELAY, VIEW_STATE_COLLAPSE_DURATION);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!C19383o.m32792b(view, this.conversionOptionsTv)) {
            return null;
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$2[expandableViewState.ordinal()];
            if (i2 == 1) {
                return new ExpandableViewTransitionProperties(VIEW_STATE_EXPAND_DELAY, getViewExpandTransitionDuration());
            }
            if (i2 == 2) {
                return new ExpandableViewTransitionProperties(VIEW_STATE_COLLAPSE_DELAY, VIEW_STATE_COLLAPSE_DURATION);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public void initViewModelObservers() {
        C10077j jVar = new C10077j(this, 7);
        C9498g gVar = new C9498g(this, 8);
        C9499h hVar = new C9499h(this, 5);
        C9500i iVar = new C9500i(this, 5);
        C9663d dVar = new C9663d(this, 5);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, jVar);
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(componentActivity, hVar);
        getMainPaysheetViewModel().getConversionType().observe(componentActivity, gVar);
        getMainPaysheetViewModel().getPaymentSourceCardViewClickedFlag().observe(componentActivity, iVar);
        getMainPaysheetViewModel().getContingencyEventsModel().observe(componentActivity, dVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        int id = view.getId();
        if (id == C17165R.C17167id.btn_72hour_see_more) {
            Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLRateProtectionFragment.TAG, new PYPLRateProtectionFragment())));
            PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener = this.mPayPalCurrencyConversionViewListener;
            if (payPalCurrencyConversionViewListener != null) {
                payPalCurrencyConversionViewListener.onSeeMore72HourClicked();
            }
        } else if (id == C17165R.C17167id.btn_conversion_options && this.isPayPalConversionRLEnabled && !this.payPalBalanceModeEnabled) {
            PLog.click$default(PEnums.TransitionName.CURRENCY_CONVERSION_OPTIONS_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            PLog.m28728dR(HomeFragment.TAG, "currency conversion view clicked, bottom sheet should be hidden");
            Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLConversionRateFragment.TAG, new PYPLConversionRateFragment())));
            PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener2 = this.mPayPalCurrencyConversionViewListener;
            if (payPalCurrencyConversionViewListener2 != null) {
                payPalCurrencyConversionViewListener2.onCurrencyConversionViewClickListener();
            }
        }
    }

    public void onViewExpansionStateUpdateCompleted(View view) {
        C19383o.m32797g(view, "view");
        Events.Companion.getInstance().fire(PayPalEventTypes.CAROUSEL_SCROLLABILITY_CHANGE, new Success(Boolean.TRUE));
    }

    public void onViewExpansionStateUpdateStarted(View view) {
        C19383o.m32797g(view, "view");
        Events.Companion.getInstance().fire(PayPalEventTypes.CAROUSEL_SCROLLABILITY_CHANGE, new Success(Boolean.FALSE));
    }

    public void removeListeners() {
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED;
            EventListener eventListener2 = this.carouselAddCardListener;
            if (eventListener2 != null) {
                instance2.removeListener(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                EventListener eventListener3 = this.carouselFundingInstrumentListener;
                if (eventListener3 != null) {
                    instance3.removeListener(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
                    EventListener eventListener4 = this.carouselCreditOfferListener;
                    if (eventListener4 != null) {
                        instance4.removeListener(payPalEventTypes4, eventListener4);
                        Events instance5 = companion.getInstance();
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
                        EventListener eventListener5 = this.carouselPayInFourListener;
                        if (eventListener5 != null) {
                            instance5.removeListener(payPalEventTypes5, eventListener5);
                            Events instance6 = companion.getInstance();
                            PayPalEventTypes payPalEventTypes6 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                            EventListener eventListener6 = this.finalizeCheckoutListener;
                            if (eventListener6 != null) {
                                instance6.removeListener(payPalEventTypes6, eventListener6);
                                Events instance7 = companion.getInstance();
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                                EventListener eventListener7 = this.disableViewsTouchListener;
                                if (eventListener7 != null) {
                                    instance7.removeListener(payPalEventTypes7, eventListener7);
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
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCurrencyConversionView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalCurrencyConversionViewListener payPalCurrencyConversionViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.expandableViewHelper = new ExpandableViewHelper(this);
        this.viewExpandTransitionDuration$delegate = C19350d.m32677b(new PayPalCurrencyConversionView$viewExpandTransitionDuration$2(this));
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.cartViewModel$delegate = new C2868j0(C19386q.m32807a(CartViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$13 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                if (z) {
                    this.fundingOptionsViewModel$delegate = new C2868j0(C19386q.m32807a(FundingOptionsViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$13);
                    SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$14 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                    if (z) {
                        this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$14);
                        View.inflate(context2, C17165R.C17169layout.pp_currency_conversion_view_layout, this);
                        this.mPayPalCurrencyConversionViewListener = payPalCurrencyConversionViewListener;
                        View findViewById = findViewById(C17165R.C17167id.currency_conversion_layout);
                        C19383o.m32796f(findViewById, "findViewById(R.id.currency_conversion_layout)");
                        this.currencyConversionRL = (ConstraintLayout) findViewById;
                        View findViewById2 = findViewById(C17165R.C17167id.pp_conversion_rate_tv);
                        C19383o.m32796f(findViewById2, "findViewById(R.id.pp_conversion_rate_tv)");
                        this.conversionRateTv = (TextView) findViewById2;
                        View findViewById3 = findViewById(C17165R.C17167id.wrapper_72hour);
                        C19383o.m32796f(findViewById3, "findViewById(R.id.wrapper_72hour)");
                        this.wrapper72Hour = (RelativeLayout) findViewById3;
                        View findViewById4 = findViewById(C17165R.C17167id.btn_conversion_options);
                        C19383o.m32796f(findViewById4, "findViewById(R.id.btn_conversion_options)");
                        TextView textView = (TextView) findViewById4;
                        this.conversionOptionsTv = textView;
                        textView.setText(getResources().getString(C17165R.string.paypal_checkout_see_conversion_options));
                        View findViewById5 = findViewById(C17165R.C17167id.pp_conversion_view_title);
                        C19383o.m32796f(findViewById5, "findViewById(R.id.pp_conversion_view_title)");
                        this.conversionViewTitleTv = (TextView) findViewById5;
                        View findViewById6 = findViewById(C17165R.C17167id.crypto_selling_amount_tv);
                        C19383o.m32796f(findViewById6, "findViewById(R.id.crypto_selling_amount_tv)");
                        this.cryptoCurrencySellingAmountTv = (TextView) findViewById6;
                        View findViewById7 = findViewById(C17165R.C17167id.btn_72hour_see_more);
                        C19383o.m32796f(findViewById7, "findViewById(R.id.btn_72hour_see_more)");
                        this.seeMore72HourTv = (TextView) findViewById7;
                        View findViewById8 = findViewById(C17165R.C17167id.conversion_spread_tv);
                        C19383o.m32796f(findViewById8, "findViewById(R.id.conversion_spread_tv)");
                        this.conversionSpreadTV = (LinkTextView) findViewById8;
                        View findViewById9 = findViewById(C17165R.C17167id.conversion_ic);
                        C19383o.m32796f(findViewById9, "findViewById(R.id.conversion_ic)");
                        this.conversionRateIv = (ImageView) findViewById9;
                        this.conversionRateTv.setText(this.conversionRateStr);
                        setVisibility(8);
                        initEvents();
                        setOnClickListener();
                        initViewModelObservers();
                        return;
                    }
                    PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
                    throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
                }
                PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
                throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
