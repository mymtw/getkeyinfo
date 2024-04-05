package com.paypal.pyplcheckout.home.view;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C2845b0;
import androidx.lifecycle.C2851d0;
import androidx.lifecycle.C2886r;
import androidx.lifecycle.Lifecycle;
import com.paypal.pyplcheckout.BuildConfig;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.activities.PYPLInitiateCheckoutActivity;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.ContainerViewTypeDescriptor;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.IContentPage;
import com.paypal.pyplcheckout.utils.CheckoutCrashLogger;
import com.paypal.pyplcheckout.utils.ConnectivityUtils;
import com.paypal.pyplcheckout.utils.CrashLogger;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0015b;
import p253u3.C8134a;
import p253u3.C8137d;
import p253u3.C8139f;

public abstract class BaseActivity extends AppCompatActivity implements C2886r {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "BaseActivity";
    /* access modifiers changed from: private */
    public static boolean wasInBackground;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final DebugConfigManager config = DebugConfigManager.getInstance();
    private ConnectivityManager connectivityManager;
    private boolean isNetworkCallbackRegistered;
    private ConnectivityManager.NetworkCallback networkCallback;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return BaseActivity.TAG;
        }

        public final boolean wasInBackground() {
            return BaseActivity.wasInBackground;
        }
    }

    private final void setContext() {
        if (!C19383o.m32792b(BuildConfig.FLAVOR, BuildConfig.FLAVOR_clientType) || !(this instanceof PYPLInitiateCheckoutActivity)) {
            this.config.setCheckoutBaseActivity(this);
            ContentRouter.INSTANCE.setCheckoutActivity(new WeakReference(this));
        }
    }

    private final void trackNetworkConnectivity() {
        this.networkCallback = new BaseActivity$trackNetworkConnectivity$1(ConnectivityUtils.INSTANCE.getConnectionName(getApplicationContext()));
        ConnectivityManager connectivityManager2 = this.connectivityManager;
        if (connectivityManager2 != null) {
            NetworkRequest build = new NetworkRequest.Builder().build();
            ConnectivityManager.NetworkCallback networkCallback2 = this.networkCallback;
            if (networkCallback2 != null) {
                connectivityManager2.registerNetworkCallback(build, networkCallback2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager.NetworkCallback");
            }
        }
        this.isNetworkCallbackRegistered = true;
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

    public final void addBreadcrumb(String str) {
        C19383o.m32797g(str, "message");
        CheckoutCrashLogger instance = CrashLogger.getInstance();
        if (instance != null) {
            instance.addBreadcrumb(str);
        }
    }

    public final void attachContentViewsToContainer(List<? extends ContentView> list, ViewGroup viewGroup) {
        C19383o.m32797g(list, "contentViewList");
        C19383o.m32797g(viewGroup, "container");
        for (ContentView contentView : list) {
            viewGroup.removeView(contentView.getView((GenericViewData) null));
            viewGroup.addView(contentView.getView((GenericViewData) null));
        }
    }

    public abstract void handleAppBackgroundTransition();

    public abstract void handleAppForegroundTransition();

    public void killMe(String str) {
        String str2 = str;
        PLog.transition$default(PEnums.TransitionName.KILL_ME_CALLED, PEnums.Outcome.ATTEMPTED, (PEnums.EventCode) null, PEnums.StateName.NONE, str, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, getClass().getSimpleName(), (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16128, (Object) null);
        C8139f a = C8134a.m16364a((String) null);
        if (a.mo20746a("uploadEvents()")) {
            a.f17817G.post(new C8137d(a));
        }
        PYPLCheckoutUtils.Companion.getInstance().clearAllInstances();
        String str3 = str;
        PLog.e$default(TAG, C0015b.m90i("killMe ", getClass().getSimpleName(), " From: ", str3), (Throwable) null, 0, 12, (Object) null);
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - killMe From : " + str3);
        Context applicationContext = this.config.getApplicationContext();
        if (applicationContext != null) {
            Cache.INSTANCE.clearSessionValues(applicationContext);
        }
        this.config.setCheckoutBaseActivity((BaseActivity) null);
        ContentRouter.INSTANCE.clear();
        if (!isFinishing()) {
            finishAndRemoveTask();
            finishAffinity();
        }
    }

    @C2845b0(Lifecycle.Event.ON_CREATE)
    public final void onAppCreated() {
        wasInBackground = false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2851d0.f6469j.f6475g.mo10733a(this);
        Object systemService = getApplicationContext().getSystemService("connectivity");
        if (systemService != null) {
            this.connectivityManager = (ConnectivityManager) systemService;
            trackNetworkConnectivity();
            String simpleName = getClass().getSimpleName();
            addBreadcrumb(simpleName + " - lifecycle - onCreate");
            PLog.transition$default(PEnums.TransitionName.NXO_ACTIVITY_LIFECYCLE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E103, PEnums.StateName.UTILS, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, getClass().getSimpleName(), (String) null, (String) null, "created", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public void onDestroy() {
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onDestroy");
        PLog.transition$default(PEnums.TransitionName.NXO_ACTIVITY_LIFECYCLE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E103, PEnums.StateName.UTILS, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, getClass().getSimpleName(), (String) null, (String) null, "destroyed", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
        C2851d0.f6469j.f6475g.mo10735c(this);
        super.onDestroy();
    }

    @C2845b0(Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground() {
        wasInBackground = true;
        if (DebugConfigManager.getInstance().isSmartPaymentCheckout()) {
            handleAppBackgroundTransition();
        }
    }

    @C2845b0(Lifecycle.Event.ON_START)
    public final void onMoveToForeground() {
        handleAppForegroundTransition();
    }

    public void onPause() {
        ConnectivityManager.NetworkCallback networkCallback2 = this.networkCallback;
        if (networkCallback2 != null && this.isNetworkCallbackRegistered) {
            ConnectivityManager connectivityManager2 = this.connectivityManager;
            if (connectivityManager2 != null) {
                connectivityManager2.unregisterNetworkCallback(networkCallback2);
            }
            this.isNetworkCallbackRegistered = false;
        }
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onPause");
        PLog.transition$default(PEnums.TransitionName.NXO_ACTIVITY_LIFECYCLE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E103, PEnums.StateName.UTILS, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, getClass().getSimpleName(), (String) null, (String) null, "paused", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        setContext();
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onResume");
    }

    public void onStop() {
        String simpleName = getClass().getSimpleName();
        addBreadcrumb(simpleName + " - lifecycle - onStop");
        super.onStop();
    }

    public final void startFragment(BaseActivity baseActivity, int i, BaseFragment baseFragment, String str) {
        C19383o.m32797g(baseActivity, "activity");
        C19383o.m32797g(baseFragment, "fragment");
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        C2740a aVar = new C2740a(supportFragmentManager);
        aVar.mo10532i(C17165R.anim.slide_in_up, C17165R.anim.slide_stay, 0, 0);
        aVar.mo10531h(i, baseFragment, (String) null);
        aVar.mo10529c(str);
        aVar.mo10483d();
    }

    public final void updateInflatedContentViewsToSpecificIndex(IContentPage iContentPage, List<ContentView> list, ContentView contentView, ViewGroup viewGroup, ContainerViewTypeDescriptor containerViewTypeDescriptor, int i) {
        C19383o.m32797g(iContentPage, "contentPage");
        C19383o.m32797g(list, "contentViewList");
        C19383o.m32797g(contentView, "contentView");
        C19383o.m32797g(viewGroup, "container");
        C19383o.m32797g(containerViewTypeDescriptor, "containerViewTypeDescriptor");
        list.add(contentView);
        if (containerViewTypeDescriptor.getContainerViewType() == ContainerViewTypeDescriptor.ViewType.HEADER) {
            iContentPage.removeViewsFromContainer(contentView, viewGroup);
            iContentPage.addViewsToContainer(contentView, viewGroup, i);
        } else if (containerViewTypeDescriptor.getContainerViewType() == ContainerViewTypeDescriptor.ViewType.BODY) {
            iContentPage.removeViewsFromContainer(contentView, viewGroup);
            iContentPage.addViewsToContainer(contentView, viewGroup, i);
        } else if (containerViewTypeDescriptor.getContainerViewType() == ContainerViewTypeDescriptor.ViewType.FOOTER) {
            iContentPage.removeViewsFromContainer(contentView, viewGroup);
            iContentPage.addViewsToContainer(contentView, viewGroup, i);
        }
    }
}
