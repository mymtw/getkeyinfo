package com.bugsnag.android;

import android.annotation.SuppressLint;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5763c;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();
    @SuppressLint({"StaticFieldLeak"})
    private static C5917u client;

    /* renamed from: com.bugsnag.android.NativeInterface$a */
    public class C5708a implements C5934x1 {

        /* renamed from: a */
        public final /* synthetic */ Severity f12118a;

        /* renamed from: b */
        public final /* synthetic */ String f12119b;

        /* renamed from: c */
        public final /* synthetic */ String f12120c;

        public C5708a(Severity severity, String str, String str2) {
            this.f12118a = severity;
            this.f12119b = str;
            this.f12120c = str2;
        }

        /* renamed from: a */
        public final void mo16417a(C5908s0 s0Var) {
            s0Var.mo16669b(this.f12118a);
            List<C5819p0> list = s0Var.f12603b.f12658m;
            C5819p0 p0Var = list.get(0);
            if (!list.isEmpty()) {
                p0Var.mo16610a(this.f12119b);
                p0Var.f12445b.f12457d = this.f12120c;
                for (C5819p0 next : list) {
                    ErrorType errorType = ErrorType.C;
                    if (errorType != null) {
                        C5824q0 q0Var = next.f12445b;
                        q0Var.getClass();
                        q0Var.f12458e = errorType;
                    } else {
                        next.f12446c.mo16605e("Invalid null value supplied to error.type, ignoring");
                    }
                }
            }
        }
    }

    public static void addMetadata(String str, String str2, Object obj) {
        C5917u client2 = getClient();
        if (str == null || str2 == null) {
            client2.mo16684c("addMetadata");
            return;
        }
        C5909s1 s1Var = client2.f12623b;
        s1Var.getClass();
        s1Var.f12604b.mo16615a(str, str2, obj);
        s1Var.mo16671b(obj, str, str2);
    }

    public static void clearMetadata(String str, String str2) {
        if (str2 == null) {
            C5917u client2 = getClient();
            if (str != null) {
                C5909s1 s1Var = client2.f12623b;
                s1Var.getClass();
                C5829r1 r1Var = s1Var.f12604b;
                r1Var.getClass();
                r1Var.f12468c.remove(str);
                s1Var.mo16670a(str, (String) null);
                return;
            }
            client2.mo16684c("clearMetadata");
            return;
        }
        C5917u client3 = getClient();
        if (str != null) {
            C5909s1 s1Var2 = client3.f12623b;
            s1Var2.getClass();
            s1Var2.f12604b.mo16617c(str, str2);
            s1Var2.mo16670a(str, str2);
            return;
        }
        client3.mo16684c("clearMetadata");
    }

    public static C5908s0 createEvent(Throwable th, C5917u uVar, C5750g2 g2Var) {
        return new C5908s0(th, uVar.f12622a, g2Var, uVar.f12623b.f12604b, uVar.f12624c.f12147b, uVar.f12636o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[Catch:{ Exception -> 0x00a9, all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5 A[Catch:{ Exception -> 0x00a9, all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1 A[SYNTHETIC, Splitter:B:44:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d5 A[SYNTHETIC, Splitter:B:53:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void deliverReport(byte[] r6, byte[] r7, java.lang.String r8, boolean r9) {
        /*
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = UTF8Charset
            r0.<init>(r7, r1)
            r7 = 0
            if (r6 != 0) goto L_0x000f
            r1 = r7
            goto L_0x0016
        L_0x000f:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = UTF8Charset
            r1.<init>(r6, r2)
        L_0x0016:
            com.bugsnag.android.u r6 = getClient()
            com.bugsnag.android.internal.c r2 = r6.f12622a
            if (r1 == 0) goto L_0x002a
            int r1 = r1.length()
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.mo16546c()
            if (r1 != 0) goto L_0x00cf
        L_0x002a:
            com.bugsnag.android.w0 r6 = r6.f12633l
            r6.getClass()
            com.bugsnag.android.t0$a r1 = com.bugsnag.android.C5912t0.f12608f
            com.bugsnag.android.internal.c r2 = r6.f12697h
            r1.getClass()
            com.bugsnag.android.t0 r8 = com.bugsnag.android.C5912t0.C5913a.m11704a(r0, r8, r2)
            java.lang.String r8 = r8.mo16676a()
            if (r9 == 0) goto L_0x0048
            java.lang.String r9 = ".json"
            java.lang.String r1 = "startupcrash.json"
            java.lang.String r8 = r8.replace(r9, r1)
        L_0x0048:
            java.lang.String r9 = "Failed to close unsent payload writer: "
            java.io.File r1 = r6.f12175a
            boolean r1 = r6.mo16494f(r1)
            if (r1 != 0) goto L_0x0054
            goto L_0x00cf
        L_0x0054:
            r6.mo16491c()
            java.util.concurrent.locks.ReentrantLock r1 = r6.f12178d
            r1.lock()
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.f12175a
            r1.<init>(r2, r8)
            java.lang.String r1 = r1.getAbsolutePath()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            r2.<init>(r1)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            r3.<init>(r4)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            r3.write(r0)     // Catch:{ Exception -> 0x0088 }
            r3.close()     // Catch:{ Exception -> 0x007f }
            goto L_0x00ca
        L_0x007f:
            r7 = move-exception
            com.bugsnag.android.o1 r0 = r6.f12180f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00bd
        L_0x0088:
            r7 = move-exception
            goto L_0x008f
        L_0x008a:
            r0 = move-exception
            goto L_0x00d3
        L_0x008c:
            r0 = move-exception
            r3 = r7
            r7 = r0
        L_0x008f:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00d0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d0 }
            com.bugsnag.android.c1$a r1 = r6.f12181g     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x009d
            java.lang.String r2 = "NDK Crash report copy"
            r1.mo16496a(r7, r0, r2)     // Catch:{ all -> 0x00d0 }
        L_0x009d:
            com.bugsnag.android.o1 r7 = r6.f12180f     // Catch:{ all -> 0x00d0 }
            boolean r1 = r0.delete()     // Catch:{ Exception -> 0x00a9 }
            if (r1 != 0) goto L_0x00af
            r0.deleteOnExit()     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00af
        L_0x00a9:
            r0 = move-exception
            java.lang.String r1 = "Failed to delete file"
            r7.mo16602b(r1, r0)     // Catch:{ all -> 0x00d0 }
        L_0x00af:
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00ca
        L_0x00b5:
            r7 = move-exception
            com.bugsnag.android.o1 r0 = r6.f12180f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00bd:
            r1.append(r9)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.mo16602b(r8, r7)
        L_0x00ca:
            java.util.concurrent.locks.ReentrantLock r6 = r6.f12178d
            r6.unlock()
        L_0x00cf:
            return
        L_0x00d0:
            r7 = move-exception
            r0 = r7
            r7 = r3
        L_0x00d3:
            if (r7 == 0) goto L_0x00ee
            r7.close()     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00ee
        L_0x00d9:
            r7 = move-exception
            com.bugsnag.android.o1 r1 = r6.f12180f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.mo16602b(r8, r7)
        L_0x00ee:
            java.util.concurrent.locks.ReentrantLock r6 = r6.f12178d
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.NativeInterface.deliverReport(byte[], byte[], java.lang.String, boolean):void");
    }

    public static Map<String, Object> getApp() {
        HashMap hashMap = new HashMap();
        C5729d dVar = getClient().f12630i;
        C5735e b = dVar.mo16498b();
        hashMap.put(ResponseConstants.VERSION, b.f12168e);
        hashMap.put("releaseStage", b.f12167d);
        hashMap.put("id", b.f12166c);
        hashMap.put("type", b.f12171h);
        hashMap.put("buildUUID", b.f12170g);
        hashMap.put("duration", b.f12209j);
        hashMap.put("durationInForeground", b.f12210k);
        hashMap.put("versionCode", b.f12172i);
        hashMap.put("inForeground", b.f12211l);
        hashMap.put("isLaunching", b.f12212m);
        hashMap.put("binaryArch", b.f12165b);
        hashMap.putAll(dVar.mo16499c());
        return hashMap;
    }

    public static String getAppVersion() {
        return getClient().f12622a.f12322l;
    }

    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().f12631j.copy();
    }

    private static C5917u getClient() {
        C5917u uVar = client;
        return uVar != null ? uVar : C5777k.m11576b();
    }

    public static String getContext() {
        return getClient().f12625d.mo16479b();
    }

    public static String[] getCpuAbi() {
        String[] strArr = getClient().f12629h.f12362n.f12293i;
        return strArr != null ? strArr : new String[0];
    }

    public static C5728c2 getCurrentSession() {
        C5728c2 c2Var = getClient().f12634m.f12226j;
        if (c2Var == null || c2Var.f12194n.get()) {
            return null;
        }
        return c2Var;
    }

    public static Map<String, Object> getDevice() {
        C5773j0 j0Var = getClient().f12629h;
        HashMap hashMap = new HashMap(j0Var.mo16558c());
        C5811n0 b = j0Var.mo16557b(new Date().getTime());
        hashMap.put("freeDisk", b.f12427l);
        hashMap.put("freeMemory", b.f12428m);
        hashMap.put("orientation", b.f12429n);
        hashMap.put("time", b.f12430o);
        hashMap.put("cpuAbi", b.f12272g);
        hashMap.put("jailbroken", b.f12273h);
        hashMap.put("id", b.f12274i);
        hashMap.put("locale", b.f12275j);
        hashMap.put("manufacturer", b.f12267b);
        hashMap.put("model", b.f12268c);
        hashMap.put("osName", b.f12269d);
        hashMap.put("osVersion", b.f12270e);
        hashMap.put("runtimeVersions", b.f12271f);
        hashMap.put("totalMemory", b.f12276k);
        return hashMap;
    }

    public static Collection<String> getEnabledReleaseStages() {
        return getClient().f12622a.f12317g;
    }

    public static String getEndpoint() {
        return getClient().f12622a.f12326p.f12436a;
    }

    public static C5758i1 getLastRunInfo() {
        return getClient().f12642u;
    }

    public static C5816o1 getLogger() {
        return getClient().f12622a.f12329s;
    }

    public static Map<String, Object> getMetadata() {
        return getClient().f12623b.f12604b.mo16619e();
    }

    public static String getNativeReportPath() {
        return new File(getClient().f12622a.f12334x.getValue(), "bugsnag-native").getAbsolutePath();
    }

    public static String getReleaseStage() {
        return getClient().f12622a.f12320j;
    }

    public static String getSessionEndpoint() {
        return getClient().f12622a.f12326p.f12437b;
    }

    public static Map<String, String> getUser() {
        HashMap hashMap = new HashMap();
        C5915t2 t2Var = getClient().f12627f.f12663b;
        hashMap.put("id", t2Var.f12619b);
        hashMap.put("name", t2Var.f12621d);
        hashMap.put("email", t2Var.f12620c);
        return hashMap;
    }

    public static void leaveBreadcrumb(String str, BreadcrumbType breadcrumbType) {
        if (str != null) {
            getClient().mo16683b(breadcrumbType, str, new HashMap());
        }
    }

    public static void markLaunchCompleted() {
        getClient().f12644w.mo16569a();
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (bArr != null && bArr2 != null && stackTraceElementArr != null) {
            notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, stackTraceElementArr);
        }
    }

    public static void pauseSession() {
        C5738e2 e2Var = getClient().f12634m;
        C5728c2 c2Var = e2Var.f12226j;
        if (c2Var != null) {
            c2Var.f12194n.set(true);
            e2Var.updateState(C5780k2.C5791k.f12395a);
        }
    }

    public static void registerSession(long j, String str, int i, int i2) {
        C5917u client2 = getClient();
        C5915t2 t2Var = client2.f12627f.f12663b;
        C5728c2 c2Var = null;
        Date date = j > 0 ? new Date(j) : null;
        C5738e2 e2Var = client2.f12634m;
        if (!e2Var.f12222f.f12622a.mo16548e(false)) {
            if (date == null || str == null) {
                e2Var.updateState(C5780k2.C5791k.f12395a);
            } else {
                c2Var = new C5728c2(str, date, t2Var, i, i2, e2Var.f12222f.f12641t, e2Var.f12229m);
                e2Var.mo16507e(c2Var);
            }
            e2Var.f12226j = c2Var;
        }
    }

    public static boolean resumeSession() {
        C5738e2 e2Var = getClient().f12634m;
        C5728c2 c2Var = e2Var.f12226j;
        boolean z = false;
        if (c2Var == null) {
            c2Var = e2Var.f12222f.f12622a.mo16548e(false) ? null : e2Var.mo16508f(new Date(), e2Var.f12222f.f12627f.f12663b, false);
        } else {
            z = c2Var.f12194n.compareAndSet(true, false);
        }
        if (c2Var != null) {
            e2Var.mo16507e(c2Var);
        }
        return z;
    }

    public static void setAutoDetectAnrs(boolean z) {
        C5917u client2 = getClient();
        C5723b2 b2Var = client2.f12640s;
        if (z) {
            C5719a2 a2Var = b2Var.f12161c;
            if (a2Var != null) {
                a2Var.load(client2);
                return;
            }
            return;
        }
        C5719a2 a2Var2 = b2Var.f12161c;
        if (a2Var2 != null) {
            a2Var2.unload();
        }
    }

    public static void setAutoNotify(boolean z) {
        C5917u client2 = getClient();
        C5723b2 b2Var = client2.f12640s;
        b2Var.getClass();
        if (z) {
            C5719a2 a2Var = b2Var.f12161c;
            if (a2Var != null) {
                a2Var.load(client2);
            }
        } else {
            C5719a2 a2Var2 = b2Var.f12161c;
            if (a2Var2 != null) {
                a2Var2.unload();
            }
        }
        if (z) {
            C5719a2 a2Var3 = b2Var.f12160b;
            if (a2Var3 != null) {
                a2Var3.load(client2);
            }
        } else {
            C5719a2 a2Var4 = b2Var.f12160b;
            if (a2Var4 != null) {
                a2Var4.unload();
            }
        }
        if (z) {
            C5936y0 y0Var = client2.f12646y;
            y0Var.getClass();
            Thread.setDefaultUncaughtExceptionHandler(y0Var);
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(client2.f12646y.f12713a);
    }

    public static void setBinaryArch(String str) {
        C5729d dVar = getClient().f12630i;
        dVar.getClass();
        C19383o.m32798h(str, "binaryArch");
        dVar.f12199c = str;
    }

    public static void setClient(C5917u uVar) {
        client = uVar;
    }

    public static void setContext(String str) {
        C5717a0 a0Var = getClient().f12625d;
        a0Var.f12145b = str;
        a0Var.f12146c = "__BUGSNAG_MANUAL_CONTEXT__";
        a0Var.mo16478a();
    }

    public static void setUser(String str, String str2, String str3) {
        C5920u2 u2Var = getClient().f12627f;
        C5915t2 t2Var = new C5915t2(str, str2, str3);
        u2Var.getClass();
        u2Var.f12663b = t2Var;
        u2Var.mo16691a();
    }

    public static void startSession() {
        C5738e2 e2Var = getClient().f12634m;
        if (!e2Var.f12222f.f12622a.mo16548e(false)) {
            e2Var.mo16508f(new Date(), e2Var.f12222f.f12627f.f12663b, false);
        }
    }

    public static void leaveBreadcrumb(byte[] bArr, BreadcrumbType breadcrumbType) {
        if (bArr != null) {
            getClient().mo16683b(breadcrumbType, new String(bArr, UTF8Charset), new HashMap());
        }
    }

    public static void leaveBreadcrumb(String str, String str2, Map<String, Object> map) {
        getClient().mo16683b(BreadcrumbType.valueOf(str2.toUpperCase(Locale.US)), str, map);
    }

    public static void notify(String str, String str2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        C5763c cVar = getClient().f12622a;
        if (!(cVar.mo16546c() || C19327t.m32634P0(str, cVar.f12316f))) {
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(stackTraceElementArr);
            getClient().mo16685d(runtimeException, new C5708a(severity, str, str2));
        }
    }

    public static void setUser(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        String str2 = null;
        String str3 = bArr == null ? null : new String(bArr, UTF8Charset);
        if (bArr2 == null) {
            str = null;
        } else {
            str = new String(bArr2, UTF8Charset);
        }
        if (bArr3 != null) {
            str2 = new String(bArr3, UTF8Charset);
        }
        setUser(str3, str, str2);
    }
}
