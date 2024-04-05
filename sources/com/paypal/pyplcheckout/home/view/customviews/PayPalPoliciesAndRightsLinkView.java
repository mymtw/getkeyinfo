package com.paypal.pyplcheckout.home.view.customviews;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9904g;
import com.etsy.android.p327ui.user.purchases.C11668n;
import com.etsy.android.stylekit.views.C9060k;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17187e;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17189g;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17190h;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
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
import com.paypal.pyplcheckout.events.model.FundingInstrumentSelectedEvent;
import com.paypal.pyplcheckout.events.model.OfferViewStateUpdateEvent;
import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17224a;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalPoliciesAndRightsLinkViewListener;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PayPalConstants;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;
import p260v0.C8184a;

public final class PayPalPoliciesAndRightsLinkView extends ConstraintLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalPoliciesAndRightsLinkView";
    public Map<Integer, View> _$_findViewCache;
    private final C19285c billingAgreementsViewModel$delegate;
    private EventListener carouselAddCardListener;
    private EventListener carouselCreditOfferListener;
    private EventListener carouselFundingInstrumentListener;
    private EventListener carouselPayInFourListener;
    private EventListener checkoutButtonListener;
    private EventListener disableViewsTouchListener;
    private EventListener finalizeCheckoutListener;
    private final C19285c mainPaysheetViewModel$delegate;
    private PayPalPoliciesAndRightsLinkViewListener payPalPoliciesAndRightsLinkViewListener;
    private TextView rightsLinkTv;
    private final C19285c userViewModel$delegate;

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
        }
    }

    static {
        Class<PayPalPoliciesAndRightsLinkView> cls = PayPalPoliciesAndRightsLinkView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesAndRightsLinkView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalPoliciesAndRightsLinkViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesAndRightsLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalPoliciesAndRightsLinkViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesAndRightsLinkView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalPoliciesAndRightsLinkViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesAndRightsLinkView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        this(context, attributeSet, i, fragment, (PayPalPoliciesAndRightsLinkViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalPoliciesAndRightsLinkView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalPoliciesAndRightsLinkViewListener payPalPoliciesAndRightsLinkViewListener2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment, (i2 & 16) != 0 ? null : payPalPoliciesAndRightsLinkViewListener2);
    }

    private final void cryptoTermsLink() {
        setVisibility(UserStateKt.isUSBuyer(getUserViewModel().getUser()) ? 0 : 8);
        SpannableString spannableString = new SpannableString(getResources().getString(C17165R.string.paypal_checkout_view_rights));
        this.rightsLinkTv.setText(spannableString);
        Context context = getContext();
        int i = C17165R.color.blue_color_600;
        Object obj = C8184a.f17966a;
        spannableString.setSpan(new ForegroundColorSpan(C8184a.C8188d.m16468a(context, i)), 0, spannableString.length(), 33);
        this.rightsLinkTv.setOnClickListener(new C9060k(this, 7));
    }

    /* access modifiers changed from: private */
    /* renamed from: cryptoTermsLink$lambda-13  reason: not valid java name */
    public static final void m35337cryptoTermsLink$lambda13(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, View view) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
        User user = payPalPoliciesAndRightsLinkView.getUserViewModel().getUser();
        String str = null;
        String userLocale = user == null ? null : user.getUserLocale();
        User user2 = payPalPoliciesAndRightsLinkView.getUserViewModel().getUser();
        if (user2 != null) {
            str = user2.getCountry();
        }
        Uri parse = Uri.parse(PayPalConstants.getCryptoPolicyUrl(userLocale, str));
        C19383o.m32796f(parse, "parse(\n                 …      )\n                )");
        Context context = payPalPoliciesAndRightsLinkView.getContext();
        if (context != null) {
            instance.openChromeCustomTabs(parse, (Activity) context);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    private final void defaultTermsLink() {
        setVisibility(getBillingAgreementsViewModel().getShouldHidePoliciesLink() ^ true ? 0 : 8);
        SpannableString spannableString = new SpannableString(getResources().getString(C17165R.string.paypal_checkout_view_rights));
        this.rightsLinkTv.setText(spannableString);
        Context context = getContext();
        int i = C17165R.color.blue_color_600;
        Object obj = C8184a.f17966a;
        spannableString.setSpan(new ForegroundColorSpan(C8184a.C8188d.m16468a(context, i)), 0, spannableString.length(), 33);
        this.rightsLinkTv.setOnClickListener(this);
    }

    private final BillingAgreementsViewModel getBillingAgreementsViewModel() {
        return (BillingAgreementsViewModel) this.billingAgreementsViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    private final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        boolean z = true;
        int i2 = 0;
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
                    if (!(!getBillingAgreementsViewModel().getShouldHidePoliciesLink())) {
                        i2 = 8;
                    }
                    setVisibility(i2);
                    return;
                case 10:
                    if (!contingencyEventsModel.isAddCardContingency() || getBillingAgreementsViewModel().getShouldHidePoliciesLink()) {
                        z = false;
                    }
                    if (!z) {
                        i2 = 8;
                    }
                    setVisibility(i2);
                    return;
                default:
                    PLog.i$default(TAG, "ContingencyProcessingStatus of type " + contingencyProcessingStatus + " not handled", 0, 4, (Object) null);
                    return;
            }
        } else {
            PLog.i$default(TAG, "ContingencyType of type " + contingencyType + " not handled", 0, 4, (Object) null);
        }
    }

    private final void initEvents() {
        this.checkoutButtonListener = new C17189g(this, 4);
        this.carouselCreditOfferListener = new C17190h(this, 4);
        this.carouselPayInFourListener = new C17224a(this, 3);
        this.carouselAddCardListener = new C17193a(this, 5);
        this.carouselFundingInstrumentListener = new C17225b(this, 4);
        this.finalizeCheckoutListener = new C17203a(this, 5);
        this.disableViewsTouchListener = new C17198a(this, 4);
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
            EventListener eventListener2 = this.carouselCreditOfferListener;
            if (eventListener2 != null) {
                instance2.listen(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED;
                EventListener eventListener3 = this.carouselAddCardListener;
                if (eventListener3 != null) {
                    instance3.listen(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                    EventListener eventListener4 = this.carouselFundingInstrumentListener;
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
                        C19383o.m32805o("carouselFundingInstrumentListener");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("carouselAddCardListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("carouselCreditOfferListener");
                throw null;
            }
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-10  reason: not valid java name */
    public static final void m35338initEvents$lambda10(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalPoliciesAndRightsLinkView.rightsLinkTv.setClickable(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-11  reason: not valid java name */
    public static final void m35339initEvents$lambda11(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalPoliciesAndRightsLinkView.rightsLinkTv.setClickable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-5  reason: not valid java name */
    public static final void m35340initEvents$lambda5(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CheckoutFinishedEventModel checkoutFinishedEventModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CheckoutFinishedEventModel) {
            checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
        }
        if (checkoutFinishedEventModel != null && checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
            payPalPoliciesAndRightsLinkView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-6  reason: not valid java name */
    public static final void m35341initEvents$lambda6(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        String str = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        OfferViewStateUpdateEvent offerViewStateUpdateEvent = data instanceof OfferViewStateUpdateEvent ? (OfferViewStateUpdateEvent) data : null;
        String termsText = offerViewStateUpdateEvent == null ? null : offerViewStateUpdateEvent.getTermsText();
        if (offerViewStateUpdateEvent != null) {
            str = offerViewStateUpdateEvent.getTermsLink();
        }
        payPalPoliciesAndRightsLinkView.setupOfferLink(termsText, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-7  reason: not valid java name */
    public static final void m35342initEvents$lambda7(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        String str = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        OfferViewStateUpdateEvent offerViewStateUpdateEvent = data instanceof OfferViewStateUpdateEvent ? (OfferViewStateUpdateEvent) data : null;
        String termsText = offerViewStateUpdateEvent == null ? null : offerViewStateUpdateEvent.getTermsText();
        if (offerViewStateUpdateEvent != null) {
            str = offerViewStateUpdateEvent.getTermsLink();
        }
        payPalPoliciesAndRightsLinkView.setupOfferLink(termsText, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-8  reason: not valid java name */
    public static final void m35343initEvents$lambda8(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        AddCardViewStateUpdateEvent addCardViewStateUpdateEvent = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof AddCardViewStateUpdateEvent) {
            addCardViewStateUpdateEvent = (AddCardViewStateUpdateEvent) data;
        }
        if (addCardViewStateUpdateEvent != null) {
            CardUiModel.AddCardUiModel addCard = addCardViewStateUpdateEvent.getAddCard();
            if (addCard instanceof CardUiModel.AddCardUiModel.Native) {
                payPalPoliciesAndRightsLinkView.setVisibility(8);
            } else if (addCard instanceof CardUiModel.AddCardUiModel.Web) {
                payPalPoliciesAndRightsLinkView.defaultTermsLink();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            AnyExtensionsKt.getExhaustive(C19394m.f43287a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-9  reason: not valid java name */
    public static final void m35344initEvents$lambda9(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        String str = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        FundingInstrumentSelectedEvent fundingInstrumentSelectedEvent = data instanceof FundingInstrumentSelectedEvent ? (FundingInstrumentSelectedEvent) data : null;
        if (PaymentTypes.PAYPAL_CREDIT.equals(fundingInstrumentSelectedEvent == null ? null : fundingInstrumentSelectedEvent.getSelectedFundingOptionType(), true)) {
            payPalPoliciesAndRightsLinkView.setupOfferLink(payPalPoliciesAndRightsLinkView.getMainPaysheetViewModel().fetchCreditOfferTerms(), payPalPoliciesAndRightsLinkView.getMainPaysheetViewModel().fetchCreditOfferTermsLink());
            return;
        }
        PaymentTypes paymentTypes = PaymentTypes.CRYPTOCURRENCY;
        if (fundingInstrumentSelectedEvent != null) {
            str = fundingInstrumentSelectedEvent.getSelectedFundingOptionType();
        }
        if (paymentTypes.equals(str, true)) {
            payPalPoliciesAndRightsLinkView.cryptoTermsLink();
        } else {
            payPalPoliciesAndRightsLinkView.defaultTermsLink();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35345initViewModelObservers$lambda0(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, Boolean bool) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && payPalPoliciesAndRightsLinkView.getMainPaysheetViewModel().getContingencyEventsModel().getValue() == null) {
            payPalPoliciesAndRightsLinkView.setVisibility(payPalPoliciesAndRightsLinkView.getBillingAgreementsViewModel().getShouldHidePoliciesLink() ^ true ? 0 : 8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35346initViewModelObservers$lambda1(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, Boolean bool) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            payPalPoliciesAndRightsLinkView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35347initViewModelObservers$lambda2(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, Boolean bool) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        payPalPoliciesAndRightsLinkView.setFocusForAccessibilityAnnouncement();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-4  reason: not valid java name */
    public static final void m35348initViewModelObservers$lambda4(PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        if (contingencyEventsModel != null) {
            payPalPoliciesAndRightsLinkView.handleContingencyEvent(contingencyEventsModel);
        }
    }

    private final void setFocusForAccessibilityAnnouncement() {
        if (!getMainPaysheetViewModel().isPayPalConversionShownFromRepo() && !getMainPaysheetViewModel().shouldShowShipping()) {
            this.rightsLinkTv.requestFocus();
            this.rightsLinkTv.sendAccessibilityEvent(8);
        }
    }

    private final void setOnClickListener() {
        this.rightsLinkTv.setOnClickListener(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupOfferLink(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0006
        L_0x0004:
            r2 = r1
            goto L_0x0012
        L_0x0006:
            int r2 = r8.length()
            if (r2 <= 0) goto L_0x000e
            r2 = r0
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            if (r2 != r0) goto L_0x0004
            r2 = r0
        L_0x0012:
            r3 = 8
            if (r2 == 0) goto L_0x006a
            if (r9 != 0) goto L_0x001a
        L_0x0018:
            r2 = r1
            goto L_0x0026
        L_0x001a:
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0022
            r2 = r0
            goto L_0x0023
        L_0x0022:
            r2 = r1
        L_0x0023:
            if (r2 != r0) goto L_0x0018
            r2 = r0
        L_0x0026:
            if (r2 == 0) goto L_0x006a
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r8)
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            android.content.Context r4 = r7.getContext()
            int r5 = com.paypal.pyplcheckout.C17165R.color.blue_color_600
            java.lang.Object r6 = p260v0.C8184a.f17966a
            int r4 = p260v0.C8184a.C8188d.m16468a(r4, r5)
            r8.<init>(r4)
            int r4 = r2.length()
            r5 = 33
            r2.setSpan(r8, r1, r4, r5)
            android.widget.TextView r8 = r7.rightsLinkTv
            r8.setText(r2)
            android.widget.TextView r8 = r7.rightsLinkTv
            zi.e r2 = new zi.e
            r2.<init>(r0, r9, r7)
            r8.setOnClickListener(r2)
            com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel r8 = r7.getUserViewModel()
            com.paypal.pyplcheckout.pojo.User r8 = r8.getUser()
            boolean r8 = com.paypal.pyplcheckout.userprofile.model.UserStateKt.isUSBuyer(r8)
            if (r8 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = r3
        L_0x0066:
            r7.setVisibility(r1)
            goto L_0x0073
        L_0x006a:
            r7.setVisibility(r3)
            android.widget.TextView r8 = r7.rightsLinkTv
            r9 = 0
            r8.setOnClickListener(r9)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalPoliciesAndRightsLinkView.setupOfferLink(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: setupOfferLink$lambda-12  reason: not valid java name */
    public static final void m35349setupOfferLink$lambda12(String str, PayPalPoliciesAndRightsLinkView payPalPoliciesAndRightsLinkView, View view) {
        C19383o.m32797g(payPalPoliciesAndRightsLinkView, "this$0");
        User user = payPalPoliciesAndRightsLinkView.getUserViewModel().getUser();
        String str2 = null;
        String country = user == null ? null : user.getCountry();
        User user2 = payPalPoliciesAndRightsLinkView.getUserViewModel().getUser();
        if (user2 != null) {
            str2 = user2.getUserLocale();
        }
        String c = C0048b.m164c(str, "?country.x=", country, "&locale.x=", str2);
        PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
        Uri parse = Uri.parse(c);
        C19383o.m32796f(parse, "parse(policyLink)");
        Context context = payPalPoliciesAndRightsLinkView.getContext();
        if (context != null) {
            instance.openChromeCustomTabs(parse, (Activity) context);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
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

    public void initViewModelObservers() {
        C6346d dVar = new C6346d(this, 4);
        C9904g gVar = new C9904g(this, 6);
        C17187e eVar = new C17187e(this, 2);
        C11668n nVar = new C11668n(this, 2);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, dVar);
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(componentActivity, gVar);
        getMainPaysheetViewModel().getPaymentSourceCardViewClickedFlag().observe(componentActivity, eVar);
        getMainPaysheetViewModel().getContingencyEventsModel().observe(componentActivity, nVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.rights_link_tv) {
            Context context = getContext();
            String str = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                PLog.click$default(PEnums.TransitionName.PAYMENT_RIGHTSANDPOLICIES_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "policies_and_rights_view", "policies_and_rights_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
                PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
                User user = getUserViewModel().getUser();
                String userLocale = user == null ? null : user.getUserLocale();
                User user2 = getUserViewModel().getUser();
                if (user2 != null) {
                    str = user2.getCountry();
                }
                Uri parse = Uri.parse(PayPalConstants.getPolicyUrl(userLocale, str));
                C19383o.m32796f(parse, "parse(\n                 …      )\n                )");
                instance.openChromeCustomTabs(parse, activity);
                PayPalPoliciesAndRightsLinkViewListener payPalPoliciesAndRightsLinkViewListener2 = this.payPalPoliciesAndRightsLinkViewListener;
                if (payPalPoliciesAndRightsLinkViewListener2 != null) {
                    payPalPoliciesAndRightsLinkViewListener2.onPolicyAndRightsLinkClick();
                }
            }
        }
    }

    public void removeListeners() {
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
            EventListener eventListener2 = this.carouselCreditOfferListener;
            if (eventListener2 != null) {
                instance2.removeListener(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED;
                EventListener eventListener3 = this.carouselAddCardListener;
                if (eventListener3 != null) {
                    instance3.removeListener(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                    EventListener eventListener4 = this.carouselFundingInstrumentListener;
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
                        C19383o.m32805o("carouselFundingInstrumentListener");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("carouselAddCardListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("carouselCreditOfferListener");
                throw null;
            }
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    public void setContentViewVisibility(int i) {
        if (!UserStateKt.isUSBuyer(getUserViewModel().getUser())) {
            i = 8;
        }
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesAndRightsLinkView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalPoliciesAndRightsLinkViewListener payPalPoliciesAndRightsLinkViewListener2) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$13 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                if (z) {
                    this.billingAgreementsViewModel$delegate = new C2868j0(C19386q.m32807a(BillingAgreementsViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$13);
                    View.inflate(getContext(), C17165R.C17169layout.policies_and_rights_view, this);
                    this.payPalPoliciesAndRightsLinkViewListener = payPalPoliciesAndRightsLinkViewListener2;
                    SpannableString spannableString = new SpannableString(getResources().getString(C17165R.string.paypal_checkout_view_rights));
                    Context context3 = getContext();
                    int i2 = C17165R.color.blue_color_600;
                    Object obj = C8184a.f17966a;
                    spannableString.setSpan(new ForegroundColorSpan(C8184a.C8188d.m16468a(context3, i2)), 0, spannableString.length(), 33);
                    View findViewById = findViewById(C17165R.C17167id.rights_link_tv);
                    C19383o.m32796f(findViewById, "findViewById(R.id.rights_link_tv)");
                    TextView textView = (TextView) findViewById;
                    this.rightsLinkTv = textView;
                    textView.setText(spannableString);
                    this.rightsLinkTv.setMovementMethod(LinkMovementMethod.getInstance());
                    setVisibility(8);
                    setOnClickListener();
                    initEvents();
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
}
