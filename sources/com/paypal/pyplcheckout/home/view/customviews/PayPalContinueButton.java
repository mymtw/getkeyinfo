package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.C0388a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C2783s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6467l;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.logging.type.LogSeverity;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressBookFragment;
import com.paypal.pyplcheckout.auth.NativeSSOListener;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementType;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.CheckoutButtonStyleEventModel;
import com.paypal.pyplcheckout.events.model.CheckoutFinishedEventModel;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.home.view.customviews.productviews.CheckoutButtonBehaviourDescriptor;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCheckoutButtonClickedListener;
import com.paypal.pyplcheckout.home.viewmodel.CartViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.shippingmethods.view.fragments.PYPLShippingMethodFragment;
import com.paypal.pyplcheckout.utils.DialogMaker;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p753kq.C19846a;

@SuppressLint({"ViewConstructor"})
public final class PayPalContinueButton extends LinearLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalContinueButton";
    public Map<Integer, View> _$_findViewCache;
    /* access modifiers changed from: private */
    public int addCardPosition;
    private final C19285c addCardViewModel$delegate;
    private final C19285c billingAgreementsViewModel$delegate;
    /* access modifiers changed from: private */
    public final PayPalActionButton button;
    private final ConstraintLayout buttonParentView;
    private String buttonText;
    private EventListener carouselAddCardListener;
    private EventListener carouselCreditOfferListener;
    private EventListener carouselFundingInstrumentListener;
    private EventListener carouselPayInFourListener;
    private final C19285c cartViewModel$delegate;
    private final ProgressBar checkoutPb;
    private final C19285c cryptoViewModel$delegate;
    private EventListener ctaButtonBlockRequestListener;
    private EventListener finishCheckoutListener;
    /* access modifiers changed from: private */
    public boolean isActionButtonClickEnabled;
    /* access modifiers changed from: private */
    public boolean isAddCardMode;
    private boolean isAnchoredToBottomSheet;
    /* access modifiers changed from: private */
    public boolean isInvalidShippingAddress;
    /* access modifiers changed from: private */
    public boolean isInvalidShippingMethod;
    private EventListener loadingSpinnerListener;
    private final C19285c mainPaysheetViewModel$delegate;
    private final NativeSSOListener nativeSSOListener;
    private final PayPalCheckoutButtonClickedListener payPalCheckoutButtonClickedListener;
    private EventListener renderActionButtonStyle;
    private EventListener scaOnContingencyClearedListener;
    private EventListener shippingChangeInvalidAddressListeners;
    private EventListener shippingChangeInvalidShippingMethodListeners;
    private EventListener shippingChangeNewAddressListeners;
    private EventListener shippingChangeRefreshCompletedListeners;
    private EventListener shippingChangeRefreshPendingListeners;

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
            int[] iArr3 = new int[CheckoutButtonBehaviourDescriptor.Type.values().length];
            iArr3[CheckoutButtonBehaviourDescriptor.Type.ADD_CARD_BEHAVIOUR.ordinal()] = 1;
            iArr3[CheckoutButtonBehaviourDescriptor.Type.PAY_NOW_BEHAVIOUR.ordinal()] = 2;
            iArr3[CheckoutButtonBehaviourDescriptor.Type.OTHER.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Class<PayPalContinueButton> cls = PayPalContinueButton.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalContinueButton(Context context, AttributeSet attributeSet, int i, ActionButtonShape actionButtonShape) {
        this(context, attributeSet, i, (String) null, (Fragment) null, actionButtonShape, (PayPalCheckoutButtonClickedListener) null, 88, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(actionButtonShape, "buttonShape");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PayPalContinueButton(android.content.Context r12, android.util.AttributeSet r13, int r14, java.lang.String r15, androidx.fragment.app.Fragment r16, com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape r17) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            r2 = r12
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "buttonShape"
            r7 = r17
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r8 = 0
            r9 = 64
            r10 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalContinueButton.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.String, androidx.fragment.app.Fragment, com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalContinueButton(Context context, AttributeSet attributeSet, int i, String str, Fragment fragment, ActionButtonShape actionButtonShape, PayPalCheckoutButtonClickedListener payPalCheckoutButtonClickedListener2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : fragment, actionButtonShape, (i2 & 64) != 0 ? null : payPalCheckoutButtonClickedListener2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PayPalContinueButton(android.content.Context r12, android.util.AttributeSet r13, int r14, java.lang.String r15, com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape r16) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            r2 = r12
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "buttonShape"
            r7 = r16
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r6 = 0
            r8 = 0
            r9 = 80
            r10 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalContinueButton.<init>(android.content.Context, android.util.AttributeSet, int, java.lang.String, com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalContinueButton(Context context, AttributeSet attributeSet, ActionButtonShape actionButtonShape) {
        this(context, attributeSet, 0, (String) null, (Fragment) null, actionButtonShape, (PayPalCheckoutButtonClickedListener) null, 92, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(actionButtonShape, "buttonShape");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalContinueButton(Context context, ActionButtonShape actionButtonShape) {
        this(context, (AttributeSet) null, 0, (String) null, (Fragment) null, actionButtonShape, (PayPalCheckoutButtonClickedListener) null, 94, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(actionButtonShape, "buttonShape");
    }

    /* access modifiers changed from: private */
    public final void blockCTAButton() {
        updateCheckoutButtonRefreshStatus(true);
        this.isActionButtonClickEnabled = false;
        this.button.setOnClickListener(this);
    }

    /* access modifiers changed from: private */
    public final void finishCheckout() {
        getMainPaysheetViewModel().setActionButtonClickEnabled(this.isActionButtonClickEnabled);
        getMainPaysheetViewModel().setAddCardMode(this.isAddCardMode);
        setVisibility(8);
        getMainPaysheetViewModel().isBackBtnBlocked().setValue(Boolean.TRUE);
        getMainPaysheetViewModel().setShouldPaymentButtonBeVisible(false);
    }

    private final String getActionButtonText() {
        if (this.isAddCardMode) {
            return C0388a.m1049e(new Object[]{getResources().getString(C17165R.string.paypal_checkout_add_card)}, 1, "+ %s", "format(format, *args)");
        }
        boolean z = this.isInvalidShippingAddress;
        if (z) {
            String string = getResources().getString(C17165R.string.paypal_checkout_choose_a_new_address);
            C19383o.m32796f(string, "resources.getString(R.st…out_choose_a_new_address)");
            return string;
        }
        boolean z2 = this.isInvalidShippingMethod;
        if (!z2) {
            return (z || z2) ? "" : getCheckoutText();
        }
        ShippingMethods value = getMainPaysheetViewModel().getSelectedShippingMethod().getValue();
        if ((value == null ? null : value.getType()) == ShippingMethodType.Type.PICKUP) {
            String string2 = getResources().getString(C17165R.string.paypal_checkout_choose_new_pickup_method);
            C19383o.m32796f(string2, "{\n                    re…method)\n                }");
            return string2;
        }
        String string3 = getResources().getString(C17165R.string.paypal_checkout_choose_new_shipping_method);
        C19383o.m32796f(string3, "{\n                    re…method)\n                }");
        return string3;
    }

    /* access modifiers changed from: private */
    public final AddCardViewModel getAddCardViewModel() {
        return (AddCardViewModel) this.addCardViewModel$delegate.getValue();
    }

    private final BillingAgreementsViewModel getBillingAgreementsViewModel() {
        return (BillingAgreementsViewModel) this.billingAgreementsViewModel$delegate.getValue();
    }

    private final CartViewModel getCartViewModel() {
        return (CartViewModel) this.cartViewModel$delegate.getValue();
    }

    private final String getCheckoutText() {
        String string = getCryptoViewModel().isCryptoPayment() ? getResources().getString(C17165R.string.paypal_checkout_crypto_cta_button_text, new Object[]{getCryptoViewModel().getCryptoLabel()}) : getBillingAgreementsViewModel().getBillingAgreementType() != BillingAgreementType.NOT_SUPPORTED ? getResources().getString(getBillingAgreementsViewModel().getCtaTextForBillingAgreements()) : (!getCartViewModel().isCartTotalVisible() || Repository.PayModeEnum.PAY_NOW != getMainPaysheetViewModel().getCurrentPayMode()) ? getResources().getString(C17165R.string.paypal_checkout_review_order) : getResources().getString(C17165R.string.paypal_checkout_complete_purchase_order);
        C19383o.m32796f(string, "when {\n        cryptoVie…ckout_review_order)\n    }");
        return string;
    }

    private final int getContainerBackgroundColor(CheckoutButtonBehaviourDescriptor checkoutButtonBehaviourDescriptor) {
        if (this.button.getShape() == ActionButtonShape.RECTANGLE) {
            if (WhenMappings.$EnumSwitchMapping$2[checkoutButtonBehaviourDescriptor.getCheckoutButtonBehaviour().ordinal()] == 1) {
                Context context = getContext();
                int i = C17165R.color.gray_color_200;
                Object obj = C8184a.f17966a;
                return C8184a.C8188d.m16468a(context, i);
            }
            Context context2 = getContext();
            int i2 = C17165R.color.blue_color_600;
            Object obj2 = C8184a.f17966a;
            return C8184a.C8188d.m16468a(context2, i2);
        }
        Context context3 = getContext();
        int i3 = C17165R.color.white_color;
        Object obj3 = C8184a.f17966a;
        return C8184a.C8188d.m16468a(context3, i3);
    }

    private final CryptoViewModel getCryptoViewModel() {
        return (CryptoViewModel) this.cryptoViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final MainPaysheetViewModel getMainPaysheetViewModel() {
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
                    setVisibility(8);
                    getMainPaysheetViewModel().isBackBtnBlocked().setValue(Boolean.TRUE);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    setVisibility(0);
                    getMainPaysheetViewModel().isBackBtnBlocked().setValue(Boolean.FALSE);
                    return;
                case 10:
                    if (contingencyEventsModel.isAddCardContingency()) {
                        setVisibility(0);
                        getMainPaysheetViewModel().isBackBtnBlocked().setValue(Boolean.FALSE);
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

    private final void initEvents() {
        this.renderActionButtonStyle = new PayPalContinueButton$initEvents$1(this);
        this.carouselCreditOfferListener = new PayPalContinueButton$initEvents$2(this);
        this.carouselPayInFourListener = new PayPalContinueButton$initEvents$3(this);
        this.carouselAddCardListener = new PayPalContinueButton$initEvents$4(this);
        this.carouselFundingInstrumentListener = new PayPalContinueButton$initEvents$5(this);
        this.shippingChangeNewAddressListeners = new PayPalContinueButton$initEvents$6(this);
        this.shippingChangeInvalidAddressListeners = new PayPalContinueButton$initEvents$7(this);
        this.shippingChangeRefreshPendingListeners = new PayPalContinueButton$initEvents$8(this);
        this.shippingChangeRefreshCompletedListeners = new PayPalContinueButton$initEvents$9(this);
        this.shippingChangeInvalidShippingMethodListeners = new PayPalContinueButton$initEvents$10(this);
        this.loadingSpinnerListener = new PayPalContinueButton$initEvents$11(this);
        this.ctaButtonBlockRequestListener = new PayPalContinueButton$initEvents$12(this);
        this.finishCheckoutListener = new PayPalContinueButton$initEvents$13(this);
        this.scaOnContingencyClearedListener = new PayPalContinueButton$initEvents$14(this);
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CTA_LOADING_SPINNER;
        EventListener eventListener = this.loadingSpinnerListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CHECKOUT_BUTTON_UI_RENDER_REQUESTED;
            EventListener eventListener2 = this.renderActionButtonStyle;
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
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED;
                        EventListener eventListener5 = this.shippingChangeNewAddressListeners;
                        if (eventListener5 != null) {
                            instance5.listen(payPalEventTypes5, eventListener5);
                            Events instance6 = companion.getInstance();
                            PayPalEventTypes payPalEventTypes6 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_ADDRESS;
                            EventListener eventListener6 = this.shippingChangeInvalidAddressListeners;
                            if (eventListener6 != null) {
                                instance6.listen(payPalEventTypes6, eventListener6);
                                Events instance7 = companion.getInstance();
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_PENDING;
                                EventListener eventListener7 = this.shippingChangeRefreshPendingListeners;
                                if (eventListener7 != null) {
                                    instance7.listen(payPalEventTypes7, eventListener7);
                                    Events instance8 = companion.getInstance();
                                    PayPalEventTypes payPalEventTypes8 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_COMPLETED;
                                    EventListener eventListener8 = this.shippingChangeRefreshCompletedListeners;
                                    if (eventListener8 != null) {
                                        instance8.listen(payPalEventTypes8, eventListener8);
                                        Events instance9 = companion.getInstance();
                                        PayPalEventTypes payPalEventTypes9 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_METHOD;
                                        EventListener eventListener9 = this.shippingChangeInvalidShippingMethodListeners;
                                        if (eventListener9 != null) {
                                            instance9.listen(payPalEventTypes9, eventListener9);
                                            Events instance10 = companion.getInstance();
                                            PayPalEventTypes payPalEventTypes10 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
                                            EventListener eventListener10 = this.carouselCreditOfferListener;
                                            if (eventListener10 != null) {
                                                instance10.listen(payPalEventTypes10, eventListener10);
                                                Events instance11 = companion.getInstance();
                                                PayPalEventTypes payPalEventTypes11 = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
                                                EventListener eventListener11 = this.carouselPayInFourListener;
                                                if (eventListener11 != null) {
                                                    instance11.listen(payPalEventTypes11, eventListener11);
                                                    Events instance12 = companion.getInstance();
                                                    PayPalEventTypes payPalEventTypes12 = PayPalEventTypes.CTA_BTN_BLOCK_REQUEST;
                                                    EventListener eventListener12 = this.ctaButtonBlockRequestListener;
                                                    if (eventListener12 != null) {
                                                        instance12.listen(payPalEventTypes12, eventListener12);
                                                        Events instance13 = companion.getInstance();
                                                        PayPalEventTypes payPalEventTypes13 = PayPalEventTypes.FINISH_CHECKOUT;
                                                        EventListener eventListener13 = this.finishCheckoutListener;
                                                        if (eventListener13 != null) {
                                                            instance13.listen(payPalEventTypes13, eventListener13);
                                                            Events instance14 = companion.getInstance();
                                                            PayPalEventTypes payPalEventTypes14 = PayPalEventTypes.SCA_ON_CONTINGENCY_CLEARED;
                                                            EventListener eventListener14 = this.scaOnContingencyClearedListener;
                                                            if (eventListener14 != null) {
                                                                instance14.listen(payPalEventTypes14, eventListener14);
                                                            } else {
                                                                C19383o.m32805o("scaOnContingencyClearedListener");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C19383o.m32805o("finishCheckoutListener");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C19383o.m32805o("ctaButtonBlockRequestListener");
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
                                            C19383o.m32805o("shippingChangeInvalidShippingMethodListeners");
                                            throw null;
                                        }
                                    } else {
                                        C19383o.m32805o("shippingChangeRefreshCompletedListeners");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("shippingChangeRefreshPendingListeners");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("shippingChangeInvalidAddressListeners");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("shippingChangeNewAddressListeners");
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
                C19383o.m32805o("renderActionButtonStyle");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingSpinnerListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35295initViewModelObservers$lambda0(PayPalContinueButton payPalContinueButton, Boolean bool) {
        C19383o.m32797g(payPalContinueButton, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && payPalContinueButton.getMainPaysheetViewModel().getContingencyEventsModel().getValue() == null) {
            payPalContinueButton.updateCheckoutButton(payPalContinueButton.getCheckoutText(), new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.PAY_NOW_BEHAVIOUR));
            PLog.impression$default(PEnums.TransitionName.NATIVE_XO_CTA_BUTTON_READY, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.READY, (String) null, "review_your_information_screen", "call_to_action_button_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35296initViewModelObservers$lambda1(PayPalContinueButton payPalContinueButton, Boolean bool) {
        C19383o.m32797g(payPalContinueButton, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            payPalContinueButton.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35297initViewModelObservers$lambda3(PayPalContinueButton payPalContinueButton, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalContinueButton, "this$0");
        if (contingencyEventsModel != null) {
            payPalContinueButton.handleContingencyEvent(contingencyEventsModel);
        }
    }

    /* access modifiers changed from: private */
    public final void setCheckoutText() {
        updateCheckoutButton$default(this, getCheckoutText(), (CheckoutButtonBehaviourDescriptor) null, 2, (Object) null);
    }

    private final void setOnClickListener() {
        this.button.setOnClickListener(this);
    }

    /* access modifiers changed from: private */
    public final void setupOffer(String str, int i, PEnums.TransitionName transitionName, String str2, C19846a<C19394m> aVar) {
        PayPalActionButton payPalActionButton = this.button;
        if (str == null) {
            str = getResources().getString(i);
            C19383o.m32796f(str, "resources.getString(defaultCta)");
        }
        payPalActionButton.updateButtonText(str);
        if (this.button.getShape() != ActionButtonShape.MATERIAL_DESIGN) {
            ConstraintLayout constraintLayout = this.buttonParentView;
            Context context = getContext();
            int i2 = C17165R.color.blue_color_600;
            Object obj = C8184a.f17966a;
            constraintLayout.setBackgroundColor(C8184a.C8188d.m16468a(context, i2));
        }
        this.button.setColor(ActionButtonColor.BLUE);
        this.button.setOnClickListener(new C17243g(transitionName, str2, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupOffer$lambda-4  reason: not valid java name */
    public static final void m35298setupOffer$lambda4(PEnums.TransitionName transitionName, String str, C19846a aVar, View view) {
        C19383o.m32797g(transitionName, "$transitionName");
        C19383o.m32797g(str, "$childViewName");
        C19383o.m32797g(aVar, "$onClick");
        PLog.click$default(transitionName, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", str, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, LogSeverity.WARNING_VALUE, (Object) null);
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final void showOfferDialog(int i, int i2, PEnums.TransitionName transitionName, PYPLCheckoutUtils.FallbackScenario fallbackScenario) {
        DialogMaker build = new DialogMaker.Builder().setTitle(i2).setDescription(i).showSpinner(true).setPositiveButton(C17165R.string.paypal_checkout_ok, new C17244h(transitionName, this, fallbackScenario)).setNegativeButton(C17165R.string.paypal_checkout_cancel, new C2783s(transitionName, 4)).build();
        Context context = getContext();
        if (context != null) {
            build.show((FragmentActivity) context);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: showOfferDialog$lambda-7  reason: not valid java name */
    public static final void m35299showOfferDialog$lambda7(PEnums.TransitionName transitionName, PayPalContinueButton payPalContinueButton, PYPLCheckoutUtils.FallbackScenario fallbackScenario, DialogMaker dialogMaker) {
        PayPalContinueButton payPalContinueButton2 = payPalContinueButton;
        PYPLCheckoutUtils.FallbackScenario fallbackScenario2 = fallbackScenario;
        PEnums.TransitionName transitionName2 = transitionName;
        C19383o.m32797g(transitionName2, "$transitionName");
        C19383o.m32797g(payPalContinueButton2, "this$0");
        C19383o.m32797g(fallbackScenario2, "$fallback");
        PLog.decision$default(transitionName2, PEnums.Outcome.APPROVED, PEnums.EventCode.E142, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
        Context context = payPalContinueButton.getContext();
        if (context != null) {
            instance.openChromeCustomTab((Activity) context, payPalContinueButton2.nativeSSOListener, fallbackScenario2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    /* access modifiers changed from: private */
    /* renamed from: showOfferDialog$lambda-8  reason: not valid java name */
    public static final void m35300showOfferDialog$lambda8(PEnums.TransitionName transitionName, DialogMaker dialogMaker) {
        C19383o.m32797g(transitionName, "$transitionName");
        PLog.decision$default(transitionName, PEnums.Outcome.CANCELLED, PEnums.EventCode.E143, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        dialogMaker.dismiss();
    }

    /* access modifiers changed from: private */
    public final void toggleLoadingState(boolean z) {
        boolean z2 = true;
        if (z) {
            updateCheckoutButtonRefreshStatus(true);
            z2 = false;
        } else {
            updateCheckoutButtonRefreshStatus(false);
        }
        this.isActionButtonClickEnabled = z2;
    }

    /* access modifiers changed from: private */
    public final void unBlockCTAButton() {
        updateCheckoutButtonRefreshStatus(false);
        this.isActionButtonClickEnabled = true;
        this.button.setOnClickListener(this);
    }

    /* access modifiers changed from: private */
    public final void updateCheckoutButton(String str, CheckoutButtonBehaviourDescriptor checkoutButtonBehaviourDescriptor) {
        this.button.updateButtonText(str);
        this.button.setContentDescription(str);
        updateCheckoutButtonBackgroundColor$default(this, checkoutButtonBehaviourDescriptor, (CheckoutButtonStyleEventModel) null, 2, (Object) null);
    }

    public static /* synthetic */ void updateCheckoutButton$default(PayPalContinueButton payPalContinueButton, String str, CheckoutButtonBehaviourDescriptor checkoutButtonBehaviourDescriptor, int i, Object obj) {
        if ((i & 2) != 0) {
            checkoutButtonBehaviourDescriptor = new CheckoutButtonBehaviourDescriptor(CheckoutButtonBehaviourDescriptor.Type.PAY_NOW_BEHAVIOUR);
        }
        payPalContinueButton.updateCheckoutButton(str, checkoutButtonBehaviourDescriptor);
    }

    /* access modifiers changed from: private */
    public final void updateCheckoutButtonBackgroundColor(CheckoutButtonBehaviourDescriptor checkoutButtonBehaviourDescriptor, CheckoutButtonStyleEventModel checkoutButtonStyleEventModel) {
        if (checkoutButtonBehaviourDescriptor != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[checkoutButtonBehaviourDescriptor.getCheckoutButtonBehaviour().ordinal()];
            if (i == 1) {
                this.button.setColor(ActionButtonColor.GRAY);
            } else if (i == 2) {
                this.button.setColor(ActionButtonColor.BLUE);
            } else if (i == 3 && checkoutButtonStyleEventModel != null) {
                this.button.setColor(checkoutButtonStyleEventModel.getButtonColor());
                this.button.updateButtonText(checkoutButtonStyleEventModel.getButtonText());
                this.button.setContentDescription(checkoutButtonStyleEventModel.getButtonText());
                setVisibility((!checkoutButtonStyleEventModel.isVisible() || !getMainPaysheetViewModel().shouldPaymentButtonBeVisible()) ? 8 : 0);
            }
            this.buttonParentView.setBackgroundColor(getContainerBackgroundColor(checkoutButtonBehaviourDescriptor));
        }
    }

    public static /* synthetic */ void updateCheckoutButtonBackgroundColor$default(PayPalContinueButton payPalContinueButton, CheckoutButtonBehaviourDescriptor checkoutButtonBehaviourDescriptor, CheckoutButtonStyleEventModel checkoutButtonStyleEventModel, int i, Object obj) {
        if ((i & 2) != 0) {
            checkoutButtonStyleEventModel = null;
        }
        payPalContinueButton.updateCheckoutButtonBackgroundColor(checkoutButtonBehaviourDescriptor, checkoutButtonStyleEventModel);
    }

    /* access modifiers changed from: private */
    public final void updateCheckoutButtonRefreshStatus(boolean z) {
        if (z) {
            TextView textView = (TextView) this.button._$_findCachedViewById(C17165R.C17167id.buttonText);
            C19383o.m32796f(textView, "button.buttonText");
            textView.setVisibility(8);
            this.checkoutPb.setVisibility(0);
            return;
        }
        TextView textView2 = (TextView) this.button._$_findCachedViewById(C17165R.C17167id.buttonText);
        C19383o.m32796f(textView2, "button.buttonText");
        textView2.setVisibility(0);
        this.button.setVisibility(0);
        this.checkoutPb.setVisibility(8);
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

    public final ActionButtonShape getButtonShape() {
        return this.button.getShape();
    }

    public final String getButtonText() {
        return this.buttonText;
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

    public final PayPalCheckoutButtonClickedListener getPayPalCheckoutButtonClickedListener() {
        return this.payPalCheckoutButtonClickedListener;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public void initViewModelObservers() {
        C6467l lVar = new C6467l(this, 4);
        C6468m mVar = new C6468m(this, 5);
        C6469n nVar = new C6469n(this, 8);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, lVar);
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(componentActivity, mVar);
        getMainPaysheetViewModel().getContingencyEventsModel().observe(componentActivity, nVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.checkout_button_view) {
            if (this.isActionButtonClickEnabled) {
                if (this.isAddCardMode) {
                    Events.Companion.getInstance().fire(PayPalEventTypes.CHECKOUT_BUTTON_CLICKED, new Success(new CheckoutFinishedEventModel(this.isActionButtonClickEnabled, this.isAddCardMode)));
                } else if (!getCryptoViewModel().isCryptoPayment() || getCryptoViewModel().isCryptoCurrencyConsentAccepted()) {
                    PEnums.TransitionName transitionName = PEnums.TransitionName.PAYMENT_SUBMITTED;
                    PEnums.Outcome outcome = PEnums.Outcome.CLICKED;
                    PEnums.EventCode eventCode = PEnums.EventCode.E101;
                    PEnums.StateName stateName = PEnums.StateName.REVIEW;
                    boolean wasLsatTokenUpgraded = getMainPaysheetViewModel().wasLsatTokenUpgraded();
                    PLog.click$default(transitionName, outcome, eventCode, stateName, "LSAT_UPGRADED: " + wasLsatTokenUpgraded, "review_your_information_screen", "call_to_action_button_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
                    blockCTAButton();
                    getMainPaysheetViewModel().finalizeCheckout();
                }
            } else if (this.isInvalidShippingAddress) {
                PLog.click$default(PEnums.TransitionName.INVALID_SHIPPING_ADDRESS_CTA_BUTTON_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, "Invalid shipping address was selected", "review_your_information_screen", "call_to_action_button_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
                Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLAddressBookFragment.TAG, new PYPLAddressBookFragment())));
            } else if (this.isInvalidShippingMethod) {
                PLog.click$default(PEnums.TransitionName.INVALID_SHIPPING_METHOD_CTA_BUTTON_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, "Invalid shipping method was selected", "review_your_information_screen", "call_to_action_button_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
                Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLShippingMethodFragment.TAG, new PYPLShippingMethodFragment())));
            }
            PayPalCheckoutButtonClickedListener payPalCheckoutButtonClickedListener2 = this.payPalCheckoutButtonClickedListener;
            if (payPalCheckoutButtonClickedListener2 != null) {
                payPalCheckoutButtonClickedListener2.onCheckoutViewClicked();
            }
        }
    }

    public void removeListeners() {
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_UI_RENDER_REQUESTED;
        EventListener eventListener = this.renderActionButtonStyle;
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
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.CTA_LOADING_SPINNER;
                    EventListener eventListener4 = this.loadingSpinnerListener;
                    if (eventListener4 != null) {
                        instance4.removeListener(payPalEventTypes4, eventListener4);
                        Events instance5 = companion.getInstance();
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED;
                        EventListener eventListener5 = this.shippingChangeNewAddressListeners;
                        if (eventListener5 != null) {
                            instance5.removeListener(payPalEventTypes5, eventListener5);
                            Events instance6 = companion.getInstance();
                            PayPalEventTypes payPalEventTypes6 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_ADDRESS;
                            EventListener eventListener6 = this.shippingChangeInvalidAddressListeners;
                            if (eventListener6 != null) {
                                instance6.removeListener(payPalEventTypes6, eventListener6);
                                Events instance7 = companion.getInstance();
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_PENDING;
                                EventListener eventListener7 = this.shippingChangeRefreshPendingListeners;
                                if (eventListener7 != null) {
                                    instance7.removeListener(payPalEventTypes7, eventListener7);
                                    Events instance8 = companion.getInstance();
                                    PayPalEventTypes payPalEventTypes8 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_COMPLETED;
                                    EventListener eventListener8 = this.shippingChangeRefreshCompletedListeners;
                                    if (eventListener8 != null) {
                                        instance8.removeListener(payPalEventTypes8, eventListener8);
                                        Events instance9 = companion.getInstance();
                                        PayPalEventTypes payPalEventTypes9 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_METHOD;
                                        EventListener eventListener9 = this.shippingChangeInvalidShippingMethodListeners;
                                        if (eventListener9 != null) {
                                            instance9.removeListener(payPalEventTypes9, eventListener9);
                                            Events instance10 = companion.getInstance();
                                            PayPalEventTypes payPalEventTypes10 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
                                            EventListener eventListener10 = this.carouselCreditOfferListener;
                                            if (eventListener10 != null) {
                                                instance10.removeListener(payPalEventTypes10, eventListener10);
                                                Events instance11 = companion.getInstance();
                                                PayPalEventTypes payPalEventTypes11 = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
                                                EventListener eventListener11 = this.carouselPayInFourListener;
                                                if (eventListener11 != null) {
                                                    instance11.removeListener(payPalEventTypes11, eventListener11);
                                                    Events instance12 = companion.getInstance();
                                                    PayPalEventTypes payPalEventTypes12 = PayPalEventTypes.CTA_BTN_BLOCK_REQUEST;
                                                    EventListener eventListener12 = this.ctaButtonBlockRequestListener;
                                                    if (eventListener12 != null) {
                                                        instance12.removeListener(payPalEventTypes12, eventListener12);
                                                        Events instance13 = companion.getInstance();
                                                        PayPalEventTypes payPalEventTypes13 = PayPalEventTypes.FINISH_CHECKOUT;
                                                        EventListener eventListener13 = this.finishCheckoutListener;
                                                        if (eventListener13 != null) {
                                                            instance13.removeListener(payPalEventTypes13, eventListener13);
                                                            Events instance14 = companion.getInstance();
                                                            PayPalEventTypes payPalEventTypes14 = PayPalEventTypes.SCA_ON_CONTINGENCY_CLEARED;
                                                            EventListener eventListener14 = this.scaOnContingencyClearedListener;
                                                            if (eventListener14 != null) {
                                                                instance14.removeListener(payPalEventTypes14, eventListener14);
                                                            } else {
                                                                C19383o.m32805o("scaOnContingencyClearedListener");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C19383o.m32805o("finishCheckoutListener");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C19383o.m32805o("ctaButtonBlockRequestListener");
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
                                            C19383o.m32805o("shippingChangeInvalidShippingMethodListeners");
                                            throw null;
                                        }
                                    } else {
                                        C19383o.m32805o("shippingChangeRefreshCompletedListeners");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("shippingChangeRefreshPendingListeners");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("shippingChangeInvalidAddressListeners");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("shippingChangeNewAddressListeners");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("loadingSpinnerListener");
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
            C19383o.m32805o("renderActionButtonStyle");
            throw null;
        }
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalContinueButton(Context context, AttributeSet attributeSet, int i, String str, Fragment fragment, ActionButtonShape actionButtonShape, PayPalCheckoutButtonClickedListener payPalCheckoutButtonClickedListener2) {
        super(context, attributeSet, i);
        Context context2 = context;
        ActionButtonShape actionButtonShape2 = actionButtonShape;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(actionButtonShape2, "buttonShape");
        this._$_findViewCache = new LinkedHashMap();
        this.buttonText = str;
        this.payPalCheckoutButtonClickedListener = payPalCheckoutButtonClickedListener2;
        this.isAnchoredToBottomSheet = true;
        this.isActionButtonClickEnabled = true;
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
                    this.billingAgreementsViewModel$delegate = new C2868j0(C19386q.m32807a(BillingAgreementsViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$13);
                    SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$14 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                    if (z) {
                        this.cryptoViewModel$delegate = new C2868j0(C19386q.m32807a(CryptoViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$14);
                        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$15 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                        if (z) {
                            this.addCardViewModel$delegate = new C2868j0(C19386q.m32807a(AddCardViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$15);
                            this.addCardPosition = -1;
                            View.inflate(context2, C17165R.C17169layout.paypal_action_button, this);
                            View findViewById = findViewById(C17165R.C17167id.checkout_button_parent_view);
                            C19383o.m32796f(findViewById, "findViewById(R.id.checkout_button_parent_view)");
                            this.buttonParentView = (ConstraintLayout) findViewById;
                            View findViewById2 = findViewById(C17165R.C17167id.checkout_pb);
                            C19383o.m32796f(findViewById2, "findViewById(R.id.checkout_pb)");
                            this.checkoutPb = (ProgressBar) findViewById2;
                            View findViewById3 = findViewById(C17165R.C17167id.checkout_button_view);
                            C19383o.m32796f(findViewById3, "findViewById(R.id.checkout_button_view)");
                            PayPalActionButton payPalActionButton = (PayPalActionButton) findViewById3;
                            this.button = payPalActionButton;
                            payPalActionButton.setShape(actionButtonShape2);
                            payPalActionButton.updateButtonText(this.buttonText);
                            setOnClickListener();
                            initViewModelObservers();
                            initEvents();
                            this.nativeSSOListener = new PayPalContinueButton$nativeSSOListener$1(context2);
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
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
