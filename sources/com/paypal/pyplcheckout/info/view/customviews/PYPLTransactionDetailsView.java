package com.paypal.pyplcheckout.info.view.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.feedback.view.C6486a;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9904g;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonColor;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.AppBuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLTransactionDetailsView extends RelativeLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLTransactionDetailsView";
    public Map<Integer, View> _$_findViewCache;
    private TextView buttonSessionIDTextView;
    private String ecTokenText;
    private TextView ecTokenTextView;
    private EventListener finishedCheckoutListener;
    private PayPalActionButton payNowBtn;
    private RelativeLayout payNowContainer;
    private ProgressBar payNowPb;
    private TextView sessionIDTextView;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PYPLTransactionDetailsView> cls = PYPLTransactionDetailsView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, 14, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, 12, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PYPLTransactionDetailsView(Context context, AttributeSet attributeSet, int i, Fragment fragment, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m35418_init_$lambda0(PYPLTransactionDetailsView pYPLTransactionDetailsView, View view) {
        C19383o.m32797g(pYPLTransactionDetailsView, "this$0");
        pYPLTransactionDetailsView.payNowPb.setVisibility(0);
        Events.Companion.getInstance().fire(PayPalEventTypes.FINALIZE_CHECKOUT, new Success(Boolean.TRUE));
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35419initViewModelObservers$lambda1(PYPLTransactionDetailsView pYPLTransactionDetailsView, String str) {
        C19383o.m32797g(pYPLTransactionDetailsView, "this$0");
        C19383o.m32796f(str, "ecToken");
        pYPLTransactionDetailsView.ecTokenText = str;
        pYPLTransactionDetailsView.ecTokenTextView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35420initViewModelObservers$lambda2(PYPLTransactionDetailsView pYPLTransactionDetailsView, String str) {
        C19383o.m32797g(pYPLTransactionDetailsView, "this$0");
        TextView textView = pYPLTransactionDetailsView.buttonSessionIDTextView;
        if (str == null) {
            str = "";
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
        C6346d dVar = new C6346d(this, 8);
        C9904g gVar = new C9904g(this, 10);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getViewModel().getPayToken().observe(componentActivity, dVar);
        getViewModel().getButtonSessionId().observe(componentActivity, gVar);
        this.finishedCheckoutListener = new PYPLTransactionDetailsView$initViewModelObservers$1();
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.FINISHED_CHECKOUT_ON_APPROVE;
        EventListener eventListener = this.finishedCheckoutListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
        } else {
            C19383o.m32805o("finishedCheckoutListener");
            throw null;
        }
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.FINISHED_CHECKOUT_ON_APPROVE;
        EventListener eventListener = this.finishedCheckoutListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
        } else {
            C19383o.m32805o("finishedCheckoutListener");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.ecTokenText = "";
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_transaction_details_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.ec_token_text);
            C19383o.m32796f(findViewById, "findViewById(R.id.ec_token_text)");
            this.ecTokenTextView = (TextView) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.button_session_text);
            C19383o.m32796f(findViewById2, "findViewById(R.id.button_session_text)");
            this.buttonSessionIDTextView = (TextView) findViewById2;
            View findViewById3 = findViewById(C17165R.C17167id.session_text);
            C19383o.m32796f(findViewById3, "findViewById(R.id.session_text)");
            this.sessionIDTextView = (TextView) findViewById3;
            View findViewById4 = findViewById(C17165R.C17167id.pay_now_container);
            C19383o.m32796f(findViewById4, "findViewById(R.id.pay_now_container)");
            this.payNowContainer = (RelativeLayout) findViewById4;
            View findViewById5 = findViewById(C17165R.C17167id.pay_now_btn);
            C19383o.m32796f(findViewById5, "findViewById(R.id.pay_now_btn)");
            this.payNowBtn = (PayPalActionButton) findViewById5;
            View findViewById6 = findViewById(C17165R.C17167id.pay_now_progress_spinner);
            C19383o.m32796f(findViewById6, "findViewById(R.id.pay_now_progress_spinner)");
            this.payNowPb = (ProgressBar) findViewById6;
            this.payNowBtn.setShape(ActionButtonShape.MATERIAL_DESIGN);
            this.payNowBtn.setColor(ActionButtonColor.GRAY);
            this.payNowBtn.updateButtonText(getResources().getString(C17165R.string.paypal_checkout_pay_now));
            if (AppBuildConfig.INSTANCE.getDebug()) {
                this.payNowContainer.setVisibility(0);
                this.payNowBtn.setOnClickListener(new C6486a(this, 6));
            }
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
