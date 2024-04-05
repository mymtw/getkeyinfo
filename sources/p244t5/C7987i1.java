package p244t5;

import p267v7.C8212a;

/* renamed from: t5.i1 */
public final class C7987i1 extends C8018s1 {

    /* renamed from: c */
    public static C7987i1[] f17473c = new C7987i1[12];

    /* renamed from: b */
    public final byte[] f17474b;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7987i1(byte[] r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.ThreadLocal r0 = p267v7.C8216d.f18043a
            r0 = 0
            v7.c r1 = new v7.c     // Catch:{ AccessControlException -> 0x001e }
            r1.<init>()     // Catch:{ AccessControlException -> 0x001e }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ AccessControlException -> 0x001e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ AccessControlException -> 0x001e }
            if (r1 == 0) goto L_0x001e
            java.lang.String r2 = "true"
            java.lang.String r1 = p267v7.C8217e.m16510b(r1)     // Catch:{ AccessControlException -> 0x001e }
            boolean r1 = r2.equals(r1)     // Catch:{ AccessControlException -> 0x001e }
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            if (r1 != 0) goto L_0x0046
            int r1 = r5.length
            r2 = 1
            if (r1 <= r2) goto L_0x003b
            byte r1 = r5[r0]
            if (r1 != 0) goto L_0x0031
            byte r3 = r5[r2]
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0031
        L_0x002f:
            r0 = r2
            goto L_0x003b
        L_0x0031:
            r3 = -1
            if (r1 != r3) goto L_0x003b
            byte r1 = r5[r2]
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            goto L_0x002f
        L_0x003b:
            if (r0 != 0) goto L_0x003e
            goto L_0x0046
        L_0x003e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "malformed enumerated"
            r5.<init>(r0)
            throw r5
        L_0x0046:
            byte[] r5 = p267v7.C8212a.m16504k(r5)
            r4.f17474b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p244t5.C7987i1.<init>(byte[]):void");
    }

    /* renamed from: e */
    public final void mo20506e(C8014r1 r1Var) {
        r1Var.mo20569f(10, this.f17474b);
    }

    /* renamed from: g */
    public final boolean mo20507g(C8018s1 s1Var) {
        if (!(s1Var instanceof C7987i1)) {
            return false;
        }
        return C8212a.m16500g(this.f17474b, ((C7987i1) s1Var).f17474b);
    }

    public final int hashCode() {
        return C8212a.m16495b(this.f17474b);
    }

    /* renamed from: l */
    public final boolean mo20508l() {
        return false;
    }

    /* renamed from: n */
    public final int mo20509n() {
        return C7974e1.m15996a(this.f17474b.length) + 1 + this.f17474b.length;
    }
}
