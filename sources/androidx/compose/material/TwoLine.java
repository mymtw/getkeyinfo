package androidx.compose.material;

public final class TwoLine {

    /* renamed from: a */
    public static final TwoLine f2356a = new TwoLine();

    /* renamed from: b */
    public static final float f2357b = ((float) 64);

    /* renamed from: c */
    public static final float f2358c = ((float) 72);

    /* renamed from: d */
    public static final float f2359d = ((float) 40);

    /* renamed from: e */
    public static final float f2360e;

    /* renamed from: f */
    public static final float f2361f;

    /* renamed from: g */
    public static final float f2362g;

    /* renamed from: h */
    public static final float f2363h;

    /* renamed from: i */
    public static final float f2364i = ((float) 24);

    /* renamed from: j */
    public static final float f2365j;

    /* renamed from: k */
    public static final float f2366k = ((float) 28);

    /* renamed from: l */
    public static final float f2367l = ((float) 32);

    /* renamed from: m */
    public static final float f2368m;

    /* renamed from: n */
    public static final float f2369n;

    /* renamed from: o */
    public static final float f2370o;

    static {
        float f = (float) 16;
        f2360e = f;
        f2361f = f;
        f2362g = f;
        f2363h = f;
        float f2 = (float) 20;
        f2365j = f2;
        f2368m = f2;
        f2369n = f2;
        f2370o = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: type inference failed for: r10v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5216a(androidx.compose.p015ui.C1436d r33, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r34, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r35, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r36, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r37, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r38, androidx.compose.runtime.C1302d r39, int r40, int r41) {
        /*
            r32 = this;
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r40
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r0 = -1340612993(0xffffffffb017de7f, float:-5.5249666E-10)
            r1 = r39
            androidx.compose.runtime.ComposerImpl r5 = r1.mo5440h(r0)
            r0 = r41 & 1
            r1 = 2
            if (r0 == 0) goto L_0x0025
            r2 = r11 | 6
            r3 = r2
            r2 = r33
            goto L_0x0039
        L_0x0025:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x0036
            r2 = r33
            boolean r3 = r5.mo5408I(r2)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = r1
        L_0x0034:
            r3 = r3 | r11
            goto L_0x0039
        L_0x0036:
            r2 = r33
            r3 = r11
        L_0x0039:
            r4 = r41 & 2
            if (r4 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0050
        L_0x0040:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0050
            boolean r4 = r5.mo5408I(r6)
            if (r4 == 0) goto L_0x004d
            r4 = 32
            goto L_0x004f
        L_0x004d:
            r4 = 16
        L_0x004f:
            r3 = r3 | r4
        L_0x0050:
            r4 = r41 & 4
            if (r4 == 0) goto L_0x0057
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0067
            boolean r4 = r5.mo5408I(r7)
            if (r4 == 0) goto L_0x0064
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r4
        L_0x0067:
            r4 = r41 & 8
            if (r4 == 0) goto L_0x006e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007e
        L_0x006e:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x007e
            boolean r4 = r5.mo5408I(r8)
            if (r4 == 0) goto L_0x007b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r4
        L_0x007e:
            r4 = r41 & 16
            if (r4 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0085:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x0097
            boolean r4 = r5.mo5408I(r9)
            if (r4 == 0) goto L_0x0094
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r4
        L_0x0097:
            r4 = r41 & 32
            if (r4 == 0) goto L_0x009e
            r4 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00ae
        L_0x009e:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x00af
            boolean r4 = r5.mo5408I(r10)
            if (r4 == 0) goto L_0x00ac
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r4
        L_0x00af:
            r4 = r41 & 64
            if (r4 == 0) goto L_0x00b7
            r4 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r4
            goto L_0x00cb
        L_0x00b7:
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x00cb
            r4 = r32
            boolean r12 = r5.mo5408I(r4)
            if (r12 == 0) goto L_0x00c7
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c9
        L_0x00c7:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00c9:
            r3 = r3 | r12
            goto L_0x00cd
        L_0x00cb:
            r4 = r32
        L_0x00cd:
            r12 = 2995931(0x2db6db, float:4.198194E-39)
            r12 = r12 & r3
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r12 != r13) goto L_0x00e3
            boolean r12 = r5.mo5442i()
            if (r12 != 0) goto L_0x00dd
            goto L_0x00e3
        L_0x00dd:
            r5.mo5396C()
            r1 = r5
            goto L_0x0319
        L_0x00e3:
            if (r0 == 0) goto L_0x00e8
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r2 = r0
        L_0x00e8:
            if (r6 != 0) goto L_0x00ed
            float r0 = f2357b
            goto L_0x00ef
        L_0x00ed:
            float r0 = f2358c
        L_0x00ef:
            r12 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1489i(r2, r0, r12, r1)
            r12 = 693286680(0x2952b718, float:4.6788176E-14)
            r5.mo5465u(r12)
            androidx.compose.foundation.layout.d$i r12 = androidx.compose.foundation.layout.C0718d.f1476a
            androidx.compose.ui.b$b r13 = androidx.compose.p015ui.C1428a.C1429a.f3113i
            androidx.compose.ui.layout.v r12 = androidx.compose.foundation.layout.RowKt.m1480a(r12, r13, r5)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r13)
            androidx.compose.runtime.l1 r15 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r13 = r5.mo5410J(r15)
            m0.b r13 = (p174m0.C7282b) r13
            androidx.compose.runtime.l1 r14 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r16 = r5.mo5410J(r14)
            r33 = r2
            r2 = r16
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p015ui.unit.LayoutDirection) r2
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r16 = r5.mo5410J(r4)
            r11 = r16
            androidx.compose.ui.platform.j1 r11 = (androidx.compose.p015ui.platform.C1843j1) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r16.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r10 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            r39 = r14
            androidx.compose.runtime.c<?> r14 = r5.f2715a
            boolean r14 = r14 instanceof androidx.compose.runtime.C1299c
            r18 = 0
            if (r14 == 0) goto L_0x0345
            r5.mo5392A()
            boolean r14 = r5.f2702K
            if (r14 == 0) goto L_0x0146
            r5.mo5450m(r10)
            goto L_0x0149
        L_0x0146:
            r5.mo5452n()
        L_0x0149:
            r14 = 0
            r5.f2738x = r14
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r14 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r5, r12, r14)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r12 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r5, r13, r12)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r5, r2, r13)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r11 = p504ai.C13983i.m21490i(r5, r11, r2, r5)
            r16 = 0
            r17 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r19 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r20 = r12
            r12 = r16
            r21 = r13
            r13 = r1
            r1 = r39
            r22 = r14
            r14 = r11
            r11 = r15
            r15 = r5
            r16 = r17
            r17 = r19
            androidx.appcompat.widget.C0326j.m868m(r12, r13, r14, r15, r16, r17)
            r12 = 1912737507(0x72020ee3, float:2.576067E30)
            r5.mo5465u(r12)
            androidx.compose.ui.d$a r12 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r13 = 1065353216(0x3f800000, float:1.0)
            double r14 = (double) r13
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r15 = 1
            if (r14 <= 0) goto L_0x0192
            r14 = r15
            goto L_0x0193
        L_0x0192:
            r14 = 0
        L_0x0193:
            if (r14 == 0) goto L_0x0339
            androidx.compose.foundation.layout.s r14 = new androidx.compose.foundation.layout.s
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r16 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            r14.<init>(r13, r15)
            r12.mo6148i0(r14)
            float r24 = f2362g
            r25 = 0
            float r26 = f2363h
            r27 = 0
            r28 = 10
            r23 = r14
            androidx.compose.ui.d r25 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r23, r24, r25, r26, r27, r28)
            r13 = -269995367(0xffffffffefe83299, float:-1.4372338E29)
            r5.mo5465u(r13)
            if (r6 == 0) goto L_0x025a
            float r27 = f2360e
            float r13 = f2359d
            float r13 = r27 + r13
            r29 = 0
            r16 = 0
            r17 = 12
            r15 = 0
            r14 = r0
            androidx.compose.ui.d r26 = androidx.compose.foundation.layout.SizeKt.m1494n(r12, r13, r14, r15, r16, r17)
            float r30 = f2361f
            r31 = 4
            r28 = r30
            androidx.compose.ui.d r12 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r26, r27, r28, r29, r30, r31)
            androidx.compose.ui.b r13 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r14 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.mo5465u(r14)
            r14 = 0
            androidx.compose.ui.layout.v r13 = androidx.compose.foundation.layout.BoxKt.m1457c(r13, r14, r5)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r14)
            java.lang.Object r11 = r5.mo5410J(r11)
            r16 = r11
            m0.b r16 = (p174m0.C7282b) r16
            java.lang.Object r1 = r5.mo5410J(r1)
            r19 = r1
            androidx.compose.ui.unit.LayoutDirection r19 = (androidx.compose.p015ui.unit.LayoutDirection) r19
            java.lang.Object r1 = r5.mo5410J(r4)
            androidx.compose.ui.platform.j1 r1 = (androidx.compose.p015ui.platform.C1843j1) r1
            androidx.compose.runtime.internal.ComposableLambdaImpl r4 = androidx.compose.p015ui.layout.C1700o.m3617a(r12)
            androidx.compose.runtime.c<?> r11 = r5.f2715a
            boolean r11 = r11 instanceof androidx.compose.runtime.C1299c
            if (r11 == 0) goto L_0x0256
            r5.mo5392A()
            boolean r11 = r5.f2702K
            if (r11 == 0) goto L_0x0211
            r5.mo5450m(r10)
            goto L_0x0214
        L_0x0211:
            r5.mo5452n()
        L_0x0214:
            r10 = 0
            r5.f2738x = r10
            r12 = r5
            r14 = r22
            r15 = r5
            r17 = r20
            r18 = r5
            r20 = r21
            r21 = r5
            r22 = r1
            r23 = r2
            r24 = r5
            androidx.compose.runtime.a1 r14 = p003a2.C0023f.m106g(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r16 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r17 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r12 = r10
            r13 = r4
            androidx.appcompat.widget.C0326j.m868m(r12, r13, r14, r15, r16, r17)
            r1 = 1698757508(0x6540fb84, float:5.6958376E22)
            r5.mo5465u(r1)
            int r1 = r3 >> 3
            r1 = r1 & 14
            r11 = r0
            r0 = r1
            r1 = r34
            r19 = r33
            r2 = r5
            r15 = r3
            r3 = r10
            r4 = r10
            r14 = r5
            r5 = r10
            androidx.compose.animation.C0472h.m1247j(r0, r1, r2, r3, r4, r5)
            r0 = 1
            android.support.p013v4.media.C0071c.m194f(r14, r0, r10, r10)
            goto L_0x0260
        L_0x0256:
            p001a0.C0005b.m45j0()
            throw r18
        L_0x025a:
            r19 = r33
            r11 = r0
            r15 = r3
            r14 = r5
            r10 = 0
        L_0x0260:
            r14.mo5418R(r10)
            if (r9 == 0) goto L_0x02a5
            r0 = -269994745(0xffffffffefe83507, float:-1.4372926E29)
            r14.mo5465u(r0)
            r0 = 2
            m0.d[] r0 = new p174m0.C7284d[r0]
            float r1 = f2364i
            m0.d r2 = new m0.d
            r2.<init>(r1)
            r0[r10] = r2
            float r1 = f2365j
            m0.d r2 = new m0.d
            r2.<init>(r1)
            r1 = 1
            r0[r1] = r2
            java.util.List r12 = p568fn.C17782b.m29865e0(r0)
            r0 = -1675021441(0xffffffff9c29337f, float:-5.5983967E-22)
            androidx.compose.material.TwoLine$ListItem$1$2 r1 = new androidx.compose.material.TwoLine$ListItem$1$2
            r1.<init>(r9, r15, r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r14, r0, r1)
            r16 = 384(0x180, float:5.38E-43)
            r17 = 0
            r13 = r25
            r1 = r14
            r14 = r0
            r3 = r15
            r15 = r1
            androidx.compose.material.C1270y0.m2406a(r12, r13, r14, r15, r16, r17)
            r0 = 0
            r1.mo5418R(r0)
        L_0x02a2:
            r10 = r38
            goto L_0x02ed
        L_0x02a5:
            r1 = r14
            r3 = r15
            r0 = -269994465(0xffffffffefe8361f, float:-1.437319E29)
            r1.mo5465u(r0)
            r0 = 2
            m0.d[] r0 = new p174m0.C7284d[r0]
            if (r6 == 0) goto L_0x02b5
            float r2 = f2367l
            goto L_0x02b7
        L_0x02b5:
            float r2 = f2366k
        L_0x02b7:
            m0.d r4 = new m0.d
            r4.<init>(r2)
            r2 = 0
            r0[r2] = r4
            if (r6 == 0) goto L_0x02c4
            float r2 = f2369n
            goto L_0x02c6
        L_0x02c4:
            float r2 = f2368m
        L_0x02c6:
            m0.d r4 = new m0.d
            r4.<init>(r2)
            r2 = 1
            r0[r2] = r4
            java.util.List r12 = p568fn.C17782b.m29865e0(r0)
            r0 = 993836488(0x3b3cbdc8, float:0.0028799642)
            androidx.compose.material.TwoLine$ListItem$1$3 r2 = new androidx.compose.material.TwoLine$ListItem$1$3
            r2.<init>(r7, r3, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = p628nj.C18263b.m30805A(r1, r0, r2)
            r16 = 384(0x180, float:5.38E-43)
            r17 = 0
            r13 = r25
            r15 = r1
            androidx.compose.material.C1270y0.m2406a(r12, r13, r14, r15, r16, r17)
            r0 = 0
            r1.mo5418R(r0)
            goto L_0x02a2
        L_0x02ed:
            if (r10 == 0) goto L_0x030c
            if (r6 == 0) goto L_0x02f4
            float r0 = f2367l
            goto L_0x02f6
        L_0x02f4:
            float r0 = f2366k
        L_0x02f6:
            r12 = r0
            r13 = 0
            r0 = -1696992176(0xffffffff9ad9f450, float:-9.0143805E-23)
            androidx.compose.material.TwoLine$ListItem$1$4 r2 = new androidx.compose.material.TwoLine$ListItem$1$4
            r2.<init>(r11, r10, r3)
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = p628nj.C18263b.m30805A(r1, r0, r2)
            r16 = 384(0x180, float:5.38E-43)
            r17 = 2
            r15 = r1
            androidx.compose.material.C1270y0.m2407b(r12, r13, r14, r15, r16, r17)
        L_0x030c:
            r0 = 0
            r2 = 1
            android.support.p013v4.media.session.C0087d.m238h(r1, r0, r0, r0, r2)
            r1.mo5418R(r0)
            r1.mo5418R(r0)
            r2 = r19
        L_0x0319:
            androidx.compose.runtime.v0 r11 = r1.mo5421U()
            if (r11 != 0) goto L_0x0320
            goto L_0x0338
        L_0x0320:
            androidx.compose.material.TwoLine$ListItem$2 r12 = new androidx.compose.material.TwoLine$ListItem$2
            r0 = r12
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r40
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.f3081d = r12
        L_0x0338:
            return
        L_0x0339:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid weight 1.0; must be greater than zero"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0345:
            p001a0.C0005b.m45j0()
            throw r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TwoLine.mo5216a(androidx.compose.ui.d, kq.p, kq.p, kq.p, kq.p, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
