package p208p5;

import androidx.compose.p015ui.input.pointer.C1634f;
import androidx.compose.runtime.C1353o0;
import androidx.work.C3436p;
import com.cardinalcommerce.dependencies.internal.bouncycastle.p048a.C6146y;
import p169l5.C7266b;
import p198o5.C7619a;

/* renamed from: p5.a */
public final class C7673a {

    /* renamed from: a */
    public C7266b f16994a;

    /* renamed from: b */
    public C1634f f16995b;

    /* renamed from: c */
    public C1353o0 f16996c;

    /* renamed from: d */
    public boolean f16997d;

    /* renamed from: e */
    public boolean f16998e;

    /* renamed from: f */
    public int f16999f;

    /* renamed from: g */
    public byte[] f17000g;

    /* renamed from: h */
    public byte[] f17001h;

    /* renamed from: i */
    public byte[] f17002i;

    /* renamed from: j */
    public byte[] f17003j;

    /* renamed from: k */
    public byte[] f17004k;

    /* renamed from: l */
    public byte[] f17005l;

    /* renamed from: m */
    public byte[] f17006m;

    /* renamed from: n */
    public byte[] f17007n;

    /* renamed from: o */
    public byte[] f17008o;

    /* renamed from: p */
    public byte[] f17009p;

    /* renamed from: q */
    public byte[] f17010q;

    /* renamed from: r */
    public int f17011r;

    /* renamed from: s */
    public int f17012s;

    /* renamed from: t */
    public long f17013t;

    /* renamed from: u */
    public byte[] f17014u;

    /* renamed from: v */
    public int f17015v;

    /* renamed from: w */
    public long f17016w;

    /* renamed from: x */
    public long f17017x;

