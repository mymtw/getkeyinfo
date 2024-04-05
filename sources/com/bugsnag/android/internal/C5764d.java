package com.bugsnag.android.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.foundation.layout.C0761x;
import com.bugsnag.android.C5725c0;
import com.bugsnag.android.C5731d0;
import com.bugsnag.android.C5815o0;
import com.bugsnag.android.C5816o1;
import com.bugsnag.android.C5828r0;
import com.bugsnag.android.C5925w;
import com.bugsnag.android.C5932x;
import com.bugsnag.android.C5938z;
import com.bugsnag.android.ThreadSendPolicy;
import java.util.Iterator;
import java.util.Set;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.Result;
import kotlin.collections.C19327t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p568fn.C17782b;

/* renamed from: com.bugsnag.android.internal.d */
public final class C5764d {
    /* renamed from: a */
    public static final C5763c m11564a(Context context, C5932x xVar, C5938z zVar) {
        Object obj;
        Object obj2;
        String str;
        C5828r0 r0Var;
        boolean z;
        Context context2 = context;
        C5932x xVar2 = xVar;
        C19383o.m32798h(context2, "appContext");
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            obj = Result.m35480constructorimpl(packageManager.getPackageInfo(packageName, 0));
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
        if (Result.m35485isFailureimpl(obj)) {
            obj = null;
        }
        PackageInfo packageInfo = (PackageInfo) obj;
        try {
            obj2 = Result.m35480constructorimpl(packageManager.getApplicationInfo(packageName, 128));
        } catch (Throwable th2) {
            obj2 = Result.m35480constructorimpl(C0761x.m1673J(th2));
        }
        if (Result.m35485isFailureimpl(obj2)) {
            obj2 = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj2;
        C5925w wVar = xVar2.f12711a;
        if (wVar.f12676f == null) {
            wVar.f12676f = (applicationInfo == null || (applicationInfo.flags & 2) == 0) ? "production" : "development";
        }
        C5816o1 o1Var = wVar.f12684n;
        if (o1Var == null || C19383o.m32792b(o1Var, C19421p.f43315e)) {
            if (!C19383o.m32792b("production", xVar2.f12711a.f12676f)) {
                xVar2.f12711a.f12684n = C19421p.f43315e;
            } else {
                xVar2.f12711a.f12684n = C17782b.f38637h;
            }
        }
        Integer num = xVar2.f12711a.f12675e;
        if (num == null || num.intValue() == 0) {
            xVar2.f12711a.f12675e = packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null;
        }
        if (xVar2.f12711a.f12692v.isEmpty()) {
            C19383o.m32793c(packageName, "packageName");
            Set<String> C0 = C19382n.m32702C0(packageName);
            Iterator<String> it = C0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() == null) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                xVar2.f12711a.f12684n.mo16605e("Invalid null value supplied to config.projectPackages, ignoring");
            } else {
                C5925w wVar2 = xVar2.f12711a;
                wVar2.getClass();
                wVar2.f12692v = C0;
            }
        }
        Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
        if (bundle == null || !bundle.containsKey("com.bugsnag.android.BUILD_UUID")) {
            str = null;
        } else {
            String string = bundle.getString("com.bugsnag.android.BUILD_UUID");
            str = string != null ? string : String.valueOf(bundle.getInt("com.bugsnag.android.BUILD_UUID"));
        }
        C5925w wVar3 = xVar2.f12711a;
        if (wVar3.f12685o == null) {
            C5816o1 o1Var2 = wVar3.f12684n;
            if (o1Var2 != null) {
                wVar3.f12685o = new C5725c0(zVar, o1Var2);
            } else {
                C19383o.m32803m();
                throw null;
            }
        }
        C19285c b = C19350d.m32677b(new ImmutableConfigKt$sanitiseConfiguration$1(xVar2, context2));
        C5925w wVar4 = xVar2.f12711a;
        if (wVar4.f12682l) {
            C5828r0 r0Var2 = wVar4.f12681k;
            r0Var = new C5828r0(r0Var2.f12462a, r0Var2.f12463b, r0Var2.f12464c, r0Var2.f12465d);
        } else {
            r0Var = new C5828r0(false, false, false, false);
        }
        String str2 = wVar4.f12695y;
        C19383o.m32793c(str2, "config.apiKey");
        C5925w wVar5 = xVar2.f12711a;
        boolean z2 = wVar5.f12682l;
        boolean z3 = wVar5.f12679i;
        ThreadSendPolicy threadSendPolicy = wVar5.f12677g;
        C19383o.m32793c(threadSendPolicy, "config.sendThreads");
        EmptySet emptySet = xVar2.f12711a.f12691u;
        C19383o.m32793c(emptySet, "config.discardClasses");
        Set t1 = C19327t.m32664t1(emptySet);
        xVar2.f12711a.getClass();
        Set<String> set = xVar2.f12711a.f12692v;
        C19383o.m32793c(set, "config.projectPackages");
        Set<T> t12 = C19327t.m32664t1(set);
        C5925w wVar6 = xVar2.f12711a;
        String str3 = wVar6.f12676f;
        Integer num2 = wVar6.f12675e;
        String str4 = wVar6.f12683m;
        C5731d0 d0Var = wVar6.f12685o;
        C19383o.m32793c(d0Var, "config.delivery");
        C5815o0 o0Var = xVar2.f12711a.f12686p;
        String str5 = str4;
        C19383o.m32793c(o0Var, "config.endpoints");
        xVar2.f12711a.getClass();
        C5925w wVar7 = xVar2.f12711a;
        PackageInfo packageInfo2 = packageInfo;
        C5815o0 o0Var2 = o0Var;
        long j = wVar7.f12678h;
        C5816o1 o1Var3 = wVar7.f12684n;
        if (o1Var3 != null) {
            Set<String> set2 = wVar7.f12673c.f12604b.f12467b.f12669a;
            C19383o.m32793c(set2, "config.redactedKeys");
            return new C5763c(str2, z2, r0Var, z3, threadSendPolicy, t1, t12, str3, str, num2, str5, d0Var, o0Var2, j, o1Var3, wVar7.f12687q, wVar7.f12688r, wVar7.f12689s, wVar7.f12690t, b, wVar7.f12680j, packageInfo2, applicationInfo, C19327t.m32664t1(set2));
        }
        C19383o.m32803m();
        throw null;
    }
}
