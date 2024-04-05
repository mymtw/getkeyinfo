package p188n4;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.bitmap_recycle.C5998d;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p150j4.C7109b;
import p168l4.C7257i;

/* renamed from: n4.a */
public final class C7445a implements Runnable {

    /* renamed from: j */
    public static final C7446a f16631j = new C7446a();

    /* renamed from: k */
    public static final long f16632k = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    public final C5998d f16633b;

    /* renamed from: c */
    public final C7257i f16634c;

    /* renamed from: d */
    public final C7449c f16635d;

    /* renamed from: e */
    public final C7446a f16636e;

    /* renamed from: f */
    public final HashSet f16637f = new HashSet();

    /* renamed from: g */
    public final Handler f16638g;

    /* renamed from: h */
    public long f16639h = 40;

    /* renamed from: i */
    public boolean f16640i;

    /* renamed from: n4.a$a */
    public static class C7446a {
    }

    /* renamed from: n4.a$b */
    public static final class C7447b implements C7109b {
        /* renamed from: b */
        public final void mo12991b(MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public C7445a(C5998d dVar, C7257i iVar, C7449c cVar) {
        C7446a aVar = f16631j;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f16633b = dVar;
        this.f16634c = iVar;
        this.f16635d = cVar;
        this.f16636e = aVar;
        this.f16638g = handler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        if ((r12.f16635d.f16646c == 0) == false) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            n4.a$a r0 = r12.f16636e
            r0.getClass()
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
        L_0x0009:
            n4.c r2 = r12.f16635d
            int r2 = r2.f16646c
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0013
            r2 = r3
            goto L_0x0014
        L_0x0013:
            r2 = r4
        L_0x0014:
            if (r2 != 0) goto L_0x010f
            n4.a$a r2 = r12.f16636e
            r2.getClass()
            long r5 = android.os.SystemClock.currentThreadTimeMillis()
            long r5 = r5 - r0
            r7 = 32
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0028
            r2 = r3
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 != 0) goto L_0x010f
            n4.c r2 = r12.f16635d
            java.util.ArrayList r5 = r2.f16645b
            int r6 = r2.f16647d
            java.lang.Object r5 = r5.get(r6)
            n4.d r5 = (p188n4.C7450d) r5
            java.util.Map<n4.d, java.lang.Integer> r6 = r2.f16644a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            if (r7 != r3) goto L_0x0052
            java.util.Map<n4.d, java.lang.Integer> r6 = r2.f16644a
            r6.remove(r5)
            java.util.ArrayList r6 = r2.f16645b
            int r7 = r2.f16647d
            r6.remove(r7)
            goto L_0x0060
        L_0x0052:
            java.util.Map<n4.d, java.lang.Integer> r7 = r2.f16644a
            int r6 = r6.intValue()
            int r6 = r6 - r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.put(r5, r6)
        L_0x0060:
            int r6 = r2.f16646c
            int r6 = r6 - r3
            r2.f16646c = r6
            java.util.ArrayList r6 = r2.f16645b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x006f
            r6 = r4
            goto L_0x0079
        L_0x006f:
            int r6 = r2.f16647d
            int r6 = r6 + r3
            java.util.ArrayList r3 = r2.f16645b
            int r3 = r3.size()
            int r6 = r6 % r3
        L_0x0079:
            r2.f16647d = r6
            java.util.HashSet r2 = r12.f16637f
            boolean r2 = r2.contains(r5)
            r3 = 0
            if (r2 != 0) goto L_0x0093
            java.util.HashSet r2 = r12.f16637f
            r2.add(r5)
            com.bumptech.glide.load.engine.bitmap_recycle.d r2 = r12.f16633b
            r5.getClass()
            android.graphics.Bitmap r2 = r2.mo16923d(r4, r4, r3)
            goto L_0x009a
        L_0x0093:
            r5.getClass()
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r4, r4, r3)
        L_0x009a:
            int r6 = p036c5.C4426l.m10129c(r2)
            l4.i r7 = r12.f16634c
            c5.i r7 = (p036c5.C4422i) r7
            monitor-enter(r7)
            long r8 = r7.f9702c     // Catch:{ all -> 0x010c }
            monitor-exit(r7)
            l4.i r7 = r12.f16634c
            c5.i r7 = (p036c5.C4422i) r7
            monitor-enter(r7)
            long r10 = r7.f9703d     // Catch:{ all -> 0x0109 }
            monitor-exit(r7)
            long r8 = r8 - r10
            long r10 = (long) r6
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x00ca
            n4.a$b r7 = new n4.a$b
            r7.<init>()
            l4.i r8 = r12.f16634c
            com.bumptech.glide.load.engine.bitmap_recycle.d r9 = r12.f16633b
            com.bumptech.glide.load.resource.bitmap.e r2 = com.bumptech.glide.load.resource.bitmap.C6081e.m12065e(r2, r9)
            l4.h r8 = (p168l4.C7256h) r8
            java.lang.Object r2 = r8.mo14376d(r7, r2)
            com.bumptech.glide.load.engine.s r2 = (com.bumptech.glide.load.engine.C6051s) r2
            goto L_0x00cf
        L_0x00ca:
            com.bumptech.glide.load.engine.bitmap_recycle.d r7 = r12.f16633b
            r7.mo16924e(r2)
        L_0x00cf:
            r2 = 3
            java.lang.String r7 = "PreFillRunner"
            boolean r2 = android.util.Log.isLoggable(r7, r2)
            if (r2 == 0) goto L_0x0009
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "allocated ["
            r2.append(r8)
            r5.getClass()
            r2.append(r4)
            java.lang.String r5 = "x"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "] "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " size: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r7, r2)
            goto L_0x0009
        L_0x0109:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x010c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x010f:
            boolean r0 = r12.f16640i
            if (r0 != 0) goto L_0x011f
            n4.c r0 = r12.f16635d
            int r0 = r0.f16646c
            if (r0 != 0) goto L_0x011b
            r0 = r3
            goto L_0x011c
        L_0x011b:
            r0 = r4
        L_0x011c:
            if (r0 != 0) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r3 = r4
        L_0x0120:
            if (r3 == 0) goto L_0x0134
            android.os.Handler r0 = r12.f16638g
            long r1 = r12.f16639h
            r3 = 4
            long r3 = r3 * r1
            long r5 = f16632k
            long r3 = java.lang.Math.min(r3, r5)
            r12.f16639h = r3
            r0.postDelayed(r12, r1)
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p188n4.C7445a.run():void");
    }
}
