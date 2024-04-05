package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.j1 */
public final class C5775j1 {

    /* renamed from: a */
    public final File f12367a;

    /* renamed from: b */
    public final C5816o1 f12368b;

    /* renamed from: c */
    public final ReentrantReadWriteLock f12369c = new ReentrantReadWriteLock();

    public C5775j1(C5763c cVar) {
        C19383o.m32798h(cVar, "config");
        this.f12367a = new File(cVar.f12334x.getValue(), "last-run-info");
        this.f12368b = cVar.f12329s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ce, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        kotlin.reflect.C19421p.m32917E(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d2, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bugsnag.android.C5758i1 mo16561a() {
        /*
            r7 = this;
            java.io.File r0 = r7.f12367a
            boolean r0 = r0.exists()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.io.File r0 = r7.f12367a
            java.nio.charset.Charset r2 = kotlin.text.C19446a.f43373b
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r0)
            r3.<init>(r4, r2)
            java.lang.String r0 = kotlinx.coroutines.C19543e0.m33313f0(r3)     // Catch:{ all -> 0x00cc }
            kotlin.reflect.C19421p.m32917E(r3, r1)
            java.lang.String r2 = "\n"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r3 = 6
            r4 = 0
            java.util.List r0 = kotlin.text.C19459m.m33056y1(r0, r2, r4, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x003e:
            boolean r3 = r0.hasNext()
            r5 = 1
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r0.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = kotlin.text.C19457k.m33020X0(r6)
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x003e
            r2.add(r3)
            goto L_0x003e
        L_0x0057:
            int r0 = r2.size()
            r3 = 3
            if (r0 == r3) goto L_0x0075
            com.bugsnag.android.o1 r0 = r7.f12368b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected number of lines when loading LastRunInfo. Skipping load. "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo16608h(r2)
            return r1
        L_0x0075:
            java.lang.Object r0 = r2.get(r4)     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r3 = "consecutiveLaunchCrashes="
            java.lang.String r0 = kotlin.text.C19459m.m33030C1(r0, r3, r0)     // Catch:{ NumberFormatException -> 0x00c3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.Object r3 = r2.get(r5)     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r4 = "crashed="
            java.lang.String r3 = kotlin.text.C19459m.m33030C1(r3, r4, r3)     // Catch:{ NumberFormatException -> 0x00c3 }
            boolean r3 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ NumberFormatException -> 0x00c3 }
            r4 = 2
            java.lang.Object r2 = r2.get(r4)     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r4 = "crashedDuringLaunch="
            java.lang.String r2 = kotlin.text.C19459m.m33030C1(r2, r4, r2)     // Catch:{ NumberFormatException -> 0x00c3 }
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch:{ NumberFormatException -> 0x00c3 }
            com.bugsnag.android.i1 r4 = new com.bugsnag.android.i1     // Catch:{ NumberFormatException -> 0x00c3 }
            r4.<init>(r0, r3, r2)     // Catch:{ NumberFormatException -> 0x00c3 }
            com.bugsnag.android.o1 r0 = r7.f12368b     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00c3 }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r3 = "Loaded: "
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x00c3 }
            r2.append(r4)     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x00c3 }
            r0.mo16604d(r2)     // Catch:{ NumberFormatException -> 0x00c3 }
            r1 = r4
            goto L_0x00cb
        L_0x00c3:
            r0 = move-exception
            com.bugsnag.android.o1 r2 = r7.f12368b
            java.lang.String r3 = "Failed to read consecutiveLaunchCrashes from saved lastRunInfo"
            r2.mo16602b(r3, r0)
        L_0x00cb:
            return r1
        L_0x00cc:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            kotlin.reflect.C19421p.m32917E(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5775j1.mo16561a():com.bugsnag.android.i1");
    }

    /* renamed from: b */
    public final void mo16562b(C5758i1 i1Var) {
        C19383o.m32798h(i1Var, "lastRunInfo");
        ReentrantReadWriteLock.WriteLock writeLock = this.f12369c.writeLock();
        C19383o.m32793c(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            mo16563c(i1Var);
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
        C19394m mVar = C19394m.f43287a;
        writeLock.unlock();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        kotlin.reflect.C19421p.m32917E(r2, r4);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16563c(com.bugsnag.android.C5758i1 r4) {
        /*
            r3 = this;
            com.google.android.play.core.appupdate.i r0 = new com.google.android.play.core.appupdate.i
            r1 = 1
            r0.<init>(r1)
            int r1 = r4.f12294a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "consecutiveLaunchCrashes"
            r0.mo55345d(r1, r2)
            boolean r1 = r4.f12295b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "crashed"
            r0.mo55345d(r1, r2)
            boolean r4 = r4.f12296c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r1 = "crashedDuringLaunch"
            r0.mo55345d(r4, r1)
            java.lang.String r4 = r0.toString()
            java.io.File r0 = r3.f12367a
            java.nio.charset.Charset r1 = kotlin.text.C19446a.f43373b
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.String r2 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r4, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            byte[] r1 = r4.getBytes(r1)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            r2.write(r1)     // Catch:{ all -> 0x006c }
            kotlin.m r0 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x006c }
            r0 = 0
            kotlin.reflect.C19421p.m32917E(r2, r0)
            com.bugsnag.android.o1 r0 = r3.f12368b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Persisted: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.mo16604d(r4)
            return
        L_0x006c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            kotlin.reflect.C19421p.m32917E(r2, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5775j1.mo16563c(com.bugsnag.android.i1):void");
    }
}
