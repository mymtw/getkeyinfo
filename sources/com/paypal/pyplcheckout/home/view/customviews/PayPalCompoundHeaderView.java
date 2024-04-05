package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.list.ccm.C9580d;
import com.etsy.android.p327ui.user.review.C11709h;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17189g;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.C17203a;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.CheckoutFinishedEventModel;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCompoundHeaderViewListener;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.info.view.PYPLTransactionDetailsFragment;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.view.fragments.PYPLUserProfileFragment;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import com.paypal.pyplcheckout.viewmodels.CancelViewModel;
import com.squareup.picasso.Picasso;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;

@SuppressLint({"ViewConstructor"})
public final class PayPalCompoundHeaderView extends LinearLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener, View.OnLongClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalCompoundHeaderView";
    public Map<Integer, View> _$_findViewCache;
    private ImageView babyPayPalLogo;
    private final C19285c cancelViewModel$delegate;
    private EventListener cartDetailsListeners;
    private EventListener checkoutButtonListener;
    /* access modifiers changed from: private */
    public CircleImageView circleImageView;
    private ConstraintLayout compoundHeaderParentContainer;
    private EventListener disableViewsTouchListener;
    private ImageView exitButton;
    private EventListener finalizeCheckoutListener;
    private TextView initialCircleView;
    private final boolean isAnchoredToBottomSheet;
    private PayPalCompoundHeaderViewListener mPayPalCompoundHeaderViewListener;
    private final C19285c mainPaysheetViewModel$delegate;
    private RelativeLayout paySheetCircleView;
    private final C19285c userViewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ContingencyType.values().length];
            iArr[ContingencyType.THREE_DS_V1_CONTINGENCY.ordinal()] = 1;
            iArr[ContingencyType.THREE_DS_V2_CONTINGENCY.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContingencyProcessingStatus.values().length];
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_STARTED.ordinal()] = 1;
            iArr2[ContingencyProcessingStatus.THREE_DS_SUBMIT_CLICKED.ordinal()] = 2;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_FAILED.ordinal()] = 3;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_2_FAILED.ordinal()] = 4;
            iArr2[ContingencyProcessingStatus.THREE_DS_LOOK_UP_FAILED.ordinal()] = 5;
            iArr2[ContingencyProcessingStatus.THREE_DS_AUTHENTICATE_FAILED.ordinal()] = 6;
            iArr2[ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE.ordinal()] = 7;
            iArr2[ContingencyProcessingStatus.THREE_DS_CANCEL_CLICKED.ordinal()] = 8;
            iArr2[ContingencyProcessingStatus.THREE_DS_RESOLVE_FAILED.ordinal()] = 9;
            iArr2[ContingencyProcessingStatus.THREE_DS_RESOLVE_SUCCESS.ordinal()] = 10;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Class<PayPalCompoundHeaderView> cls = PayPalCompoundHeaderView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCompoundHeaderView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalCompoundHeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCompoundHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalCompoundHeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCompoundHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalCompoundHeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCompoundHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        this(context, attributeSet, i, fragment, (PayPalCompoundHeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalCompoundHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment, (i2 & 16) != 0 ? null : payPalCompoundHeaderViewListener);
    }

    private final CancelViewModel getCancelViewModel() {
        return (CancelViewModel) this.cancelViewModel$delegate.getValue();
    }

    private final String getInitials(String str, String str2) {
        C19383o.m32797g(str, "<this>");
        boolean z = true;
        Character valueOf = str.length() == 0 ? null : Character.valueOf(str.charAt(0));
        if (valueOf != null) {
            char charValue = valueOf.charValue();
            C19383o.m32797g(str2, "<this>");
            if (str2.length() != 0) {
                z = false;
            }
            Character valueOf2 = z ? null : Character.valueOf(str2.charAt(0));
            if (valueOf2 != null) {
                char charValue2 = valueOf2.charValue();
                StringBuilder sb = new StringBuilder();
                sb.append(charValue);
                sb.append(charValue2);
                return sb.toString();
            }
        }
        return null;
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    private final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        if (i == 1 || i == 2) {
            switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                case 1:
                case 2:
                    setVisibility(8);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    initHeaderViewInfo(getUserViewModel().getUser());
                    return;
                case 10:
                    if (contingencyEventsModel.isAddCardContingency()) {
                        initHeaderViewInfo(getUserViewModel().getUser());
                        return;
                    }
                    return;
                default:
                    String str = TAG;
                    PLog.i$default(str, "ContingencyProcessingStatus of type " + contingencyProcessingStatus + " not handled", 0, 4, (Object) null);
                    return;
            }
        } else {
            String str2 = TAG;
            PLog.i$default(str2, "ContingencyType of type " + contingencyType + " not handled", 0, 4, (Object) null);
        }
    }

    private final void initEvents() {
        this.checkoutButtonListener = new C17203a(this, 3);
        this.finalizeCheckoutListener = new C17198a(this, 3);
        this.disableViewsTouchListener = new C17240d(this, 1);
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
            EventListener eventListener2 = this.finalizeCheckoutListener;
            if (eventListener2 != null) {
                instance2.listen(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                EventListener eventListener3 = this.disableViewsTouchListener;
                if (eventListener3 != null) {
                    instance3.listen(payPalEventTypes3, eventListener3);
                } else {
                    C19383o.m32805o("disableViewsTouchListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("finalizeCheckoutListener");
                throw null;
            }
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-7  reason: not valid java name */
    public static final void m35287initEvents$lambda7(PayPalCompoundHeaderView payPalCompoundHeaderView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        CheckoutFinishedEventModel checkoutFinishedEventModel = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof CheckoutFinishedEventModel) {
            checkoutFinishedEventModel = (CheckoutFinishedEventModel) data;
        }
        if (checkoutFinishedEventModel != null && checkoutFinishedEventModel.isClickEnabled() && !checkoutFinishedEventModel.isAddCardMode()) {
            payPalCompoundHeaderView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-8  reason: not valid java name */
    public static final void m35288initEvents$lambda8(PayPalCompoundHeaderView payPalCompoundHeaderView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalCompoundHeaderView.circleImageView.setClickable(true);
        payPalCompoundHeaderView.initialCircleView.setClickable(true);
        payPalCompoundHeaderView.babyPayPalLogo.setClickable(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: initEvents$lambda-9  reason: not valid java name */
    public static final void m35289initEvents$lambda9(PayPalCompoundHeaderView payPalCompoundHeaderView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        payPalCompoundHeaderView.circleImageView.setClickable(false);
        payPalCompoundHeaderView.initialCircleView.setClickable(false);
        payPalCompoundHeaderView.babyPayPalLogo.setClickable(false);
    }

    private final void initHeaderViewInfo(User user) {
        if (user == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        showProfileImage(user.getUserPhotoUri(), StringExtensionsKt.uppercase(user.getFirstName()), StringExtensionsKt.uppercase(user.getLastName()));
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35290initViewModelObservers$lambda0(PayPalCompoundHeaderView payPalCompoundHeaderView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Boolean bool = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof Boolean) {
            bool = (Boolean) data;
        }
        if (C19383o.m32792b(bool, Boolean.TRUE)) {
            payPalCompoundHeaderView.babyPayPalLogo.setVisibility(4);
        } else {
            payPalCompoundHeaderView.babyPayPalLogo.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35291initViewModelObservers$lambda1(PayPalCompoundHeaderView payPalCompoundHeaderView, UserState userState) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        if ((userState instanceof UserState.Success) && C19383o.m32792b(payPalCompoundHeaderView.getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().getValue(), Boolean.TRUE) && payPalCompoundHeaderView.getMainPaysheetViewModel().getContingencyEventsModel().getValue() == null) {
            payPalCompoundHeaderView.initHeaderViewInfo(((UserState.Success) userState).getUser());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35292initViewModelObservers$lambda2(PayPalCompoundHeaderView payPalCompoundHeaderView, Boolean bool) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && payPalCompoundHeaderView.getMainPaysheetViewModel().getContingencyEventsModel().getValue() == null) {
            payPalCompoundHeaderView.initHeaderViewInfo(payPalCompoundHeaderView.getUserViewModel().getUser());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35293initViewModelObservers$lambda3(PayPalCompoundHeaderView payPalCompoundHeaderView, Boolean bool) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            payPalCompoundHeaderView.compoundHeaderParentContainer.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-5  reason: not valid java name */
    public static final void m35294initViewModelObservers$lambda5(PayPalCompoundHeaderView payPalCompoundHeaderView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(payPalCompoundHeaderView, "this$0");
        if (contingencyEventsModel != null) {
            payPalCompoundHeaderView.handleContingencyEvent(contingencyEventsModel);
        }
    }

    private final void setOnClickListener() {
        this.circleImageView.setOnClickListener(this);
        this.initialCircleView.setOnClickListener(this);
        this.babyPayPalLogo.setOnLongClickListener(this);
        this.exitButton.setOnClickListener(this);
    }

    private final void setupExitView() {
        this.exitButton.setVisibility(getMainPaysheetViewModel().shouldShowCloseButton() ? 0 : 8);
    }

    private final void showProfileImage(String str, String str2, String str3) {
        this.babyPayPalLogo.setVisibility(0);
        this.circleImageView.setVisibility(4);
        this.initialCircleView.setVisibility(4);
        if (str == null) {
            this.circleImageView.setImageDrawable((Drawable) null);
            updateInitialCircleView(str2, str3);
            PLog.impression$default(PEnums.TransitionName.USER_INITIALS_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.USER_PROFILE, "review_your_information_screen", "profile_picture_view", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
            return;
        }
        Picasso.m29268d().mo68572e(str).mo68635a(this.circleImageView, new PayPalCompoundHeaderView$showProfileImage$1(this, str2, str3));
    }

    /* access modifiers changed from: private */
    public final void updateInitialCircleView(String str, String str2) {
        this.circleImageView.setVisibility(8);
        this.initialCircleView.setText(getInitials(str, str2));
        this.initialCircleView.setVisibility(0);
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
        this.cartDetailsListeners = new C17189g(this, 1);
        Events instance = Events.Companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CART_DETAILS_EXPANDING;
        EventListener eventListener = this.cartDetailsListeners;
        if (eventListener != null) {
            instance.listen(payPalEventTypes, eventListener);
            C9580d dVar = new C9580d(this, 5);
            C11709h hVar = new C11709h(this, 4);
            C6456a aVar = new C6456a(this, 10);
            C6457b bVar = new C6457b(this, 7);
            getUserViewModel().getUserState().observe(getLifecycleOwner(this), dVar);
            getMainPaysheetViewModel().getLogoutCompletedFlag().observe(getLifecycleOwner(this), aVar);
            getMainPaysheetViewModel().getContingencyEventsModel().observe(getLifecycleOwner(this), bVar);
            getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(getLifecycleOwner(this), hVar);
            return;
        }
        C19383o.m32805o("cartDetailsListeners");
        throw null;
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        int id = view.getId();
        if (id == C17165R.C17167id.profilePicCircleImageView) {
            PLog.click$default(PEnums.TransitionName.PROFILE_PICTURE_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "profile_picture_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLUserProfileFragment.TAG, new PYPLUserProfileFragment())));
            PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener = this.mPayPalCompoundHeaderViewListener;
            if (payPalCompoundHeaderViewListener != null) {
                payPalCompoundHeaderViewListener.onProfileImageHeaderClick();
            }
        } else if (id == C17165R.C17167id.initialProfilePicTextView) {
            PLog.click$default(PEnums.TransitionName.PROFILE_PICTURE_TAPPED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, (String) null, "review_your_information_screen", "profile_picture_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLUserProfileFragment.TAG, new PYPLUserProfileFragment())));
            PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener2 = this.mPayPalCompoundHeaderViewListener;
            if (payPalCompoundHeaderViewListener2 != null) {
                payPalCompoundHeaderViewListener2.onProfileInitialsHeaderClick();
            }
        } else if (id == C17165R.C17167id.exit_button_image) {
            PLog.click$default(PEnums.TransitionName.CLICKED_TO_EXIT, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.REVIEW, "clicked new exit button", "review_your_information_screen", "exit_button_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            Class<PayPalCompoundHeaderView> cls = PayPalCompoundHeaderView.class;
            getCancelViewModel().cancelAction("PayPalCompoundHeaderView", "clicked exit button");
        }
    }

    public boolean onLongClick(View view) {
        Events.Companion.getInstance().fire(PayPalEventTypes.START_FRAGMENT, new Success(new FragmentInfo(PYPLTransactionDetailsFragment.TAG, new PYPLTransactionDetailsFragment())));
        PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener = this.mPayPalCompoundHeaderViewListener;
        if (payPalCompoundHeaderViewListener == null) {
            return true;
        }
        payPalCompoundHeaderViewListener.onPayPalLogoClicked();
        return true;
    }

    public void removeListeners() {
        Events.Companion companion = Events.Companion;
        Events instance = companion.getInstance();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.CHECKOUT_BUTTON_CLICKED;
        EventListener eventListener = this.checkoutButtonListener;
        if (eventListener != null) {
            instance.removeListener(payPalEventTypes, eventListener);
            Events instance2 = companion.getInstance();
            PayPalEventTypes payPalEventTypes2 = PayPalEventTypes.CART_DETAILS_EXPANDING;
            EventListener eventListener2 = this.cartDetailsListeners;
            if (eventListener2 != null) {
                instance2.removeListener(payPalEventTypes2, eventListener2);
                Events instance3 = companion.getInstance();
                PayPalEventTypes payPalEventTypes3 = PayPalEventTypes.FINISHED_POST_REVIEW_CALLS;
                EventListener eventListener3 = this.finalizeCheckoutListener;
                if (eventListener3 != null) {
                    instance3.removeListener(payPalEventTypes3, eventListener3);
                    Events instance4 = companion.getInstance();
                    PayPalEventTypes payPalEventTypes4 = PayPalEventTypes.DISABLE_VIEWS_TOUCH_INTERACTION;
                    EventListener eventListener4 = this.disableViewsTouchListener;
                    if (eventListener4 != null) {
                        instance4.removeListener(payPalEventTypes4, eventListener4);
                    } else {
                        C19383o.m32805o("disableViewsTouchListener");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("finalizeCheckoutListener");
                    throw null;
                }
            } else {
                C19383o.m32805o("cartDetailsListeners");
                throw null;
            }
        } else {
            C19383o.m32805o("checkoutButtonListener");
            throw null;
        }
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCompoundHeaderView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.isAnchoredToBottomSheet = true;
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$13 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                if (z) {
                    this.cancelViewModel$delegate = new C2868j0(C19386q.m32807a(CancelViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$13);
                    View.inflate(getContext(), C17165R.C17169layout.paypal_compound_header, this);
                    this.mPayPalCompoundHeaderViewListener = payPalCompoundHeaderViewListener;
                    View findViewById = findViewById(C17165R.C17167id.compound_header_parent_container);
                    C19383o.m32796f(findViewById, "findViewById(R.id.compou…_header_parent_container)");
                    this.compoundHeaderParentContainer = (ConstraintLayout) findViewById;
                    View findViewById2 = findViewById(C17165R.C17167id.paypalLogoImageView);
                    C19383o.m32796f(findViewById2, "findViewById(R.id.paypalLogoImageView)");
                    this.babyPayPalLogo = (ImageView) findViewById2;
                    View findViewById3 = findViewById(C17165R.C17167id.profilePicLayout);
                    C19383o.m32796f(findViewById3, "findViewById(R.id.profilePicLayout)");
                    this.paySheetCircleView = (RelativeLayout) findViewById3;
                    View findViewById4 = findViewById(C17165R.C17167id.initialProfilePicTextView);
                    C19383o.m32796f(findViewById4, "findViewById(R.id.initialProfilePicTextView)");
                    this.initialCircleView = (TextView) findViewById4;
                    View findViewById5 = findViewById(C17165R.C17167id.profilePicCircleImageView);
                    C19383o.m32796f(findViewById5, "findViewById(R.id.profilePicCircleImageView)");
                    this.circleImageView = (CircleImageView) findViewById5;
                    View findViewById6 = findViewById(C17165R.C17167id.exit_button_image);
                    C19383o.m32796f(findViewById6, "findViewById(R.id.exit_button_image)");
                    this.exitButton = (ImageView) findViewById6;
                    RelativeLayout relativeLayout = this.paySheetCircleView;
                    int i2 = C17165R.C17166drawable.circular_shadow;
                    Object obj = C8184a.f17966a;
                    relativeLayout.setBackground(C8184a.C8187c.m16466b(context2, i2));
                    setVisibility(8);
                    setOnClickListener();
                    initEvents();
                    initViewModelObservers();
                    setupExitView();
                    return;
                }
                PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
                throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
