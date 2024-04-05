package com.paypal.pyplcheckout.shippingmethods.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C10077j;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.paypal.pyplcheckout.C17165R;
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
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.ShippingMethods;
import com.paypal.pyplcheckout.shippingmethods.view.adapters.ShippingMethodsAdapter;
import com.paypal.pyplcheckout.shippingmethods.view.fragments.PYPLShippingMethodFragment;
import com.paypal.pyplcheckout.shippingmethods.view.interfaces.PayPalShippingMethodsRecyclerViewListener;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor"})
public final class PayPalShippingMethodsInfoView extends RelativeLayout implements ContentView, ICustomViewsViewModel, ShippingMethodsAdapter.ShippingMethodsAdapterClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalShippingMethodsInfoView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private Context mContext;
    private PayPalShippingMethodsRecyclerViewListener mPayPalShippingMethodsRecyclerViewListener;
    private ShippingMethods selectedShippingMethod;
    private ShippingMethodsAdapter shippingMethodsAdapter;
    private List<ShippingMethods> shippingMethodsList;
    private RecyclerView shippingMethodsRecyclerView;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalShippingMethodsInfoView> cls = PayPalShippingMethodsInfoView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsInfoView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalShippingMethodsRecyclerViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalShippingMethodsRecyclerViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalShippingMethodsRecyclerViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalShippingMethodsRecyclerViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalShippingMethodsInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalShippingMethodsRecyclerViewListener payPalShippingMethodsRecyclerViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalShippingMethodsRecyclerViewListener);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    private final void initShippingMethod(List<ShippingMethods> list, ShippingMethods shippingMethods) {
        this.shippingMethodsRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        if (list != null) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            ShippingMethodsAdapter shippingMethodsAdapter2 = new ShippingMethodsAdapter(context, list, this, shippingMethods);
            this.shippingMethodsAdapter = shippingMethodsAdapter2;
            this.shippingMethodsRecyclerView.setAdapter(shippingMethodsAdapter2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35440initViewModelObservers$lambda0(PayPalShippingMethodsInfoView payPalShippingMethodsInfoView, List list) {
        C19383o.m32797g(payPalShippingMethodsInfoView, "this$0");
        payPalShippingMethodsInfoView.updateAdapterWithShippingMethodsList(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35441initViewModelObservers$lambda1(PayPalShippingMethodsInfoView payPalShippingMethodsInfoView, ShippingMethods shippingMethods) {
        C19383o.m32797g(payPalShippingMethodsInfoView, "this$0");
        if (shippingMethods != null) {
            payPalShippingMethodsInfoView.updateAdapterWithSelectedShippingMethod(shippingMethods);
        }
    }

    private final void updateAdapterWithSelectedShippingMethod(ShippingMethods shippingMethods) {
        ShippingMethodsAdapter shippingMethodsAdapter2 = this.shippingMethodsAdapter;
        if (shippingMethodsAdapter2 != null) {
            shippingMethodsAdapter2.updateSelectedShippingMethod(shippingMethods);
        }
    }

    private final void updateAdapterWithShippingMethodsList(List<ShippingMethods> list) {
        this.shippingMethodsList = list;
        ShippingMethodsAdapter shippingMethodsAdapter2 = this.shippingMethodsAdapter;
        if (shippingMethodsAdapter2 != null) {
            shippingMethodsAdapter2.notifyDataSetChanged();
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
        C10077j jVar = new C10077j(this, 9);
        C9498g gVar = new C9498g(this, 10);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getViewModel().getListOfShippingMethods().observe(componentActivity, jVar);
        getViewModel().getSelectedShippingMethod().observe(componentActivity, gVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onShippingMethodSelected(int i, ShippingMethodType shippingMethodType) {
        int i2 = i;
        ShippingMethodType shippingMethodType2 = shippingMethodType;
        C19383o.m32797g(shippingMethodType2, "selectedShippingMethodType");
        PEnums.TransitionName transitionName = shippingMethodType.isShipping() ? PEnums.TransitionName.SHIPPING_OPTION_SELECTED : PEnums.TransitionName.PICKUP_OPTION_SELECTED;
        PLog.click$default(transitionName, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.SHIPPING, (String) null, "shipping_method_view", "shipping_method_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        getViewModel().updateSelectedShippingMethod(i2, shippingMethodType2);
        getViewModel().finishFragment(PYPLShippingMethodFragment.TAG, this.fragment);
        PEnums.Outcome outcome = PEnums.Outcome.SELECTED;
        PEnums.EventCode eventCode = PEnums.EventCode.E110;
        PEnums.TransitionName transitionName2 = transitionName;
        PEnums.StateName stateName = PEnums.StateName.SHIPPING_METHODS;
        PLog.click$default(transitionName2, outcome, eventCode, stateName, (String) null, "shipping_method_view", "shipping_method_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.decision$default(transitionName2, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E138, stateName, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        PayPalShippingMethodsRecyclerViewListener payPalShippingMethodsRecyclerViewListener = this.mPayPalShippingMethodsRecyclerViewListener;
        if (payPalShippingMethodsRecyclerViewListener != null) {
            payPalShippingMethodsRecyclerViewListener.onPayPalShippingMethodSelected(i2, shippingMethodType2);
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalShippingMethodsInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalShippingMethodsRecyclerViewListener payPalShippingMethodsRecyclerViewListener) {
        super(context, attributeSet, i);
        List<ShippingMethods> list;
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_shipping_methods_info_layout, this);
            View findViewById = findViewById(C17165R.C17167id.shipping_methods_recyclerView);
            C19383o.m32796f(findViewById, "findViewById(R.id.shipping_methods_recyclerView)");
            this.shippingMethodsRecyclerView = (RecyclerView) findViewById;
            this.mContext = context2;
            this.mPayPalShippingMethodsRecyclerViewListener = payPalShippingMethodsRecyclerViewListener;
            if (getViewModel().isPickUpOnlyAvailableWithOptions()) {
                list = getViewModel().getListOfPickUpMethods().getValue();
            } else {
                list = getViewModel().getListOfShippingMethods().getValue();
            }
            this.shippingMethodsList = list;
            ShippingMethods value = getViewModel().getSelectedShippingMethod().getValue();
            this.selectedShippingMethod = value;
            initShippingMethod(this.shippingMethodsList, value);
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
