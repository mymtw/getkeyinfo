package okhttp3.internal.cache;

import p737cr.C18982a;

/* renamed from: okhttp3.internal.cache.f */
public final class C19963f extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ DiskLruCache f44118e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19963f(DiskLruCache diskLruCache, String str) {
        super(str, true);
        this.f44118e = diskLruCache;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = r6.f44118e;
        r1.f44081o = true;
        r1.f44073g = p756lr.C19906r.m33997a(new p756lr.C19892e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo70418a() {
        /*
            r6 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r6.f44118e
            monitor-enter(r0)
            okhttp3.internal.cache.DiskLruCache r1 = r6.f44118e     // Catch:{ all -> 0x003f }
            boolean r2 = r1.f44078l     // Catch:{ all -> 0x003f }
            r3 = -1
            if (r2 == 0) goto L_0x003d
            boolean r2 = r1.f44079m     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0010
            goto L_0x003d
        L_0x0010:
            r2 = 1
            r1.mo72893r()     // Catch:{ IOException -> 0x0015 }
            goto L_0x0019
        L_0x0015:
            okhttp3.internal.cache.DiskLruCache r1 = r6.f44118e     // Catch:{ all -> 0x003f }
            r1.f44080n = r2     // Catch:{ all -> 0x003f }
        L_0x0019:
            okhttp3.internal.cache.DiskLruCache r1 = r6.f44118e     // Catch:{ IOException -> 0x002c }
            boolean r1 = r1.mo72887g()     // Catch:{ IOException -> 0x002c }
            if (r1 == 0) goto L_0x003b
            okhttp3.internal.cache.DiskLruCache r1 = r6.f44118e     // Catch:{ IOException -> 0x002c }
            r1.mo72891k()     // Catch:{ IOException -> 0x002c }
            okhttp3.internal.cache.DiskLruCache r1 = r6.f44118e     // Catch:{ IOException -> 0x002c }
            r5 = 0
            r1.f44075i = r5     // Catch:{ IOException -> 0x002c }
            goto L_0x003b
        L_0x002c:
            okhttp3.internal.cache.DiskLruCache r1 = r6.f44118e     // Catch:{ all -> 0x003f }
            r1.f44081o = r2     // Catch:{ all -> 0x003f }
            lr.e r2 = new lr.e     // Catch:{ all -> 0x003f }
            r2.<init>()     // Catch:{ all -> 0x003f }
            lr.w r2 = p756lr.C19906r.m33997a(r2)     // Catch:{ all -> 0x003f }
            r1.f44073g = r2     // Catch:{ all -> 0x003f }
        L_0x003b:
            monitor-exit(r0)
            return r3
        L_0x003d:
            monitor-exit(r0)
            return r3
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C19963f.mo70418a():long");
    }
}
