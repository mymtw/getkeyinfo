package com.bugsnag.android.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.support.p013v4.media.C0072d;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.C5731d0;
import com.bugsnag.android.C5747g0;
import com.bugsnag.android.C5815o0;
import com.bugsnag.android.C5816o1;
import com.bugsnag.android.C5828r0;
import com.bugsnag.android.C5908s0;
import com.bugsnag.android.C5912t0;
import com.bugsnag.android.C5922v0;
import com.bugsnag.android.ThreadSendPolicy;
import java.io.File;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.C19285c;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.bugsnag.android.internal.c */
public final class C5763c {

    /* renamed from: A */
    public final ApplicationInfo f12309A;

    /* renamed from: B */
    public final Collection<String> f12310B;

    /* renamed from: a */
    public final String f12311a;

    /* renamed from: b */
    public final boolean f12312b;

    /* renamed from: c */
    public final C5828r0 f12313c;

    /* renamed from: d */
    public final boolean f12314d;

    /* renamed from: e */
    public final ThreadSendPolicy f12315e;

    /* renamed from: f */
    public final Collection<String> f12316f;

    /* renamed from: g */
    public final Collection<String> f12317g = null;

    /* renamed from: h */
    public final Collection<String> f12318h;

    /* renamed from: i */
    public final Set<BreadcrumbType> f12319i;

    /* renamed from: j */
    public final String f12320j;

    /* renamed from: k */
    public final String f12321k;

    /* renamed from: l */
    public final String f12322l;

    /* renamed from: m */
    public final Integer f12323m;

    /* renamed from: n */
    public final String f12324n;

    /* renamed from: o */
    public final C5731d0 f12325o;

    /* renamed from: p */
    public final C5815o0 f12326p;

    /* renamed from: q */
    public final boolean f12327q;

    /* renamed from: r */
    public final long f12328r;

    /* renamed from: s */
    public final C5816o1 f12329s;

    /* renamed from: t */
    public final int f12330t;

    /* renamed from: u */
    public final int f12331u;

    /* renamed from: v */
    public final int f12332v;

    /* renamed from: w */
    public final int f12333w;

    /* renamed from: x */
    public final C19285c<File> f12334x;

    /* renamed from: y */
    public final boolean f12335y;

    /* renamed from: z */
    public final PackageInfo f12336z;

    public C5763c(String str, boolean z, C5828r0 r0Var, boolean z2, ThreadSendPolicy threadSendPolicy, Set set, Set set2, String str2, String str3, Integer num, String str4, C5731d0 d0Var, C5815o0 o0Var, long j, C5816o1 o1Var, int i, int i2, int i3, int i4, C19285c cVar, boolean z3, PackageInfo packageInfo, ApplicationInfo applicationInfo, Set set3) {
        Set set4 = set3;
        C19383o.m32798h(set, "discardClasses");
        C19383o.m32798h(set2, "projectPackages");
        C19383o.m32798h(set4, "redactedKeys");
        this.f12311a = str;
        this.f12312b = z;
        this.f12313c = r0Var;
        this.f12314d = z2;
        this.f12315e = threadSendPolicy;
        this.f12316f = set;
        this.f12318h = set2;
        this.f12319i = null;
        this.f12320j = str2;
        this.f12321k = str3;
        this.f12322l = null;
        this.f12323m = num;
        this.f12324n = str4;
        this.f12325o = d0Var;
        this.f12326p = o0Var;
        this.f12327q = false;
        this.f12328r = j;
        this.f12329s = o1Var;
        this.f12330t = i;
        this.f12331u = i2;
        this.f12332v = i3;
        this.f12333w = i4;
        this.f12334x = cVar;
        this.f12335y = z3;
        this.f12336z = packageInfo;
        this.f12309A = applicationInfo;
        this.f12310B = set4;
    }

