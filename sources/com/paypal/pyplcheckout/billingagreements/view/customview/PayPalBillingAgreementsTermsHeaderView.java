package com.paypal.pyplcheckout.billingagreements.view.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p114g4.C6867g;

public final class PayPalBillingAgreementsTermsHeaderView extends FrameLayout implements ContentView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalBillingAgreementsTermsHeaderView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalBillingAgreementsTermsHeaderView.TAG;
        }
    }

    static {
        Class<PayPalBillingAgreementsTermsHeaderView> cls = PayPalBillingAgreementsTermsHeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalBillingAgreementsTermsHeaderView(Context context, AttributeSet attributeSet, Fragment fragment2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, fragment2);
    }

    private final BillingAgreementsViewModel getViewModel() {
        return (BillingAgreementsViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttachedToWindow$lambda-0  reason: not valid java name */
    public static final void m35223onAttachedToWindow$lambda0(PayPalBillingAgreementsTermsHeaderView payPalBillingAgreementsTermsHeaderView, View view) {
        C19383o.m32797g(payPalBillingAgreementsTermsHeaderView, "this$0");
        payPalBillingAgreementsTermsHeaderView.onBackClicked();
    }

    private final void onBackClicked() {
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            getViewModel().closeTermsFragment(fragment2);
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

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        findViewById(C17165R.C17167id.back_arrow).setOnClickListener(new C6867g(this, 3));
        ((TextView) findViewById(C17165R.C17167id.title)).setText(getResources().getString(getViewModel().getBillingAgreementsTermsHeaderText()));
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalBillingAgreementsTermsHeaderView(Context context, AttributeSet attributeSet, Fragment fragment2) {
        super(context, attributeSet);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(BillingAgreementsViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_billing_agreements_terms_header, this);
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalBillingAgreementsTermsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (Fragment) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