    public C7673a(C7619a aVar) {
        C1634f fVar = new C1634f(2);
        this.f16994a = aVar;
        this.f16995b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0286, code lost:
        if (r7 == 0) goto L_0x0288;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20064a(int r33, byte[] r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r32.mo20071h()
            long r3 = r0.f17013t
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0014
            r32.mo20070g()
        L_0x0014:
            int r3 = r0.f17012s
            boolean r4 = r0.f16997d
            java.lang.String r7 = "Output buffer too short"
            if (r4 == 0) goto L_0x002a
            int r4 = r2.length
            int r4 = r4 - r1
            int r8 = r0.f16999f
            int r8 = r8 + r3
            if (r4 < r8) goto L_0x0024
            goto L_0x0033
        L_0x0024:
            com.cardinalcommerce.dependencies.internal.bouncycastle.a.y r1 = new com.cardinalcommerce.dependencies.internal.bouncycastle.a.y
            r1.<init>(r7)
            throw r1
        L_0x002a:
            int r4 = r0.f16999f
            if (r3 < r4) goto L_0x02e7
            int r3 = r3 - r4
            int r4 = r2.length
            int r4 = r4 - r1
            if (r4 < r3) goto L_0x02e1
        L_0x0033:
            r4 = 16
            r7 = 0
            if (r3 <= 0) goto L_0x0077
            byte[] r8 = r0.f17005l
            byte[] r9 = new byte[r4]
            r0.mo20066c(r9)
            boolean r10 = r0.f16997d
            if (r10 == 0) goto L_0x0059
            r10 = r3
        L_0x0044:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x0053
            int r11 = r10 + 0
            byte r12 = r8[r11]
            byte r13 = r9[r11]
            r12 = r12 ^ r13
            byte r12 = (byte) r12
            r8[r11] = r12
            goto L_0x0044
        L_0x0053:
            byte[] r9 = r0.f17007n
            r0.mo20069f(r9, r8, r7, r3)
            goto L_0x006e
        L_0x0059:
            byte[] r10 = r0.f17007n
            r0.mo20069f(r10, r8, r7, r3)
            r10 = r3
        L_0x005f:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x006e
            int r11 = r10 + 0
            byte r12 = r8[r11]
            byte r13 = r9[r11]
            r12 = r12 ^ r13
            byte r12 = (byte) r12
            r8[r11] = r12
            goto L_0x005f
        L_0x006e:
            java.lang.System.arraycopy(r8, r7, r2, r1, r3)
            long r8 = r0.f17013t
            long r10 = (long) r3
            long r8 = r8 + r10
            r0.f17013t = r8
        L_0x0077:
            long r8 = r0.f17016w
            int r10 = r0.f17015v
            long r11 = (long) r10
            long r8 = r8 + r11
            r0.f17016w = r8
            long r11 = r0.f17017x
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            r11 = 8
            r13 = 1
            if (r8 <= 0) goto L_0x020c
            if (r10 <= 0) goto L_0x0091
            byte[] r8 = r0.f17008o
            byte[] r14 = r0.f17014u
            r0.mo20069f(r8, r14, r7, r10)
        L_0x0091:
            long r14 = r0.f17017x
            int r8 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x009e
            byte[] r8 = r0.f17008o
            byte[] r10 = r0.f17009p
            androidx.work.C3436p.m8252o(r8, r10)
        L_0x009e:
            long r14 = r0.f17013t
            long r14 = r14 * r11
            r16 = 127(0x7f, double:6.27E-322)
            long r14 = r14 + r16
            r8 = 7
            long r14 = r14 >>> r8
            byte[] r10 = new byte[r4]
            androidx.compose.runtime.o0 r11 = r0.f16996c
            r12 = 32
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 2
            if (r11 != 0) goto L_0x00f3
            androidx.compose.runtime.o0 r11 = new androidx.compose.runtime.o0
            r11.<init>((int) r13)
            r0.f16996c = r11
            byte[] r8 = r0.f17003j
            long[] r13 = new long[r4]
            r5 = r7
            r6 = r5
        L_0x00c2:
            if (r5 >= r4) goto L_0x00ea
            int r7 = androidx.work.C3436p.m8240b(r6, r8)
            int r4 = r6 + 4
            int r4 = androidx.work.C3436p.m8240b(r4, r8)
            r23 = r10
            long r9 = (long) r7
            long r9 = r9 & r18
            long r9 = r9 << r12
            r24 = r13
            long r12 = (long) r4
            long r12 = r12 & r18
            long r9 = r9 | r12
            r24[r5] = r9
            r4 = 8
            int r6 = r6 + r4
            int r5 = r5 + 1
            r10 = r23
            r13 = r24
            r4 = 2
            r7 = 0
            r12 = 32
            goto L_0x00c2
        L_0x00ea:
            r23 = r10
            r24 = r13
            r4 = r24
            r11.f2952b = r4
            goto L_0x00f5
        L_0x00f3:
            r23 = r10
        L_0x00f5:
            androidx.compose.runtime.o0 r4 = r0.f16996c
            r4.getClass()
            r5 = 2
            long[] r6 = new long[r5]
            r8 = -9223372036854775808
            r5 = 0
            r6[r5] = r8
            r8 = 0
            int r5 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x018b
            java.lang.Object r4 = r4.f2952b
            long[] r4 = (long[]) r4
            if (r4 != 0) goto L_0x0110
            r4 = 0
            goto L_0x0119
        L_0x0110:
            int r5 = r4.length
            long[] r5 = new long[r5]
            int r8 = r4.length
            r9 = 0
            java.lang.System.arraycopy(r4, r9, r5, r9, r8)
            r4 = r5
        L_0x0119:
            r8 = 1
            long r8 = r8 & r14
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0125
            androidx.work.C3436p.m8253p(r6, r4)
        L_0x0125:
            r5 = 4
            long[] r5 = new long[r5]
            r8 = 0
            r9 = r4[r8]
            androidx.activity.C0114h.m273D(r5, r8, r9)
            r9 = 1
            r10 = r4[r9]
            r12 = 2
            androidx.activity.C0114h.m273D(r5, r12, r10)
            r10 = r5[r8]
            r24 = r5[r9]
            r26 = r5[r12]
            r8 = 3
            r28 = r5[r8]
            long r30 = r28 >>> r9
            long r8 = r30 ^ r28
            long r30 = r28 >>> r12
            long r8 = r8 ^ r30
            r5 = 7
            long r12 = r28 >>> r5
            long r8 = r8 ^ r12
            long r8 = r24 ^ r8
            r5 = 63
            long r12 = r28 << r5
            r24 = 62
            long r30 = r28 << r24
            long r12 = r12 ^ r30
            r25 = 57
            long r28 = r28 << r25
            long r12 = r28 ^ r12
            long r12 = r26 ^ r12
            r21 = 1
            long r26 = r12 >>> r21
            long r26 = r26 ^ r12
            r22 = 2
            long r28 = r12 >>> r22
            long r26 = r26 ^ r28
            r20 = 7
            long r28 = r12 >>> r20
            long r26 = r26 ^ r28
            long r10 = r10 ^ r26
            long r26 = r12 << r5
            long r28 = r12 << r24
            long r26 = r26 ^ r28
            long r12 = r12 << r25
            long r12 = r12 ^ r26
            long r8 = r8 ^ r12
            r5 = 0
            r4[r5] = r10
            r5 = 1
            r4[r5] = r8
            long r14 = r14 >>> r5
            r8 = 0
            int r10 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0119
            goto L_0x018c
        L_0x018b:
            r5 = 1
        L_0x018c:
            r4 = 0
            r8 = 0
            r9 = 2
        L_0x018f:
            if (r4 >= r9) goto L_0x019e
            r10 = r6[r4]
            r12 = r23
            androidx.work.C3436p.m8246h(r10, r12, r8)
            r10 = 8
            int r8 = r8 + r10
            int r4 = r4 + 1
            goto L_0x018f
        L_0x019e:
            r12 = r23
            byte[] r4 = r0.f17008o
            long[] r6 = new long[r9]
            r8 = 0
            r10 = 0
        L_0x01a6:
            if (r8 >= r9) goto L_0x01c8
            int r9 = androidx.work.C3436p.m8240b(r10, r4)
            int r11 = r10 + 4
            int r11 = androidx.work.C3436p.m8240b(r11, r4)
            long r13 = (long) r9
            long r13 = r13 & r18
            r7 = 32
            long r13 = r13 << r7
            r9 = r6
            long r5 = (long) r11
            long r5 = r5 & r18
            long r5 = r5 | r13
            r9[r8] = r5
            r5 = 8
            int r10 = r10 + r5
            int r8 = r8 + 1
            r6 = r9
            r5 = 1
            r9 = 2
            goto L_0x01a6
        L_0x01c8:
            r9 = r6
            r5 = 2
            long[] r6 = new long[r5]
            r8 = 0
            r10 = 0
        L_0x01ce:
            if (r8 >= r5) goto L_0x01ef
            int r5 = androidx.work.C3436p.m8240b(r10, r12)
            int r11 = r10 + 4
            int r11 = androidx.work.C3436p.m8240b(r11, r12)
            long r13 = (long) r5
            long r13 = r13 & r18
            r5 = 32
            long r13 = r13 << r5
            r7 = r6
            long r5 = (long) r11
            long r5 = r5 & r18
            long r5 = r5 | r13
            r7[r8] = r5
            r5 = 8
            int r10 = r10 + r5
            int r8 = r8 + 1
            r6 = r7
            r5 = 2
            goto L_0x01ce
        L_0x01ef:
            r7 = r6
            androidx.work.C3436p.m8253p(r9, r7)
            r5 = 0
            r6 = 0
            r7 = 2
        L_0x01f6:
            if (r5 >= r7) goto L_0x0203
            r10 = r9[r5]
            androidx.work.C3436p.m8246h(r10, r4, r6)
            r8 = 8
            int r6 = r6 + r8
            int r5 = r5 + 1
            goto L_0x01f6
        L_0x0203:
            byte[] r4 = r0.f17007n
            byte[] r5 = r0.f17008o
            androidx.work.C3436p.m8252o(r4, r5)
            r4 = 16
        L_0x020c:
            byte[] r5 = new byte[r4]
            long r6 = r0.f17016w
            r8 = 8
            long r6 = r6 * r8
            r4 = 0
            androidx.work.C3436p.m8246h(r6, r5, r4)
            long r6 = r0.f17013t
            long r6 = r6 * r8
            r4 = 8
            androidx.work.C3436p.m8246h(r6, r5, r4)
            byte[] r4 = r0.f17007n
            androidx.work.C3436p.m8252o(r4, r5)
            androidx.compose.ui.input.pointer.f r5 = r0.f16995b
            r5.mo6595e(r4)
            r4 = 16
            byte[] r5 = new byte[r4]
            l5.b r4 = r0.f16994a
            byte[] r6 = r0.f17004k
            o5.a r4 = (p198o5.C7619a) r4
            r4.mo20035c(r6, r5)
            byte[] r4 = r0.f17007n
            androidx.work.C3436p.m8252o(r5, r4)
            int r4 = r0.f16999f
            byte[] r6 = new byte[r4]
            r0.f17006m = r6
            r7 = 0
            java.lang.System.arraycopy(r5, r7, r6, r7, r4)
            boolean r4 = r0.f16997d
            if (r4 == 0) goto L_0x0257
            byte[] r4 = r0.f17006m
            int r5 = r0.f17012s
            int r1 = r1 + r5
            int r5 = r0.f16999f
            java.lang.System.arraycopy(r4, r7, r2, r1, r5)
            int r1 = r0.f16999f
            int r3 = r3 + r1
            goto L_0x028d
        L_0x0257:
            int r1 = r0.f16999f
            byte[] r2 = new byte[r1]
            byte[] r4 = r0.f17005l
            java.lang.System.arraycopy(r4, r3, r2, r7, r1)
            byte[] r4 = r0.f17006m
            if (r4 == 0) goto L_0x028a
            if (r4 != r2) goto L_0x0267
            goto L_0x0288
        L_0x0267:
            int r5 = r4.length
            if (r5 >= r1) goto L_0x026c
            int r5 = r4.length
            goto L_0x026d
        L_0x026c:
            r5 = r1
        L_0x026d:
            int r6 = r4.length
            r6 = r6 ^ r1
            r7 = r6
            r6 = 0
        L_0x0271:
            if (r6 == r5) goto L_0x027c
            byte r8 = r4[r6]
            byte r9 = r2[r6]
            r8 = r8 ^ r9
            r7 = r7 | r8
            int r6 = r6 + 1
            goto L_0x0271
        L_0x027c:
            if (r5 >= r1) goto L_0x0286
            byte r4 = r2[r5]
            int r6 = ~r4
            r4 = r4 ^ r6
            r7 = r7 | r4
            int r5 = r5 + 1
            goto L_0x027c
        L_0x0286:
            if (r7 != 0) goto L_0x028a
        L_0x0288:
            r13 = 1
            goto L_0x028b
        L_0x028a:
            r13 = 0
        L_0x028b:
            if (r13 == 0) goto L_0x02d9
        L_0x028d:
            l5.b r1 = r0.f16994a
            r1.getClass()
            r1 = 16
            byte[] r2 = new byte[r1]
            r0.f17007n = r2
            byte[] r2 = new byte[r1]
            r0.f17008o = r2
            byte[] r2 = new byte[r1]
            r0.f17009p = r2
            byte[] r1 = new byte[r1]
            r0.f17014u = r1
            r5 = 0
            r0.f17015v = r5
            r1 = 0
            r0.f17016w = r1
            r0.f17017x = r1
            byte[] r4 = r0.f17004k
            byte[] r4 = p267v7.C8212a.m16504k(r4)
            r0.f17010q = r4
            r4 = -2
            r0.f17011r = r4
            r0.f17012s = r5
            r0.f17013t = r1
            byte[] r1 = r0.f17005l
            if (r1 == 0) goto L_0x02c9
            r2 = r5
        L_0x02c1:
            int r4 = r1.length
            if (r2 >= r4) goto L_0x02c9
            r1[r2] = r5
            int r2 = r2 + 1
            goto L_0x02c1
        L_0x02c9:
            boolean r1 = r0.f16997d
            if (r1 == 0) goto L_0x02d0
            r0.f16998e = r5
            goto L_0x02d8
        L_0x02d0:
            byte[] r1 = r0.f17002i
            if (r1 == 0) goto L_0x02d8
            int r2 = r1.length
            r0.mo20067d(r1, r2)
        L_0x02d8:
            return r3
        L_0x02d9:
            com.cardinalcommerce.dependencies.internal.bouncycastle.a.t r1 = new com.cardinalcommerce.dependencies.internal.bouncycastle.a.t
            java.lang.String r2 = "mac check in GCM failed"
            r1.<init>(r2)
            throw r1
        L_0x02e1:
            com.cardinalcommerce.dependencies.internal.bouncycastle.a.y r1 = new com.cardinalcommerce.dependencies.internal.bouncycastle.a.y
            r1.<init>(r7)
            throw r1
        L_0x02e7:
            com.cardinalcommerce.dependencies.internal.bouncycastle.a.t r1 = new com.cardinalcommerce.dependencies.internal.bouncycastle.a.t
            java.lang.String r2 = "data too short"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p208p5.C7673a.mo20064a(int, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035 A[LOOP:1: B:14:0x0033->B:15:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20065b(byte[] r8, int r9, byte[] r10) {
        /*
            r7 = this;
            r7.mo20071h()
            int r0 = r8.length
            r1 = 0
            int r0 = r0 - r1
            if (r0 < r9) goto L_0x0076
            boolean r0 = r7.f16997d
            r2 = 16
            if (r0 == 0) goto L_0x004b
            int r0 = r7.f17012s
            if (r0 == 0) goto L_0x0030
            r0 = r1
        L_0x0013:
            if (r9 <= 0) goto L_0x0031
            int r9 = r9 + -1
            byte[] r3 = r7.f17005l
            int r4 = r7.f17012s
            int r5 = r0 + 1
            byte r0 = r8[r0]
            r3[r4] = r0
            int r4 = r4 + 1
            r7.f17012s = r4
            if (r4 != r2) goto L_0x002e
            r7.mo20068e(r3, r1, r10, r1)
            r7.f17012s = r1
            r0 = r2
            goto L_0x0033
        L_0x002e:
            r0 = r5
            goto L_0x0013
        L_0x0030:
            r0 = r1
        L_0x0031:
            r5 = r0
            r0 = r1
        L_0x0033:
            if (r9 < r2) goto L_0x0041
            int r3 = r1 + r0
            r7.mo20068e(r8, r5, r10, r3)
            int r5 = r5 + 16
            int r9 = r9 + -16
            int r0 = r0 + 16
            goto L_0x0033
        L_0x0041:
            if (r9 <= 0) goto L_0x0075
            byte[] r10 = r7.f17005l
            java.lang.System.arraycopy(r8, r5, r10, r1, r9)
            r7.f17012s = r9
            goto L_0x0075
        L_0x004b:
            r0 = r1
            r3 = r0
        L_0x004d:
            if (r3 >= r9) goto L_0x0075
            byte[] r4 = r7.f17005l
            int r5 = r7.f17012s
            int r6 = r1 + r3
            byte r6 = r8[r6]
            r4[r5] = r6
            int r5 = r5 + 1
            r7.f17012s = r5
            int r6 = r4.length
            if (r5 != r6) goto L_0x0072
            int r5 = r1 + r0
            r7.mo20068e(r4, r1, r10, r5)
            byte[] r4 = r7.f17005l
            int r5 = r7.f16999f
            java.lang.System.arraycopy(r4, r2, r4, r1, r5)
            int r4 = r7.f16999f
            r7.f17012s = r4
            int r0 = r0 + 16
        L_0x0072:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0075:
            return r0
        L_0x0076:
            com.cardinalcommerce.dependencies.internal.bouncycastle.a.m r8 = new com.cardinalcommerce.dependencies.internal.bouncycastle.a.m
            java.lang.String r9 = "Input buffer too short"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p208p5.C7673a.mo20065b(byte[], int, byte[]):int");
    }

    /* renamed from: c */
    public final void mo20066c(byte[] bArr) {
        int i = this.f17011r;
        if (i != 0) {
            this.f17011r = i - 1;
            byte[] bArr2 = this.f17010q;
            int i2 = (bArr2[15] & 255) + 1;
            bArr2[15] = (byte) i2;
            int i3 = (i2 >>> 8) + (bArr2[14] & 255);
            bArr2[14] = (byte) i3;
            int i4 = (i3 >>> 8) + (bArr2[13] & 255);
            bArr2[13] = (byte) i4;
            bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
            ((C7619a) this.f16994a).mo20035c(bArr2, bArr);
            return;
        }
        throw new IllegalStateException("Attempt to process too many blocks");
    }

    /* renamed from: d */
    public final void mo20067d(byte[] bArr, int i) {
        mo20071h();
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr2 = this.f17014u;
            int i3 = this.f17015v;
            bArr2[i3] = bArr[0 + i2];
            int i4 = i3 + 1;
            this.f17015v = i4;
            if (i4 == 16) {
                byte[] bArr3 = this.f17008o;
                C3436p.m8252o(bArr3, bArr2);
                this.f16995b.mo6595e(bArr3);
                this.f17015v = 0;
                this.f17016w += 16;
            }
        }
    }

    /* renamed from: e */
    public final void mo20068e(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 >= 16) {
            if (this.f17013t == 0) {
                mo20070g();
            }
            byte[] bArr3 = new byte[16];
            mo20066c(bArr3);
            if (this.f16997d) {
                C3436p.m8243e(bArr3, bArr, i);
                byte[] bArr4 = this.f17007n;
                C3436p.m8252o(bArr4, bArr3);
                this.f16995b.mo6595e(bArr4);
                System.arraycopy(bArr3, 0, bArr2, i2, 16);
            } else {
                byte[] bArr5 = this.f17007n;
                C3436p.m8243e(bArr5, bArr, i);
                this.f16995b.mo6595e(bArr5);
                int i3 = 0;
                do {
                    bArr2[i2 + i3] = (byte) (bArr3[0 + i3] ^ bArr[i + i3]);
                    int i4 = i3 + 1;
                    bArr2[i2 + i4] = (byte) (bArr3[0 + i4] ^ bArr[i + i4]);
                    int i5 = i4 + 1;
                    bArr2[i2 + i5] = (byte) (bArr3[0 + i5] ^ bArr[i + i5]);
                    int i6 = i5 + 1;
                    bArr2[i2 + i6] = (byte) (bArr3[0 + i6] ^ bArr[i + i6]);
                    i3 = i6 + 1;
                } while (i3 < 16);
            }
            this.f17013t += 16;
            return;
        }
        throw new C6146y("Output buffer too short");
    }

    /* renamed from: f */
    public final void mo20069f(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            } else {
                this.f16995b.mo6595e(bArr);
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo20070g() {
        if (this.f17016w > 0) {
            System.arraycopy(this.f17008o, 0, this.f17009p, 0, 16);
            this.f17017x = this.f17016w;
        }
        int i = this.f17015v;
        if (i > 0) {
            mo20069f(this.f17009p, this.f17014u, 0, i);
            this.f17017x += (long) this.f17015v;
        }
        if (this.f17017x > 0) {
            System.arraycopy(this.f17009p, 0, this.f17007n, 0, 16);
        }
    }

    /* renamed from: h */
    public final void mo20071h() {
        if (this.f16998e) {
            return;
        }
        if (this.f16997d) {
            throw new IllegalStateException("GCM cipher cannot be reused for encryption");
        }
        throw new IllegalStateException("GCM cipher needs to be initialised");
    }
}
