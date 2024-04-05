package p517bn;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.C0164l;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.measurement.internal.C14990h6;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p193o.C7494b;
import p605kk.C18117a0;
import p605kk.C18123g;
import p605kk.C18124h;
import p605kk.C18126j;

/* renamed from: bn.d0 */
public final class C14109d0 {

    /* renamed from: i */
    public static final long f31072i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static final /* synthetic */ int f31073j = 0;

    /* renamed from: a */
    public final Context f31074a;

    /* renamed from: b */
    public final C14129t f31075b;

    /* renamed from: c */
    public final C14125p f31076c;

    /* renamed from: d */
    public final FirebaseMessaging f31077d;

    /* renamed from: e */
    public final C7494b f31078e = new C7494b();

    /* renamed from: f */
    public final ScheduledExecutorService f31079f;

    /* renamed from: g */
    public boolean f31080g = false;

    /* renamed from: h */
    public final C14105b0 f31081h;

    public C14109d0(FirebaseMessaging firebaseMessaging, C14129t tVar, C14105b0 b0Var, C14125p pVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f31077d = firebaseMessaging;
        this.f31075b = tVar;
        this.f31081h = b0Var;
        this.f31076c = pVar;
        this.f31074a = context;
        this.f31079f = scheduledExecutorService;
    }

