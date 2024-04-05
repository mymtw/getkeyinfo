package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.login.LoginStatusClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.C15050o3;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p514bk.C14088a;
import p565fk.C17745a;

/* renamed from: com.google.android.gms.internal.measurement.m1 */
public final class C14726m1 {

    /* renamed from: g */
    public static volatile C14726m1 f32944g;

    /* renamed from: a */
    public final Clock f32945a = DefaultClock.getInstance();

    /* renamed from: b */
    public final ExecutorService f32946b;

    /* renamed from: c */
    public final C17745a f32947c;

    /* renamed from: d */
    public int f32948d;

    /* renamed from: e */
    public boolean f32949e;

    /* renamed from: f */
    public volatile zzcc f32950f;

    public C14726m1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C14583b1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f32946b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f32947c = new C17745a(this);
        new ArrayList();
        try {
            C14088a.m21778A(context, C15050o3.m24586a(context));
        } catch (IllegalStateException unused) {
        }
        mo50666b(new C14790r0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C14713l1(this));
        }
    }

    /* renamed from: d */
    public static C14726m1 m23709d(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f32944g == null) {
            synchronized (C14726m1.class) {
                if (f32944g == null) {
                    f32944g = new C14726m1(context, bundle);
                }
            }
        }
        return f32944g;
    }

    /* renamed from: a */
    public final void mo50665a(Exception exc, boolean z, boolean z2) {
        this.f32949e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo50666b(new C14570a1(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    /* renamed from: b */
    public final void mo50666b(C14635f1 f1Var) {
        this.f32946b.execute(f1Var);
    }

    /* renamed from: c */
    public final int mo50667c(String str) {
        zzbz zzbz = new zzbz();
        mo50666b(new C14596c1(this, str, zzbz));
        Integer num = (Integer) zzbz.zze(zzbz.zzb(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public final List<Bundle> mo50668e(String str, String str2) {
        zzbz zzbz = new zzbz();
        mo50666b(new C14738n0(this, str, str2, zzbz));
        List<Bundle> list = (List) zzbz.zze(zzbz.zzb(LoginStatusClient.DEFAULT_TOAST_DURATION_MS), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: f */
    public final Map<String, Object> mo50669f(String str, String str2, boolean z) {
        zzbz zzbz = new zzbz();
        mo50666b(new C14886z0(this, str, str2, z, zzbz));
        Bundle zzb = zzbz.zzb(LoginStatusClient.DEFAULT_TOAST_DURATION_MS);
        if (zzb == null || zzb.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zzb.size());
        for (String next : zzb.keySet()) {
            Object obj = zzb.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }
}
