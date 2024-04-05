package com.paypal.pyplcheckout.threeds.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import com.paypal.pyplcheckout.threeds.view.fragments.PYPLThreeDSV1Fragment;
import com.paypal.pyplcheckout.threeds.view.interfaces.PayPalThreeDSV1HeaderViewListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor"})
public final class PayPalThreeDSV1HeaderView extends RelativeLayout implements ContentView, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalThreeDSV1HeaderView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener;
    private ImageView threeDSBackArrowImg;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalThreeDSV1HeaderView> cls = PayPalThreeDSV1HeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalThreeDSV1HeaderView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalThreeDSV1HeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalThreeDSV1HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalThreeDSV1HeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalThreeDSV1HeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalThreeDSV1HeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalThreeDSV1HeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalThreeDSV1HeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalThreeDSV1HeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalThreeDSV1HeaderViewListener2);
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
        if (view.getId() == C17165R.C17167id.three_ds_back_arrow_img) {
            PLog.decision$default(PEnums.TransitionName.THREE_DS_USER_CANCELLED_STEP_UP, PEnums.Outcome.CANCELLED, PEnums.EventCode.E616, PEnums.StateName.THREE_DS, (String) null, (String) null, "3ds 1.0 step up cancelled", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.CONTINGENCY_EVENT, new Success(new ContingencyEventsModel(ContingencyType.THREE_DS_V1_CONTINGENCY, ContingencyProcessingStatus.THREE_DS_CANCEL_CLICKED, (Exception) null, (String) null, (ThreeDSSource) null, 28, (DefaultConstructorMarker) null)));
            getViewModel().finishFragment(PYPLThreeDSV1Fragment.TAG, this.fragment);
            PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener2 = this.payPalThreeDSV1HeaderViewListener;
            if (payPalThreeDSV1HeaderViewListener2 != null) {
                payPalThreeDSV1HeaderViewListener2.onPayPalBackArrowClick();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalThreeDSV1HeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalThreeDSV1HeaderViewListener payPalThreeDSV1HeaderViewListener2) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_three_ds_v1_header_layout, this);
            View findViewById = findViewById(C17165R.C17167id.three_ds_back_arrow_img);
            C19383o.m32796f(findViewById, "findViewById(R.id.three_ds_back_arrow_img)");
            ImageView imageView = (ImageView) findViewById;
            this.threeDSBackArrowImg = imageView;
            this.payPalThreeDSV1HeaderViewListener = payPalThreeDSV1HeaderViewListener2;
            imageView.setOnClickListener(this);
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
