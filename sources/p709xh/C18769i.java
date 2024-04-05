package p709xh;

import java.util.Arrays;
import p513bj.C14075p;
import p513bj.C14077r;
import p644ph.C18371x;

/* renamed from: xh.i */
public final class C18769i extends C18766h {

    /* renamed from: n */
    public C18770a f41591n;

    /* renamed from: o */
    public int f41592o;

    /* renamed from: p */
    public boolean f41593p;

    /* renamed from: q */
    public C18371x.C18374c f41594q;

    /* renamed from: r */
    public C18371x.C18372a f41595r;

    /* renamed from: xh.i$a */
    public static final class C18770a {

        /* renamed from: a */
        public final C18371x.C18374c f41596a;

        /* renamed from: b */
        public final byte[] f41597b;

        /* renamed from: c */
        public final C18371x.C18373b[] f41598c;

        /* renamed from: d */
        public final int f41599d;

        public C18770a(C18371x.C18374c cVar, byte[] bArr, C18371x.C18373b[] bVarArr, int i) {
            this.f41596a = cVar;
            this.f41597b = bArr;
            this.f41598c = bVarArr;
            this.f41599d = i;
        }
    }

    /* renamed from: a */
    public final void mo70256a(long j) {
        this.f41582g = j;
        int i = 0;
        this.f41593p = j != 0;
        C18371x.C18374c cVar = this.f41594q;
        if (cVar != null) {
            i = cVar.f40349e;
        }
        this.f41592o = i;
    }

