package p701wh;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import p513bj.C14049b0;
import p513bj.C14068n;
import p513bj.C14077r;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18364t;
import p644ph.C18367u;
import p644ph.C18368v;
import p701wh.C18670a;

/* renamed from: wh.h */
public final class C18685h implements C18349h, C18364t {

    /* renamed from: a */
    public final int f41362a;

    /* renamed from: b */
    public final C14077r f41363b;

    /* renamed from: c */
    public final C14077r f41364c;

    /* renamed from: d */
    public final C14077r f41365d;

    /* renamed from: e */
    public final C14077r f41366e;

    /* renamed from: f */
    public final ArrayDeque<C18670a.C18671a> f41367f;

    /* renamed from: g */
    public final C18689j f41368g;

    /* renamed from: h */
    public final ArrayList f41369h;

    /* renamed from: i */
    public int f41370i;

    /* renamed from: j */
    public int f41371j;

    /* renamed from: k */
    public long f41372k;

    /* renamed from: l */
    public int f41373l;

    /* renamed from: m */
    public C14077r f41374m;

    /* renamed from: n */
    public int f41375n;

    /* renamed from: o */
    public int f41376o;

    /* renamed from: p */
    public int f41377p;

    /* renamed from: q */
    public int f41378q;

    /* renamed from: r */
    public C18351j f41379r;

    /* renamed from: s */
    public C18686a[] f41380s;

    /* renamed from: t */
    public long[][] f41381t;

    /* renamed from: u */
    public int f41382u;

    /* renamed from: v */
    public long f41383v;

    /* renamed from: w */
    public int f41384w;

    /* renamed from: x */
    public MotionPhotoMetadata f41385x;

    /* renamed from: wh.h$a */
    public static final class C18686a {

        /* renamed from: a */
        public final C18692l f41386a;

        /* renamed from: b */
        public final C18695o f41387b;

        /* renamed from: c */
        public final C18368v f41388c;

        /* renamed from: d */
        public int f41389d;

        public C18686a(C18692l lVar, C18695o oVar, C18368v vVar) {
            this.f41386a = lVar;
            this.f41387b = oVar;
            this.f41388c = vVar;
        }
    }

