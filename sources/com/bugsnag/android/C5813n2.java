package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.bugsnag.android.C5748g1.C5749a;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.n2 */
public final class C5813n2<T extends C5748g1.C5749a> {

    /* renamed from: a */
    public final ReentrantReadWriteLock f12433a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public final File f12434b;

    public C5813n2(File file) {
        C19383o.m32798h(file, ResponseConstants.FILE);
        this.f12434b = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo16575a(p753kq.C19857l<? super android.util.JsonReader, ? extends T> r5) throws java.io.IOException {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f12433a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            java.lang.String r1 = "lock.readLock()"
            kotlin.jvm.internal.C19383o.m32793c(r0, r1)
            r0.lock()
            java.io.File r1 = r4.f12434b     // Catch:{ all -> 0x0045 }
            java.nio.charset.Charset r2 = kotlin.text.C19446a.f43373b     // Catch:{ all -> 0x0045 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0045 }
            r3.<init>(r1)     // Catch:{ all -> 0x0045 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0045 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0045 }
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r3 = r1 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x0025
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x0045 }
            goto L_0x002b
        L_0x0025:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0045 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0045 }
            r1 = r3
        L_0x002b:
            r2 = 0
            android.util.JsonReader r3 = new android.util.JsonReader     // Catch:{ all -> 0x003e }
            r3.<init>(r1)     // Catch:{ all -> 0x003e }
            java.lang.Object r5 = r5.invoke(r3)     // Catch:{ all -> 0x003e }
            com.bugsnag.android.g1$a r5 = (com.bugsnag.android.C5748g1.C5749a) r5     // Catch:{ all -> 0x003e }
            kotlin.reflect.C19421p.m32917E(r1, r2)     // Catch:{ all -> 0x0045 }
            r0.unlock()
            return r5
        L_0x003e:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r5)     // Catch:{ all -> 0x0045 }
            throw r2     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5813n2.mo16575a(kq.l):com.bugsnag.android.g1$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.reflect.C19421p.m32917E(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16576b(T r5) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "streamable"
            kotlin.jvm.internal.C19383o.m32798h(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.f12433a
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            java.lang.String r1 = "lock.writeLock()"
            kotlin.jvm.internal.C19383o.m32793c(r0, r1)
            r0.lock()
            java.io.File r1 = r4.f12434b     // Catch:{ all -> 0x0047 }
            java.nio.charset.Charset r2 = kotlin.text.C19446a.f43373b     // Catch:{ all -> 0x0047 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0047 }
            r3.<init>(r1)     // Catch:{ all -> 0x0047 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0047 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0047 }
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r3 = r1 instanceof java.io.BufferedWriter     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x002a
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1     // Catch:{ all -> 0x0047 }
            goto L_0x0030
        L_0x002a:
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ all -> 0x0047 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0047 }
            r1 = r3
        L_0x0030:
            r2 = 0
            com.bugsnag.android.g1 r3 = new com.bugsnag.android.g1     // Catch:{ all -> 0x0040 }
            r3.<init>(r1)     // Catch:{ all -> 0x0040 }
            r5.toStream(r3)     // Catch:{ all -> 0x0040 }
            kotlin.reflect.C19421p.m32917E(r1, r2)     // Catch:{ all -> 0x0047 }
            r0.unlock()
            return
        L_0x0040:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r2 = move-exception
            kotlin.reflect.C19421p.m32917E(r1, r5)     // Catch:{ all -> 0x0047 }
            throw r2     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r5 = move-exception
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5813n2.mo16576b(com.bugsnag.android.g1$a):void");
    }
}
