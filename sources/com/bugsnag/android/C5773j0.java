package com.bugsnag.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.provider.Settings;
import android.util.DisplayMetrics;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlin.text.C19459m;

/* renamed from: com.bugsnag.android.j0 */
public final class C5773j0 {

    /* renamed from: a */
    public final boolean f12349a;

    /* renamed from: b */
    public final Float f12350b;

    /* renamed from: c */
    public final Integer f12351c;

    /* renamed from: d */
    public final String f12352d;

    /* renamed from: e */
    public final String f12353e;

    /* renamed from: f */
    public final String[] f12354f;

    /* renamed from: g */
    public final LinkedHashMap f12355g;

    /* renamed from: h */
    public final Future<Boolean> f12356h;

    /* renamed from: i */
    public final Future<Long> f12357i;

    /* renamed from: j */
    public AtomicInteger f12358j;

    /* renamed from: k */
    public final C5935y f12359k;

    /* renamed from: l */
    public final Context f12360l;

    /* renamed from: m */
    public final String f12361m;

    /* renamed from: n */
    public final C5757i0 f12362n;

    /* renamed from: o */
    public final File f12363o;

    /* renamed from: p */
    public final C5746g f12364p;

    /* renamed from: q */
    public final C5816o1 f12365q;

    /* renamed from: com.bugsnag.android.j0$a */
    public static final class C5774a<V> implements Callable<Boolean> {

        /* renamed from: b */
        public final /* synthetic */ RootDetector f12366b;

        public C5774a(RootDetector rootDetector) {
            this.f12366b = rootDetector;
        }

        public final Object call() {
            return Boolean.valueOf(this.f12366b.mo16461c());
        }
    }

    public C5773j0(C5935y yVar, Context context, Resources resources, String str, C5757i0 i0Var, File file, RootDetector rootDetector, C5746g gVar, C5816o1 o1Var) {
        String str2;
        Future<Long> future;
        C19383o.m32798h(yVar, "connectivity");
        C19383o.m32798h(context, "appContext");
        C19383o.m32798h(i0Var, "buildInfo");
        C19383o.m32798h(rootDetector, "rootDetector");
        C19383o.m32798h(gVar, "bgTaskService");
        C19383o.m32798h(o1Var, "logger");
        this.f12359k = yVar;
        this.f12360l = context;
        this.f12361m = str;
        this.f12362n = i0Var;
        this.f12363o = file;
        this.f12364p = gVar;
        this.f12365q = o1Var;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        String str3 = i0Var.f12290f;
        this.f12349a = str3 != null && (C19457k.m33025c1(str3, "unknown", false) || C19459m.m33036e1(str3, "generic", false) || C19459m.m33036e1(str3, "vbox", false));
        Future<Boolean> future2 = null;
        this.f12350b = displayMetrics != null ? Float.valueOf(displayMetrics.density) : null;
        this.f12351c = displayMetrics != null ? Integer.valueOf(displayMetrics.densityDpi) : null;
        if (displayMetrics != null) {
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            StringBuilder sb = new StringBuilder();
            sb.append(max);
            sb.append('x');
            sb.append(min);
            str2 = sb.toString();
        } else {
            str2 = null;
        }
        this.f12352d = str2;
        String locale = Locale.getDefault().toString();
        C19383o.m32793c(locale, "Locale.getDefault().toString()");
        this.f12353e = locale;
        String[] strArr = i0Var.f12293i;
        this.f12354f = strArr == null ? new String[0] : strArr;
        try {
            future = gVar.mo16513b(TaskType.DEFAULT, new C5802l0(this));
        } catch (RejectedExecutionException e) {
            this.f12365q.mo16602b("Failed to lookup available device memory", e);
            future = null;
        }
        this.f12357i = future;
        this.f12358j = new AtomicInteger(resources.getConfiguration().orientation);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.f12362n.f12288d;
        if (num != null) {
            linkedHashMap.put("androidApiLevel", Integer.valueOf(num.intValue()));
        }
        String str4 = this.f12362n.f12289e;
        if (str4 != null) {
            linkedHashMap.put("osBuild", str4);
        }
        this.f12355g = linkedHashMap;
        try {
            future2 = this.f12364p.mo16513b(TaskType.IO, new C5774a(rootDetector));
        } catch (RejectedExecutionException e2) {
            this.f12365q.mo16602b("Failed to perform root detection checks", e2);
        }
        this.f12356h = future2;
    }