    /* renamed from: a */
    public final C5747g0 mo16544a(C5922v0 v0Var) {
        Set set;
        C19383o.m32798h(v0Var, "payload");
        String str = this.f12326p.f12436a;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("Bugsnag-Payload-Version", "4.0");
        String str2 = v0Var.f12665c;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("Bugsnag-Api-Key", str2);
        pairArr[2] = new Pair("Bugsnag-Sent-At", C5760a.m11557b(new Date()));
        pairArr[3] = new Pair("Content-Type", "application/json");
        LinkedHashMap t0 = C19294b0.m32563t0(pairArr);
        C5908s0 s0Var = v0Var.f12666d;
        if (s0Var != null) {
            set = s0Var.f12603b.mo16689a();
        } else {
            File file = v0Var.f12667e;
            if (file != null) {
                C5912t0.C5913a aVar = C5912t0.f12608f;
                C5763c cVar = v0Var.f12668f;
                aVar.getClass();
                set = C5912t0.C5913a.m11705b(file, cVar).f12613e;
            } else {
                set = EmptySet.INSTANCE;
            }
        }
        if (true ^ set.isEmpty()) {
            t0.put("Bugsnag-Stacktrace-Types", C19388s.m32886t0(set));
        }
        return new C5747g0(str, C19294b0.m32568y0(t0));
    }

    /* renamed from: b */
    public final boolean mo16545b(BreadcrumbType breadcrumbType) {
        C19383o.m32798h(breadcrumbType, "type");
        Set<BreadcrumbType> set = this.f12319i;
        return set != null && !set.contains(breadcrumbType);
    }

