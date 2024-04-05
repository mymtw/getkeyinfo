package com.paypal.pyplcheckout.billingagreements.view.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.C0388a;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9904g;
import com.paypal.checkout.paymentbutton.C17144b;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTextState;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.CheckoutFinishedEventModel;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.home.view.customviews.LinkTextView;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.AnimationsDelegate;
import com.paypal.pyplcheckout.utils.AnimationsDelegateKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalBillingAgreementsTextView extends FrameLayout implements ICustomViewsViewModel, ContentView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalBillingAgreementsTextView";
    public Map<Integer, View> _$_findViewCache;
    private final C19285c animator$delegate;
    private String currentText;
    private final C19285c mainPaysheetViewModel$delegate;
    private final LinkTextView textView;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalBillingAgreementsTextView.TAG;
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
        Class<PayPalBillingAgreementsTextView> cls = PayPalBillingAgreementsTextView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalBillingAgreementsTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final AnimationsDelegate getAnimator() {
        return (AnimationsDelegate) this.animator$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final BillingAgreementsViewModel getViewModel() {
        return (BillingAgreementsViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.paypal.pyplcheckout.billingagreements.viewmodel.BaTextState$Show} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleContingencyEvent(com.paypal.pyplcheckout.events.model.ContingencyEventsModel r8) {
        /*
            r7 = this;
            com.paypal.pyplcheckout.events.model.ContingencyType r0 = r8.getContingencyType()
            com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r8 = r8.getContingencyProcessingStatus()
            int[] r1 = com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView.WhenMappings.$EnumSwitchMapping$0
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            r3 = 4
            r4 = 0
            java.lang.String r5 = " not handled"
            r6 = 0
            if (r1 == r2) goto L_0x0035
            r2 = 2
            if (r1 == r2) goto L_0x0035
            java.lang.String r8 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ContingencyType of type "
            r1.append(r2)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.paypal.pyplcheckout.common.instrumentation.PLog.i$default(r8, r0, r4, r3, r6)
            goto L_0x007a
        L_0x0035:
            int[] r0 = com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView.WhenMappings.$EnumSwitchMapping$1
            int r1 = r8.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0077;
                case 2: goto L_0x0077;
                case 3: goto L_0x005a;
                case 4: goto L_0x005a;
                case 5: goto L_0x005a;
                case 6: goto L_0x005a;
                case 7: goto L_0x005a;
                case 8: goto L_0x005a;
                case 9: goto L_0x005a;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ContingencyProcessingStatus of type "
            r1.append(r2)
            r1.append(r8)
            r1.append(r5)
            java.lang.String r8 = r1.toString()
            com.paypal.pyplcheckout.common.instrumentation.PLog.i$default(r0, r8, r4, r3, r6)
            goto L_0x007a
        L_0x005a:
            com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel r8 = r7.getViewModel()
            androidx.lifecycle.LiveData r8 = r8.getBaPurchaseTextState()
            java.lang.Object r8 = r8.getValue()
            boolean r0 = r8 instanceof com.paypal.pyplcheckout.billingagreements.viewmodel.BaTextState.Show
            if (r0 == 0) goto L_0x006d
            r6 = r8
            com.paypal.pyplcheckout.billingagreements.viewmodel.BaTextState$Show r6 = (com.paypal.pyplcheckout.billingagreements.viewmodel.BaTextState.Show) r6
        L_0x006d:
            if (r6 != 0) goto L_0x0073
            r7.hide()
            return
        L_0x0073:
            r7.show(r6)
            goto L_0x007a
        L_0x0077:
            r7.hide()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsTextView.handleContingencyEvent(com.paypal.pyplcheckout.events.model.ContingencyEventsModel):void");
    }

    private final void hide() {
        getAnimator().shrink();
    }

    private final void initEvents() {
        Events.Companion companion = Events.Companion;
        companion.getInstance().listen(PayPalEventTypes.CHECKOUT_BUTTON_CLICKED, new C17144b(this, 1));
        companion.getInstance().listen(PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION, new C17199b(this, 0));
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-4  reason: not valid java name */
    public static final void m35224initEvents$lambda4(PayPalBillingAgreementsTextView payPalBillingAgreementsTextView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalBillingAgreementsTextView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData instanceof Success) {
            Object data = ((Success) resultData).getData();
            CheckoutFinishedEventModel checkoutFinishedEventModel = data instanceof CheckoutFinishedEventModel ? (CheckoutFinishedEventModel) data : null;
            if (checkoutFinishedEventModel != null && !checkoutFinishedEventModel.isAddCardMode() && checkoutFinishedEventModel.isClickEnabled()) {
                payPalBillingAgreementsTextView.hide();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-5  reason: not valid java name */
    public static final void m35225initEvents$lambda5(PayPalBillingAgreementsTextView payPalBillingAgreementsTextView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalBillingAgreementsTextView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalBillingAgreementsTextView.textView.setClickable(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35226initViewModelObservers$lambda0(PayPalBillingAgreementsTextView payPalBillingAgreementsTextView, Boolean bool) {
        C19383o.m32797g(payPalBillingAgreementsTextView, "this$0");
        BaTextState value = payPalBillingAgreementsTextView.getViewModel().getBaPurchaseTextState().getValue();
        C19383o.m32796f(bool, "it");
        if (!bool.booleanValue() || !(value instanceof BaTextState.Show)) {
            payPalBillingAgreementsTextView.hide();
        } else {
            payPalBillingAgreementsTextView.show((BaTextState.Show) value);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35227initViewModelObservers$lambda2(PayPalBillingAgreementsTextView payPalBillingAgreementsTextView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalBillingAgreementsTextView, "this$0");
        if (contingencyEventsModel != null) {
            payPalBillingAgreementsTextView.handleContingencyEvent(contingencyEventsModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35228initViewModelObservers$lambda3(PayPalBillingAgreementsTextView payPalBillingAgreementsTextView, BaTextState baTextState) {
        C19383o.m32797g(payPalBillingAgreementsTextView, "this$0");
        C19383o.m32797g(baTextState, "state");
        if (baTextState instanceof BaTextState.Show) {
            payPalBillingAgreementsTextView.show((BaTextState.Show) baTextState);
        } else if (baTextState instanceof BaTextState.Hide) {
            payPalBillingAgreementsTextView.hide();
        }
    }

    private final void setupTextView(BaTextState.Show show) {
        String string = getResources().getString(show.getResource());
        C19383o.m32796f(string, "resources.getString(state.resource)");
        String e = C0388a.m1049e(new Object[]{show.getMerchantName()}, 1, string, "format(format, *args)");
        if (!C19383o.m32792b(e, this.currentText)) {
            this.textView.setText(e);
            this.textView.setActions(new PayPalBillingAgreementsTextView$setupTextView$1(this));
            this.currentText = e;
        }
    }

    private final void show(BaTextState.Show show) {
        if (C19383o.m32792b(getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().getValue(), Boolean.TRUE)) {
            setupTextView(show);
            getAnimator().expand();
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
        return false;
    }

    public C2887s getLifecycleOwner(View view) {
        return ICustomViewsViewModel.DefaultImpls.getLifecycleOwner(this, view);
    }

    public final LinkTextView getTextView() {
        return this.textView;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public void initViewModelObservers() {
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(getLifecycleOwner(this), new C6469n(this, 6));
        getMainPaysheetViewModel().getContingencyEventsModel().observe(getLifecycleOwner(this), new C6346d(this, 3));
        getViewModel().getBaPurchaseTextState().observe(getLifecycleOwner(this), new C9904g(this, 4));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalBillingAgreementsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(BillingAgreementsViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                this.animator$delegate = AnimationsDelegateKt.viewAnimator(new PayPalBillingAgreementsTextView$animator$2(this));
                View.inflate(context2, C17165R.C17169layout.paypal_billing_agreement_text_view, this);
                View findViewById = findViewById(C17165R.C17167id.paypal_billing_agreements_text_view);
                C19383o.m32796f(findViewById, "findViewById(R.id.paypal…ing_agreements_text_view)");
                this.textView = (LinkTextView) findViewById;
                setVisibility(8);
                initViewModelObservers();
                initEvents();
                return;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