    /* renamed from: b */
    public final long mo70249b(C14077r rVar) {
        int i = 0;
        byte b = rVar.f30986a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        C18770a aVar = this.f41591n;
        C14075p.m21696h(aVar);
        int i2 = !aVar.f41598c[(b >> 1) & (255 >>> (8 - aVar.f41599d))].f40344a ? aVar.f41596a.f40349e : aVar.f41596a.f40350f;
        if (this.f41593p) {
            i = (this.f41592o + i2) / 4;
        }
        long j = (long) i;
        byte[] bArr = rVar.f30986a;
        int length = bArr.length;
        int i3 = rVar.f30988c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            rVar.mo46933x(copyOf.length, copyOf);
        } else {
            rVar.mo46934y(i3);
        }
        byte[] bArr2 = rVar.f30986a;
        int i4 = rVar.f30988c;
        bArr2[i4 - 4] = (byte) ((int) (j & 255));
        bArr2[i4 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr2[i4 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr2[i4 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f41593p = true;
        this.f41592o = i2;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x0391 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0393  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo70250c(p513bj.C14077r r18, long r19, p709xh.C18766h.C18767a r21) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            xh.i$a r3 = r0.f41591n
            r4 = 0
            if (r3 == 0) goto L_0x0011
            com.google.android.exoplayer2.Format r1 = r2.f41589a
            r1.getClass()
            return r4
        L_0x0011:
            ph.x$c r3 = r0.f41594q
            r5 = 4
            r6 = 1
            if (r3 != 0) goto L_0x0064
            p644ph.C18371x.m31056b(r6, r1, r4)
            r18.mo46917h()
            int r8 = r18.mo46925p()
            int r9 = r18.mo46917h()
            int r3 = r18.mo46914e()
            if (r3 > 0) goto L_0x002c
            r3 = -1
        L_0x002c:
            r10 = r3
            int r3 = r18.mo46914e()
            if (r3 > 0) goto L_0x0034
            r3 = -1
        L_0x0034:
            r11 = r3
            r18.mo46914e()
            int r3 = r18.mo46925p()
            r4 = r3 & 15
            double r6 = (double) r4
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r12, r6)
            int r4 = (int) r6
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> r5
            double r5 = (double) r3
            double r5 = java.lang.Math.pow(r12, r5)
            int r13 = (int) r5
            r18.mo46925p()
            byte[] r3 = r1.f30986a
            int r1 = r1.f30988c
            byte[] r14 = java.util.Arrays.copyOf(r3, r1)
            ph.x$c r1 = new ph.x$c
            r7 = r1
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.f41594q = r1
            goto L_0x006e
        L_0x0064:
            ph.x$a r7 = r0.f41595r
            if (r7 != 0) goto L_0x0071
            ph.x$a r1 = p644ph.C18371x.m31055a(r1, r6, r6)
            r0.f41595r = r1
        L_0x006e:
            r1 = 0
            goto L_0x038d
        L_0x0071:
            int r7 = r1.f30988c
            byte[] r8 = new byte[r7]
            byte[] r9 = r1.f30986a
            java.lang.System.arraycopy(r9, r4, r8, r4, r7)
            int r7 = r3.f40345a
            r9 = 5
            p644ph.C18371x.m31056b(r9, r1, r4)
            int r10 = r18.mo46925p()
            int r10 = r10 + r6
            ph.w r6 = new ph.w
            byte[] r11 = r1.f30986a
            r6.<init>(r11)
            int r1 = r1.f30987b
            int r1 = r1 * 8
            r6.mo69905c(r1)
        L_0x0093:
            r1 = 16
            r11 = 24
            if (r4 >= r10) goto L_0x017c
            int r12 = r6.mo69904b(r11)
            r13 = 5653314(0x564342, float:7.92198E-39)
            if (r12 != r13) goto L_0x0167
            int r1 = r6.mo69904b(r1)
            int r11 = r6.mo69904b(r11)
            long[] r12 = new long[r11]
            boolean r13 = r6.mo69903a()
            if (r13 != 0) goto L_0x00ea
            boolean r13 = r6.mo69903a()
            r16 = 0
            r14 = r16
        L_0x00ba:
            if (r14 >= r11) goto L_0x00e8
            if (r13 == 0) goto L_0x00d5
            boolean r5 = r6.mo69903a()
            if (r5 == 0) goto L_0x00cf
            int r5 = r6.mo69904b(r9)
            int r5 = r5 + 1
            r15 = r3
            long r2 = (long) r5
            r12[r14] = r2
            goto L_0x00e1
        L_0x00cf:
            r15 = r3
            r2 = 0
            r12[r14] = r2
            goto L_0x00e1
        L_0x00d5:
            r15 = r3
            r2 = 0
            int r5 = r6.mo69904b(r9)
            int r5 = r5 + 1
            long r2 = (long) r5
            r12[r14] = r2
        L_0x00e1:
            int r14 = r14 + 1
            r5 = 4
            r2 = r21
            r3 = r15
            goto L_0x00ba
        L_0x00e8:
            r15 = r3
            goto L_0x0113
        L_0x00ea:
            r15 = r3
            int r2 = r6.mo69904b(r9)
            int r2 = r2 + 1
            r3 = 0
        L_0x00f2:
            if (r3 >= r11) goto L_0x0112
            int r5 = r11 - r3
            r9 = 0
        L_0x00f7:
            if (r5 <= 0) goto L_0x00fe
            int r9 = r9 + 1
            int r5 = r5 >>> 1
            goto L_0x00f7
        L_0x00fe:
            int r5 = r6.mo69904b(r9)
            r9 = 0
        L_0x0103:
            if (r9 >= r5) goto L_0x010f
            if (r3 >= r11) goto L_0x010f
            long r13 = (long) r2
            r12[r3] = r13
            int r3 = r3 + 1
            int r9 = r9 + 1
            goto L_0x0103
        L_0x010f:
            int r2 = r2 + 1
            goto L_0x00f2
        L_0x0112:
            r5 = 4
        L_0x0113:
            int r2 = r6.mo69904b(r5)
            r3 = 2
            if (r2 > r3) goto L_0x0159
            r9 = 1
            if (r2 == r9) goto L_0x011f
            if (r2 != r3) goto L_0x0150
        L_0x011f:
            r3 = 32
            r6.mo69905c(r3)
            r6.mo69905c(r3)
            int r3 = r6.mo69904b(r5)
            int r3 = r3 + r9
            r6.mo69905c(r9)
            if (r2 != r9) goto L_0x0147
            if (r1 == 0) goto L_0x0144
            long r11 = (long) r11
            long r1 = (long) r1
            double r11 = (double) r11
            double r1 = (double) r1
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 / r1
            double r1 = java.lang.Math.pow(r11, r13)
            double r1 = java.lang.Math.floor(r1)
            long r1 = (long) r1
            goto L_0x014a
        L_0x0144:
            r1 = 0
            goto L_0x014a
        L_0x0147:
            long r11 = (long) r11
            long r1 = (long) r1
            long r1 = r1 * r11
        L_0x014a:
            long r11 = (long) r3
            long r11 = r11 * r1
            int r1 = (int) r11
            r6.mo69905c(r1)
        L_0x0150:
            int r4 = r4 + 1
            r5 = 4
            r9 = 5
            r2 = r21
            r3 = r15
            goto L_0x0093
        L_0x0159:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r3 = 53
            java.lang.String r4 = "lookup type greater than 2 not decodable: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r3, r4, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0167:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            int r2 = r6.f40341c
            int r2 = r2 * 8
            int r3 = r6.f40342d
            int r2 = r2 + r3
            r3 = 66
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r3, r4, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x017c:
            r15 = r3
            r2 = 6
            int r3 = r6.mo69904b(r2)
            int r3 = r3 + 1
            r4 = 0
        L_0x0185:
            if (r4 >= r3) goto L_0x0198
            int r5 = r6.mo69904b(r1)
            if (r5 != 0) goto L_0x0190
            int r4 = r4 + 1
            goto L_0x0185
        L_0x0190:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0198:
            int r3 = r6.mo69904b(r2)
            r4 = 1
            int r3 = r3 + r4
            r5 = 0
        L_0x019f:
            r9 = 52
            r10 = 3
            if (r5 >= r3) goto L_0x024e
            int r2 = r6.mo69904b(r1)
            if (r2 == 0) goto L_0x0220
            if (r2 != r4) goto L_0x0214
            r2 = 5
            int r2 = r6.mo69904b(r2)
            int[] r4 = new int[r2]
            r9 = 0
            r11 = -1
        L_0x01b5:
            if (r9 >= r2) goto L_0x01c4
            r12 = 4
            int r12 = r6.mo69904b(r12)
            r4[r9] = r12
            if (r12 <= r11) goto L_0x01c1
            r11 = r12
        L_0x01c1:
            int r9 = r9 + 1
            goto L_0x01b5
        L_0x01c4:
            int r11 = r11 + 1
            int[] r9 = new int[r11]
            r12 = 0
        L_0x01c9:
            if (r12 >= r11) goto L_0x01f6
            int r10 = r6.mo69904b(r10)
            r13 = 1
            int r10 = r10 + 1
            r9[r12] = r10
            r10 = 2
            int r10 = r6.mo69904b(r10)
            r14 = 8
            if (r10 <= 0) goto L_0x01e0
            r6.mo69905c(r14)
        L_0x01e0:
            r16 = 0
            r1 = r16
        L_0x01e4:
            int r13 = r13 << r10
            if (r1 >= r13) goto L_0x01f0
            r6.mo69905c(r14)
            int r1 = r1 + 1
            r14 = 8
            r13 = 1
            goto L_0x01e4
        L_0x01f0:
            int r12 = r12 + 1
            r10 = 3
            r1 = 16
            goto L_0x01c9
        L_0x01f6:
            r1 = 2
            r6.mo69905c(r1)
            r1 = 4
            int r1 = r6.mo69904b(r1)
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0202:
            if (r10 >= r2) goto L_0x0246
            r13 = r4[r10]
            r13 = r9[r13]
            int r11 = r11 + r13
        L_0x0209:
            if (r12 >= r11) goto L_0x0211
            r6.mo69905c(r1)
            int r12 = r12 + 1
            goto L_0x0209
        L_0x0211:
            int r10 = r10 + 1
            goto L_0x0202
        L_0x0214:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r3 = "floor type greater than 1 not decodable: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r9, r3, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0220:
            r1 = 8
            r6.mo69905c(r1)
            r2 = 16
            r6.mo69905c(r2)
            r6.mo69905c(r2)
            r2 = 6
            r6.mo69905c(r2)
            r6.mo69905c(r1)
            r2 = 4
            int r2 = r6.mo69904b(r2)
            int r2 = r2 + 1
            r4 = 0
        L_0x023c:
            if (r4 >= r2) goto L_0x0246
            r6.mo69905c(r1)
            int r4 = r4 + 1
            r1 = 8
            goto L_0x023c
        L_0x0246:
            int r5 = r5 + 1
            r2 = 6
            r4 = 1
            r1 = 16
            goto L_0x019f
        L_0x024e:
            int r1 = r6.mo69904b(r2)
            r3 = 1
            int r1 = r1 + r3
            r4 = 0
        L_0x0255:
            if (r4 >= r1) goto L_0x02bb
            r5 = 16
            int r10 = r6.mo69904b(r5)
            r5 = 2
            if (r10 > r5) goto L_0x02b3
            r5 = 24
            r6.mo69905c(r5)
            r6.mo69905c(r5)
            r6.mo69905c(r5)
            int r2 = r6.mo69904b(r2)
            int r2 = r2 + r3
            r3 = 8
            r6.mo69905c(r3)
            int[] r5 = new int[r2]
            r10 = 0
        L_0x0278:
            if (r10 >= r2) goto L_0x0294
            r11 = 3
            int r11 = r6.mo69904b(r11)
            boolean r12 = r6.mo69903a()
            if (r12 == 0) goto L_0x028b
            r12 = 5
            int r12 = r6.mo69904b(r12)
            goto L_0x028c
        L_0x028b:
            r12 = 0
        L_0x028c:
            int r12 = r12 * 8
            int r12 = r12 + r11
            r5[r10] = r12
            int r10 = r10 + 1
            goto L_0x0278
        L_0x0294:
            r10 = 0
        L_0x0295:
            if (r10 >= r2) goto L_0x02ae
            r11 = 0
        L_0x0298:
            if (r11 >= r3) goto L_0x02a9
            r12 = r5[r10]
            r13 = 1
            int r13 = r13 << r11
            r12 = r12 & r13
            if (r12 == 0) goto L_0x02a4
            r6.mo69905c(r3)
        L_0x02a4:
            int r11 = r11 + 1
            r3 = 8
            goto L_0x0298
        L_0x02a9:
            int r10 = r10 + 1
            r3 = 8
            goto L_0x0295
        L_0x02ae:
            int r4 = r4 + 1
            r2 = 6
            r3 = 1
            goto L_0x0255
        L_0x02b3:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "residueType greater than 2 is not decodable"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02bb:
            int r1 = r6.mo69904b(r2)
            int r1 = r1 + 1
            r2 = 0
        L_0x02c2:
            if (r2 >= r1) goto L_0x0350
            r3 = 16
            int r4 = r6.mo69904b(r3)
            if (r4 == 0) goto L_0x02e3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            java.lang.String r5 = "mapping type other than 0 not supported: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "VorbisUtil"
            android.util.Log.e(r4, r3)
            goto L_0x0344
        L_0x02e3:
            boolean r3 = r6.mo69903a()
            if (r3 == 0) goto L_0x02f1
            r3 = 4
            int r3 = r6.mo69904b(r3)
            int r3 = r3 + 1
            goto L_0x02f2
        L_0x02f1:
            r3 = 1
        L_0x02f2:
            boolean r4 = r6.mo69903a()
            if (r4 == 0) goto L_0x031f
            r4 = 8
            int r4 = r6.mo69904b(r4)
            int r4 = r4 + 1
            r5 = 0
        L_0x0301:
            if (r5 >= r4) goto L_0x031f
            int r10 = r7 + -1
            r11 = 0
            r12 = r10
        L_0x0307:
            if (r12 <= 0) goto L_0x030e
            int r11 = r11 + 1
            int r12 = r12 >>> 1
            goto L_0x0307
        L_0x030e:
            r6.mo69905c(r11)
            r11 = 0
        L_0x0312:
            if (r10 <= 0) goto L_0x0319
            int r11 = r11 + 1
            int r10 = r10 >>> 1
            goto L_0x0312
        L_0x0319:
            r6.mo69905c(r11)
            int r5 = r5 + 1
            goto L_0x0301
        L_0x031f:
            r4 = 2
            int r4 = r6.mo69904b(r4)
            if (r4 != 0) goto L_0x0348
            r4 = 1
            if (r3 <= r4) goto L_0x0333
            r4 = 0
        L_0x032a:
            r5 = 4
            if (r4 >= r7) goto L_0x0333
            r6.mo69905c(r5)
            int r4 = r4 + 1
            goto L_0x032a
        L_0x0333:
            r4 = 0
        L_0x0334:
            if (r4 >= r3) goto L_0x0344
            r5 = 8
            r6.mo69905c(r5)
            r6.mo69905c(r5)
            r6.mo69905c(r5)
            int r4 = r4 + 1
            goto L_0x0334
        L_0x0344:
            int r2 = r2 + 1
            goto L_0x02c2
        L_0x0348:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "to reserved bits must be zero after mapping coupling steps"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0350:
            r1 = 6
            int r1 = r6.mo69904b(r1)
            int r1 = r1 + 1
            ph.x$b[] r2 = new p644ph.C18371x.C18373b[r1]
            r3 = 0
        L_0x035a:
            if (r3 >= r1) goto L_0x0377
            boolean r4 = r6.mo69903a()
            r5 = 16
            r6.mo69904b(r5)
            r6.mo69904b(r5)
            r7 = 8
            r6.mo69904b(r7)
            ph.x$b r7 = new ph.x$b
            r7.<init>(r4)
            r2[r3] = r7
            int r3 = r3 + 1
            goto L_0x035a
        L_0x0377:
            boolean r3 = r6.mo69903a()
            if (r3 == 0) goto L_0x03c9
            int r1 = r1 + -1
            r3 = 0
        L_0x0380:
            if (r1 <= 0) goto L_0x0387
            int r3 = r3 + 1
            int r1 = r1 >>> 1
            goto L_0x0380
        L_0x0387:
            xh.i$a r1 = new xh.i$a
            r4 = r15
            r1.<init>(r4, r8, r2, r3)
        L_0x038d:
            r0.f41591n = r1
            if (r1 != 0) goto L_0x0393
            r1 = 1
            return r1
        L_0x0393:
            ph.x$c r2 = r1.f41596a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r2.f40351g
            r3.add(r4)
            byte[] r1 = r1.f41597b
            r3.add(r1)
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            java.lang.String r4 = "audio/vorbis"
            r1.f31303k = r4
            int r4 = r2.f40348d
            r1.f31298f = r4
            int r4 = r2.f40347c
            r1.f31299g = r4
            int r4 = r2.f40345a
            r1.f31316x = r4
            int r2 = r2.f40346b
            r1.f31317y = r2
            r1.f31305m = r3
            com.google.android.exoplayer2.Format r1 = r1.mo47144a()
            r2 = r21
            r2.f41589a = r1
            r1 = 1
            return r1
        L_0x03c9:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p709xh.C18769i.mo70250c(bj.r, long, xh.h$a):boolean");
    }

    /* renamed from: d */
    public final void mo70251d(boolean z) {
        super.mo70251d(z);
        if (z) {
            this.f41591n = null;
            this.f41594q = null;
            this.f41595r = null;
        }
        this.f41592o = 0;
        this.f41593p = false;
    }
}
