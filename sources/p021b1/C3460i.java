package p021b1;

import p021b1.C3461j;
import p077d1.C6618b;

/* renamed from: b1.i */
public final class C3460i implements C6618b<C3461j.C3462a> {

    /* renamed from: a */
    public final /* synthetic */ String f8070a;

    public C3460i(String str) {
        this.f8070a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r0 >= r2.size()) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        ((p077d1.C6618b) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(p021b1.C3461j.C3462a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p021b1.C3461j.f8073c
            monitor-enter(r0)
            o.i<java.lang.String, java.util.ArrayList<d1.b<b1.j$a>>> r1 = p021b1.C3461j.f8074d     // Catch:{ all -> 0x002c }
            java.lang.String r2 = r4.f8070a     // Catch:{ all -> 0x002c }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x002c }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x0012:
            java.lang.String r3 = r4.f8070a     // Catch:{ all -> 0x002c }
            r1.remove(r3)     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            r0 = 0
        L_0x0019:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002b
            java.lang.Object r1 = r2.get(r0)
            d1.b r1 = (p077d1.C6618b) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x0019
        L_0x002b:
            return
        L_0x002c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b1.C3460i.accept(b1.j$a):void");
    }
}
