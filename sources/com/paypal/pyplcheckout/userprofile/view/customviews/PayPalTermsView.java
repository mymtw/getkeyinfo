package com.paypal.pyplcheckout.userprofile.view.customviews;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.logging.type.LogSeverity;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalTermsViewListener;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PayPalConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor"})
public final class PayPalTermsView extends RelativeLayout implements ContentView, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalTermsView";
    public Map<Integer, View> _$_findViewCache;
    private PayPalTermsViewListener payPalTermsViewListener;
    private TextView titleLabelTv;
    private final C19285c userViewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalTermsView> cls = PayPalTermsView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTermsView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalTermsViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTermsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalTermsViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTermsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalTermsViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTermsView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        this(context, attributeSet, i, fragment, (PayPalTermsViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalTermsView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalTermsViewListener payPalTermsViewListener2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment, (i2 & 16) != 0 ? null : payPalTermsViewListener2);
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    private final void handleUserProfileTermsClicked() {
        Context context = getContext();
        String str = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            PLog.click$default(PEnums.TransitionName.PAYMENT_TERMS_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.USER_PROFILE, (String) null, "user_profile_screen", "terms_link", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, LogSeverity.WARNING_VALUE, (Object) null);
            PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
            User user = getUserViewModel().getUser();
            String userLocale = user == null ? null : user.getUserLocale();
            User user2 = getUserViewModel().getUser();
            if (user2 != null) {
                str = user2.getCountry();
            }
            Uri parse = Uri.parse(PayPalConstants.getTermsUrl(userLocale, str));
            C19383o.m32796f(parse, "parse(\n                P…          )\n            )");
            instance.openChromeCustomTabs(parse, activity);
        }
    }

    private final void setOnClickListener() {
        this.titleLabelTv.setOnClickListener(this);
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

    public String getViewId() {
        return TAG;
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.title_label) {
            handleUserProfileTermsClicked();
            PayPalTermsViewListener payPalTermsViewListener2 = this.payPalTermsViewListener;
            if (payPalTermsViewListener2 != null) {
                payPalTermsViewListener2.onPayPalTermsClick();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalTermsView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalTermsViewListener payPalTermsViewListener2) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context, C17165R.C17169layout.selectable_item_view, this);
            View findViewById = findViewById(C17165R.C17167id.title_label);
            C19383o.m32796f(findViewById, "findViewById(R.id.title_label)");
            TextView textView = (TextView) findViewById;
            this.titleLabelTv = textView;
            textView.setText(context.getText(C17165R.string.paypal_checkout_terms));
            this.payPalTermsViewListener = payPalTermsViewListener2;
            setOnClickListener();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