    /* renamed from: a */
    public static <T> void m21840a(C18123g<T> gVar) throws IOException {
        try {
            C18126j.m30614b(gVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: d */
    public static boolean m21841d() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* renamed from: b */
    public final void mo46982b(String str) throws IOException {
        C14125p pVar = this.f31076c;
        String blockingGetToken = this.f31077d.blockingGetToken();
        pVar.getClass();
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str);
        m21840a(pVar.mo47008b(blockingGetToken, bundle, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/")).mo69660g(C14124o.f31111b, new C0164l((Object) pVar)));
    }

    /* renamed from: c */
    public final void mo46983c(String str) throws IOException {
        C14125p pVar = this.f31076c;
        String blockingGetToken = this.f31077d.blockingGetToken();
        pVar.getClass();
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        String valueOf2 = String.valueOf(str);
        m21840a(pVar.mo47008b(blockingGetToken, bundle, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/")).mo69660g(C14124o.f31111b, new C0164l((Object) pVar)));
    }

    /* renamed from: e */
    public final C18117a0 mo46984e(C14103a0 a0Var) {
        ArrayDeque arrayDeque;
        C14105b0 b0Var = this.f31081h;
        synchronized (b0Var) {
            C14134y yVar = b0Var.f31062a;
            String str = a0Var.f31059c;
            yVar.getClass();
            if (!TextUtils.isEmpty(str)) {
                if (!str.contains(yVar.f31140c)) {
                    synchronized (yVar.f31141d) {
                        if (yVar.f31141d.add(str)) {
                            yVar.f31142e.execute(new C14990h6(yVar, 2));
                        }
                    }
                }
            }
        }
        C18124h hVar = new C18124h();
        synchronized (this.f31078e) {
            try {
                String str2 = a0Var.f31059c;
                if (this.f31078e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f31078e.getOrDefault(str2, null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f31078e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(hVar);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return hVar.f39566a;
    }

    /* renamed from: f */
    public final void mo46985f() {
        boolean z;
        if (this.f31081h.mo46978a() != null) {
            synchronized (this) {
                z = this.f31080g;
            }
            if (!z) {
                mo46987h(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = r0.f31058b;
        r5 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r5 == 83) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r5 == 85) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r4.equals("U") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if (r4.equals("S") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        r4 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r4 == 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r4 == 1) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (m21841d() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        r4 = r0.toString();
        r6 = new java.lang.StringBuilder(r4.length() + 24);
        r6.append("Unknown topic operation");
        r6.append(r4);
        r6.append(".");
        android.util.Log.d("FirebaseMessaging", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        mo46983c(r0.f31057a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (m21841d() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        r4 = r0.f31057a;
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 35);
        r7.append("Unsubscribe from topic: ");
        r7.append(r4);
        r7.append(" succeeded.");
        android.util.Log.d("FirebaseMessaging", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        mo46982b(r0.f31057a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (m21841d() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        r4 = r0.f31057a;
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 31);
        r7.append("Subscribe to topic: ");
        r7.append(r4);
        r7.append(" succeeded.");
        android.util.Log.d("FirebaseMessaging", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ef, code lost:
        if (r1.getMessage() == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r1 = r1.getMessage();
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 53);
        r5.append("Topic operation failed: ");
        r5.append(r1);
        r5.append(". Will retry Topic operation.");
        android.util.Log.e("FirebaseMessaging", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return true;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46986g() throws java.io.IOException {
        /*
            r8 = this;
        L_0x0000:
            monitor-enter(r8)
            bn.b0 r0 = r8.f31081h     // Catch:{ all -> 0x017f }
            bn.a0 r0 = r0.mo46978a()     // Catch:{ all -> 0x017f }
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = m21841d()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x017f }
        L_0x0017:
            monitor-exit(r8)     // Catch:{ all -> 0x017f }
            return r1
        L_0x0019:
            monitor-exit(r8)     // Catch:{ all -> 0x017f }
            java.lang.String r2 = "FirebaseMessaging"
            r3 = 0
            java.lang.String r4 = r0.f31058b     // Catch:{ IOException -> 0x00d1 }
            int r5 = r4.hashCode()     // Catch:{ IOException -> 0x00d1 }
            r6 = 83
            if (r5 == r6) goto L_0x0036
            r6 = 85
            if (r5 == r6) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            java.lang.String r5 = "U"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0040
            r4 = r1
            goto L_0x0041
        L_0x0036:
            java.lang.String r5 = "S"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0040
            r4 = r3
            goto L_0x0041
        L_0x0040:
            r4 = -1
        L_0x0041:
            java.lang.String r5 = " succeeded."
            if (r4 == 0) goto L_0x00a2
            if (r4 == r1) goto L_0x0072
            boolean r4 = m21841d()     // Catch:{ IOException -> 0x00d1 }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = r0.toString()     // Catch:{ IOException -> 0x00d1 }
            int r5 = r4.length()     // Catch:{ IOException -> 0x00d1 }
            int r5 = r5 + 24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d1 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r5 = "Unknown topic operation"
            r6.append(r5)     // Catch:{ IOException -> 0x00d1 }
            r6.append(r4)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = "."
            r6.append(r4)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x00d1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x0120
        L_0x0072:
            java.lang.String r4 = r0.f31057a     // Catch:{ IOException -> 0x00d1 }
            r8.mo46983c(r4)     // Catch:{ IOException -> 0x00d1 }
            boolean r4 = m21841d()     // Catch:{ IOException -> 0x00d1 }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = r0.f31057a     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6 + 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d1 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = "Unsubscribe from topic: "
            r7.append(r6)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r4)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r5)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00d1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x0120
        L_0x00a2:
            java.lang.String r4 = r0.f31057a     // Catch:{ IOException -> 0x00d1 }
            r8.mo46982b(r4)     // Catch:{ IOException -> 0x00d1 }
            boolean r4 = m21841d()     // Catch:{ IOException -> 0x00d1 }
            if (r4 == 0) goto L_0x0120
            java.lang.String r4 = r0.f31057a     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x00d1 }
            int r6 = r6 + 31
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d1 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r6 = "Subscribe to topic: "
            r7.append(r6)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r4)     // Catch:{ IOException -> 0x00d1 }
            r7.append(r5)     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00d1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00d1 }
            goto L_0x0120
        L_0x00d1:
            r1 = move-exception
            java.lang.String r4 = r1.getMessage()
            java.lang.String r5 = "SERVICE_NOT_AVAILABLE"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00f8
            java.lang.String r4 = r1.getMessage()
            java.lang.String r5 = "INTERNAL_SERVER_ERROR"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00eb
            goto L_0x00f8
        L_0x00eb:
            java.lang.String r4 = r1.getMessage()
            if (r4 != 0) goto L_0x00f7
            java.lang.String r1 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r2, r1)
            goto L_0x011f
        L_0x00f7:
            throw r1
        L_0x00f8:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 53
            r5.<init>(r4)
            java.lang.String r4 = "Topic operation failed: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = ". Will retry Topic operation."
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.e(r2, r1)
        L_0x011f:
            r1 = r3
        L_0x0120:
            if (r1 != 0) goto L_0x0123
            return r3
        L_0x0123:
            bn.b0 r1 = r8.f31081h
            monitor-enter(r1)
            bn.y r2 = r1.f31062a     // Catch:{ all -> 0x017c }
            java.lang.String r3 = r0.f31059c     // Catch:{ all -> 0x017c }
            java.util.ArrayDeque<java.lang.String> r4 = r2.f31141d     // Catch:{ all -> 0x017c }
            monitor-enter(r4)     // Catch:{ all -> 0x017c }
            java.util.ArrayDeque<java.lang.String> r5 = r2.f31141d     // Catch:{ all -> 0x0141 }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x0141 }
            if (r3 == 0) goto L_0x0143
            java.util.concurrent.Executor r3 = r2.f31142e     // Catch:{ all -> 0x0141 }
            com.google.android.gms.measurement.internal.h6 r5 = new com.google.android.gms.measurement.internal.h6     // Catch:{ all -> 0x0141 }
            r6 = 2
            r5.<init>(r2, r6)     // Catch:{ all -> 0x0141 }
            r3.execute(r5)     // Catch:{ all -> 0x0141 }
            goto L_0x0143
        L_0x0141:
            r0 = move-exception
            goto L_0x017a
        L_0x0143:
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            monitor-exit(r1)
            o.b r2 = r8.f31078e
            monitor-enter(r2)
            java.lang.String r0 = r0.f31059c     // Catch:{ all -> 0x0177 }
            o.b r1 = r8.f31078e     // Catch:{ all -> 0x0177 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0177 }
            if (r1 != 0) goto L_0x0155
            monitor-exit(r2)     // Catch:{ all -> 0x0177 }
            goto L_0x0000
        L_0x0155:
            o.b r1 = r8.f31078e     // Catch:{ all -> 0x0177 }
            r3 = 0
            java.lang.Object r1 = r1.getOrDefault(r0, r3)     // Catch:{ all -> 0x0177 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0177 }
            java.lang.Object r4 = r1.poll()     // Catch:{ all -> 0x0177 }
            kk.h r4 = (p605kk.C18124h) r4     // Catch:{ all -> 0x0177 }
            if (r4 == 0) goto L_0x0169
            r4.mo69678b(r3)     // Catch:{ all -> 0x0177 }
        L_0x0169:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x0174
            o.b r1 = r8.f31078e     // Catch:{ all -> 0x0177 }
            r1.remove(r0)     // Catch:{ all -> 0x0177 }
        L_0x0174:
            monitor-exit(r2)     // Catch:{ all -> 0x0177 }
            goto L_0x0000
        L_0x0177:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0177 }
            throw r0
        L_0x017a:
            monitor-exit(r4)     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x017f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x017f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p517bn.C14109d0.mo46986g():boolean");
    }

    /* renamed from: h */
    public final void mo46987h(long j) {
        this.f31079f.schedule(new C14111e0(this, this.f31074a, this.f31075b, Math.min(Math.max(30, j + j), f31072i)), j, TimeUnit.SECONDS);
        synchronized (this) {
            this.f31080g = true;
        }
    }
}
