package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p193o.C7494b;
import p193o.C7500h;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
public final class C14889z3 {

    /* renamed from: g */
    public static final C7494b f33184g = new C7494b();

    /* renamed from: h */
    public static final String[] f33185h = {"key", "value"};

    /* renamed from: a */
    public final ContentResolver f33186a;

    /* renamed from: b */
    public final Uri f33187b;

    /* renamed from: c */
    public final C14877y3 f33188c;

    /* renamed from: d */
    public final Object f33189d = new Object();

    /* renamed from: e */
    public volatile Map<String, String> f33190e;

    /* renamed from: f */
    public final ArrayList f33191f = new ArrayList();

    public C14889z3(ContentResolver contentResolver, Uri uri) {
        C14877y3 y3Var = new C14877y3(this);
        this.f33188c = y3Var;
        contentResolver.getClass();
        uri.getClass();
        this.f33186a = contentResolver;
        this.f33187b = uri;
        contentResolver.registerContentObserver(uri, false, y3Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0017 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C14889z3 m24204a(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.z3> r0 = com.google.android.gms.internal.measurement.C14889z3.class
            monitor-enter(r0)
            o.b r1 = f33184g     // Catch:{ all -> 0x0019 }
            r2 = 0
            java.lang.Object r2 = r1.getOrDefault(r5, r2)     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.measurement.z3 r2 = (com.google.android.gms.internal.measurement.C14889z3) r2     // Catch:{ all -> 0x0019 }
            if (r2 != 0) goto L_0x0017
            com.google.android.gms.internal.measurement.z3 r3 = new com.google.android.gms.internal.measurement.z3     // Catch:{ SecurityException -> 0x0017 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0017 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0016 }
        L_0x0016:
            r2 = r3
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14889z3.m24204a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.z3");
    }

    /* renamed from: c */
    public static synchronized void m24205c() {
        synchronized (C14889z3.class) {
            Iterator it = ((C7500h.C7505e) f33184g.values()).iterator();
            while (it.hasNext()) {
                C14889z3 z3Var = (C14889z3) it.next();
                z3Var.f33186a.unregisterContentObserver(z3Var.f33188c);
            }
            f33184g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = r2.mo50970a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        android.os.Binder.restoreCallingIdentity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        android.util.Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0040, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0043, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: SQLiteException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:8:0x000f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo51008b() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f33190e
            if (r0 != 0) goto L_0x0049
            java.lang.Object r1 = r5.f33189d
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f33190e     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0044
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.measurement.x3 r2 = new com.google.android.gms.internal.measurement.x3     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
            r2.<init>(r5)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
            java.lang.Object r2 = r2.mo50970a()     // Catch:{ SecurityException -> 0x0019, SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
            goto L_0x0024
        L_0x0019:
            long r3 = android.os.Binder.clearCallingIdentity()     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
            java.lang.Object r2 = r2.mo50970a()     // Catch:{ all -> 0x002a }
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
        L_0x0024:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x003c
        L_0x002a:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r3)     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
            throw r2     // Catch:{ SQLiteException | IllegalStateException | SecurityException -> 0x0031 }
        L_0x002f:
            r2 = move-exception
            goto L_0x0040
        L_0x0031:
            java.lang.String r2 = "ConfigurationContentLoader"
            java.lang.String r3 = "PhenotypeFlag unable to load ContentProvider, using default values"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x002f }
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0046 }
            r2 = 0
        L_0x003c:
            r5.f33190e = r2     // Catch:{ all -> 0x0046 }
            r0 = r2
            goto L_0x0044
        L_0x0040:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch:{ all -> 0x0046 }
            throw r2     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0049
        L_0x0046:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r0
        L_0x0049:
            if (r0 == 0) goto L_0x004c
            return r0
        L_0x004c:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14889z3.mo51008b():java.util.Map");
    }
}
