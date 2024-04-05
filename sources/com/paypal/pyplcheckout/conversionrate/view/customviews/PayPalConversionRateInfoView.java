package com.paypal.pyplcheckout.conversionrate.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6466k;
import com.etsy.android.feedback.C6467l;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.ccm.C9499h;
import com.etsy.android.p327ui.conversation.details.ccm.C9500i;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9663d;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.conversionrate.view.fragments.PYPLConversionRateFragment;
import com.paypal.pyplcheckout.conversionrate.view.interfaces.PayPalConversionRateInfoViewListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.CurrencyConversionType;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

@SuppressLint({"ViewConstructor"})
public final class PayPalConversionRateInfoView extends RelativeLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalConversionRateInfoView";
    public Map<Integer, View> _$_findViewCache;
    private PayPalActionButton conversionCurrencyButton;
    private TextView conversionLeftCurrencyTextView;
    private View conversionLeftCurrencyUnderlineView;
    private TextView conversionLeftRateTextView;
    private TextView conversionLeftSpreadFineTextView;
    private TextView conversionRightCurrencyTextView;
    private View conversionRightCurrencyUnderlineView;
    private TextView conversionRightFineTextView;
    private TextView conversionTotalAmountCurrencyTextView;
    private TextView conversionTotalPayTitleTextView;
    private String formattedConvertedAmount;
    private final Fragment fragment;
    private boolean mCardIssuerConversionMode;
    private PayPalConversionRateInfoViewListener mPayPalConversionRateInfoViewListener;
    private String totalFormat;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalConversionRateInfoView.TAG;
        }
    }

    static {
        Class<PayPalConversionRateInfoView> cls = PayPalConversionRateInfoView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalConversionRateInfoView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalConversionRateInfoViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalConversionRateInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalConversionRateInfoViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalConversionRateInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalConversionRateInfoViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalConversionRateInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalConversionRateInfoViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalConversionRateInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalConversionRateInfoViewListener);
    }

    private final void changeTabViewsVisibilityAndColor(boolean z) {
        if (z) {
            this.conversionLeftRateTextView.setVisibility(4);
            this.conversionLeftSpreadFineTextView.setVisibility(4);
            View view = this.conversionLeftCurrencyUnderlineView;
            Context context = getContext();
            int i = C17165R.color.gray_color_300;
            Object obj = C8184a.f17966a;
            view.setBackgroundColor(C8184a.C8188d.m16468a(context, i));
            View view2 = this.conversionRightCurrencyUnderlineView;
            Context context2 = getContext();
            int i2 = C17165R.color.blue_color_600;
            view2.setBackgroundColor(C8184a.C8188d.m16468a(context2, i2));
            this.conversionLeftCurrencyTextView.setTextColor(C8184a.C8188d.m16468a(getContext(), C17165R.color.gray_color_600));
            this.conversionRightCurrencyTextView.setTextColor(C8184a.C8188d.m16468a(getContext(), i2));
            this.conversionRightFineTextView.setVisibility(0);
            return;
        }
        this.conversionLeftRateTextView.setVisibility(0);
        this.conversionLeftSpreadFineTextView.setVisibility(0);
        View view3 = this.conversionRightCurrencyUnderlineView;
        Context context3 = getContext();
        int i3 = C17165R.color.gray_color_300;
        Object obj2 = C8184a.f17966a;
        view3.setBackgroundColor(C8184a.C8188d.m16468a(context3, i3));
        View view4 = this.conversionLeftCurrencyUnderlineView;
        Context context4 = getContext();
        int i4 = C17165R.color.blue_color_600;
        view4.setBackgroundColor(C8184a.C8188d.m16468a(context4, i4));
        this.conversionRightCurrencyTextView.setTextColor(C8184a.C8188d.m16468a(getContext(), C17165R.color.gray_color_600));
        this.conversionLeftCurrencyTextView.setTextColor(C8184a.C8188d.m16468a(getContext(), i4));
        this.conversionRightFineTextView.setVisibility(4);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleConversionRateOnClickAction() {
        CurrencyConversionType currencyConversionType;
        boolean z = this.mCardIssuerConversionMode;
        if (z) {
            currencyConversionType = CurrencyConversionType.VENDOR;
        } else {
            currencyConversionType = CurrencyConversionType.PAYPAL;
        }
        handleConversionRateOnClickAction(currencyConversionType, z);
        PLog.click$default(PEnums.TransitionName.CURRENCY_OPTION_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.CURRENCY_CONVERSION, currencyConversionType.toString(), "currency_conversion_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener = this.mPayPalConversionRateInfoViewListener;
        if (payPalConversionRateInfoViewListener != null) {
            payPalConversionRateInfoViewListener.onPayPalConversionRateClicked(currencyConversionType, this.mCardIssuerConversionMode);
        }
    }

    private final void handleLeftCurrencyTabOnClickAction() {
        this.conversionCurrencyButton.updateButtonText(getContext().getString(C17165R.string.paypal_checkout_use_with_format, new Object[]{this.conversionLeftCurrencyTextView.getText().toString()}));
        this.mCardIssuerConversionMode = false;
        this.conversionTotalPayTitleTextView.setText(getContext().getString(C17165R.string.paypal_checkout_you_ll_pay2));
        this.conversionTotalAmountCurrencyTextView.setText(this.formattedConvertedAmount);
        changeTabViewsVisibilityAndColor(false);
    }

    private final void handleRightCurrencyTabOnClickAction() {
        this.conversionCurrencyButton.updateButtonText(getContext().getString(C17165R.string.paypal_checkout_use_with_format, new Object[]{this.conversionRightCurrencyTextView.getText().toString()}));
        this.conversionTotalPayTitleTextView.setText(getContext().getString(C17165R.string.paypal_checkout_convert_with_card_issuer_a));
        this.conversionTotalAmountCurrencyTextView.setText(this.totalFormat);
        this.mCardIssuerConversionMode = true;
        changeTabViewsVisibilityAndColor(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35238initViewModelObservers$lambda0(PayPalConversionRateInfoView payPalConversionRateInfoView, String str) {
        C19383o.m32797g(payPalConversionRateInfoView, "this$0");
        payPalConversionRateInfoView.conversionLeftCurrencyTextView.setText(str);
        if (!payPalConversionRateInfoView.mCardIssuerConversionMode) {
            payPalConversionRateInfoView.conversionCurrencyButton.updateButtonText(payPalConversionRateInfoView.getContext().getString(C17165R.string.paypal_checkout_use_with_format, new Object[]{str}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35239initViewModelObservers$lambda1(PayPalConversionRateInfoView payPalConversionRateInfoView, String str) {
        C19383o.m32797g(payPalConversionRateInfoView, "this$0");
        payPalConversionRateInfoView.conversionTotalAmountCurrencyTextView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35240initViewModelObservers$lambda2(PayPalConversionRateInfoView payPalConversionRateInfoView, String str) {
        C19383o.m32797g(payPalConversionRateInfoView, "this$0");
        TextView textView = payPalConversionRateInfoView.conversionLeftRateTextView;
        String string = payPalConversionRateInfoView.getResources().getString(C17165R.string.paypal_checkout_paypal_conversion_rate_dynamic);
        C19383o.m32796f(string, "resources\n              …_conversion_rate_dynamic)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        C19383o.m32796f(format, "format(format, *args)");
        textView.setText(format);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35241initViewModelObservers$lambda3(PayPalConversionRateInfoView payPalConversionRateInfoView, String str) {
        C19383o.m32797g(payPalConversionRateInfoView, "this$0");
        payPalConversionRateInfoView.conversionRightCurrencyTextView.setText(str);
        if (payPalConversionRateInfoView.mCardIssuerConversionMode) {
            payPalConversionRateInfoView.conversionCurrencyButton.updateButtonText(payPalConversionRateInfoView.getContext().getString(C17165R.string.paypal_checkout_use_with_format, new Object[]{str}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-4  reason: not valid java name */
    public static final void m35242initViewModelObservers$lambda4(PayPalConversionRateInfoView payPalConversionRateInfoView, String str) {
        C19383o.m32797g(payPalConversionRateInfoView, "this$0");
        payPalConversionRateInfoView.totalFormat = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-5  reason: not valid java name */
    public static final void m35243initViewModelObservers$lambda5(PayPalConversionRateInfoView payPalConversionRateInfoView, String str) {
        C19383o.m32797g(payPalConversionRateInfoView, "this$0");
        payPalConversionRateInfoView.formattedConvertedAmount = str;
    }

    private final void setOnClickListener() {
        this.conversionLeftCurrencyTextView.setOnClickListener(this);
        this.conversionLeftCurrencyUnderlineView.setOnClickListener(this);
        this.conversionRightCurrencyTextView.setOnClickListener(this);
        this.conversionRightCurrencyUnderlineView.setOnClickListener(this);
        this.conversionCurrencyButton.setOnClickListener(this);
    }

    private final void setupAdvanceChoice() {
        if (this.mCardIssuerConversionMode) {
            this.conversionRightCurrencyTextView.performClick();
            PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener = this.mPayPalConversionRateInfoViewListener;
            if (payPalConversionRateInfoViewListener != null) {
                payPalConversionRateInfoViewListener.onPayPalConversionRateClicked(CurrencyConversionType.VENDOR, this.mCardIssuerConversionMode);
                return;
            }
            return;
        }
        this.conversionLeftCurrencyTextView.performClick();
        PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener2 = this.mPayPalConversionRateInfoViewListener;
        if (payPalConversionRateInfoViewListener2 != null) {
            payPalConversionRateInfoViewListener2.onPayPalConversionRateClicked(CurrencyConversionType.PAYPAL, this.mCardIssuerConversionMode);
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

    public void initViewModelObservers() {
        C9499h hVar = new C9499h(this, 4);
        C9500i iVar = new C9500i(this, 3);
        C9663d dVar = new C9663d(this, 2);
        C6466k kVar = new C6466k(this, 3);
        C6467l lVar = new C6467l(this, 2);
        C6468m mVar = new C6468m(this, 3);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getViewModel().getFromConversionFormat().observe(componentActivity, hVar);
        getViewModel().getFormattedConversionToAmount().observe(componentActivity, iVar);
        getViewModel().getConversionRate().observe(componentActivity, dVar);
        getViewModel().getToConversionFormat().observe(componentActivity, kVar);
        getViewModel().getTotalFormat().observe(componentActivity, lVar);
        getViewModel().getFormattedConvertedAmount().observe(componentActivity, mVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        int id = view.getId();
        boolean z = false;
        if (id == C17165R.C17167id.conversionRightCurrencyTextView || id == C17165R.C17167id.conversionRightCurrencyUnderlineView) {
            handleRightCurrencyTabOnClickAction();
            return;
        }
        if (id == C17165R.C17167id.conversionLeftCurrencyTextView || id == C17165R.C17167id.conversionLeftCurrencyUnderlineView) {
            z = true;
        }
        if (z) {
            handleLeftCurrencyTabOnClickAction();
        } else if (id == C17165R.C17167id.conversionCurrencyButton) {
            handleConversionRateOnClickAction();
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalConversionRateInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalConversionRateInfoViewListener payPalConversionRateInfoViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_conversion_rate_info_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.conversionLeftCurrencyTextView);
            C19383o.m32796f(findViewById, "findViewById(R.id.conversionLeftCurrencyTextView)");
            this.conversionLeftCurrencyTextView = (TextView) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.conversionLeftCurrencyUnderlineView);
            C19383o.m32796f(findViewById2, "findViewById(R.id.conver…eftCurrencyUnderlineView)");
            this.conversionLeftCurrencyUnderlineView = findViewById2;
            View findViewById3 = findViewById(C17165R.C17167id.conversionRightCurrencyTextView);
            C19383o.m32796f(findViewById3, "findViewById(R.id.conversionRightCurrencyTextView)");
            this.conversionRightCurrencyTextView = (TextView) findViewById3;
            View findViewById4 = findViewById(C17165R.C17167id.conversionRightCurrencyUnderlineView);
            C19383o.m32796f(findViewById4, "findViewById(R.id.conver…ghtCurrencyUnderlineView)");
            this.conversionRightCurrencyUnderlineView = findViewById4;
            View findViewById5 = findViewById(C17165R.C17167id.conversionTotalPayTitleTextView);
            C19383o.m32796f(findViewById5, "findViewById(R.id.conversionTotalPayTitleTextView)");
            this.conversionTotalPayTitleTextView = (TextView) findViewById5;
            View findViewById6 = findViewById(C17165R.C17167id.conversionTotalAmountCurrencyTextView);
            C19383o.m32796f(findViewById6, "findViewById(R.id.conver…alAmountCurrencyTextView)");
            this.conversionTotalAmountCurrencyTextView = (TextView) findViewById6;
            View findViewById7 = findViewById(C17165R.C17167id.conversionRightFineTextView);
            C19383o.m32796f(findViewById7, "findViewById(R.id.conversionRightFineTextView)");
            this.conversionRightFineTextView = (TextView) findViewById7;
            View findViewById8 = findViewById(C17165R.C17167id.conversionLeftRateTextView);
            C19383o.m32796f(findViewById8, "findViewById(R.id.conversionLeftRateTextView)");
            this.conversionLeftRateTextView = (TextView) findViewById8;
            View findViewById9 = findViewById(C17165R.C17167id.conversionLeftSpreadFineTextView);
            C19383o.m32796f(findViewById9, "findViewById(R.id.conver…onLeftSpreadFineTextView)");
            this.conversionLeftSpreadFineTextView = (TextView) findViewById9;
            View findViewById10 = findViewById(C17165R.C17167id.conversionCurrencyButton);
            C19383o.m32796f(findViewById10, "findViewById(R.id.conversionCurrencyButton)");
            PayPalActionButton payPalActionButton = (PayPalActionButton) findViewById10;
            this.conversionCurrencyButton = payPalActionButton;
            payPalActionButton.setShape(ActionButtonShape.MATERIAL_DESIGN);
            this.mPayPalConversionRateInfoViewListener = payPalConversionRateInfoViewListener;
            this.conversionLeftCurrencyTextView.setVisibility(0);
            this.conversionRightCurrencyTextView.setVisibility(0);
            this.conversionLeftRateTextView.setVisibility(0);
            this.conversionTotalPayTitleTextView.setText(context2.getString(C17165R.string.paypal_checkout_you_ll_pay2));
            this.conversionCurrencyButton.setVisibility(0);
            setOnClickListener();
            setupAdvanceChoice();
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }

    private final void handleConversionRateOnClickAction(CurrencyConversionType currencyConversionType, boolean z) {
        this.mCardIssuerConversionMode = z;
        getViewModel().setConversionType(currencyConversionType);
        getViewModel().setIsCurrencyConverted(true);
        getViewModel().finishFragment(PYPLConversionRateFragment.TAG, this.fragment);
        PEnums.TransitionName transitionName = PEnums.TransitionName.CURRENCY_SELECTION_SUBMITTED;
        PEnums.Outcome outcome = PEnums.Outcome.CLICKED;
        PEnums.EventCode eventCode = PEnums.EventCode.E101;
        PEnums.TransitionName transitionName2 = transitionName;
        PEnums.StateName stateName = PEnums.StateName.CURRENCY_CONVERSION;
        PLog.click$default(transitionName2, outcome, eventCode, stateName, currencyConversionType.toString(), "currency_conversion_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.decision$default(transitionName2, PEnums.Outcome.SUCCEEDED, PEnums.EventCode.E141, stateName, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
    }
}
