package com.paypal.pyplcheckout.shippingmethods.view.customviews;

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
import com.paypal.pyplcheckout.shippingmethods.view.fragments.PYPLShippingMethodFragment;
import com.paypal.pyplcheckout.shippingmethods.view.interfaces.PayPalShippingMethodsHeaderViewListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor"})
public final class PayPalShippingMethodsHeaderView extends RelativeLayout implements ContentView, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalShippingMethodsHeaderView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private PayPalShippingMethodsHeaderViewListener mPayPalShippingMethodsHeaderViewListener;
    private ImageView shippingMethodsBackArrowImg;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalShippingMethodsHeaderView> cls = PayPalShippingMethodsHeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsHeaderView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalShippingMethodsHeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalShippingMethodsHeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalShippingMethodsHeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalShippingMethodsHeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalShippingMethodsHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalShippingMethodsHeaderViewListener payPalShippingMethodsHeaderViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalShippingMethodsHeaderViewListener);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    private final void setOnClickListener() {
        this.shippingMethodsBackArrowImg.setOnClickListener(this);
    }

    private final void setTitleText(ShippingMethodType shippingMethodType) {
        ShippingMethodType.Type type = null;
        if (ShippingMethodType.Type.SHIPPING != (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
            if (ShippingMethodType.Type.SHIPPING_AND_PICKUP != (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
                if (ShippingMethodType.Type.NONE != (shippingMethodType == null ? null : shippingMethodType.getShippingMethodType())) {
                    ShippingMethodType.Type type2 = ShippingMethodType.Type.PICKUP;
                    if (shippingMethodType != null) {
                        type = shippingMethodType.getShippingMethodType();
                    }
                    if (type2 == type) {
                        ((TextView) _$_findCachedViewById(C17165R.C17167id.addressBookTitleTextView)).setText(C17165R.string.paypal_checkout_choose_a_pick_up_method);
                        return;
                    } else {
                        ((TextView) _$_findCachedViewById(C17165R.C17167id.addressBookTitleTextView)).setText("");
                        return;
                    }
                }
            }
        }
        ((TextView) _$_findCachedViewById(C17165R.C17167id.addressBookTitleTextView)).setText(C17165R.string.paypal_checkout_choose_shipping_method);
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
        if (view.getId() == C17165R.C17167id.shipping_method_back_arrow_img) {
            getViewModel().finishFragment(PYPLShippingMethodFragment.TAG, this.fragment);
            PayPalShippingMethodsHeaderViewListener payPalShippingMethodsHeaderViewListener = this.mPayPalShippingMethodsHeaderViewListener;
            if (payPalShippingMethodsHeaderViewListener != null) {
                payPalShippingMethodsHeaderViewListener.onPayPalBackArrowClick();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalShippingMethodsHeaderViewListener payPalShippingMethodsHeaderViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_shipping_methods_header_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.shipping_method_back_arrow_img);
            C19383o.m32796f(findViewById, "findViewById(R.id.shipping_method_back_arrow_img)");
            this.shippingMethodsBackArrowImg = (ImageView) findViewById;
            this.mPayPalShippingMethodsHeaderViewListener = payPalShippingMethodsHeaderViewListener;
            setOnClickListener();
            setTitleText(getViewModel().getSupportedShippingMethodType().getValue());
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
