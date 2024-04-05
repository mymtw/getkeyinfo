package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalLogoutSpinner extends LinearLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalLogoutSpinner";
    public Map<Integer, View> _$_findViewCache;
    private boolean isAnchoredToBottomSheet;
    private EventListener logoutListener;
    private LinearLayout paypalLoadingSpinnerStartParentContainer;
    private LoadingProgressSpinnerView spinnerStart;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalLogoutSpinner> cls = PayPalLogoutSpinner.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLogoutSpinner(Context context) {
        this(context, (AttributeSet) null, (Fragment) null, 0, 14, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLogoutSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (Fragment) null, 0, 12, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLogoutSpinner(Context context, AttributeSet attributeSet, Fragment fragment) {
        this(context, attributeSet, fragment, 0, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalLogoutSpinner(Context context, AttributeSet attributeSet, Fragment fragment, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? null : fragment, (i2 & 8) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35336initViewModelObservers$lambda0(PayPalLogoutSpinner payPalLogoutSpinner, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalLogoutSpinner, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalLogoutSpinner.setVisibility(0);
        payPalLogoutSpinner.spinnerStart.setVisibility(8);
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
        this.logoutListener = new C17249m(this, 0);
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.USER_LOGOUT;
        EventListener eventListener = this.logoutListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
        } else {
            C19383o.m32805o("logoutListener");
            throw null;
        }
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.USER_LOGOUT;
        EventListener eventListener = this.logoutListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
        } else {
            C19383o.m32805o("logoutListener");
            throw null;
        }
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalLogoutSpinner(Context context, AttributeSet attributeSet, Fragment fragment, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.isAnchoredToBottomSheet = true;
        View.inflate(context, C17165R.C17169layout.paypal_loading_spinner, this);
        View findViewById = findViewById(C17165R.C17167id.loading_spinner_parent_container);
        C19383o.m32796f(findViewById, "findViewById(R.id.loadin…spinner_parent_container)");
        this.paypalLoadingSpinnerStartParentContainer = (LinearLayout) findViewById;
        View findViewById2 = findViewById(C17165R.C17167id.loading_spinner_view);
        C19383o.m32796f(findViewById2, "findViewById(R.id.loading_spinner_view)");
        this.spinnerStart = (LoadingProgressSpinnerView) findViewById2;
        setVisibility(8);
        initViewModelObservers();
    }
}
