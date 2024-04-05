package com.paypal.pyplcheckout.billingagreements.view.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.C0388a;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.ccm.C9499h;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTermsState;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.view.customviews.LinkTextView;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalBillingAgreementsTermsBodyView extends FrameLayout implements ICustomViewsViewModel, ContentView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalBillingAgreementsTermsBodyView";
    public Map<Integer, View> _$_findViewCache;
    private final LinkTextView text;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalBillingAgreementsTermsBodyView.TAG;
        }
    }

    static {
        Class<PayPalBillingAgreementsTermsBodyView> cls = PayPalBillingAgreementsTermsBodyView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalBillingAgreementsTermsBodyView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final BillingAgreementsViewModel getViewModel() {
        return (BillingAgreementsViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35220initViewModelObservers$lambda0(PayPalBillingAgreementsTermsBodyView payPalBillingAgreementsTermsBodyView, BaTermsState baTermsState) {
        C19383o.m32797g(payPalBillingAgreementsTermsBodyView, "this$0");
        C19383o.m32797g(baTermsState, "state");
        payPalBillingAgreementsTermsBodyView.showText(baTermsState);
    }

    private final void showText(BaTermsState baTermsState) {
        if (baTermsState instanceof BaTermsState.ShowText) {
            setVisibility(0);
            this.text.setText(getResources().getString(((BaTermsState.ShowText) baTermsState).getStringRes()));
        } else if (baTermsState instanceof BaTermsState.ShowLinkText) {
            setVisibility(0);
            BaTermsState.ShowLinkText showLinkText = (BaTermsState.ShowLinkText) baTermsState;
            String string = getResources().getString(showLinkText.getStringRes());
            C19383o.m32796f(string, "resources.getString(state.stringRes)");
            String e = C0388a.m1049e(new Object[]{showLinkText.getMerchantName()}, 1, string, "format(format, *args)");
            this.text.setLinkText(e, showLinkText.getUrl());
        } else if (baTermsState instanceof BaTermsState.Hide) {
            setVisibility(8);
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

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public void initViewModelObservers() {
        getViewModel().getBaTermsState().observe(getLifecycleOwner(this), new C9499h(this, 3));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalBillingAgreementsTermsBodyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(BillingAgreementsViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context), sdkComponentKt$activityViewModels$1);
            View.inflate(context, C17165R.C17169layout.paypal_billing_agreements_terms_body, this);
            View findViewById = findViewById(C17165R.C17167id.ba_terms_text);
            C19383o.m32796f(findViewById, "findViewById(R.id.ba_terms_text)");
            this.text = (LinkTextView) findViewById;
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
