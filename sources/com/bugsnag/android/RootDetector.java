package com.bugsnag.android;

import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p568fn.C17782b;

public final class RootDetector {

    /* renamed from: f */
    public static final File f12122f = new File("/system/build.prop");

    /* renamed from: g */
    public static final List<String> f12123g = C17782b.m29865e0("/system/xbin/su", "/system/bin/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/SuperSU", "/system/xbin/daemonsu", "/su/bin");

    /* renamed from: a */
    public final AtomicBoolean f12124a;

    /* renamed from: b */
    public final C5757i0 f12125b;

    /* renamed from: c */
    public final List<String> f12126c;

    /* renamed from: d */
    public final File f12127d;

    /* renamed from: e */
    public final C5816o1 f12128e;

    public RootDetector() {
        throw null;
    }

    public RootDetector(C5757i0 i0Var, C5816o1 o1Var) {
        List<String> list = f12123g;
        File file = f12122f;
        C19383o.m32798h(i0Var, "deviceBuildInfo");
        C19383o.m32798h(list, "rootBinaryLocations");
        C19383o.m32798h(file, "buildProps");
        C19383o.m32798h(o1Var, "logger");
        this.f12125b = i0Var;
        this.f12126c = list;
        this.f12127d = file;
        this.f12128e = o1Var;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f12124a = atomicBoolean;
        try {
            System.loadLibrary("bugsnag-root-detection");
            atomicBoolean.set(true);
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        kotlin.reflect.C19421p.m32917E(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        throw r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11497b() {
        /*
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.<init>(r2)
            java.lang.String r2 = "which"
            java.lang.String r3 = "su"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.List r2 = p568fn.C17782b.m29865e0(r2)
            r0.command(r2)
            r2 = 0
            java.lang.Process r0 = r0.start()     // Catch:{ IOException -> 0x0064, all -> 0x005d }
            java.lang.String r3 = "process"
            kotlin.jvm.internal.C19383o.m32793c(r0, r3)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.lang.String r4 = "process.inputStream"
            kotlin.jvm.internal.C19383o.m32793c(r3, r4)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.nio.charset.Charset r4 = kotlin.text.C19446a.f43373b     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r4 = r5 instanceof java.io.BufferedReader     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            if (r4 == 0) goto L_0x003a
            java.io.BufferedReader r5 = (java.io.BufferedReader) r5     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            goto L_0x0040
        L_0x003a:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r4.<init>(r5, r3)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r5 = r4
        L_0x0040:
            java.lang.String r3 = kotlinx.coroutines.C19543e0.m33313f0(r5)     // Catch:{ all -> 0x0051 }
            kotlin.reflect.C19421p.m32917E(r5, r2)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            boolean r1 = kotlin.text.C19457k.m33020X0(r3)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            r1 = r1 ^ 1
            r0.destroy()
            goto L_0x0069
        L_0x0051:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r3 = move-exception
            kotlin.reflect.C19421p.m32917E(r5, r2)     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
            throw r3     // Catch:{ IOException -> 0x005b, all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            r2 = r0
            goto L_0x005e
        L_0x005b:
            r2 = r0
            goto L_0x0064
        L_0x005d:
            r1 = move-exception
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.destroy()
        L_0x0063:
            throw r1
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.destroy()
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.RootDetector.m11497b():boolean");
    }

    private final native boolean performNativeRootChecks();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        throw r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16460a() {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.f12127d     // Catch:{ all -> 0x004f }
            java.nio.charset.Charset r2 = kotlin.text.C19446a.f43373b     // Catch:{ all -> 0x004f }
            r3 = 8192(0x2000, float:1.14794E-41)
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x004f }
            r4.<init>(r1)     // Catch:{ all -> 0x004f }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x004f }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x004f }
            boolean r2 = r1 instanceof java.io.BufferedReader     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0018
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x004f }
            goto L_0x001e
        L_0x0018:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x004f }
            r1 = r2
        L_0x001e:
            r2 = 0
            kotlin.io.c r3 = new kotlin.io.c     // Catch:{ all -> 0x0048 }
            r3.<init>(r1)     // Catch:{ all -> 0x0048 }
            boolean r4 = r3 instanceof kotlin.sequences.C19422a     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            kotlin.sequences.a r4 = new kotlin.sequences.a     // Catch:{ all -> 0x0048 }
            r4.<init>(r3)     // Catch:{ all -> 0x0048 }
            r3 = r4
        L_0x002f:
            com.bugsnag.android.RootDetector$checkBuildProps$1$1$1 r4 = com.bugsnag.android.RootDetector$checkBuildProps$1$1$1.INSTANCE     // Catch:{ all -> 0x0048 }
            kotlin.sequences.n r3 = kotlin.sequences.SequencesKt___SequencesKt.m32985p1(r3, r4)     // Catch:{ all -> 0x0048 }
            com.bugsnag.android.RootDetector$checkBuildProps$1$1$2 r4 = com.bugsnag.android.RootDetector$checkBuildProps$1$1$2.INSTANCE     // Catch:{ all -> 0x0048 }
            kotlin.sequences.e r3 = kotlin.sequences.SequencesKt___SequencesKt.m32984o1(r3, r4)     // Catch:{ all -> 0x0048 }
            int r3 = kotlin.sequences.SequencesKt___SequencesKt.m32982m1(r3)     // Catch:{ all -> 0x0048 }
            if (r3 <= 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = r0
        L_0x0044:
            kotlin.reflect.C19421p.m32917E(r1, r2)     // Catch:{ all -> 0x004f }
            return r3
        L_0x0048:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x004a }
        L_0x004a:
            r3 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r2)     // Catch:{ all -> 0x004f }
            throw r3     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            kotlin.Result$Failure r1 = androidx.compose.foundation.layout.C0761x.m1673J(r1)
            kotlin.Result.m35480constructorimpl(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.RootDetector.mo16460a():boolean");
    }

    /* renamed from: c */
    public final boolean mo16461c() {
        boolean z;
        try {
            String str = this.f12125b.f12291g;
            if (!(str != null && C19459m.m33036e1(str, "test-keys", false)) && !m11497b() && !mo16460a()) {
                for (String file : this.f12126c) {
                    if (new File(file).exists()) {
                        z = true;
                        break;
                    }
                }
                Result.m35480constructorimpl(C19394m.f43287a);
                z = false;
                if (!z) {
                    if (!(this.f12124a.get() ? performNativeRootChecks() : false)) {
                        return false;
                    }
                }
            }
        } catch (Throwable th) {
            this.f12128e.mo16602b("Root detection failed", th);
            return false;
        }
        return true;
    }
}
