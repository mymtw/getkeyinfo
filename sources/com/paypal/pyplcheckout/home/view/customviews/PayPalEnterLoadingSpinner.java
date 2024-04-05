package com.paypal.pyplcheckout.home.view.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6467l;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;

public final class PayPalEnterLoadingSpinner extends LinearLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalEnterLoadingSpinner";
    public Map<Integer, View> _$_findViewCache;
    private boolean isAnchoredToBottomSheet;
    private LoadingProgressSpinnerView loadingSpinner;
    private LinearLayout paypalEnterLoadingSpinnerParentContainer;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static abstract class LoadingTextPhases {

        public static final class CustomMessage extends LoadingTextPhases {
            private final String message;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public CustomMessage(String str) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, "message");
                this.message = str;
            }

            public static /* synthetic */ CustomMessage copy$default(CustomMessage customMessage, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = customMessage.message;
                }
                return customMessage.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final CustomMessage copy(String str) {
                C19383o.m32797g(str, "message");
                return new CustomMessage(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CustomMessage) && C19383o.m32792b(this.message, ((CustomMessage) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return C0048b.m163a("CustomMessage(message=", this.message, ")");
            }
        }

        public static final class GettingUserCheckoutResponse extends LoadingTextPhases {
            public static final GettingUserCheckoutResponse INSTANCE = new GettingUserCheckoutResponse();

            private GettingUserCheckoutResponse() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class LoggingInUser extends LoadingTextPhases {
            public static final LoggingInUser INSTANCE = new LoggingInUser();

            private LoggingInUser() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class WaitingForFirebase extends LoadingTextPhases {
            public static final WaitingForFirebase INSTANCE = new WaitingForFirebase();

            private WaitingForFirebase() {
                super((DefaultConstructorMarker) null);
            }
        }

        private LoadingTextPhases() {
        }

        public /* synthetic */ LoadingTextPhases(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalEnterLoadingSpinner> cls = PayPalEnterLoadingSpinner.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalEnterLoadingSpinner(Context context) {
        this(context, (AttributeSet) null, (Fragment) null, 0, 14, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalEnterLoadingSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (Fragment) null, 0, 12, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalEnterLoadingSpinner(Context context, AttributeSet attributeSet, Fragment fragment) {
        this(context, attributeSet, fragment, 0, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalEnterLoadingSpinner(Context context, AttributeSet attributeSet, Fragment fragment, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? null : fragment, (i2 & 8) != 0 ? 0 : i);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35316initViewModelObservers$lambda0(PayPalEnterLoadingSpinner payPalEnterLoadingSpinner, LoadingTextPhases loadingTextPhases) {
        PayPalEnterLoadingSpinner payPalEnterLoadingSpinner2 = payPalEnterLoadingSpinner;
        LoadingTextPhases loadingTextPhases2 = loadingTextPhases;
        C19383o.m32797g(payPalEnterLoadingSpinner2, "this$0");
        if (C19383o.m32792b(loadingTextPhases2, LoadingTextPhases.WaitingForFirebase.INSTANCE)) {
            payPalEnterLoadingSpinner2.loadingSpinner.setWaitingForFirebasePhase();
        } else if (C19383o.m32792b(loadingTextPhases2, LoadingTextPhases.LoggingInUser.INSTANCE)) {
            payPalEnterLoadingSpinner2.loadingSpinner.setLoggingInUserPhase();
        } else if (C19383o.m32792b(loadingTextPhases2, LoadingTextPhases.GettingUserCheckoutResponse.INSTANCE)) {
            payPalEnterLoadingSpinner2.loadingSpinner.setFetchingUserCheckoutResponsePhase();
        } else if (loadingTextPhases2 instanceof LoadingTextPhases.CustomMessage) {
            payPalEnterLoadingSpinner2.loadingSpinner.setCustomMessage(((LoadingTextPhases.CustomMessage) loadingTextPhases2).getMessage());
        }
        PLog.transition$default(PEnums.TransitionName.ENTER_LOADING_TEXT_SHOWN, PEnums.Outcome.SHOWN, (PEnums.EventCode) null, PEnums.StateName.STARTUP, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, loadingTextPhases.getClass().getSimpleName(), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15344, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35317initViewModelObservers$lambda1(PayPalEnterLoadingSpinner payPalEnterLoadingSpinner, Boolean bool) {
        PayPalEnterLoadingSpinner payPalEnterLoadingSpinner2 = payPalEnterLoadingSpinner;
        C19383o.m32797g(payPalEnterLoadingSpinner2, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue()) {
            payPalEnterLoadingSpinner2.loadingSpinner.setVisibility(8);
            PLog.transition$default(PEnums.TransitionName.ENTER_LOADING_TEXT_HIDDEN, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
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
        C6467l lVar = new C6467l(this, 5);
        C6468m mVar = new C6468m(this, 6);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getViewModel().getLoadingTextPhases().observe(componentActivity, lVar);
        getViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, mVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PayPalEnterLoadingSpinner(android.content.Context r16, android.util.AttributeSet r17, androidx.fragment.app.Fragment r18, int r19) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r2 = r17
            r3 = r19
            r15.<init>(r1, r2, r3)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0._$_findViewCache = r2
            r2 = 1
            r0.isAnchoredToBottomSheet = r2
            com.paypal.pyplcheckout.di.SdkComponent$Companion r2 = com.paypal.pyplcheckout.p543di.SdkComponent.Companion
            com.paypal.pyplcheckout.di.SdkComponent r2 = r2.getInstance()
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1 r3 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$1
            r3.<init>(r2)
            boolean r2 = r1 instanceof androidx.activity.ComponentActivity
            if (r2 == 0) goto L_0x0064
            r2 = r1
            androidx.activity.ComponentActivity r2 = (androidx.activity.ComponentActivity) r2
            androidx.lifecycle.j0 r4 = new androidx.lifecycle.j0
            java.lang.Class<com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel> r5 = com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel.class
            kotlin.jvm.internal.k r5 = kotlin.jvm.internal.C19386q.m32807a(r5)
            com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4 r6 = new com.paypal.pyplcheckout.di.SdkComponentKt$activityViewModels$4
            r6.<init>(r2)
            r4.<init>(r5, r6, r3)
            r0.viewModel$delegate = r4
            int r2 = com.paypal.pyplcheckout.C17165R.C17169layout.paypal_loading_spinner
            android.view.View.inflate(r1, r2, r15)
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.loading_spinner_parent_container
            android.view.View r1 = r15.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.loadin…spinner_parent_container)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.paypalEnterLoadingSpinnerParentContainer = r1
            int r1 = com.paypal.pyplcheckout.C17165R.C17167id.loading_spinner_view
            android.view.View r1 = r15.findViewById(r1)
            java.lang.String r2 = "findViewById(R.id.loading_spinner_view)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.paypal.pyplcheckout.home.view.customviews.LoadingProgressSpinnerView r1 = (com.paypal.pyplcheckout.home.view.customviews.LoadingProgressSpinnerView) r1
            r0.loadingSpinner = r1
            r15.initViewModelObservers()
            return
        L_0x0064:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.FATAL
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E407
            r5 = 0
            r6 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.CONTEXT_INSTANCE
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2008(0x7d8, float:2.814E-42)
            r14 = 0
            java.lang.String r4 = "Context is not an instance of ComponentActivity"
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context is not an instance of ComponentActivity"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.home.view.customviews.PayPalEnterLoadingSpinner.<init>(android.content.Context, android.util.AttributeSet, androidx.fragment.app.Fragment, int):void");
    }
}
