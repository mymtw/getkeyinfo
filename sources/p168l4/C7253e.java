package p168l4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import p126h4.C6945a;
import p126h4.C6953c;
import p150j4.C7109b;

/* renamed from: l4.e */
public final class C7253e implements C7245a {

    /* renamed from: a */
    public final C7262k f16100a;

    /* renamed from: b */
    public final File f16101b;

    /* renamed from: c */
    public final long f16102c;

    /* renamed from: d */
    public final C7248c f16103d = new C7248c();

    /* renamed from: e */
    public C6945a f16104e;

    @Deprecated
    public C7253e(File file, long j) {
        this.f16101b = file;
        this.f16102c = j;
        this.f16100a = new C7262k();
    }

    /* renamed from: a */
    public final File mo19514a(C7109b bVar) {
        String a = this.f16100a.mo19521a(bVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(bVar);
        }
        try {
            C6945a.C6950e g = mo19519c().mo19100g(a);
            if (g != null) {
                return g.f15418a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0088 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19515b(p150j4.C7109b r6, com.bumptech.glide.load.engine.C6019f r7) {
        /*
            r5 = this;
            l4.k r0 = r5.f16100a
            java.lang.String r0 = r0.mo19521a(r6)
            l4.c r1 = r5.f16103d
            monitor-enter(r1)
            java.util.HashMap r2 = r1.f16093a     // Catch:{ all -> 0x00b8 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00b8 }
            l4.c$a r2 = (p168l4.C7248c.C7249a) r2     // Catch:{ all -> 0x00b8 }
            if (r2 != 0) goto L_0x0031
            l4.c$b r2 = r1.f16094b     // Catch:{ all -> 0x00b8 }
            java.util.ArrayDeque r3 = r2.f16097a     // Catch:{ all -> 0x00b8 }
            monitor-enter(r3)     // Catch:{ all -> 0x00b8 }
            java.util.ArrayDeque r2 = r2.f16097a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            l4.c$a r2 = (p168l4.C7248c.C7249a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            l4.c$a r2 = new l4.c$a     // Catch:{ all -> 0x00b8 }
            r2.<init>()     // Catch:{ all -> 0x00b8 }
        L_0x0028:
            java.util.HashMap r3 = r1.f16093a     // Catch:{ all -> 0x00b8 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00b8 }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00b8 }
        L_0x0031:
            int r3 = r2.f16096b     // Catch:{ all -> 0x00b8 }
            r4 = 1
            int r3 = r3 + r4
            r2.f16096b = r3     // Catch:{ all -> 0x00b8 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b8 }
            java.util.concurrent.locks.ReentrantLock r1 = r2.f16095a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x0049
            java.util.Objects.toString(r6)     // Catch:{ all -> 0x00b1 }
        L_0x0049:
            h4.a r6 = r5.mo19519c()     // Catch:{ IOException -> 0x007e }
            h4.a$e r1 = r6.mo19100g(r0)     // Catch:{ IOException -> 0x007e }
            if (r1 == 0) goto L_0x0059
        L_0x0053:
            l4.c r6 = r5.f16103d
            r6.mo19518a(r0)
            return
        L_0x0059:
            h4.a$c r6 = r6.mo19099e(r0)     // Catch:{ IOException -> 0x007e }
            if (r6 == 0) goto L_0x0089
            java.io.File r1 = r6.mo19110b()     // Catch:{ all -> 0x0080 }
            j4.a<DataType> r2 = r7.f12902a     // Catch:{ all -> 0x0080 }
            DataType r3 = r7.f12903b     // Catch:{ all -> 0x0080 }
            j4.e r7 = r7.f12904c     // Catch:{ all -> 0x0080 }
            boolean r7 = r2.mo5754a(r3, r1, r7)     // Catch:{ all -> 0x0080 }
            if (r7 == 0) goto L_0x0076
            h4.a r7 = p126h4.C6945a.this     // Catch:{ all -> 0x0080 }
            p126h4.C6945a.m13471a(r7, r6, r4)     // Catch:{ all -> 0x0080 }
            r6.f15409c = r4     // Catch:{ all -> 0x0080 }
        L_0x0076:
            boolean r7 = r6.f15409c     // Catch:{ IOException -> 0x007e }
            if (r7 != 0) goto L_0x0053
            r6.mo19109a()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0053
        L_0x007e:
            r6 = move-exception
            goto L_0x00a0
        L_0x0080:
            r7 = move-exception
            boolean r1 = r6.f15409c     // Catch:{ IOException -> 0x007e }
            if (r1 != 0) goto L_0x0088
            r6.mo19109a()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            throw r7     // Catch:{ IOException -> 0x007e }
        L_0x0089:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x007e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007e }
            r7.<init>()     // Catch:{ IOException -> 0x007e }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x007e }
            r7.append(r0)     // Catch:{ IOException -> 0x007e }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x007e }
            r6.<init>(r7)     // Catch:{ IOException -> 0x007e }
            throw r6     // Catch:{ IOException -> 0x007e }
        L_0x00a0:
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x00b1 }
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch:{ all -> 0x00b1 }
            goto L_0x0053
        L_0x00b1:
            r6 = move-exception
            l4.c r7 = r5.f16103d
            r7.mo19518a(r0)
            throw r6
        L_0x00b8:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b8 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p168l4.C7253e.mo19515b(j4.b, com.bumptech.glide.load.engine.f):void");
    }

    /* renamed from: c */
    public final synchronized C6945a mo19519c() throws IOException {
        if (this.f16104e == null) {
            this.f16104e = C6945a.m13475i(this.f16101b, this.f16102c);
        }
        return this.f16104e;
    }

    public final synchronized void clear() {
        try {
            C6945a c = mo19519c();
            c.close();
            C6953c.m13489a(c.f15392b);
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            } catch (Throwable th) {
                mo19520d();
                throw th;
            }
        }
        mo19520d();
    }

    /* renamed from: d */
    public final synchronized void mo19520d() {
        this.f16104e = null;
    }
}