    public C18685h() {
        this(0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0457 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0666 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0006 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r39, p644ph.C18363s r40) throws java.io.IOException {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r2 = r40
        L_0x0006:
            int r3 = r1.f41370i
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r5 = -1
            r7 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            if (r3 == 0) goto L_0x0459
            r15 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r13) goto L_0x03c4
            r17 = 8
            if (r3 == r12) goto L_0x0247
            r4 = 3
            if (r3 != r4) goto L_0x0241
            wh.j r3 = r1.f41368g
            java.util.ArrayList r15 = r1.f41369h
            int r8 = r3.f41396b
            if (r8 == 0) goto L_0x021d
            if (r8 == r13) goto L_0x01ec
            r5 = 2192(0x890, float:3.072E-42)
            r6 = 2819(0xb03, float:3.95E-42)
            r11 = 2820(0xb04, float:3.952E-42)
            if (r8 == r12) goto L_0x0175
            if (r8 != r4) goto L_0x016f
            long r16 = r39.getPosition()
            long r22 = r39.getLength()
            long r24 = r39.getPosition()
            long r22 = r22 - r24
            int r8 = r3.f41397c
            long r9 = (long) r8
            long r8 = r22 - r9
            int r8 = (int) r8
            bj.r r9 = new bj.r
            r9.<init>((int) r8)
            byte[] r10 = r9.f30986a
            r0.readFully(r10, r14, r8)
            r0 = r14
        L_0x0052:
            java.util.ArrayList r8 = r3.f41395a
            int r8 = r8.size()
            if (r0 >= r8) goto L_0x0169
            java.util.ArrayList r8 = r3.f41395a
            java.lang.Object r8 = r8.get(r0)
            wh.j$a r8 = (p701wh.C18689j.C18690a) r8
            r22 = r15
            long r14 = r8.f41398a
            long r14 = r14 - r16
            int r14 = (int) r14
            r9.mo46935z(r14)
            r9.mo46909A(r7)
            int r14 = r9.mo46914e()
            java.lang.String r15 = r9.mo46922m(r14)
            int r19 = r15.hashCode()
            switch(r19) {
                case -1711564334: goto L_0x00ab;
                case -1332107749: goto L_0x00a0;
                case -1251387154: goto L_0x0095;
                case -830665521: goto L_0x008a;
                case 1760745220: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x00b6
        L_0x007f:
            java.lang.String r10 = "Super_SlowMotion_BGM"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x0088
            goto L_0x00b6
        L_0x0088:
            r10 = r7
            goto L_0x00b7
        L_0x008a:
            java.lang.String r10 = "Super_SlowMotion_Deflickering_On"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x0093
            goto L_0x00b6
        L_0x0093:
            r10 = r4
            goto L_0x00b7
        L_0x0095:
            java.lang.String r10 = "Super_SlowMotion_Data"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x009e
            goto L_0x00b6
        L_0x009e:
            r10 = r12
            goto L_0x00b7
        L_0x00a0:
            java.lang.String r10 = "Super_SlowMotion_Edit_Data"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x00a9
            goto L_0x00b6
        L_0x00a9:
            r10 = r13
            goto L_0x00b7
        L_0x00ab:
            java.lang.String r10 = "SlowMotion_Data"
            boolean r10 = r15.equals(r10)
            if (r10 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r10 = 0
            goto L_0x00b7
        L_0x00b6:
            r10 = -1
        L_0x00b7:
            if (r10 == 0) goto L_0x00d3
            if (r10 == r13) goto L_0x00d1
            if (r10 == r12) goto L_0x00ce
            if (r10 == r4) goto L_0x00cc
            if (r10 != r7) goto L_0x00c4
            r10 = 2817(0xb01, float:3.947E-42)
            goto L_0x00d4
        L_0x00c4:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Invalid SEF name"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00cc:
            r10 = r11
            goto L_0x00d4
        L_0x00ce:
            r10 = 2816(0xb00, float:3.946E-42)
            goto L_0x00d4
        L_0x00d1:
            r10 = r6
            goto L_0x00d4
        L_0x00d3:
            r10 = r5
        L_0x00d4:
            int r8 = r8.f41399b
            int r14 = r14 + 8
            int r8 = r8 - r14
            if (r10 == r5) goto L_0x00f1
            r14 = 2816(0xb00, float:3.946E-42)
            if (r10 == r14) goto L_0x00ee
            r8 = 2817(0xb01, float:3.947E-42)
            if (r10 == r8) goto L_0x00ee
            if (r10 == r6) goto L_0x00ee
            if (r10 != r11) goto L_0x00e8
            goto L_0x00ee
        L_0x00e8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ee:
            r8 = r22
            goto L_0x0162
        L_0x00f1:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r8 = r9.mo46922m(r8)
            com.google.common.base.p r10 = p701wh.C18689j.f41394e
            java.util.List r8 = r10.mo55784a(r8)
            r15 = 0
        L_0x0101:
            int r10 = r8.size()
            if (r15 >= r10) goto L_0x0158
            com.google.common.base.p r10 = p701wh.C18689j.f41393d
            java.lang.Object r19 = r8.get(r15)
            r7 = r19
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.util.List r7 = r10.mo55784a(r7)
            int r10 = r7.size()
            if (r10 != r4) goto L_0x0152
            r10 = 0
            java.lang.Object r19 = r7.get(r10)     // Catch:{ NumberFormatException -> 0x014b }
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ NumberFormatException -> 0x014b }
            long r26 = java.lang.Long.parseLong(r19)     // Catch:{ NumberFormatException -> 0x014b }
            java.lang.Object r19 = r7.get(r13)     // Catch:{ NumberFormatException -> 0x014b }
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ NumberFormatException -> 0x014b }
            long r28 = java.lang.Long.parseLong(r19)     // Catch:{ NumberFormatException -> 0x014b }
            java.lang.Object r7 = r7.get(r12)     // Catch:{ NumberFormatException -> 0x014b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x014b }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x014b }
            int r7 = r7 - r13
            int r30 = r13 << r7
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r7 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment     // Catch:{ NumberFormatException -> 0x014b }
            r25 = r7
            r25.<init>(r26, r28, r30)     // Catch:{ NumberFormatException -> 0x014b }
            r14.add(r7)     // Catch:{ NumberFormatException -> 0x014b }
            int r15 = r15 + 1
            r7 = 4
            goto L_0x0101
        L_0x014b:
            r0 = move-exception
            com.google.android.exoplayer2.ParserException r2 = new com.google.android.exoplayer2.ParserException
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x0152:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r0.<init>()
            throw r0
        L_0x0158:
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData r7 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData
            r7.<init>(r14)
            r8 = r22
            r8.add(r7)
        L_0x0162:
            int r0 = r0 + 1
            r15 = r8
            r7 = 4
            r14 = 0
            goto L_0x0052
        L_0x0169:
            r14 = 0
            r2.f40327a = r14
            goto L_0x0233
        L_0x016f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0175:
            long r7 = r39.getLength()
            int r9 = r3.f41397c
            int r9 = r9 + -12
            r14 = 8
            int r9 = r9 - r14
            bj.r r14 = new bj.r
            r14.<init>((int) r9)
            byte[] r15 = r14.f30986a
            r10 = 0
            r0.readFully(r15, r10, r9)
            r0 = 0
        L_0x018c:
            int r15 = r9 / 12
            if (r0 >= r15) goto L_0x01cf
            r14.mo46909A(r12)
            short r15 = r14.mo46915f()
            if (r15 == r5) goto L_0x01ab
            r5 = 2816(0xb00, float:3.946E-42)
            if (r15 == r5) goto L_0x01ab
            r5 = 2817(0xb01, float:3.947E-42)
            if (r15 == r5) goto L_0x01ad
            if (r15 == r6) goto L_0x01ad
            if (r15 == r11) goto L_0x01ad
            r15 = 8
            r14.mo46909A(r15)
            goto L_0x01c6
        L_0x01ab:
            r5 = 2817(0xb01, float:3.947E-42)
        L_0x01ad:
            int r15 = r3.f41397c
            long r5 = (long) r15
            long r5 = r7 - r5
            int r15 = r14.mo46914e()
            long r10 = (long) r15
            long r5 = r5 - r10
            int r10 = r14.mo46914e()
            java.util.ArrayList r11 = r3.f41395a
            wh.j$a r15 = new wh.j$a
            r15.<init>(r10, r5)
            r11.add(r15)
        L_0x01c6:
            int r0 = r0 + 1
            r5 = 2192(0x890, float:3.072E-42)
            r6 = 2819(0xb03, float:3.95E-42)
            r11 = 2820(0xb04, float:3.952E-42)
            goto L_0x018c
        L_0x01cf:
            java.util.ArrayList r0 = r3.f41395a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01dc
            r5 = 0
            r2.f40327a = r5
            goto L_0x0233
        L_0x01dc:
            r3.f41396b = r4
            java.util.ArrayList r0 = r3.f41395a
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            wh.j$a r0 = (p701wh.C18689j.C18690a) r0
            long r5 = r0.f41398a
            r2.f40327a = r5
            goto L_0x0233
        L_0x01ec:
            r4 = r14
            bj.r r5 = new bj.r
            r6 = 8
            r5.<init>((int) r6)
            byte[] r7 = r5.f30986a
            r0.readFully(r7, r4, r6)
            int r4 = r5.mo46914e()
            int r4 = r4 + r6
            r3.f41397c = r4
            int r4 = r5.mo46912c()
            r5 = 1397048916(0x53454654, float:8.4728847E11)
            if (r4 == r5) goto L_0x020e
            r4 = 0
            r2.f40327a = r4
            goto L_0x0233
        L_0x020e:
            long r4 = r39.getPosition()
            int r0 = r3.f41397c
            int r0 = r0 + -12
            long r6 = (long) r0
            long r4 = r4 - r6
            r2.f40327a = r4
            r3.f41396b = r12
            goto L_0x0233
        L_0x021d:
            long r7 = r39.getLength()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x022d
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x022a
            goto L_0x022d
        L_0x022a:
            long r4 = r7 - r17
            goto L_0x022f
        L_0x022d:
            r4 = 0
        L_0x022f:
            r2.f40327a = r4
            r3.f41396b = r13
        L_0x0233:
            long r2 = r2.f40327a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0240
            r0 = 0
            r1.f41370i = r0
            r1.f41373l = r0
        L_0x0240:
            return r13
        L_0x0241:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0247:
            long r3 = r39.getPosition()
            int r5 = r1.f41375n
            r6 = -1
            if (r5 != r6) goto L_0x02c1
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = r5
            r26 = r24
            r28 = r26
            r11 = r13
            r14 = r11
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0260:
            wh.h$a[] r10 = r1.f41380s
            int r22 = p513bj.C14049b0.f30913a
            int r12 = r10.length
            if (r7 >= r12) goto L_0x02a9
            r10 = r10[r7]
            int r12 = r10.f41389d
            wh.o r10 = r10.f41387b
            int r13 = r10.f41436b
            if (r12 != r13) goto L_0x0272
            goto L_0x02a4
        L_0x0272:
            long[] r10 = r10.f41437c
            r31 = r10[r12]
            long[][] r10 = r1.f41381t
            r10 = r10[r7]
            r12 = r10[r12]
            long r31 = r31 - r3
            r20 = 0
            int r10 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r10 < 0) goto L_0x028b
            int r10 = (r31 > r15 ? 1 : (r31 == r15 ? 0 : -1))
            if (r10 < 0) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            r10 = 0
            goto L_0x028c
        L_0x028b:
            r10 = 1
        L_0x028c:
            if (r10 != 0) goto L_0x0290
            if (r14 != 0) goto L_0x0296
        L_0x0290:
            if (r10 != r14) goto L_0x029c
            int r33 = (r31 > r28 ? 1 : (r31 == r28 ? 0 : -1))
            if (r33 >= 0) goto L_0x029c
        L_0x0296:
            r9 = r7
            r14 = r10
            r26 = r12
            r28 = r31
        L_0x029c:
            int r31 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r31 >= 0) goto L_0x02a4
            r8 = r7
            r11 = r10
            r24 = r12
        L_0x02a4:
            int r7 = r7 + 1
            r12 = 2
            r13 = 1
            goto L_0x0260
        L_0x02a9:
            int r5 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x02b8
            if (r11 == 0) goto L_0x02b8
            r5 = 10485760(0xa00000, double:5.180654E-317)
            long r24 = r24 + r5
            int r5 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r5 >= 0) goto L_0x02b9
        L_0x02b8:
            r8 = r9
        L_0x02b9:
            r1.f41375n = r8
            r5 = -1
            if (r8 != r5) goto L_0x02c1
            r8 = -1
            goto L_0x03c3
        L_0x02c1:
            wh.h$a[] r5 = r1.f41380s
            int r6 = p513bj.C14049b0.f30913a
            int r6 = r1.f41375n
            r5 = r5[r6]
            ph.v r6 = r5.f41388c
            int r7 = r5.f41389d
            wh.o r8 = r5.f41387b
            long[] r9 = r8.f41437c
            r10 = r9[r7]
            int[] r8 = r8.f41438d
            r8 = r8[r7]
            long r3 = r10 - r3
            int r9 = r1.f41376o
            long r12 = (long) r9
            long r3 = r3 + r12
            r12 = 0
            int r9 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x03c0
            int r9 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x02e9
            goto L_0x03c0
        L_0x02e9:
            wh.l r2 = r5.f41386a
            int r2 = r2.f41407g
            r9 = 1
            if (r2 != r9) goto L_0x02f4
            long r3 = r3 + r17
            int r8 = r8 + -8
        L_0x02f4:
            int r2 = (int) r3
            r0.mo69879j(r2)
            wh.l r2 = r5.f41386a
            int r3 = r2.f41410j
            if (r3 == 0) goto L_0x035c
            bj.r r2 = r1.f41364c
            byte[] r2 = r2.f30986a
            r4 = 0
            r2[r4] = r4
            r9 = 1
            r2[r9] = r4
            r9 = 2
            r2[r9] = r4
            int r4 = 4 - r3
        L_0x030d:
            int r9 = r1.f41377p
            if (r9 >= r8) goto L_0x0399
            int r9 = r1.f41378q
            if (r9 != 0) goto L_0x0347
            r0.readFully(r2, r4, r3)
            int r9 = r1.f41376o
            int r9 = r9 + r3
            r1.f41376o = r9
            bj.r r9 = r1.f41364c
            r10 = 0
            r9.mo46935z(r10)
            bj.r r9 = r1.f41364c
            int r9 = r9.mo46912c()
            if (r9 < 0) goto L_0x033f
            r1.f41378q = r9
            bj.r r9 = r1.f41363b
            r9.mo46935z(r10)
            bj.r r9 = r1.f41363b
            r11 = 4
            r6.mo69899d(r11, r9)
            int r9 = r1.f41377p
            int r9 = r9 + r11
            r1.f41377p = r9
            int r8 = r8 + r4
            goto L_0x030d
        L_0x033f:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Invalid NAL length"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0347:
            r10 = 0
            int r9 = r6.mo69900e(r0, r9, r10)
            int r11 = r1.f41376o
            int r11 = r11 + r9
            r1.f41376o = r11
            int r11 = r1.f41377p
            int r11 = r11 + r9
            r1.f41377p = r11
            int r11 = r1.f41378q
            int r11 = r11 - r9
            r1.f41378q = r11
            goto L_0x030d
        L_0x035c:
            com.google.android.exoplayer2.Format r2 = r2.f41406f
            java.lang.String r2 = r2.sampleMimeType
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x037e
            int r2 = r1.f41377p
            if (r2 != 0) goto L_0x037c
            bj.r r2 = r1.f41365d
            p611lh.C18165c.m30679a(r8, r2)
            bj.r r2 = r1.f41365d
            r3 = 7
            r6.mo69899d(r3, r2)
            int r2 = r1.f41377p
            int r2 = r2 + r3
            r1.f41377p = r2
        L_0x037c:
            int r8 = r8 + 7
        L_0x037e:
            int r2 = r1.f41377p
            if (r2 >= r8) goto L_0x0399
            int r2 = r8 - r2
            r3 = 0
            int r2 = r6.mo69900e(r0, r2, r3)
            int r3 = r1.f41376o
            int r3 = r3 + r2
            r1.f41376o = r3
            int r3 = r1.f41377p
            int r3 = r3 + r2
            r1.f41377p = r3
            int r3 = r1.f41378q
            int r3 = r3 - r2
            r1.f41378q = r3
            goto L_0x037e
        L_0x0399:
            r35 = r8
            wh.o r0 = r5.f41387b
            long[] r2 = r0.f41440f
            r32 = r2[r7]
            int[] r0 = r0.f41441g
            r34 = r0[r7]
            r36 = 0
            r37 = 0
            r31 = r6
            r31.mo47754c(r32, r34, r35, r36, r37)
            int r0 = r5.f41389d
            r2 = 1
            int r0 = r0 + r2
            r5.f41389d = r0
            r0 = -1
            r1.f41375n = r0
            r0 = 0
            r1.f41376o = r0
            r1.f41377p = r0
            r1.f41378q = r0
            r8 = 0
            goto L_0x03c3
        L_0x03c0:
            r2.f40327a = r10
            r8 = 1
        L_0x03c3:
            return r8
        L_0x03c4:
            long r5 = r1.f41372k
            int r3 = r1.f41373l
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r39.getPosition()
            long r7 = r7 + r5
            bj.r r3 = r1.f41374m
            if (r3 == 0) goto L_0x0436
            byte[] r9 = r3.f30986a
            int r11 = r1.f41373l
            int r5 = (int) r5
            r0.readFully(r9, r11, r5)
            int r5 = r1.f41371j
            if (r5 != r4) goto L_0x0419
            r4 = 8
            r3.mo46935z(r4)
            int r4 = r3.mo46912c()
            r5 = 1903435808(0x71742020, float:1.2088509E30)
            r6 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r6) goto L_0x03f6
            if (r4 == r5) goto L_0x03f4
            r4 = 0
            goto L_0x03f7
        L_0x03f4:
            r4 = 1
            goto L_0x03f7
        L_0x03f6:
            r4 = 2
        L_0x03f7:
            if (r4 == 0) goto L_0x03fa
            goto L_0x0416
        L_0x03fa:
            r4 = 4
            r3.mo46909A(r4)
        L_0x03fe:
            int r4 = r3.f30988c
            int r9 = r3.f30987b
            int r4 = r4 - r9
            if (r4 <= 0) goto L_0x0415
            int r4 = r3.mo46912c()
            if (r4 == r6) goto L_0x0411
            if (r4 == r5) goto L_0x040f
            r4 = 0
            goto L_0x0412
        L_0x040f:
            r4 = 1
            goto L_0x0412
        L_0x0411:
            r4 = 2
        L_0x0412:
            if (r4 == 0) goto L_0x03fe
            goto L_0x0416
        L_0x0415:
            r4 = 0
        L_0x0416:
            r1.f41384w = r4
            goto L_0x043e
        L_0x0419:
            java.util.ArrayDeque<wh.a$a> r4 = r1.f41367f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x043e
            java.util.ArrayDeque<wh.a$a> r4 = r1.f41367f
            java.lang.Object r4 = r4.peek()
            wh.a$a r4 = (p701wh.C18670a.C18671a) r4
            wh.a$b r5 = new wh.a$b
            int r6 = r1.f41371j
            r5.<init>(r6, r3)
            java.util.ArrayList r3 = r4.f41287c
            r3.add(r5)
            goto L_0x043e
        L_0x0436:
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0440
            int r3 = (int) r5
            r0.mo69879j(r3)
        L_0x043e:
            r3 = 0
            goto L_0x0448
        L_0x0440:
            long r3 = r39.getPosition()
            long r3 = r3 + r5
            r2.f40327a = r3
            r3 = 1
        L_0x0448:
            r1.mo70194j(r7)
            if (r3 == 0) goto L_0x0454
            int r3 = r1.f41370i
            r4 = 2
            if (r3 == r4) goto L_0x0454
            r14 = 1
            goto L_0x0455
        L_0x0454:
            r14 = 0
        L_0x0455:
            if (r14 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x0459:
            r3 = r13
            int r7 = r1.f41373l
            r8 = 0
            if (r7 != 0) goto L_0x04ca
            bj.r r7 = r1.f41366e
            byte[] r7 = r7.f30986a
            r9 = 8
            r10 = 0
            boolean r7 = r0.mo69874g(r7, r10, r9, r3)
            if (r7 != 0) goto L_0x04b0
            int r3 = r1.f41384w
            r4 = 2
            if (r3 != r4) goto L_0x04ad
            int r3 = r1.f41362a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x04ad
            ph.j r3 = r1.f41379r
            r3.getClass()
            r4 = 4
            ph.v r4 = r3.mo4164r(r10, r4)
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r5 = r1.f41385x
            if (r5 != 0) goto L_0x0485
            goto L_0x048f
        L_0x0485:
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            r6 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r6]
            r6[r10] = r5
            r8.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r6)
        L_0x048f:
            com.google.android.exoplayer2.Format$b r5 = new com.google.android.exoplayer2.Format$b
            r5.<init>()
            r5.f31301i = r8
            com.google.android.exoplayer2.Format r5 = r5.mo47144a()
            r4.mo47752a(r5)
            r3.mo4163p()
            ph.t$b r4 = new ph.t$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.<init>(r5)
            r3.mo4162l(r4)
        L_0x04ad:
            r13 = 0
            goto L_0x0664
        L_0x04b0:
            r3 = 8
            r1.f41373l = r3
            bj.r r3 = r1.f41366e
            r7 = 0
            r3.mo46935z(r7)
            bj.r r3 = r1.f41366e
            long r11 = r3.mo46926q()
            r1.f41372k = r11
            bj.r r3 = r1.f41366e
            int r3 = r3.mo46912c()
            r1.f41371j = r3
        L_0x04ca:
            long r11 = r1.f41372k
            r13 = 1
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x04e9
            bj.r r3 = r1.f41366e
            byte[] r3 = r3.f30986a
            r5 = 8
            r0.readFully(r3, r5, r5)
            int r3 = r1.f41373l
            int r3 = r3 + r5
            r1.f41373l = r3
            bj.r r3 = r1.f41366e
            long r5 = r3.mo46929t()
            r1.f41372k = r5
            goto L_0x0512
        L_0x04e9:
            r13 = 0
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0512
            long r11 = r39.getLength()
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0503
            java.util.ArrayDeque<wh.a$a> r3 = r1.f41367f
            java.lang.Object r3 = r3.peek()
            wh.a$a r3 = (p701wh.C18670a.C18671a) r3
            if (r3 == 0) goto L_0x0503
            long r11 = r3.f41286b
        L_0x0503:
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0512
            long r5 = r39.getPosition()
            long r11 = r11 - r5
            int r3 = r1.f41373l
            long r5 = (long) r3
            long r11 = r11 + r5
            r1.f41372k = r11
        L_0x0512:
            long r5 = r1.f41372k
            int r3 = r1.f41373l
            long r11 = (long) r3
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x0668
            int r5 = r1.f41371j
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x0543
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x0543
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x0543
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x0543
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x0543
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x0543
            if (r5 != r7) goto L_0x0541
            goto L_0x0543
        L_0x0541:
            r6 = 0
            goto L_0x0544
        L_0x0543:
            r6 = 1
        L_0x0544:
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == 0) goto L_0x05ab
            long r3 = r39.getPosition()
            long r5 = r1.f41372k
            long r3 = r3 + r5
            int r8 = r1.f41373l
            long r11 = (long) r8
            long r3 = r3 - r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x058a
            int r5 = r1.f41371j
            if (r5 != r7) goto L_0x058a
            bj.r r5 = r1.f41365d
            r6 = 8
            r5.mo46932w(r6)
            bj.r r5 = r1.f41365d
            byte[] r5 = r5.f30986a
            r7 = 0
            r0.mo69871a(r7, r6, r5)
            bj.r r5 = r1.f41365d
            byte[] r6 = p701wh.C18673b.f41290a
            int r6 = r5.f30987b
            r7 = 4
            r5.mo46909A(r7)
            int r7 = r5.mo46912c()
            if (r7 == r9) goto L_0x057d
            int r6 = r6 + 4
        L_0x057d:
            r5.mo46935z(r6)
            bj.r r5 = r1.f41365d
            int r5 = r5.f30987b
            r0.mo69879j(r5)
            r39.mo69873f()
        L_0x058a:
            java.util.ArrayDeque<wh.a$a> r5 = r1.f41367f
            wh.a$a r6 = new wh.a$a
            int r7 = r1.f41371j
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r1.f41372k
            int r7 = r1.f41373l
            long r7 = (long) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x05a3
            r1.mo70194j(r3)
            goto L_0x05a8
        L_0x05a3:
            r3 = 0
            r1.f41370i = r3
            r1.f41373l = r3
        L_0x05a8:
            r3 = 1
            goto L_0x0663
        L_0x05ab:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x0602
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x0602
            if (r5 == r9) goto L_0x0602
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x0602
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x0602
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x0602
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x0602
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x0602
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x0602
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x0602
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x0602
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x0602
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x0602
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x0602
            if (r5 == r4) goto L_0x0602
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x0602
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x0602
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x0600
            goto L_0x0602
        L_0x0600:
            r4 = 0
            goto L_0x0603
        L_0x0602:
            r4 = 1
        L_0x0603:
            if (r4 == 0) goto L_0x0638
            r4 = 8
            if (r3 != r4) goto L_0x060b
            r3 = 1
            goto L_0x060c
        L_0x060b:
            r3 = 0
        L_0x060c:
            p513bj.C14075p.m21694f(r3)
            long r3 = r1.f41372k
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x061a
            r3 = 1
            goto L_0x061b
        L_0x061a:
            r3 = 0
        L_0x061b:
            p513bj.C14075p.m21694f(r3)
            bj.r r3 = new bj.r
            long r4 = r1.f41372k
            int r4 = (int) r4
            r3.<init>((int) r4)
            bj.r r4 = r1.f41366e
            byte[] r4 = r4.f30986a
            byte[] r5 = r3.f30986a
            r6 = 8
            r7 = 0
            java.lang.System.arraycopy(r4, r7, r5, r7, r6)
            r1.f41374m = r3
            r3 = 1
            r1.f41370i = r3
            goto L_0x0663
        L_0x0638:
            long r3 = r39.getPosition()
            int r5 = r1.f41373l
            long r5 = (long) r5
            long r22 = r3 - r5
            int r3 = r1.f41371j
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x065e
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r3 = new com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata
            r20 = 0
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r26 = r22 + r5
            long r9 = r1.f41372k
            long r28 = r9 - r5
            r19 = r3
            r19.<init>(r20, r22, r24, r26, r28)
            r1.f41385x = r3
        L_0x065e:
            r1.f41374m = r8
            r3 = 1
            r1.f41370i = r3
        L_0x0663:
            r13 = r3
        L_0x0664:
            if (r13 != 0) goto L_0x0006
            r3 = -1
            return r3
        L_0x0668:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r0.<init>((java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18685h.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f41379r = jVar;
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        this.f41367f.clear();
        this.f41373l = 0;
        this.f41375n = -1;
        this.f41376o = 0;
        this.f41377p = 0;
        this.f41378q = 0;
        if (j != 0) {
            C18686a[] aVarArr = this.f41380s;
            if (aVarArr != null) {
                for (C18686a aVar : aVarArr) {
                    C18695o oVar = aVar.f41387b;
                    int f = C14049b0.m21633f(oVar.f41440f, j2, false);
                    while (true) {
                        if (f < 0) {
                            f = -1;
                            break;
                        } else if ((oVar.f41441g[f] & 1) != 0) {
                            break;
                        } else {
                            f--;
                        }
                    }
                    if (f == -1) {
                        f = oVar.mo70195a(j2);
                    }
                    aVar.f41389d = f;
                }
            }
        } else if (this.f41370i != 3) {
            this.f41370i = 0;
            this.f41373l = 0;
        } else {
            C18689j jVar = this.f41368g;
            jVar.f41395a.clear();
            jVar.f41396b = 0;
            this.f41369h.clear();
        }
    }

    /* renamed from: d */
    public final C18364t.C18365a mo47833d(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int a;
        long j9 = j;
        C18686a[] aVarArr = this.f41380s;
        aVarArr.getClass();
        if (aVarArr.length == 0) {
            C18367u uVar = C18367u.f40332c;
            return new C18364t.C18365a(uVar, uVar);
        }
        long j10 = -1;
        int i = this.f41382u;
        boolean z = false;
        int i2 = -1;
        if (i != -1) {
            C18695o oVar = this.f41380s[i].f41387b;
            int f = C14049b0.m21633f(oVar.f41440f, j9, false);
            while (true) {
                if (f < 0) {
                    f = -1;
                    break;
                } else if ((oVar.f41441g[f] & 1) != 0) {
                    break;
                } else {
                    f--;
                }
            }
            if (f == -1) {
                f = oVar.mo70195a(j9);
            }
            if (f == -1) {
                C18367u uVar2 = C18367u.f40332c;
                return new C18364t.C18365a(uVar2, uVar2);
            }
            long j11 = oVar.f41440f[f];
            j2 = oVar.f41437c[f];
            if (j11 >= j9 || f >= oVar.f41436b - 1 || (a = oVar.mo70195a(j9)) == -1 || a == f) {
                j8 = -9223372036854775807L;
            } else {
                long j12 = oVar.f41440f[a];
                long j13 = oVar.f41437c[a];
                j8 = j12;
                j10 = j13;
            }
            j3 = j10;
            j4 = j8;
            j9 = j11;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            C18686a[] aVarArr2 = this.f41380s;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.f41382u) {
                C18695o oVar2 = aVarArr2[i3].f41387b;
                int f2 = C14049b0.m21633f(oVar2.f41440f, j9, z);
                while (true) {
                    if (f2 < 0) {
                        f2 = i2;
                        break;
                    } else if ((oVar2.f41441g[f2] & 1) != 0) {
                        break;
                    } else {
                        f2--;
                    }
                }
                if (f2 == i2) {
                    f2 = oVar2.mo70195a(j9);
                }
                if (f2 == i2) {
                    j7 = j3;
                } else {
                    j7 = j3;
                    j2 = Math.min(oVar2.f41437c[f2], j2);
                }
                if (j4 != -9223372036854775807L) {
                    int f3 = C14049b0.m21633f(oVar2.f41440f, j4, false);
                    while (true) {
                        if (f3 < 0) {
                            f3 = -1;
                            break;
                        } else if ((oVar2.f41441g[f3] & 1) != 0) {
                            break;
                        } else {
                            f3--;
                        }
                    }
                    if (f3 == -1) {
                        f3 = oVar2.mo70195a(j4);
                    }
                    j6 = f3 == -1 ? j7 : Math.min(oVar2.f41437c[f3], j7);
                    i3++;
                    z = false;
                    i2 = -1;
                } else {
                    j5 = j7;
                }
            } else {
                j5 = j3;
            }
            j6 = j5;
            i3++;
            z = false;
            i2 = -1;
        }
        long j14 = j3;
        C18367u uVar3 = new C18367u(j9, j2);
        return j4 == -9223372036854775807L ? new C18364t.C18365a(uVar3, uVar3) : new C18364t.C18365a(uVar3, new C18367u(j4, j14));
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        return C18691k.m31544a(iVar, false, (this.f41362a & 2) != 0);
    }

    /* renamed from: g */
    public final boolean mo47834g() {
        return true;
    }

    /* renamed from: i */
    public final long mo47835i() {
        return this.f41383v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x05f4 A[LOOP:12: B:295:0x05f1->B:297:0x05f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x02ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd A[Catch:{ all -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5 A[Catch:{ all -> 0x0226 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70194j(long r25) throws com.google.android.exoplayer2.ParserException {
        /*
            r24 = this;
            r1 = r24
            r0 = r1
        L_0x0003:
            java.util.ArrayDeque<wh.a$a> r2 = r0.f41367f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x067b
            java.util.ArrayDeque<wh.a$a> r2 = r0.f41367f
            java.lang.Object r2 = r2.peek()
            wh.a$a r2 = (p701wh.C18670a.C18671a) r2
            long r2 = r2.f41286b
            int r2 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x067b
            java.util.ArrayDeque<wh.a$a> r2 = r0.f41367f
            java.lang.Object r2 = r2.pop()
            r3 = r2
            wh.a$a r3 = (p701wh.C18670a.C18671a) r3
            int r2 = r3.f41285a
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 != r4) goto L_0x0662
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r0.f41384w
            r5 = 1
            if (r4 != r5) goto L_0x0035
            r9 = r5
            goto L_0x0037
        L_0x0035:
            r4 = 0
            r9 = r4
        L_0x0037:
            ph.p r11 = new ph.p
            r11.<init>()
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            wh.a$b r4 = r3.mo70184c(r4)
            r5 = 1768715124(0x696c7374, float:1.7865732E25)
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            r8 = 4
            r10 = 8
            if (r4 == 0) goto L_0x0385
            byte[] r12 = p701wh.C18673b.f41290a
            bj.r r4 = r4.f41289b
            r4.mo46935z(r10)
            r12 = 0
            r13 = 0
        L_0x005a:
            int r14 = r4.f30988c
            int r15 = r4.f30987b
            int r14 = r14 - r15
            if (r14 < r10) goto L_0x036e
            int r14 = r4.mo46912c()
            r16 = r5
            int r5 = r4.mo46912c()
            if (r5 != r7) goto L_0x02f9
            r4.mo46935z(r15)
            int r5 = r15 + r14
            r4.mo46909A(r10)
            int r7 = r4.f30987b
            r4.mo46909A(r8)
            int r8 = r4.mo46912c()
            if (r8 == r6) goto L_0x0082
            int r7 = r7 + 4
        L_0x0082:
            r4.mo46935z(r7)
            r6 = r16
        L_0x0087:
            int r7 = r4.f30987b
            if (r7 >= r5) goto L_0x02f4
            int r8 = r4.mo46912c()
            int r12 = r4.mo46912c()
            if (r12 != r6) goto L_0x02e5
            r4.mo46935z(r7)
            int r7 = r7 + r8
            r4.mo46909A(r10)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00a1:
            int r6 = r4.f30987b
            if (r6 >= r7) goto L_0x02d6
            int r8 = r4.mo46912c()
            int r8 = r8 + r6
            int r6 = r4.mo46912c()
            int r10 = r6 >> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            r12 = 169(0xa9, float:2.37E-43)
            r16 = r7
            java.lang.String r7 = "TCON"
            r17 = r2
            java.lang.String r2 = "MetadataUtil"
            if (r10 == r12) goto L_0x0217
            r12 = 253(0xfd, float:3.55E-43)
            if (r10 != r12) goto L_0x00c4
            goto L_0x0217
        L_0x00c4:
            r10 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r6 != r10) goto L_0x00ec
            int r6 = p701wh.C18683f.m31532f(r4)     // Catch:{ all -> 0x0226 }
            if (r6 <= 0) goto L_0x00da
            java.lang.String[] r10 = p701wh.C18683f.f41361a     // Catch:{ all -> 0x0226 }
            r12 = 192(0xc0, float:2.69E-43)
            if (r6 > r12) goto L_0x00da
            int r6 = r6 + -1
            r6 = r10[r6]     // Catch:{ all -> 0x0226 }
            goto L_0x00db
        L_0x00da:
            r6 = 0
        L_0x00db:
            if (r6 == 0) goto L_0x00e5
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x0226 }
            r10 = 0
            r2.<init>(r7, r10, r6)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x00e5:
            java.lang.String r6 = "Failed to parse standard genre code"
            android.util.Log.w(r2, r6)     // Catch:{ all -> 0x0226 }
            goto L_0x02b3
        L_0x00ec:
            r7 = 0
            r10 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r6 != r10) goto L_0x00fa
            java.lang.String r2 = "TPOS"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31529c(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x00fa:
            r10 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r6 != r10) goto L_0x0107
            java.lang.String r2 = "TRCK"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31529c(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0107:
            r10 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r6 != r10) goto L_0x0116
            java.lang.String r2 = "TBPM"
            r7 = 0
            r10 = 1
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = p701wh.C18683f.m31531e(r6, r2, r4, r10, r7)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0116:
            r10 = 1668311404(0x6370696c, float:4.434815E21)
            if (r6 != r10) goto L_0x0124
            java.lang.String r2 = "TCMP"
            r7 = 1
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = p701wh.C18683f.m31531e(r6, r2, r4, r7, r7)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0124:
            r10 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r6 != r10) goto L_0x012f
            com.google.android.exoplayer2.metadata.id3.ApicFrame r2 = p701wh.C18683f.m31528b(r4)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x012f:
            r10 = 1631670868(0x61415254, float:2.2288462E20)
            if (r6 != r10) goto L_0x013c
            java.lang.String r2 = "TPE2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x013c:
            r10 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r6 != r10) goto L_0x0149
            java.lang.String r2 = "TSOT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0149:
            r10 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r6 != r10) goto L_0x0156
            java.lang.String r2 = "TSO2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0156:
            r10 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r6 != r10) goto L_0x0163
            java.lang.String r2 = "TSOA"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0163:
            r10 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r6 != r10) goto L_0x0170
            java.lang.String r2 = "TSOP"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0170:
            r10 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r6 != r10) goto L_0x017d
            java.lang.String r2 = "TSOC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x017d:
            r10 = 1920233063(0x72746e67, float:4.84146E30)
            if (r6 != r10) goto L_0x018b
            java.lang.String r2 = "ITUNESADVISORY"
            r7 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = p701wh.C18683f.m31531e(r6, r2, r4, r7, r7)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x018b:
            r10 = 1885823344(0x70676170, float:2.8643533E29)
            if (r6 != r10) goto L_0x019a
            java.lang.String r2 = "ITUNESGAPLESS"
            r7 = 0
            r10 = 1
            com.google.android.exoplayer2.metadata.id3.Id3Frame r2 = p701wh.C18683f.m31531e(r6, r2, r4, r7, r10)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x019a:
            r10 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r6 != r10) goto L_0x01a7
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x01a7:
            r10 = 1953919848(0x74767368, float:7.810338E31)
            if (r6 != r10) goto L_0x01b4
            java.lang.String r2 = "TVSHOW"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r2)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x01b4:
            r10 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r6 != r10) goto L_0x0295
            r2 = -1
            r6 = -1
            r10 = r7
        L_0x01bc:
            int r12 = r4.f30987b     // Catch:{ all -> 0x0226 }
            if (r12 >= r8) goto L_0x01f9
            int r18 = r4.mo46912c()     // Catch:{ all -> 0x0226 }
            r19 = r12
            int r12 = r4.mo46912c()     // Catch:{ all -> 0x0226 }
            r1 = 4
            r4.mo46909A(r1)     // Catch:{ all -> 0x0226 }
            r1 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r12 != r1) goto L_0x01db
            int r1 = r18 + -12
            java.lang.String r1 = r4.mo46921l(r1)     // Catch:{ all -> 0x0226 }
            r7 = r1
            goto L_0x01f6
        L_0x01db:
            r1 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r12 != r1) goto L_0x01e8
            int r1 = r18 + -12
            java.lang.String r1 = r4.mo46921l(r1)     // Catch:{ all -> 0x0226 }
            r10 = r1
            goto L_0x01f6
        L_0x01e8:
            r1 = 1684108385(0x64617461, float:1.6635614E22)
            if (r12 != r1) goto L_0x01f1
            r6 = r18
            r2 = r19
        L_0x01f1:
            int r1 = r18 + -12
            r4.mo46909A(r1)     // Catch:{ all -> 0x0226 }
        L_0x01f6:
            r1 = r24
            goto L_0x01bc
        L_0x01f9:
            if (r7 == 0) goto L_0x02b3
            if (r10 == 0) goto L_0x02b3
            r1 = -1
            if (r2 != r1) goto L_0x0202
            goto L_0x02b3
        L_0x0202:
            r4.mo46935z(r2)     // Catch:{ all -> 0x0226 }
            r1 = 16
            r4.mo46909A(r1)     // Catch:{ all -> 0x0226 }
            int r6 = r6 + -16
            java.lang.String r1 = r4.mo46921l(r6)     // Catch:{ all -> 0x0226 }
            com.google.android.exoplayer2.metadata.id3.InternalFrame r2 = new com.google.android.exoplayer2.metadata.id3.InternalFrame     // Catch:{ all -> 0x0226 }
            r2.<init>(r7, r10, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0217:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r6
            r10 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r10) goto L_0x0229
            com.google.android.exoplayer2.metadata.id3.CommentFrame r2 = p701wh.C18683f.m31527a(r6, r4)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0226:
            r0 = move-exception
            goto L_0x02d2
        L_0x0229:
            r10 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r10) goto L_0x02bc
            r10 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 != r10) goto L_0x0235
            goto L_0x02bc
        L_0x0235:
            r10 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r10) goto L_0x02b5
            r10 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 != r10) goto L_0x0241
            goto L_0x02b5
        L_0x0241:
            r10 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r10) goto L_0x024e
            java.lang.String r1 = "TDRC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x024e:
            r10 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r10) goto L_0x025b
            java.lang.String r1 = "TPE1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x025b:
            r10 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r10) goto L_0x0267
            java.lang.String r1 = "TSSE"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0267:
            r10 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r10) goto L_0x0273
            java.lang.String r1 = "TALB"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0273:
            r10 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r10) goto L_0x027f
            java.lang.String r1 = "USLT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x027f:
            r10 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r10) goto L_0x0289
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r7)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0289:
            r7 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r7) goto L_0x0295
            java.lang.String r1 = "TIT1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x0295:
            java.lang.String r1 = "Skipped unknown metadata entry: "
            java.lang.String r6 = p701wh.C18670a.m31498a(r6)     // Catch:{ all -> 0x0226 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0226 }
            int r7 = r6.length()     // Catch:{ all -> 0x0226 }
            if (r7 == 0) goto L_0x02aa
            java.lang.String r1 = r1.concat(r6)     // Catch:{ all -> 0x0226 }
            goto L_0x02b0
        L_0x02aa:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0226 }
            r6.<init>(r1)     // Catch:{ all -> 0x0226 }
            r1 = r6
        L_0x02b0:
            android.util.Log.d(r2, r1)     // Catch:{ all -> 0x0226 }
        L_0x02b3:
            r2 = 0
            goto L_0x02c2
        L_0x02b5:
            java.lang.String r1 = "TCOM"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x02c2
        L_0x02bc:
            java.lang.String r1 = "TIT2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r2 = p701wh.C18683f.m31530d(r6, r4, r1)     // Catch:{ all -> 0x0226 }
        L_0x02c2:
            r4.mo46935z(r8)
            if (r2 == 0) goto L_0x02ca
            r5.add(r2)
        L_0x02ca:
            r1 = r24
            r7 = r16
            r2 = r17
            goto L_0x00a1
        L_0x02d2:
            r4.mo46935z(r8)
            throw r0
        L_0x02d6:
            r17 = r2
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x02df
            goto L_0x02f6
        L_0x02df:
            com.google.android.exoplayer2.metadata.Metadata r1 = new com.google.android.exoplayer2.metadata.Metadata
            r1.<init>((java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry>) r5)
            goto L_0x02f7
        L_0x02e5:
            r17 = r2
            int r7 = r7 + r8
            r4.mo46935z(r7)
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            r10 = 8
            r1 = r24
            goto L_0x0087
        L_0x02f4:
            r17 = r2
        L_0x02f6:
            r1 = 0
        L_0x02f7:
            r12 = r1
            goto L_0x0358
        L_0x02f9:
            r17 = r2
            r1 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r5 != r1) goto L_0x0358
            r4.mo46935z(r15)
            int r1 = r15 + r14
            r2 = 12
            r4.mo46909A(r2)
        L_0x030a:
            int r2 = r4.f30987b
            if (r2 >= r1) goto L_0x0356
            int r5 = r4.mo46912c()
            int r6 = r4.mo46912c()
            r7 = 1935766900(0x73617574, float:1.7862687E31)
            if (r6 != r7) goto L_0x0351
            r1 = 14
            if (r5 >= r1) goto L_0x0320
            goto L_0x0356
        L_0x0320:
            r1 = 5
            r4.mo46909A(r1)
            int r1 = r4.mo46925p()
            r2 = 12
            if (r1 == r2) goto L_0x0331
            r5 = 13
            if (r1 == r5) goto L_0x0331
            goto L_0x0356
        L_0x0331:
            if (r1 != r2) goto L_0x0336
            r1 = 1131413504(0x43700000, float:240.0)
            goto L_0x0338
        L_0x0336:
            r1 = 1123024896(0x42f00000, float:120.0)
        L_0x0338:
            r2 = 1
            r4.mo46909A(r2)
            int r5 = r4.mo46925p()
            com.google.android.exoplayer2.metadata.Metadata r6 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry r7 = new com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry
            r7.<init>((float) r1, (int) r5)
            r1 = 0
            r2[r1] = r7
            r6.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r2)
            r13 = r6
            goto L_0x0358
        L_0x0351:
            int r2 = r2 + r5
            r4.mo46935z(r2)
            goto L_0x030a
        L_0x0356:
            r1 = 0
            r13 = r1
        L_0x0358:
            int r15 = r15 + r14
            r4.mo46935z(r15)
            r8 = 4
            r5 = 1768715124(0x696c7374, float:1.7865732E25)
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            r10 = 8
            r1 = r24
            r2 = r17
            goto L_0x005a
        L_0x036e:
            r17 = r2
            android.util.Pair r1 = android.util.Pair.create(r12, r13)
            java.lang.Object r2 = r1.first
            com.google.android.exoplayer2.metadata.Metadata r2 = (com.google.android.exoplayer2.metadata.Metadata) r2
            java.lang.Object r1 = r1.second
            com.google.android.exoplayer2.metadata.Metadata r1 = (com.google.android.exoplayer2.metadata.Metadata) r1
            if (r2 == 0) goto L_0x0381
            r11.mo69891b(r2)
        L_0x0381:
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L_0x0389
        L_0x0385:
            r17 = r2
            r1 = 0
            r2 = 0
        L_0x0389:
            wh.a$a r4 = r3.mo70183b(r7)
            if (r4 == 0) goto L_0x046a
            byte[] r5 = p701wh.C18673b.f41290a
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            wh.a$b r5 = r4.mo70184c(r5)
            r6 = 1801812339(0x6b657973, float:2.7741754E26)
            wh.a$b r6 = r4.mo70184c(r6)
            r7 = 1768715124(0x696c7374, float:1.7865732E25)
            wh.a$b r4 = r4.mo70184c(r7)
            if (r5 == 0) goto L_0x046a
            if (r6 == 0) goto L_0x046a
            if (r4 == 0) goto L_0x046a
            bj.r r5 = r5.f41289b
            r7 = 16
            r5.mo46935z(r7)
            int r5 = r5.mo46912c()
            r7 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r5 == r7) goto L_0x03be
            goto L_0x046a
        L_0x03be:
            bj.r r5 = r6.f41289b
            r6 = 12
            r5.mo46935z(r6)
            int r6 = r5.mo46912c()
            java.lang.String[] r7 = new java.lang.String[r6]
            r8 = 0
        L_0x03cc:
            if (r8 >= r6) goto L_0x03e1
            int r10 = r5.mo46912c()
            r12 = 4
            r5.mo46909A(r12)
            int r10 = r10 + -8
            java.lang.String r10 = r5.mo46922m(r10)
            r7[r8] = r10
            int r8 = r8 + 1
            goto L_0x03cc
        L_0x03e1:
            r5 = 8
            bj.r r4 = r4.f41289b
            r4.mo46935z(r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x03ed:
            int r10 = r4.f30988c
            int r12 = r4.f30987b
            int r10 = r10 - r12
            if (r10 <= r5) goto L_0x045d
            int r5 = r4.mo46912c()
            int r10 = r4.mo46912c()
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x0445
            if (r10 >= r6) goto L_0x0445
            r10 = r7[r10]
            int r13 = r12 + r5
        L_0x0406:
            int r14 = r4.f30987b
            if (r14 >= r13) goto L_0x043a
            int r15 = r4.mo46912c()
            r16 = r6
            int r6 = r4.mo46912c()
            r18 = r7
            r7 = 1684108385(0x64617461, float:1.6635614E22)
            if (r6 != r7) goto L_0x0431
            int r6 = r4.mo46912c()
            int r7 = r4.mo46912c()
            int r15 = r15 + -16
            byte[] r13 = new byte[r15]
            r14 = 0
            r4.mo46911b(r14, r15, r13)
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r14 = new com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            r14.<init>(r10, r13, r7, r6)
            goto L_0x043f
        L_0x0431:
            int r14 = r14 + r15
            r4.mo46935z(r14)
            r6 = r16
            r7 = r18
            goto L_0x0406
        L_0x043a:
            r16 = r6
            r18 = r7
            r14 = 0
        L_0x043f:
            if (r14 == 0) goto L_0x0452
            r8.add(r14)
            goto L_0x0452
        L_0x0445:
            r16 = r6
            r18 = r7
            r6 = 52
            java.lang.String r7 = "Skipped metadata with unknown key index: "
            java.lang.String r13 = "AtomParsers"
            p003a2.C0023f.m112m(r6, r7, r10, r13)
        L_0x0452:
            int r12 = r12 + r5
            r4.mo46935z(r12)
            r5 = 8
            r6 = r16
            r7 = r18
            goto L_0x03ed
        L_0x045d:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0464
            goto L_0x046a
        L_0x0464:
            com.google.android.exoplayer2.metadata.Metadata r4 = new com.google.android.exoplayer2.metadata.Metadata
            r4.<init>((java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry>) r8)
            goto L_0x046b
        L_0x046a:
            r4 = 0
        L_0x046b:
            r12 = r4
            int r4 = r0.f41362a
            r4 = r4 & 1
            if (r4 == 0) goto L_0x0474
            r4 = 1
            goto L_0x0475
        L_0x0474:
            r4 = 0
        L_0x0475:
            r8 = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            wh.g r10 = new wh.g
            r10.<init>()
            r13 = -1
            r4 = r11
            java.util.ArrayList r3 = p701wh.C18673b.m31505e(r3, r4, r5, r7, r8, r9, r10)
            ph.j r4 = r0.f41379r
            r4.getClass()
            int r5 = r3.size()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r10 = r8
            r14 = r13
            r8 = r6
        L_0x0499:
            if (r10 >= r5) goto L_0x05ce
            java.lang.Object r14 = r3.get(r10)
            wh.o r14 = (p701wh.C18695o) r14
            int r15 = r14.f41436b
            if (r15 != 0) goto L_0x04b6
            r8 = -1
            r22 = r1
            r23 = r2
            r20 = r3
            r21 = r5
            r14 = r8
            r1 = r13
            r2 = r17
            r13 = r24
            goto L_0x05ba
        L_0x04b6:
            wh.l r0 = r14.f41435a
            r15 = r12
            r16 = r13
            long r12 = r0.f41405e
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x04c2
            goto L_0x04c4
        L_0x04c2:
            long r12 = r14.f41442h
        L_0x04c4:
            long r6 = java.lang.Math.max(r6, r12)
            wh.h$a r8 = new wh.h$a
            int r9 = r0.f41402b
            ph.v r9 = r4.mo4164r(r10, r9)
            r8.<init>(r0, r14, r9)
            int r9 = r14.f41439e
            int r9 = r9 + 30
            r20 = r3
            com.google.android.exoplayer2.Format r3 = r0.f41406f
            com.google.android.exoplayer2.Format$b r3 = r3.buildUpon()
            r3.f31304l = r9
            int r9 = r0.f41402b
            r21 = r5
            r5 = 2
            if (r9 != r5) goto L_0x04fc
            r18 = 0
            int r5 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r5 <= 0) goto L_0x04fc
            int r5 = r14.f41436b
            r14 = 1
            if (r5 <= r14) goto L_0x04fc
            float r5 = (float) r5
            float r12 = (float) r12
            r13 = 1232348160(0x49742400, float:1000000.0)
            float r12 = r12 / r13
            float r5 = r5 / r12
            r3.f31310r = r5
        L_0x04fc:
            r5 = 1
            if (r9 != r5) goto L_0x0513
            int r5 = r11.f40320a
            r12 = -1
            if (r5 == r12) goto L_0x050a
            int r13 = r11.f40321b
            if (r13 == r12) goto L_0x050a
            r12 = 1
            goto L_0x050b
        L_0x050a:
            r12 = 0
        L_0x050b:
            if (r12 == 0) goto L_0x0513
            r3.f31289A = r5
            int r5 = r11.f40321b
            r3.f31290B = r5
        L_0x0513:
            r5 = 2
            com.google.android.exoplayer2.metadata.Metadata[] r5 = new com.google.android.exoplayer2.metadata.Metadata[r5]
            r12 = 0
            r5[r12] = r1
            r13 = r24
            java.util.ArrayList r14 = r13.f41369h
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0525
            r14 = 0
            goto L_0x052c
        L_0x0525:
            com.google.android.exoplayer2.metadata.Metadata r14 = new com.google.android.exoplayer2.metadata.Metadata
            java.util.ArrayList r12 = r13.f41369h
            r14.<init>((java.util.List<? extends com.google.android.exoplayer2.metadata.Metadata.Entry>) r12)
        L_0x052c:
            r12 = 1
            r5[r12] = r14
            com.google.android.exoplayer2.metadata.Metadata r14 = new com.google.android.exoplayer2.metadata.Metadata
            r12 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r12 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r12]
            r14.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r12)
            r12 = 1
            if (r9 != r12) goto L_0x0543
            if (r2 == 0) goto L_0x057e
            r22 = r1
            r14 = r2
            r23 = r14
        L_0x0541:
            r12 = r15
            goto L_0x0583
        L_0x0543:
            r12 = 2
            if (r9 != r12) goto L_0x057e
            if (r15 == 0) goto L_0x057e
            r9 = 0
        L_0x0549:
            int r12 = r15.length()
            if (r9 >= r12) goto L_0x057e
            r12 = r15
            com.google.android.exoplayer2.metadata.Metadata$Entry r15 = r12.get(r9)
            r22 = r1
            boolean r1 = r15 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r1 == 0) goto L_0x0574
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r15 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r15
            java.lang.String r1 = r15.key
            r23 = r2
            java.lang.String r2 = "com.android.capture.fps"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0576
            com.google.android.exoplayer2.metadata.Metadata r14 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            r2 = 0
            r1[r2] = r15
            r14.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r1)
            goto L_0x0583
        L_0x0574:
            r23 = r2
        L_0x0576:
            int r9 = r9 + 1
            r15 = r12
            r1 = r22
            r2 = r23
            goto L_0x0549
        L_0x057e:
            r22 = r1
            r23 = r2
            goto L_0x0541
        L_0x0583:
            r1 = 0
        L_0x0584:
            r2 = 2
            if (r1 >= r2) goto L_0x0590
            r2 = r5[r1]
            com.google.android.exoplayer2.metadata.Metadata r14 = r14.copyWithAppendedEntriesFrom(r2)
            int r1 = r1 + 1
            goto L_0x0584
        L_0x0590:
            int r1 = r14.length()
            if (r1 <= 0) goto L_0x0598
            r3.f31301i = r14
        L_0x0598:
            ph.v r1 = r8.f41388c
            com.google.android.exoplayer2.Format r2 = r3.mo47144a()
            r1.mo47752a(r2)
            int r0 = r0.f41402b
            r1 = 2
            if (r0 != r1) goto L_0x05b0
            r0 = -1
            r1 = r16
            if (r1 != r0) goto L_0x05b3
            int r1 = r17.size()
            goto L_0x05b3
        L_0x05b0:
            r1 = r16
            r0 = -1
        L_0x05b3:
            r2 = r17
            r2.add(r8)
            r14 = r0
            r0 = r13
        L_0x05ba:
            int r10 = r10 + 1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = r1
            r17 = r2
            r3 = r20
            r5 = r21
            r1 = r22
            r2 = r23
            goto L_0x0499
        L_0x05ce:
            r18 = 0
            r1 = r13
            r2 = r17
            r13 = r24
            r0.f41382u = r1
            r0.f41383v = r6
            r1 = 0
            wh.h$a[] r1 = new p701wh.C18685h.C18686a[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            wh.h$a[] r1 = (p701wh.C18685h.C18686a[]) r1
            r0.f41380s = r1
            int r2 = r1.length
            long[][] r2 = new long[r2][]
            int r3 = r1.length
            int[] r3 = new int[r3]
            int r5 = r1.length
            long[] r5 = new long[r5]
            int r6 = r1.length
            boolean[] r6 = new boolean[r6]
            r7 = 0
        L_0x05f1:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x060c
            r8 = r1[r7]
            wh.o r8 = r8.f41387b
            int r8 = r8.f41436b
            long[] r8 = new long[r8]
            r2[r7] = r8
            r8 = r1[r7]
            wh.o r8 = r8.f41387b
            long[] r8 = r8.f41440f
            r9 = 0
            r9 = r8[r9]
            r5[r7] = r9
            int r7 = r7 + 1
            goto L_0x05f1
        L_0x060c:
            r7 = 0
            r15 = r18
        L_0x060f:
            int r8 = r1.length
            if (r7 >= r8) goto L_0x0651
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r11 = r14
        L_0x0619:
            int r12 = r1.length
            if (r10 >= r12) goto L_0x062c
            boolean r12 = r6[r10]
            if (r12 != 0) goto L_0x0629
            r17 = r5[r10]
            int r12 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r12 > 0) goto L_0x0629
            r11 = r10
            r8 = r17
        L_0x0629:
            int r10 = r10 + 1
            goto L_0x0619
        L_0x062c:
            r8 = r3[r11]
            r9 = r2[r11]
            r9[r8] = r15
            r10 = r1[r11]
            wh.o r10 = r10.f41387b
            int[] r12 = r10.f41438d
            r12 = r12[r8]
            long r12 = (long) r12
            long r15 = r15 + r12
            r12 = 1
            int r8 = r8 + r12
            r3[r11] = r8
            int r9 = r9.length
            if (r8 >= r9) goto L_0x064a
            long[] r9 = r10.f41440f
            r8 = r9[r8]
            r5[r11] = r8
            goto L_0x064e
        L_0x064a:
            r6[r11] = r12
            int r7 = r7 + 1
        L_0x064e:
            r13 = r24
            goto L_0x060f
        L_0x0651:
            r0.f41381t = r2
            r4.mo4163p()
            r4.mo4162l(r0)
            java.util.ArrayDeque<wh.a$a> r1 = r0.f41367f
            r1.clear()
            r1 = 2
            r0.f41370i = r1
            goto L_0x0677
        L_0x0662:
            java.util.ArrayDeque<wh.a$a> r1 = r0.f41367f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0677
            java.util.ArrayDeque<wh.a$a> r1 = r0.f41367f
            java.lang.Object r1 = r1.peek()
            wh.a$a r1 = (p701wh.C18670a.C18671a) r1
            java.util.ArrayList r1 = r1.f41288d
            r1.add(r3)
        L_0x0677:
            r1 = r24
            goto L_0x0003
        L_0x067b:
            int r0 = r0.f41370i
            r1 = 2
            if (r0 == r1) goto L_0x0688
            r0 = 0
            r1 = r24
            r1.f41370i = r0
            r1.f41373l = r0
            goto L_0x068a
        L_0x0688:
            r1 = r24
        L_0x068a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p701wh.C18685h.mo70194j(long):void");
    }

    public final void release() {
    }

    public C18685h(int i) {
        this.f41362a = 0;
        this.f41370i = 0;
        this.f41368g = new C18689j();
        this.f41369h = new ArrayList();
        this.f41366e = new C14077r(16);
        this.f41367f = new ArrayDeque<>();
        this.f41363b = new C14077r(C14068n.f30955a);
        this.f41364c = new C14077r(4);
        this.f41365d = new C14077r();
        this.f41375n = -1;
    }
}
