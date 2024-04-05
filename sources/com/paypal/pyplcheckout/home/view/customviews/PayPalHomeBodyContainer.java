package com.paypal.pyplcheckout.home.view.customviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2868j0;
import com.etsy.android.feedback.C6467l;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.paymentbutton.C17143a;
import com.paypal.pyplcheckout.C17165R;
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
import com.paypal.pyplcheckout.extensions.ViewExtensionsKt;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;

public final class PayPalHomeBodyContainer extends LinearLayout {
    private final String TAG;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final EventListener contingencyEventListener;
    private HeaderPadding headerPadding;
    private final C19285c mainPaysheetViewModel$delegate;
    private final EventListener paypalButtonClickedEventListener;

    public enum HeaderPadding {
        EXPANDED(C17165R.dimen.paypal_body_container_expanded_state_padding),
        COLLAPSED(C17165R.dimen.paypal_body_container_collapsed_state_padding);
        
        private final int res;

        private HeaderPadding(int i) {
            this.res = i;
        }

        public final int getRes() {
            return this.res;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalHomeBodyContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attributeSet");
        Class<PayPalHomeBodyContainer> cls = PayPalHomeBodyContainer.class;
        this.TAG = "PayPalHomeBodyContainer";
        HeaderPadding headerPadding2 = HeaderPadding.COLLAPSED;
        this.headerPadding = headerPadding2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            this.paypalButtonClickedEventListener = new C17248l(this, 0);
            this.contingencyEventListener = new C17143a(this, 2);
            setHeaderPadding(headerPadding2);
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }

    private final void attachEventListeners() {
        Activity activity = ViewExtensionsKt.getActivity(this);
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            Events instance = Events.Companion.getInstance();
            instance.listen(PayPalEventTypes.CONTINGENCY_EVENT, this.contingencyEventListener);
            instance.listen(PayPalEventTypes.CHECKOUT_BUTTON_CLICKED, this.paypalButtonClickedEventListener);
            getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(fragmentActivity, new C6467l(this, 6));
            getMainPaysheetViewModel().getLogoutCompletedFlag().observe(fragmentActivity, new C6468m(this, 7));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: attachEventListeners$lambda-2  reason: not valid java name */
    public static final void m35332attachEventListeners$lambda2(PayPalHomeBodyContainer payPalHomeBodyContainer, boolean z) {
        C19383o.m32797g(payPalHomeBodyContainer, "this$0");
        if (z) {
            payPalHomeBodyContainer.setHeaderPadding(HeaderPadding.EXPANDED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: attachEventListeners$lambda-3  reason: not valid java name */
    public static final void m35333attachEventListeners$lambda3(PayPalHomeBodyContainer payPalHomeBodyContainer, boolean z) {
        C19383o.m32797g(payPalHomeBodyContainer, "this$0");
        if (z) {
            payPalHomeBodyContainer.setHeaderPadding(HeaderPadding.COLLAPSED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: contingencyEventListener$lambda-1  reason: not valid java name */
    public static final void m35334contingencyEventListener$lambda1(PayPalHomeBodyContainer payPalHomeBodyContainer, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalHomeBodyContainer, "this$0");
        C19383o.m32797g(eventType, "type");
        if (resultData instanceof Success) {
            Object data = ((Success) resultData).getData();
            ContingencyEventsModel contingencyEventsModel = data instanceof ContingencyEventsModel ? (ContingencyEventsModel) data : null;
            if (contingencyEventsModel != null) {
                payPalHomeBodyContainer.handleContingency(contingencyEventsModel);
            }
        }
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final void handleContingency(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        if (i == 1 || i == 2) {
            switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                case 1:
                case 2:
                    setHeaderPadding(HeaderPadding.COLLAPSED);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    setHeaderPadding(HeaderPadding.EXPANDED);
                    return;
                case 10:
                    if (contingencyEventsModel.isAddCardContingency()) {
                        setHeaderPadding(HeaderPadding.EXPANDED);
                        return;
                    }
                    return;
                default:
                    String str = this.TAG;
                    C19383o.m32796f(str, "TAG");
                    PLog.i$default(str, "ContingencyProcessingStatus of type " + contingencyProcessingStatus + " not handled", 0, 4, (Object) null);
                    return;
            }
        } else {
            String str2 = this.TAG;
            C19383o.m32796f(str2, "TAG");
            PLog.i$default(str2, "ContingencyType of type " + contingencyType + " not handled", 0, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: paypalButtonClickedEventListener$lambda-0  reason: not valid java name */
    public static final void m35335paypalButtonClickedEventListener$lambda0(PayPalHomeBodyContainer payPalHomeBodyContainer, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalHomeBodyContainer, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CheckoutFinishedEventModel checkoutFinishedEventModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CheckoutFinishedEventModel) {
            checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
        }
        if (checkoutFinishedEventModel != null && checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
            payPalHomeBodyContainer.setHeaderPadding(HeaderPadding.COLLAPSED);
        }
    }

    private final void setHeaderPadding(HeaderPadding headerPadding2) {
        this.headerPadding = headerPadding2;
        setPadding(getPaddingLeft(), getResources().getDimensionPixelSize(headerPadding2.getRes()), getPaddingRight(), getPaddingBottom());
    }

    private final boolean shouldHandleTopPadding() {
        DebugConfigManager.getInstance().isShouldUseBodyContainerPadding();
        getMainPaysheetViewModel().isVenice();
        return true;
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

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (shouldHandleTopPadding()) {
            attachEventListeners();
        }
    }
}
