package com.paypal.pyplcheckout.home.view.customviews.availablebalance;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.feedback.C6467l;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9904g;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.home.view.customviews.ToggleSwitchView;
import com.paypal.pyplcheckout.home.view.customviews.availablebalance.AvailableBalanceState;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.AnimationsDelegate;
import com.paypal.pyplcheckout.utils.AnimationsDelegateKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

public final class AvailablePpBalanceView extends ConstraintLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "AvailablePpBalanceView";
    public Map<Integer, View> _$_findViewCache;
    private final C19285c animator$delegate;
    private final C19285c availableBalanceViewModel$delegate;
    private final C19285c mainPaysheetViewModel$delegate;
    private TextView primarySplitBalanceAmountTv;
    private View primarySplitBalanceContainer;
    private ImageView primarySplitBalanceErrorImg;
    private TextView primarySplitBalanceErrorTv;
    private ImageView primarySplitBalanceInfoImg;
    private ToggleSwitchView primarySplitBalanceToggle;
    private final C19285c secondaryBalanceAnimator$delegate;
    private TextView secondarySplitBalanceAmountTv;
    /* access modifiers changed from: private */
    public View secondarySplitBalanceContainer;
    private ImageView secondarySplitBalanceErrorImg;
    private TextView secondarySplitBalanceErrorTv;
    private ToggleSwitchView secondarySplitBalanceToggle;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<AvailablePpBalanceView> cls = AvailablePpBalanceView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailablePpBalanceView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailablePpBalanceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvailablePpBalanceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m35403_init_$lambda0(AvailablePpBalanceView availablePpBalanceView, AvailableBalanceState availableBalanceState) {
        C19383o.m32797g(availablePpBalanceView, "this$0");
        if (availableBalanceState instanceof AvailableBalanceState.NoSplitBalance) {
            availablePpBalanceView.noSplitBalance();
        } else if (availableBalanceState instanceof AvailableBalanceState.ShowSplitBalance) {
            C19383o.m32796f(availableBalanceState, "viewState");
            availablePpBalanceView.showSplitBalance((AvailableBalanceState.ShowSplitBalance) availableBalanceState);
        } else if (availableBalanceState instanceof AvailableBalanceState.DisabledState) {
            availablePpBalanceView.setClickableState(false);
        } else if (availableBalanceState instanceof AvailableBalanceState.EnabledState) {
            availablePpBalanceView.setClickableState(true);
        }
    }

    private final void addError(String str, boolean z) {
        if (z) {
            PLog.d$default(TAG, "addError() on primary split balance called", 0, 4, (Object) null);
            this.primarySplitBalanceErrorTv.setText(str);
            this.primarySplitBalanceErrorImg.setVisibility(0);
            this.primarySplitBalanceToggle.setVisibility(4);
            return;
        }
        PLog.d$default(TAG, "addError() on secondary split balance called", 0, 4, (Object) null);
        this.secondarySplitBalanceErrorTv.setText(str);
        this.secondarySplitBalanceErrorImg.setVisibility(0);
        this.secondarySplitBalanceToggle.setVisibility(4);
    }

    private final void disableBalanceSwitch(String str, boolean z) {
        if (z) {
            this.primarySplitBalanceToggle.setEnabled(false);
            TextView textView = this.primarySplitBalanceAmountTv;
            Context context = getContext();
            int i = C17165R.color.gray_color_500;
            Object obj = C8184a.f17966a;
            textView.setTextColor(C8184a.C8188d.m16468a(context, i));
        } else {
            this.secondarySplitBalanceToggle.setEnabled(false);
            TextView textView2 = this.secondarySplitBalanceAmountTv;
            Context context2 = getContext();
            int i2 = C17165R.color.gray_color_500;
            Object obj2 = C8184a.f17966a;
            textView2.setTextColor(C8184a.C8188d.m16468a(context2, i2));
        }
        addError(str, z);
    }

    private final void enableBalanceSwitch(boolean z) {
        removeError(z);
        if (z) {
            this.primarySplitBalanceToggle.setEnabled(true);
        } else {
            this.secondarySplitBalanceToggle.setEnabled(true);
        }
    }

    private final AnimationsDelegate getAnimator() {
        return (AnimationsDelegate) this.animator$delegate.getValue();
    }

    private final AvailableBalanceViewModel getAvailableBalanceViewModel() {
        return (AvailableBalanceViewModel) this.availableBalanceViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private static /* synthetic */ void getMainPaysheetViewModel$annotations() {
    }

    private final AnimationsDelegate getSecondaryBalanceAnimator() {
        return (AnimationsDelegate) this.secondaryBalanceAnimator$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35404initViewModelObservers$lambda1(AvailablePpBalanceView availablePpBalanceView, boolean z) {
        C19383o.m32797g(availablePpBalanceView, "this$0");
        availablePpBalanceView.getAvailableBalanceViewModel().onFetchingUserDataCompleted(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35405initViewModelObservers$lambda2(AvailablePpBalanceView availablePpBalanceView, Boolean bool) {
        C19383o.m32797g(availablePpBalanceView, "this$0");
        availablePpBalanceView.getAvailableBalanceViewModel().onLogoutCompleted();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35406initViewModelObservers$lambda3(AvailablePpBalanceView availablePpBalanceView, Boolean bool) {
        C19383o.m32797g(availablePpBalanceView, "this$0");
        availablePpBalanceView.setFocusForAccessibilityAnnouncement();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-4  reason: not valid java name */
    public static final void m35407initViewModelObservers$lambda4(AvailablePpBalanceView availablePpBalanceView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(availablePpBalanceView, "this$0");
        availablePpBalanceView.getAvailableBalanceViewModel().handleContingencyEvent(contingencyEventsModel);
    }

    private final void noSplitBalance() {
        getAnimator().shrink();
    }

    private final void removeError(boolean z) {
        if (z) {
            PLog.d$default(TAG, "removeError() on primary split balance called", 0, 4, (Object) null);
            this.primarySplitBalanceErrorImg.setVisibility(8);
            this.primarySplitBalanceErrorTv.setVisibility(8);
            this.primarySplitBalanceToggle.setVisibility(0);
            return;
        }
        PLog.d$default(TAG, "removeError() on secondary split balance called", 0, 4, (Object) null);
        this.secondarySplitBalanceErrorImg.setVisibility(8);
        this.secondarySplitBalanceErrorTv.setVisibility(8);
        this.secondarySplitBalanceToggle.setVisibility(0);
    }

    private final void setClickableState(boolean z) {
        this.primarySplitBalanceErrorImg.setClickable(z);
        this.primarySplitBalanceErrorTv.setClickable(z);
        this.secondarySplitBalanceErrorImg.setClickable(z);
        this.secondarySplitBalanceErrorTv.setClickable(z);
    }

    private final void setFocusForAccessibilityAnnouncement() {
        this.primarySplitBalanceAmountTv.requestFocus();
        this.primarySplitBalanceAmountTv.sendAccessibilityEvent(8);
    }

    private final void setOnClickListener() {
        this.primarySplitBalanceErrorImg.setOnClickListener(this);
        this.primarySplitBalanceErrorTv.setOnClickListener(this);
        this.secondarySplitBalanceErrorImg.setOnClickListener(this);
        this.secondarySplitBalanceErrorTv.setOnClickListener(this);
    }

    private final void setToggleSwitchListeners() {
        this.primarySplitBalanceToggle.setOnCheckedChangeListener(new C17236a(this));
        this.secondarySplitBalanceToggle.setOnCheckedChangeListener(new C17237b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: setToggleSwitchListeners$lambda-5  reason: not valid java name */
    public static final void m35408setToggleSwitchListeners$lambda5(AvailablePpBalanceView availablePpBalanceView, CompoundButton compoundButton, boolean z) {
        C19383o.m32797g(availablePpBalanceView, "this$0");
        availablePpBalanceView.getAvailableBalanceViewModel().primarySplitBalanceToggleUpdated(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: setToggleSwitchListeners$lambda-6  reason: not valid java name */
    public static final void m35409setToggleSwitchListeners$lambda6(AvailablePpBalanceView availablePpBalanceView, CompoundButton compoundButton, boolean z) {
        C19383o.m32797g(availablePpBalanceView, "this$0");
        availablePpBalanceView.getAvailableBalanceViewModel().secondarySplitBalanceToggleUpdated(z);
    }

    private final void showSplitBalance(AvailableBalanceState.ShowSplitBalance showSplitBalance) {
        getAnimator().expand();
        this.primarySplitBalanceContainer.setVisibility(0);
        this.primarySplitBalanceInfoImg.setVisibility(0);
        this.primarySplitBalanceErrorImg.setVisibility(4);
        this.primarySplitBalanceErrorTv.setVisibility(4);
        TextView textView = this.primarySplitBalanceAmountTv;
        Context context = getContext();
        int i = C17165R.color.gray_color_700;
        Object obj = C8184a.f17966a;
        textView.setTextColor(C8184a.C8188d.m16468a(context, i));
        TextView textView2 = this.primarySplitBalanceAmountTv;
        String string = getResources().getString(showSplitBalance.getStringResource());
        C19383o.m32796f(string, "resources.getString(viewState.stringResource)");
        String format = String.format(string, Arrays.copyOf(new Object[]{showSplitBalance.getFirstSplitBalance().getAmount()}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        textView2.setText(format);
        this.primarySplitBalanceAmountTv.setVisibility(0);
        this.primarySplitBalanceToggle.setVisibility(0);
        enableBalanceSwitch(true);
        if (showSplitBalance.getFirstSplitBalance().getErrorStringId() != null) {
            String string2 = getContext().getString(showSplitBalance.getFirstSplitBalance().getErrorStringId().intValue(), new Object[]{showSplitBalance.getFirstSplitBalance().getCurrency(), showSplitBalance.getSplitBalanceCurrency()});
            C19383o.m32796f(string2, "context.getString(\n     …nceCurrency\n            )");
            disableBalanceSwitch(string2, true);
        }
        if (showSplitBalance.getSecondSplitBalance() == null) {
            View view = this.secondarySplitBalanceContainer;
            if (view != null) {
                view.setVisibility(8);
                this.secondarySplitBalanceToggle.setEnabled(false);
                return;
            }
            C19383o.m32805o("secondarySplitBalanceContainer");
            throw null;
        }
        View view2 = this.secondarySplitBalanceContainer;
        if (view2 != null) {
            view2.setVisibility(0);
            this.secondarySplitBalanceErrorImg.setVisibility(4);
            this.secondarySplitBalanceErrorTv.setVisibility(4);
            this.secondarySplitBalanceAmountTv.setTextColor(C8184a.C8188d.m16468a(getContext(), i));
            TextView textView3 = this.secondarySplitBalanceAmountTv;
            String string3 = getResources().getString(showSplitBalance.getStringResource());
            C19383o.m32796f(string3, "resources.getString(viewState.stringResource)");
            String format2 = String.format(string3, Arrays.copyOf(new Object[]{showSplitBalance.getSecondSplitBalance().getAmount()}, 1));
            C19383o.m32796f(format2, "format(format, *args)");
            textView3.setText(format2);
            this.secondarySplitBalanceAmountTv.setVisibility(0);
            this.secondarySplitBalanceToggle.setVisibility(0);
            enableBalanceSwitch(false);
            getSecondaryBalanceAnimator().expand();
            if (showSplitBalance.getSecondSplitBalance().getErrorStringId() != null) {
                String string4 = getContext().getString(showSplitBalance.getSecondSplitBalance().getErrorStringId().intValue(), new Object[]{showSplitBalance.getSecondSplitBalance().getCurrency(), showSplitBalance.getSplitBalanceCurrency()});
                C19383o.m32796f(string4, "context.getString(\n     …urrency\n                )");
                disableBalanceSwitch(string4, false);
                return;
            }
            return;
        }
        C19383o.m32805o("secondarySplitBalanceContainer");
        throw null;
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
        getAvailableBalanceViewModel().initEventListeners();
        C6467l lVar = new C6467l(this, 7);
        C6468m mVar = new C6468m(this, 8);
        C6469n nVar = new C6469n(this, 12);
        C6346d dVar = new C6346d(this, 7);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, lVar);
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(componentActivity, mVar);
        getMainPaysheetViewModel().getPaymentSourceCardViewClickedFlag().observe(componentActivity, nVar);
        getMainPaysheetViewModel().getContingencyEventsModel().observe(componentActivity, dVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        int id = view.getId();
        if (id == C17165R.C17167id.primary_split_balance_error_img) {
            this.primarySplitBalanceErrorImg.setVisibility(8);
            this.primarySplitBalanceErrorTv.setVisibility(0);
        } else if (id == C17165R.C17167id.primary_split_balance_error_tv) {
            this.primarySplitBalanceErrorImg.setVisibility(0);
            this.primarySplitBalanceErrorTv.setVisibility(8);
        } else if (id == C17165R.C17167id.secondary_split_balance_error_img) {
            this.secondarySplitBalanceErrorImg.setVisibility(8);
            this.secondarySplitBalanceErrorTv.setVisibility(0);
        } else if (id == C17165R.C17167id.secondary_split_balance_error_tv) {
            this.secondarySplitBalanceErrorImg.setVisibility(0);
            this.secondarySplitBalanceErrorTv.setVisibility(8);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAvailableBalanceViewModel().clearLiveData();
    }

    public void removeListeners() {
        getAvailableBalanceViewModel().removeAllListeners();
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailablePpBalanceView(Context context, AttributeSet attributeSet, int i) {
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
                this.availableBalanceViewModel$delegate = new C2868j0(C19386q.m32807a(AvailableBalanceViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                this.animator$delegate = AnimationsDelegateKt.viewAnimator(new AvailablePpBalanceView$animator$2(this));
                this.secondaryBalanceAnimator$delegate = AnimationsDelegateKt.viewAnimator(new AvailablePpBalanceView$secondaryBalanceAnimator$2(this));
                View.inflate(context2, C17165R.C17169layout.paypal_split_balance_view, this);
                View findViewById = findViewById(C17165R.C17167id.primary_split_balance_container);
                C19383o.m32796f(findViewById, "findViewById(R.id.primary_split_balance_container)");
                this.primarySplitBalanceContainer = findViewById;
                View findViewById2 = findViewById(C17165R.C17167id.primary_split_balance_error_tv);
                C19383o.m32796f(findViewById2, "findViewById(R.id.primary_split_balance_error_tv)");
                this.primarySplitBalanceErrorTv = (TextView) findViewById2;
                View findViewById3 = findViewById(C17165R.C17167id.primary_split_balance_info_img);
                C19383o.m32796f(findViewById3, "findViewById(R.id.primary_split_balance_info_img)");
                this.primarySplitBalanceInfoImg = (ImageView) findViewById3;
                View findViewById4 = findViewById(C17165R.C17167id.primary_split_balance_error_img);
                C19383o.m32796f(findViewById4, "findViewById(R.id.primary_split_balance_error_img)");
                this.primarySplitBalanceErrorImg = (ImageView) findViewById4;
                View findViewById5 = findViewById(C17165R.C17167id.primary_split_balance_toggle);
                C19383o.m32796f(findViewById5, "findViewById(R.id.primary_split_balance_toggle)");
                this.primarySplitBalanceToggle = (ToggleSwitchView) findViewById5;
                View findViewById6 = findViewById(C17165R.C17167id.primary_split_balance_amount_tv);
                C19383o.m32796f(findViewById6, "findViewById(R.id.primary_split_balance_amount_tv)");
                this.primarySplitBalanceAmountTv = (TextView) findViewById6;
                View findViewById7 = findViewById(C17165R.C17167id.secondary_split_balance_container);
                C19383o.m32796f(findViewById7, "findViewById(R.id.second…_split_balance_container)");
                this.secondarySplitBalanceContainer = findViewById7;
                View findViewById8 = findViewById(C17165R.C17167id.secondary_split_balance_error_tv);
                C19383o.m32796f(findViewById8, "findViewById(R.id.second…y_split_balance_error_tv)");
                this.secondarySplitBalanceErrorTv = (TextView) findViewById8;
                View findViewById9 = findViewById(C17165R.C17167id.secondary_split_balance_error_img);
                C19383o.m32796f(findViewById9, "findViewById(R.id.second…_split_balance_error_img)");
                this.secondarySplitBalanceErrorImg = (ImageView) findViewById9;
                View findViewById10 = findViewById(C17165R.C17167id.secondary_split_balance_toggle);
                C19383o.m32796f(findViewById10, "findViewById(R.id.secondary_split_balance_toggle)");
                this.secondarySplitBalanceToggle = (ToggleSwitchView) findViewById10;
                View findViewById11 = findViewById(C17165R.C17167id.secondary_split_balance_amount_tv);
                C19383o.m32796f(findViewById11, "findViewById(R.id.second…_split_balance_amount_tv)");
                this.secondarySplitBalanceAmountTv = (TextView) findViewById11;
                this.primarySplitBalanceToggle.setVisibility(0);
                this.primarySplitBalanceAmountTv.setVisibility(0);
                this.primarySplitBalanceErrorImg.setVisibility(8);
                this.primarySplitBalanceErrorTv.setVisibility(8);
                this.secondarySplitBalanceToggle.setVisibility(0);
                this.secondarySplitBalanceAmountTv.setVisibility(0);
                this.secondarySplitBalanceErrorImg.setVisibility(8);
                this.secondarySplitBalanceErrorTv.setVisibility(8);
                setVisibility(8);
                setOnClickListener();
                setToggleSwitchListeners();
                initViewModelObservers();
                getAvailableBalanceViewModel().getViewState().observe(getComponentActivity(context), new C9904g(this, 9));
                return;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
