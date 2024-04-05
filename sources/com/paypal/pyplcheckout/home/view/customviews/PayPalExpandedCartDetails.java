package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.conversation.details.ccm.C9499h;
import com.etsy.android.p327ui.conversation.details.ccm.C9500i;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17188f;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17189g;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17190h;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
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
import com.paypal.pyplcheckout.events.model.CheckoutFinishedEventModel;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17224a;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.home.view.adapters.CartItemsAdapter;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalExpandedCartDetailsViewListener;
import com.paypal.pyplcheckout.home.viewmodel.CartViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.Item;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;

@SuppressLint({"ViewConstructor"})
public final class PayPalExpandedCartDetails extends LinearLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalExpandedCartDetails";
    public Map<Integer, View> _$_findViewCache;
    private TextView arrowTv;
    private LinearLayout cartDetailsLayout;
    private RecyclerView cartItemRv;
    private CartItemsAdapter cartItemsAdapter;
    private final List<Item> cartItemsList;
    private LinearLayout cartListParentLayout;
    private final C19285c cartViewModel$delegate;
    private EventListener checkoutButtonListener;
    private EventListener disableViewsTouchListener;
    private TextView discountLabel;
    private boolean enableCartDetailsArrow;
    private EventListener finalizeCheckoutListener;
    private TextView grandTotalAmountTv;
    private TextView insuranceAmountTv;
    private TextView insuranceLabel;
    private final boolean isAnchoredToBottomSheet;
    private RelativeLayout lineItemList;
    private int lineItemViewState;
    private boolean mEnableArrowClick;
    private final C19285c mainPaysheetViewModel$delegate;
    private TextView overCaptureTv;
    private PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener;
    private TextView shippingAndHandlingAmountTv;
    private EventListener shippingChangeInvalidAddressListeners;
    private EventListener shippingChangeInvalidShippingMethodListeners;
    private EventListener shippingChangeNewAddressListeners;
    private EventListener shippingChangeRefreshCompletedListeners;
    private EventListener shippingChangeRefreshPendingListeners;
    private TextView shippingDiscountAmountTv;
    private TextView subTotalAmountTv;
    private TextView subtotalLabel;
    private TextView taxAmountTv;
    private TextView taxLabelTv;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalExpandedCartDetails.TAG;
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
        Class<PayPalExpandedCartDetails> cls = PayPalExpandedCartDetails.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalExpandedCartDetails(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalExpandedCartDetailsViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalExpandedCartDetails(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalExpandedCartDetailsViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalExpandedCartDetails(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalExpandedCartDetailsViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalExpandedCartDetails(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        this(context, attributeSet, i, fragment, (PayPalExpandedCartDetailsViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalExpandedCartDetails(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment, (i2 & 16) != 0 ? null : payPalExpandedCartDetailsViewListener2);
    }

    private final CartViewModel getCartViewModel() {
        return (CartViewModel) this.cartViewModel$delegate.getValue();
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
                    setVisibility(8);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    initExpandCardDetailsViewInfo();
                    return;
                case 10:
                    if (contingencyEventsModel.isAddCardContingency()) {
                        initExpandCardDetailsViewInfo();
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

    private final void initCartItemsRecyclerView() {
        RecyclerView recyclerView = this.cartItemRv;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        CartItemsAdapter cartItemsAdapter2 = new CartItemsAdapter(this.cartItemsList);
        this.cartItemsAdapter = cartItemsAdapter2;
        this.cartItemRv.setAdapter(cartItemsAdapter2);
    }

    private final void initEvents() {
        this.checkoutButtonListener = new C17247k(this, 1);
        this.shippingChangeNewAddressListeners = new C17188f(this, 2);
        this.shippingChangeInvalidAddressListeners = new C17189g(this, 3);
        this.shippingChangeRefreshPendingListeners = new C17190h(this, 3);
        this.shippingChangeRefreshCompletedListeners = new C17224a(this, 2);
        this.shippingChangeInvalidShippingMethodListeners = new C17193a(this, 4);
        this.finalizeCheckoutListener = new C17225b(this, 3);
        this.disableViewsTouchListener = new C17203a(this, 4);
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
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                                EventListener eventListener7 = this.finalizeCheckoutListener;
                                if (eventListener7 != null) {
                                    instance7.listen(payPalEventTypes7, eventListener7);
                                    Events instance8 = companion.getInstance();
                                    PayPalEventTypes payPalEventTypes8 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                                    EventListener eventListener8 = this.disableViewsTouchListener;
                                    if (eventListener8 != null) {
                                        instance8.listen(payPalEventTypes8, eventListener8);
                                    } else {
                                        C19383o.m32805o("disableViewsTouchListener");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("finalizeCheckoutListener");
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
    public static final void m35321initEvents$lambda10(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExpandedCartDetails.arrowTv.setClickable(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-11  reason: not valid java name */
    public static final void m35322initEvents$lambda11(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExpandedCartDetails.arrowTv.setClickable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-4  reason: not valid java name */
    public static final void m35323initEvents$lambda4(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CheckoutFinishedEventModel checkoutFinishedEventModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CheckoutFinishedEventModel) {
            checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
        }
        if (checkoutFinishedEventModel != null && checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
            payPalExpandedCartDetails.cartDetailsLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-5  reason: not valid java name */
    public static final void m35324initEvents$lambda5(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExpandedCartDetails.arrowTv.setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-6  reason: not valid java name */
    public static final void m35325initEvents$lambda6(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExpandedCartDetails.arrowTv.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-7  reason: not valid java name */
    public static final void m35326initEvents$lambda7(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExpandedCartDetails.arrowTv.setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-8  reason: not valid java name */
    public static final void m35327initEvents$lambda8(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExpandedCartDetails.arrowTv.setVisibility((payPalExpandedCartDetails.getCartViewModel().isContinueCartExperiment() || payPalExpandedCartDetails.getCartViewModel().isCartTotalVisible() || payPalExpandedCartDetails.getCartViewModel().shouldShowOverCaptureAmount()) ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-9  reason: not valid java name */
    public static final void m35328initEvents$lambda9(PayPalExpandedCartDetails payPalExpandedCartDetails, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExpandedCartDetails.arrowTv.setVisibility(0);
    }

    private final void initExpandCardDetailsViewInfo() {
        setVisibility(0);
        setupCart();
    }

    private final void initOverCaptureText() {
        if (getCartViewModel().shouldShowOverCaptureAmount()) {
            this.overCaptureTv.setVisibility(0);
            setVisibility(0);
            PLog.impression$default(PEnums.TransitionName.SHOWING_OVER_CAPTURE, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.OVER_CAPTURE, "Displaying over capture", "review_your_information_screen", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
            shouldExpandOverCaptureText(false);
            return;
        }
        this.overCaptureTv.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35329initViewModelObservers$lambda0(PayPalExpandedCartDetails payPalExpandedCartDetails, Boolean bool) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && payPalExpandedCartDetails.getMainPaysheetViewModel().getContingencyEventsModel().getValue() == null) {
            payPalExpandedCartDetails.initExpandCardDetailsViewInfo();
            payPalExpandedCartDetails.initOverCaptureText();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35330initViewModelObservers$lambda1(PayPalExpandedCartDetails payPalExpandedCartDetails, Boolean bool) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            payPalExpandedCartDetails.arrowTv.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35331initViewModelObservers$lambda3(PayPalExpandedCartDetails payPalExpandedCartDetails, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalExpandedCartDetails, "this$0");
        if (contingencyEventsModel != null) {
            payPalExpandedCartDetails.handleContingencyEvent(contingencyEventsModel);
        }
    }

    private final void setAmountText(String str) {
        this.arrowTv.setText(str);
    }

    private final void setArrowContainerVisibility(int i) {
        this.arrowTv.setVisibility(i);
    }

    private final void setArrowState(int i) {
        this.arrowTv.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    private final void setEnableCartDetailsArrow(boolean z) {
        this.enableCartDetailsArrow = z;
    }

    private final void setLineItemViewState(int i) {
        this.lineItemViewState = i;
    }

    private final void setOnClickListener() {
        this.arrowTv.setOnClickListener(this);
    }

    private final void setTvText(TextView textView, TextView textView2, String str) {
        setVisibility(textView, str);
        setVisibility(textView2, str);
        textView.setText(str);
    }

    private final void setUpInvoiceSummaryView(String str, String str2, String str3, String str4, String str5, boolean z, String str6, List<String> list) {
        String str7 = str4;
        boolean z2 = z;
        setTvText(this.insuranceAmountTv, this.insuranceLabel, str);
        setTvText(this.taxAmountTv, this.taxLabelTv, str2);
        setTvText(this.subTotalAmountTv, this.subtotalLabel, str3, list);
        setTvText(this.shippingDiscountAmountTv, this.discountLabel, str6);
        this.shippingAndHandlingAmountTv.setText(str5);
        this.grandTotalAmountTv.setText(str7);
        setAmountText(str7);
        this.mEnableArrowClick = z2;
        PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener2 = this.payPalExpandedCartDetailsViewListener;
        if (payPalExpandedCartDetailsViewListener2 != null) {
            payPalExpandedCartDetailsViewListener2.setUpInvoiceSummaryTotal(str7 + " ", z2);
        }
        PLog.impression$default(PEnums.TransitionName.INVOICE_SUMMARY_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "cart_details_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    private final void setUpPayNowMode(List<Item> list) {
        this.cartItemsList.clear();
        if (list != null) {
            this.cartItemsList.addAll(list);
        }
        CartItemsAdapter cartItemsAdapter2 = this.cartItemsAdapter;
        if (cartItemsAdapter2 != null) {
            cartItemsAdapter2.notifyDataSetChanged();
        }
        List<Item> list2 = this.cartItemsList;
        if (!(list2 == null || list2.isEmpty())) {
            this.cartItemRv.setVisibility(0);
        }
        PLog.impression$default(PEnums.TransitionName.CART_DETAILS_ARROW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "cart_details_arrow", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    private final void setVisibility(TextView textView, String str) {
        textView.setVisibility(PYPLCheckoutUtils.Companion.getInstance().isZeroString(str) ? 8 : 0);
    }

    private final void setupCart() {
        int i = 0;
        this.lineItemViewState = 0;
        if (!getCartViewModel().isContinueCartExperiment() && !getCartViewModel().isCartTotalVisible() && !getCartViewModel().shouldShowOverCaptureAmount()) {
            i = 8;
        }
        setArrowContainerVisibility(i);
        setUpPayNowMode(getCartViewModel().getListOfCartItems());
        setEnableCartDetailsArrow(this.mEnableArrowClick);
        setLineItemViewState(this.lineItemViewState);
        setUpInvoiceSummaryView(getCartViewModel().getInsurance(), getCartViewModel().getTax(), getCartViewModel().getSubTotal(), getCartViewModel().getGrandTotal(), getCartViewModel().getShippingAndHandling(), this.mEnableArrowClick, getCartViewModel().getShippingDiscount(), getCartViewModel().getItemNamesList());
    }

    private final void shouldExpandOverCaptureText(boolean z) {
        String str;
        String totalOverCaptureAmount = getCartViewModel().getTotalOverCaptureAmount();
        TextView textView = this.overCaptureTv;
        if (!z) {
            str = getResources().getString(C17165R.string.paypal_overcapture_collapsed_text, new Object[]{totalOverCaptureAmount});
        } else if (getCartViewModel().shouldShowShortOverCaptureText()) {
            str = getResources().getString(C17165R.string.paypal_overcapture_expanded_details_short_text, new Object[]{totalOverCaptureAmount});
        } else {
            str = getResources().getString(C17165R.string.paypal_overcapture_expanded_details_long_text, new Object[]{totalOverCaptureAmount});
        }
        textView.setText(str);
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

    public final TextView getCartArrowTv() {
        return this.arrowTv;
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

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public final void hideArrow() {
        this.arrowTv.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void initViewModelObservers() {
        C9498g gVar = new C9498g(this, 9);
        C9499h hVar = new C9499h(this, 6);
        C9500i iVar = new C9500i(this, 6);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, gVar);
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(componentActivity, hVar);
        getMainPaysheetViewModel().getContingencyEventsModel().observe(componentActivity, iVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        int i;
        int i2;
        View view2 = view;
        C19383o.m32797g(view2, "view");
        if (view.getId() == C17165R.C17167id.show_product_details_arrow) {
            PEnums.TransitionName transitionName = PEnums.TransitionName.CLICKED_TO_EXPAND_PROD_DETS;
            PEnums.Outcome outcome = PEnums.Outcome.CLICKED;
            PEnums.EventCode eventCode = PEnums.EventCode.E101;
            PEnums.StateName stateName = PEnums.StateName.REVIEW;
            PLog.impression$default(transitionName, outcome, eventCode, stateName, "review_your_information_screen", "cart_details_arrow", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
            if (this.lineItemViewState == 0) {
                shouldExpandOverCaptureText(true);
                setArrowState(C17165R.C17166drawable.ic_expand_close);
                PLog.impression$default(PEnums.TransitionName.EXPANDED_PROD_DETAILS_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, stateName, "review_your_information_screen", "product_details_view", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
                i = 0;
                i2 = 1;
            } else {
                shouldExpandOverCaptureText(false);
                i = 0;
                i2 = 1;
                PLog.impression$default(PEnums.TransitionName.CLICKED_TO_MIN_PROD_DETS, outcome, PEnums.EventCode.E103, stateName, "review_your_information_screen", "cart_details_arrow", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
                setArrowState(C17165R.C17166drawable.ic_expand_open);
            }
            int i3 = this.lineItemViewState;
            int i4 = i3 == 0 ? i2 : i;
            PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener2 = this.payPalExpandedCartDetailsViewListener;
            if (payPalExpandedCartDetailsViewListener2 != null) {
                payPalExpandedCartDetailsViewListener2.onCartDetailsArrowClick(view2, i3, i4);
            }
            if (this.lineItemViewState == 0) {
                Events.Companion.getInstance().fire(PayPalEventTypes.CART_DETAILS_EXPANDING, new Success(Boolean.TRUE));
                AnimationUtils.expand$default(AnimationUtils.INSTANCE, this.cartListParentLayout, 0, 0, (Interpolator) null, false, (C19846a) null, 62, (Object) null);
            } else {
                Events.Companion.getInstance().fire(PayPalEventTypes.CART_DETAILS_EXPANDING, new Success(Boolean.FALSE));
                AnimationUtils.shrink$default(AnimationUtils.INSTANCE, this.cartListParentLayout, 0, 0, (Interpolator) null, false, (C19846a) null, 62, (Object) null);
            }
            this.lineItemViewState = i4;
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
                                PayPalEventTypes payPalEventTypes7 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                                EventListener eventListener7 = this.finalizeCheckoutListener;
                                if (eventListener7 != null) {
                                    instance7.removeListener(payPalEventTypes7, eventListener7);
                                    Events instance8 = companion.getInstance();
                                    PayPalEventTypes payPalEventTypes8 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                                    EventListener eventListener8 = this.disableViewsTouchListener;
                                    if (eventListener8 != null) {
                                        instance8.removeListener(payPalEventTypes8, eventListener8);
                                    } else {
                                        C19383o.m32805o("disableViewsTouchListener");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("finalizeCheckoutListener");
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
    public PayPalExpandedCartDetails(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalExpandedCartDetailsViewListener payPalExpandedCartDetailsViewListener2) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.isAnchoredToBottomSheet = true;
        this.cartItemsList = new ArrayList();
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.cartViewModel$delegate = new C2868j0(C19386q.m32807a(CartViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                View.inflate(context2, C17165R.C17169layout.paypal_cart_details_list, this);
                this.payPalExpandedCartDetailsViewListener = payPalExpandedCartDetailsViewListener2;
                View findViewById = findViewById(C17165R.C17167id.show_product_details_arrow);
                C19383o.m32796f(findViewById, "findViewById(R.id.show_product_details_arrow)");
                this.arrowTv = (TextView) findViewById;
                View findViewById2 = findViewById(C17165R.C17167id.cart_list_parent_container);
                C19383o.m32796f(findViewById2, "findViewById(R.id.cart_list_parent_container)");
                this.cartListParentLayout = (LinearLayout) findViewById2;
                View findViewById3 = findViewById(C17165R.C17167id.cart_details_layout);
                C19383o.m32796f(findViewById3, "findViewById(R.id.cart_details_layout)");
                this.cartDetailsLayout = (LinearLayout) findViewById3;
                View findViewById4 = findViewById(C17165R.C17167id.cart_item_rv);
                C19383o.m32796f(findViewById4, "findViewById(R.id.cart_item_rv)");
                this.cartItemRv = (RecyclerView) findViewById4;
                View findViewById5 = findViewById(C17165R.C17167id.line_item_layout);
                C19383o.m32796f(findViewById5, "findViewById(R.id.line_item_layout)");
                this.lineItemList = (RelativeLayout) findViewById5;
                View findViewById6 = findViewById(C17165R.C17167id.tax_label);
                C19383o.m32796f(findViewById6, "findViewById(R.id.tax_label)");
                this.taxLabelTv = (TextView) findViewById6;
                View findViewById7 = findViewById(C17165R.C17167id.item_total_amount_textview);
                C19383o.m32796f(findViewById7, "findViewById(R.id.item_total_amount_textview)");
                this.subTotalAmountTv = (TextView) findViewById7;
                View findViewById8 = findViewById(C17165R.C17167id.tax_amount_textview);
                C19383o.m32796f(findViewById8, "findViewById(R.id.tax_amount_textview)");
                this.taxAmountTv = (TextView) findViewById8;
                View findViewById9 = findViewById(C17165R.C17167id.shipping_and_handling_amount_textview);
                C19383o.m32796f(findViewById9, "findViewById(R.id.shippi…handling_amount_textview)");
                this.shippingAndHandlingAmountTv = (TextView) findViewById9;
                View findViewById10 = findViewById(C17165R.C17167id.shipping_discount_amount_textview);
                C19383o.m32796f(findViewById10, "findViewById(R.id.shippi…discount_amount_textview)");
                this.shippingDiscountAmountTv = (TextView) findViewById10;
                View findViewById11 = findViewById(C17165R.C17167id.insurance_amount_textview);
                C19383o.m32796f(findViewById11, "findViewById(R.id.insurance_amount_textview)");
                this.insuranceAmountTv = (TextView) findViewById11;
                View findViewById12 = findViewById(C17165R.C17167id.grand_total_amount_textview);
                C19383o.m32796f(findViewById12, "findViewById(R.id.grand_total_amount_textview)");
                this.grandTotalAmountTv = (TextView) findViewById12;
                View findViewById13 = findViewById(C17165R.C17167id.insurance_label);
                C19383o.m32796f(findViewById13, "findViewById(R.id.insurance_label)");
                this.insuranceLabel = (TextView) findViewById13;
                View findViewById14 = findViewById(C17165R.C17167id.discount_label);
                C19383o.m32796f(findViewById14, "findViewById(R.id.discount_label)");
                this.discountLabel = (TextView) findViewById14;
                View findViewById15 = findViewById(C17165R.C17167id.subtotal_label);
                C19383o.m32796f(findViewById15, "findViewById(R.id.subtotal_label)");
                this.subtotalLabel = (TextView) findViewById15;
                View findViewById16 = findViewById(C17165R.C17167id.over_capture_text);
                C19383o.m32796f(findViewById16, "findViewById(R.id.over_capture_text)");
                this.overCaptureTv = (TextView) findViewById16;
                setVisibility(8);
                setArrowState(C17165R.C17166drawable.ic_expand_open);
                setOnClickListener();
                initCartItemsRecyclerView();
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

    private final void setTvText(TextView textView, TextView textView2, String str, List<String> list) {
        setVisibility(textView, str);
        setVisibility(textView2, str);
        if (!list.isEmpty()) {
            textView2.setText(getContext().getString(C17165R.string.paypal_checkout_sub_total));
        }
        textView.setText(str);
    }
}
