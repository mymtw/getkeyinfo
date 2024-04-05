package com.paypal.pyplcheckout.conversionrateprotection.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.C0388a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.conversionrateprotection.view.fragments.PYPLRateProtectionFragment;
import com.paypal.pyplcheckout.conversionrateprotection.view.interfaces.PayPalRateProtectionInfoViewListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
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

@SuppressLint({"ViewConstructor"})
public final class PayPalRateProtectionInfoView extends RelativeLayout implements ContentView, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalRateProtectionInfoView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private TextView fullBodyText;
    private PayPalRateProtectionInfoViewListener mPayPalRateProtectionInfoViewListener;
    private PayPalActionButton okButton;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalRateProtectionInfoView> cls = PayPalRateProtectionInfoView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalRateProtectionInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalRateProtectionInfoViewListener payPalRateProtectionInfoViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalRateProtectionInfoViewListener);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    private final void setBodyText() {
        String string = getContext().getString(C17165R.string.paypal_checkout_rate_prot_body_start);
        C19383o.m32796f(string, "context.getString(R.stri…out_rate_prot_body_start)");
        String string2 = getContext().getString(C17165R.string.paypal_checkout_rate_prot_body_bold_portion);
        C19383o.m32796f(string2, "context.getString(R.stri…e_prot_body_bold_portion)");
        String string3 = getContext().getString(C17165R.string.paypal_checkout_rate_prot_body_end);
        C19383o.m32796f(string3, "context.getString(R.stri…ckout_rate_prot_body_end)");
        this.fullBodyText.setText(new SpannableStringBuilder(C0388a.m1049e(new Object[]{string, string2, string3}, 3, "%s %s %s", "format(format, *args)")));
    }

    private final void setOnClickListener() {
        this.okButton.setOnClickListener(this);
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

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.okButton) {
            getViewModel().finishFragment(PYPLRateProtectionFragment.TAG, this.fragment);
            PayPalRateProtectionInfoViewListener payPalRateProtectionInfoViewListener = this.mPayPalRateProtectionInfoViewListener;
            if (payPalRateProtectionInfoViewListener != null) {
                payPalRateProtectionInfoViewListener.onOKClicked();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalRateProtectionInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalRateProtectionInfoViewListener payPalRateProtectionInfoViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_rate_protection_info_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.okButton);
            C19383o.m32796f(findViewById, "findViewById(R.id.okButton)");
            this.okButton = (PayPalActionButton) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.rate_protection_content);
            C19383o.m32796f(findViewById2, "findViewById(R.id.rate_protection_content)");
            this.fullBodyText = (TextView) findViewById2;
            this.mPayPalRateProtectionInfoViewListener = payPalRateProtectionInfoViewListener;
            this.okButton.setShape(ActionButtonShape.MATERIAL_DESIGN);
            this.okButton.updateButtonText(getResources().getString(C17165R.string.paypal_checkout_got_it));
            this.okButton.setVisibility(0);
            setOnClickListener();
            setBodyText();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
