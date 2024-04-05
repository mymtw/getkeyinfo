package p641on;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* renamed from: on.h */
public final class C18330h {

    /* renamed from: e */
    public static final Pattern f40243e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: f */
    public static final Pattern f40244f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    public final HashSet f40245a = new HashSet();

    /* renamed from: b */
    public final Executor f40246b;

    /* renamed from: c */
    public final C18325d f40247c;

    /* renamed from: d */
    public final C18325d f40248d;

    static {
        Charset.forName("UTF-8");
    }

    public C18330h(ExecutorService executorService, C18325d dVar, C18325d dVar2) {
        this.f40246b = executorService;
        this.f40247c = dVar;
        this.f40248d = dVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return (p641on.C18327e) p641on.C18325d.m30952a(r2.mo69860b(), java.util.concurrent.TimeUnit.SECONDS);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p641on.C18327e m30957a(p641on.C18325d r2) {
        /*
            monitor-enter(r2)
            kk.a0 r0 = r2.f40229c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo69668o()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0015
            kk.a0 r0 = r2.f40229c     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.mo69664k()     // Catch:{ all -> 0x0032 }
            on.e r0 = (p641on.C18327e) r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x0031
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            kk.g r2 = r2.mo69860b()     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            java.lang.Object r2 = p641on.C18325d.m30952a(r2, r0)     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            r0 = r2
            on.e r0 = (p641on.C18327e) r0     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            goto L_0x0031
        L_0x0024:
            r2 = move-exception
            goto L_0x0029
        L_0x0026:
            r2 = move-exception
            goto L_0x0029
        L_0x0028:
            r2 = move-exception
        L_0x0029:
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.lang.String r1 = "Reading from storage file failed."
            android.util.Log.d(r0, r1, r2)
            r0 = 0
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p641on.C18330h.m30957a(on.d):on.e");
    }

    /* renamed from: b */
    public static HashSet m30958b(C18325d dVar) {
        HashSet hashSet = new HashSet();
        C18327e a = m30957a(dVar);
        if (a == null) {
            return hashSet;
        }
        Iterator<String> keys = a.f40233b.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }
}
