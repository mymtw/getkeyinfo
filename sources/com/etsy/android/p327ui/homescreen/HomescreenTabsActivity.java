package com.etsy.android.p327ui.homescreen;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.p327ui.navigation.keys.FragmentNavigationKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.util.C12064u;
import com.etsy.android.util.C12069z;
import com.jakewharton.rxrelay2.C17038b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.ObservableObserveOn;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8066r;
import p356ge.C12788a;
import p370ie.C12941a;
import p410oa.C13143c;
import p440s9.C13366a;
import p456ua.C13461f;
import p496za.C13943a;
import p628nj.C18263b;
import p738dq.C18990a;

/* renamed from: com.etsy.android.ui.homescreen.HomescreenTabsActivity */
public final class HomescreenTabsActivity extends AppCompatActivity implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8618c configMap;
    private C7091a disposable = new C7091a();
    public C12064u launchActivityDelegate;
    public C13461f rxSchedulers;
    public C13943a sharedPreferencesProvider;

    /* access modifiers changed from: private */
    public final void goHome() {
        this.disposable.mo19405d();
        C12788a.m20424c(this, new C12941a("", (FragmentNavigationKey) new HomePagerKey(C19421p.m32935c0(this), (Bundle) null, false, 6, (DefaultConstructorMarker) null), false, 12));
        finish();
    }

    private final void loadConfigs() {
        LogCatKt.m17045a().mo21313g("awaiting config update");
        List<String> list = C8591a.f18700r;
        C18263b.f40056T.mo21107e(getApplicationContext());
        C17038b a = EtsyApplication.get().getConfigUpdateStream().mo46713a();
        getRxSchedulers().getClass();
        ObservableSubscribeOn i = a.mo20639i(C13461f.m21235b());
        getRxSchedulers().getClass();
        ObservableObserveOn e = i.mo20635e(C13461f.m21236c());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C8066r rVar = C18990a.f42332a;
        if (timeUnit == null) {
            throw new NullPointerException("timeUnit is null");
        } else if (rVar != null) {
            LambdaObserver f = SubscribersKt.m32501f(new ObservableTimeoutTimed(e, timeUnit, rVar), new HomescreenTabsActivity$loadConfigs$1(this), new HomescreenTabsActivity$loadConfigs$2(this), 2);
            C7091a aVar = this.disposable;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(f);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private final void removePref() {
        getSharedPreferencesProvider().mo46761a().edit().remove("await_config_on_launch").commit();
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

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
        throw null;
    }

    public final C12064u getLaunchActivityDelegate() {
        C12064u uVar = this.launchActivityDelegate;
        if (uVar != null) {
            return uVar;
        }
        C19383o.m32805o("launchActivityDelegate");
        throw null;
    }

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
        throw null;
    }

    public final C13943a getSharedPreferencesProvider() {
        C13943a aVar = this.sharedPreferencesProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("sharedPreferencesProvider");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLaunchActivityDelegate().getClass();
        Intent intent = getIntent();
        C19383o.m32796f(intent, "activity.intent");
        boolean z = true;
        if (C19383o.m32792b("android.intent.action.MAIN", intent.getAction()) && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER")) {
            C12069z.f26913k = getIntent().getPackage() == null;
        }
        Context applicationContext = getApplicationContext();
        C19383o.m32795e(applicationContext, "null cannot be cast to non-null type com.etsy.android.lib.core.EtsyApplication");
        BuildTarget.Companion.getClass();
        C19421p.m32939g0(BuildTarget.audience.isInternal());
        List<String> list = C8591a.f18700r;
        C18263b.f40056T.mo21109h((EtsyApplication) applicationContext, 10800000);
        if (!C18263b.f40057V.mo45960e() || !getSharedPreferences("EtsyUserPrefs", 0).getBoolean("update_services", true) || !C13143c.m20810a(this)) {
            z = false;
        }
        if (z) {
            C13143c.m20811b(this);
            SharedPreferences.Editor edit = getSharedPreferences("EtsyUserPrefs", 0).edit();
            edit.putBoolean("update_services", false);
            edit.apply();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.disposable.mo19405d();
    }

    public void onStart() {
        super.onStart();
        if (getSharedPreferencesProvider().mo46761a().contains("await_config_on_launch")) {
            LogCatKt.m17045a().mo21313g("has pref await_config_on_launch");
            boolean z = getSharedPreferencesProvider().mo46761a().getBoolean("await_config_on_launch", false);
            removePref();
            if (z) {
                loadConfigs();
            } else {
                goHome();
            }
        } else {
            LogCatKt.m17045a().mo21312f("await_config_on_launch not found");
            goHome();
        }
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }

    public final void setLaunchActivityDelegate(C12064u uVar) {
        C19383o.m32797g(uVar, "<set-?>");
        this.launchActivityDelegate = uVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSharedPreferencesProvider(C13943a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.sharedPreferencesProvider = aVar;
    }
}
