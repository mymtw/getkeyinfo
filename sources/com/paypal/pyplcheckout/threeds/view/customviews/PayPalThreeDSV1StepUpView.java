package com.paypal.pyplcheckout.threeds.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
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
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.threeds.AssetUtils;
import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import com.paypal.pyplcheckout.threeds.view.fragments.PYPLThreeDSV1Fragment;
import com.paypal.pyplcheckout.threeds.view.interfaces.PayPalThreeDSV1StepUpViewListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor", "SetJavaScriptEnabled"})
public final class PayPalThreeDSV1StepUpView extends RelativeLayout implements ContentView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String JAVSCRIPT_INTERFACE_NAME = "ConsumerVenice";
    public static final String TAG = "PayPalThreeDSV1StepUpView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private PayPalThreeDSV1StepUpViewListener payPalThreeDSV1StepUpViewListener;
    private EventListener submitClickedListener;
    /* access modifiers changed from: private */
    public WebView threeDSWebView;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class ThreeDsJavascriptInterface {
        public final /* synthetic */ PayPalThreeDSV1StepUpView this$0;

        public ThreeDsJavascriptInterface(PayPalThreeDSV1StepUpView payPalThreeDSV1StepUpView) {
            C19383o.m32797g(payPalThreeDSV1StepUpView, "this$0");
            this.this$0 = payPalThreeDSV1StepUpView;
        }

        /* access modifiers changed from: private */
        /* renamed from: onSubmitClicked$lambda-0  reason: not valid java name */
        public static final void m35446onSubmitClicked$lambda0() {
            Events.Companion.getInstance().fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(new ContingencyEventsModel(ContingencyType.THREE_DS_V1_CONTINGENCY, ContingencyProcessingStatus.THREE_DS_SUBMIT_CLICKED, (Exception) null, (String) null, (ThreeDSSource) null, 28, (DefaultConstructorMarker) null)));
        }

        @JavascriptInterface
        public final void onSubmitClicked() {
            this.this$0.threeDSWebView.post(new C17271a());
        }
    }

    static {
        Class<PayPalThreeDSV1StepUpView> cls = PayPalThreeDSV1StepUpView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalThreeDSV1StepUpView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalThreeDSV1StepUpViewListener payPalThreeDSV1StepUpViewListener2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalThreeDSV1StepUpViewListener2);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private final void init() {
        setUPJavascriptInterface();
        setUPWebChromeClient();
        WebView webView = this.threeDSWebView;
        AssetUtils assetUtils = AssetUtils.INSTANCE;
        String threeDSV1Url = getViewModel().getThreeDSV1Url();
        C19383o.m32796f(threeDSV1Url, "viewModel.threeDSV1Url");
        String threeDSV1JWT = getViewModel().getThreeDSV1JWT();
        C19383o.m32796f(threeDSV1JWT, "viewModel.threeDSV1JWT");
        webView.loadData(assetUtils.generate3DS10HTML(threeDSV1Url, threeDSV1JWT), "text/html; charset=utf-8", "UTF-8");
        this.submitClickedListener = new C17143a(this, 4);
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CONTINGENCY_EVENT;
        EventListener eventListener = this.submitClickedListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
        } else {
            C19383o.m32805o("submitClickedListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: init$lambda-0  reason: not valid java name */
    public static final void m35445init$lambda0(PayPalThreeDSV1StepUpView payPalThreeDSV1StepUpView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalThreeDSV1StepUpView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ContingencyProcessingStatus contingencyProcessingStatus = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        ContingencyEventsModel contingencyEventsModel = data instanceof ContingencyEventsModel ? (ContingencyEventsModel) data : null;
        if (contingencyEventsModel != null) {
            contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        }
        if (contingencyProcessingStatus == ContingencyProcessingStatus.THREE_DS_SUBMIT_CLICKED) {
            payPalThreeDSV1StepUpView.getViewModel().finishFragment(PYPLThreeDSV1Fragment.TAG, payPalThreeDSV1StepUpView.fragment);
            payPalThreeDSV1StepUpView.getViewModel().threeDSAuthenticateAndComplete();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private final void setUPJavascriptInterface() {
        this.threeDSWebView.getSettings().setJavaScriptEnabled(true);
        this.threeDSWebView.addJavascriptInterface(new ThreeDsJavascriptInterface(this), JAVSCRIPT_INTERFACE_NAME);
    }

    private final void setUPWebChromeClient() {
        this.threeDSWebView.setWebChromeClient(new PayPalThreeDSV1StepUpView$setUPWebChromeClient$1());
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

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CONTINGENCY_EVENT;
        EventListener eventListener = this.submitClickedListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
        } else {
            C19383o.m32805o("submitClickedListener");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalThreeDSV1StepUpView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalThreeDSV1StepUpViewListener payPalThreeDSV1StepUpViewListener2) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context, C17165R.C17169layout.paypal_three_ds_v1_step_up_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.three_ds_web_view);
            C19383o.m32796f(findViewById, "findViewById(R.id.three_ds_web_view)");
            this.threeDSWebView = (WebView) findViewById;
            this.payPalThreeDSV1StepUpViewListener = payPalThreeDSV1StepUpViewListener2;
            init();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
