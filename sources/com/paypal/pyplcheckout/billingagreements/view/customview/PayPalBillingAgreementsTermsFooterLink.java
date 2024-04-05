package com.paypal.pyplcheckout.billingagreements.view.customview;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.ccm.C9500i;
import com.etsy.android.stylekit.views.C9061l;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BaTermsFooterState;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.extensions.ViewExtensionsKt;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalBillingAgreementsTermsFooterLink extends FrameLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalBillingAgreementsTermsFooterLink";
    public Map<Integer, View> _$_findViewCache;
    private TextView linkText;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalBillingAgreementsTermsFooterLink.TAG;
        }
    }

    static {
        Class<PayPalBillingAgreementsTermsFooterLink> cls = PayPalBillingAgreementsTermsFooterLink.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalBillingAgreementsTermsFooterLink(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void bindViews() {
        View findViewById = findViewById(C17165R.C17167id.link_text);
        C19383o.m32796f(findViewById, "findViewById(R.id.link_text)");
        this.linkText = (TextView) findViewById;
    }

    private final BillingAgreementsViewModel getViewModel() {
        return (BillingAgreementsViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35221initViewModelObservers$lambda1(PayPalBillingAgreementsTermsFooterLink payPalBillingAgreementsTermsFooterLink, BaTermsFooterState baTermsFooterState) {
        boolean z;
        C19383o.m32797g(payPalBillingAgreementsTermsFooterLink, "this$0");
        int i = 0;
        if (baTermsFooterState instanceof BaTermsFooterState.Hide) {
            z = false;
        } else if (baTermsFooterState instanceof BaTermsFooterState.ShowLink) {
            TextView textView = payPalBillingAgreementsTermsFooterLink.linkText;
            if (textView != null) {
                textView.setOnClickListener(new C9061l(3, payPalBillingAgreementsTermsFooterLink, baTermsFooterState));
                z = true;
            } else {
                C19383o.m32805o("linkText");
                throw null;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!z) {
            i = 8;
        }
        payPalBillingAgreementsTermsFooterLink.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1$lambda-0  reason: not valid java name */
    public static final void m35222initViewModelObservers$lambda1$lambda0(PayPalBillingAgreementsTermsFooterLink payPalBillingAgreementsTermsFooterLink, BaTermsFooterState baTermsFooterState, View view) {
        C19383o.m32797g(payPalBillingAgreementsTermsFooterLink, "this$0");
        payPalBillingAgreementsTermsFooterLink.onLinkClicked(((BaTermsFooterState.ShowLink) baTermsFooterState).getLink());
    }

    private final void onLinkClicked(String str) {
        Activity activity = ViewExtensionsKt.getActivity(this);
        if (activity != null) {
            PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
            Uri parse = Uri.parse(str);
            C19383o.m32796f(parse, "parse(link)");
            instance.openChromeCustomTabs(parse, activity);
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
        getViewModel().getBaTermsFooterState().observe(getLifecycleOwner(this), new C9500i(this, 2));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bindViews();
        initViewModelObservers();
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalBillingAgreementsTermsFooterLink(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(BillingAgreementsViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context), sdkComponentKt$activityViewModels$1);
            View.inflate(context, C17165R.C17169layout.paypal_billing_agreements_terms_footer, this);
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
