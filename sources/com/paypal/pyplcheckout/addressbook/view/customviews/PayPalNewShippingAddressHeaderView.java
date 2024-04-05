package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9663d;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressBookFragment;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalAddressBookHeaderViewListener;
import com.paypal.pyplcheckout.addshipping.ShippingUtils;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
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

@SuppressLint({"ViewConstructor"})
public final class PayPalNewShippingAddressHeaderView extends RelativeLayout implements ContentView, View.OnClickListener, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalNewShippingAddressHeaderView";
    public Map<Integer, View> _$_findViewCache;
    private ImageView addressBookBackArrowImageView;
    private TextView addressBookTitleTextView;
    private final ComponentActivity componentActivity;
    private final Fragment fragment;
    private PayPalAddressBookHeaderViewListener mPayPalProfileHeaderViewListener;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return PayPalNewShippingAddressHeaderView.TAG;
        }
    }

    static {
        Class<PayPalNewShippingAddressHeaderView> cls = PayPalNewShippingAddressHeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressHeaderView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalAddressBookHeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalAddressBookHeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalAddressBookHeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalAddressBookHeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalNewShippingAddressHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalAddressBookHeaderViewListener);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35167initViewModelObservers$lambda0(PayPalNewShippingAddressHeaderView payPalNewShippingAddressHeaderView, String str) {
        C19383o.m32797g(payPalNewShippingAddressHeaderView, "this$0");
        payPalNewShippingAddressHeaderView.addressBookTitleTextView.setText(str);
    }

    private final void setOnClickListener() {
        this.addressBookBackArrowImageView.setOnClickListener(this);
    }

    private final void setTitleText() {
        Cache cache = Cache.INSTANCE;
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        String searchScreenTitle = cache.getSearchScreenTitle(context);
        if (searchScreenTitle == null || searchScreenTitle.length() == 0) {
            Context context2 = getContext();
            int i = C17165R.string.paypal_checkout_add_shipping_address;
            searchScreenTitle = context2.getString(i);
            Context context3 = getContext();
            C19383o.m32796f(context3, ResponseConstants.CONTEXT);
            String string = getContext().getString(i);
            C19383o.m32796f(string, "context.getString(R.stri…out_add_shipping_address)");
            cache.cacheSearchScreenTitle(context3, string);
        }
        String str = searchScreenTitle;
        this.addressBookTitleTextView.setText(str);
        ShippingUtils shippingUtils = ShippingUtils.INSTANCE;
        Context context4 = getContext();
        C19383o.m32796f(context4, ResponseConstants.CONTEXT);
        ShippingUtils.announceAccessibilityEvent$default(shippingUtils, context4, str, (View) null, 4, (Object) null);
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
        getViewModel().getSearchScreenTitle().observe(this.componentActivity, new C9663d(this, 1));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.addressBookBackArrowImageView) {
            getViewModel().finishFragment(PYPLAddressBookFragment.TAG, this.fragment);
            PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener = this.mPayPalProfileHeaderViewListener;
            if (payPalAddressBookHeaderViewListener != null) {
                payPalAddressBookHeaderViewListener.onPayPalBackArrowClick();
            }
            Object systemService = getContext().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalNewShippingAddressHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            this.componentActivity = getComponentActivity(context);
            View.inflate(context, C17165R.C17169layout.paypal_address_book_header_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.addressBookTitleTextView);
            C19383o.m32796f(findViewById, "findViewById(R.id.addressBookTitleTextView)");
            this.addressBookTitleTextView = (TextView) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.addressBookBackArrowImageView);
            C19383o.m32796f(findViewById2, "findViewById(R.id.addressBookBackArrowImageView)");
            this.addressBookBackArrowImageView = (ImageView) findViewById2;
            this.mPayPalProfileHeaderViewListener = payPalAddressBookHeaderViewListener;
            setOnClickListener();
            setTitleText();
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
