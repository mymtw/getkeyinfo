package com.paypal.pyplcheckout.userprofile.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.list.ccm.C9580d;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.view.customviews.CircleImageView;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.view.fragments.PYPLUserProfileFragment;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalProfileHeaderViewListener;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.AccessibilityUtilsKt;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p593ip.C17881a;

@SuppressLint({"ViewConstructor"})
public final class PayPalProfileHeaderView extends RelativeLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalProfileHeaderView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private PayPalProfileHeaderViewListener mPayPalProfileHeaderViewListener;
    private final C19285c mainPaysheetViewModel$delegate;
    private ImageView userProfileBackArrowIv;
    private RelativeLayout userProfileBackArrowLayout;
    /* access modifiers changed from: private */
    public CircleImageView userProfileCircleIv;
    private RelativeLayout userProfileCircleLayout;
    /* access modifiers changed from: private */
    public TextView userProfileInitialCircleTv;
    private final C19285c userViewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalProfileHeaderView> cls = PayPalProfileHeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalProfileHeaderView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalProfileHeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalProfileHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalProfileHeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalProfileHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalProfileHeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalProfileHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalProfileHeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalProfileHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalProfileHeaderViewListener payPalProfileHeaderViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalProfileHeaderViewListener);
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35453initViewModelObservers$lambda0(PayPalProfileHeaderView payPalProfileHeaderView, UserState userState) {
        C19383o.m32797g(payPalProfileHeaderView, "this$0");
        C19383o.m32796f(userState, "it");
        payPalProfileHeaderView.onUserState(userState);
    }

    private final void onUserState(UserState userState) {
        if (userState instanceof UserState.Empty) {
            PLog.e$default(TAG, "userState is Empty", (Throwable) null, 0, 12, (Object) null);
            setVisibility(8);
        } else if (userState instanceof UserState.Error) {
            String str = TAG;
            Exception exception = ((UserState.Error) userState).getException();
            PLog.e$default(str, "userState error " + exception, (Throwable) null, 0, 12, (Object) null);
            setVisibility(8);
        } else if (userState instanceof UserState.Success) {
            setVisibility(0);
            showUser(((UserState.Success) userState).getUser());
        }
    }

    private final void setOnClickListener() {
        this.userProfileCircleLayout.setOnClickListener(this);
        this.userProfileBackArrowIv.setOnClickListener(this);
        this.userProfileBackArrowLayout.setOnClickListener(this);
        setupFeatureFlagDebugClickListener();
    }

    private final void setupFeatureFlagDebugClickListener() {
    }

    /* renamed from: setupFeatureFlagDebugClickListener$lambda-5  reason: not valid java name */
    private static final boolean m35454setupFeatureFlagDebugClickListener$lambda5(View view) {
        AlertDialog.C0133a aVar = new AlertDialog.C0133a(view.getContext());
        Feature[] values = Feature.values();
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i = 0;
        while (i < length) {
            Feature feature = values[i];
            i++;
            arrayList.add(Boolean.valueOf(FeatureFlagManager.INSTANCE.getLocalOverrideRuntimeFeatures().contains(feature)));
        }
        boolean[] zArr = new boolean[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        ArrayList arrayList2 = new ArrayList(values.length);
        int length2 = values.length;
        int i3 = 0;
        while (i3 < length2) {
            Feature feature2 = values[i3];
            i3++;
            arrayList2.add(feature2.name());
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            aVar.mo1232d((CharSequence[]) array, zArr, new C17881a(values));
            aVar.create().show();
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* access modifiers changed from: private */
    /* renamed from: setupFeatureFlagDebugClickListener$lambda-5$lambda-4$lambda-3  reason: not valid java name */
    public static final void m35455setupFeatureFlagDebugClickListener$lambda5$lambda4$lambda3(Feature[] featureArr, DialogInterface dialogInterface, int i, boolean z) {
        C19383o.m32797g(featureArr, "$features");
        C19383o.m32797g(dialogInterface, "$noName_0");
        if (z) {
            FeatureFlagManager.INSTANCE.getLocalOverrideRuntimeFeatures().add(featureArr[i]);
        } else {
            FeatureFlagManager.INSTANCE.getLocalOverrideRuntimeFeatures().remove(featureArr[i]);
        }
    }

    private final void showProfileImage(String str, String str2) {
        if (str == null) {
            this.userProfileCircleIv.setVisibility(8);
            this.userProfileInitialCircleTv.setText(str2);
            this.userProfileInitialCircleTv.setVisibility(0);
            return;
        }
        Picasso.m29268d().mo68572e(str).mo68635a(this.userProfileCircleIv, new PayPalProfileHeaderView$showProfileImage$1(this, str2));
    }

    private final void showUser(User user) {
        showProfileImage(user.getUserPhotoUri(), user.getUserInitials());
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
        getUserViewModel().getUserState().observe(getLifecycleOwner(this), new C9580d(this, 8));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        int id = view.getId();
        if (id == C17165R.C17167id.userProfileCircleLayout) {
            PLog.click$default(PEnums.TransitionName.PROFILE_PICTURE_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.USER_PROFILE, (String) null, "user_profile_screen", "profile_picture_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            getMainPaysheetViewModel().finishFragment(PYPLUserProfileFragment.TAG, this.fragment);
            PayPalProfileHeaderViewListener payPalProfileHeaderViewListener = this.mPayPalProfileHeaderViewListener;
            if (payPalProfileHeaderViewListener != null) {
                payPalProfileHeaderViewListener.onPayPalProfileImageClick();
            }
        } else if (id == C17165R.C17167id.userProfileBackArrowImageView || id == C17165R.C17167id.userProfileBackArrowLayout) {
            getMainPaysheetViewModel().finishFragment(PYPLUserProfileFragment.TAG, this.fragment);
            PayPalProfileHeaderViewListener payPalProfileHeaderViewListener2 = this.mPayPalProfileHeaderViewListener;
            if (payPalProfileHeaderViewListener2 != null) {
                payPalProfileHeaderViewListener2.onPayPalBackArrowClick();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalProfileHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalProfileHeaderViewListener payPalProfileHeaderViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                View.inflate(context2, C17165R.C17169layout.paypal_profile_header_view_layout, this);
                View findViewById = findViewById(C17165R.C17167id.userProfileCircleLayout);
                C19383o.m32796f(findViewById, "findViewById(R.id.userProfileCircleLayout)");
                this.userProfileCircleLayout = (RelativeLayout) findViewById;
                View findViewById2 = findViewById(C17165R.C17167id.userProfileInitialCircleTextView);
                C19383o.m32796f(findViewById2, "findViewById(R.id.userPr…ileInitialCircleTextView)");
                this.userProfileInitialCircleTv = (TextView) findViewById2;
                View findViewById3 = findViewById(C17165R.C17167id.userProfileCircleImageView);
                C19383o.m32796f(findViewById3, "findViewById(R.id.userProfileCircleImageView)");
                this.userProfileCircleIv = (CircleImageView) findViewById3;
                View findViewById4 = findViewById(C17165R.C17167id.userProfileBackArrowImageView);
                C19383o.m32796f(findViewById4, "findViewById(R.id.userProfileBackArrowImageView)");
                this.userProfileBackArrowIv = (ImageView) findViewById4;
                View findViewById5 = findViewById(C17165R.C17167id.userProfileBackArrowLayout);
                C19383o.m32796f(findViewById5, "findViewById(R.id.userProfileBackArrowLayout)");
                this.userProfileBackArrowLayout = (RelativeLayout) findViewById5;
                this.mPayPalProfileHeaderViewListener = payPalProfileHeaderViewListener;
                setOnClickListener();
                initViewModelObservers();
                AccessibilityUtilsKt.requestAccessibilityFocusDelayed(this.userProfileBackArrowIv);
                return;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
