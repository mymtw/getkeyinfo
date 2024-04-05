package p517bn;

import java.util.concurrent.TimeUnit;
import p596jk.C18005a;

/* renamed from: bn.f0 */
public final class C14114f0 {

    /* renamed from: a */
    public static final long f31096a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f31097b = new Object();

    /* renamed from: c */
    public static C18005a f31098c;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m21854a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f31097b
            monitor-enter(r0)
            jk.a r1 = f31098c     // Catch:{ all -> 0x0039 }
            r2 = 1
            if (r1 != 0) goto L_0x0019
            jk.a r1 = new jk.a     // Catch:{ all -> 0x0039 }
            r1.<init>(r4)     // Catch:{ all -> 0x0039 }
            f31098c = r1     // Catch:{ all -> 0x0039 }
            java.lang.Object r3 = r1.f39392a     // Catch:{ all -> 0x0039 }
            monitor-enter(r3)     // Catch:{ all -> 0x0039 }
            r1.f39398g = r2     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0016 }
            throw r4     // Catch:{ all -> 0x0039 }
        L_0x0019:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x0039 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x002e
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            r4 = 0
            return r4
        L_0x002e:
            if (r1 != 0) goto L_0x0037
            jk.a r5 = f31098c     // Catch:{ all -> 0x0039 }
            long r1 = f31096a     // Catch:{ all -> 0x0039 }
            r5.mo69576a(r1)     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p517bn.C14114f0.m21854a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
