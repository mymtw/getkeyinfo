package p701wh;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import p003a2.C0023f;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p513bj.C14077r;
import p701wh.C18670a;

/* renamed from: wh.b */
public final class C18673b {

    /* renamed from: a */
    public static final byte[] f41290a = C14049b0.m21652y("OpusHead");

    /* renamed from: wh.b$a */
    public static final class C18674a {

        /* renamed from: a */
        public final int f41291a;

        /* renamed from: b */
        public int f41292b;

        /* renamed from: c */
        public int f41293c;

        /* renamed from: d */
        public long f41294d;

        /* renamed from: e */
        public final boolean f41295e;

        /* renamed from: f */
        public final C14077r f41296f;

        /* renamed from: g */
        public final C14077r f41297g;

        /* renamed from: h */
        public int f41298h;

        /* renamed from: i */
        public int f41299i;

        public C18674a(C14077r rVar, C14077r rVar2, boolean z) {
            this.f41297g = rVar;
            this.f41296f = rVar2;
            this.f41295e = z;
            rVar2.mo46935z(12);
            this.f41291a = rVar2.mo46928s();
            rVar.mo46935z(12);
            this.f41299i = rVar.mo46928s();
            C14075p.m21695g(rVar.mo46912c() != 1 ? false : true, "first_chunk must be 1");
            this.f41292b = -1;
        }

        /* renamed from: a */
        public final boolean mo70185a() {
            int i = this.f41292b + 1;
            this.f41292b = i;
            if (i == this.f41291a) {
                return false;
            }
            this.f41294d = this.f41295e ? this.f41296f.mo46929t() : this.f41296f.mo46926q();
            if (this.f41292b == this.f41298h) {
                this.f41293c = this.f41297g.mo46928s();
                this.f41297g.mo46909A(4);
                int i2 = this.f41299i - 1;
                this.f41299i = i2;
                this.f41298h = i2 > 0 ? this.f41297g.mo46928s() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: wh.b$b */
    public interface C18675b {
        /* renamed from: a */
        int mo70186a();

        /* renamed from: b */
        int mo70187b();

        /* renamed from: c */
        int mo70188c();
    }

    /* renamed from: wh.b$c */
    public static final class C18676c implements C18675b {

        /* renamed from: a */
        public final int f41300a;

        /* renamed from: b */
        public final int f41301b;

        /* renamed from: c */
        public final C14077r f41302c;

        public C18676c(C18670a.C18672b bVar, Format format) {
            C14077r rVar = bVar.f41289b;
            this.f41302c = rVar;
            rVar.mo46935z(12);
            int s = rVar.mo46928s();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int t = C14049b0.m21647t(format.pcmEncoding, format.channelCount);
                if (s == 0 || s % t != 0) {
                    Log.w("AtomParsers", C0023f.m107h(88, "Audio sample size mismatch. stsd sample size: ", t, ", stsz sample size: ", s));
                    s = t;
                }
            }
            this.f41300a = s == 0 ? -1 : s;
            this.f41301b = rVar.mo46928s();
        }

        /* renamed from: a */
        public final int mo70186a() {
            int i = this.f41300a;
            return i == -1 ? this.f41302c.mo46928s() : i;
        }

        /* renamed from: b */
        public final int mo70187b() {
            return this.f41300a;
        }

        /* renamed from: c */
        public final int mo70188c() {
            return this.f41301b;
        }
    }

    /* renamed from: wh.b$d */
    public static final class C18677d implements C18675b {

        /* renamed from: a */
        public final C14077r f41303a;

        /* renamed from: b */
        public final int f41304b;

        /* renamed from: c */
        public final int f41305c;

        /* renamed from: d */
        public int f41306d;

        /* renamed from: e */
        public int f41307e;

        public C18677d(C18670a.C18672b bVar) {
            C14077r rVar = bVar.f41289b;
            this.f41303a = rVar;
            rVar.mo46935z(12);
            this.f41305c = rVar.mo46928s() & 255;
            this.f41304b = rVar.mo46928s();
        }

        /* renamed from: a */
        public final int mo70186a() {
            int i = this.f41305c;
            if (i == 8) {
                return this.f41303a.mo46925p();
            }
            if (i == 16) {
                return this.f41303a.mo46930u();
            }
            int i2 = this.f41306d;
            this.f41306d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f41307e & 15;
            }
            int p = this.f41303a.mo46925p();
            this.f41307e = p;
            return (p & 240) >> 4;
        }

        /* renamed from: b */
        public final int mo70187b() {
            return -1;
        }

        /* renamed from: c */
        public final int mo70188c() {
            return this.f41304b;
        }
    }

    /* renamed from: a */
    public static Pair m31501a(int i, C14077r rVar) {
        rVar.mo46935z(i + 8 + 4);
        rVar.mo46909A(1);
        m31502b(rVar);
        rVar.mo46909A(2);
        int p = rVar.mo46925p();
        if ((p & 128) != 0) {
            rVar.mo46909A(2);
        }
        if ((p & 64) != 0) {
            rVar.mo46909A(rVar.mo46930u());
        }
        if ((p & 32) != 0) {
            rVar.mo46909A(2);
        }
        rVar.mo46909A(1);
        m31502b(rVar);
        String e = C14065m.m21675e(rVar.mo46925p());
        if ("audio/mpeg".equals(e) || "audio/vnd.dts".equals(e) || "audio/vnd.dts.hd".equals(e)) {
            return Pair.create(e, (Object) null);
        }
        rVar.mo46909A(12);
        rVar.mo46909A(1);
        int b = m31502b(rVar);
        byte[] bArr = new byte[b];
        rVar.mo46911b(0, b, bArr);
        return Pair.create(e, bArr);
    }

    /* renamed from: b */
    public static int m31502b(C14077r rVar) {
        int p = rVar.mo46925p();
        int i = p & 127;
        while ((p & 128) == 128) {
            p = rVar.mo46925p();
            i = (i << 7) | (p & 127);
        }
        return i;
    }

