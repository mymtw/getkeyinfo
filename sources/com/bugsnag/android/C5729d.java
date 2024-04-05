package com.bugsnag.android;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import androidx.compose.foundation.layout.C0761x;
import com.bugsnag.android.internal.C5763c;
import java.util.HashMap;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.d */
public final class C5729d {

    /* renamed from: l */
    public static final long f12195l = SystemClock.elapsedRealtime();

    /* renamed from: m */
    public static final C5730a f12196m = new C5730a();

    /* renamed from: a */
    public final String f12197a;

    /* renamed from: b */
    public final Boolean f12198b;

    /* renamed from: c */
    public String f12199c;

    /* renamed from: d */
    public final String f12200d;

    /* renamed from: e */
    public final String f12201e;

    /* renamed from: f */
    public final String f12202f;

    /* renamed from: g */
    public final String f12203g;

    /* renamed from: h */
    public final C5763c f12204h;

    /* renamed from: i */
    public final C5738e2 f12205i;

    /* renamed from: j */
    public final C5803l1 f12206j;

    /* renamed from: k */
    public final C5825q1 f12207k;

    /* renamed from: com.bugsnag.android.d$a */
    public static final class C5730a {
    }

    public C5729d(Context context, PackageManager packageManager, C5763c cVar, C5738e2 e2Var, ActivityManager activityManager, C5803l1 l1Var, C5825q1 q1Var) {
        Object obj;
        String str;
        C19383o.m32798h(context, "appContext");
        C19383o.m32798h(cVar, "config");
        C19383o.m32798h(e2Var, "sessionTracker");
        C19383o.m32798h(l1Var, "launchCrashTracker");
        C19383o.m32798h(q1Var, "memoryTrimState");
        this.f12204h = cVar;
        this.f12205i = e2Var;
        this.f12206j = l1Var;
        this.f12207k = q1Var;
        String packageName = context.getPackageName();
        C19383o.m32793c(packageName, "appContext.packageName");
        this.f12197a = packageName;
        String str2 = null;
        this.f12198b = (activityManager == null || Build.VERSION.SDK_INT < 28 || !activityManager.isBackgroundRestricted()) ? null : Boolean.TRUE;
        ApplicationInfo applicationInfo = cVar.f12309A;
        this.f12200d = (packageManager == null || applicationInfo == null) ? null : packageManager.getApplicationLabel(applicationInfo).toString();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                str = Application.getProcessName();
            } else {
                Object invoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke((Object) null, new Object[0]);
                if (invoke != null) {
                    str = (String) invoke;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            }
            obj = Result.m35480constructorimpl(str);
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        this.f12201e = (String) (Result.m35485isFailureimpl(obj) ? null : obj);
        C5763c cVar2 = this.f12204h;
        this.f12202f = cVar2.f12320j;
        String str3 = cVar2.f12322l;
        if (str3 != null) {
            str2 = str3;
        } else {
            PackageInfo packageInfo = cVar2.f12336z;
            if (packageInfo != null) {
                str2 = packageInfo.versionName;
            }
        }
        this.f12203g = str2;
    }

    /* renamed from: a */
    public final C5724c mo16497a() {
        C5763c cVar = this.f12204h;
        String str = this.f12199c;
        String str2 = this.f12197a;
        String str3 = this.f12202f;
        String str4 = this.f12203g;
        C19383o.m32798h(cVar, "config");
        return new C5724c(str, str2, str3, str4, (String) null, cVar.f12321k, cVar.f12324n, cVar.f12323m);
    }

    /* renamed from: b */
    public final C5735e mo16498b() {
        long valueOf;
        Boolean d = this.f12205i.mo16506d();
        if (d == null) {
            valueOf = null;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f12205i.f12225i.get();
            long j2 = (!d.booleanValue() || j == 0) ? 0 : elapsedRealtime - j;
            valueOf = j2 > 0 ? Long.valueOf(j2) : 0L;
        }
        Long l = valueOf;
        C5763c cVar = this.f12204h;
        String str = this.f12199c;
        String str2 = this.f12197a;
        String str3 = this.f12202f;
        String str4 = this.f12203g;
        f12196m.getClass();
        Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - f12195l);
        Boolean valueOf3 = Boolean.valueOf(this.f12206j.f12411b.get());
        C19383o.m32798h(cVar, "config");
        return new C5735e(str, str2, str3, str4, (String) null, cVar.f12321k, cVar.f12324n, cVar.f12323m, valueOf2, l, d, valueOf3);
    }

    /* renamed from: c */
    public final HashMap mo16499c() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f12200d);
        hashMap.put("activeScreen", this.f12205i.mo16505c());
        hashMap.put("lowMemory", Boolean.valueOf(this.f12207k.f12459b));
        hashMap.put("memoryTrimLevel", this.f12207k.mo16613b());
        Runtime runtime = Runtime.getRuntime();
        long j = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        hashMap.put("memoryUsage", Long.valueOf(j - freeMemory));
        hashMap.put("totalMemory", Long.valueOf(j));
        hashMap.put("freeMemory", Long.valueOf(freeMemory));
        hashMap.put("memoryLimit", Long.valueOf(runtime.maxMemory()));
        Boolean bool = this.f12198b;
        if (bool != null) {
            bool.booleanValue();
            hashMap.put("backgroundWorkRestricted", this.f12198b);
        }
        String str = this.f12201e;
        if (str != null) {
            hashMap.put("processName", str);
        }
        return hashMap;
    }
}
