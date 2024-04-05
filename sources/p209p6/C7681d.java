package p209p6;

import androidx.datastore.preferences.protobuf.C2606m;
import androidx.preference.C3039b;
import java.math.BigInteger;
import java.util.Random;
import p267v7.C8212a;
import p267v7.C8214b;

/* renamed from: p6.d */
public abstract class C7681d implements C7675b {

    /* renamed from: p6.d$a */
    public static abstract class C7682a extends C7681d {
        /* renamed from: u */
        public int mo20113u() {
            int f = mo20097f();
            C7681d dVar = this;
            C7681d dVar2 = dVar;
            for (int i = 1; i < f; i++) {
                dVar2 = dVar2.mo20104m();
                dVar = dVar.mo20094c(dVar2);
            }
            if (dVar.mo20109r()) {
                return 0;
            }
            if (dVar.mo20108q()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    /* renamed from: p6.d$b */
    public static abstract class C7683b extends C7681d {
    }

    /* renamed from: p6.d$c */
    public static class C7684c extends C7682a {

        /* renamed from: f */
        public int f17040f;

        /* renamed from: g */
        public int f17041g;

        /* renamed from: h */
        public int[] f17042h;

        /* renamed from: i */
        public C7693g f17043i;

        public C7684c(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.f17040f = 2;
                this.f17042h = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else if (i3 > 0) {
                this.f17040f = 3;
                this.f17042h = new int[]{i2, i3, i4};
            } else {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.f17041g = i;
            this.f17043i = new C7693g(bigInteger);
        }

        public C7684c(int i, C7693g gVar, int[] iArr) {
            this.f17041g = i;
            this.f17040f = iArr.length == 1 ? 2 : 3;
            this.f17042h = iArr;
            this.f17043i = gVar;
        }

        /* renamed from: v */
        public static void m14791v(C7681d dVar, C7681d dVar2) {
            if (!(dVar instanceof C7684c) || !(dVar2 instanceof C7684c)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            C7684c cVar = (C7684c) dVar;
            C7684c cVar2 = (C7684c) dVar2;
            if (cVar.f17040f != cVar2.f17040f) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            } else if (cVar.f17041g != cVar2.f17041g || !C8212a.m16501h(cVar.f17042h, cVar2.f17042h)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        /* renamed from: a */
        public final BigInteger mo20092a() {
            C7693g gVar = this.f17043i;
            int o = gVar.mo20159o();
            if (o == 0) {
                return C7675b.f17018a;
            }
            int i = o - 1;
            long j = gVar.f17061b[i];
            byte[] bArr = new byte[8];
            int i2 = 0;
            boolean z = false;
            for (int i3 = 7; i3 >= 0; i3--) {
                byte b = (byte) ((int) (j >>> (i3 * 8)));
                if (z || b != 0) {
                    bArr[i2] = b;
                    i2++;
                    z = true;
                }
            }
            byte[] bArr2 = new byte[((i * 8) + i2)];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i4] = bArr[i4];
            }
            for (int i5 = o - 2; i5 >= 0; i5--) {
                long j2 = gVar.f17061b[i5];
                int i6 = 7;
                while (i6 >= 0) {
                    bArr2[i2] = (byte) ((int) (j2 >>> (i6 * 8)));
                    i6--;
                    i2++;
                }
            }
            return new BigInteger(1, bArr2);
        }

        /* renamed from: b */
        public final C7681d mo20093b(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.f17041g;
            int[] iArr = this.f17042h;
            C7693g gVar = this.f17043i;
            int o = gVar.mo20159o();
            if (o != 0) {
                int i3 = ((i2 + 63) >>> 6) << 1;
                long[] jArr = new long[i3];
                System.arraycopy(gVar.f17061b, 0, jArr, 0, o);
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    int i4 = o << 1;
                    while (true) {
                        o--;
                        if (o < 0) {
                            break;
                        }
                        long j = jArr[o];
                        int i5 = i4 - 1;
                        jArr[i5] = C7693g.m14887q((int) (j >>> 32));
                        i4 = i5 - 1;
                        jArr[i4] = C7693g.m14887q((int) j);
                    }
                    o = C7693g.m14885k(jArr, i3, i2, iArr);
                }
                gVar = new C7693g(jArr, o);
            }
            return new C7684c(i2, gVar, iArr);
        }

        /* renamed from: c */
        public final C7681d mo20094c(C7681d dVar) {
            C7693g gVar = (C7693g) this.f17043i.clone();
            gVar.mo20154f(((C7684c) dVar).f17043i);
            return new C7684c(this.f17041g, gVar, this.f17042h);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: p6.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p209p6.C7681d mo20095d(p209p6.C7681d r11, p209p6.C7681d r12) {
            /*
                r10 = this;
                p6.g r0 = r10.f17043i
                p6.d$c r11 = (p209p6.C7681d.C7684c) r11
                p6.g r11 = r11.f17043i
                p6.d$c r12 = (p209p6.C7681d.C7684c) r12
                p6.g r12 = r12.f17043i
                int r1 = r0.mo20159o()
                r2 = 0
                if (r1 != 0) goto L_0x0013
                r4 = r0
                goto L_0x003b
            L_0x0013:
                int r1 = r1 << 1
                long[] r3 = new long[r1]
                r4 = r2
            L_0x0018:
                if (r4 >= r1) goto L_0x0036
                long[] r5 = r0.f17061b
                int r6 = r4 >>> 1
                r6 = r5[r6]
                int r5 = r4 + 1
                int r8 = (int) r6
                long r8 = p209p6.C7693g.m14887q(r8)
                r3[r4] = r8
                int r4 = r5 + 1
                r8 = 32
                long r6 = r6 >>> r8
                int r6 = (int) r6
                long r6 = p209p6.C7693g.m14887q(r6)
                r3[r5] = r6
                goto L_0x0018
            L_0x0036:
                p6.g r4 = new p6.g
                r4.<init>(r3, r1)
            L_0x003b:
                p6.g r11 = r11.mo20158m(r12)
                if (r4 != r0) goto L_0x0048
                java.lang.Object r12 = r4.clone()
                r4 = r12
                p6.g r4 = (p209p6.C7693g) r4
            L_0x0048:
                r4.mo20154f(r11)
                int r11 = r10.f17041g
                int[] r12 = r10.f17042h
                long[] r0 = r4.f17061b
                int r1 = r0.length
                int r11 = p209p6.C7693g.m14885k(r0, r1, r11, r12)
                int r12 = r0.length
                if (r11 >= r12) goto L_0x0060
                long[] r12 = new long[r11]
                r4.f17061b = r12
                java.lang.System.arraycopy(r0, r2, r12, r2, r11)
            L_0x0060:
                p6.d$c r11 = new p6.d$c
                int r12 = r10.f17041g
                int[] r0 = r10.f17042h
                r11.<init>(r12, r4, r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p209p6.C7681d.C7684c.mo20095d(p6.d, p6.d):p6.d");
        }

        /* renamed from: e */
        public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
            return mo20099h(dVar, dVar2, dVar3);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7684c)) {
                return false;
            }
            C7684c cVar = (C7684c) obj;
            return this.f17041g == cVar.f17041g && this.f17040f == cVar.f17040f && C8212a.m16501h(this.f17042h, cVar.f17042h) && this.f17043i.equals(cVar.f17043i);
        }

        /* renamed from: f */
        public final int mo20097f() {
            return this.f17041g;
        }

        /* renamed from: g */
        public final C7681d mo20098g(C7681d dVar) {
            return mo20094c(dVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: p6.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p209p6.C7681d mo20099h(p209p6.C7681d r3, p209p6.C7681d r4, p209p6.C7681d r5) {
            /*
                r2 = this;
                p6.g r0 = r2.f17043i
                p6.d$c r3 = (p209p6.C7681d.C7684c) r3
                p6.g r3 = r3.f17043i
                p6.d$c r4 = (p209p6.C7681d.C7684c) r4
                p6.g r4 = r4.f17043i
                p6.d$c r5 = (p209p6.C7681d.C7684c) r5
                p6.g r5 = r5.f17043i
                p6.g r1 = r0.mo20158m(r3)
                p6.g r4 = r4.mo20158m(r5)
                if (r1 == r0) goto L_0x001a
                if (r1 != r3) goto L_0x0021
            L_0x001a:
                java.lang.Object r3 = r1.clone()
                r1 = r3
                p6.g r1 = (p209p6.C7693g) r1
            L_0x0021:
                r1.mo20154f(r4)
                int r3 = r2.f17041g
                int[] r4 = r2.f17042h
                long[] r5 = r1.f17061b
                int r0 = r5.length
                int r3 = p209p6.C7693g.m14885k(r5, r0, r3, r4)
                int r4 = r5.length
                if (r3 >= r4) goto L_0x003a
                long[] r4 = new long[r3]
                r1.f17061b = r4
                r0 = 0
                java.lang.System.arraycopy(r5, r0, r4, r0, r3)
            L_0x003a:
                p6.d$c r3 = new p6.d$c
                int r4 = r2.f17041g
                int[] r5 = r2.f17042h
                r3.<init>(r4, r1, r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p209p6.C7681d.C7684c.mo20099h(p6.d, p6.d, p6.d):p6.d");
        }

        public final int hashCode() {
            return (this.f17043i.hashCode() ^ this.f17041g) ^ C8212a.m16496c(this.f17042h);
        }

        /* renamed from: i */
        public final C7681d mo20100i() {
            C7693g gVar;
            int i = this.f17041g;
            int[] iArr = this.f17042h;
            C7693g gVar2 = this.f17043i;
            if (gVar2.f17061b.length == 0) {
                gVar = new C7693g(new long[]{1});
            } else {
                int max = Math.max(1, gVar2.mo20159o());
                long[] jArr = new long[max];
                long[] jArr2 = gVar2.f17061b;
                System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, max));
                jArr[0] = jArr[0] ^ 1;
                gVar = new C7693g(jArr);
            }
            return new C7684c(i, gVar, iArr);
        }

        /* renamed from: j */
        public final C7681d mo20101j(C7681d dVar) {
            long[] jArr;
            int i;
            long[] jArr2;
            int i2;
            int[] iArr;
            int i3;
            int i4 = this.f17041g;
            int[] iArr2 = this.f17042h;
            C7693g gVar = this.f17043i;
            C7693g gVar2 = ((C7684c) dVar).f17043i;
            int p = gVar.mo20160p();
            if (p != 0) {
                int p2 = gVar2.mo20160p();
                if (p2 != 0) {
                    if (p > p2) {
                        int i5 = p2;
                        p2 = p;
                        p = i5;
                    } else {
                        C7693g gVar3 = gVar2;
                        gVar2 = gVar;
                        gVar = gVar3;
                    }
                    int i6 = (p + 63) >>> 6;
                    int i7 = (p2 + 63) >>> 6;
                    int i8 = ((p + p2) + 62) >>> 6;
                    if (i6 == 1) {
                        long j = gVar2.f17061b[0];
                        if (j != 1) {
                            long[] jArr3 = new long[i8];
                            C7693g.m14883d(j, gVar.f17061b, i7, jArr3);
                            gVar = new C7693g(jArr3, C7693g.m14885k(jArr3, i8, i4, iArr2));
                        }
                    } else {
                        int i9 = ((p2 + 7) + 63) >>> 6;
                        int i10 = 16;
                        int[] iArr3 = new int[16];
                        int i11 = i9 << 4;
                        long[] jArr4 = new long[i11];
                        iArr3[1] = i9;
                        System.arraycopy(gVar.f17061b, 0, jArr4, i9, i7);
                        int i12 = 2;
                        int i13 = i9;
                        while (i12 < i10) {
                            i13 += i9;
                            iArr3[i12] = i13;
                            if ((i12 & 1) == 0) {
                                jArr2 = jArr4;
                                i3 = i11;
                                iArr = iArr3;
                                i2 = i10;
                                C7693g.m14884i(jArr4, i13 >>> 1, jArr2, i13, i9, 1);
                            } else {
                                jArr2 = jArr4;
                                i3 = i11;
                                iArr = iArr3;
                                i2 = i10;
                                int i14 = i13 - i9;
                                for (int i15 = 0; i15 < i9; i15++) {
                                    jArr2[i13 + i15] = jArr2[i9 + i15] ^ jArr2[i14 + i15];
                                }
                            }
                            i12++;
                            i11 = i3;
                            iArr3 = iArr;
                            i10 = i2;
                            jArr4 = jArr2;
                        }
                        long[] jArr5 = jArr4;
                        int i16 = i11;
                        int[] iArr4 = iArr3;
                        long[] jArr6 = new long[i16];
                        C7693g.m14884i(jArr5, 0, jArr6, 0, i16, 4);
                        long[] jArr7 = gVar2.f17061b;
                        int i17 = i8 << 3;
                        long[] jArr8 = new long[i17];
                        int i18 = 0;
                        while (i18 < i6) {
                            long j2 = jArr7[i18];
                            int i19 = i18;
                            while (true) {
                                long j3 = j2 >>> 4;
                                jArr = jArr7;
                                int i20 = iArr4[((int) j2) & 15];
                                int i21 = iArr4[((int) j3) & 15];
                                i = i6;
                                for (int i22 = 0; i22 < i9; i22++) {
                                    int i23 = i19 + i22;
                                    jArr8[i23] = jArr8[i23] ^ (jArr5[i20 + i22] ^ jArr6[i21 + i22]);
                                }
                                j2 = j3 >>> 4;
                                if (j2 == 0) {
                                    break;
                                }
                                i19 += i8;
                                jArr7 = jArr;
                                i6 = i;
                            }
                            i18++;
                            jArr7 = jArr;
                            i6 = i;
                        }
                        while (true) {
                            i17 -= i8;
                            if (i17 == 0) {
                                break;
                            }
                            C7693g.m14886l(jArr8, i17 - i8, jArr8, i17, i8, 8);
                            jArr8 = jArr8;
                        }
                        long[] jArr9 = jArr8;
                        gVar2 = new C7693g(jArr9, C7693g.m14885k(jArr9, i8, i4, iArr2));
                    }
                }
                gVar = gVar2;
            }
            return new C7684c(i4, gVar, iArr2);
        }

        /* renamed from: k */
        public final C7681d mo20102k() {
            return this;
        }

        /* renamed from: l */
        public final C7681d mo20103l(C7681d dVar) {
            return mo20101j(dVar.mo20105n());
        }

        /* renamed from: m */
        public final C7681d mo20104m() {
            int i = this.f17041g;
            int[] iArr = this.f17042h;
            C7693g gVar = this.f17043i;
            int o = gVar.mo20159o();
            if (o != 0) {
                int i2 = o << 1;
                long[] jArr = new long[i2];
                int i3 = 0;
                while (i3 < i2) {
                    long j = gVar.f17061b[i3 >>> 1];
                    int i4 = i3 + 1;
                    jArr[i3] = C7693g.m14887q((int) j);
                    i3 = i4 + 1;
                    jArr[i4] = C7693g.m14887q((int) (j >>> 32));
                }
                gVar = new C7693g(jArr, C7693g.m14885k(jArr, i2, i, iArr));
            }
            return new C7684c(i, gVar, iArr);
        }

        /* renamed from: n */
        public final C7681d mo20105n() {
            int i;
            int i2;
            int i3 = this.f17041g;
            int[] iArr = this.f17042h;
            C7693g gVar = this.f17043i;
            int p = gVar.mo20160p();
            if (p != 0) {
                int i4 = 1;
                if (p != 1) {
                    C7693g gVar2 = (C7693g) gVar.clone();
                    int i5 = (i3 + 63) >>> 6;
                    C7693g gVar3 = new C7693g(i5);
                    long[] jArr = gVar3.f17061b;
                    int i6 = (i3 >>> 6) + 0;
                    jArr[i6] = (1 << (i3 & 63)) ^ jArr[i6];
                    int i7 = i3 - i3;
                    int length = iArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        }
                        int i8 = iArr[length] + i7;
                        int i9 = (i8 >>> 6) + 0;
                        jArr[i9] = (1 << (i8 & 63)) ^ jArr[i9];
                    }
                    int i10 = (i7 >>> 6) + 0;
                    jArr[i10] = (1 << (i7 & 63)) ^ jArr[i10];
                    C7693g gVar4 = new C7693g(i5);
                    gVar4.f17061b[0] = 1;
                    int i11 = i3 + 1;
                    int[] iArr2 = {p, i11};
                    C7693g[] gVarArr = {gVar2, gVar3};
                    int[] iArr3 = {1, 0};
                    C7693g[] gVarArr2 = {gVar4, new C7693g(i5)};
                    int i12 = iArr3[1];
                    int i13 = i11 - p;
                    while (true) {
                        if (i13 < 0) {
                            i13 = -i13;
                            iArr2[i4] = i11;
                            iArr3[i4] = i12;
                            i4 = 1 - i4;
                            i11 = iArr2[i4];
                            i12 = iArr3[i4];
                        }
                        i = 1 - i4;
                        gVarArr[i4].mo20155h(gVarArr[i], iArr2[i], i13);
                        C7693g gVar5 = gVarArr[i4];
                        int i14 = (i11 + 62) >>> 6;
                        while (true) {
                            if (i14 != 0) {
                                i14--;
                                long j = gVar5.f17061b[i14];
                                if (j != 0) {
                                    i2 = C7693g.m14880a(j) + (i14 << 6);
                                    break;
                                }
                            } else {
                                gVar5.getClass();
                                i2 = 0;
                                break;
                            }
                        }
                        if (i2 == 0) {
                            break;
                        }
                        int i15 = iArr3[i];
                        gVarArr2[i4].mo20155h(gVarArr2[i], i15, i13);
                        int i16 = i15 + i13;
                        if (i16 <= i12) {
                            if (i16 == i12) {
                                C7693g gVar6 = gVarArr2[i4];
                                int i17 = (i12 + 62) >>> 6;
                                while (true) {
                                    if (i17 != 0) {
                                        i17--;
                                        long j2 = gVar6.f17061b[i17];
                                        if (j2 != 0) {
                                            i16 = C7693g.m14880a(j2) + (i17 << 6);
                                            break;
                                        }
                                    } else {
                                        gVar6.getClass();
                                        i16 = 0;
                                        break;
                                    }
                                }
                            } else {
                                i13 += i2 - i11;
                                i11 = i2;
                            }
                        }
                        i12 = i16;
                        i13 += i2 - i11;
                        i11 = i2;
                    }
                    gVar = gVarArr2[i];
                }
                return new C7684c(i3, gVar, iArr);
            }
            throw new IllegalStateException();
        }

        /* renamed from: o */
        public final C7681d mo20106o() {
            long[] jArr = this.f17043i.f17061b;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= jArr.length) {
                    z = true;
                    break;
                } else if (jArr[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            return (z || this.f17043i.mo20157j()) ? this : mo20093b(this.f17041g - 1);
        }

        /* renamed from: p */
        public final int mo20107p() {
            return this.f17043i.mo20160p();
        }

        /* renamed from: q */
        public final boolean mo20108q() {
            return this.f17043i.mo20157j();
        }

        /* renamed from: r */
        public final boolean mo20109r() {
            long[] jArr = this.f17043i.f17061b;
            for (long j : jArr) {
                if (j != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: s */
        public final boolean mo20110s() {
            long[] jArr = this.f17043i.f17061b;
            return jArr.length > 0 && (1 & jArr[0]) != 0;
        }
    }

    /* renamed from: p6.d$d */
    public static class C7685d extends C7683b {

        /* renamed from: f */
        public BigInteger f17044f;

        /* renamed from: g */
        public BigInteger f17045g;

        /* renamed from: h */
        public BigInteger f17046h;

        public C7685d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f17044f = bigInteger;
            this.f17045g = bigInteger2;
            this.f17046h = bigInteger3;
        }

        /* renamed from: a */
        public final BigInteger mo20092a() {
            return this.f17046h;
        }

        /* renamed from: c */
        public final C7681d mo20094c(C7681d dVar) {
            BigInteger bigInteger = this.f17044f;
            BigInteger bigInteger2 = this.f17045g;
            BigInteger add = this.f17046h.add(dVar.mo20092a());
            if (add.compareTo(this.f17044f) >= 0) {
                add = add.subtract(this.f17044f);
            }
            return new C7685d(bigInteger, bigInteger2, add);
        }

        /* renamed from: d */
        public final C7681d mo20095d(C7681d dVar, C7681d dVar2) {
            BigInteger bigInteger = this.f17046h;
            BigInteger a = dVar.mo20092a();
            BigInteger a2 = dVar2.mo20092a();
            return new C7685d(this.f17044f, this.f17045g, mo20119v(bigInteger.multiply(bigInteger).add(a.multiply(a2))));
        }

        /* renamed from: e */
        public final C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
            BigInteger bigInteger = this.f17046h;
            BigInteger a = dVar.mo20092a();
            BigInteger a2 = dVar2.mo20092a();
            BigInteger a3 = dVar3.mo20092a();
            return new C7685d(this.f17044f, this.f17045g, mo20119v(bigInteger.multiply(a).subtract(a2.multiply(a3))));
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7685d)) {
                return false;
            }
            C7685d dVar = (C7685d) obj;
            return this.f17044f.equals(dVar.f17044f) && this.f17046h.equals(dVar.f17046h);
        }

        /* renamed from: f */
        public final int mo20097f() {
            return this.f17044f.bitLength();
        }

        /* renamed from: g */
        public final C7681d mo20098g(C7681d dVar) {
            BigInteger bigInteger = this.f17044f;
            BigInteger bigInteger2 = this.f17045g;
            BigInteger subtract = this.f17046h.subtract(dVar.mo20092a());
            if (subtract.signum() < 0) {
                subtract = subtract.add(this.f17044f);
            }
            return new C7685d(bigInteger, bigInteger2, subtract);
        }

        /* renamed from: h */
        public final C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
            BigInteger bigInteger = this.f17046h;
            BigInteger a = dVar.mo20092a();
            BigInteger a2 = dVar2.mo20092a();
            BigInteger a3 = dVar3.mo20092a();
            return new C7685d(this.f17044f, this.f17045g, mo20119v(bigInteger.multiply(a).add(a2.multiply(a3))));
        }

