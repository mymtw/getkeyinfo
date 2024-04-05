package p717yh;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p513bj.C14068n;
import p513bj.C14077r;
import p644ph.C18351j;
import p644ph.C18368v;
import p717yh.C18848e0;

/* renamed from: yh.n */
public final class C18867n implements C18858j {

    /* renamed from: a */
    public final C18837a0 f41937a;

    /* renamed from: b */
    public String f41938b;

    /* renamed from: c */
    public C18368v f41939c;

    /* renamed from: d */
    public C18868a f41940d;

    /* renamed from: e */
    public boolean f41941e;

    /* renamed from: f */
    public final boolean[] f41942f = new boolean[3];

    /* renamed from: g */
    public final C18872r f41943g = new C18872r(32);

    /* renamed from: h */
    public final C18872r f41944h = new C18872r(33);

    /* renamed from: i */
    public final C18872r f41945i = new C18872r(34);

    /* renamed from: j */
    public final C18872r f41946j = new C18872r(39);

    /* renamed from: k */
    public final C18872r f41947k = new C18872r(40);

    /* renamed from: l */
    public long f41948l;

    /* renamed from: m */
    public long f41949m;

    /* renamed from: n */
    public final C14077r f41950n = new C14077r();

    /* renamed from: yh.n$a */
    public static final class C18868a {

        /* renamed from: a */
        public final C18368v f41951a;

        /* renamed from: b */
        public long f41952b;

        /* renamed from: c */
        public boolean f41953c;

        /* renamed from: d */
        public int f41954d;

        /* renamed from: e */
        public long f41955e;

        /* renamed from: f */
        public boolean f41956f;

        /* renamed from: g */
        public boolean f41957g;

        /* renamed from: h */
        public boolean f41958h;

        /* renamed from: i */
        public boolean f41959i;

        /* renamed from: j */
        public boolean f41960j;

        /* renamed from: k */
        public long f41961k;

        /* renamed from: l */
        public long f41962l;

        /* renamed from: m */
        public boolean f41963m;

        public C18868a(C18368v vVar) {
            this.f41951a = vVar;
        }
    }