    /* renamed from: a */
    public final C5753h0 mo16556a() {
        Object obj;
        Long l;
        C5757i0 i0Var = this.f12362n;
        String[] strArr = this.f12354f;
        boolean z = false;
        try {
            Future<Boolean> future = this.f12356h;
            if (future != null) {
                Boolean bool = future.get();
                C19383o.m32793c(bool, "rootedFuture.get()");
                if (bool.booleanValue()) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        Boolean valueOf = Boolean.valueOf(z);
        String str = this.f12361m;
        String str2 = this.f12353e;
        Future<Long> future2 = this.f12357i;
        Long l2 = null;
        if (future2 != null) {
            try {
                l = future2.get();
            } catch (Throwable th) {
                obj = Result.m35480constructorimpl(C0761x.m1673J(th));
            }
        } else {
            l = null;
        }
        obj = Result.m35480constructorimpl(l);
        if (!Result.m35485isFailureimpl(obj)) {
            l2 = obj;
        }
        return new C5753h0(i0Var, strArr, valueOf, str, str2, l2, C19294b0.m32558A0(this.f12355g));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028 A[SYNTHETIC, Splitter:B:11:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ all -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bugsnag.android.C5811n0 mo16557b(long r13) {
        /*
            r12 = this;
            com.bugsnag.android.i0 r1 = r12.f12362n
            r0 = 0
            java.util.concurrent.Future<java.lang.Boolean> r2 = r12.f12356h     // Catch:{ Exception -> 0x001a }
            if (r2 == 0) goto L_0x001a
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x001a }
            java.lang.String r3 = "rootedFuture.get()"
            kotlin.jvm.internal.C19383o.m32793c(r2, r3)     // Catch:{ Exception -> 0x001a }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x001a }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x001a }
            if (r2 == 0) goto L_0x001a
            r2 = 1
            goto L_0x001b
        L_0x001a:
            r2 = r0
        L_0x001b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = r12.f12361m
            java.lang.String r4 = r12.f12353e
            java.util.concurrent.Future<java.lang.Long> r5 = r12.f12357i
            r6 = 0
            if (r5 == 0) goto L_0x0031
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x002f }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r5 = move-exception
            goto L_0x0037
        L_0x0031:
            r5 = r6
        L_0x0032:
            java.lang.Object r5 = kotlin.Result.m35480constructorimpl(r5)     // Catch:{ all -> 0x002f }
            goto L_0x003f
        L_0x0037:
            kotlin.Result$Failure r5 = androidx.compose.foundation.layout.C0761x.m1673J(r5)
            java.lang.Object r5 = kotlin.Result.m35480constructorimpl(r5)
        L_0x003f:
            boolean r7 = kotlin.Result.m35485isFailureimpl(r5)
            if (r7 == 0) goto L_0x0046
            r5 = r6
        L_0x0046:
            java.lang.Long r5 = (java.lang.Long) r5
            java.util.LinkedHashMap r7 = r12.f12355g
            java.util.LinkedHashMap r7 = kotlin.collections.C19294b0.m32558A0(r7)
            com.bugsnag.android.g r8 = r12.f12364p     // Catch:{ all -> 0x0066 }
            com.bugsnag.android.TaskType r9 = com.bugsnag.android.TaskType.IO     // Catch:{ all -> 0x0066 }
            com.bugsnag.android.k0 r10 = new com.bugsnag.android.k0     // Catch:{ all -> 0x0066 }
            r10.<init>(r12)     // Catch:{ all -> 0x0066 }
            java.util.concurrent.Future r8 = r8.mo16513b(r9, r10)     // Catch:{ all -> 0x0066 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0066 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0066 }
            java.lang.Object r8 = kotlin.Result.m35480constructorimpl(r8)     // Catch:{ all -> 0x0066 }
            goto L_0x006f
        L_0x0066:
            r8 = move-exception
            kotlin.Result$Failure r8 = androidx.compose.foundation.layout.C0761x.m1673J(r8)
            java.lang.Object r8 = kotlin.Result.m35480constructorimpl(r8)
        L_0x006f:
            r9 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r10 = kotlin.Result.m35485isFailureimpl(r8)
            if (r10 == 0) goto L_0x007c
            r8 = r9
        L_0x007c:
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            android.content.Context r9 = r12.f12360l
            android.app.ActivityManager r9 = androidx.activity.C0114h.m296a0(r9)
            if (r9 == 0) goto L_0x009d
            android.app.ActivityManager$MemoryInfo r10 = new android.app.ActivityManager$MemoryInfo
            r10.<init>()
            r9.getMemoryInfo(r10)
            long r9 = r10.availMem
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x009e
        L_0x009d:
            r9 = r6
        L_0x009e:
            if (r9 == 0) goto L_0x00a1
            goto L_0x00cc
        L_0x00a1:
            java.lang.Class<android.os.Process> r9 = android.os.Process.class
            java.lang.String r10 = "getFreeMemory"
            java.lang.Class[] r11 = new java.lang.Class[r0]     // Catch:{ all -> 0x00b8 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r11)     // Catch:{ all -> 0x00b8 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = r9.invoke(r6, r0)     // Catch:{ all -> 0x00b8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c1
        L_0x00b8:
            r0 = move-exception
            kotlin.Result$Failure r0 = androidx.compose.foundation.layout.C0761x.m1673J(r0)
            java.lang.Object r0 = kotlin.Result.m35480constructorimpl(r0)
        L_0x00c1:
            boolean r9 = kotlin.Result.m35485isFailureimpl(r0)
            if (r9 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r6 = r0
        L_0x00c9:
            java.lang.Long r6 = (java.lang.Long) r6
            r9 = r6
        L_0x00cc:
            java.lang.String r10 = r12.mo16559d()
            java.util.Date r11 = new java.util.Date
            r11.<init>(r13)
            com.bugsnag.android.n0 r13 = new com.bugsnag.android.n0
            r0 = r13
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5773j0.mo16557b(long):com.bugsnag.android.n0");
    }

    /* renamed from: c */
    public final HashMap mo16558c() {
        String str;
        boolean z;
        HashMap hashMap = new HashMap();
        boolean z2 = false;
        String str2 = null;
        try {
            Intent v0 = C0114h.m324v0(this.f12360l, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), this.f12365q);
            if (v0 != null) {
                int intExtra = v0.getIntExtra("level", -1);
                int intExtra2 = v0.getIntExtra(ResponseConstants.SCALE, -1);
                if (!(intExtra == -1 && intExtra2 == -1)) {
                    hashMap.put("batteryLevel", Float.valueOf(((float) intExtra) / ((float) intExtra2)));
                }
                int intExtra3 = v0.getIntExtra(ResponseConstants.STATUS, -1);
                if (intExtra3 != 2) {
                    if (intExtra3 != 5) {
                        z = false;
                        hashMap.put("charging", Boolean.valueOf(z));
                    }
                }
                z = true;
                hashMap.put("charging", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
            this.f12365q.mo16608h("Could not get battery status");
        }
        try {
            String string = Settings.Secure.getString(this.f12360l.getContentResolver(), "location_providers_allowed");
            if (string != null) {
                if (string.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    str = "allowed";
                    str2 = str;
                    hashMap.put("locationStatus", str2);
                    hashMap.put("networkAccess", this.f12359k.mo1131f());
                    hashMap.put("brand", this.f12362n.f12292h);
                    hashMap.put("screenDensity", this.f12350b);
                    hashMap.put("dpi", this.f12351c);
                    hashMap.put("emulator", Boolean.valueOf(this.f12349a));
                    hashMap.put("screenResolution", this.f12352d);
                    return hashMap;
                }
            }
            str = "disallowed";
            str2 = str;
        } catch (Exception unused2) {
            this.f12365q.mo16608h("Could not get locationStatus");
        }
        hashMap.put("locationStatus", str2);
        hashMap.put("networkAccess", this.f12359k.mo1131f());
        hashMap.put("brand", this.f12362n.f12292h);
        hashMap.put("screenDensity", this.f12350b);
        hashMap.put("dpi", this.f12351c);
        hashMap.put("emulator", Boolean.valueOf(this.f12349a));
        hashMap.put("screenResolution", this.f12352d);
        return hashMap;
    }

    /* renamed from: d */
    public final String mo16559d() {
        int i = this.f12358j.get();
        if (i == 1) {
            return "portrait";
        }
        if (i != 2) {
            return null;
        }
        return "landscape";
    }
}