        public final int hashCode() {
            return this.f17044f.hashCode() ^ this.f17046h.hashCode();
        }

        /* renamed from: i */
        public final C7681d mo20100i() {
            BigInteger add = this.f17046h.add(C7675b.f17019b);
            if (add.compareTo(this.f17044f) == 0) {
                add = C7675b.f17018a;
            }
            return new C7685d(this.f17044f, this.f17045g, add);
        }

        /* renamed from: j */
        public final C7681d mo20101j(C7681d dVar) {
            return new C7685d(this.f17044f, this.f17045g, mo20118u(this.f17046h, dVar.mo20092a()));
        }

        /* renamed from: k */
        public final C7681d mo20102k() {
            if (this.f17046h.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f17044f;
            return new C7685d(bigInteger, this.f17045g, bigInteger.subtract(this.f17046h));
        }

        /* renamed from: l */
        public final C7681d mo20103l(C7681d dVar) {
            BigInteger bigInteger = this.f17044f;
            BigInteger bigInteger2 = this.f17045g;
            BigInteger bigInteger3 = this.f17046h;
            BigInteger a = dVar.mo20092a();
            int f = mo20097f();
            int i = (f + 31) >> 5;
            int[] r = C2606m.m6152r(f, this.f17044f);
            int[] r2 = C2606m.m6152r(f, a);
            int[] iArr = new int[i];
            C3039b.m7135D(r, r2, iArr);
            return new C7685d(bigInteger, bigInteger2, mo20118u(bigInteger3, C2606m.m6137c0(i, iArr)));
        }

        /* renamed from: m */
        public final C7681d mo20104m() {
            BigInteger bigInteger = this.f17044f;
            BigInteger bigInteger2 = this.f17045g;
            BigInteger bigInteger3 = this.f17046h;
            return new C7685d(bigInteger, bigInteger2, mo20118u(bigInteger3, bigInteger3));
        }

        /* renamed from: n */
        public final C7681d mo20105n() {
            BigInteger bigInteger = this.f17044f;
            BigInteger bigInteger2 = this.f17045g;
            BigInteger bigInteger3 = this.f17046h;
            int f = mo20097f();
            int i = (f + 31) >> 5;
            int[] r = C2606m.m6152r(f, this.f17044f);
            int[] r2 = C2606m.m6152r(f, bigInteger3);
            int[] iArr = new int[i];
            C3039b.m7135D(r, r2, iArr);
            return new C7685d(bigInteger, bigInteger2, C2606m.m6137c0(i, iArr));
        }

        /* renamed from: o */
        public final C7681d mo20106o() {
            BigInteger bigInteger;
            int i;
            boolean z;
            Object obj;
            BigInteger bigInteger2;
            if (mo20109r() || mo20108q()) {
                return this;
            }
            boolean z2 = false;
            if (this.f17044f.testBit(0)) {
                int i2 = 1;
                Object obj2 = null;
                if (this.f17044f.testBit(1)) {
                    BigInteger add = this.f17044f.shiftRight(2).add(C7675b.f17019b);
                    BigInteger bigInteger3 = this.f17044f;
                    C7685d dVar = new C7685d(bigInteger3, this.f17045g, this.f17046h.modPow(add, bigInteger3));
                    if (dVar.mo20104m().equals(this)) {
                        return dVar;
                    }
                    return null;
                } else if (this.f17044f.testBit(2)) {
                    BigInteger modPow = this.f17046h.modPow(this.f17044f.shiftRight(3), this.f17044f);
                    BigInteger u = mo20118u(modPow, this.f17046h);
                    if (mo20118u(u, modPow).equals(C7675b.f17019b)) {
                        C7685d dVar2 = new C7685d(this.f17044f, this.f17045g, u);
                        if (dVar2.mo20104m().equals(this)) {
                            return dVar2;
                        }
                        return null;
                    }
                    C7685d dVar3 = new C7685d(this.f17044f, this.f17045g, mo20119v(u.multiply(C7675b.f17020c.modPow(this.f17044f.shiftRight(2), this.f17044f))));
                    if (dVar3.mo20104m().equals(this)) {
                        return dVar3;
                    }
                    return null;
                } else {
                    BigInteger shiftRight = this.f17044f.shiftRight(1);
                    BigInteger modPow2 = this.f17046h.modPow(shiftRight, this.f17044f);
                    BigInteger bigInteger4 = C7675b.f17019b;
                    if (!modPow2.equals(bigInteger4)) {
                        return null;
                    }
                    BigInteger bigInteger5 = this.f17046h;
                    BigInteger shiftLeft = bigInteger5.shiftLeft(1);
                    if (shiftLeft.compareTo(this.f17044f) >= 0) {
                        shiftLeft = shiftLeft.subtract(this.f17044f);
                    }
                    BigInteger shiftLeft2 = shiftLeft.shiftLeft(1);
                    if (shiftLeft2.compareTo(this.f17044f) >= 0) {
                        shiftLeft2 = shiftLeft2.subtract(this.f17044f);
                    }
                    BigInteger add2 = shiftRight.add(bigInteger4);
                    BigInteger subtract = this.f17044f.subtract(bigInteger4);
                    Random random = new Random();
                    while (true) {
                        BigInteger bigInteger6 = new BigInteger(this.f17044f.bitLength(), random);
                        if (bigInteger6.compareTo(this.f17044f) >= 0 || !mo20119v(bigInteger6.multiply(bigInteger6).subtract(shiftLeft2)).modPow(shiftRight, this.f17044f).equals(subtract)) {
                            bigInteger = shiftRight;
                            i = i2;
                            obj = obj2;
                            z = z2;
                        } else {
                            int bitLength = add2.bitLength();
                            int lowestSetBit = add2.getLowestSetBit();
                            BigInteger bigInteger7 = C7675b.f17019b;
                            int i3 = bitLength - i2;
                            BigInteger bigInteger8 = bigInteger6;
                            BigInteger bigInteger9 = bigInteger7;
                            BigInteger bigInteger10 = C7675b.f17020c;
                            BigInteger bigInteger11 = bigInteger9;
                            while (i3 >= lowestSetBit + 1) {
                                bigInteger7 = mo20118u(bigInteger7, bigInteger11);
                                if (add2.testBit(i3)) {
                                    BigInteger u2 = mo20118u(bigInteger7, bigInteger5);
                                    BigInteger u3 = mo20118u(bigInteger9, bigInteger8);
                                    bigInteger10 = mo20119v(bigInteger8.multiply(bigInteger10).subtract(bigInteger6.multiply(bigInteger7)));
                                    bigInteger2 = shiftRight;
                                    bigInteger8 = mo20119v(bigInteger8.multiply(bigInteger8).subtract(u2.shiftLeft(1)));
                                    bigInteger9 = u3;
                                    bigInteger11 = u2;
                                } else {
                                    bigInteger2 = shiftRight;
                                    BigInteger v = mo20119v(bigInteger9.multiply(bigInteger10).subtract(bigInteger7));
                                    bigInteger8 = mo20119v(bigInteger8.multiply(bigInteger10).subtract(bigInteger6.multiply(bigInteger7)));
                                    bigInteger9 = v;
                                    bigInteger10 = mo20119v(bigInteger10.multiply(bigInteger10).subtract(bigInteger7.shiftLeft(1)));
                                    bigInteger11 = bigInteger7;
                                }
                                i3--;
                                shiftRight = bigInteger2;
                            }
                            bigInteger = shiftRight;
                            BigInteger u4 = mo20118u(bigInteger7, bigInteger11);
                            BigInteger u5 = mo20118u(u4, bigInteger5);
                            BigInteger v2 = mo20119v(bigInteger9.multiply(bigInteger10).subtract(u4));
                            BigInteger v3 = mo20119v(bigInteger8.multiply(bigInteger10).subtract(bigInteger6.multiply(u4)));
                            BigInteger v4 = mo20119v(u4.multiply(u5));
                            for (int i4 = 1; i4 <= lowestSetBit; i4++) {
                                v2 = mo20118u(v2, v3);
                                v3 = mo20119v(v3.multiply(v3).subtract(v4.shiftLeft(1)));
                                v4 = mo20119v(v4.multiply(v4));
                            }
                            if (mo20118u(v3, v3).equals(shiftLeft2)) {
                                BigInteger bigInteger12 = this.f17044f;
                                BigInteger bigInteger13 = this.f17045g;
                                if (v3.testBit(0)) {
                                    v3 = this.f17044f.subtract(v3);
                                }
                                return new C7685d(bigInteger12, bigInteger13, v3.shiftRight(1));
                            }
                            z = false;
                            i = 1;
                            if (!v2.equals(C7675b.f17019b) && !v2.equals(subtract)) {
                                return null;
                            }
                            obj = null;
                        }
                        z2 = z;
                        i2 = i;
                        obj2 = obj;
                        shiftRight = bigInteger;
                    }
                }
            } else {
                throw new RuntimeException("not done yet");
            }
        }

        /* renamed from: u */
        public final BigInteger mo20118u(BigInteger bigInteger, BigInteger bigInteger2) {
            return mo20119v(bigInteger.multiply(bigInteger2));
        }

        /* renamed from: v */
        public final BigInteger mo20119v(BigInteger bigInteger) {
            if (this.f17045g == null) {
                return bigInteger.mod(this.f17044f);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.f17044f.bitLength();
            boolean equals = this.f17045g.equals(C7675b.f17019b);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.f17045g);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.f17044f) >= 0) {
                bigInteger = bigInteger.subtract(this.f17044f);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.f17044f.subtract(bigInteger);
        }
    }

