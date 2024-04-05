package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.C0388a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17185c;
import com.paypal.pyplcheckout.animation.sequences.Action;
import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationCallback;
import com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence;
import com.paypal.pyplcheckout.animation.sequences.Duration;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel;
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
import com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p280x0.C8292f;

public final class PayPalExitLoadingSpinner extends LinearLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalExitLoadingSpinner";
    public Map<Integer, View> _$_findViewCache;
    private EventListener checkoutButtonListener;
    private ImageView cryptoProgressIV;
    private final C19285c cryptoViewModel$delegate;
    private EventListener finishedCheckoutListener;
    private final C19285c fundingOptionsViewModel$delegate;
    private boolean isAnchoredToBottomSheet;
    private TextView loadingMessageTv;
    private ImageView loadingProgressIV;
    private LoadingProgressSpinnerView loadingSpinner;
    private final C19285c mainPaysheetViewModel$delegate;
    private LinearLayout paypalLoadingSpinnerParentContainer;
    private ProgressBar progressBar;
    private ImageView threeDSProgressIV;

    public enum CheckoutAnimationTransition {
        PAY_NOW,
        CONTINUE,
        THREE_DS_V1_PROCESSING
    }

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
            int[] iArr3 = new int[CheckoutAnimationTransition.values().length];
            iArr3[CheckoutAnimationTransition.PAY_NOW.ordinal()] = 1;
            iArr3[CheckoutAnimationTransition.THREE_DS_V1_PROCESSING.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Class<PayPalExitLoadingSpinner> cls = PayPalExitLoadingSpinner.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalExitLoadingSpinner(Context context) {
        this(context, (AttributeSet) null, (Fragment) null, 0, 14, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalExitLoadingSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (Fragment) null, 0, 12, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalExitLoadingSpinner(Context context, AttributeSet attributeSet, Fragment fragment) {
        this(context, attributeSet, fragment, 0, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalExitLoadingSpinner(Context context, AttributeSet attributeSet, Fragment fragment, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? null : fragment, (i2 & 8) != 0 ? 0 : i);
    }

    private final void finishCheckoutTransition() {
        CheckoutAnimationSequence checkoutAnimationSequence = new CheckoutAnimationSequence((CheckoutAnimationCallback) null, 1, (DefaultConstructorMarker) null);
        checkoutAnimationSequence.addCallBack(new PayPalExitLoadingSpinner$finishCheckoutTransition$1$1());
        Action action = Action.FadeOut;
        TextView textView = this.loadingMessageTv;
        Duration duration = Duration.SHORT;
        CheckoutAnimationSequence.addAction$default(checkoutAnimationSequence, action, textView, duration, (String) null, (Drawable) null, 24, (Object) null);
        if (getMainPaysheetViewModel().isExitLoadingSpinnerWithoutLogoExperiment()) {
            CheckoutAnimationSequence checkoutAnimationSequence2 = checkoutAnimationSequence;
            Action action2 = action;
            Duration duration2 = duration;
            CheckoutAnimationSequence.with$default(checkoutAnimationSequence2, action2, this.progressBar, duration2, (String) null, (Drawable) null, 24, (Object) null);
            CheckoutAnimationSequence.with$default(checkoutAnimationSequence2, action2, this.loadingProgressIV, duration2, (String) null, (Drawable) null, 24, (Object) null);
        }
        if (getCryptoViewModel().isCryptoPayment()) {
            CheckoutAnimationSequence.with$default(checkoutAnimationSequence, action, this.cryptoProgressIV, duration, (String) null, (Drawable) null, 24, (Object) null);
        } else {
            Action action3 = Action.FadeIn;
            CheckoutAnimationSequence.andThen$default(checkoutAnimationSequence, action3, this.loadingMessageTv, duration, getResources().getString(C17165R.string.paypal_checkout_checkout_story_text_phase_2), (Drawable) null, 16, (Object) null);
            ImageView imageView = this.loadingProgressIV;
            Duration duration3 = Duration.LONG;
            Resources resources = getResources();
            int i = C17165R.C17166drawable.ic_done_check;
            ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
            checkoutAnimationSequence.with(action3, imageView, duration3, (String) null, resources.getDrawable(i, (Resources.Theme) null));
        }
        checkoutAnimationSequence.start();
    }

    private final CryptoViewModel getCryptoViewModel() {
        return (CryptoViewModel) this.cryptoViewModel$delegate.getValue();
    }

    private final FundingOptionsViewModel getFundingOptionsViewModel() {
        return (FundingOptionsViewModel) this.fundingOptionsViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final String getThreeDsExitString() {
        FundingInstrument fundingInstrument;
        FundingOption selectedFundingOption = getFundingOptionsViewModel().getSelectedFundingOption();
        String str = null;
        if (!(selectedFundingOption == null || (fundingInstrument = selectedFundingOption.getFundingInstrument()) == null)) {
            str = fundingInstrument.getLabel();
        }
        if (!(str == null || str.length() == 0)) {
            String string = getResources().getString(C17165R.string.paypal_checkout_3ds_loading_with_issuer_name);
            C19383o.m32796f(string, "resources.getString(R.st…loading_with_issuer_name)");
            return C0388a.m1049e(new Object[]{str}, 1, string, "format(format, *args)");
        }
        String string2 = getResources().getString(C17165R.string.paypal_checkout_3ds_loading);
        C19383o.m32796f(string2, "{\n            resources.…ut_3ds_loading)\n        }");
        return string2;
    }

    private final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        if (i == 1 || i == 2) {
            switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                case 1:
                case 2:
                    setupCheckoutTransition(CheckoutAnimationTransition.THREE_DS_V1_PROCESSING);
                    this.loadingSpinner.setVisibility(0);
                    setVisibility(0);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.loadingSpinner.setVisibility(8);
                    setVisibility(8);
                    return;
                case 10:
                    if (contingencyEventsModel.isAddCardContingency()) {
                        this.loadingSpinner.setVisibility(8);
                        setVisibility(8);
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

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35318initViewModelObservers$lambda1(PayPalExitLoadingSpinner payPalExitLoadingSpinner, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalExitLoadingSpinner, "this$0");
        if (contingencyEventsModel != null) {
            payPalExitLoadingSpinner.handleContingencyEvent(contingencyEventsModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35319initViewModelObservers$lambda2(PayPalExitLoadingSpinner payPalExitLoadingSpinner, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExitLoadingSpinner, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CheckoutFinishedEventModel checkoutFinishedEventModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CheckoutFinishedEventModel) {
            checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
        }
        if (checkoutFinishedEventModel != null && checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
            payPalExitLoadingSpinner.setupCheckoutTransition(payPalExitLoadingSpinner.getMainPaysheetViewModel().isPayNowMode() ? CheckoutAnimationTransition.PAY_NOW : CheckoutAnimationTransition.CONTINUE);
            payPalExitLoadingSpinner.loadingSpinner.setVisibility(0);
            payPalExitLoadingSpinner.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35320initViewModelObservers$lambda3(PayPalExitLoadingSpinner payPalExitLoadingSpinner, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalExitLoadingSpinner, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalExitLoadingSpinner.finishCheckoutTransition();
    }

    private final void setupCheckoutTransition(CheckoutAnimationTransition checkoutAnimationTransition) {
        CheckoutAnimationSequence checkoutAnimationSequence = new CheckoutAnimationSequence((CheckoutAnimationCallback) null, 1, (DefaultConstructorMarker) null);
        int[] iArr = WhenMappings.$EnumSwitchMapping$2;
        int i = iArr[checkoutAnimationTransition.ordinal()];
        String string = i != 1 ? i != 2 ? getResources().getString(C17165R.string.paypal_checkout_checkout_story_text_phase_1) : getThreeDsExitString() : getResources().getString(C17165R.string.paypal_checkout_checkout_story_text_phase_1_paynow);
        C19383o.m32796f(string, "when (transition) {\n    …)\n            }\n        }");
        if (iArr[checkoutAnimationTransition.ordinal()] == 2) {
            this.loadingProgressIV.setVisibility(4);
            this.cryptoProgressIV.setVisibility(4);
            this.threeDSProgressIV.setVisibility(0);
            CheckoutAnimationSequence checkoutAnimationSequence2 = checkoutAnimationSequence;
            CheckoutAnimationSequence.addAction$default(checkoutAnimationSequence2, Action.Show, this.progressBar, (Duration) null, (String) null, (Drawable) null, 28, (Object) null);
            CheckoutAnimationSequence.andThen$default(checkoutAnimationSequence2, Action.FadeIn, this.loadingMessageTv, Duration.SHORT, string, (Drawable) null, 16, (Object) null);
        } else {
            this.threeDSProgressIV.setVisibility(4);
            if (getMainPaysheetViewModel().isExitLoadingSpinnerWithoutLogoExperiment()) {
                this.loadingProgressIV.setVisibility(0);
                ProgressBar progressBar2 = this.progressBar;
                Context context = getContext();
                int i2 = C17165R.C17166drawable.custom_progress_faster;
                Object obj = C8184a.f17966a;
                progressBar2.setIndeterminateDrawable(C8184a.C8187c.m16466b(context, i2));
                CheckoutAnimationSequence checkoutAnimationSequence3 = checkoutAnimationSequence;
                CheckoutAnimationSequence.addAction$default(checkoutAnimationSequence3, Action.Show, this.progressBar, (Duration) null, (String) null, (Drawable) null, 28, (Object) null);
                CheckoutAnimationSequence.andThen$default(checkoutAnimationSequence3, Action.FadeIn, this.loadingMessageTv, Duration.SHORT, string, (Drawable) null, 16, (Object) null);
            } else {
                CheckoutAnimationSequence.addAction$default(checkoutAnimationSequence, Action.Hide, this.progressBar, (Duration) null, (String) null, (Drawable) null, 28, (Object) null);
                if (getCryptoViewModel().isCryptoPayment()) {
                    this.loadingProgressIV.setVisibility(4);
                    this.loadingSpinner.showCryptoProgress();
                    Action action = Action.Show;
                    ImageView imageView = this.cryptoProgressIV;
                    Duration duration = Duration.LONG;
                    Resources resources = getResources();
                    int i3 = C17165R.C17166drawable.ic_selling_crypto;
                    ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
                    CheckoutAnimationSequence.with$default(checkoutAnimationSequence.andThen(action, imageView, duration, (String) null, resources.getDrawable(i3, (Resources.Theme) null)), action, this.loadingMessageTv, duration, getContext().getString(C17165R.string.paypal_checkout_selling_your_crypto), (Drawable) null, 16, (Object) null).andThen(action, this.cryptoProgressIV, duration, (String) null, getResources().getDrawable(C17165R.C17166drawable.ic_store_exit_crypto, (Resources.Theme) null));
                } else {
                    this.cryptoProgressIV.setVisibility(4);
                    this.loadingProgressIV.setVisibility(0);
                    Action action2 = Action.CycleInOut;
                    ImageView imageView2 = this.loadingProgressIV;
                    Duration duration2 = Duration.SUPER;
                    Resources resources2 = getResources();
                    int i4 = C17165R.C17166drawable.ic_store_exit_animation;
                    ThreadLocal<TypedValue> threadLocal2 = C8292f.f18172a;
                    checkoutAnimationSequence.andThen(action2, imageView2, duration2, (String) null, resources2.getDrawable(i4, (Resources.Theme) null));
                }
                CheckoutAnimationSequence.with$default(checkoutAnimationSequence, Action.Show, this.loadingMessageTv, Duration.LONG, string, (Drawable) null, 16, (Object) null);
            }
        }
        checkoutAnimationSequence.start();
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

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public void initViewModelObservers() {
        C6469n nVar = new C6469n(this, 9);
        C2895z<ContingencyEventsModel> contingencyEventsModel = getMainPaysheetViewModel().getContingencyEventsModel();
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        contingencyEventsModel.observe(getComponentActivity(context), nVar);
        this.checkoutButtonListener = new C17185c(this, 1);
        this.finishedCheckoutListener = new C17246j(this, 1);
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.FINISHED_CHECKOUT_ON_APPROVE;
            EventListener eventListener2 = this.finishedCheckoutListener;
            if (eventListener2 != null) {
                instance2.listen(payPalEventTypes2, eventListener2);
            } else {
                C19383o.m32805o("finishedCheckoutListener");
                throw null;
            }
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.FINISHED_CHECKOUT_ON_APPROVE;
            EventListener eventListener2 = this.finishedCheckoutListener;
            if (eventListener2 != null) {
                instance2.removeListener(payPalEventTypes2, eventListener2);
            } else {
                C19383o.m32805o("finishedCheckoutListener");
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PayPalExitLoadingSpinner(android.content.Context r20, android.util.AttributeSet r21, androidx.fragment.app.Fragment r22, int r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r2 = r21
            r3 = r23
            r0.<init>(r1, r2, r3)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0._$_findViewCache = r2
            r2 = 1
            r0.isAnchoredToBottomSheet = r2
            com.paypal.pyplcheckout.di.SdkComponent$Companion r2 = com.paypal.pyplcheckout.p543di.SdkComponent.Companion
            com.paypal.pyplcheckout.di.SdkComponent r3 = r2.getInstance()
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1 r4 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1
            r4.<init>(r3)
            boolean r3 = r1 instanceof androidx.activity.ComponentActivity
            java.lang.String r5 = "Context is not an instance of ComponentActivity"
            if (r3 == 0) goto L_0x0135
            r6 = r1
            androidx.activity.ComponentActivity r6 = (androidx.activity.ComponentActivity) r6
            androidx.lifecycle.j0 r7 = new androidx.lifecycle.j0
            java.lang.Class<com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel> r8 = com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel.class
            kotlin.jvm.internal.k r8 = kotlin.jvm.internal.C19386q.m32807a(r8)
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4 r9 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4
            r9.<init>(r6)
            r7.<init>(r8, r9, r4)
            r0.mainPaysheetViewModel$delegate = r7
            com.paypal.pyplcheckout.di.SdkComponent r4 = r2.getInstance()
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1 r7 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1
            r7.<init>(r4)
            if (r3 == 0) goto L_0x0114
            androidx.lifecycle.j0 r4 = new androidx.lifecycle.j0
            java.lang.Class<com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel> r8 = com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel.class
            kotlin.jvm.internal.k r8 = kotlin.jvm.internal.C19386q.m32807a(r8)
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4 r9 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4
            r9.<init>(r6)
            r4.<init>(r8, r9, r7)
            r0.fundingOptionsViewModel$delegate = r4
            com.paypal.pyplcheckout.di.SdkComponent r2 = r2.getInstance()
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1 r4 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1
            r4.<init>(r2)
            if (r3 == 0) goto L_0x00f3
            androidx.lifecycle.j0 r2 = new androidx.lifecycle.j0
            java.lang.Class<com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel> r3 = com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel.class
            kotlin.jvm.internal.k r3 = kotlin.jvm.internal.C19386q.m32807a(r3)
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4 r5 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4
            r5.<init>(r6)
            r2.<init>(r3, r5, r4)
            r0.cryptoViewModel$delegate = r2
            int r2 = com.paypal.pyplcheckout.C17165R.C17169layout.paypal_loading_spinner
            android.view.View.inflate(r1, r2, r0)
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.loading_spinner_parent_container
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.loadin…spinner_parent_container)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.paypalLoadingSpinnerParentContainer = r1
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.loading_spinner_view
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.loading_spinner_view)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.paypal.pyplcheckout.home.view.customviews.LoadingProgressSpinnerView r1 = (com.paypal.pyplcheckout.home.view.customviews.LoadingProgressSpinnerView) r1
            r0.loadingSpinner = r1
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.progress_bar
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.progress_bar)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r0.progressBar = r1
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.loading_progress_iv
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.loading_progress_iv)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.loadingProgressIV = r1
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.crypto_progress_iv
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.crypto_progress_iv)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.cryptoProgressIV = r1
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.three_ds_progress_iv
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.three_ds_progress_iv)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.threeDSProgressIV = r1
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.loading_message_tv
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.loading_message_tv)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.loadingMessageTv = r1
            com.paypal.pyplcheckout.home.view.customviews.LoadingProgressSpinnerView r1 = r0.loadingSpinner
            r2 = 8
            r1.setVisibility(r2)
            r19.initViewModelObservers()
            return
        L_0x00f3:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E407
            r9 = 0
            r10 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.CONTEXT_INSTANCE
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 2008(0x7d8, float:2.814E-42)
            r18 = 0
            java.lang.String r8 = "Context is not an instance of ComponentActivity"
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r5.toString()
            r1.<init>(r2)
            throw r1
        L_0x0114:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E407
            r9 = 0
            r10 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.CONTEXT_INSTANCE
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 2008(0x7d8, float:2.814E-42)
            r18 = 0
            java.lang.String r8 = "Context is not an instance of ComponentActivity"
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r5.toString()
            r1.<init>(r2)
            throw r1
        L_0x0135:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E407
            r9 = 0
            r10 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.CONTEXT_INSTANCE
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 2008(0x7d8, float:2.814E-42)
            r18 = 0
            java.lang.String r8 = "Context is not an instance of ComponentActivity"
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r5.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalExitLoadingSpinner.<init>(android.content.Context, android.util.AttributeSet, androidx.fragment.app.Fragment, int):void");
    }
}
