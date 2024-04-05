package com.paypal.pyplcheckout.home.view.activities;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.p327ui.conversation.details.ccm.C9500i;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9663d;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.NetworkEventTypes;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuthPresenter;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.BaseActivity;
import com.paypal.pyplcheckout.home.view.customviews.alertview.AlertToast;
import com.paypal.pyplcheckout.home.view.customviews.alertview.PayPalAlertToastView;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.threeds.ThreeDS20Activity;
import com.paypal.pyplcheckout.threeds.ValidateResponseAlias;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.DialogPresets;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.RequestCode;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import com.paypal.pyplcheckout.viewmodels.CancelViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;
import p075d.C6614a;
import p260v0.C8184a;

public final class PYPLHomeActivity extends BaseActivity {
    private static final long ANIMATION_DURATION = 500;
    private static final long BACKGROUND_COLOR_ANIMATOR_DURATION_LONG = 1000;
    private static final long BACKGROUND_COLOR_ANIMATOR_DURATION_SHORT = 750;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String IS_ACTIVITY_RECREATED = "is_activity_recreated";
    private static final String TAG = "PYPLHomeActivity";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private PayPalAlertToastView alertToastView;
    private ObjectAnimator backgroundColorAnimator;
    private BillingAgreementsViewModel billingAgreementsViewModel;
    private CancelViewModel cancelViewModel;
    private final EventListener connectivityEventListener = new C17226a();
    private CryptoViewModel cryptoViewModel;
    public DebugConfigManager debugConfigManager;
    public Events events;
    public C2870k0.C2872b factory;
    /* access modifiers changed from: private */
    public LinearLayout homeBgdMaskLayout;
    private boolean isBackBtnBlocked;
    private MainPaysheetViewModel mainPaysheetViewModel;
    public ThirdPartyAuthPresenter thirdPartyAuthPresenter;
    private final EventListener updatePaySheetVisibilityListener = new C17198a(this, 1);
    private UserViewModel userViewModel;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void closeSDK(String str, String str2) {
        if (DebugConfigManager.getInstance().isSmartPaymentCheckout()) {
            PYPLCheckoutUtils.Companion.getInstance().returnToProvider(PYPLCheckoutUtils.EMPTY_STRING, ReturnToProviderOperationType.Cancel.INSTANCE, C0048b.m163a(str, " ", str2));
        } else {
            PYPLCheckoutUtils.Companion.getInstance().returnToProvider(SdkComponent.Companion.getInstance().getRepository().getCancelUrl(), ReturnToProviderOperationType.Cancel.INSTANCE, C0048b.m163a(str, " ", str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: connectivityEventListener$lambda-1  reason: not valid java name */
    public static final void m35258connectivityEventListener$lambda1(EventType eventType, ResultData resultData) {
        SdkComponent.Companion.getInstance().getAmplitudeManager().uploadFailedEvents();
    }

    private final void fadeInBackground(int i, int i2) {
        LinearLayout linearLayout = this.homeBgdMaskLayout;
        if (linearLayout != null) {
            ObjectAnimator ofObject = ObjectAnimator.ofObject(linearLayout, "backgroundColor", new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            this.backgroundColorAnimator = ofObject;
            if (ofObject != null) {
                ofObject.setDuration(BACKGROUND_COLOR_ANIMATOR_DURATION_SHORT);
            }
            ObjectAnimator objectAnimator = this.backgroundColorAnimator;
            if (objectAnimator != null) {
                objectAnimator.start();
                return;
            }
            return;
        }
        C19383o.m32805o("homeBgdMaskLayout");
        throw null;
    }

    private final void fadeOutBackground() {
        LinearLayout linearLayout = this.homeBgdMaskLayout;
        if (linearLayout != null) {
            ObjectAnimator ofObject = ObjectAnimator.ofObject(linearLayout, "backgroundColor", new ArgbEvaluator(), new Object[]{-1895825408, 16777215});
            ofObject.addListener(new PYPLHomeActivity$fadeOutBackground$1());
            ofObject.setDuration(1000);
            ofObject.start();
            return;
        }
        C19383o.m32805o("homeBgdMaskLayout");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m35259onCreate$lambda2(PYPLHomeActivity pYPLHomeActivity, boolean z) {
        C19383o.m32797g(pYPLHomeActivity, "this$0");
        pYPLHomeActivity.isBackBtnBlocked = z;
    }

    private final void onThreeDsActivityResult(Intent intent) {
        if (intent != null) {
            ValidateResponseAlias validateResponseAlias = new ValidateResponseAlias(intent.getStringExtra(ThreeDS20Activity.THREE_DS_20_VALIDATE_RESPONSE), intent.getIntExtra(ThreeDS20Activity.THREE_DS_20_VALIDATE_RESPONSE_ERROR_NUMBER, -1), intent.getStringExtra(ThreeDS20Activity.THREE_DS_20_VALIDATE_RESPONSE_ERROR_DESCRIPTION));
            MainPaysheetViewModel mainPaysheetViewModel2 = this.mainPaysheetViewModel;
            if (mainPaysheetViewModel2 != null) {
                mainPaysheetViewModel2.handleCardinalResponse(validateResponseAlias);
            } else {
                C19383o.m32805o("mainPaysheetViewModel");
                throw null;
            }
        }
    }

    private final void setBackgroundDrawable() {
        Drawable a = C6614a.m12981a(this, C17165R.C17166drawable.ic_blue_bg);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setAnimationListener(new PYPLHomeActivity$setBackgroundDrawable$1(this, a));
        alphaAnimation.setDuration(ANIMATION_DURATION);
        LinearLayout linearLayout = this.homeBgdMaskLayout;
        if (linearLayout != null) {
            linearLayout.startAnimation(alphaAnimation);
        } else {
            C19383o.m32805o("homeBgdMaskLayout");
            throw null;
        }
    }

    private final void setOpaqueBackground() {
        getWindow().getDecorView().setBackground(C6614a.m12981a(this, C17165R.C17166drawable.ic_blue_bg));
        LinearLayout linearLayout = this.homeBgdMaskLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        } else {
            C19383o.m32805o("homeBgdMaskLayout");
            throw null;
        }
    }

    private final void setupCancelViewModel() {
        CancelViewModel cancelViewModel2 = this.cancelViewModel;
        if (cancelViewModel2 != null) {
            cancelViewModel2.getViewState().observe(this, new C9663d(this, 3));
        } else {
            C19383o.m32805o("cancelViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: setupCancelViewModel$lambda-3  reason: not valid java name */
    public static final void m35260setupCancelViewModel$lambda3(PYPLHomeActivity pYPLHomeActivity, CancelViewModel.State state) {
        C19383o.m32797g(pYPLHomeActivity, "this$0");
        if (state instanceof CancelViewModel.State.ShowCancelDialog) {
            DialogPresets.INSTANCE.showExitSurveyDialog(pYPLHomeActivity, new PYPLHomeActivity$setupCancelViewModel$1$1(pYPLHomeActivity, state));
        } else if (state instanceof CancelViewModel.State.CloseSDK) {
            CancelViewModel.State.CloseSDK closeSDK = (CancelViewModel.State.CloseSDK) state;
            pYPLHomeActivity.closeSDK(closeSDK.getFromClass(), closeSDK.getFromMessage());
        }
    }

    private final void terminateAfterRecreation() {
        MainPaysheetViewModel mainPaysheetViewModel2 = this.mainPaysheetViewModel;
        if (mainPaysheetViewModel2 != null) {
            mainPaysheetViewModel2.resetLiveDataFlags();
            setResult(-1);
            finish();
            return;
        }
        C19383o.m32805o("mainPaysheetViewModel");
        throw null;
    }

    private final void trackDarkThemeUse() {
        int i = getResources().getConfiguration().uiMode & 48;
        if (i == 0) {
            PLog.decision$default(PEnums.TransitionName.DARK_THEME, PEnums.Outcome.FAILED, (PEnums.EventCode) null, PEnums.StateName.UTILS, (String) null, (String) null, "Uncertain Dark theme status", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        } else if (i == 16) {
            PLog.decision$default(PEnums.TransitionName.DARK_THEME, PEnums.Outcome.LIGHT, (PEnums.EventCode) null, PEnums.StateName.UTILS, (String) null, (String) null, "Dark theme disabled", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        } else if (i == 32) {
            PLog.decision$default(PEnums.TransitionName.DARK_THEME, PEnums.Outcome.DARK, (PEnums.EventCode) null, PEnums.StateName.UTILS, (String) null, (String) null, "Dark theme enabled", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: updatePaySheetVisibilityListener$lambda-0  reason: not valid java name */
    public static final void m35261updatePaySheetVisibilityListener$lambda0(PYPLHomeActivity pYPLHomeActivity, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLHomeActivity, "this$0");
        ContentRouter.INSTANCE.showCurrentFragment(pYPLHomeActivity);
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

    public final DebugConfigManager getDebugConfigManager() {
        DebugConfigManager debugConfigManager2 = this.debugConfigManager;
        if (debugConfigManager2 != null) {
            return debugConfigManager2;
        }
        C19383o.m32805o("debugConfigManager");
        throw null;
    }

    public final Events getEvents() {
        Events events2 = this.events;
        if (events2 != null) {
            return events2;
        }
        C19383o.m32805o("events");
        throw null;
    }

    public final C2870k0.C2872b getFactory() {
        C2870k0.C2872b bVar = this.factory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("factory");
        throw null;
    }

    public final ThirdPartyAuthPresenter getThirdPartyAuthPresenter() {
        ThirdPartyAuthPresenter thirdPartyAuthPresenter2 = this.thirdPartyAuthPresenter;
        if (thirdPartyAuthPresenter2 != null) {
            return thirdPartyAuthPresenter2;
        }
        C19383o.m32805o("thirdPartyAuthPresenter");
        throw null;
    }

    public void handleAppBackgroundTransition() {
        setOpaqueBackground();
        PLog.transition$default(PEnums.TransitionName.APP_BACKGROUNDED, PEnums.Outcome.BACKGROUNDED, PEnums.EventCode.E152, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16376, (Object) null);
    }

    public void handleAppForegroundTransition() {
        PLog.transition$default(PEnums.TransitionName.APP_FOREGROUNDED, PEnums.Outcome.FOREGROUNDED, PEnums.EventCode.E167, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16376, (Object) null);
    }

    public void killMe(String str) {
        MainPaysheetViewModel mainPaysheetViewModel2 = this.mainPaysheetViewModel;
        if (mainPaysheetViewModel2 != null) {
            mainPaysheetViewModel2.clearShippingData();
            if (!isFinishing()) {
                fadeOutBackground();
            }
            SdkComponent.Companion.getInstance().getAmplitudeManager().uploadFailedEvents();
            super.killMe(str);
            return;
        }
        C19383o.m32805o("mainPaysheetViewModel");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == RequestCode.THREE_DS_ACTIVITY.getCode() && i2 == -1) {
            onThreeDsActivityResult(intent);
        }
    }

    public void onBackPressed() {
        if (!this.isBackBtnBlocked && !ContentRouter.INSTANCE.onBackPressed(this)) {
            PLog.decision$default(PEnums.TransitionName.BACK_PRESSED_TO_EXIT, PEnums.Outcome.SHOWN, PEnums.EventCode.E144, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
            CancelViewModel cancelViewModel2 = this.cancelViewModel;
            if (cancelViewModel2 != null) {
                String str = TAG;
                C19383o.m32796f(str, "TAG");
                cancelViewModel2.cancelAction(str, "PaySheetActivity onBackPressed");
                return;
            }
            C19383o.m32805o("cancelViewModel");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SdkComponentKt.inject(this);
        getWindow().setFlags(8192, 8192);
        this.mainPaysheetViewModel = (MainPaysheetViewModel) new C2870k0((C2880m0) this, getFactory()).mo10829a(MainPaysheetViewModel.class);
        this.userViewModel = (UserViewModel) new C2870k0((C2880m0) this, getFactory()).mo10829a(UserViewModel.class);
        this.cancelViewModel = (CancelViewModel) new C2870k0((C2880m0) this, getFactory()).mo10829a(CancelViewModel.class);
        this.billingAgreementsViewModel = (BillingAgreementsViewModel) new C2870k0((C2880m0) this, getFactory()).mo10829a(BillingAgreementsViewModel.class);
        this.cryptoViewModel = (CryptoViewModel) new C2870k0((C2880m0) this, getFactory()).mo10829a(CryptoViewModel.class);
        BillingAgreementsViewModel billingAgreementsViewModel2 = this.billingAgreementsViewModel;
        if (billingAgreementsViewModel2 != null) {
            billingAgreementsViewModel2.listenForEvents();
            if (bundle != null) {
                terminateAfterRecreation();
                return;
            }
            setContentView(C17165R.C17169layout.paypal_home_activity);
            if (getDebugConfigManager().shouldDisableScrimBackground()) {
                int i = C17165R.color.black_56;
                Object obj = C8184a.f17966a;
                fadeInBackground(C8184a.C8188d.m16468a(this, i), C8184a.C8188d.m16468a(this, C17165R.color.black_90));
            }
            View findViewById = findViewById(C17165R.C17167id.homeBgdMaskLayout);
            C19383o.m32796f(findViewById, "findViewById(R.id.homeBgdMaskLayout)");
            this.homeBgdMaskLayout = (LinearLayout) findViewById;
            this.alertToastView = (PayPalAlertToastView) findViewById(C17165R.C17167id.toast_alert_view);
            if (getIntent().getBooleanExtra(IS_ACTIVITY_RECREATED, false) && getDebugConfigManager().isSmartPaymentCheckout()) {
                setOpaqueBackground();
            }
            trackDarkThemeUse();
            MainPaysheetViewModel mainPaysheetViewModel2 = this.mainPaysheetViewModel;
            if (mainPaysheetViewModel2 != null) {
                mainPaysheetViewModel2.startFragment(this, HomeFragment.TAG);
                int i2 = C17165R.color.white_100;
                Object obj2 = C8184a.f17966a;
                fadeInBackground(C8184a.C8188d.m16468a(this, i2), C8184a.C8188d.m16468a(this, C17165R.color.background_scrim_color));
                C9500i iVar = new C9500i(this, 4);
                MainPaysheetViewModel mainPaysheetViewModel3 = this.mainPaysheetViewModel;
                if (mainPaysheetViewModel3 != null) {
                    mainPaysheetViewModel3.isBackBtnBlocked().observe(this, iVar);
                    UserViewModel userViewModel2 = this.userViewModel;
                    if (userViewModel2 != null) {
                        userViewModel2.initialize();
                        getEvents().listen(NetworkEventTypes.NETWORK_AVAILABILITY, this.connectivityEventListener);
                        setupCancelViewModel();
                        return;
                    }
                    C19383o.m32805o("userViewModel");
                    throw null;
                }
                C19383o.m32805o("mainPaysheetViewModel");
                throw null;
            }
            C19383o.m32805o("mainPaysheetViewModel");
            throw null;
        }
        C19383o.m32805o("billingAgreementsViewModel");
        throw null;
    }

    public void onDestroy() {
        getEvents().removeListener(NetworkEventTypes.NETWORK_AVAILABILITY, this.connectivityEventListener);
        getThirdPartyAuthPresenter().clearListeners();
        this.alertToastView = null;
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        getEvents().fire(PayPalEventTypes.CHECKOUT_PARAMS_SET, new Success(Boolean.TRUE));
        getEvents().listen(PayPalEventTypes.FINISH_ACTIVITY_AND_SHOW_PAY_SHEET, this.updatePaySheetVisibilityListener);
        getThirdPartyAuthPresenter().setListeners(new PYPLHomeActivity$onResume$1(this), new PYPLHomeActivity$onResume$2(this), new PYPLHomeActivity$onResume$3(this));
    }

    public final void setDebugConfigManager(DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(debugConfigManager2, "<set-?>");
        this.debugConfigManager = debugConfigManager2;
    }

    public final void setEvents(Events events2) {
        C19383o.m32797g(events2, "<set-?>");
        this.events = events2;
    }

    public final void setFactory(C2870k0.C2872b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.factory = bVar;
    }

    public final void setThirdPartyAuthPresenter(ThirdPartyAuthPresenter thirdPartyAuthPresenter2) {
        C19383o.m32797g(thirdPartyAuthPresenter2, "<set-?>");
        this.thirdPartyAuthPresenter = thirdPartyAuthPresenter2;
    }

    public final void showAlertToast(AlertToast alertToast) {
        C19383o.m32797g(alertToast, "alertToast");
        PayPalAlertToastView payPalAlertToastView = this.alertToastView;
        if (payPalAlertToastView != null) {
            payPalAlertToastView.showToast(alertToast);
        }
    }
}
