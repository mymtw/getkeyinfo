package p209p6;

import android.support.p013v4.media.C0072d;
import androidx.work.C3436p;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import p209p6.C7681d;
import p209p6.C7686e;
import p245t6.C8039a;
import p267v7.C8214b;
import p275w6.C8252a;

/* renamed from: p6.c */
public abstract class C7676c {

    /* renamed from: a */
    public C8252a f17023a;

    /* renamed from: b */
    public C7681d f17024b;

    /* renamed from: c */
    public C7681d f17025c;

    /* renamed from: d */
    public BigInteger f17026d;

    /* renamed from: e */
    public BigInteger f17027e;

    /* renamed from: f */
    public int f17028f = 0;

    /* renamed from: g */
    public C8039a f17029g = null;

    /* renamed from: h */
    public C3436p f17030h = null;

    /* renamed from: p6.c$a */
    public static abstract class C7677a extends C7676c {

        /* renamed from: i */
        public BigInteger[] f17031i;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C7677a(int r6, int r7, int r8, int r9) {
            /*
                r5 = this;
                if (r7 == 0) goto L_0x004c
                r0 = 2
                r1 = 1
                r2 = 3
                r3 = 0
                if (r8 != 0) goto L_0x001f
                if (r9 != 0) goto L_0x0017
                int[] r8 = new int[r2]
                r8[r3] = r3
                r8[r1] = r7
                r8[r0] = r6
                w6.d r6 = p275w6.C8253b.m16538a(r8)
                goto L_0x0035
            L_0x0017:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be 0 if k2 == 0"
                r6.<init>(r7)
                throw r6
            L_0x001f:
                if (r8 <= r7) goto L_0x0044
                if (r9 <= r8) goto L_0x003c
                r4 = 5
                int[] r4 = new int[r4]
                r4[r3] = r3
                r4[r1] = r7
                r4[r0] = r8
                r4[r2] = r9
                r7 = 4
                r4[r7] = r6
                w6.d r6 = p275w6.C8253b.m16538a(r4)
            L_0x0035:
                r5.<init>(r6)
                r6 = 0
                r5.f17031i = r6
                return
            L_0x003c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k3 must be > k2"
                r6.<init>(r7)
                throw r6
            L_0x0044:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k2 must be > k1"
                r6.<init>(r7)
                throw r6
            L_0x004c:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "k1 must be > 0"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p209p6.C7676c.C7677a.<init>(int, int, int, int):void");
        }

        /* renamed from: c */
        public final C7686e mo20074c(int i, BigInteger bigInteger) {
            C7681d dVar;
            C7681d b = mo20073b(bigInteger);
            if (b.mo20109r()) {
                dVar = this.f17025c.mo20106o();
            } else {
                C7681d q = mo20090q(b.mo20104m().mo20105n().mo20101j(this.f17025c).mo20094c(this.f17024b).mo20094c(b));
                if (q != null) {
                    if (q.mo20110s() != (i == 1)) {
                        q = q.mo20100i();
                    }
                    int i2 = this.f17028f;
                    dVar = (i2 == 5 || i2 == 6) ? q.mo20094c(b) : q.mo20101j(b);
                } else {
                    dVar = null;
                }
            }
            if (dVar != null) {
                return mo20078f(b, dVar, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        /* renamed from: e */
        public final C7686e mo20076e(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            C7681d b = mo20073b(bigInteger);
            C7681d b2 = mo20073b(bigInteger2);
            int i = this.f17028f;
            if (i == 5 || i == 6) {
                if (!b.mo20109r()) {
                    b2 = b2.mo20103l(b).mo20094c(b);
                } else if (!b2.mo20104m().equals(this.f17025c)) {
                    throw new IllegalArgumentException();
                }
            }
            return mo20078f(b, b2, z);
        }

        /* renamed from: q */
        public final C7681d mo20090q(C7681d dVar) {
            C7681d dVar2;
            if (dVar.mo20109r()) {
                return dVar;
            }
            C7681d b = mo20073b(C7675b.f17018a);
            int a = mo20072a();
            Random random = new Random();
            do {
                C7681d b2 = mo20073b(new BigInteger(a, random));
                C7681d dVar3 = dVar;
                dVar2 = b;
                for (int i = 1; i < a; i++) {
                    C7681d m = dVar3.mo20104m();
                    dVar2 = dVar2.mo20104m().mo20094c(m.mo20101j(b2));
                    dVar3 = m.mo20094c(dVar);
                }
                if (!dVar3.mo20109r()) {
                    return null;
                }
            } while (dVar2.mo20104m().mo20094c(dVar2).mo20109r());
            return dVar2;
        }

        /* renamed from: r */
        public boolean mo20091r() {
            return this.f17026d != null && this.f17027e != null && this.f17025c.mo20108q() && (this.f17024b.mo20109r() || this.f17024b.mo20108q());
        }
    }

    /* renamed from: p6.c$b */
    public static abstract class C7678b extends C7676c {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C7678b(java.math.BigInteger r4) {
            /*
                r3 = this;
                w6.f r0 = p275w6.C8253b.f18087a
                int r0 = r4.bitLength()
                int r1 = r4.signum()
                if (r1 <= 0) goto L_0x002b
                r1 = 2
                if (r0 < r1) goto L_0x002b
                r2 = 3
                if (r0 >= r2) goto L_0x0021
                int r0 = r4.intValue()
                if (r0 == r1) goto L_0x001e
                if (r0 == r2) goto L_0x001b
                goto L_0x0021
            L_0x001b:
                w6.f r4 = p275w6.C8253b.f18088b
                goto L_0x0027
            L_0x001e:
                w6.f r4 = p275w6.C8253b.f18087a
                goto L_0x0027
            L_0x0021:
                w6.f r0 = new w6.f
                r0.<init>(r4)
                r4 = r0
            L_0x0027:
                r3.<init>(r4)
                return
            L_0x002b:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "'characteristic' must be >= 2"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p209p6.C7676c.C7678b.<init>(java.math.BigInteger):void");
        }

        /* renamed from: c */
        public final C7686e mo20074c(int i, BigInteger bigInteger) {
            C7681d b = mo20073b(bigInteger);
            C7681d o = b.mo20104m().mo20094c(this.f17024b).mo20101j(b).mo20094c(this.f17025c).mo20106o();
            if (o != null) {
                if (o.mo20110s() != (i == 1)) {
                    o = o.mo20102k();
                }
                return mo20078f(b, o, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }
    }

    /* renamed from: p6.c$c */
    public static class C7679c extends C7677a {

        /* renamed from: j */
        public int f17032j;

        /* renamed from: k */
        public int f17033k;

        /* renamed from: l */
        public int f17034l;

        /* renamed from: m */
        public int f17035m;

        /* renamed from: n */
        public C7686e.C7690d f17036n;

        public C7679c(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C7679c(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.f17032j = i;
            this.f17033k = i2;
            this.f17034l = i3;
            this.f17035m = i4;
            this.f17026d = bigInteger3;
            this.f17027e = bigInteger4;
            this.f17036n = new C7686e.C7690d(this, (C7681d) null, (C7681d) null, false);
            this.f17024b = mo20073b(bigInteger);
            this.f17025c = mo20073b(bigInteger2);
            this.f17028f = 6;
        }

        public C7679c(int i, int i2, int i3, int i4, C7681d dVar, C7681d dVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.f17032j = i;
            this.f17033k = i2;
            this.f17034l = i3;
            this.f17035m = i4;
            this.f17026d = bigInteger;
            this.f17027e = bigInteger2;
            this.f17036n = new C7686e.C7690d(this, (C7681d) null, (C7681d) null, false);
            this.f17024b = dVar;
            this.f17025c = dVar2;
            this.f17028f = 6;
        }

        public C7679c(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        /* renamed from: a */
        public final int mo20072a() {
            return this.f17032j;
        }

        /* renamed from: b */
        public final C7681d mo20073b(BigInteger bigInteger) {
            return new C7681d.C7684c(this.f17032j, this.f17033k, this.f17034l, this.f17035m, bigInteger);
        }

        /* renamed from: f */
        public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
            return new C7686e.C7690d(this, dVar, dVar2, z);
        }

        /* renamed from: g */
        public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
            return new C7686e.C7690d(this, dVar, dVar2, dVarArr, z);
        }

        /* renamed from: l */
        public final boolean mo20085l(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        /* renamed from: n */
        public final C7676c mo20087n() {
            return new C7679c(this.f17032j, this.f17033k, this.f17034l, this.f17035m, this.f17024b, this.f17025c, this.f17026d, this.f17027e);
        }

        /* renamed from: o */
        public final C3436p mo20088o() {
            return mo20091r() ? new C7704r() : C7676c.super.mo20088o();
        }

        /* renamed from: p */
        public final C7686e mo20089p() {
            return this.f17036n;
        }
    }

    /* renamed from: p6.c$d */
    public static class C7680d extends C7678b {

        /* renamed from: i */
        public BigInteger f17037i;

        /* renamed from: j */
        public BigInteger f17038j;

        /* renamed from: k */
        public C7686e.C7691e f17039k;

        public C7680d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f17037i = bigInteger;
            int bitLength = bigInteger.bitLength();
            this.f17038j = (bitLength < 96 || bigInteger.shiftRight(bitLength + -64).longValue() != -1) ? null : C7675b.f17019b.shiftLeft(bitLength).subtract(bigInteger);
            this.f17039k = new C7686e.C7691e(this, (C7681d) null, (C7681d) null, false);
            this.f17024b = mo20073b(bigInteger2);
            this.f17025c = mo20073b(bigInteger3);
            this.f17026d = bigInteger4;
            this.f17027e = bigInteger5;
            this.f17028f = 4;
        }

        public C7680d(BigInteger bigInteger, BigInteger bigInteger2, C7681d dVar, C7681d dVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f17037i = bigInteger;
            this.f17038j = bigInteger2;
            this.f17039k = new C7686e.C7691e(this, (C7681d) null, (C7681d) null, false);
            this.f17024b = dVar;
            this.f17025c = dVar2;
            this.f17026d = bigInteger3;
            this.f17027e = bigInteger4;
            this.f17028f = 4;
        }

        /* renamed from: a */
        public final int mo20072a() {
            return this.f17037i.bitLength();
        }

        /* renamed from: b */
        public final C7681d mo20073b(BigInteger bigInteger) {
            return new C7681d.C7685d(this.f17037i, this.f17038j, bigInteger);
        }

        /* renamed from: f */
        public final C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z) {
            return new C7686e.C7691e(this, dVar, dVar2, z);
        }

        /* renamed from: g */
        public final C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z) {
            return new C7686e.C7691e(this, dVar, dVar2, dVarArr, z);
        }

        /* renamed from: h */
        public final C7686e mo20080h(C7686e eVar) {
            int i;
            if (this == eVar.f17048a || this.f17028f != 2 || eVar.mo20141t() || ((i = eVar.f17048a.f17028f) != 2 && i != 3 && i != 4)) {
                return C7676c.super.mo20080h(eVar);
            }
            return new C7686e.C7691e(this, mo20073b(eVar.f17049b.mo20092a()), mo20073b(eVar.f17050c.mo20092a()), new C7681d[]{mo20073b(eVar.f17051d[0].mo20092a())}, eVar.f17052e);
        }

        /* renamed from: l */
        public final boolean mo20085l(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        /* renamed from: n */
        public final C7676c mo20087n() {
            return new C7680d(this.f17037i, this.f17038j, this.f17024b, this.f17025c, this.f17026d, this.f17027e);
        }

        /* renamed from: p */
        public final C7686e mo20089p() {
            return this.f17039k;
        }
    }

    public C7676c(C8252a aVar) {
        this.f17023a = aVar;
    }

    /* renamed from: a */
    public abstract int mo20072a();

    /* renamed from: b */
    public abstract C7681d mo20073b(BigInteger bigInteger);

    /* renamed from: c */
    public abstract C7686e mo20074c(int i, BigInteger bigInteger);

    /* renamed from: d */
    public final C7686e mo20075d(BigInteger bigInteger, BigInteger bigInteger2) {
        C7686e e = mo20076e(bigInteger, bigInteger2, false);
        if (e.mo20126f(false, true)) {
            return e;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    /* renamed from: e */
    public C7686e mo20076e(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return mo20078f(mo20073b(bigInteger), mo20073b(bigInteger2), z);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7676c) && mo20086m((C7676c) obj));
    }

    /* renamed from: f */
    public abstract C7686e mo20078f(C7681d dVar, C7681d dVar2, boolean z);

    /* renamed from: g */
    public abstract C7686e mo20079g(C7681d dVar, C7681d dVar2, C7681d[] dVarArr, boolean z);

    /* renamed from: h */
    public C7686e mo20080h(C7686e eVar) {
        if (this == eVar.f17048a) {
            return eVar;
        }
        if (eVar.mo20141t()) {
            return mo20089p();
        }
        C7686e s = eVar.mo20140s();
        return mo20076e(s.f17049b.mo20092a(), s.mo20138q().mo20092a(), s.f17052e);
    }

    public final int hashCode() {
        return (this.f17023a.hashCode() ^ Integer.rotateLeft(this.f17024b.mo20092a().hashCode(), 8)) ^ Integer.rotateLeft(this.f17025c.mo20092a().hashCode(), 16);
    }

    /* renamed from: i */
    public final C7686e mo20082i(byte[] bArr) {
        C7686e eVar;
        int a = (mo20072a() + 7) / 8;
        boolean z = false;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length == a + 1) {
                    eVar = mo20074c(b & 1, C8214b.m16507a(1, a, bArr));
                    if (!eVar.mo20126f(true, true)) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    StringBuilder h = C0072d.m201h("Invalid point encoding 0x");
                    h.append(Integer.toString(b, 16));
                    throw new IllegalArgumentException(h.toString());
                } else if (bArr.length == (a * 2) + 1) {
                    BigInteger a2 = C8214b.m16507a(1, a, bArr);
                    BigInteger a3 = C8214b.m16507a(a + 1, a, bArr);
                    boolean testBit = a3.testBit(0);
                    if (b == 7) {
                        z = true;
                    }
                    if (testBit == z) {
                        eVar = mo20075d(a2, a3);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (a * 2) + 1) {
                eVar = mo20075d(C8214b.m16507a(1, a, bArr), C8214b.m16507a(a + 1, a, bArr));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            eVar = mo20089p();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b == 0 || !eVar.mo20141t()) {
            return eVar;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    /* renamed from: j */
    public final C7695i mo20083j(C7686e eVar, String str, C7694h hVar) {
        Hashtable hashtable;
        C7695i a;
        if (eVar == null || this != eVar.f17048a) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
        synchronized (eVar) {
            hashtable = eVar.f17053f;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                eVar.f17053f = hashtable;
            }
        }
        synchronized (hashtable) {
            C7695i iVar = (C7695i) hashtable.get(str);
            a = hVar.mo20147a(iVar);
            if (a != iVar) {
                hashtable.put(str, a);
            }
        }
        return a;
    }

    /* renamed from: k */
    public final void mo20084k(C7686e[] eVarArr, int i, int i2, C7681d dVar) {
        if (i < 0 || i2 < 0 || i > eVarArr.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        int i3 = 0;
        while (i3 < i2) {
            C7686e eVar = eVarArr[i + i3];
            if (eVar == null || this == eVar.f17048a) {
                i3++;
            } else {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
        int i4 = this.f17028f;
        if (i4 != 0 && i4 != 5) {
            C7681d[] dVarArr = new C7681d[i2];
            int[] iArr = new int[i2];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                boolean z = true;
                if (i5 >= i2) {
                    break;
                }
                int i7 = i + i5;
                C7686e eVar2 = eVarArr[i7];
                if (eVar2 != null) {
                    if (dVar == null) {
                        int o = eVar2.mo20136o();
                        if (o != 0 && o != 5 && !eVar2.mo20141t() && !eVar2.f17051d[0].mo20108q()) {
                            z = false;
                        }
                        if (z) {
                        }
                    }
                    dVarArr[i6] = eVar2.mo20120a();
                    iArr[i6] = i7;
                    i6++;
                }
                i5++;
            }
            if (i6 != 0) {
                C7681d[] dVarArr2 = new C7681d[i6];
                dVarArr2[0] = dVarArr[0];
                int i8 = 0;
                while (true) {
                    i8++;
                    if (i8 >= i6) {
                        break;
                    }
                    dVarArr2[i8] = dVarArr2[i8 - 1].mo20101j(dVarArr[0 + i8]);
                }
                int i9 = i8 - 1;
                if (dVar != null) {
                    dVarArr2[i9] = dVarArr2[i9].mo20101j(dVar);
                }
                C7681d n = dVarArr2[i9].mo20105n();
                while (i9 > 0) {
                    int i10 = i9 - 1;
                    int i11 = i9 + 0;
                    C7681d dVar2 = dVarArr[i11];
                    dVarArr[i11] = dVarArr2[i10].mo20101j(n);
                    n = n.mo20101j(dVar2);
                    i9 = i10;
                }
                dVarArr[0] = n;
                for (int i12 = 0; i12 < i6; i12++) {
                    int i13 = iArr[i12];
                    eVarArr[i13] = eVarArr[i13].mo20122c(dVarArr[i12]);
                }
            }
        } else if (dVar != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }

    /* renamed from: l */
    public boolean mo20085l(int i) {
        return i == 0;
    }

    /* renamed from: m */
    public final boolean mo20086m(C7676c cVar) {
        return this == cVar || (cVar != null && this.f17023a.equals(cVar.f17023a) && this.f17024b.mo20092a().equals(cVar.f17024b.mo20092a()) && this.f17025c.mo20092a().equals(cVar.f17025c.mo20092a()));
    }

    /* renamed from: n */
    public abstract C7676c mo20087n();

    /* renamed from: o */
    public C3436p mo20088o() {
        C8039a aVar = this.f17029g;
        return aVar instanceof C8039a ? new C7692f(this, aVar) : new C7699m();
    }

    /* renamed from: p */
    public abstract C7686e mo20089p();
}
