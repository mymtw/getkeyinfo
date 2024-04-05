package p036c5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: c5.i */
public class C4422i<T, Y> {

    /* renamed from: a */
    public final LinkedHashMap f9700a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f9701b;

    /* renamed from: c */
    public long f9702c;

    /* renamed from: d */
    public long f9703d;

    /* renamed from: c5.i$a */
    public static final class C4423a<Y> {

        /* renamed from: a */
        public final Y f9704a;

        /* renamed from: b */
        public final int f9705b;

        public C4423a(Y y, int i) {
            this.f9704a = y;
            this.f9705b = i;
        }
    }

    public C4422i(long j) {
        this.f9701b = j;
        this.f9702c = j;
    }

    /* renamed from: a */
    public final synchronized Y mo14373a(T t) {
        C4423a aVar;
        aVar = (C4423a) this.f9700a.get(t);
        return aVar != null ? aVar.f9704a : null;
    }

    /* renamed from: b */
    public int mo14374b(Y y) {
        return 1;
    }

    /* renamed from: c */
    public void mo14375c(T t, Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized Y mo14376d(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo14374b(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r0     // Catch:{ all -> 0x004c }
            long r3 = r7.f9702c     // Catch:{ all -> 0x004c }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.mo14375c(r8, r9)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f9703d     // Catch:{ all -> 0x004c }
            long r5 = r5 + r1
            r7.f9703d = r5     // Catch:{ all -> 0x004c }
        L_0x0019:
            java.util.LinkedHashMap r1 = r7.f9700a     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            c5.i$a r2 = new c5.i$a     // Catch:{ all -> 0x004c }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004c }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004c }
            c5.i$a r0 = (p036c5.C4422i.C4423a) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f9703d     // Catch:{ all -> 0x004c }
            int r3 = r0.f9705b     // Catch:{ all -> 0x004c }
            long r5 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 - r5
            r7.f9703d = r1     // Catch:{ all -> 0x004c }
            Y r1 = r0.f9704a     // Catch:{ all -> 0x004c }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f9704a     // Catch:{ all -> 0x004c }
            r7.mo14375c(r8, r9)     // Catch:{ all -> 0x004c }
        L_0x0041:
            long r8 = r7.f9702c     // Catch:{ all -> 0x004c }
            r7.mo14377e(r8)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            Y r4 = r0.f9704a     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return r4
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p036c5.C4422i.mo14376d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public final synchronized void mo14377e(long j) {
        while (this.f9703d > j) {
            Iterator it = this.f9700a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C4423a aVar = (C4423a) entry.getValue();
            this.f9703d -= (long) aVar.f9705b;
            Object key = entry.getKey();
            it.remove();
            mo14375c(key, aVar.f9704a);
        }
    }
}
