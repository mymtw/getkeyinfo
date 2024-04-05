package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.C3227e;
import androidx.room.C3249o;
import androidx.room.C3251q;
import androidx.room.C3260z;
import com.braze.C5380a;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9904g;
import com.google.android.datatransport.runtime.scheduling.persistence.C6597o;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17187e;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import com.paypal.pyplcheckout.auth.NativeSSOListener;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.C17203a;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.crypto.view.fragments.PYPLCryptoConsentFragment;
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
import com.paypal.pyplcheckout.events.model.OfferViewStateUpdateEvent;
import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel;
import com.paypal.pyplcheckout.home.view.adapters.CarouselAdapter;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.customviews.SnappingRecyclerView;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalSnappingRecyclerViewListener;
import com.paypal.pyplcheckout.home.viewmodel.CartViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.HeartListener;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import com.paypal.pyplcheckout.utils.DialogMaker;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0015b;
import p010a9.C0048b;
import p306z8.C8478e;
import p753kq.C19846a;

@SuppressLint({"ViewConstructor"})
public final class PayPalSnappingRecyclerView extends FrameLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long DELAY_DURATION_MS = 2000;
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalSnappingRecyclerView";
    private static final long TEXT_VIEW_FADE_DURATION = 165;
    public Map<Integer, View> _$_findViewCache;
    private final C2843a0<PaymentProcessors> addCardPaymentProcessorObserver;
    private int addCardPosition;
    private final C19285c addCardViewModel$delegate;
    /* access modifiers changed from: private */
    public TextView backupFundingText;
    private SnappingRecyclerView carousel;
    private CarouselAdapter carouselAdapter;
    private EventListener carouselFundingInstrumentListener;
    private EventListener carouselScrollabilityListener;
    private final C19285c cartViewModel$delegate;
    private EventListener checkoutButtonListener;
    private final C2843a0<ContingencyEventsModel> contingencyEventsObserver;
    private int creditOfferPosition;
    private int creditOfferSize;
    private int currentlySelectedFiIndex;
    private final View dummyAnchorView;
    private final C2843a0<Boolean> fetchingUserDataCompletedFlagObserver;
    private EventListener finalizeCheckoutListener;
    private SnappingRecyclerView.OnViewDismissedListener fundingInstrumentDismissedListener;
    private SnappingRecyclerView.OnViewSelectedListener fundingInstrumentSelectedListener;
    private List<FundingOption> fundingOptionsList;
    private final C19285c fundingOptionsViewModel$delegate;
    private final HeartListener heartListener;
    private int indexOfPreviouslySelected;
    private final boolean isAnchoredToBottomSheet;
    private boolean isCartDetailsArrowShown;
    private final List<CardUiModel> listOfPaymentCards;
    private final C2843a0<Boolean> logoutCompletedFlagObserver;
    private final C19285c mainPaysheetViewModel$delegate;
    private NativeSSOListener nativeSSOListener;
    /* access modifiers changed from: private */
    public final TextView offerDescriptionText;
    private int payInFourPosition;
    private PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener;
    private EventListener refreshListener;
    private final SelectedListener selectedListener;
    /* access modifiers changed from: private */
    public TextView topCurrencyConversionText;
    private final TypedValue typedValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalSnappingRecyclerView.TAG;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
        }
    }

    static {
        Class<PayPalSnappingRecyclerView> cls = PayPalSnappingRecyclerView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalSnappingRecyclerView(Context context, Fragment fragment, PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : fragment, (i & 4) != 0 ? null : payPalSnappingRecyclerViewListener2);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-12  reason: not valid java name */
    public static final void m35350_init_$lambda12(PayPalSnappingRecyclerView payPalSnappingRecyclerView, View view, int i) {
        int i2;
        Pair pair;
        PayPalSnappingRecyclerView payPalSnappingRecyclerView2 = payPalSnappingRecyclerView;
        int i3 = i;
        C19383o.m32797g(payPalSnappingRecyclerView2, "this$0");
        payPalSnappingRecyclerView.getResources().getValue(C17165R.dimen.selected_fi_alpha_value, payPalSnappingRecyclerView2.typedValue, true);
        view.setAlpha(payPalSnappingRecyclerView2.typedValue.getFloat());
        payPalSnappingRecyclerView2.currentlySelectedFiIndex = i3;
        int abs = Math.abs(i3 - payPalSnappingRecyclerView2.indexOfPreviouslySelected);
        C19394m mVar = null;
        boolean z = false;
        if (payPalSnappingRecyclerView2.currentlySelectedFiIndex > payPalSnappingRecyclerView2.indexOfPreviouslySelected) {
            PEnums.TransitionName transitionName = PEnums.TransitionName.FI_SCROLL_RIGHT;
            PEnums.Outcome outcome = PEnums.Outcome.SWIPERIGHT;
            PEnums.EventCode eventCode = PEnums.EventCode.E140;
            PEnums.StateName stateName = PEnums.StateName.REVIEW;
            PLog.decision$default(transitionName, outcome, eventCode, stateName, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
            PLog.d$default(TAG, C0015b.m88g("swipe right - number of cards in swipe: ", abs), 0, 4, (Object) null);
            PLog.scroll$default(transitionName, outcome, eventCode, stateName, (String) null, "review_your_information_screen", "carousel_view", (InstrumentationEvent.InstrumentationEventBuilder) null, 128, (Object) null);
            payPalSnappingRecyclerView2.indexOfPreviouslySelected = payPalSnappingRecyclerView2.currentlySelectedFiIndex;
        }
        if (payPalSnappingRecyclerView2.currentlySelectedFiIndex < payPalSnappingRecyclerView2.indexOfPreviouslySelected) {
            PEnums.TransitionName transitionName2 = PEnums.TransitionName.FI_SCROLL_LEFT;
            PEnums.Outcome outcome2 = PEnums.Outcome.SWIPELEFT;
            PEnums.EventCode eventCode2 = PEnums.EventCode.E139;
            PEnums.StateName stateName2 = PEnums.StateName.REVIEW;
            PLog.decision$default(transitionName2, outcome2, eventCode2, stateName2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
            PLog.scroll$default(transitionName2, outcome2, eventCode2, stateName2, (String) null, "review_your_information_screen", "carousel_view", (InstrumentationEvent.InstrumentationEventBuilder) null, 128, (Object) null);
            PLog.d$default(TAG, C0015b.m88g("swipe left - number of cards in swipe: ", abs), 0, 4, (Object) null);
            payPalSnappingRecyclerView2.indexOfPreviouslySelected = payPalSnappingRecyclerView2.currentlySelectedFiIndex;
        }
        PEnums.TransitionName transitionName3 = PEnums.TransitionName.FUNDING_INSTRUMENT_TAPPED;
        PEnums.Outcome outcome3 = PEnums.Outcome.CLICKED;
        PEnums.EventCode eventCode3 = PEnums.EventCode.E101;
        PEnums.StateName stateName3 = PEnums.StateName.REVIEW;
        PLog.click$default(transitionName3, outcome3, eventCode3, stateName3, (String) null, "review_your_information_screen", "carousel_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.d$default(TAG, "selected card: " + payPalSnappingRecyclerView2.listOfPaymentCards.get(i3), 0, 4, (Object) null);
        List<FundingOption> list = payPalSnappingRecyclerView2.fundingOptionsList;
        if (list != null) {
            int size = list.size();
            payPalSnappingRecyclerView.getFundingOptionsViewModel().setCarouselPosition(i3);
            if (payPalSnappingRecyclerView.getMainPaysheetViewModel().getIsCurrencyConverted()) {
                payPalSnappingRecyclerView.getMainPaysheetViewModel().setIsCurrencyConverted(false);
            } else {
                payPalSnappingRecyclerView.getMainPaysheetViewModel().setConversionType(CurrencyConversionType.PAYPAL);
            }
            int i4 = payPalSnappingRecyclerView2.creditOfferSize;
            int i5 = i4 > 0 ? i3 - i4 : i3;
            if (i5 >= 0 && i5 < size) {
                payPalSnappingRecyclerView.getFundingOptionsViewModel().setSelectedFundingOption(i5);
            }
            CardUiModel cardUiModel = payPalSnappingRecyclerView2.listOfPaymentCards.get(i3);
            if (cardUiModel instanceof CardUiModel.OfferCardUiModel) {
                CardUiModel.OfferCardUiModel offerCardUiModel = (CardUiModel.OfferCardUiModel) cardUiModel;
                if (PaymentTypes.PAYPAL_CREDIT_OFFER.equals(offerCardUiModel.getId(), true)) {
                    payPalSnappingRecyclerView2.creditOfferPosition = payPalSnappingRecyclerView2.currentlySelectedFiIndex;
                    pair = new Pair(PEnums.TransitionName.PAYPAL_CREDIT_VIEW_SHOWN, PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED);
                } else {
                    payPalSnappingRecyclerView2.payInFourPosition = payPalSnappingRecyclerView2.currentlySelectedFiIndex;
                    pair = new Pair(PEnums.TransitionName.GLOBAL_PAY_LATER_VIEW_SHOWN, PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED);
                }
                PayPalEventTypes payPalEventTypes = (PayPalEventTypes) pair.component2();
                PLog.impression$default((PEnums.TransitionName) pair.component1(), PEnums.Outcome.SHOWN, PEnums.EventCode.E103, stateName3, (String) null, "review_your_information_screen", "paypal_credit_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
                payPalSnappingRecyclerView2.backupFundingText.setVisibility(8);
                payPalSnappingRecyclerView2.topCurrencyConversionText.setVisibility(8);
                String offerDescription = offerCardUiModel.getOfferDescription();
                if (offerDescription != null) {
                    if (offerDescription.length() > 0) {
                        z = true;
                    }
                }
                if (!z || PaymentTypes.GLOBAL_PAY_LATER.equals(offerCardUiModel.getId(), true)) {
                    payPalSnappingRecyclerView2.fadeOutTextView(payPalSnappingRecyclerView2.offerDescriptionText, new PayPalSnappingRecyclerView$4$1$1(payPalSnappingRecyclerView2));
                } else {
                    payPalSnappingRecyclerView2.offerDescriptionText.setText(offerCardUiModel.getOfferDescription());
                    fadeInTextView$default(payPalSnappingRecyclerView2, payPalSnappingRecyclerView2.offerDescriptionText, (C19846a) null, 2, (Object) null);
                }
                Events.Companion.getInstance().fire(payPalEventTypes, new Success(new OfferViewStateUpdateEvent(offerCardUiModel.getCtaText(), offerCardUiModel.getTermsText(), offerCardUiModel.getTermsLink())));
                i2 = size;
            } else if (cardUiModel instanceof CardUiModel.PaymentSourceUiModel) {
                payPalSnappingRecyclerView.setupConversion();
                payPalSnappingRecyclerView2.offerDescriptionText.setVisibility(8);
                CardUiModel.PaymentSourceUiModel paymentSourceUiModel = (CardUiModel.PaymentSourceUiModel) cardUiModel;
                if (PaymentTypes.PAYPAL_CREDIT.equals(paymentSourceUiModel.getType(), true)) {
                    String fetchCreditOfferText = payPalSnappingRecyclerView.getMainPaysheetViewModel().fetchCreditOfferText();
                    if (fetchCreditOfferText != null) {
                        payPalSnappingRecyclerView2.backupFundingText.setText(fetchCreditOfferText);
                        fadeInTextView$default(payPalSnappingRecyclerView2, payPalSnappingRecyclerView2.backupFundingText, (C19846a) null, 2, (Object) null);
                        mVar = C19394m.f43287a;
                    }
                    if (mVar == null) {
                        payPalSnappingRecyclerView2.fadeOutTextView(payPalSnappingRecyclerView2.backupFundingText, new PayPalSnappingRecyclerView$4$1$3$1(payPalSnappingRecyclerView2));
                    }
                } else {
                    payPalSnappingRecyclerView.setupBackupFunding();
                }
                Events instance = Events.Companion.getInstance();
                PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                FundingInstrumentSelectedEvent fundingInstrumentSelectedEvent = r1;
                i2 = size;
                FundingInstrumentSelectedEvent fundingInstrumentSelectedEvent2 = new FundingInstrumentSelectedEvent(i, size, false, false, false, false, true, paymentSourceUiModel.getFundingOptionId(), paymentSourceUiModel.getType(), payPalSnappingRecyclerView2.listOfPaymentCards);
                instance.fire(payPalEventTypes2, new Success(fundingInstrumentSelectedEvent));
            } else {
                i2 = size;
                if (cardUiModel instanceof CardUiModel.AddCardUiModel) {
                    if (cardUiModel instanceof CardUiModel.AddCardUiModel.Native) {
                        PLog.decision$default(PEnums.TransitionName.NATIVE_ADD_CARD_SHOWN, PEnums.Outcome.SHOWN, (PEnums.EventCode) null, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, "native add card view shown", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1972, (Object) null);
                    }
                    payPalSnappingRecyclerView2.updateAddCardViewState((CardUiModel.AddCardUiModel) cardUiModel, i3);
                }
            }
            PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener2 = payPalSnappingRecyclerView2.payPalSnappingRecyclerViewListener;
            if (payPalSnappingRecyclerViewListener2 != null) {
                payPalSnappingRecyclerViewListener2.onFundingInstrumentSelected(i, i2, false, false, false, true, payPalSnappingRecyclerView2.listOfPaymentCards);
            }
        }
        CarouselAdapter carouselAdapter2 = payPalSnappingRecyclerView2.carouselAdapter;
        if (carouselAdapter2 != null) {
            carouselAdapter2.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-5  reason: not valid java name */
    public static final void m35351_init_$lambda5() {
        PLog.impression$default(PEnums.TransitionName.CARD_PREFERENCE_CLICKED, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "preferred_icon", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-7  reason: not valid java name */
    public static final void m35352_init_$lambda7(PayPalSnappingRecyclerView payPalSnappingRecyclerView, Context context, CardUiModel cardUiModel) {
        PayPalSnappingRecyclerView payPalSnappingRecyclerView2 = payPalSnappingRecyclerView;
        Context context2 = context;
        CardUiModel cardUiModel2 = cardUiModel;
        C19383o.m32797g(payPalSnappingRecyclerView2, "this$0");
        C19383o.m32797g(context2, "$context");
        C19383o.m32797g(cardUiModel2, "cardUiModel");
        if (cardUiModel2 instanceof CardUiModel.AddCardUiModel.Web) {
            payPalSnappingRecyclerView.onAddCardClicked();
        } else if (!(cardUiModel2 instanceof CardUiModel.OfferCardUiModel)) {
            int dimension = ((payPalSnappingRecyclerView2.isCartDetailsArrowShown ? 0 : (int) payPalSnappingRecyclerView.getResources().getDimension(C17165R.dimen.cart_details_arrow_margin)) / 2) + PYPLCheckoutUtils.Companion.getInstance().getLocationOfViewOnScreen(payPalSnappingRecyclerView2).y + 120;
            PEnums.TransitionName transitionName = PEnums.TransitionName.CARD_PREFERENCE_CLICKED;
            PEnums.Outcome outcome = PEnums.Outcome.CLICKED;
            PEnums.EventCode eventCode = PEnums.EventCode.E101;
            PEnums.StateName stateName = PEnums.StateName.REVIEW;
            PLog.click$default(transitionName, outcome, eventCode, stateName, (String) null, "carousel_view", "preferred_icon", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            Toast makeText = Toast.makeText(context2, payPalSnappingRecyclerView.getResources().getString(C17165R.string.paypal_checkout_selected), 0);
            makeText.setGravity(48, 0, dimension);
            makeText.show();
            payPalSnappingRecyclerView.getMainPaysheetViewModel().setPaymentSourceCardViewClickedFlag(true);
            PLog.impression$default(transitionName, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, stateName, (String) null, "review_your_information_screen", "preferred_icon", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        } else if (PaymentTypes.PAYPAL_CREDIT_OFFER.equals(((CardUiModel.OfferCardUiModel) cardUiModel2).getId(), true)) {
            payPalSnappingRecyclerView2.showOfferDialog(C17165R.string.paypal_checkout_paypal_credit_apply, C17165R.string.paypal_checkout_apply_for_paypal_credit, PEnums.TransitionName.PAYPAL_CREDIT_DIALOG, PYPLCheckoutUtils.FallbackScenario.PAYPAL_CREDIT);
        } else {
            payPalSnappingRecyclerView2.showOfferDialog(C17165R.string.paypal_checkout_paypal_credit_apply, C17165R.string.paypal_checkout_apply_for_pay_in_four, PEnums.TransitionName.GLOBAL_PAY_LATER_DIALOG, PYPLCheckoutUtils.FallbackScenario.GLOBAL_PAY_LATER);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-8  reason: not valid java name */
    public static final void m35353_init_$lambda8(PayPalSnappingRecyclerView payPalSnappingRecyclerView, View view, int i) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        payPalSnappingRecyclerView.getResources().getValue(C17165R.dimen.dismissed_fi_alpha_value, payPalSnappingRecyclerView.typedValue, true);
        if (view != null) {
            view.setAlpha(payPalSnappingRecyclerView.typedValue.getFloat());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: addCardPaymentProcessorObserver$lambda-0  reason: not valid java name */
    public static final void m35354addCardPaymentProcessorObserver$lambda0(PayPalSnappingRecyclerView payPalSnappingRecyclerView, PaymentProcessors paymentProcessors) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        payPalSnappingRecyclerView.refreshAddCardDrawable();
    }

    private final int backupFundingTextResource() {
        return PaymentTypes.PAYPAL_BALANCE.equals(getFundingOptionsViewModel().getSelectingFILabel(), true) ? C17165R.string.paypal_checkout_buf_backup_funding : PaymentTypes.CRYPTOCURRENCY.equals(getFundingOptionsViewModel().getSelectedFundingOptionType(), true) ? C17165R.string.paypal_checkout_buf_short : C17165R.string.paypal_checkout_buf_statement;
    }

    private final void clearPaymentCards() {
        this.listOfPaymentCards.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: contingencyEventsObserver$lambda-4  reason: not valid java name */
    public static final void m35355contingencyEventsObserver$lambda4(PayPalSnappingRecyclerView payPalSnappingRecyclerView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        if (contingencyEventsModel != null) {
            payPalSnappingRecyclerView.handleContingencyEvent(contingencyEventsModel);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void convertFundingOptionsToPayments(java.util.List<com.paypal.pyplcheckout.pojo.FundingOption> r7, java.util.List<com.paypal.pyplcheckout.pojo.CreditPPCOffer> r8, int r9) {
        /*
            r6 = this;
            com.paypal.pyplcheckout.ab.featureflag.Feature r0 = com.paypal.pyplcheckout.p539ab.featureflag.Feature.CRYPTO_PAYMENTS
            r1 = 0
            r2 = 2
            r3 = 0
            com.paypal.pyplcheckout.ab.featureflag.FeatureResponse r0 = com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager.isEnabled$default(r0, r1, r2, r3)
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x0017
            if (r7 != 0) goto L_0x0013
            r7 = r3
            goto L_0x0017
        L_0x0013:
            java.util.List r7 = com.paypal.pyplcheckout.home.view.customviews.PaymentSourceUiModelKt.filterCryptocurrency(r7)
        L_0x0017:
            r6.fundingOptionsList = r7
            if (r7 != 0) goto L_0x001d
            r0 = r3
            goto L_0x0047
        L_0x001d:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r7)
            r0.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x002a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r7.next()
            com.paypal.pyplcheckout.pojo.FundingOption r2 = (com.paypal.pyplcheckout.pojo.FundingOption) r2
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            com.paypal.pyplcheckout.home.view.customviews.CardUiModel$PaymentSourceUiModel r2 = com.paypal.pyplcheckout.home.view.customviews.PaymentSourceUiModelKt.toPaymentSourceUiModel(r2, r4)
            r0.add(r2)
            goto L_0x002a
        L_0x0047:
            if (r0 != 0) goto L_0x004b
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
        L_0x004b:
            if (r8 != 0) goto L_0x004e
            goto L_0x006f
        L_0x004e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r8)
            r3.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L_0x005b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x006f
            java.lang.Object r8 = r7.next()
            com.paypal.pyplcheckout.pojo.CreditPPCOffer r8 = (com.paypal.pyplcheckout.pojo.CreditPPCOffer) r8
            com.paypal.pyplcheckout.home.view.customviews.CardUiModel$OfferCardUiModel r8 = com.paypal.pyplcheckout.extensions.CreditToPaymentCardExtensionsKt.toOfferCardUiModel(r8)
            r3.add(r8)
            goto L_0x005b
        L_0x006f:
            if (r3 != 0) goto L_0x0073
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x0073:
            java.util.List<com.paypal.pyplcheckout.home.view.customviews.CardUiModel> r7 = r6.listOfPaymentCards
            r7.clear()
            java.util.List<com.paypal.pyplcheckout.home.view.customviews.CardUiModel> r7 = r6.listOfPaymentCards
            java.util.ArrayList r8 = kotlin.collections.C19327t.m32650f1(r0, r3)
            com.paypal.pyplcheckout.model.PaymentProcessors r0 = com.paypal.pyplcheckout.model.PaymentProcessors.NOTFOUND
            com.paypal.pyplcheckout.addcard.AddCardViewModel r2 = r6.getAddCardViewModel()
            boolean r2 = r2.isNativeAddCardEnabled()
            com.paypal.pyplcheckout.home.view.customviews.CardUiModel$AddCardUiModel r0 = com.paypal.pyplcheckout.home.view.customviews.PaymentSourceUiModelKt.addCard(r0, r2)
            java.util.ArrayList r8 = kotlin.collections.C19327t.m32651g1(r8, r0)
            r7.addAll(r8)
            r7 = -1
            if (r9 != r7) goto L_0x009a
            int r9 = r3.size()
        L_0x009a:
            r6.setUpCarousel(r9)
            com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel r7 = r6.getFundingOptionsViewModel()
            r7.setSelectedFundingOption((int) r1)
            com.paypal.pyplcheckout.home.view.interfaces.PayPalSnappingRecyclerViewListener r7 = r6.payPalSnappingRecyclerViewListener
            if (r7 != 0) goto L_0x00a9
            goto L_0x00ac
        L_0x00a9:
            r7.initFundingOptionSelection(r1)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView.convertFundingOptionsToPayments(java.util.List, java.util.List, int):void");
    }

    private final void fadeInTextView(TextView textView, C19846a<C19394m> aVar) {
        AnimationUtils.fadeIn$default(AnimationUtils.INSTANCE, textView, TEXT_VIEW_FADE_DURATION, 0, aVar, 4, (Object) null);
    }

    public static /* synthetic */ void fadeInTextView$default(PayPalSnappingRecyclerView payPalSnappingRecyclerView, TextView textView, C19846a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        payPalSnappingRecyclerView.fadeInTextView(textView, aVar);
    }

    private final void fadeOutTextView(TextView textView, C19846a<C19394m> aVar) {
        AnimationUtils.fadeOut$default(AnimationUtils.INSTANCE, textView, TEXT_VIEW_FADE_DURATION, 0, aVar, 4, (Object) null);
    }

    public static /* synthetic */ void fadeOutTextView$default(PayPalSnappingRecyclerView payPalSnappingRecyclerView, TextView textView, C19846a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        payPalSnappingRecyclerView.fadeOutTextView(textView, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: fetchingUserDataCompletedFlagObserver$lambda-1  reason: not valid java name */
    public static final void m35356fetchingUserDataCompletedFlagObserver$lambda1(PayPalSnappingRecyclerView payPalSnappingRecyclerView, Boolean bool) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && payPalSnappingRecyclerView.getMainPaysheetViewModel().getContingencyEventsModel().getValue() == null) {
            payPalSnappingRecyclerView.initSnappingRecyclerViewInfo();
        }
    }

    private final AddCardViewModel getAddCardViewModel() {
        return (AddCardViewModel) this.addCardViewModel$delegate.getValue();
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

    private final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        if (i == 1 || i == 2) {
            switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                case 1:
                case 2:
                    this.backupFundingText.setVisibility(8);
                    SnappingRecyclerView snappingRecyclerView = this.carousel;
                    if (snappingRecyclerView != null) {
                        snappingRecyclerView.setVisibility(8);
                        this.dummyAnchorView.setVisibility(8);
                        return;
                    }
                    C19383o.m32805o("carousel");
                    throw null;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    initSnappingRecyclerViewInfo();
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

    private final void initCarousel() {
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        SnappingRecyclerView snappingRecyclerView = this.carousel;
        if (snappingRecyclerView != null) {
            snappingRecyclerView.enableViewScaling(true);
            SnappingRecyclerView snappingRecyclerView2 = this.carousel;
            if (snappingRecyclerView2 != null) {
                snappingRecyclerView2.setLayoutManager(linearLayoutManager);
                CarouselAdapter carouselAdapter2 = new CarouselAdapter(this.listOfPaymentCards, this.heartListener, this.selectedListener);
                this.carouselAdapter = carouselAdapter2;
                SnappingRecyclerView snappingRecyclerView3 = this.carousel;
                if (snappingRecyclerView3 != null) {
                    snappingRecyclerView3.setAdapter(carouselAdapter2);
                    SnappingRecyclerView snappingRecyclerView4 = this.carousel;
                    if (snappingRecyclerView4 != null) {
                        snappingRecyclerView4.setNestedScrollingEnabled(false);
                        SnappingRecyclerView snappingRecyclerView5 = this.carousel;
                        if (snappingRecyclerView5 != null) {
                            snappingRecyclerView5.enableViewScaling(true);
                        } else {
                            C19383o.m32805o("carousel");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("carousel");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("carousel");
                    throw null;
                }
            } else {
                C19383o.m32805o("carousel");
                throw null;
            }
        } else {
            C19383o.m32805o("carousel");
            throw null;
        }
    }

    private final void initEvents() {
        this.checkoutButtonListener = new C17193a(this, 6);
        this.carouselFundingInstrumentListener = new C17225b(this, 5);
        this.refreshListener = new C17203a(this, 6);
        this.finalizeCheckoutListener = new C17198a(this, 5);
        this.carouselScrollabilityListener = new C17240d(this, 2);
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.REFRESH_CAROUSEL;
        EventListener eventListener = this.refreshListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
            EventListener eventListener2 = this.checkoutButtonListener;
            if (eventListener2 != null) {
                instance2.listen(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                EventListener eventListener3 = this.finalizeCheckoutListener;
                if (eventListener3 != null) {
                    instance3.listen(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CAROUSEL_SCROLLABILITY_CHANGE;
                    EventListener eventListener4 = this.carouselScrollabilityListener;
                    if (eventListener4 != null) {
                        instance4.listen(payPalEventTypes4, eventListener4);
                        Events instance5 = companion.getInstance();
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                        EventListener eventListener5 = this.carouselFundingInstrumentListener;
                        if (eventListener5 != null) {
                            instance5.listen(payPalEventTypes5, eventListener5);
                        } else {
                            C19383o.m32805o("carouselFundingInstrumentListener");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("carouselScrollabilityListener");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("finalizeCheckoutListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("checkoutButtonListener");
                throw null;
            }
        } else {
            C19383o.m32805o("refreshListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-13  reason: not valid java name */
    public static final void m35357initEvents$lambda13(PayPalSnappingRecyclerView payPalSnappingRecyclerView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        CheckoutFinishedEventModel checkoutFinishedEventModel = data instanceof CheckoutFinishedEventModel ? (CheckoutFinishedEventModel) data : null;
        boolean z = true;
        if (checkoutFinishedEventModel == null || !checkoutFinishedEventModel.isClickEnabled()) {
            z = false;
        }
        if (!z) {
            return;
        }
        if (checkoutFinishedEventModel.isAddCardMode()) {
            payPalSnappingRecyclerView.onAddCardClicked();
            return;
        }
        payPalSnappingRecyclerView.backupFundingText.setVisibility(8);
        SnappingRecyclerView snappingRecyclerView = payPalSnappingRecyclerView.carousel;
        if (snappingRecyclerView != null) {
            snappingRecyclerView.setVisibility(8);
            payPalSnappingRecyclerView.dummyAnchorView.setVisibility(8);
            payPalSnappingRecyclerView.setClickable(false);
            return;
        }
        C19383o.m32805o("carousel");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-15  reason: not valid java name */
    public static final void m35358initEvents$lambda15(PayPalSnappingRecyclerView payPalSnappingRecyclerView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        String str = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        FundingInstrumentSelectedEvent fundingInstrumentSelectedEvent = data instanceof FundingInstrumentSelectedEvent ? (FundingInstrumentSelectedEvent) data : null;
        PaymentTypes paymentTypes = PaymentTypes.CRYPTOCURRENCY;
        if (fundingInstrumentSelectedEvent != null) {
            str = fundingInstrumentSelectedEvent.getSelectedFundingOptionType();
        }
        if (paymentTypes.equals(str, true) && !payPalSnappingRecyclerView.getFundingOptionsViewModel().isCryptoConsentAccepted()) {
            new Handler(Looper.getMainLooper()).postDelayed(new C17251o(), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-15$lambda-14  reason: not valid java name */
    public static final void m35359initEvents$lambda15$lambda14() {
        PLog.transition$default(PEnums.TransitionName.CRYPTO_LEGAL_PAGE_LOADING, PEnums.Outcome.SHOWN, PEnums.EventCode.E102, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16368, (Object) null);
        Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLCryptoConsentFragment.TAG, new PYPLCryptoConsentFragment())));
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-16  reason: not valid java name */
    public static final void m35360initEvents$lambda16(PayPalSnappingRecyclerView payPalSnappingRecyclerView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalSnappingRecyclerView.resetFields();
        payPalSnappingRecyclerView.initSnappingRecyclerViewInfo();
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-17  reason: not valid java name */
    public static final void m35361initEvents$lambda17(PayPalSnappingRecyclerView payPalSnappingRecyclerView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalSnappingRecyclerView.setClickable(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-20  reason: not valid java name */
    public static final void m35362initEvents$lambda20(PayPalSnappingRecyclerView payPalSnappingRecyclerView, EventType eventType, ResultData resultData) {
        Object data;
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        if (success != null && (data = success.getData()) != null) {
            Boolean bool = data instanceof Boolean ? (Boolean) data : null;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                SnappingRecyclerView snappingRecyclerView = payPalSnappingRecyclerView.carousel;
                if (snappingRecyclerView != null) {
                    snappingRecyclerView.setScrollEnabled(booleanValue);
                } else {
                    C19383o.m32805o("carousel");
                    throw null;
                }
            }
        }
    }

    private final void initSnappingRecyclerViewInfo() {
        if (getCartViewModel().isContinueCartExperiment() || getCartViewModel().isCartTotalVisible()) {
            setCartDetailsArrowShown(true);
        } else {
            setCartDetailsArrowShown(false);
        }
        this.creditOfferSize = getMainPaysheetViewModel().fetchCreditPPCOffers().size();
        setupConversion();
        setupBackupFunding();
        convertFundingOptionsToPayments(getFundingOptionsViewModel().fetchFundingOptionsList(), getMainPaysheetViewModel().fetchCreditPPCOffers(), getFundingOptionsViewModel().getCarouselPosition());
        setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: logoutCompletedFlagObserver$lambda-2  reason: not valid java name */
    public static final void m35363logoutCompletedFlagObserver$lambda2(PayPalSnappingRecyclerView payPalSnappingRecyclerView, Boolean bool) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            SnappingRecyclerView snappingRecyclerView = payPalSnappingRecyclerView.carousel;
            if (snappingRecyclerView != null) {
                snappingRecyclerView.setVisibility(8);
                payPalSnappingRecyclerView.clearPaymentCards();
                CarouselAdapter carouselAdapter2 = payPalSnappingRecyclerView.carouselAdapter;
                if (carouselAdapter2 != null) {
                    carouselAdapter2.notifyDataSetChanged();
                    return;
                }
                return;
            }
            C19383o.m32805o("carousel");
            throw null;
        }
    }

    private final void onAddCardClicked() {
        PLog.click$default(PEnums.TransitionName.ADD_FI_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "add_card_button_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        DialogMaker build = new DialogMaker.Builder().setTitle(C17165R.string.paypal_checkout_headline_continue).setDescription(C17165R.string.paypal_checkout_add_card_message).showSpinner(true).setPositiveButton(C17165R.string.paypal_checkout_ok, new C17250n(this)).setNegativeButton(C17165R.string.paypal_checkout_cancel, new C0048b()).build();
        Context context = getContext();
        if (context != null) {
            build.show((FragmentActivity) context);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: onAddCardClicked$lambda-21  reason: not valid java name */
    public static final void m35364onAddCardClicked$lambda21(PayPalSnappingRecyclerView payPalSnappingRecyclerView, DialogMaker dialogMaker) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        PLog.decision$default(PEnums.TransitionName.ADD_CARD_DIALOG, PEnums.Outcome.APPROVED, PEnums.EventCode.E142, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
        Context context = payPalSnappingRecyclerView.getContext();
        if (context != null) {
            instance.openChromeCustomTab((Activity) context, payPalSnappingRecyclerView.nativeSSOListener, PYPLCheckoutUtils.FallbackScenario.ADD_CARD);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    /* access modifiers changed from: private */
    /* renamed from: onAddCardClicked$lambda-22  reason: not valid java name */
    public static final void m35365onAddCardClicked$lambda22(DialogMaker dialogMaker) {
        PLog.decision$default(PEnums.TransitionName.ADD_CARD_DIALOG, PEnums.Outcome.CANCELLED, PEnums.EventCode.E143, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        dialogMaker.dismiss();
    }

    private final void refreshAddCardDrawable() {
        PaymentProcessors value;
        if (this.addCardPosition != -1 && (value = getAddCardViewModel().getPaymentProcessor().getValue()) != null) {
            this.listOfPaymentCards.set(this.addCardPosition, PaymentSourceUiModelKt.addCard(value, getAddCardViewModel().isNativeAddCardEnabled()));
            CarouselAdapter carouselAdapter2 = this.carouselAdapter;
            if (carouselAdapter2 != null) {
                carouselAdapter2.notifyDataSetChanged();
            }
        }
    }

    private final void resetFields() {
        getFundingOptionsViewModel().setCarouselPosition(-1);
        this.fundingOptionsList = null;
        this.listOfPaymentCards.clear();
        this.creditOfferSize = 0;
        this.indexOfPreviouslySelected = 0;
        this.currentlySelectedFiIndex = 0;
        this.addCardPosition = -1;
        this.creditOfferPosition = -1;
        this.payInFourPosition = -1;
    }

    private final void setCartDetailsArrowShown(boolean z) {
        this.isCartDetailsArrowShown = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpCarousel$lambda-29  reason: not valid java name */
    public static final void m35366setUpCarousel$lambda29(PayPalSnappingRecyclerView payPalSnappingRecyclerView) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        SnappingRecyclerView snappingRecyclerView = payPalSnappingRecyclerView.carousel;
        if (snappingRecyclerView != null) {
            snappingRecyclerView.smoothScrollBy(-20, new C17250n(payPalSnappingRecyclerView));
        } else {
            C19383o.m32805o("carousel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpCarousel$lambda-29$lambda-28  reason: not valid java name */
    public static final void m35367setUpCarousel$lambda29$lambda28(PayPalSnappingRecyclerView payPalSnappingRecyclerView) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        payPalSnappingRecyclerView.postDelayed(new C3249o(payPalSnappingRecyclerView, 3), 175);
    }

    /* access modifiers changed from: private */
    /* renamed from: setUpCarousel$lambda-29$lambda-28$lambda-27  reason: not valid java name */
    public static final void m35368setUpCarousel$lambda29$lambda28$lambda27(PayPalSnappingRecyclerView payPalSnappingRecyclerView) {
        C19383o.m32797g(payPalSnappingRecyclerView, "this$0");
        AnimationUtils animationUtils = AnimationUtils.INSTANCE;
        SnappingRecyclerView snappingRecyclerView = payPalSnappingRecyclerView.carousel;
        if (snappingRecyclerView != null) {
            AnimationUtils.fadeIn$default(animationUtils, snappingRecyclerView, 250, 0, (C19846a) null, 12, (Object) null);
        } else {
            C19383o.m32805o("carousel");
            throw null;
        }
    }

    private final void setupBackupFunding() {
        if (getFundingOptionsViewModel().getBackupFundingOption() != null) {
            this.backupFundingText.setText(getResources().getString(backupFundingTextResource(), new Object[]{getMainPaysheetViewModel().getBufNameText()}));
            fadeInTextView$default(this, this.backupFundingText, (C19846a) null, 2, (Object) null);
            return;
        }
        fadeOutTextView(this.backupFundingText, new PayPalSnappingRecyclerView$setupBackupFunding$1(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r0.equals(r1 == null ? null : r1.getLabel(), true) != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupConversion() {
        /*
            r7 = this;
            com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel r0 = r7.getMainPaysheetViewModel()
            boolean r0 = r0.isPayPalConversionShownFromRepo()
            if (r0 == 0) goto L_0x0078
            com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel r0 = r7.getFundingOptionsViewModel()
            com.paypal.pyplcheckout.pojo.FundingInstrument r0 = r0.getBackupFundingOption()
            if (r0 == 0) goto L_0x006d
            com.paypal.pyplcheckout.utils.PaymentTypes r0 = com.paypal.pyplcheckout.utils.PaymentTypes.AMERICAN_EXPRESS
            com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel r1 = r7.getFundingOptionsViewModel()
            com.paypal.pyplcheckout.pojo.FundingInstrument r1 = r1.getBackupFundingOption()
            r2 = 0
            if (r1 != 0) goto L_0x0023
            r1 = r2
            goto L_0x0027
        L_0x0023:
            java.lang.String r1 = r1.getLabel()
        L_0x0027:
            r3 = 1
            boolean r0 = r0.equals(r1, r3)
            if (r0 != 0) goto L_0x0046
            com.paypal.pyplcheckout.utils.PaymentTypes r0 = com.paypal.pyplcheckout.utils.PaymentTypes.AMEX
            com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel r1 = r7.getFundingOptionsViewModel()
            com.paypal.pyplcheckout.pojo.FundingInstrument r1 = r1.getBackupFundingOption()
            if (r1 != 0) goto L_0x003c
            r1 = r2
            goto L_0x0040
        L_0x003c:
            java.lang.String r1 = r1.getLabel()
        L_0x0040:
            boolean r0 = r0.equals(r1, r3)
            if (r0 == 0) goto L_0x006d
        L_0x0046:
            android.widget.TextView r0 = r7.topCurrencyConversionText
            android.content.res.Resources r1 = r7.getResources()
            int r4 = com.paypal.pyplcheckout.C17165R.string.paypal_checkout_upper_conversion_text
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel r6 = r7.getMainPaysheetViewModel()
            androidx.lifecycle.z r6 = r6.getToConversionFormat()
            java.lang.Object r6 = r6.getValue()
            r3[r5] = r6
            java.lang.String r1 = r1.getString(r4, r3)
            r0.setText(r1)
            android.widget.TextView r0 = r7.topCurrencyConversionText
            r1 = 2
            fadeInTextView$default(r7, r0, r2, r1, r2)
            goto L_0x0082
        L_0x006d:
            android.widget.TextView r0 = r7.topCurrencyConversionText
            com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView$setupConversion$1 r1 = new com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView$setupConversion$1
            r1.<init>(r7)
            r7.fadeOutTextView(r0, r1)
            goto L_0x0082
        L_0x0078:
            android.widget.TextView r0 = r7.topCurrencyConversionText
            com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView$setupConversion$2 r1 = new com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView$setupConversion$2
            r1.<init>(r7)
            r7.fadeOutTextView(r0, r1)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalSnappingRecyclerView.setupConversion():void");
    }

    private final void showOfferDialog(int i, int i2, PEnums.TransitionName transitionName, PYPLCheckoutUtils.FallbackScenario fallbackScenario) {
        DialogMaker build = new DialogMaker.Builder().setTitle(i2).setDescription(i).showSpinner(true).setPositiveButton(C17165R.string.paypal_checkout_ok, new C6597o(transitionName, this, fallbackScenario)).setNegativeButton(C17165R.string.paypal_checkout_cancel, new C8478e(transitionName)).build();
        Context context = getContext();
        if (context != null) {
            build.show((FragmentActivity) context);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: showOfferDialog$lambda-23  reason: not valid java name */
    public static final void m35369showOfferDialog$lambda23(PEnums.TransitionName transitionName, PayPalSnappingRecyclerView payPalSnappingRecyclerView, PYPLCheckoutUtils.FallbackScenario fallbackScenario, DialogMaker dialogMaker) {
        PayPalSnappingRecyclerView payPalSnappingRecyclerView2 = payPalSnappingRecyclerView;
        PYPLCheckoutUtils.FallbackScenario fallbackScenario2 = fallbackScenario;
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "$transitionName");
        C19383o.m32797g(payPalSnappingRecyclerView2, "this$0");
        C19383o.m32797g(fallbackScenario2, "$fallback");
        PLog.decision$default(transitionName2, PEnums.Outcome.APPROVED, PEnums.EventCode.E142, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
        Context context = payPalSnappingRecyclerView.getContext();
        if (context != null) {
            instance.openChromeCustomTab((Activity) context, payPalSnappingRecyclerView2.nativeSSOListener, fallbackScenario2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    /* access modifiers changed from: private */
    /* renamed from: showOfferDialog$lambda-24  reason: not valid java name */
    public static final void m35370showOfferDialog$lambda24(PEnums.TransitionName transitionName, DialogMaker dialogMaker) {
        C19383o.m32797g(transitionName, "$transitionName");
        PLog.decision$default(transitionName, PEnums.Outcome.CANCELLED, PEnums.EventCode.E143, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        dialogMaker.dismiss();
    }

    private final void updateAddCardViewState(CardUiModel.AddCardUiModel addCardUiModel, int i) {
        this.addCardPosition = i;
        if (addCardUiModel instanceof CardUiModel.AddCardUiModel.Web) {
            fadeOutTextView(this.backupFundingText, new PayPalSnappingRecyclerView$updateAddCardViewState$1(this));
        } else if (addCardUiModel instanceof CardUiModel.AddCardUiModel.Native) {
            refreshAddCardDrawable();
            this.backupFundingText.setText(getContext().getString(C17165R.string.paypal_checkout_native_add_card_sub_title));
            fadeInTextView$default(this, this.backupFundingText, (C19846a) null, 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        AnyExtensionsKt.getExhaustive(C19394m.f43287a);
        fadeOutTextView(this.topCurrencyConversionText, new PayPalSnappingRecyclerView$updateAddCardViewState$2(this));
        fadeOutTextView(this.offerDescriptionText, new PayPalSnappingRecyclerView$updateAddCardViewState$3(this));
        PLog.impression$default(Repository.PayModeEnum.PAY_NOW == getMainPaysheetViewModel().getCurrentPayMode() ? PEnums.TransitionName.ADD_CARD_BTN_SHOWN_PAYNOW : PEnums.TransitionName.ADD_CARD_BTN_SHOWN_CONTINUE, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "add_card_button_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        Events.Companion.getInstance().fire(PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED, new Success(new AddCardViewStateUpdateEvent(this.addCardPosition, this.listOfPaymentCards, addCardUiModel)));
        PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener2 = this.payPalSnappingRecyclerViewListener;
        if (payPalSnappingRecyclerViewListener2 != null) {
            payPalSnappingRecyclerViewListener2.onUpdateAddCardViewState(this.addCardPosition, this.listOfPaymentCards);
        }
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
        return this.isAnchoredToBottomSheet;
    }

    public C2887s getLifecycleOwner(View view) {
        return ICustomViewsViewModel.DefaultImpls.getLifecycleOwner(this, view);
    }

    public PayPalSnappingRecyclerView getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public void initViewModelObservers() {
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(getLifecycleOwner(this), this.fetchingUserDataCompletedFlagObserver);
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(getLifecycleOwner(this), this.logoutCompletedFlagObserver);
        getMainPaysheetViewModel().getContingencyEventsModel().observe(getLifecycleOwner(this), this.contingencyEventsObserver);
        getAddCardViewModel().getPaymentProcessor().observe(getLifecycleOwner(this), this.addCardPaymentProcessorObserver);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initViewModelObservers();
    }

    public void removeListeners() {
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.REFRESH_CAROUSEL;
            EventListener eventListener2 = this.refreshListener;
            if (eventListener2 != null) {
                instance2.removeListener(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                EventListener eventListener3 = this.finalizeCheckoutListener;
                if (eventListener3 != null) {
                    instance3.removeListener(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CAROUSEL_SCROLLABILITY_CHANGE;
                    EventListener eventListener4 = this.carouselScrollabilityListener;
                    if (eventListener4 != null) {
                        instance4.removeListener(payPalEventTypes4, eventListener4);
                        Events instance5 = companion.getInstance();
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                        EventListener eventListener5 = this.carouselFundingInstrumentListener;
                        if (eventListener5 != null) {
                            instance5.removeListener(payPalEventTypes5, eventListener5);
                        } else {
                            C19383o.m32805o("carouselFundingInstrumentListener");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("carouselScrollabilityListener");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("finalizeCheckoutListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("refreshListener");
                throw null;
            }
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
        SnappingRecyclerView snappingRecyclerView = this.carousel;
        if (snappingRecyclerView != null) {
            snappingRecyclerView.removeAllViews();
        } else {
            C19383o.m32805o("carousel");
            throw null;
        }
    }

    public final synchronized void setUpCarousel(int i) {
        CarouselAdapter carouselAdapter2 = this.carouselAdapter;
        if (carouselAdapter2 != null) {
            carouselAdapter2.notifyDataSetChanged();
        }
        PLog.impression$default(PEnums.TransitionName.CAROUSEL_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "carousel_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        SnappingRecyclerView snappingRecyclerView = this.carousel;
        if (snappingRecyclerView != null) {
            snappingRecyclerView.setOnViewSelectedListener(this.fundingInstrumentSelectedListener);
            SnappingRecyclerView snappingRecyclerView2 = this.carousel;
            if (snappingRecyclerView2 != null) {
                snappingRecyclerView2.setOnViewDismissedListener(this.fundingInstrumentDismissedListener);
                SnappingRecyclerView snappingRecyclerView3 = this.carousel;
                if (snappingRecyclerView3 != null) {
                    snappingRecyclerView3.setVisibility(4);
                    SnappingRecyclerView snappingRecyclerView4 = this.carousel;
                    if (snappingRecyclerView4 != null) {
                        RecyclerView.C3100o layoutManager = snappingRecyclerView4.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.mo11315u0(i);
                        }
                        SnappingRecyclerView snappingRecyclerView5 = this.carousel;
                        if (snappingRecyclerView5 != null) {
                            snappingRecyclerView5.post(new C3251q(this, 4));
                        } else {
                            C19383o.m32805o("carousel");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("carousel");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("carousel");
                    throw null;
                }
            } else {
                C19383o.m32805o("carousel");
                throw null;
            }
        } else {
            C19383o.m32805o("carousel");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalSnappingRecyclerView(Context context, Fragment fragment, PayPalSnappingRecyclerViewListener payPalSnappingRecyclerViewListener2) {
        super(context);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.isAnchoredToBottomSheet = true;
        this.listOfPaymentCards = new ArrayList();
        this.addCardPosition = -1;
        this.creditOfferPosition = -1;
        this.payInFourPosition = -1;
        this.typedValue = new TypedValue();
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.addCardViewModel$delegate = new C2868j0(C19386q.m32807a(AddCardViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$13 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                if (z) {
                    this.cartViewModel$delegate = new C2868j0(C19386q.m32807a(CartViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$13);
                    SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$14 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                    if (z) {
                        this.fundingOptionsViewModel$delegate = new C2868j0(C19386q.m32807a(FundingOptionsViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$14);
                        this.addCardPaymentProcessorObserver = new C6469n(this, 10);
                        this.fetchingUserDataCompletedFlagObserver = new C6346d(this, 5);
                        this.logoutCompletedFlagObserver = new C9904g(this, 7);
                        this.contingencyEventsObserver = new C17187e(this, 3);
                        View.inflate(context2, C17165R.C17169layout.paypal_snapping_recycler_view, this);
                        this.payPalSnappingRecyclerViewListener = payPalSnappingRecyclerViewListener2;
                        View findViewById = findViewById(C17165R.C17167id.buf_text);
                        C19383o.m32796f(findViewById, "findViewById(R.id.buf_text)");
                        this.backupFundingText = (TextView) findViewById;
                        View findViewById2 = findViewById(C17165R.C17167id.credit_offer_description_text);
                        C19383o.m32796f(findViewById2, "findViewById(R.id.credit_offer_description_text)");
                        this.offerDescriptionText = (TextView) findViewById2;
                        View findViewById3 = findViewById(C17165R.C17167id.conversion_options_carousel_text);
                        C19383o.m32796f(findViewById3, "findViewById(R.id.conver…on_options_carousel_text)");
                        this.topCurrencyConversionText = (TextView) findViewById3;
                        View findViewById4 = findViewById(C17165R.C17167id.picker);
                        C19383o.m32796f(findViewById4, "findViewById(R.id.picker)");
                        this.carousel = (SnappingRecyclerView) findViewById4;
                        View findViewById5 = findViewById(C17165R.C17167id.dummy_anchor_view);
                        C19383o.m32796f(findViewById5, "findViewById(R.id.dummy_anchor_view)");
                        this.dummyAnchorView = findViewById5;
                        this.heartListener = new C0015b();
                        this.selectedListener = new C3227e(this, context2);
                        this.fundingInstrumentDismissedListener = new C5380a(this);
                        this.fundingInstrumentSelectedListener = new C3260z(this);
                        setVisibility(8);
                        initCarousel();
                        initEvents();
                        this.nativeSSOListener = new PayPalSnappingRecyclerView$nativeSSOListener$1(context2);
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
