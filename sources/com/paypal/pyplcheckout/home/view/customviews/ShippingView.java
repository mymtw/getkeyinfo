package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2364y;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.p327ui.conversation.list.ccm.C9580d;
import com.etsy.android.p327ui.user.purchases.C11669o;
import com.etsy.android.p327ui.user.review.C11709h;
import com.paypal.checkout.paymentbutton.C17143a;
import com.paypal.checkout.paymentbutton.C17144b;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17183a;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17185c;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17188f;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressBookFragment;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17199b;
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
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalShippingViewListener;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.Amount;
import com.paypal.pyplcheckout.pojo.Name;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.shippingmethods.view.fragments.PYPLShippingMethodFragment;
import com.paypal.pyplcheckout.utils.ExpandableView;
import com.paypal.pyplcheckout.utils.ExpandableViewHelper;
import com.paypal.pyplcheckout.utils.ExpandableViewState;
import com.paypal.pyplcheckout.utils.ExpandableViewTransitionProperties;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;

public final class ShippingView extends ConstraintLayout implements ContentView, ExpandableView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "ShippingView";
    private static final long VIEW_STATE_COLLAPSE_DELAY = 150;
    private static final long VIEW_STATE_COLLAPSE_DURATION = 250;
    private static final long VIEW_STATE_EXPAND_DELAY = 360;
    public Map<Integer, View> _$_findViewCache;
    private EventListener carouselAddCardListener;
    private EventListener carouselCreditOfferListener;
    private EventListener carouselFundingInstrumentListener;
    private EventListener carouselPayInFourListener;
    private EventListener checkoutButtonListener;
    private EventListener disableViewsTouchListener;
    /* access modifiers changed from: private */
    public final ExpandableViewHelper expandableViewHelper;
    private EventListener finalizeCheckoutListener;
    private final Fragment fragment;
    private TextView invalidShippingMethodTv;
    private TextView invalidShippingTv;
    private boolean mEnableShippingClick;
    private PayPalShippingViewListener mPayPalShippingViewListener;
    private RelativeLayout shipMethodContainer;
    private TextView shipToLine1Tv;
    private TextView shipToTv;
    private RelativeLayout shippingCL;
    private EventListener shippingChangeInvalidAddressListeners;
    private EventListener shippingChangeInvalidShippingMethodListeners;
    private EventListener shippingChangeNewAddressListeners;
    private EventListener shippingChangeRefreshCompletedListeners;
    private EventListener shippingChangeRefreshPendingListeners;
    private ImageView shippingIv;
    private TextView shippingMethodLoadingIndicatorTv;
    private TextView shippingMethodTv;
    private final C19285c viewExpandTransitionDuration$delegate;
    private final C19285c viewModel$delegate;

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
        Class<ShippingView> cls = ShippingView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShippingView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalShippingViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShippingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalShippingViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShippingView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalShippingViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShippingView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalShippingViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalShippingViewListener payPalShippingViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalShippingViewListener);
    }

    private final long getViewExpandTransitionDuration() {
        return ((Number) this.viewExpandTransitionDuration$delegate.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    public final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
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
                    setupShipping();
                    return;
                case 10:
                    if (contingencyEventsModel.isAddCardContingency()) {
                        setupShipping();
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
        this.checkoutButtonListener = new C17198a(this, 6);
        this.shippingChangeNewAddressListeners = new C17248l(this, 1);
        this.shippingChangeInvalidAddressListeners = new C17143a(this, 3);
        this.shippingChangeRefreshPendingListeners = new C17144b(this, 2);
        this.shippingChangeRefreshCompletedListeners = new C17199b(this, 2);
        this.shippingChangeInvalidShippingMethodListeners = new C17249m(this, 1);
        this.carouselCreditOfferListener = new C17185c(this, 2);
        this.carouselPayInFourListener = new C17246j(this, 2);
        ShippingView$initEvents$onFundingInstrumentSelected$1 shippingView$initEvents$onFundingInstrumentSelected$1 = new ShippingView$initEvents$onFundingInstrumentSelected$1(this);
        this.carouselAddCardListener = new C17252p(this, shippingView$initEvents$onFundingInstrumentSelected$1);
        this.carouselFundingInstrumentListener = new C17188f(shippingView$initEvents$onFundingInstrumentSelected$1, 3);
        this.finalizeCheckoutListener = new C17240d(this, 3);
        this.disableViewsTouchListener = new C17183a(this, 1);
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED;
            EventListener eventListener2 = this.shippingChangeNewAddressListeners;
            if (eventListener2 != null) {
                instance2.listen(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_ADDRESS;
                EventListener eventListener3 = this.shippingChangeInvalidAddressListeners;
                if (eventListener3 != null) {
                    instance3.listen(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_PENDING;
                    EventListener eventListener4 = this.shippingChangeRefreshPendingListeners;
                    if (eventListener4 != null) {
                        instance4.listen(payPalEventTypes4, eventListener4);
                        Events instance5 = companion.getInstance();
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_COMPLETED;
                        EventListener eventListener5 = this.shippingChangeRefreshCompletedListeners;
                        if (eventListener5 != null) {
                            instance5.listen(payPalEventTypes5, eventListener5);
                            Events instance6 = companion.getInstance();
                            PayPalEventTypes payPalEventTypes6 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_METHOD;
                            EventListener eventListener6 = this.shippingChangeInvalidShippingMethodListeners;
                            if (eventListener6 != null) {
                                instance6.listen(payPalEventTypes6, eventListener6);
                                Events instance7 = companion.getInstance();
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
                                EventListener eventListener7 = this.carouselCreditOfferListener;
                                if (eventListener7 != null) {
                                    instance7.listen(payPalEventTypes7, eventListener7);
                                    Events instance8 = companion.getInstance();
                                    PayPalEventTypes payPalEventTypes8 = PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED;
                                    EventListener eventListener8 = this.carouselAddCardListener;
                                    if (eventListener8 != null) {
                                        instance8.listen(payPalEventTypes8, eventListener8);
                                        Events instance9 = companion.getInstance();
                                        PayPalEventTypes payPalEventTypes9 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                                        EventListener eventListener9 = this.carouselFundingInstrumentListener;
                                        if (eventListener9 != null) {
                                            instance9.listen(payPalEventTypes9, eventListener9);
                                            Events instance10 = companion.getInstance();
                                            PayPalEventTypes payPalEventTypes10 = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
                                            EventListener eventListener10 = this.carouselPayInFourListener;
                                            if (eventListener10 != null) {
                                                instance10.listen(payPalEventTypes10, eventListener10);
                                                Events instance11 = companion.getInstance();
                                                PayPalEventTypes payPalEventTypes11 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                                                EventListener eventListener11 = this.finalizeCheckoutListener;
                                                if (eventListener11 != null) {
                                                    instance11.listen(payPalEventTypes11, eventListener11);
                                                    Events instance12 = companion.getInstance();
                                                    PayPalEventTypes payPalEventTypes12 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                                                    EventListener eventListener12 = this.disableViewsTouchListener;
                                                    if (eventListener12 != null) {
                                                        instance12.listen(payPalEventTypes12, eventListener12);
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
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-10  reason: not valid java name */
    public static final void m35377initEvents$lambda10(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ShippingAddress value = shippingView.getViewModel().getSelectedShippingAddress().getValue();
        shippingView.updateShippingErrorStatus(true, value == null ? null : value.getFullAddress());
        shippingView.setShippingMethodLoadingIndicator(shippingView.getViewModel().getSelectedShippingMethod().getValue(), true, true);
        shippingView.mEnableShippingClick = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-11  reason: not valid java name */
    public static final void m35378initEvents$lambda11(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ShippingAddress value = shippingView.getViewModel().getSelectedShippingAddress().getValue();
        shippingView.updateShippingErrorStatus(true, value == null ? null : value.getFullAddress());
        shippingView.updateShippingMethod(shippingView.getViewModel().getSelectedShippingMethod().getValue(), true, true);
        shippingView.mEnableShippingClick = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-12  reason: not valid java name */
    public static final void m35379initEvents$lambda12(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        shippingView.updateShippingMethod(shippingView.getViewModel().getSelectedShippingMethod().getValue(), true, false);
        shippingView.mEnableShippingClick = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-13  reason: not valid java name */
    public static final void m35380initEvents$lambda13(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ExpandableViewHelper.updateViewExpansionState$default(shippingView.expandableViewHelper, shippingView, ExpandableViewState.Collapsed, (C19846a) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-14  reason: not valid java name */
    public static final void m35381initEvents$lambda14(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ExpandableViewHelper.updateViewExpansionState$default(shippingView.expandableViewHelper, shippingView, ExpandableViewState.Collapsed, (C19846a) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-15  reason: not valid java name */
    public static final void m35382initEvents$lambda15(ShippingView shippingView, C19846a aVar, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(aVar, "$onFundingInstrumentSelected");
        C19383o.m32797g(eventType, "$noName_0");
        CardUiModel.AddCardUiModel addCardUiModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        AddCardViewStateUpdateEvent addCardViewStateUpdateEvent = data instanceof AddCardViewStateUpdateEvent ? (AddCardViewStateUpdateEvent) data : null;
        if (addCardViewStateUpdateEvent != null) {
            addCardUiModel = addCardViewStateUpdateEvent.getAddCard();
        }
        if (addCardUiModel instanceof CardUiModel.AddCardUiModel.Native) {
            shippingView.expandableViewHelper.updateViewExpansionState(shippingView, ExpandableViewState.Collapsed, new ShippingView$initEvents$9$1(shippingView));
        } else if (addCardUiModel instanceof CardUiModel.AddCardUiModel.Web) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-16  reason: not valid java name */
    public static final void m35383initEvents$lambda16(C19846a aVar, EventType eventType, ResultData resultData) {
        C19383o.m32797g(aVar, "$onFundingInstrumentSelected");
        C19383o.m32797g(eventType, "$noName_0");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-17  reason: not valid java name */
    public static final void m35384initEvents$lambda17(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        shippingView.shippingCL.setClickable(true);
        shippingView.shipMethodContainer.setClickable(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-18  reason: not valid java name */
    public static final void m35385initEvents$lambda18(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        shippingView.shippingCL.setClickable(false);
        shippingView.shipMethodContainer.setClickable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-7  reason: not valid java name */
    public static final void m35386initEvents$lambda7(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CheckoutFinishedEventModel checkoutFinishedEventModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CheckoutFinishedEventModel) {
            checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
        }
        if (checkoutFinishedEventModel != null && checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
            shippingView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-8  reason: not valid java name */
    public static final void m35387initEvents$lambda8(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ShippingAddress value = shippingView.getViewModel().getSelectedShippingAddress().getValue();
        shippingView.updateShippingErrorStatus(true, value == null ? null : value.getFullAddress());
        shippingView.updateShippingMethod(shippingView.getViewModel().getSelectedShippingMethod().getValue(), false, true);
        shippingView.mEnableShippingClick = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-9  reason: not valid java name */
    public static final void m35388initEvents$lambda9(ShippingView shippingView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ShippingAddress value = shippingView.getViewModel().getSelectedShippingAddress().getValue();
        shippingView.updateShippingErrorStatus(false, value == null ? null : value.getFullAddress());
        shippingView.updateShippingMethod(shippingView.getViewModel().getSelectedShippingMethod().getValue(), true, true);
        shippingView.mEnableShippingClick = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35389initViewModelObservers$lambda0(ShippingView shippingView, Boolean bool) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && shippingView.getViewModel().getContingencyEventsModel().getValue() == null) {
            shippingView.setupShipping();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35390initViewModelObservers$lambda1(ShippingView shippingView, ShippingAddress shippingAddress) {
        C19383o.m32797g(shippingView, "this$0");
        shippingView.updateSelectedShippingAddress(shippingAddress);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35391initViewModelObservers$lambda2(ShippingView shippingView, ShippingMethods shippingMethods) {
        C19383o.m32797g(shippingView, "this$0");
        shippingView.updateShippingMethod(shippingMethods, true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35392initViewModelObservers$lambda3(ShippingView shippingView, Boolean bool) {
        C19383o.m32797g(shippingView, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            shippingView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-4  reason: not valid java name */
    public static final void m35393initViewModelObservers$lambda4(ShippingView shippingView, Boolean bool) {
        C19383o.m32797g(shippingView, "this$0");
        shippingView.setFocusForAccessibilityAnnouncement();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-6  reason: not valid java name */
    public static final void m35394initViewModelObservers$lambda6(ShippingView shippingView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(shippingView, "this$0");
        if (contingencyEventsModel != null) {
            shippingView.handleContingencyEvent(contingencyEventsModel);
        }
    }

    private final void setAddressLine1(String str) {
        this.shipToLine1Tv.setText(str);
    }

    private final void setFocusForAccessibilityAnnouncement() {
        if (!getViewModel().isPayPalConversionShownFromRepo()) {
            this.shippingCL.requestFocus();
            this.shippingCL.sendAccessibilityEvent(8);
        }
    }

    private final void setOnClickListener() {
        this.shippingCL.setOnClickListener(this);
        this.shipMethodContainer.setOnClickListener(this);
    }

    private final void setShippingMethodLoadingIndicator(ShippingMethods shippingMethods, boolean z, boolean z2) {
        int i = 8;
        if (shippingMethods == null) {
            this.shipMethodContainer.setVisibility(8);
        } else if (shippingMethods.getType() == ShippingMethodType.Type.SHIPPING) {
            this.shippingMethodTv.setVisibility(8);
            this.shippingMethodLoadingIndicatorTv.setVisibility(0);
            this.shippingMethodLoadingIndicatorTv.setText(getResources().getString(C17165R.string.paypal_checkout_loading_shipping_method));
            this.shipMethodContainer.setVisibility(z ? 0 : 8);
            TextView textView = this.invalidShippingMethodTv;
            if (!z2) {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    private final void setShippingName(String str) {
        TextView textView = this.shipToTv;
        String string = getResources().getString(C17165R.string.paypal_checkout_ship_to);
        textView.setText(string + " " + str);
        PLog.impression$default(PEnums.TransitionName.SHIPPING_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.SHIPPING, (String) null, "review_your_information_screen", "shipping_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PayPalShippingViewListener payPalShippingViewListener = this.mPayPalShippingViewListener;
        if (payPalShippingViewListener != null) {
            payPalShippingViewListener.onShippingNameUpdated();
        }
    }

    private final void setupShipping() {
        updateMainShippingAddress(getViewModel().getFullName(), getViewModel().getLine1());
        setVisibility(getViewModel().shouldShowShipping() ? 0 : 8);
        setClickable(getViewModel().allowShippingAddressChange());
    }

    private final void updateMainShippingAddress(String str, String str2) {
        PEnums.TransitionName transitionName = PEnums.TransitionName.SHIPPING_ADDRESS_UPDATED;
        PEnums.Outcome outcome = PEnums.Outcome.SHOWN;
        PEnums.EventCode eventCode = PEnums.EventCode.E103;
        PEnums.StateName stateName = PEnums.StateName.SHIPPING;
        PLog.impression$default(transitionName, outcome, eventCode, stateName, (String) null, "review_your_information_screen", "shipping_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.click$default(PEnums.TransitionName.SHIPPING_ADDRESS_SELECTED, PEnums.Outcome.CLICKED, PEnums.EventCode.E138, stateName, (String) null, "review_your_information_screen", "shipping_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        setShippingName(str);
        setAddressLine1(str2);
        C2364y.m5201p(this.shippingCL, new ShippingView$updateMainShippingAddress$1(this));
    }

    private final void updateSelectedShippingAddress(ShippingAddress shippingAddress) {
        if (shippingAddress != null) {
            Name name = shippingAddress.getName();
            if (TextUtils.isEmpty(name.getFullName())) {
                setShippingName((String) null);
            } else {
                setShippingName(name.getFullName());
            }
            updateMainShippingAddress(name.getFullName(), shippingAddress.getFullAddress());
        }
    }

    private final void updateShippingErrorStatus(boolean z, String str) {
        this.shippingIv.setImageResource(C17165R.C17166drawable.ic_newtruck);
        if (z) {
            setAddressLine1(str);
            this.invalidShippingTv.setVisibility(8);
            this.shipToLine1Tv.setVisibility(0);
            return;
        }
        this.invalidShippingTv.setText(getResources().getString(C17165R.string.f37654xd99986a3));
        this.invalidShippingTv.setVisibility(0);
        this.shipToLine1Tv.setVisibility(8);
    }

    private final void updateShippingMethod(ShippingMethods shippingMethods, boolean z, boolean z2) {
        int i = 8;
        if (shippingMethods == null) {
            this.shipMethodContainer.setVisibility(8);
            return;
        }
        String str = null;
        if (shippingMethods.getType() == ShippingMethodType.Type.SHIPPING) {
            this.shippingMethodLoadingIndicatorTv.setVisibility(8);
            this.shippingMethodTv.setVisibility(0);
            TextView textView = this.shippingMethodTv;
            Object[] objArr = new Object[2];
            Amount amount = shippingMethods.getAmount();
            if (amount != null) {
                str = amount.getCurrencyFormat();
            }
            objArr[0] = str;
            objArr[1] = shippingMethods.getLabel();
            String format = String.format("%s - %s", Arrays.copyOf(objArr, 2));
            C19383o.m32796f(format, "format(format, *args)");
            textView.setText(format);
            this.shipMethodContainer.setVisibility((!z || this.shippingMethodLoadingIndicatorTv.getVisibility() == 0) ? 8 : 0);
            TextView textView2 = this.invalidShippingMethodTv;
            if (!z2) {
                i = 0;
            }
            textView2.setVisibility(i);
            return;
        }
        TextView textView3 = this.shipToTv;
        Object[] objArr2 = new Object[2];
        Amount amount2 = shippingMethods.getAmount();
        if (amount2 != null) {
            str = amount2.getCurrencyFormat();
        }
        objArr2[0] = str;
        objArr2[1] = shippingMethods.getLabel();
        String format2 = String.format("%s - %s", Arrays.copyOf(objArr2, 2));
        C19383o.m32796f(format2, "format(format, *args)");
        textView3.setText(format2);
        if (z2) {
            this.shipToLine1Tv.setText(getContext().getString(C17165R.string.paypal_checkout_more_info));
            this.shipToLine1Tv.setVisibility(0);
            this.invalidShippingTv.setVisibility(8);
        } else {
            this.invalidShippingTv.setText(getResources().getString(C17165R.string.f37655xd8696045));
            this.shipToLine1Tv.setVisibility(8);
            this.invalidShippingTv.setVisibility(0);
        }
        this.shipMethodContainer.setVisibility(8);
        this.shippingIv.setImageResource(C17165R.C17166drawable.ic_pick_up);
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

    public final Fragment getFragment() {
        return this.fragment;
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
        if (!C19383o.m32792b(view, this)) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[expandableViewState.ordinal()];
        if (i == 1) {
            return new ExpandableViewTransitionProperties(VIEW_STATE_EXPAND_DELAY, getViewExpandTransitionDuration());
        }
        if (i == 2) {
            return new ExpandableViewTransitionProperties(VIEW_STATE_COLLAPSE_DELAY, VIEW_STATE_COLLAPSE_DURATION);
        }
        throw new NoWhenBranchMatchedException();
    }

    public void initViewModelObservers() {
        C11669o oVar = new C11669o(this, 2);
        C9580d dVar = new C9580d(this, 6);
        C11709h hVar = new C11709h(this, 5);
        C6456a aVar = new C6456a(this, 11);
        C6457b bVar = new C6457b(this, 8);
        C10077j jVar = new C10077j(this, 8);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, oVar);
        getViewModel().getLogoutCompletedFlag().observe(componentActivity, aVar);
        getViewModel().getSelectedShippingAddress().observe(componentActivity, dVar);
        getViewModel().getSelectedShippingMethod().observe(componentActivity, hVar);
        getViewModel().getPaymentSourceCardViewClickedFlag().observe(componentActivity, bVar);
        getViewModel().getContingencyEventsModel().observe(componentActivity, jVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        int id = view.getId();
        if (id == C17165R.C17167id.shipping_info_container) {
            if (this.mEnableShippingClick) {
                ShippingMethodType value = getViewModel().getSupportedShippingMethodType().getValue();
                if ((value == null ? null : value.getShippingMethodType()) == ShippingMethodType.Type.PICKUP) {
                    Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLShippingMethodFragment.TAG, new PYPLShippingMethodFragment())));
                }
                if (getViewModel().isShippingAddressChangeEnabled()) {
                    Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLAddressBookFragment.TAG, new PYPLAddressBookFragment())));
                    PLog.click$default(PEnums.TransitionName.SHIPPING_CHANGE_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "shipping_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
                    PLog.m28728dR(HomeFragment.TAG, "Shipping View Clicked, Payment bottom sheet should be hidden");
                    PLog.info(PEnums.LogType.FPTI, "selectaddress");
                } else {
                    PLog.click$default(PEnums.TransitionName.SHIPPING_CHANGE_TAPPED_FAILED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "shipping_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
                }
                PayPalShippingViewListener payPalShippingViewListener = this.mPayPalShippingViewListener;
                if (payPalShippingViewListener != null) {
                    payPalShippingViewListener.onShippingViewClickListener();
                }
            }
        } else if (id == C17165R.C17167id.shipping_method_container) {
            Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLShippingMethodFragment.TAG, new PYPLShippingMethodFragment())));
            PLog.click$default(PEnums.TransitionName.SHIPPING_OPTION_CHANGE_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "shipping_method_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            PLog.m28728dR(HomeFragment.TAG, "Shipping Method Clicked, Payment bottom sheet should be hidden");
            PLog.info("selectShippingMethod");
            PayPalShippingViewListener payPalShippingViewListener2 = this.mPayPalShippingViewListener;
            if (payPalShippingViewListener2 != null) {
                payPalShippingViewListener2.onShippingMethodClickListener();
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
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED;
            EventListener eventListener2 = this.shippingChangeNewAddressListeners;
            if (eventListener2 != null) {
                instance2.removeListener(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_ADDRESS;
                EventListener eventListener3 = this.shippingChangeInvalidAddressListeners;
                if (eventListener3 != null) {
                    instance3.removeListener(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_PENDING;
                    EventListener eventListener4 = this.shippingChangeRefreshPendingListeners;
                    if (eventListener4 != null) {
                        instance4.removeListener(payPalEventTypes4, eventListener4);
                        Events instance5 = companion.getInstance();
                        PayPalEventTypes payPalEventTypes5 = PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_COMPLETED;
                        EventListener eventListener5 = this.shippingChangeRefreshCompletedListeners;
                        if (eventListener5 != null) {
                            instance5.removeListener(payPalEventTypes5, eventListener5);
                            Events instance6 = companion.getInstance();
                            PayPalEventTypes payPalEventTypes6 = PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_METHOD;
                            EventListener eventListener6 = this.shippingChangeInvalidShippingMethodListeners;
                            if (eventListener6 != null) {
                                instance6.removeListener(payPalEventTypes6, eventListener6);
                                Events instance7 = companion.getInstance();
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED;
                                EventListener eventListener7 = this.carouselCreditOfferListener;
                                if (eventListener7 != null) {
                                    instance7.removeListener(payPalEventTypes7, eventListener7);
                                    Events instance8 = companion.getInstance();
                                    PayPalEventTypes payPalEventTypes8 = PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED;
                                    EventListener eventListener8 = this.carouselPayInFourListener;
                                    if (eventListener8 != null) {
                                        instance8.removeListener(payPalEventTypes8, eventListener8);
                                        Events instance9 = companion.getInstance();
                                        PayPalEventTypes payPalEventTypes9 = PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED;
                                        EventListener eventListener9 = this.carouselAddCardListener;
                                        if (eventListener9 != null) {
                                            instance9.removeListener(payPalEventTypes9, eventListener9);
                                            Events instance10 = companion.getInstance();
                                            PayPalEventTypes payPalEventTypes10 = PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED;
                                            EventListener eventListener10 = this.carouselFundingInstrumentListener;
                                            if (eventListener10 != null) {
                                                instance10.removeListener(payPalEventTypes10, eventListener10);
                                                Events instance11 = companion.getInstance();
                                                PayPalEventTypes payPalEventTypes11 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                                                EventListener eventListener11 = this.finalizeCheckoutListener;
                                                if (eventListener11 != null) {
                                                    instance11.removeListener(payPalEventTypes11, eventListener11);
                                                    Events instance12 = companion.getInstance();
                                                    PayPalEventTypes payPalEventTypes12 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                                                    EventListener eventListener12 = this.disableViewsTouchListener;
                                                    if (eventListener12 != null) {
                                                        instance12.removeListener(payPalEventTypes12, eventListener12);
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
                                            C19383o.m32805o("carouselAddCardListener");
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
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalShippingViewListener payPalShippingViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        this.mEnableShippingClick = true;
        this.expandableViewHelper = new ExpandableViewHelper(this);
        this.viewExpandTransitionDuration$delegate = C19350d.m32677b(new ShippingView$viewExpandTransitionDuration$2(this));
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_shipping_view, this);
            this.mPayPalShippingViewListener = payPalShippingViewListener;
            View findViewById = findViewById(C17165R.C17167id.shipping_info_iv);
            C19383o.m32796f(findViewById, "findViewById(R.id.shipping_info_iv)");
            this.shippingIv = (ImageView) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.shipping_info_container);
            C19383o.m32796f(findViewById2, "findViewById(R.id.shipping_info_container)");
            this.shippingCL = (RelativeLayout) findViewById2;
            View findViewById3 = findViewById(C17165R.C17167id.ship_to_tv);
            C19383o.m32796f(findViewById3, "findViewById(R.id.ship_to_tv)");
            this.shipToTv = (TextView) findViewById3;
            View findViewById4 = findViewById(C17165R.C17167id.ship_to_address_line_one_tv);
            C19383o.m32796f(findViewById4, "findViewById(R.id.ship_to_address_line_one_tv)");
            this.shipToLine1Tv = (TextView) findViewById4;
            View findViewById5 = findViewById(C17165R.C17167id.invalid_shipping_tv);
            C19383o.m32796f(findViewById5, "findViewById(R.id.invalid_shipping_tv)");
            this.invalidShippingTv = (TextView) findViewById5;
            View findViewById6 = findViewById(C17165R.C17167id.invalid_shipping_method_tv);
            C19383o.m32796f(findViewById6, "findViewById(R.id.invalid_shipping_method_tv)");
            this.invalidShippingMethodTv = (TextView) findViewById6;
            View findViewById7 = findViewById(C17165R.C17167id.shipping_method_loading_tv);
            C19383o.m32796f(findViewById7, "findViewById(R.id.shipping_method_loading_tv)");
            this.shippingMethodLoadingIndicatorTv = (TextView) findViewById7;
            View findViewById8 = findViewById(C17165R.C17167id.shipping_method_container);
            C19383o.m32796f(findViewById8, "findViewById(R.id.shipping_method_container)");
            this.shipMethodContainer = (RelativeLayout) findViewById8;
            View findViewById9 = findViewById(C17165R.C17167id.shipping_method_tv);
            C19383o.m32796f(findViewById9, "findViewById(R.id.shipping_method_tv)");
            this.shippingMethodTv = (TextView) findViewById9;
            setVisibility(8);
            setOnClickListener();
            initEvents();
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
