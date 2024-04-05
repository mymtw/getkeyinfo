package com.paypal.pyplcheckout.billingagreements.view.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.favorites.add.C9788w;
import com.etsy.android.p327ui.user.purchases.C11668n;
import com.etsy.android.p327ui.user.purchases.C11669o;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17187e;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17190h;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaToggleState;
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

public final class PayPalBillingAgreementsToggle extends FrameLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalBillingAgreementsToggle";
    public Map<Integer, View> _$_findViewCache;
    private final C19285c animator$delegate;
    private final TextView errorView;
    private final C19285c mainPaysheetViewModel$delegate;
    private boolean previousToggleState;
    private final SwitchCompat toggle;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalBillingAgreementsToggle.TAG;
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
        Class<PayPalBillingAgreementsToggle> cls = PayPalBillingAgreementsToggle.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalBillingAgreementsToggle(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final AnimationsDelegate getAnimator() {
        return (AnimationsDelegate) this.animator$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final BillingAgreementsViewModel getViewModel() {
        return (BillingAgreementsViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.paypal.pyplcheckout.billingagreements.viewmodel.BaToggleState$Show} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleThreeDsContingency(com.paypal.pyplcheckout.events.model.ContingencyEventsModel r8) {
        /*
            r7 = this;
            com.paypal.pyplcheckout.events.model.ContingencyType r0 = r8.getContingencyType()
            com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus r8 = r8.getContingencyProcessingStatus()
            int[] r1 = com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle.WhenMappings.$EnumSwitchMapping$0
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
            int[] r0 = com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle.WhenMappings.$EnumSwitchMapping$1
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
            androidx.lifecycle.LiveData r8 = r8.getBaToggleState()
            java.lang.Object r8 = r8.getValue()
            boolean r0 = r8 instanceof com.paypal.pyplcheckout.billingagreements.viewmodel.BaToggleState.Show
            if (r0 == 0) goto L_0x006d
            r6 = r8
            com.paypal.pyplcheckout.billingagreements.viewmodel.BaToggleState$Show r6 = (com.paypal.pyplcheckout.billingagreements.viewmodel.BaToggleState.Show) r6
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
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle.handleThreeDsContingency(com.paypal.pyplcheckout.events.model.ContingencyEventsModel):void");
    }

    private final void hide() {
        getAnimator().shrink();
    }

    private final void listenForLogoutEvent() {
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(getLifecycleOwner(this), new C6456a(this, 9));
    }

    /* access modifiers changed from: private */
    /* renamed from: listenForLogoutEvent$lambda-4  reason: not valid java name */
    public static final void m35229listenForLogoutEvent$lambda4(PayPalBillingAgreementsToggle payPalBillingAgreementsToggle, Boolean bool) {
        C19383o.m32797g(payPalBillingAgreementsToggle, "this$0");
        C19383o.m32796f(bool, "it");
        if (bool.booleanValue()) {
            payPalBillingAgreementsToggle.hide();
        }
    }

    private final void listenForPayPalButtonEvent() {
        Events.Companion.getInstance().listen(PayPalEventTypes.CHECKOUT_BUTTON_CLICKED, new C17190h(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: listenForPayPalButtonEvent$lambda-1  reason: not valid java name */
    public static final void m35230listenForPayPalButtonEvent$lambda1(PayPalBillingAgreementsToggle payPalBillingAgreementsToggle, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalBillingAgreementsToggle, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData instanceof Success) {
            Object data = ((Success) resultData).getData();
            CheckoutFinishedEventModel checkoutFinishedEventModel = data instanceof CheckoutFinishedEventModel ? (CheckoutFinishedEventModel) data : null;
            if (checkoutFinishedEventModel != null && !checkoutFinishedEventModel.isAddCardMode() && checkoutFinishedEventModel.isClickEnabled()) {
                payPalBillingAgreementsToggle.hide();
            }
        }
    }

    private final void listenForShowEvents() {
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(getLifecycleOwner(this), new C11668n(this, 1));
        getViewModel().getBaToggleState().observe(getLifecycleOwner(this), new C11669o(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: listenForShowEvents$lambda-5  reason: not valid java name */
    public static final void m35231listenForShowEvents$lambda5(PayPalBillingAgreementsToggle payPalBillingAgreementsToggle, Boolean bool) {
        C19383o.m32797g(payPalBillingAgreementsToggle, "this$0");
        BaToggleState value = payPalBillingAgreementsToggle.getViewModel().getBaToggleState().getValue();
        if (value != null) {
            C19383o.m32796f(bool, "it");
            if (bool.booleanValue()) {
                payPalBillingAgreementsToggle.onViewState(value);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listenForShowEvents$lambda-6  reason: not valid java name */
    public static final void m35232listenForShowEvents$lambda6(PayPalBillingAgreementsToggle payPalBillingAgreementsToggle, BaToggleState baToggleState) {
        C19383o.m32797g(payPalBillingAgreementsToggle, "this$0");
        C19383o.m32796f(baToggleState, "it");
        payPalBillingAgreementsToggle.onViewState(baToggleState);
    }

    private final void listenForThreeDs() {
        getMainPaysheetViewModel().getContingencyEventsModel().observe(getLifecycleOwner(this), new C17187e(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: listenForThreeDs$lambda-3  reason: not valid java name */
    public static final void m35233listenForThreeDs$lambda3(PayPalBillingAgreementsToggle payPalBillingAgreementsToggle, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalBillingAgreementsToggle, "this$0");
        if (contingencyEventsModel != null) {
            payPalBillingAgreementsToggle.handleThreeDsContingency(contingencyEventsModel);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void logToggleChanged(boolean r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            int r0 = r12.getVisibility()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 != 0) goto L_0x000e
            monitor-exit(r12)
            return
        L_0x000e:
            boolean r0 = r12.previousToggleState     // Catch:{ all -> 0x002f }
            if (r13 == r0) goto L_0x002d
            if (r13 == 0) goto L_0x0017
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SELECTED     // Catch:{ all -> 0x002f }
            goto L_0x0019
        L_0x0017:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r0 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.UNSELECTED     // Catch:{ all -> 0x002f }
        L_0x0019:
            r2 = r0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r1 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.BA_ALWAYS_USE_BALANCE_CLICKED     // Catch:{ all -> 0x002f }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E101     // Catch:{ all -> 0x002f }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.REVIEW     // Catch:{ all -> 0x002f }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 496(0x1f0, float:6.95E-43)
            r11 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.click$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x002f }
            r12.previousToggleState = r13     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r12)
            return
        L_0x002f:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.billingagreements.view.customview.PayPalBillingAgreementsToggle.logToggleChanged(boolean):void");
    }

    private final void onViewState(BaToggleState baToggleState) {
        if (baToggleState instanceof BaToggleState.Hide) {
            hide();
        } else if (baToggleState instanceof BaToggleState.Show) {
            show((BaToggleState.Show) baToggleState);
        }
    }

    private final void setupViews() {
        this.errorView.setVisibility(8);
        this.toggle.setOnCheckedChangeListener(new C9788w(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupViews$lambda-0  reason: not valid java name */
    public static final void m35234setupViews$lambda0(PayPalBillingAgreementsToggle payPalBillingAgreementsToggle, CompoundButton compoundButton, boolean z) {
        C19383o.m32797g(payPalBillingAgreementsToggle, "this$0");
        payPalBillingAgreementsToggle.getViewModel().setAlwaysUseBalancePreference(z);
        payPalBillingAgreementsToggle.logToggleChanged(z);
    }

    private final void show(BaToggleState.Show show) {
        this.previousToggleState = show.isSelected();
        this.toggle.setChecked(show.isSelected());
        getAnimator().expand();
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

    public void initViewModelObservers() {
        listenForShowEvents();
        listenForLogoutEvent();
        listenForPayPalButtonEvent();
        listenForThreeDs();
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalBillingAgreementsToggle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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
                this.viewModel$delegate = new C2868j0(C19386q.m32807a(BillingAgreementsViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                this.animator$delegate = AnimationsDelegateKt.viewAnimator(new PayPalBillingAgreementsToggle$animator$2(this));
                View.inflate(context2, C17165R.C17169layout.paypal_billing_agreements_toggle_view, this);
                View findViewById = findViewById(C17165R.C17167id.toggle);
                C19383o.m32796f(findViewById, "findViewById(R.id.toggle)");
                this.toggle = (SwitchCompat) findViewById;
                View findViewById2 = findViewById(C17165R.C17167id.error_text);
                C19383o.m32796f(findViewById2, "findViewById(R.id.error_text)");
                this.errorView = (TextView) findViewById2;
                setVisibility(8);
                setupViews();
                initViewModelObservers();
                return;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