    public C18867n(C18837a0 a0Var) {
        this.f41937a = a0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0425 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70281a(p513bj.C14077r r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            ph.v r2 = r0.f41939c
            p513bj.C14075p.m21696h(r2)
            int r2 = p513bj.C14049b0.f30913a
        L_0x000b:
            int r2 = r1.f30988c
            int r3 = r1.f30987b
            int r4 = r2 - r3
            if (r4 <= 0) goto L_0x043d
            byte[] r5 = r1.f30986a
            long r6 = r0.f41948l
            long r8 = (long) r4
            long r6 = r6 + r8
            r0.f41948l = r6
            ph.v r6 = r0.f41939c
            r6.mo69899d(r4, r1)
        L_0x0020:
            if (r3 >= r2) goto L_0x0439
            boolean[] r4 = r0.f41942f
            int r4 = p513bj.C14068n.m21683b(r5, r3, r2, r4)
            if (r4 != r2) goto L_0x002e
            r0.mo70304b(r3, r2, r5)
            return
        L_0x002e:
            int r6 = r4 + 3
            byte r7 = r5[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            int r7 = r7 >> 1
            int r8 = r4 - r3
            if (r8 <= 0) goto L_0x003d
            r0.mo70304b(r3, r4, r5)
        L_0x003d:
            int r14 = r2 - r4
            long r3 = r0.f41948l
            long r9 = (long) r14
            long r3 = r3 - r9
            r9 = 0
            if (r8 >= 0) goto L_0x0048
            int r8 = -r8
            goto L_0x0049
        L_0x0048:
            r8 = r9
        L_0x0049:
            long r10 = r0.f41949m
            yh.n$a r12 = r0.f41940d
            boolean r13 = r0.f41941e
            boolean r15 = r12.f41960j
            if (r15 == 0) goto L_0x005e
            boolean r15 = r12.f41957g
            if (r15 == 0) goto L_0x005e
            boolean r13 = r12.f41953c
            r12.f41963m = r13
            r12.f41960j = r9
            goto L_0x0067
        L_0x005e:
            boolean r9 = r12.f41958h
            if (r9 != 0) goto L_0x006f
            boolean r9 = r12.f41957g
            if (r9 == 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            r16 = r2
            r17 = r5
            r18 = r6
            r6 = r14
            goto L_0x00b1
        L_0x006f:
            if (r13 == 0) goto L_0x009b
            boolean r9 = r12.f41959i
            if (r9 == 0) goto L_0x009b
            r16 = r2
            long r1 = r12.f41952b
            r17 = r5
            r18 = r6
            long r5 = r3 - r1
            int r5 = (int) r5
            int r24 = r5 + r14
            boolean r5 = r12.f41963m
            r6 = r14
            long r13 = r12.f41961k
            long r1 = r1 - r13
            int r1 = (int) r1
            ph.v r2 = r12.f41951a
            long r13 = r12.f41962l
            r25 = 0
            r19 = r2
            r20 = r13
            r22 = r5
            r23 = r1
            r19.mo47754c(r20, r22, r23, r24, r25)
            goto L_0x00a2
        L_0x009b:
            r16 = r2
            r17 = r5
            r18 = r6
            r6 = r14
        L_0x00a2:
            long r1 = r12.f41952b
            r12.f41961k = r1
            long r1 = r12.f41955e
            r12.f41962l = r1
            boolean r1 = r12.f41953c
            r12.f41963m = r1
            r1 = 1
            r12.f41959i = r1
        L_0x00b1:
            boolean r1 = r0.f41941e
            if (r1 != 0) goto L_0x0344
            yh.r r1 = r0.f41943g
            r1.mo70306b(r8)
            yh.r r1 = r0.f41944h
            r1.mo70306b(r8)
            yh.r r1 = r0.f41945i
            r1.mo70306b(r8)
            yh.r r1 = r0.f41943g
            boolean r2 = r1.f42005c
            if (r2 == 0) goto L_0x0344
            yh.r r2 = r0.f41944h
            boolean r5 = r2.f42005c
            if (r5 == 0) goto L_0x0344
            yh.r r5 = r0.f41945i
            boolean r9 = r5.f42005c
            if (r9 == 0) goto L_0x0344
            ph.v r9 = r0.f41939c
            java.lang.String r12 = r0.f41938b
            int r13 = r1.f42007e
            int r14 = r2.f42007e
            int r14 = r14 + r13
            int r15 = r5.f42007e
            int r14 = r14 + r15
            byte[] r14 = new byte[r14]
            byte[] r15 = r1.f42006d
            r19 = r6
            r6 = 0
            java.lang.System.arraycopy(r15, r6, r14, r6, r13)
            byte[] r13 = r2.f42006d
            int r15 = r1.f42007e
            r20 = r7
            int r7 = r2.f42007e
            java.lang.System.arraycopy(r13, r6, r14, r15, r7)
            byte[] r7 = r5.f42006d
            int r1 = r1.f42007e
            int r13 = r2.f42007e
            int r1 = r1 + r13
            int r5 = r5.f42007e
            java.lang.System.arraycopy(r7, r6, r14, r1, r5)
            bj.s r1 = new bj.s
            byte[] r5 = r2.f42006d
            int r7 = r2.f42007e
            r1.<init>(r5, r6, r7)
            r5 = 44
            r1.mo46945j(r5)
            r5 = 3
            int r6 = r1.mo46940e(r5)
            r1.mo46944i()
            r7 = 88
            r1.mo46945j(r7)
            r7 = 8
            r1.mo46945j(r7)
            r7 = 0
            r13 = 0
        L_0x0125:
            if (r7 >= r6) goto L_0x013a
            boolean r15 = r1.mo46939d()
            if (r15 == 0) goto L_0x012f
            int r13 = r13 + 89
        L_0x012f:
            boolean r15 = r1.mo46939d()
            if (r15 == 0) goto L_0x0137
            int r13 = r13 + 8
        L_0x0137:
            int r7 = r7 + 1
            goto L_0x0125
        L_0x013a:
            r1.mo46945j(r13)
            r7 = 2
            if (r6 <= 0) goto L_0x0146
            int r13 = 8 - r6
            int r13 = r13 * r7
            r1.mo46945j(r13)
        L_0x0146:
            r1.mo46941f()
            int r13 = r1.mo46941f()
            if (r13 != r5) goto L_0x0152
            r1.mo46944i()
        L_0x0152:
            int r5 = r1.mo46941f()
            int r15 = r1.mo46941f()
            boolean r21 = r1.mo46939d()
            if (r21 == 0) goto L_0x018c
            int r21 = r1.mo46941f()
            int r22 = r1.mo46941f()
            int r23 = r1.mo46941f()
            int r24 = r1.mo46941f()
            r25 = r3
            r3 = 1
            if (r13 == r3) goto L_0x017a
            if (r13 != r7) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r4 = r3
            goto L_0x017b
        L_0x017a:
            r4 = r7
        L_0x017b:
            if (r13 != r3) goto L_0x017e
            goto L_0x017f
        L_0x017e:
            r7 = 1
        L_0x017f:
            int r21 = r21 + r22
            int r21 = r21 * r4
            int r5 = r5 - r21
            int r23 = r23 + r24
            int r23 = r23 * r7
            int r15 = r15 - r23
            goto L_0x018e
        L_0x018c:
            r25 = r3
        L_0x018e:
            r1.mo46941f()
            r1.mo46941f()
            int r3 = r1.mo46941f()
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x01a0
            r4 = 0
            goto L_0x01a1
        L_0x01a0:
            r4 = r6
        L_0x01a1:
            if (r4 > r6) goto L_0x01af
            r1.mo46941f()
            r1.mo46941f()
            r1.mo46941f()
            int r4 = r4 + 1
            goto L_0x01a1
        L_0x01af:
            r1.mo46941f()
            r1.mo46941f()
            r1.mo46941f()
            r1.mo46941f()
            r1.mo46941f()
            r1.mo46941f()
            boolean r4 = r1.mo46939d()
            r6 = 4
            if (r4 == 0) goto L_0x020d
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x020d
            r4 = 0
        L_0x01cf:
            if (r4 >= r6) goto L_0x020d
            r6 = 0
        L_0x01d2:
            r7 = 6
            if (r6 >= r7) goto L_0x0207
            boolean r7 = r1.mo46939d()
            if (r7 != 0) goto L_0x01e1
            r1.mo46941f()
            r21 = r10
            goto L_0x01fe
        L_0x01e1:
            r7 = 64
            int r13 = r4 << 1
            int r13 = r13 + 4
            r21 = r10
            r10 = 1
            int r11 = r10 << r13
            int r7 = java.lang.Math.min(r7, r11)
            if (r4 <= r10) goto L_0x01f5
            r1.mo46942g()
        L_0x01f5:
            r10 = 0
        L_0x01f6:
            if (r10 >= r7) goto L_0x01fe
            r1.mo46942g()
            int r10 = r10 + 1
            goto L_0x01f6
        L_0x01fe:
            r7 = 3
            if (r4 != r7) goto L_0x0202
            goto L_0x0203
        L_0x0202:
            r7 = 1
        L_0x0203:
            int r6 = r6 + r7
            r10 = r21
            goto L_0x01d2
        L_0x0207:
            r21 = r10
            int r4 = r4 + 1
            r6 = 4
            goto L_0x01cf
        L_0x020d:
            r21 = r10
            r4 = 2
            r1.mo46945j(r4)
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x0227
            r4 = 8
            r1.mo46945j(r4)
            r1.mo46941f()
            r1.mo46941f()
            r1.mo46944i()
        L_0x0227:
            int r4 = r1.mo46941f()
            r6 = 0
            r7 = 0
            r10 = 0
        L_0x022e:
            if (r6 >= r4) goto L_0x027d
            if (r6 == 0) goto L_0x0236
            boolean r7 = r1.mo46939d()
        L_0x0236:
            if (r7 == 0) goto L_0x0250
            r1.mo46944i()
            r1.mo46941f()
            r11 = 0
        L_0x023f:
            if (r11 > r10) goto L_0x024d
            boolean r13 = r1.mo46939d()
            if (r13 == 0) goto L_0x024a
            r1.mo46944i()
        L_0x024a:
            int r11 = r11 + 1
            goto L_0x023f
        L_0x024d:
            r24 = r4
            goto L_0x0278
        L_0x0250:
            int r10 = r1.mo46941f()
            int r11 = r1.mo46941f()
            int r13 = r10 + r11
            r23 = 0
            r24 = r4
            r4 = r23
        L_0x0260:
            if (r4 >= r10) goto L_0x026b
            r1.mo46941f()
            r1.mo46944i()
            int r4 = r4 + 1
            goto L_0x0260
        L_0x026b:
            r4 = 0
        L_0x026c:
            if (r4 >= r11) goto L_0x0277
            r1.mo46941f()
            r1.mo46944i()
            int r4 = r4 + 1
            goto L_0x026c
        L_0x0277:
            r10 = r13
        L_0x0278:
            int r6 = r6 + 1
            r4 = r24
            goto L_0x022e
        L_0x027d:
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x0294
            r4 = 0
        L_0x0284:
            int r6 = r1.mo46941f()
            if (r4 >= r6) goto L_0x0294
            int r6 = r3 + 4
            int r6 = r6 + 1
            r1.mo46945j(r6)
            int r4 = r4 + 1
            goto L_0x0284
        L_0x0294:
            r3 = 2
            r1.mo46945j(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            boolean r4 = r1.mo46939d()
            r6 = 24
            if (r4 == 0) goto L_0x0309
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x02d6
            r4 = 8
            int r4 = r1.mo46940e(r4)
            r7 = 255(0xff, float:3.57E-43)
            if (r4 != r7) goto L_0x02c4
            r4 = 16
            int r7 = r1.mo46940e(r4)
            int r4 = r1.mo46940e(r4)
            if (r7 == 0) goto L_0x02d6
            if (r4 == 0) goto L_0x02d6
            float r3 = (float) r7
            float r4 = (float) r4
            float r3 = r3 / r4
            goto L_0x02d6
        L_0x02c4:
            float[] r7 = p513bj.C14068n.f30956b
            r10 = 17
            if (r4 >= r10) goto L_0x02cd
            r3 = r7[r4]
            goto L_0x02d6
        L_0x02cd:
            r7 = 46
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r11 = "H265Reader"
            p003a2.C0023f.m112m(r7, r10, r4, r11)
        L_0x02d6:
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x02df
            r1.mo46944i()
        L_0x02df:
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x02f2
            r4 = 4
            r1.mo46945j(r4)
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x02f2
            r1.mo46945j(r6)
        L_0x02f2:
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x02fe
            r1.mo46941f()
            r1.mo46941f()
        L_0x02fe:
            r1.mo46944i()
            boolean r4 = r1.mo46939d()
            if (r4 == 0) goto L_0x0309
            int r15 = r15 * 2
        L_0x0309:
            byte[] r4 = r2.f42006d
            int r2 = r2.f42007e
            r1.f30989a = r4
            r4 = 0
            r1.f30991c = r4
            r1.f30990b = r2
            r1.f30992d = r4
            r1.mo46936a()
            r1.mo46945j(r6)
            java.lang.String r1 = com.google.android.play.core.assetpacks.C15588c1.m25276E(r1)
            com.google.android.exoplayer2.Format$b r2 = new com.google.android.exoplayer2.Format$b
            r2.<init>()
            r2.f31293a = r12
            java.lang.String r4 = "video/hevc"
            r2.f31303k = r4
            r2.f31300h = r1
            r2.f31308p = r5
            r2.f31309q = r15
            r2.f31312t = r3
            java.util.List r1 = java.util.Collections.singletonList(r14)
            r2.f31305m = r1
            com.google.android.exoplayer2.Format r1 = r2.mo47144a()
            r9.mo47752a(r1)
            r1 = 1
            r0.f41941e = r1
            goto L_0x034c
        L_0x0344:
            r25 = r3
            r19 = r6
            r20 = r7
            r21 = r10
        L_0x034c:
            yh.r r1 = r0.f41946j
            boolean r1 = r1.mo70306b(r8)
            r2 = 5
            if (r1 == 0) goto L_0x0379
            yh.r r1 = r0.f41946j
            byte[] r3 = r1.f42006d
            int r1 = r1.f42007e
            int r1 = p513bj.C14068n.m21686e(r1, r3)
            bj.r r3 = r0.f41950n
            yh.r r4 = r0.f41946j
            byte[] r4 = r4.f42006d
            r3.mo46933x(r1, r4)
            bj.r r1 = r0.f41950n
            r1.mo46909A(r2)
            yh.a0 r1 = r0.f41937a
            bj.r r3 = r0.f41950n
            ph.v[] r1 = r1.f41711b
            r4 = r21
            p644ph.C18343b.m30976a(r4, r3, r1)
            goto L_0x037b
        L_0x0379:
            r4 = r21
        L_0x037b:
            yh.r r1 = r0.f41947k
            boolean r1 = r1.mo70306b(r8)
            if (r1 == 0) goto L_0x03a4
            yh.r r1 = r0.f41947k
            byte[] r3 = r1.f42006d
            int r1 = r1.f42007e
            int r1 = p513bj.C14068n.m21686e(r1, r3)
            bj.r r3 = r0.f41950n
            yh.r r6 = r0.f41947k
            byte[] r6 = r6.f42006d
            r3.mo46933x(r1, r6)
            bj.r r1 = r0.f41950n
            r1.mo46909A(r2)
            yh.a0 r1 = r0.f41937a
            bj.r r2 = r0.f41950n
            ph.v[] r1 = r1.f41711b
            p644ph.C18343b.m30976a(r4, r2, r1)
        L_0x03a4:
            long r1 = r0.f41949m
            yh.n$a r3 = r0.f41940d
            boolean r4 = r0.f41941e
            r5 = 0
            r3.f41957g = r5
            r3.f41958h = r5
            r3.f41955e = r1
            r3.f41954d = r5
            r1 = r25
            r3.f41952b = r1
            r6 = 32
            r7 = r20
            if (r7 < r6) goto L_0x03c4
            r8 = 40
            if (r7 != r8) goto L_0x03c2
            goto L_0x03c4
        L_0x03c2:
            r8 = r5
            goto L_0x03c5
        L_0x03c4:
            r8 = 1
        L_0x03c5:
            if (r8 != 0) goto L_0x03fb
            boolean r8 = r3.f41959i
            if (r8 == 0) goto L_0x03e3
            boolean r8 = r3.f41960j
            if (r8 != 0) goto L_0x03e3
            if (r4 == 0) goto L_0x03e1
            boolean r12 = r3.f41963m
            long r8 = r3.f41961k
            long r1 = r1 - r8
            int r13 = (int) r1
            ph.v r9 = r3.f41951a
            long r10 = r3.f41962l
            r15 = 0
            r14 = r19
            r9.mo47754c(r10, r12, r13, r14, r15)
        L_0x03e1:
            r3.f41959i = r5
        L_0x03e3:
            if (r6 > r7) goto L_0x03e9
            r1 = 35
            if (r7 <= r1) goto L_0x03ed
        L_0x03e9:
            r1 = 39
            if (r7 != r1) goto L_0x03ef
        L_0x03ed:
            r1 = 1
            goto L_0x03f0
        L_0x03ef:
            r1 = r5
        L_0x03f0:
            if (r1 == 0) goto L_0x03fb
            boolean r1 = r3.f41960j
            r2 = 1
            r1 = r1 ^ r2
            r3.f41958h = r1
            r3.f41960j = r2
            goto L_0x03fc
        L_0x03fb:
            r2 = 1
        L_0x03fc:
            r1 = 16
            if (r7 < r1) goto L_0x0406
            r1 = 21
            if (r7 > r1) goto L_0x0406
            r1 = r2
            goto L_0x0407
        L_0x0406:
            r1 = r5
        L_0x0407:
            r3.f41953c = r1
            if (r1 != 0) goto L_0x040f
            r1 = 9
            if (r7 > r1) goto L_0x0410
        L_0x040f:
            r5 = r2
        L_0x0410:
            r3.f41956f = r5
            boolean r1 = r0.f41941e
            if (r1 != 0) goto L_0x0425
            yh.r r1 = r0.f41943g
            r1.mo70308d(r7)
            yh.r r1 = r0.f41944h
            r1.mo70308d(r7)
            yh.r r1 = r0.f41945i
            r1.mo70308d(r7)
        L_0x0425:
            yh.r r1 = r0.f41946j
            r1.mo70308d(r7)
            yh.r r1 = r0.f41947k
            r1.mo70308d(r7)
            r1 = r28
            r2 = r16
            r5 = r17
            r3 = r18
            goto L_0x0020
        L_0x0439:
            r1 = r28
            goto L_0x000b
        L_0x043d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p717yh.C18867n.mo70281a(bj.r):void");
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: b */
    public final void mo70304b(int i, int i2, byte[] bArr) {
        C18868a aVar = this.f41940d;
        if (aVar.f41956f) {
            int i3 = aVar.f41954d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                aVar.f41957g = (bArr[i4] & 128) != 0;
                aVar.f41956f = false;
            } else {
                aVar.f41954d = (i2 - i) + i3;
            }
        }
        if (!this.f41941e) {
            this.f41943g.mo70305a(i, i2, bArr);
            this.f41944h.mo70305a(i, i2, bArr);
            this.f41945i.mo70305a(i, i2, bArr);
        }
        this.f41946j.mo70305a(i, i2, bArr);
        this.f41947k.mo70305a(i, i2, bArr);
    }

    /* renamed from: c */
    public final void mo70282c() {
        this.f41948l = 0;
        C14068n.m21682a(this.f41942f);
        this.f41943g.mo70307c();
        this.f41944h.mo70307c();
        this.f41945i.mo70307c();
        this.f41946j.mo70307c();
        this.f41947k.mo70307c();
        C18868a aVar = this.f41940d;
        if (aVar != null) {
            aVar.f41956f = false;
            aVar.f41957g = false;
            aVar.f41958h = false;
            aVar.f41959i = false;
            aVar.f41960j = false;
        }
    }

    /* renamed from: d */
    public final void mo70283d(C18351j jVar, C18848e0.C18852d dVar) {
        dVar.mo70293a();
        dVar.mo70294b();
        this.f41938b = dVar.f41796e;
        dVar.mo70294b();
        C18368v r = jVar.mo4164r(dVar.f41795d, 2);
        this.f41939c = r;
        this.f41940d = new C18868a(r);
        this.f41937a.mo70280a(jVar, dVar);
    }

    /* renamed from: e */
    public final void mo70284e() {
    }

    /* renamed from: f */
    public final void mo70285f(int i, long j) {
        this.f41949m = j;
    }
}