    /* renamed from: a */
    public abstract BigInteger mo20092a();

    /* renamed from: b */
    public C7681d mo20093b(int i) {
        C7681d dVar = this;
        for (int i2 = 0; i2 < i; i2++) {
            dVar = dVar.mo20104m();
        }
        return dVar;
    }

    /* renamed from: c */
    public abstract C7681d mo20094c(C7681d dVar);

    /* renamed from: d */
    public C7681d mo20095d(C7681d dVar, C7681d dVar2) {
        return mo20104m().mo20094c(dVar.mo20101j(dVar2));
    }

    /* renamed from: e */
    public C7681d mo20096e(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20101j(dVar).mo20098g(dVar2.mo20101j(dVar3));
    }

    /* renamed from: f */
    public abstract int mo20097f();

    /* renamed from: g */
    public abstract C7681d mo20098g(C7681d dVar);

    /* renamed from: h */
    public C7681d mo20099h(C7681d dVar, C7681d dVar2, C7681d dVar3) {
        return mo20101j(dVar).mo20094c(dVar2.mo20101j(dVar3));
    }

    /* renamed from: i */
    public abstract C7681d mo20100i();

    /* renamed from: j */
    public abstract C7681d mo20101j(C7681d dVar);

    /* renamed from: k */
    public abstract C7681d mo20102k();

    /* renamed from: l */
    public abstract C7681d mo20103l(C7681d dVar);

    /* renamed from: m */
    public abstract C7681d mo20104m();

    /* renamed from: n */
    public abstract C7681d mo20105n();

    /* renamed from: o */
    public abstract C7681d mo20106o();

    /* renamed from: p */
    public int mo20107p() {
        return mo20092a().bitLength();
    }

    /* renamed from: q */
    public boolean mo20108q() {
        return mo20107p() == 1;
    }

    /* renamed from: r */
    public boolean mo20109r() {
        return mo20092a().signum() == 0;
    }

    /* renamed from: s */
    public boolean mo20110s() {
        return mo20092a().testBit(0);
    }

    /* renamed from: t */
    public final byte[] mo20111t() {
        return C8214b.m16508b((mo20097f() + 7) / 8, mo20092a());
    }

    public final String toString() {
        return mo20092a().toString(16);
    }
}
