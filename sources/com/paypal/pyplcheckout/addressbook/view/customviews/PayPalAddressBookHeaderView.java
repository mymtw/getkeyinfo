package com.paypal.pyplcheckout.addressbook.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.PYPLAddressBookFragment;
import com.paypal.pyplcheckout.addressbook.view.interfaces.PayPalAddressBookHeaderViewListener;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor"})
public final class PayPalAddressBookHeaderView extends RelativeLayout implements ContentView, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "PayPalAddressBookHeaderView";
    public Map<Integer, View> _$_findViewCache;
    private ImageView addressBookBackArrowImageView;
    private TextView addressBookTitleTextView;
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
            return PayPalAddressBookHeaderView.TAG;
        }
    }

    static {
        Class<PayPalAddressBookHeaderView> cls = PayPalAddressBookHeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookHeaderView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalAddressBookHeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalAddressBookHeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalAddressBookHeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalAddressBookHeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalAddressBookHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalAddressBookHeaderViewListener);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    private final void setOnClickListener() {
        this.addressBookBackArrowImageView.setOnClickListener(this);
    }

    private final void setTitleText(ShippingMethodType shippingMethodType) {
        ShippingMethodType.Type type = null;
        if (ShippingMethodType.Type.SHIPPING != (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
            if (ShippingMethodType.Type.NONE != (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
                ShippingMethodType.Type type2 = ShippingMethodType.Type.PICKUP;
                if (shippingMethodType != null) {
                    type = shippingMethodType.getShippingMethodType();
                }
                if (type2 == type) {
                    this.addressBookTitleTextView.setText(C17165R.string.paypal_checkout_choose_a_pick_up_method);
                    return;
                } else {
                    this.addressBookTitleTextView.setText(C17165R.string.paypal_checkout_shipping_choose_way_to_get_it);
                    return;
                }
            }
        }
        this.addressBookTitleTextView.setText(C17165R.string.paypal_checkout_shipping_address);
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
        if (view.getId() == C17165R.C17167id.addressBookBackArrowImageView) {
            getViewModel().finishFragment(PYPLAddressBookFragment.TAG, this.fragment);
            PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener = this.mPayPalProfileHeaderViewListener;
            if (payPalAddressBookHeaderViewListener != null) {
                payPalAddressBookHeaderViewListener.onPayPalBackArrowClick();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalAddressBookHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalAddressBookHeaderViewListener payPalAddressBookHeaderViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_address_book_header_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.addressBookTitleTextView);
            C19383o.m32796f(findViewById, "findViewById(R.id.addressBookTitleTextView)");
            this.addressBookTitleTextView = (TextView) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.addressBookBackArrowImageView);
            C19383o.m32796f(findViewById2, "findViewById(R.id.addressBookBackArrowImageView)");
            this.addressBookBackArrowImageView = (ImageView) findViewById2;
            this.mPayPalProfileHeaderViewListener = payPalAddressBookHeaderViewListener;
            setOnClickListener();
            setTitleText(getViewModel().getSupportedShippingMethodType().getValue());
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
