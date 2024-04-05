package com.google.firebase.perf.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.C16630e;
import com.google.firebase.perf.util.Timer;
import p552dn.C17698c;

@Keep
public class FirebasePerfProvider extends ContentProvider {
    private static final Timer APP_START_TIME = new Timer();
    @VisibleForTesting
    public static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseperfprovider";
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    private static void checkContentProviderAuthority(ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebasePerfProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static Timer getAppStartTime() {
        return APP_START_TIME;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        checkContentProviderAuthority(providerInfo);
        super.attachInfo(context, providerInfo);
        C16594a e = C16594a.m27423e();
        Context context2 = getContext();
        e.getClass();
        Context applicationContext = context2.getApplicationContext();
        C16594a.f36827d.f38630b = C16630e.m27495a(applicationContext);
        e.f36831c.mo59260b(applicationContext);
        AppStateMonitor instance = AppStateMonitor.getInstance();
        instance.registerActivityLifecycleCallbacks(getContext());
        instance.registerForAppColdStart(new C17698c());
        AppStartTrace instance2 = AppStartTrace.getInstance();
        instance2.registerActivityLifecycleCallbacks(getContext());
        this.mainHandler.post(new AppStartTrace.C16613a(instance2));
        SessionManager.getInstance().initializeGaugeCollection();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
