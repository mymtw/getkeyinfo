package com.paypal.pyplcheckout.info.view.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.PayPalTransactionDetailsHeaderViewListener;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.userprofile.view.customviews.PayPalProfileHeaderView;
import com.paypal.pyplcheckout.userprofile.view.fragments.PYPLUserProfileFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLTransactionDetailsHeaderView extends RelativeLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLTransactionDetailsHeaderView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private PayPalTransactionDetailsHeaderViewListener mPayPalTransactionDetailsHeaderViewListener;
    private RelativeLayout transactionDetailsHeaderLayout;
    private ImageView transactionDetailsImageView;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PYPLTransactionDetailsHeaderView> cls = PYPLTransactionDetailsHeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsHeaderView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalTransactionDetailsHeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalTransactionDetailsHeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalTransactionDetailsHeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalTransactionDetailsHeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PYPLTransactionDetailsHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalTransactionDetailsHeaderViewListener payPalTransactionDetailsHeaderViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalTransactionDetailsHeaderViewListener);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
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
        return PayPalProfileHeaderView.TAG;
    }

    public void initViewModelObservers() {
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        getViewModel().finishFragment(PYPLUserProfileFragment.TAG, this.fragment);
        PayPalTransactionDetailsHeaderViewListener payPalTransactionDetailsHeaderViewListener = this.mPayPalTransactionDetailsHeaderViewListener;
        if (payPalTransactionDetailsHeaderViewListener != null) {
            payPalTransactionDetailsHeaderViewListener.onPayPalBackArrowClick();
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PYPLTransactionDetailsHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalTransactionDetailsHeaderViewListener payPalTransactionDetailsHeaderViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context, C17165R.C17169layout.paypal_transaction_details_header_view, this);
            View findViewById = findViewById(C17165R.C17167id.transactionDetailsHeaderLayout);
            C19383o.m32796f(findViewById, "findViewById(R.id.transactionDetailsHeaderLayout)");
            this.transactionDetailsHeaderLayout = (RelativeLayout) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.transactionDetailsBackArrowImageView);
            C19383o.m32796f(findViewById2, "findViewById(R.id.transa…etailsBackArrowImageView)");
            ImageView imageView = (ImageView) findViewById2;
            this.transactionDetailsImageView = imageView;
            imageView.setOnClickListener(this);
            this.mPayPalTransactionDetailsHeaderViewListener = payPalTransactionDetailsHeaderViewListener;
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