    /* renamed from: c */
    public final boolean mo16546c() {
        Collection<String> collection = this.f12317g;
        return collection != null && !C19327t.m32634P0(this.f12320j, collection);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16547d(java.lang.Throwable r5) {
        /*
            r4 = this;
            java.lang.String r0 = "exc"
            kotlin.jvm.internal.C19383o.m32798h(r5, r0)
            boolean r0 = r4.mo16546c()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0041
            java.util.List r5 = androidx.compose.foundation.layout.C0761x.m1674J0(r5)
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001c
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x001c
            goto L_0x003e
        L_0x001c:
            java.util.Iterator r5 = r5.iterator()
        L_0x0020:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r5.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.util.Collection<java.lang.String> r3 = r4.f12316f
            boolean r0 = kotlin.collections.C19327t.m32634P0(r0, r3)
            if (r0 == 0) goto L_0x0020
            r5 = r2
            goto L_0x003f
        L_0x003e:
            r5 = r1
        L_0x003f:
            if (r5 == 0) goto L_0x0042
        L_0x0041:
            r1 = r2
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.internal.C5763c.mo16547d(java.lang.Throwable):boolean");
    }

    /* renamed from: e */
    public final boolean mo16548e(boolean z) {
        return mo16546c() || (z && !this.f12314d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5763c)) {
            return false;
        }
        C5763c cVar = (C5763c) obj;
        return C19383o.m32792b(this.f12311a, cVar.f12311a) && this.f12312b == cVar.f12312b && C19383o.m32792b(this.f12313c, cVar.f12313c) && this.f12314d == cVar.f12314d && C19383o.m32792b(this.f12315e, cVar.f12315e) && C19383o.m32792b(this.f12316f, cVar.f12316f) && C19383o.m32792b(this.f12317g, cVar.f12317g) && C19383o.m32792b(this.f12318h, cVar.f12318h) && C19383o.m32792b(this.f12319i, cVar.f12319i) && C19383o.m32792b(this.f12320j, cVar.f12320j) && C19383o.m32792b(this.f12321k, cVar.f12321k) && C19383o.m32792b(this.f12322l, cVar.f12322l) && C19383o.m32792b(this.f12323m, cVar.f12323m) && C19383o.m32792b(this.f12324n, cVar.f12324n) && C19383o.m32792b(this.f12325o, cVar.f12325o) && C19383o.m32792b(this.f12326p, cVar.f12326p) && this.f12327q == cVar.f12327q && this.f12328r == cVar.f12328r && C19383o.m32792b(this.f12329s, cVar.f12329s) && this.f12330t == cVar.f12330t && this.f12331u == cVar.f12331u && this.f12332v == cVar.f12332v && this.f12333w == cVar.f12333w && C19383o.m32792b(this.f12334x, cVar.f12334x) && this.f12335y == cVar.f12335y && C19383o.m32792b(this.f12336z, cVar.f12336z) && C19383o.m32792b(this.f12309A, cVar.f12309A) && C19383o.m32792b(this.f12310B, cVar.f12310B);
    }

    public final int hashCode() {
        String str = this.f12311a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f12312b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C5828r0 r0Var = this.f12313c;
        int hashCode2 = (i2 + (r0Var != null ? r0Var.hashCode() : 0)) * 31;
        boolean z3 = this.f12314d;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        ThreadSendPolicy threadSendPolicy = this.f12315e;
        int hashCode3 = (i3 + (threadSendPolicy != null ? threadSendPolicy.hashCode() : 0)) * 31;
        Collection<String> collection = this.f12316f;
        int hashCode4 = (hashCode3 + (collection != null ? collection.hashCode() : 0)) * 31;
        Collection<String> collection2 = this.f12317g;
        int hashCode5 = (hashCode4 + (collection2 != null ? collection2.hashCode() : 0)) * 31;
        Collection<String> collection3 = this.f12318h;
        int hashCode6 = (hashCode5 + (collection3 != null ? collection3.hashCode() : 0)) * 31;
        Set<BreadcrumbType> set = this.f12319i;
        int hashCode7 = (hashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str2 = this.f12320j;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12321k;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f12322l;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f12323m;
        int hashCode11 = (hashCode10 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f12324n;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        C5731d0 d0Var = this.f12325o;
        int hashCode13 = (hashCode12 + (d0Var != null ? d0Var.hashCode() : 0)) * 31;
        C5815o0 o0Var = this.f12326p;
        int hashCode14 = (hashCode13 + (o0Var != null ? o0Var.hashCode() : 0)) * 31;
        boolean z4 = this.f12327q;
        if (z4) {
            z4 = true;
        }
        long j = this.f12328r;
        int i4 = (((hashCode14 + (z4 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C5816o1 o1Var = this.f12329s;
        int hashCode15 = (((((((((i4 + (o1Var != null ? o1Var.hashCode() : 0)) * 31) + this.f12330t) * 31) + this.f12331u) * 31) + this.f12332v) * 31) + this.f12333w) * 31;
        C19285c<File> cVar = this.f12334x;
        int hashCode16 = (hashCode15 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        boolean z5 = this.f12335y;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (hashCode16 + (z2 ? 1 : 0)) * 31;
        PackageInfo packageInfo = this.f12336z;
        int hashCode17 = (i5 + (packageInfo != null ? packageInfo.hashCode() : 0)) * 31;
        ApplicationInfo applicationInfo = this.f12309A;
        int hashCode18 = (hashCode17 + (applicationInfo != null ? applicationInfo.hashCode() : 0)) * 31;
        Collection<String> collection4 = this.f12310B;
        if (collection4 != null) {
            i = collection4.hashCode();
        }
        return hashCode18 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ImmutableConfig(apiKey=");
        h.append(this.f12311a);
        h.append(", autoDetectErrors=");
        h.append(this.f12312b);
        h.append(", enabledErrorTypes=");
        h.append(this.f12313c);
        h.append(", autoTrackSessions=");
        h.append(this.f12314d);
        h.append(", sendThreads=");
        h.append(this.f12315e);
        h.append(", discardClasses=");
        h.append(this.f12316f);
        h.append(", enabledReleaseStages=");
        h.append(this.f12317g);
        h.append(", projectPackages=");
        h.append(this.f12318h);
        h.append(", enabledBreadcrumbTypes=");
        h.append(this.f12319i);
        h.append(", releaseStage=");
        h.append(this.f12320j);
        h.append(", buildUuid=");
        h.append(this.f12321k);
        h.append(", appVersion=");
        h.append(this.f12322l);
        h.append(", versionCode=");
        h.append(this.f12323m);
        h.append(", appType=");
        h.append(this.f12324n);
        h.append(", delivery=");
        h.append(this.f12325o);
        h.append(", endpoints=");
        h.append(this.f12326p);
        h.append(", persistUser=");
        h.append(this.f12327q);
        h.append(", launchDurationMillis=");
        h.append(this.f12328r);
        h.append(", logger=");
        h.append(this.f12329s);
        h.append(", maxBreadcrumbs=");
        h.append(this.f12330t);
        h.append(", maxPersistedEvents=");
        h.append(this.f12331u);
        h.append(", maxPersistedSessions=");
        h.append(this.f12332v);
        h.append(", maxReportedThreads=");
        h.append(this.f12333w);
        h.append(", persistenceDirectory=");
        h.append(this.f12334x);
        h.append(", sendLaunchCrashesSynchronously=");
        h.append(this.f12335y);
        h.append(", packageInfo=");
        h.append(this.f12336z);
        h.append(", appInfo=");
        h.append(this.f12309A);
        h.append(", redactedKeys=");
        h.append(this.f12310B);
        h.append(")");
        return h.toString();
    }
}
