package com.paypal.pyplcheckout.userprofile.view.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.review.C11709h;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalProfileInfoView extends RelativeLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalProfileInfoView";
    public Map<Integer, View> _$_findViewCache;
    private RelativeLayout payPalProfileInfoContainer;
    private TextView userProfileEmailTv;
    private TextView userProfileNameTv;
    private final C19285c userViewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalProfileInfoView> cls = PayPalProfileInfoView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalProfileInfoView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, 14, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalProfileInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, 12, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalProfileInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalProfileInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment);
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35456initViewModelObservers$lambda0(PayPalProfileInfoView payPalProfileInfoView, UserState userState) {
        C19383o.m32797g(payPalProfileInfoView, "this$0");
        C19383o.m32797g(userState, "userState");
        payPalProfileInfoView.onUserState(userState);
    }

    private final void onUserState(UserState userState) {
        if (userState instanceof UserState.Empty) {
            this.payPalProfileInfoContainer.setVisibility(8);
        } else if (userState instanceof UserState.Error) {
            this.payPalProfileInfoContainer.setVisibility(8);
        } else if (userState instanceof UserState.Success) {
            showUser(((UserState.Success) userState).getUser());
        }
    }

    private final void showUser(User user) {
        this.payPalProfileInfoContainer.setVisibility(0);
        TextView textView = this.userProfileNameTv;
        String string = getResources().getString(C17165R.string.paypal_checkout_user_profile_username);
        C19383o.m32796f(string, "resources.getString(R.st…ut_user_profile_username)");
        String format = String.format(string, Arrays.copyOf(new Object[]{user.getFirstName(), user.getLastName()}, 2));
        C19383o.m32796f(format, "format(format, *args)");
        textView.setText(format);
        this.userProfileEmailTv.setText(user.getEmailAddress());
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
        getUserViewModel().getUserState().observe(getLifecycleOwner(this), new C11709h(this, 7));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalProfileInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context2, C17165R.C17169layout.paypal_profile_info_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.payPalProfileInfoContainer);
            C19383o.m32796f(findViewById, "findViewById(R.id.payPalProfileInfoContainer)");
            this.payPalProfileInfoContainer = (RelativeLayout) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.userProfileNameTextView);
            C19383o.m32796f(findViewById2, "findViewById(R.id.userProfileNameTextView)");
            this.userProfileNameTv = (TextView) findViewById2;
            View findViewById3 = findViewById(C17165R.C17167id.userProfileEmailTextView);
            C19383o.m32796f(findViewById3, "findViewById(R.id.userProfileEmailTextView)");
            this.userProfileEmailTv = (TextView) findViewById3;
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
