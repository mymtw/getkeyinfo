package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import p244t5.C7959a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.b */
public class C6175b implements Serializable {

    /* renamed from: a */
    private final Map<Integer, C6174a> f13421a = new TreeMap();

    public C6175b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6175b(com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6194p r27, long r28, byte[] r30, byte[] r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r30
            r3 = r31
            r26.<init>()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r0.f13421a = r4
            r6 = 0
        L_0x0014:
            int r8 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c7
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.t r8 = r1.f13475b
            int r9 = r8.f13501c
            long r10 = r6 >> r9
            r12 = 1
            long r14 = r12 << r9
            long r14 = r14 - r12
            long r12 = r6 & r14
            int r12 = (int) r12
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r13 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a
            r13.<init>()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r13 = r13.mo17535a(r10)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r13 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k.C6188a) r13
            r13.f13453e = r12
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k r4 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k
            r4.<init>(r13)
            r5 = 1
            int r13 = r5 << r9
            int r5 = r13 + -1
            r20 = r10
            r10 = 0
            if (r12 >= r5) goto L_0x0055
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.a r11 = r0.mo17508a((int) r10)
            if (r11 == 0) goto L_0x004a
            if (r12 != 0) goto L_0x0052
        L_0x004a:
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.a r11 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.a
            r11.<init>((com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6200t) r8, (byte[]) r2, (byte[]) r3, (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k) r4)
            r0.mo17511a(r10, r11)
        L_0x0052:
            r0.mo17509a(r10, r2, r3, r4)
        L_0x0055:
            r4 = 1
        L_0x0056:
            int r8 = r1.f13477d
            if (r4 >= r8) goto L_0x00c0
            long r11 = r20 & r14
            int r8 = (int) r11
            long r11 = r20 >> r9
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r10 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a
            r10.<init>()
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r10 = r10.mo17536c(r4)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r10 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k.C6188a) r10
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.o$a r10 = r10.mo17535a(r11)
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k$a r10 = (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k.C6188a) r10
            r10.f13453e = r8
            r21 = r9
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k r9 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.k
            r9.<init>(r10)
            if (r8 >= r5) goto L_0x00b2
            r18 = 0
            int r8 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x0085
            r24 = r11
            r8 = r13
            goto L_0x009b
        L_0x0085:
            r16 = 1
            long r22 = r6 + r16
            r24 = r11
            double r10 = (double) r13
            r8 = r13
            double r12 = (double) r4
            double r10 = java.lang.Math.pow(r10, r12)
            long r10 = (long) r10
            long r22 = r22 % r10
            int r10 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r10 != 0) goto L_0x009b
            r10 = 1
            goto L_0x009c
        L_0x009b:
            r10 = 0
        L_0x009c:
            if (r10 == 0) goto L_0x00b7
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.a r10 = r0.mo17508a((int) r4)
            if (r10 != 0) goto L_0x00ae
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.a r10 = new com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.a
            com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.t r11 = r1.f13475b
            r10.<init>((com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6200t) r11, (byte[]) r2, (byte[]) r3, (com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6187k) r9)
            r0.mo17511a(r4, r10)
        L_0x00ae:
            r0.mo17509a(r4, r2, r3, r9)
            goto L_0x00b7
        L_0x00b2:
            r24 = r11
            r8 = r13
            r18 = 0
        L_0x00b7:
            int r4 = r4 + 1
            r13 = r8
            r9 = r21
            r20 = r24
            r10 = 0
            goto L_0x0056
        L_0x00c0:
            r9 = 1
            r18 = 0
            long r6 = r6 + r9
            goto L_0x0014
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g.C6175b.<init>(com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.p, long, byte[], byte[]):void");
    }

    /* renamed from: a */
    public C6174a mo17508a(int i) {
        return this.f13421a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public C6175b mo17510a(C7959a aVar) {
        C6175b bVar = new C6175b();
        for (Integer next : this.f13421a.keySet()) {
            bVar.f13421a.put(next, this.f13421a.get(next).mo17504a(aVar));
        }
        return bVar;
    }

    /* renamed from: a */
    public C6174a mo17509a(int i, byte[] bArr, byte[] bArr2, C6187k kVar) {
        return this.f13421a.put(Integer.valueOf(i), this.f13421a.get(Integer.valueOf(i)).mo17505a(bArr, bArr2, kVar));
    }

    /* renamed from: a */
    public void mo17511a(int i, C6174a aVar) {
        this.f13421a.put(Integer.valueOf(i), aVar);
    }
}