    /* renamed from: c */
    public static Pair<Integer, C18693m> m31503c(C14077r rVar, int i, int i2) {
        Pair<Integer, C18693m> pair;
        Integer num;
        C18693m mVar;
        int i3;
        int i4;
        byte[] bArr;
        C14077r rVar2 = rVar;
        int i5 = rVar2.f30987b;
        while (i5 - i < i2) {
            rVar2.mo46935z(i5);
            int c = rVar.mo46912c();
            C14075p.m21695g(c > 0, "childAtomSize should be positive");
            if (rVar.mo46912c() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < c) {
                    rVar2.mo46935z(i6);
                    int c2 = rVar.mo46912c();
                    int c3 = rVar.mo46912c();
                    if (c3 == 1718775137) {
                        num2 = Integer.valueOf(rVar.mo46912c());
                    } else if (c3 == 1935894637) {
                        rVar2.mo46909A(4);
                        str = rVar2.mo46922m(4);
                    } else if (c3 == 1935894633) {
                        i8 = i6;
                        i7 = c2;
                    }
                    i6 += c2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C14075p.m21697i(num2, "frma atom is mandatory");
                    C14075p.m21695g(i8 != -1, "schi atom is mandatory");
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num2;
                            mVar = null;
                            break;
                        }
                        rVar2.mo46935z(i9);
                        int c4 = rVar.mo46912c();
                        if (rVar.mo46912c() == 1952804451) {
                            int c5 = (rVar.mo46912c() >> 24) & 255;
                            rVar2.mo46909A(1);
                            if (c5 == 0) {
                                rVar2.mo46909A(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int p = rVar.mo46925p();
                                i4 = p & 15;
                                i3 = (p & 240) >> 4;
                            }
                            boolean z = rVar.mo46925p() == 1;
                            int p2 = rVar.mo46925p();
                            byte[] bArr2 = new byte[16];
                            rVar2.mo46911b(0, 16, bArr2);
                            if (!z || p2 != 0) {
                                bArr = null;
                            } else {
                                int p3 = rVar.mo46925p();
                                byte[] bArr3 = new byte[p3];
                                rVar2.mo46911b(0, p3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            mVar = new C18693m(z, str, p2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i9 += c4;
                        }
                    }
                    C14075p.m21697i(mVar, "tenc atom is mandatory");
                    pair = Pair.create(num, mVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += c;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a8  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p701wh.C18695o m31504d(p701wh.C18692l r39, p701wh.C18670a.C18671a r40, p644ph.C18360p r41) throws com.google.android.exoplayer2.ParserException {
        /*
            r1 = r39
            r0 = r40
            r2 = r41
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            wh.a$b r3 = r0.mo70184c(r3)
            if (r3 == 0) goto L_0x0017
            wh.b$c r4 = new wh.b$c
            com.google.android.exoplayer2.Format r5 = r1.f41406f
            r4.<init>(r3, r5)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            wh.a$b r3 = r0.mo70184c(r3)
            if (r3 == 0) goto L_0x055b
            wh.b$d r4 = new wh.b$d
            r4.<init>(r3)
        L_0x0025:
            int r3 = r4.mo70188c()
            r5 = 0
            if (r3 != 0) goto L_0x0043
            wh.o r9 = new wh.o
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r0 = r9
            r1 = r39
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0043:
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            wh.a$b r6 = r0.mo70184c(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0059
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            wh.a$b r6 = r0.mo70184c(r6)
            r6.getClass()
            r8 = r7
            goto L_0x005a
        L_0x0059:
            r8 = r5
        L_0x005a:
            bj.r r6 = r6.f41289b
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            wh.a$b r9 = r0.mo70184c(r9)
            r9.getClass()
            bj.r r9 = r9.f41289b
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            wh.a$b r10 = r0.mo70184c(r10)
            r10.getClass()
            bj.r r10 = r10.f41289b
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            wh.a$b r11 = r0.mo70184c(r11)
            if (r11 == 0) goto L_0x0080
            bj.r r11 = r11.f41289b
            goto L_0x0081
        L_0x0080:
            r11 = 0
        L_0x0081:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            wh.a$b r0 = r0.mo70184c(r13)
            if (r0 == 0) goto L_0x008d
            bj.r r0 = r0.f41289b
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            wh.b$a r13 = new wh.b$a
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo46935z(r6)
            int r8 = r10.mo46928s()
            int r8 = r8 - r7
            int r9 = r10.mo46928s()
            int r14 = r10.mo46928s()
            if (r0 == 0) goto L_0x00af
            r0.mo46935z(r6)
            int r15 = r0.mo46928s()
            goto L_0x00b0
        L_0x00af:
            r15 = r5
        L_0x00b0:
            r12 = -1
            if (r11 == 0) goto L_0x00c7
            r11.mo46935z(r6)
            int r6 = r11.mo46928s()
            if (r6 <= 0) goto L_0x00c3
            int r16 = r11.mo46928s()
            int r16 = r16 + -1
            goto L_0x00ca
        L_0x00c3:
            r16 = r12
            r11 = 0
            goto L_0x00ca
        L_0x00c7:
            r6 = r5
            r16 = r12
        L_0x00ca:
            int r5 = r4.mo70187b()
            com.google.android.exoplayer2.Format r7 = r1.f41406f
            java.lang.String r7 = r7.sampleMimeType
            if (r5 == r12) goto L_0x00f7
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00ec
            java.lang.String r12 = "audio/g711-mlaw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00ec
            java.lang.String r12 = "audio/g711-alaw"
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x00f7
        L_0x00ec:
            if (r8 != 0) goto L_0x00f7
            if (r15 != 0) goto L_0x00f7
            if (r6 != 0) goto L_0x00f7
            r12 = r8
            r19 = r9
            r7 = 1
            goto L_0x00fb
        L_0x00f7:
            r12 = r8
            r19 = r9
            r7 = 0
        L_0x00fb:
            if (r7 == 0) goto L_0x0189
            int r0 = r13.f41291a
            long[] r4 = new long[r0]
            int[] r6 = new int[r0]
        L_0x0103:
            boolean r7 = r13.mo70185a()
            if (r7 == 0) goto L_0x0114
            int r7 = r13.f41292b
            long r10 = r13.f41294d
            r4[r7] = r10
            int r10 = r13.f41293c
            r6[r7] = r10
            goto L_0x0103
        L_0x0114:
            long r10 = (long) r14
            r7 = 8192(0x2000, float:1.14794E-41)
            int r7 = r7 / r5
            r12 = 0
            r13 = 0
        L_0x011a:
            if (r12 >= r0) goto L_0x0128
            r14 = r6[r12]
            int r15 = p513bj.C14049b0.f30913a
            int r14 = r14 + r7
            r15 = -1
            int r14 = r14 + r15
            int r14 = r14 / r7
            int r13 = r13 + r14
            int r12 = r12 + 1
            goto L_0x011a
        L_0x0128:
            long[] r12 = new long[r13]
            int[] r14 = new int[r13]
            long[] r15 = new long[r13]
            int[] r13 = new int[r13]
            r8 = 0
            r9 = 0
            r16 = 0
            r19 = 0
        L_0x0136:
            if (r8 >= r0) goto L_0x017e
            r22 = r6[r8]
            r23 = r4[r8]
            r24 = r23
            r23 = r4
            r4 = r22
            r22 = r0
            r0 = r19
        L_0x0146:
            if (r4 <= 0) goto L_0x0171
            int r19 = java.lang.Math.min(r7, r4)
            r12[r16] = r24
            r40 = r6
            int r6 = r5 * r19
            r14[r16] = r6
            int r0 = java.lang.Math.max(r0, r6)
            r26 = r5
            long r5 = (long) r9
            long r5 = r5 * r10
            r15[r16] = r5
            r5 = 1
            r13[r16] = r5
            r5 = r14[r16]
            long r5 = (long) r5
            long r24 = r24 + r5
            int r9 = r9 + r19
            int r4 = r4 - r19
            int r16 = r16 + 1
            r6 = r40
            r5 = r26
            goto L_0x0146
        L_0x0171:
            r26 = r5
            r40 = r6
            int r8 = r8 + 1
            r19 = r0
            r0 = r22
            r4 = r23
            goto L_0x0136
        L_0x017e:
            long r4 = (long) r9
            long r10 = r10 * r4
            r4 = r1
            r0 = r3
            r2 = r12
            r6 = r13
            r3 = r14
            r5 = r15
            r13 = r10
            goto L_0x02fd
        L_0x0189:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            int[] r9 = new int[r3]
            r22 = r10
            r40 = r12
            r2 = r16
            r1 = 0
            r10 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r16 = r15
            r15 = r14
            r14 = r19
            r19 = 0
        L_0x01a8:
            java.lang.String r12 = "AtomParsers"
            if (r1 >= r3) goto L_0x026b
            r29 = r23
            r23 = r19
            r19 = 1
        L_0x01b2:
            if (r23 != 0) goto L_0x01cf
            boolean r19 = r13.mo70185a()
            if (r19 == 0) goto L_0x01cf
            r24 = r14
            r31 = r15
            long r14 = r13.f41294d
            r32 = r3
            int r3 = r13.f41293c
            r23 = r3
            r29 = r14
            r14 = r24
            r15 = r31
            r3 = r32
            goto L_0x01b2
        L_0x01cf:
            r32 = r3
            r24 = r14
            r31 = r15
            if (r19 != 0) goto L_0x01f1
            java.lang.String r2 = "Unexpected end of chunk data"
            android.util.Log.w(r12, r2)
            long[] r5 = java.util.Arrays.copyOf(r5, r1)
            int[] r7 = java.util.Arrays.copyOf(r7, r1)
            long[] r8 = java.util.Arrays.copyOf(r8, r1)
            int[] r9 = java.util.Arrays.copyOf(r9, r1)
            r3 = r1
            r1 = r23
            goto L_0x0271
        L_0x01f1:
            if (r0 == 0) goto L_0x0204
        L_0x01f3:
            if (r28 != 0) goto L_0x0202
            if (r16 <= 0) goto L_0x0202
            int r28 = r0.mo46928s()
            int r27 = r0.mo46912c()
            int r16 = r16 + -1
            goto L_0x01f3
        L_0x0202:
            int r28 = r28 + -1
        L_0x0204:
            r3 = r27
            r5[r1] = r29
            int r12 = r4.mo70186a()
            r7[r1] = r12
            if (r12 <= r10) goto L_0x0211
            r10 = r12
        L_0x0211:
            long r14 = (long) r3
            long r14 = r25 + r14
            r8[r1] = r14
            if (r11 != 0) goto L_0x021a
            r12 = 1
            goto L_0x021b
        L_0x021a:
            r12 = 0
        L_0x021b:
            r9[r1] = r12
            if (r1 != r2) goto L_0x022e
            r12 = 1
            r9[r1] = r12
            int r6 = r6 + -1
            if (r6 <= 0) goto L_0x022e
            r11.getClass()
            int r2 = r11.mo46928s()
            int r2 = r2 - r12
        L_0x022e:
            r15 = r2
            r12 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r24 + -1
            if (r2 != 0) goto L_0x0246
            if (r40 <= 0) goto L_0x0246
            int r2 = r22.mo46928s()
            int r3 = r22.mo46912c()
            int r14 = r40 + -1
            goto L_0x0249
        L_0x0246:
            r3 = r14
            r14 = r40
        L_0x0249:
            r40 = r2
            r2 = r7[r1]
            r19 = r3
            long r2 = (long) r2
            long r2 = r29 + r2
            int r23 = r23 + -1
            int r1 = r1 + 1
            r27 = r12
            r36 = r14
            r14 = r40
            r40 = r36
            r37 = r2
            r2 = r15
            r15 = r19
            r19 = r23
            r3 = r32
            r23 = r37
            goto L_0x01a8
        L_0x026b:
            r32 = r3
            r24 = r14
            r1 = r19
        L_0x0271:
            r2 = r27
            long r13 = (long) r2
            long r13 = r25 + r13
            if (r0 == 0) goto L_0x0288
        L_0x0278:
            if (r16 <= 0) goto L_0x0288
            int r2 = r0.mo46928s()
            if (r2 == 0) goto L_0x0282
            r0 = 0
            goto L_0x0289
        L_0x0282:
            r0.mo46912c()
            int r16 = r16 + -1
            goto L_0x0278
        L_0x0288:
            r0 = 1
        L_0x0289:
            if (r6 != 0) goto L_0x029d
            if (r24 != 0) goto L_0x029d
            if (r1 != 0) goto L_0x029d
            if (r40 != 0) goto L_0x029d
            r2 = r28
            if (r2 != 0) goto L_0x029f
            if (r0 != 0) goto L_0x0298
            goto L_0x029f
        L_0x0298:
            r4 = r39
            r16 = r3
            goto L_0x02f5
        L_0x029d:
            r2 = r28
        L_0x029f:
            r4 = r39
            int r11 = r4.f41401a
            if (r0 != 0) goto L_0x02a8
            java.lang.String r0 = ", ctts invalid"
            goto L_0x02aa
        L_0x02a8:
            java.lang.String r0 = ""
        L_0x02aa:
            int r15 = r0.length()
            int r15 = r15 + 262
            r16 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r15)
            java.lang.String r15 = "Inconsistent stbl box for track "
            r3.append(r15)
            r3.append(r11)
            java.lang.String r11 = ": remainingSynchronizationSamples "
            r3.append(r11)
            r3.append(r6)
            java.lang.String r6 = ", remainingSamplesAtTimestampDelta "
            r3.append(r6)
            r6 = r24
            r3.append(r6)
            java.lang.String r6 = ", remainingSamplesInChunk "
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r3.append(r1)
            r1 = r40
            r3.append(r1)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r12, r0)
        L_0x02f5:
            r2 = r5
            r3 = r7
            r5 = r8
            r6 = r9
            r19 = r10
            r0 = r16
        L_0x02fd:
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r4.f41403c
            r7 = r13
            long r7 = p513bj.C14049b0.m21625F(r7, r9, r11)
            long[] r1 = r4.f41408h
            if (r1 != 0) goto L_0x031b
            long r0 = r4.f41403c
            p513bj.C14049b0.m21626G(r5, r0)
            wh.o r9 = new wh.o
            r0 = r9
            r1 = r39
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x031b:
            int r1 = r1.length
            r7 = 1
            if (r1 != r7) goto L_0x03c4
            int r1 = r4.f41402b
            if (r1 != r7) goto L_0x03c4
            int r1 = r5.length
            r7 = 2
            if (r1 < r7) goto L_0x03c4
            long[] r1 = r4.f41409i
            r1.getClass()
            r7 = 0
            r8 = r1[r7]
            long[] r1 = r4.f41408h
            r22 = r1[r7]
            long r10 = r4.f41403c
            r15 = r8
            long r7 = r4.f41404d
            r24 = r10
            r26 = r7
            long r7 = p513bj.C14049b0.m21625F(r22, r24, r26)
            long r7 = r7 + r15
            int r1 = r5.length
            r9 = 1
            int r1 = r1 - r9
            r9 = 4
            r10 = 0
            int r11 = p513bj.C14049b0.m21636i(r9, r10, r1)
            int r12 = r5.length
            int r12 = r12 - r9
            int r1 = p513bj.C14049b0.m21636i(r12, r10, r1)
            r22 = r5[r10]
            int r9 = (r22 > r15 ? 1 : (r22 == r15 ? 0 : -1))
            if (r9 > 0) goto L_0x0368
            r9 = r5[r11]
            int r9 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x0368
            r9 = r5[r1]
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0368
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x0368
            r1 = 1
            goto L_0x0369
        L_0x0368:
            r1 = 0
        L_0x0369:
            if (r1 == 0) goto L_0x03c4
            long r24 = r13 - r7
            long r7 = r15 - r22
            com.google.android.exoplayer2.Format r1 = r4.f41406f
            int r1 = r1.sampleRate
            long r9 = (long) r1
            long r11 = r4.f41403c
            long r7 = p513bj.C14049b0.m21625F(r7, r9, r11)
            com.google.android.exoplayer2.Format r1 = r4.f41406f
            int r1 = r1.sampleRate
            long r9 = (long) r1
            long r11 = r4.f41403c
            r26 = r9
            r28 = r11
            long r9 = p513bj.C14049b0.m21625F(r24, r26, r28)
            r11 = 0
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0393
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x03c4
        L_0x0393:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x03c4
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x03c4
            int r0 = (int) r7
            r1 = r41
            r1.f40320a = r0
            int r0 = (int) r9
            r1.f40321b = r0
            long r0 = r4.f41403c
            p513bj.C14049b0.m21626G(r5, r0)
            long[] r0 = r4.f41408h
            r1 = 0
            r7 = r0[r1]
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r4.f41404d
            long r7 = p513bj.C14049b0.m21625F(r7, r9, r11)
            wh.o r9 = new wh.o
            r0 = r9
            r1 = r39
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03c4:
            long[] r1 = r4.f41408h
            int r7 = r1.length
            r8 = 1
            if (r7 != r8) goto L_0x0409
            r7 = 0
            r8 = r1[r7]
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x040a
            long[] r0 = r4.f41409i
            r0.getClass()
            r8 = r0[r7]
        L_0x03da:
            int r0 = r5.length
            if (r7 >= r0) goto L_0x03f1
            r0 = r5[r7]
            long r20 = r0 - r8
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r4.f41403c
            r24 = r0
            long r0 = p513bj.C14049b0.m21625F(r20, r22, r24)
            r5[r7] = r0
            int r7 = r7 + 1
            goto L_0x03da
        L_0x03f1:
            long r20 = r13 - r8
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r4.f41403c
            r24 = r0
            long r7 = p513bj.C14049b0.m21625F(r20, r22, r24)
            wh.o r9 = new wh.o
            r0 = r9
            r1 = r39
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0409:
            r7 = 0
        L_0x040a:
            int r8 = r4.f41402b
            r9 = 1
            if (r8 != r9) goto L_0x0411
            r8 = 1
            goto L_0x0412
        L_0x0411:
            r8 = r7
        L_0x0412:
            int r9 = r1.length
            int[] r9 = new int[r9]
            int r1 = r1.length
            int[] r1 = new int[r1]
            long[] r10 = r4.f41409i
            r10.getClass()
            r11 = r7
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0421:
            long[] r15 = r4.f41408h
            int r7 = r15.length
            if (r11 >= r7) goto L_0x0481
            r40 = r2
            r7 = r3
            r2 = r10[r11]
            r22 = -1
            int r16 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r16 == 0) goto L_0x0472
            r22 = r15[r11]
            r41 = r14
            long r14 = r4.f41403c
            r16 = r12
            r28 = r13
            long r12 = r4.f41404d
            r24 = r14
            r26 = r12
            long r12 = p513bj.C14049b0.m21625F(r22, r24, r26)
            r14 = 1
            int r15 = p513bj.C14049b0.m21633f(r5, r2, r14)
            r9[r11] = r15
            long r2 = r2 + r12
            int r2 = p513bj.C14049b0.m21629b(r5, r2, r8)
            r1[r11] = r2
        L_0x0453:
            r2 = r9[r11]
            r3 = r1[r11]
            if (r2 >= r3) goto L_0x0463
            r12 = r6[r2]
            r12 = r12 & r14
            if (r12 != 0) goto L_0x0463
            int r2 = r2 + 1
            r9[r11] = r2
            goto L_0x0453
        L_0x0463:
            int r12 = r3 - r2
            int r12 = r12 + r16
            r13 = r28
            if (r13 == r2) goto L_0x046d
            r2 = r14
            goto L_0x046e
        L_0x046d:
            r2 = 0
        L_0x046e:
            r2 = r2 | r41
            r13 = r3
            goto L_0x0479
        L_0x0472:
            r16 = r12
            r41 = r14
            r14 = 1
            r2 = r41
        L_0x0479:
            int r11 = r11 + 1
            r14 = r2
            r3 = r7
            r7 = 0
            r2 = r40
            goto L_0x0421
        L_0x0481:
            r40 = r2
            r7 = r3
            r41 = r14
            r14 = 1
            if (r12 == r0) goto L_0x048a
            goto L_0x048b
        L_0x048a:
            r14 = 0
        L_0x048b:
            r0 = r41 | r14
            if (r0 == 0) goto L_0x0492
            long[] r2 = new long[r12]
            goto L_0x0494
        L_0x0492:
            r2 = r40
        L_0x0494:
            if (r0 == 0) goto L_0x0499
            int[] r3 = new int[r12]
            goto L_0x049a
        L_0x0499:
            r3 = r7
        L_0x049a:
            if (r0 == 0) goto L_0x049e
            r19 = 0
        L_0x049e:
            if (r0 == 0) goto L_0x04a3
            int[] r8 = new int[r12]
            goto L_0x04a4
        L_0x04a3:
            r8 = r6
        L_0x04a4:
            long[] r10 = new long[r12]
            r11 = 0
            r12 = 0
            r22 = 0
        L_0x04aa:
            long[] r13 = r4.f41408h
            int r13 = r13.length
            if (r11 >= r13) goto L_0x053e
            long[] r13 = r4.f41409i
            r24 = r13[r11]
            r13 = r9[r11]
            r15 = r1[r11]
            if (r0 == 0) goto L_0x04c9
            int r14 = r15 - r13
            r26 = r1
            r1 = r40
            java.lang.System.arraycopy(r1, r13, r2, r12, r14)
            java.lang.System.arraycopy(r7, r13, r3, r12, r14)
            java.lang.System.arraycopy(r6, r13, r8, r12, r14)
            goto L_0x04cd
        L_0x04c9:
            r26 = r1
            r1 = r40
        L_0x04cd:
            r14 = r19
        L_0x04cf:
            if (r13 >= r15) goto L_0x051f
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r28 = r8
            r27 = r9
            long r8 = r4.f41404d
            r40 = r1
            r19 = r13
            r1 = r14
            r13 = r22
            r29 = r15
            r15 = r16
            r17 = r8
            long r8 = p513bj.C14049b0.m21625F(r13, r15, r17)
            r13 = r5[r19]
            long r13 = r13 - r24
            r15 = r5
            r16 = r6
            r5 = 0
            long r30 = java.lang.Math.max(r5, r13)
            r32 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r4.f41403c
            r34 = r13
            long r13 = p513bj.C14049b0.m21625F(r30, r32, r34)
            long r8 = r8 + r13
            r10[r12] = r8
            if (r0 == 0) goto L_0x050e
            r8 = r3[r12]
            if (r8 <= r1) goto L_0x050e
            r1 = r7[r19]
        L_0x050e:
            r14 = r1
            int r12 = r12 + 1
            int r13 = r19 + 1
            r1 = r40
            r5 = r15
            r6 = r16
            r9 = r27
            r8 = r28
            r15 = r29
            goto L_0x04cf
        L_0x051f:
            r40 = r1
            r15 = r5
            r16 = r6
            r28 = r8
            r27 = r9
            r1 = r14
            r5 = 0
            long[] r8 = r4.f41408h
            r13 = r8[r11]
            long r22 = r22 + r13
            int r11 = r11 + 1
            r19 = r1
            r5 = r15
            r6 = r16
            r1 = r26
            r8 = r28
            goto L_0x04aa
        L_0x053e:
            r28 = r8
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r4.f41404d
            r13 = r22
            r17 = r0
            long r7 = p513bj.C14049b0.m21625F(r13, r15, r17)
            wh.o r9 = new wh.o
            r0 = r9
            r1 = r39
            r4 = r19
            r5 = r10
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x055b:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18673b.m31504d(wh.l, wh.a$a, ph.p):wh.o");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v7, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v9, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v14, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x07d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0a54  */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x0ad8  */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0ae0  */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0b0d  */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x0b12  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0202  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m31505e(p701wh.C18670a.C18671a r54, p644ph.C18360p r55, long r56, com.google.android.exoplayer2.drm.DrmInitData r58, boolean r59, boolean r60, com.google.common.base.C15784e r61) throws com.google.android.exoplayer2.ParserException {
        /*
            r0 = r54
            r1 = r58
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        L_0x000a:
            java.util.ArrayList r5 = r0.f41288d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0b43
            java.util.ArrayList r5 = r0.f41288d
            java.lang.Object r5 = r5.get(r4)
            wh.a$a r5 = (p701wh.C18670a.C18671a) r5
            int r6 = r5.f41285a
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r7) goto L_0x0029
            r3 = r55
            r0 = r61
            r31 = r4
            goto L_0x0b3b
        L_0x0029:
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            wh.a$b r6 = r0.mo70184c(r6)
            r6.getClass()
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            wh.a$a r8 = r5.mo70183b(r7)
            r8.getClass()
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            wh.a$b r9 = r8.mo70184c(r9)
            r9.getClass()
            bj.r r9 = r9.f41289b
            r10 = 16
            r9.mo46935z(r10)
            int r9 = r9.mo46912c()
            r11 = 1936684398(0x736f756e, float:1.8971874E31)
            r14 = -1
            if (r9 != r11) goto L_0x005a
            r9 = 1
            goto L_0x0080
        L_0x005a:
            r11 = 1986618469(0x76696465, float:1.1834389E33)
            if (r9 != r11) goto L_0x0061
            r9 = 2
            goto L_0x0080
        L_0x0061:
            r11 = 1952807028(0x74657874, float:7.272211E31)
            if (r9 == r11) goto L_0x007f
            r11 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r9 == r11) goto L_0x007f
            r11 = 1937072756(0x73756274, float:1.944137E31)
            if (r9 == r11) goto L_0x007f
            r11 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r9 != r11) goto L_0x0076
            goto L_0x007f
        L_0x0076:
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r11) goto L_0x007d
            r9 = 5
            goto L_0x0080
        L_0x007d:
            r9 = r14
            goto L_0x0080
        L_0x007f:
            r9 = 3
        L_0x0080:
            if (r9 != r14) goto L_0x0088
            r32 = r2
            r31 = r4
            goto L_0x0ade
        L_0x0088:
            r15 = 1953196132(0x746b6864, float:7.46037E31)
            wh.a$b r15 = r5.mo70184c(r15)
            r15.getClass()
            bj.r r15 = r15.f41289b
            r7 = 8
            r15.mo46935z(r7)
            int r20 = r15.mo46912c()
            int r3 = r20 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x00a5
            r13 = r7
            goto L_0x00a6
        L_0x00a5:
            r13 = r10
        L_0x00a6:
            r15.mo46909A(r13)
            int r13 = r15.mo46912c()
            r11 = 4
            r15.mo46909A(r11)
            int r12 = r15.f30987b
            if (r3 != 0) goto L_0x00b6
            r7 = r11
        L_0x00b6:
            r11 = 0
        L_0x00b7:
            if (r11 >= r7) goto L_0x00c8
            byte[] r10 = r15.f30986a
            int r24 = r12 + r11
            byte r10 = r10[r24]
            if (r10 == r14) goto L_0x00c3
            r10 = 0
            goto L_0x00c9
        L_0x00c3:
            int r11 = r11 + 1
            r10 = 16
            goto L_0x00b7
        L_0x00c8:
            r10 = 1
        L_0x00c9:
            r24 = 0
            if (r10 == 0) goto L_0x00d1
            r15.mo46909A(r7)
            goto L_0x00e0
        L_0x00d1:
            if (r3 != 0) goto L_0x00d8
            long r26 = r15.mo46926q()
            goto L_0x00dc
        L_0x00d8:
            long r26 = r15.mo46929t()
        L_0x00dc:
            int r3 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r3 != 0) goto L_0x00e8
        L_0x00e0:
            r3 = 16
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00ea
        L_0x00e8:
            r3 = 16
        L_0x00ea:
            r15.mo46909A(r3)
            int r3 = r15.mo46912c()
            int r7 = r15.mo46912c()
            r10 = 4
            r15.mo46909A(r10)
            int r10 = r15.mo46912c()
            int r15 = r15.mo46912c()
            r14 = 65536(0x10000, float:9.18355E-41)
            r11 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x0110
            if (r7 != r14) goto L_0x0110
            if (r10 != r11) goto L_0x0110
            if (r15 != 0) goto L_0x0110
            r3 = 90
            goto L_0x0127
        L_0x0110:
            if (r3 != 0) goto L_0x011b
            if (r7 != r11) goto L_0x011b
            if (r10 != r14) goto L_0x011b
            if (r15 != 0) goto L_0x011b
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x0127
        L_0x011b:
            if (r3 != r11) goto L_0x0126
            if (r7 != 0) goto L_0x0126
            if (r10 != 0) goto L_0x0126
            if (r15 != r11) goto L_0x0126
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x0127
        L_0x0126:
            r3 = 0
        L_0x0127:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r56 > r10 ? 1 : (r56 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0133
            r31 = r26
            goto L_0x0135
        L_0x0133:
            r31 = r56
        L_0x0135:
            bj.r r6 = r6.f41289b
            r7 = 8
            r6.mo46935z(r7)
            int r7 = r6.mo46912c()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 != 0) goto L_0x0149
            r7 = 8
            goto L_0x014b
        L_0x0149:
            r7 = 16
        L_0x014b:
            r6.mo46909A(r7)
            long r6 = r6.mo46926q()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r31 > r10 ? 1 : (r31 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x015c
            goto L_0x0165
        L_0x015c:
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r35 = r6
            long r10 = p513bj.C14049b0.m21625F(r31, r33, r35)
        L_0x0165:
            r12 = 1835626086(0x6d696e66, float:4.515217E27)
            wh.a$a r14 = r8.mo70183b(r12)
            r14.getClass()
            r12 = 1937007212(0x7374626c, float:1.9362132E31)
            wh.a$a r14 = r14.mo70183b(r12)
            r14.getClass()
            r12 = 1835296868(0x6d646864, float:4.418049E27)
            wh.a$b r8 = r8.mo70184c(r12)
            r8.getClass()
            bj.r r8 = r8.f41289b
            r12 = 8
            r8.mo46935z(r12)
            int r12 = r8.mo46912c()
            int r12 = r12 >> 24
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x0197
            r15 = 8
            goto L_0x0199
        L_0x0197:
            r15 = 16
        L_0x0199:
            r8.mo46909A(r15)
            long r26 = r8.mo46926q()
            if (r12 != 0) goto L_0x01a4
            r12 = 4
            goto L_0x01a6
        L_0x01a4:
            r12 = 8
        L_0x01a6:
            r8.mo46909A(r12)
            int r8 = r8.mo46930u()
            int r12 = r8 >> 10
            r12 = r12 & 31
            int r12 = r12 + 96
            char r12 = (char) r12
            int r15 = r8 >> 5
            r15 = r15 & 31
            int r15 = r15 + 96
            char r15 = (char) r15
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r31 = r4
            r4 = 3
            r0.<init>(r4)
            r0.append(r12)
            r0.append(r15)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r26)
            android.util.Pair r0 = android.util.Pair.create(r4, r0)
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            wh.a$b r4 = r14.mo70184c(r4)
            r4.getClass()
            bj.r r4 = r4.f41289b
            java.lang.Object r8 = r0.second
            java.lang.String r8 = (java.lang.String) r8
            r12 = 12
            r4.mo46935z(r12)
            int r12 = r4.mo46912c()
            wh.m[] r14 = new p701wh.C18693m[r12]
            r32 = r2
            r2 = 0
            r15 = 0
            r26 = 0
            r29 = 0
        L_0x0200:
            if (r2 >= r12) goto L_0x0a44
            r27 = r12
            int r12 = r4.f30987b
            r33 = r10
            int r10 = r4.mo46912c()
            r35 = r6
            if (r10 <= 0) goto L_0x0212
            r11 = 1
            goto L_0x0213
        L_0x0212:
            r11 = 0
        L_0x0213:
            java.lang.String r6 = "childAtomSize should be positive"
            p513bj.C14075p.m21695g(r11, r6)
            int r7 = r4.mo46912c()
            r11 = 1635148593(0x61766331, float:2.840654E20)
            r30 = r9
            if (r7 == r11) goto L_0x080b
            r11 = 1635148595(0x61766333, float:2.8406544E20)
            if (r7 == r11) goto L_0x080b
            r11 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 == r11) goto L_0x080b
            r11 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r7 == r11) goto L_0x080b
            r11 = 1836070006(0x6d703476, float:4.646239E27)
            if (r7 == r11) goto L_0x080b
            r11 = 1752589105(0x68766331, float:4.6541277E24)
            if (r7 == r11) goto L_0x080b
            r11 = 1751479857(0x68657631, float:4.3344087E24)
            if (r7 == r11) goto L_0x080b
            r11 = 1932670515(0x73323633, float:1.4119387E31)
            if (r7 == r11) goto L_0x080b
            r11 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 == r11) goto L_0x080b
            r11 = 1987063865(0x76703039, float:1.2178997E33)
            if (r7 == r11) goto L_0x080b
            r11 = 1635135537(0x61763031, float:2.8383572E20)
            if (r7 == r11) goto L_0x080b
            r11 = 1685479798(0x64766176, float:1.8179687E22)
            if (r7 == r11) goto L_0x080b
            r11 = 1685479729(0x64766131, float:1.817961E22)
            if (r7 == r11) goto L_0x080b
            r11 = 1685481573(0x64766865, float:1.8181686E22)
            if (r7 == r11) goto L_0x080b
            r11 = 1685481521(0x64766831, float:1.8181627E22)
            if (r7 != r11) goto L_0x026b
            goto L_0x080b
        L_0x026b:
            r11 = 1836069985(0x6d703461, float:4.6462328E27)
            r9 = 1701733217(0x656e6361, float:7.0359778E22)
            r39 = r0
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 == r11) goto L_0x03bc
            if (r7 == r9) goto L_0x03bc
            r9 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r7 == r9) goto L_0x03bc
            r9 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 == r9) goto L_0x03bc
            r9 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 == r9) goto L_0x03bc
            r9 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 == r9) goto L_0x03bc
            r9 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 == r9) goto L_0x03bc
            r9 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r9) goto L_0x03bc
            r9 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r9) goto L_0x03bc
            r9 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 == r9) goto L_0x03bc
            r9 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 == r9) goto L_0x03bc
            r9 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r9) goto L_0x03bc
            r9 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r9) goto L_0x03bc
            r9 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 == r9) goto L_0x03bc
            r9 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r9) goto L_0x03bc
            r9 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r9) goto L_0x03bc
            r9 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 == r9) goto L_0x03bc
            r9 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 == r9) goto L_0x03bc
            if (r7 == r0) goto L_0x03bc
            r9 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 == r9) goto L_0x03bc
            r9 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 == r9) goto L_0x03bc
            r9 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 == r9) goto L_0x03bc
            r9 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r9) goto L_0x02e2
            goto L_0x03bc
        L_0x02e2:
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r7 == r0) goto L_0x033f
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 == r0) goto L_0x033f
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 == r0) goto L_0x033f
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 == r0) goto L_0x033f
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 != r0) goto L_0x02fc
            goto L_0x033f
        L_0x02fc:
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r7 != r0) goto L_0x0326
            int r0 = r12 + 8
            r6 = 8
            int r0 = r0 + r6
            r4.mo46935z(r0)
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r7 != r0) goto L_0x033b
            r4.mo46920k()
            java.lang.String r0 = r4.mo46920k()
            if (r0 == 0) goto L_0x033b
            com.google.android.exoplayer2.Format$b r6 = new com.google.android.exoplayer2.Format$b
            r6.<init>()
            r6.mo47145b(r13)
            r6.f31303k = r0
            com.google.android.exoplayer2.Format r15 = r6.mo47144a()
            goto L_0x033b
        L_0x0326:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r7 != r0) goto L_0x033b
            com.google.android.exoplayer2.Format$b r0 = new com.google.android.exoplayer2.Format$b
            r0.<init>()
            r0.mo47145b(r13)
            java.lang.String r6 = "application/x-camera-motion"
            r0.f31303k = r6
            com.google.android.exoplayer2.Format r15 = r0.mo47144a()
        L_0x033b:
            r11 = r2
            r9 = r3
            goto L_0x03a5
        L_0x033f:
            int r0 = r12 + 8
            r6 = 8
            int r0 = r0 + r6
            r4.mo46935z(r0)
            r37 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            java.lang.String r6 = "application/ttml+xml"
            if (r7 != r0) goto L_0x0354
            goto L_0x037d
        L_0x0354:
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 != r0) goto L_0x036e
            int r0 = r10 + -8
            int r0 = r0 + -8
            byte[] r6 = new byte[r0]
            r7 = 0
            r4.mo46911b(r7, r0, r6)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m25827of(r6)
            java.lang.String r6 = "application/x-quicktime-tx3g"
            r11 = r2
            r9 = r3
            r2 = r37
            goto L_0x0391
        L_0x036e:
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 != r0) goto L_0x0376
            java.lang.String r6 = "application/x-mp4-vtt"
            goto L_0x037d
        L_0x0376:
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 != r0) goto L_0x0383
            r37 = r24
        L_0x037d:
            r11 = r2
            r9 = r3
            r2 = r37
            r0 = 0
            goto L_0x0391
        L_0x0383:
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 != r0) goto L_0x03b6
            java.lang.String r6 = "application/x-mp4-cea-608"
            r11 = r2
            r9 = r3
            r2 = r37
            r0 = 0
            r26 = 1
        L_0x0391:
            com.google.android.exoplayer2.Format$b r7 = new com.google.android.exoplayer2.Format$b
            r7.<init>()
            r7.mo47145b(r13)
            r7.f31303k = r6
            r7.f31295c = r8
            r7.f31307o = r2
            r7.f31305m = r0
            com.google.android.exoplayer2.Format r15 = r7.mo47144a()
        L_0x03a5:
            r41 = r5
            r45 = r9
            r48 = r10
            r44 = r11
            r49 = r12
            r46 = r14
            r0 = -1
            r12 = 0
            r14 = 4
            goto L_0x0800
        L_0x03b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x03bc:
            r11 = r2
            r9 = r3
            int r2 = r12 + 8
            r3 = 8
            int r2 = r2 + r3
            r4.mo46935z(r2)
            r2 = 6
            if (r60 == 0) goto L_0x03d3
            int r21 = r4.mo46930u()
            r4.mo46909A(r2)
            r3 = r21
            goto L_0x03d7
        L_0x03d3:
            r4.mo46909A(r3)
            r3 = 0
        L_0x03d7:
            if (r3 == 0) goto L_0x03fc
            r0 = 1
            if (r3 != r0) goto L_0x03dd
            goto L_0x03fc
        L_0x03dd:
            r0 = 2
            if (r3 != r0) goto L_0x03a5
            r0 = 16
            r4.mo46909A(r0)
            long r40 = r4.mo46919j()
            double r40 = java.lang.Double.longBitsToDouble(r40)
            long r2 = java.lang.Math.round(r40)
            int r2 = (int) r2
            int r3 = r4.mo46928s()
            r0 = 20
            r4.mo46909A(r0)
            goto L_0x042e
        L_0x03fc:
            int r2 = r4.mo46930u()
            r0 = 6
            r4.mo46909A(r0)
            byte[] r0 = r4.f30986a
            r41 = r2
            int r2 = r4.f30987b
            int r42 = r2 + 1
            byte r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r21 = 8
            int r2 = r2 << 8
            int r43 = r42 + 1
            byte r0 = r0[r42]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            r42 = r2
            r0 = 2
            int r2 = r43 + 2
            r4.f30987b = r2
            r0 = 1
            if (r3 != r0) goto L_0x042a
            r0 = 16
            r4.mo46909A(r0)
        L_0x042a:
            r3 = r41
            r2 = r42
        L_0x042e:
            int r0 = r4.f30987b
            r41 = r2
            r2 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 != r2) goto L_0x0465
            android.util.Pair r2 = m31503c(r4, r12, r10)
            if (r2 == 0) goto L_0x045e
            java.lang.Object r7 = r2.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r1 != 0) goto L_0x044b
            r42 = r3
            r3 = 0
            goto L_0x0457
        L_0x044b:
            r42 = r3
            java.lang.Object r3 = r2.second
            wh.m r3 = (p701wh.C18693m) r3
            java.lang.String r3 = r3.f41413b
            com.google.android.exoplayer2.drm.DrmInitData r3 = r1.copyWithSchemeType(r3)
        L_0x0457:
            java.lang.Object r2 = r2.second
            wh.m r2 = (p701wh.C18693m) r2
            r14[r11] = r2
            goto L_0x0461
        L_0x045e:
            r42 = r3
            r3 = r1
        L_0x0461:
            r4.mo46935z(r0)
            goto L_0x0468
        L_0x0465:
            r42 = r3
            r3 = r1
        L_0x0468:
            java.lang.String r2 = "audio/ac4"
            java.lang.String r43 = "audio/eac3"
            r44 = r0
            java.lang.String r0 = "audio/ac3"
            r45 = r9
            r9 = 1633889587(0x61632d33, float:2.6191674E20)
            java.lang.String r46 = "audio/raw"
            if (r7 != r9) goto L_0x047d
            r46 = r0
            goto L_0x0521
        L_0x047d:
            r9 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 != r9) goto L_0x0486
            r46 = r43
            goto L_0x0521
        L_0x0486:
            r9 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 != r9) goto L_0x048f
            r46 = r2
            goto L_0x0521
        L_0x048f:
            r9 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 != r9) goto L_0x0498
            java.lang.String r7 = "audio/vnd.dts"
            goto L_0x051f
        L_0x0498:
            r9 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r9) goto L_0x051d
            r9 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 != r9) goto L_0x04a4
            goto L_0x051d
        L_0x04a4:
            r9 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 != r9) goto L_0x04ad
            java.lang.String r7 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x051f
        L_0x04ad:
            r9 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 != r9) goto L_0x04b6
            java.lang.String r7 = "audio/3gpp"
            goto L_0x051f
        L_0x04b6:
            r9 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 != r9) goto L_0x04bf
            java.lang.String r7 = "audio/amr-wb"
            goto L_0x051f
        L_0x04bf:
            r9 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r9) goto L_0x051b
            r9 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 != r9) goto L_0x04ca
            goto L_0x051b
        L_0x04ca:
            r9 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 != r9) goto L_0x04d2
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0522
        L_0x04d2:
            r9 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r9) goto L_0x0518
            r9 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 != r9) goto L_0x04dd
            goto L_0x0518
        L_0x04dd:
            r9 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 != r9) goto L_0x04e5
            java.lang.String r7 = "audio/mha1"
            goto L_0x051f
        L_0x04e5:
            r9 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 != r9) goto L_0x04ed
            java.lang.String r7 = "audio/mhm1"
            goto L_0x051f
        L_0x04ed:
            r9 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 != r9) goto L_0x04f5
            java.lang.String r7 = "audio/alac"
            goto L_0x051f
        L_0x04f5:
            r9 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 != r9) goto L_0x04fd
            java.lang.String r7 = "audio/g711-alaw"
            goto L_0x051f
        L_0x04fd:
            r9 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 != r9) goto L_0x0505
            java.lang.String r7 = "audio/g711-mlaw"
            goto L_0x051f
        L_0x0505:
            r9 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 != r9) goto L_0x050d
            java.lang.String r7 = "audio/opus"
            goto L_0x051f
        L_0x050d:
            r9 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r9) goto L_0x0515
            java.lang.String r7 = "audio/flac"
            goto L_0x051f
        L_0x0515:
            r46 = 0
            goto L_0x0521
        L_0x0518:
            java.lang.String r7 = "audio/mpeg"
            goto L_0x051f
        L_0x051b:
            r7 = 2
            goto L_0x0522
        L_0x051d:
            java.lang.String r7 = "audio/vnd.dts.hd"
        L_0x051f:
            r46 = r7
        L_0x0521:
            r7 = -1
        L_0x0522:
            r9 = r44
            r47 = 0
            r44 = r11
            r11 = r46
            r46 = r14
            r14 = 0
            r53 = r41
            r41 = r5
            r5 = r42
            r42 = r15
            r15 = r53
        L_0x0537:
            int r1 = r9 - r12
            if (r1 >= r10) goto L_0x07cc
            r4.mo46935z(r9)
            int r1 = r4.mo46912c()
            r48 = r10
            if (r1 <= 0) goto L_0x0548
            r10 = 1
            goto L_0x0549
        L_0x0548:
            r10 = 0
        L_0x0549:
            p513bj.C14075p.m21695g(r10, r6)
            int r10 = r4.mo46912c()
            r49 = r12
            r12 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r10 != r12) goto L_0x0571
            int r10 = r1 + -13
            byte[] r12 = new byte[r10]
            r50 = r7
            int r7 = r9 + 13
            r4.mo46935z(r7)
            r7 = 0
            r4.mo46911b(r7, r10, r12)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m25827of(r12)
            r52 = r0
            r51 = r14
            r12 = 5
            goto L_0x06cf
        L_0x0571:
            r50 = r7
            r7 = 1702061171(0x65736473, float:7.183675E22)
            if (r10 == r7) goto L_0x0754
            if (r60 == 0) goto L_0x058b
            r7 = 2002876005(0x77617665, float:4.5729223E33)
            if (r10 != r7) goto L_0x058b
            r52 = r0
            r51 = r14
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r7 = 1702061171(0x65736473, float:7.183675E22)
            goto L_0x075b
        L_0x058b:
            r7 = 1684103987(0x64616333, float:1.6630662E22)
            if (r10 != r7) goto L_0x05d8
            int r7 = r9 + 8
            r4.mo46935z(r7)
            java.lang.String r7 = java.lang.Integer.toString(r13)
            int r10 = r4.mo46925p()
            r10 = r10 & 192(0xc0, float:2.69E-43)
            r12 = 6
            int r10 = r10 >> r12
            int[] r40 = p611lh.C18164b.f39729b
            r10 = r40[r10]
            int r40 = r4.mo46925p()
            int[] r42 = p611lh.C18164b.f39731d
            r51 = r40 & 56
            r20 = 3
            int r51 = r51 >> 3
            r42 = r42[r51]
            r22 = 4
            r40 = r40 & 4
            if (r40 == 0) goto L_0x05bb
            int r42 = r42 + 1
        L_0x05bb:
            r51 = r14
            r12 = r42
            com.google.android.exoplayer2.Format$b r14 = new com.google.android.exoplayer2.Format$b
            r14.<init>()
            r14.f31293a = r7
            r14.f31303k = r0
            r14.f31316x = r12
            r14.f31317y = r10
            r14.f31306n = r3
            r14.f31295c = r8
            com.google.android.exoplayer2.Format r7 = r14.mo47144a()
            r52 = r0
            goto L_0x064f
        L_0x05d8:
            r51 = r14
            r7 = 1684366131(0x64656333, float:1.692581E22)
            if (r10 != r7) goto L_0x0653
            int r7 = r9 + 8
            r4.mo46935z(r7)
            java.lang.String r7 = java.lang.Integer.toString(r13)
            r10 = 2
            r4.mo46909A(r10)
            int r10 = r4.mo46925p()
            r10 = r10 & 192(0xc0, float:2.69E-43)
            r12 = 6
            int r10 = r10 >> r12
            int[] r14 = p611lh.C18164b.f39729b
            r10 = r14[r10]
            int r14 = r4.mo46925p()
            int[] r40 = p611lh.C18164b.f39731d
            r42 = r14 & 14
            r19 = 1
            int r42 = r42 >> 1
            r40 = r40[r42]
            r14 = r14 & 1
            if (r14 == 0) goto L_0x060c
            int r40 = r40 + 1
        L_0x060c:
            int r14 = r4.mo46925p()
            r14 = r14 & 30
            int r14 = r14 >> 1
            if (r14 <= 0) goto L_0x0622
            int r14 = r4.mo46925p()
            r18 = 2
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0622
            int r40 = r40 + 2
        L_0x0622:
            r14 = r40
            int r12 = r4.f30988c
            r52 = r0
            int r0 = r4.f30987b
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x0638
            int r0 = r4.mo46925p()
            r12 = 1
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0638
            java.lang.String r0 = "audio/eac3-joc"
            goto L_0x063a
        L_0x0638:
            r0 = r43
        L_0x063a:
            com.google.android.exoplayer2.Format$b r12 = new com.google.android.exoplayer2.Format$b
            r12.<init>()
            r12.f31293a = r7
            r12.f31303k = r0
            r12.f31316x = r14
            r12.f31317y = r10
            r12.f31306n = r3
            r12.f31295c = r8
            com.google.android.exoplayer2.Format r7 = r12.mo47144a()
        L_0x064f:
            r42 = r7
            r12 = 5
            goto L_0x06ad
        L_0x0653:
            r52 = r0
            r0 = 1684103988(0x64616334, float:1.6630663E22)
            if (r10 != r0) goto L_0x068f
            int r0 = r9 + 8
            r4.mo46935z(r0)
            java.lang.String r0 = java.lang.Integer.toString(r13)
            r7 = 1
            r4.mo46909A(r7)
            int r10 = r4.mo46925p()
            r10 = r10 & 32
            r12 = 5
            int r10 = r10 >> r12
            if (r10 != r7) goto L_0x0675
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0678
        L_0x0675:
            r7 = 44100(0xac44, float:6.1797E-41)
        L_0x0678:
            com.google.android.exoplayer2.Format$b r10 = new com.google.android.exoplayer2.Format$b
            r10.<init>()
            r10.f31293a = r0
            r10.f31303k = r2
            r0 = 2
            r10.f31316x = r0
            r10.f31317y = r7
            r10.f31306n = r3
            r10.f31295c = r8
            com.google.android.exoplayer2.Format r0 = r10.mo47144a()
            goto L_0x06ab
        L_0x068f:
            r12 = 5
            r0 = 1684305011(0x64647473, float:1.6856995E22)
            if (r10 != r0) goto L_0x06b3
            com.google.android.exoplayer2.Format$b r0 = new com.google.android.exoplayer2.Format$b
            r0.<init>()
            r0.mo47145b(r13)
            r0.f31303k = r11
            r0.f31316x = r5
            r0.f31317y = r15
            r0.f31306n = r3
            r0.f31295c = r8
            com.google.android.exoplayer2.Format r0 = r0.mo47144a()
        L_0x06ab:
            r42 = r0
        L_0x06ad:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 4
            goto L_0x074c
        L_0x06b3:
            r0 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r10 != r0) goto L_0x06d1
            int r0 = r1 + -8
            byte[] r7 = f41290a
            int r10 = r7.length
            int r10 = r10 + r0
            byte[] r10 = java.util.Arrays.copyOf(r7, r10)
            int r14 = r9 + 8
            r4.mo46935z(r14)
            int r7 = r7.length
            r4.mo46911b(r7, r0, r10)
            java.util.ArrayList r7 = com.google.android.play.core.appupdate.C15562d.m25200p(r10)
        L_0x06cf:
            r14 = 4
            goto L_0x06fd
        L_0x06d1:
            r0 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r10 != r0) goto L_0x0701
            int r0 = r1 + -12
            int r7 = r0 + 4
            byte[] r7 = new byte[r7]
            r10 = 102(0x66, float:1.43E-43)
            r14 = 0
            r7[r14] = r10
            r10 = 76
            r14 = 1
            r7[r14] = r10
            r10 = 97
            r14 = 2
            r7[r14] = r10
            r10 = 67
            r14 = 3
            r7[r14] = r10
            int r10 = r9 + 12
            r4.mo46935z(r10)
            r14 = 4
            r4.mo46911b(r14, r0, r7)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m25827of(r7)
        L_0x06fd:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x074e
        L_0x0701:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 4
            if (r10 != r0) goto L_0x074c
            int r5 = r1 + -12
            byte[] r7 = new byte[r5]
            int r10 = r9 + 12
            r4.mo46935z(r10)
            r10 = 0
            r4.mo46911b(r10, r5, r7)
            bj.r r5 = new bj.r
            r5.<init>((byte[]) r7)
            r10 = 9
            r5.mo46935z(r10)
            int r10 = r5.mo46925p()
            r15 = 20
            r5.mo46935z(r15)
            int r5 = r5.mo46928s()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r5 = android.util.Pair.create(r5, r10)
            java.lang.Object r10 = r5.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r15 = r10.intValue()
            java.lang.Object r5 = r5.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m25827of(r7)
            goto L_0x074e
        L_0x074c:
            r7 = r47
        L_0x074e:
            r47 = r7
            r0 = -1
        L_0x0751:
            r12 = 0
            goto L_0x07bf
        L_0x0754:
            r52 = r0
            r51 = r14
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
        L_0x075b:
            r12 = 5
            r14 = 4
            if (r10 != r7) goto L_0x0761
            r7 = r9
            goto L_0x0787
        L_0x0761:
            int r7 = r4.f30987b
        L_0x0763:
            int r10 = r7 - r9
            if (r10 >= r1) goto L_0x0786
            r4.mo46935z(r7)
            int r10 = r4.mo46912c()
            if (r10 <= 0) goto L_0x0772
            r0 = 1
            goto L_0x0773
        L_0x0772:
            r0 = 0
        L_0x0773:
            p513bj.C14075p.m21695g(r0, r6)
            int r0 = r4.mo46912c()
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r12) goto L_0x0780
            goto L_0x0787
        L_0x0780:
            int r7 = r7 + r10
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 5
            goto L_0x0763
        L_0x0786:
            r7 = -1
        L_0x0787:
            r0 = -1
            if (r7 == r0) goto L_0x0751
            android.util.Pair r7 = m31501a(r7, r4)
            java.lang.Object r10 = r7.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r7.second
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto L_0x07bd
            java.lang.String r11 = "audio/mp4a-latm"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x07b5
            bj.q r5 = new bj.q
            int r11 = r7.length
            r5.<init>((int) r11, (byte[]) r7)
            r12 = 0
            lh.a$a r5 = p611lh.C18162a.m30677c(r5, r12)
            int r15 = r5.f39725a
            int r11 = r5.f39726b
            java.lang.String r5 = r5.f39727c
            r51 = r5
            r5 = r11
            goto L_0x07b6
        L_0x07b5:
            r12 = 0
        L_0x07b6:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m25827of(r7)
            r47 = r7
            goto L_0x07be
        L_0x07bd:
            r12 = 0
        L_0x07be:
            r11 = r10
        L_0x07bf:
            int r9 = r9 + r1
            r10 = r48
            r12 = r49
            r7 = r50
            r14 = r51
            r0 = r52
            goto L_0x0537
        L_0x07cc:
            r50 = r7
            r48 = r10
            r49 = r12
            r51 = r14
            r0 = -1
            r12 = 0
            r14 = 4
            if (r42 != 0) goto L_0x07fe
            if (r11 == 0) goto L_0x07fe
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            r1.mo47145b(r13)
            r1.f31303k = r11
            r2 = r51
            r1.f31300h = r2
            r1.f31316x = r5
            r1.f31317y = r15
            r7 = r50
            r1.f31318z = r7
            r2 = r47
            r1.f31305m = r2
            r1.f31306n = r3
            r1.f31295c = r8
            com.google.android.exoplayer2.Format r15 = r1.mo47144a()
            goto L_0x0800
        L_0x07fe:
            r15 = r42
        L_0x0800:
            r40 = r8
            r3 = r45
            r10 = r48
            r9 = r49
            r6 = 3
            goto L_0x0a2a
        L_0x080b:
            r39 = r0
            r44 = r2
            r45 = r3
            r41 = r5
            r48 = r10
            r49 = r12
            r46 = r14
            r0 = -1
            r12 = 0
            r14 = 4
            int r1 = r49 + 8
            r2 = 8
            int r1 = r1 + r2
            r4.mo46935z(r1)
            r1 = 16
            r4.mo46909A(r1)
            int r2 = r4.mo46930u()
            int r3 = r4.mo46930u()
            r5 = 50
            r4.mo46909A(r5)
            int r5 = r4.f30987b
            r9 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 != r9) goto L_0x086d
            r10 = r48
            r9 = r49
            android.util.Pair r11 = m31503c(r4, r9, r10)
            if (r11 == 0) goto L_0x0866
            java.lang.Object r7 = r11.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = r58
            if (r0 != 0) goto L_0x0855
            r1 = 0
            goto L_0x085f
        L_0x0855:
            java.lang.Object r1 = r11.second
            wh.m r1 = (p701wh.C18693m) r1
            java.lang.String r1 = r1.f41413b
            com.google.android.exoplayer2.drm.DrmInitData r1 = r0.copyWithSchemeType(r1)
        L_0x085f:
            java.lang.Object r11 = r11.second
            wh.m r11 = (p701wh.C18693m) r11
            r46[r44] = r11
            goto L_0x0869
        L_0x0866:
            r0 = r58
            r1 = r0
        L_0x0869:
            r4.mo46935z(r5)
            goto L_0x0874
        L_0x086d:
            r0 = r58
            r10 = r48
            r9 = r49
            r1 = r0
        L_0x0874:
            r11 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r7 != r11) goto L_0x087c
            java.lang.String r11 = "video/mpeg"
            goto L_0x087d
        L_0x087c:
            r11 = 0
        L_0x087d:
            r22 = 1065353216(0x3f800000, float:1.0)
            r43 = r1
            r40 = r8
            r42 = r15
            r14 = r22
            r0 = 0
            r8 = 0
            r15 = 0
            r22 = r12
            r12 = -1
        L_0x088d:
            int r1 = r5 - r9
            if (r1 >= r10) goto L_0x09f6
            r4.mo46935z(r5)
            int r1 = r4.f30987b
            r47 = r0
            int r0 = r4.mo46912c()
            r48 = r12
            if (r0 != 0) goto L_0x08a7
            int r12 = r4.f30987b
            int r12 = r12 - r9
            if (r12 != r10) goto L_0x08a7
            goto L_0x09fa
        L_0x08a7:
            if (r0 <= 0) goto L_0x08ab
            r12 = 1
            goto L_0x08ac
        L_0x08ab:
            r12 = 0
        L_0x08ac:
            p513bj.C14075p.m21695g(r12, r6)
            int r12 = r4.mo46912c()
            r49 = r6
            r6 = 1635148611(0x61766343, float:2.8406573E20)
            if (r12 != r6) goto L_0x08d8
            if (r11 != 0) goto L_0x08be
            r6 = 1
            goto L_0x08bf
        L_0x08be:
            r6 = 0
        L_0x08bf:
            p513bj.C14075p.m21694f(r6)
            int r1 = r1 + 8
            r4.mo46935z(r1)
            cj.a r1 = p520cj.C14144a.m21898a(r4)
            java.util.List<byte[]> r6 = r1.f31159a
            int r11 = r1.f31160b
            if (r22 != 0) goto L_0x08d3
            float r14 = r1.f31163e
        L_0x08d3:
            java.lang.String r1 = r1.f31164f
            java.lang.String r12 = "video/avc"
            goto L_0x08f6
        L_0x08d8:
            r6 = 1752589123(0x68766343, float:4.6541328E24)
            if (r12 != r6) goto L_0x08fc
            if (r11 != 0) goto L_0x08e1
            r6 = 1
            goto L_0x08e2
        L_0x08e1:
            r6 = 0
        L_0x08e2:
            p513bj.C14075p.m21694f(r6)
            int r1 = r1 + 8
            r4.mo46935z(r1)
            cj.d r1 = p520cj.C14148d.m21904a(r4)
            java.util.List<byte[]> r6 = r1.f31179a
            int r11 = r1.f31180b
            java.lang.String r1 = r1.f31181c
            java.lang.String r12 = "video/hevc"
        L_0x08f6:
            r15 = r1
            r29 = r11
            r47 = r6
            goto L_0x0941
        L_0x08fc:
            r6 = 1685480259(0x64766343, float:1.8180206E22)
            if (r12 == r6) goto L_0x09e1
            r6 = 1685485123(0x64767643, float:1.8185683E22)
            if (r12 != r6) goto L_0x0908
            goto L_0x09e1
        L_0x0908:
            r6 = 1987076931(0x76706343, float:1.21891066E33)
            if (r12 != r6) goto L_0x0920
            if (r11 != 0) goto L_0x0911
            r1 = 1
            goto L_0x0912
        L_0x0911:
            r1 = 0
        L_0x0912:
            p513bj.C14075p.m21694f(r1)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 != r1) goto L_0x091d
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x092f
        L_0x091d:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x092f
        L_0x0920:
            r6 = 1635135811(0x61763143, float:2.8384055E20)
            if (r12 != r6) goto L_0x0931
            if (r11 != 0) goto L_0x0929
            r1 = 1
            goto L_0x092a
        L_0x0929:
            r1 = 0
        L_0x092a:
            p513bj.C14075p.m21694f(r1)
            java.lang.String r1 = "video/av01"
        L_0x092f:
            r12 = r1
            goto L_0x0941
        L_0x0931:
            r6 = 1681012275(0x64323633, float:1.3149704E22)
            if (r12 != r6) goto L_0x0945
            if (r11 != 0) goto L_0x093a
            r1 = 1
            goto L_0x093b
        L_0x093a:
            r1 = 0
        L_0x093b:
            p513bj.C14075p.m21694f(r1)
            java.lang.String r1 = "video/3gpp"
            goto L_0x092f
        L_0x0941:
            r6 = 1702061171(0x65736473, float:7.183675E22)
            goto L_0x0967
        L_0x0945:
            r6 = 1702061171(0x65736473, float:7.183675E22)
            if (r12 != r6) goto L_0x096d
            if (r11 != 0) goto L_0x094e
            r11 = 1
            goto L_0x094f
        L_0x094e:
            r11 = 0
        L_0x094f:
            p513bj.C14075p.m21694f(r11)
            android.util.Pair r1 = m31501a(r1, r4)
            java.lang.Object r11 = r1.first
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0967
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m25827of(r1)
            r47 = r1
        L_0x0967:
            r11 = r12
            r12 = r48
            r6 = 3
            goto L_0x09ef
        L_0x096d:
            r6 = 1885434736(0x70617370, float:2.7909473E29)
            if (r12 != r6) goto L_0x098a
            int r1 = r1 + 8
            r4.mo46935z(r1)
            int r1 = r4.mo46928s()
            int r6 = r4.mo46928s()
            float r1 = (float) r1
            float r6 = (float) r6
            float r1 = r1 / r6
            r14 = r1
            r12 = r48
            r6 = 3
            r22 = 1
            goto L_0x09ef
        L_0x098a:
            r6 = 1937126244(0x73763364, float:1.9506033E31)
            if (r12 != r6) goto L_0x09b6
            int r6 = r1 + 8
        L_0x0991:
            int r8 = r6 - r1
            if (r8 >= r0) goto L_0x09b3
            r4.mo46935z(r6)
            int r8 = r4.mo46912c()
            int r12 = r4.mo46912c()
            r50 = r1
            r1 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r12 != r1) goto L_0x09af
            byte[] r1 = r4.f30986a
            int r8 = r8 + r6
            byte[] r8 = java.util.Arrays.copyOfRange(r1, r6, r8)
            goto L_0x09df
        L_0x09af:
            int r6 = r6 + r8
            r1 = r50
            goto L_0x0991
        L_0x09b3:
            r6 = 3
            r8 = 0
            goto L_0x09ed
        L_0x09b6:
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r12 != r1) goto L_0x09df
            int r1 = r4.mo46925p()
            r6 = 3
            r4.mo46909A(r6)
            if (r1 != 0) goto L_0x09ed
            int r1 = r4.mo46925p()
            if (r1 == 0) goto L_0x09dd
            r12 = 1
            if (r1 == r12) goto L_0x09da
            r12 = 2
            if (r1 == r12) goto L_0x09d7
            if (r1 == r6) goto L_0x09d4
            goto L_0x09ed
        L_0x09d4:
            r48 = r6
            goto L_0x09ed
        L_0x09d7:
            r48 = 2
            goto L_0x09ed
        L_0x09da:
            r48 = 1
            goto L_0x09ed
        L_0x09dd:
            r12 = 0
            goto L_0x09ef
        L_0x09df:
            r6 = 3
            goto L_0x09ed
        L_0x09e1:
            r6 = 3
            cj.b r1 = p520cj.C14145b.m21899a(r4)
            if (r1 == 0) goto L_0x09ed
            java.lang.String r1 = r1.f31165a
            java.lang.String r11 = "video/dolby-vision"
            r15 = r1
        L_0x09ed:
            r12 = r48
        L_0x09ef:
            int r5 = r5 + r0
            r0 = r47
            r6 = r49
            goto L_0x088d
        L_0x09f6:
            r47 = r0
            r48 = r12
        L_0x09fa:
            r6 = 3
            if (r11 != 0) goto L_0x0a02
            r15 = r42
            r3 = r45
            goto L_0x0a2a
        L_0x0a02:
            com.google.android.exoplayer2.Format$b r0 = new com.google.android.exoplayer2.Format$b
            r0.<init>()
            r0.mo47145b(r13)
            r0.f31303k = r11
            r0.f31300h = r15
            r0.f31308p = r2
            r0.f31309q = r3
            r0.f31312t = r14
            r3 = r45
            r0.f31311s = r3
            r0.f31313u = r8
            r12 = r48
            r0.f31314v = r12
            r1 = r47
            r0.f31305m = r1
            r1 = r43
            r0.f31306n = r1
            com.google.android.exoplayer2.Format r15 = r0.mo47144a()
        L_0x0a2a:
            int r10 = r10 + r9
            r4.mo46935z(r10)
            int r2 = r44 + 1
            r1 = r58
            r12 = r27
            r9 = r30
            r10 = r33
            r6 = r35
            r0 = r39
            r8 = r40
            r5 = r41
            r14 = r46
            goto L_0x0200
        L_0x0a44:
            r39 = r0
            r41 = r5
            r35 = r6
            r30 = r9
            r33 = r10
            r46 = r14
            r42 = r15
            if (r59 != 0) goto L_0x0ad8
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r5 = r41
            wh.a$a r0 = r5.mo70183b(r0)
            if (r0 == 0) goto L_0x0ada
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            wh.a$b r0 = r0.mo70184c(r1)
            if (r0 != 0) goto L_0x0a6a
            r0 = 0
            goto L_0x0acd
        L_0x0a6a:
            bj.r r0 = r0.f41289b
            r1 = 8
            r0.mo46935z(r1)
            int r1 = r0.mo46912c()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0.mo46928s()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r7 = 0
        L_0x0a82:
            if (r7 >= r2) goto L_0x0ac9
            r6 = 1
            if (r1 != r6) goto L_0x0a8c
            long r8 = r0.mo46929t()
            goto L_0x0a90
        L_0x0a8c:
            long r8 = r0.mo46926q()
        L_0x0a90:
            r3[r7] = r8
            if (r1 != r6) goto L_0x0a99
            long r8 = r0.mo46919j()
            goto L_0x0a9e
        L_0x0a99:
            int r6 = r0.mo46912c()
            long r8 = (long) r6
        L_0x0a9e:
            r4[r7] = r8
            byte[] r6 = r0.f30986a
            int r8 = r0.f30987b
            int r9 = r8 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = 8
            int r8 = r8 << r10
            int r11 = r9 + 1
            r0.f30987b = r11
            byte r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r8
            short r6 = (short) r6
            r8 = 1
            if (r6 != r8) goto L_0x0ac1
            r6 = 2
            r0.mo46909A(r6)
            int r7 = r7 + 1
            goto L_0x0a82
        L_0x0ac1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0ac9:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
        L_0x0acd:
            if (r0 == 0) goto L_0x0ada
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            goto L_0x0adc
        L_0x0ad8:
            r5 = r41
        L_0x0ada:
            r0 = 0
            r1 = 0
        L_0x0adc:
            if (r42 != 0) goto L_0x0ae0
        L_0x0ade:
            r11 = 0
            goto L_0x0b03
        L_0x0ae0:
            wh.l r11 = new wh.l
            r2 = r39
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r19 = r2.longValue()
            r16 = r11
            r17 = r13
            r18 = r30
            r21 = r35
            r23 = r33
            r25 = r42
            r27 = r46
            r28 = r29
            r29 = r1
            r30 = r0
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
        L_0x0b03:
            r0 = r61
            java.lang.Object r1 = r0.apply(r11)
            wh.l r1 = (p701wh.C18692l) r1
            if (r1 != 0) goto L_0x0b12
            r3 = r55
            r2 = r32
            goto L_0x0b3b
        L_0x0b12:
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            wh.a$a r2 = r5.mo70183b(r2)
            r2.getClass()
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            wh.a$a r2 = r2.mo70183b(r3)
            r2.getClass()
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            wh.a$a r2 = r2.mo70183b(r3)
            r2.getClass()
            r3 = r55
            wh.o r1 = m31504d(r1, r2, r3)
            r2 = r32
            r2.add(r1)
        L_0x0b3b:
            int r4 = r31 + 1
            r0 = r54
            r1 = r58
            goto L_0x000a
        L_0x0b43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18673b.m31505e(wh.a$a, ph.p, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, com.google.common.base.e):java.util.ArrayList");
    }
}
