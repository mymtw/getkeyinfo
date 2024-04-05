package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class BackdropScaffoldKt$BackdropScaffold$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $appBar;
    public final /* synthetic */ long $backLayerBackgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $backLayerContent;
    public final /* synthetic */ long $backLayerContentColor;
    public final /* synthetic */ long $frontLayerBackgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $frontLayerContent;
    public final /* synthetic */ long $frontLayerContentColor;
    public final /* synthetic */ float $frontLayerElevation;
    public final /* synthetic */ long $frontLayerScrimColor;
    public final /* synthetic */ C1530k0 $frontLayerShape;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ float $headerHeight;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $peekHeight;
    public final /* synthetic */ boolean $persistentAppBar;
    public final /* synthetic */ C1175d $scaffoldState;
    public final /* synthetic */ C19862q<C1254t1, C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ boolean $stickyFrontLayer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C1436d dVar, C1175d dVar2, boolean z, float f, float f2, boolean z2, boolean z3, long j, long j2, C1530k0 k0Var, float f3, long j3, long j4, long j5, C19862q<? super C1254t1, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2, int i3) {
        super(2);
        this.$appBar = pVar;
        this.$backLayerContent = pVar2;
        this.$frontLayerContent = pVar3;
        this.$modifier = dVar;
        this.$scaffoldState = dVar2;
        this.$gesturesEnabled = z;
        this.$peekHeight = f;
        this.$headerHeight = f2;
        this.$persistentAppBar = z2;
        this.$stickyFrontLayer = z3;
        this.$backLayerBackgroundColor = j;
        this.$backLayerContentColor = j2;
        this.$frontLayerShape = k0Var;
        this.$frontLayerElevation = f3;
        this.$frontLayerBackgroundColor = j3;
        this.$frontLayerContentColor = j4;
        this.$frontLayerScrimColor = j5;
        this.$snackbarHost = qVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01a3, code lost:
        if (r0.mo5434e(r3) != false) goto L_0x01aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r67, int r68) {
        /*
            r66 = this;
            r0 = r66
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r0.$appBar
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r8 = r0.$backLayerContent
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$frontLayerContent
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.material.d r2 = r0.$scaffoldState
            boolean r3 = r0.$gesturesEnabled
            float r4 = r0.$peekHeight
            float r5 = r0.$headerHeight
            boolean r6 = r0.$persistentAppBar
            boolean r9 = r0.$stickyFrontLayer
            long r10 = r0.$backLayerBackgroundColor
            long r12 = r0.$backLayerContentColor
            androidx.compose.ui.graphics.k0 r14 = r0.$frontLayerShape
            r16 = r14
            float r14 = r0.$frontLayerElevation
            r17 = r12
            long r12 = r0.$frontLayerBackgroundColor
            r19 = r12
            long r12 = r0.$frontLayerContentColor
            r21 = r12
            long r12 = r0.$frontLayerScrimColor
            r23 = r12
            kq.q<androidx.compose.material.t1, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r12 = r0.$snackbarHost
            int r13 = r0.$$changed
            r25 = 1
            r13 = r13 | 1
            r26 = r12
            int r12 = r0.$$changed1
            r27 = r14
            int r14 = r0.$$default
            float r28 = androidx.compose.material.C1171c.f2385a
            java.lang.String r0 = "appBar"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "backLayerContent"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "frontLayerContent"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r0 = 1397420093(0x534af03d, float:8.7161392E11)
            r28 = r10
            r10 = r67
            androidx.compose.runtime.ComposerImpl r0 = r10.mo5440h(r0)
            r10 = r14 & 1
            if (r10 == 0) goto L_0x0061
            r10 = r13 | 6
            goto L_0x0071
        L_0x0061:
            r10 = r13 & 14
            if (r10 != 0) goto L_0x0070
            boolean r10 = r0.mo5408I(r7)
            if (r10 == 0) goto L_0x006d
            r10 = 4
            goto L_0x006e
        L_0x006d:
            r10 = 2
        L_0x006e:
            r10 = r10 | r13
            goto L_0x0071
        L_0x0070:
            r10 = r13
        L_0x0071:
            r30 = r14 & 2
            r31 = 32
            if (r30 == 0) goto L_0x007a
            r10 = r10 | 48
            goto L_0x008b
        L_0x007a:
            r30 = r13 & 112(0x70, float:1.57E-43)
            if (r30 != 0) goto L_0x008b
            boolean r30 = r0.mo5408I(r8)
            if (r30 == 0) goto L_0x0087
            r30 = r31
            goto L_0x0089
        L_0x0087:
            r30 = 16
        L_0x0089:
            r10 = r10 | r30
        L_0x008b:
            r30 = r14 & 4
            r32 = 128(0x80, float:1.794E-43)
            r33 = 256(0x100, float:3.59E-43)
            if (r30 == 0) goto L_0x0096
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x00a6
        L_0x0096:
            r11 = r13 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x00a6
            boolean r11 = r0.mo5408I(r15)
            if (r11 == 0) goto L_0x00a3
            r11 = r33
            goto L_0x00a5
        L_0x00a3:
            r11 = r32
        L_0x00a5:
            r10 = r10 | r11
        L_0x00a6:
            r11 = r14 & 8
            r34 = 2048(0x800, float:2.87E-42)
            r35 = 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x00b3
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            r36 = r15
            goto L_0x00c5
        L_0x00b3:
            r36 = r15
            r15 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x00c5
            boolean r15 = r0.mo5408I(r1)
            if (r15 == 0) goto L_0x00c2
            r15 = r34
            goto L_0x00c4
        L_0x00c2:
            r15 = r35
        L_0x00c4:
            r10 = r10 | r15
        L_0x00c5:
            r15 = 57344(0xe000, float:8.0356E-41)
            r37 = r13 & r15
            r38 = 8192(0x2000, float:1.14794E-41)
            r39 = 16384(0x4000, float:2.2959E-41)
            if (r37 != 0) goto L_0x00e1
            r37 = r14 & 16
            if (r37 != 0) goto L_0x00dd
            boolean r37 = r0.mo5408I(r2)
            if (r37 == 0) goto L_0x00dd
            r37 = r39
            goto L_0x00df
        L_0x00dd:
            r37 = r38
        L_0x00df:
            r10 = r10 | r37
        L_0x00e1:
            r37 = r14 & 32
            r40 = 131072(0x20000, float:1.83671E-40)
            r41 = 65536(0x10000, float:9.18355E-41)
            r42 = 458752(0x70000, float:6.42848E-40)
            if (r37 == 0) goto L_0x00ee
            r43 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00fd
        L_0x00ee:
            r43 = r13 & r42
            if (r43 != 0) goto L_0x00ff
            boolean r43 = r0.mo5427a(r3)
            if (r43 == 0) goto L_0x00fb
            r43 = r40
            goto L_0x00fd
        L_0x00fb:
            r43 = r41
        L_0x00fd:
            r10 = r10 | r43
        L_0x00ff:
            r43 = r14 & 64
            r44 = 1572864(0x180000, float:2.204052E-39)
            r45 = 3670016(0x380000, float:5.142788E-39)
            if (r43 == 0) goto L_0x010a
            r10 = r10 | r44
            goto L_0x011b
        L_0x010a:
            r46 = r13 & r45
            if (r46 != 0) goto L_0x011b
            boolean r46 = r0.mo5428b(r4)
            if (r46 == 0) goto L_0x0117
            r46 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0119
        L_0x0117:
            r46 = 524288(0x80000, float:7.34684E-40)
        L_0x0119:
            r10 = r10 | r46
        L_0x011b:
            r15 = r14 & 128(0x80, float:1.794E-43)
            r47 = 29360128(0x1c00000, float:7.052966E-38)
            if (r15 == 0) goto L_0x0124
            r48 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x0133
        L_0x0124:
            r48 = r13 & r47
            if (r48 != 0) goto L_0x0135
            boolean r48 = r0.mo5428b(r5)
            if (r48 == 0) goto L_0x0131
            r48 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0133
        L_0x0131:
            r48 = 4194304(0x400000, float:5.877472E-39)
        L_0x0133:
            r10 = r10 | r48
        L_0x0135:
            r48 = r1
            r1 = r14 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x013e
            r49 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x014f
        L_0x013e:
            r49 = 234881024(0xe000000, float:1.5777218E-30)
            r49 = r13 & r49
            if (r49 != 0) goto L_0x0151
            boolean r49 = r0.mo5427a(r6)
            if (r49 == 0) goto L_0x014d
            r49 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x014f
        L_0x014d:
            r49 = 33554432(0x2000000, float:9.403955E-38)
        L_0x014f:
            r10 = r10 | r49
        L_0x0151:
            r49 = r2
            r2 = r14 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x015a
            r50 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x016b
        L_0x015a:
            r50 = 1879048192(0x70000000, float:1.58456325E29)
            r50 = r13 & r50
            if (r50 != 0) goto L_0x016d
            boolean r50 = r0.mo5427a(r9)
            if (r50 == 0) goto L_0x0169
            r50 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x016b
        L_0x0169:
            r50 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x016b:
            r10 = r10 | r50
        L_0x016d:
            r50 = r12 & 14
            if (r50 != 0) goto L_0x018b
            r50 = r3
            r3 = r14 & 1024(0x400, float:1.435E-42)
            r51 = r4
            if (r3 != 0) goto L_0x0184
            r3 = r28
            boolean r28 = r0.mo5434e(r3)
            if (r28 == 0) goto L_0x0186
            r28 = 4
            goto L_0x0188
        L_0x0184:
            r3 = r28
        L_0x0186:
            r28 = 2
        L_0x0188:
            r28 = r28 | r12
            goto L_0x0193
        L_0x018b:
            r50 = r3
            r51 = r4
            r3 = r28
            r28 = r12
        L_0x0193:
            r29 = r12 & 112(0x70, float:1.57E-43)
            if (r29 != 0) goto L_0x01ad
            r52 = r3
            r3 = r14 & 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x01a6
            r3 = r17
            boolean r17 = r0.mo5434e(r3)
            if (r17 == 0) goto L_0x01a8
            goto L_0x01aa
        L_0x01a6:
            r3 = r17
        L_0x01a8:
            r31 = 16
        L_0x01aa:
            r28 = r28 | r31
            goto L_0x01b1
        L_0x01ad:
            r52 = r3
            r3 = r17
        L_0x01b1:
            r17 = r3
            r3 = r12 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x01cb
            r3 = r14 & 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x01c6
            r3 = r16
            boolean r4 = r0.mo5408I(r3)
            if (r4 == 0) goto L_0x01c8
            r32 = r33
            goto L_0x01c8
        L_0x01c6:
            r3 = r16
        L_0x01c8:
            r28 = r28 | r32
            goto L_0x01cd
        L_0x01cb:
            r3 = r16
        L_0x01cd:
            r4 = r28
            r16 = r3
            r3 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01da
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r28 = r5
            goto L_0x01ee
        L_0x01da:
            r28 = r5
            r5 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x01ee
            r5 = r27
            boolean r27 = r0.mo5428b(r5)
            if (r27 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r34 = r35
        L_0x01eb:
            r4 = r4 | r34
            goto L_0x01f0
        L_0x01ee:
            r5 = r27
        L_0x01f0:
            r27 = 57344(0xe000, float:8.0356E-41)
            r27 = r12 & r27
            if (r27 != 0) goto L_0x020f
            r27 = r5
            r5 = r14 & 16384(0x4000, float:2.2959E-41)
            r29 = r6
            if (r5 != 0) goto L_0x020a
            r5 = r19
            boolean r19 = r0.mo5434e(r5)
            if (r19 == 0) goto L_0x020c
            r38 = r39
            goto L_0x020c
        L_0x020a:
            r5 = r19
        L_0x020c:
            r4 = r4 | r38
            goto L_0x0215
        L_0x020f:
            r27 = r5
            r29 = r6
            r5 = r19
        L_0x0215:
            r19 = r12 & r42
            r20 = 32768(0x8000, float:4.5918E-41)
            if (r19 != 0) goto L_0x0232
            r19 = r14 & r20
            r31 = r5
            r5 = r21
            if (r19 != 0) goto L_0x022d
            boolean r19 = r0.mo5434e(r5)
            if (r19 == 0) goto L_0x022d
            r19 = r40
            goto L_0x022f
        L_0x022d:
            r19 = r41
        L_0x022f:
            r4 = r4 | r19
            goto L_0x0236
        L_0x0232:
            r31 = r5
            r5 = r21
        L_0x0236:
            r19 = r12 & r45
            if (r19 != 0) goto L_0x0250
            r19 = r14 & r41
            r21 = r5
            r5 = r23
            if (r19 != 0) goto L_0x024b
            boolean r19 = r0.mo5434e(r5)
            if (r19 == 0) goto L_0x024b
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x024d
        L_0x024b:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x024d:
            r4 = r4 | r19
            goto L_0x0254
        L_0x0250:
            r21 = r5
            r5 = r23
        L_0x0254:
            r19 = r14 & r40
            if (r19 == 0) goto L_0x025d
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r23
            goto L_0x0272
        L_0x025d:
            r23 = r12 & r47
            if (r23 != 0) goto L_0x0272
            r23 = r5
            r5 = r26
            boolean r6 = r0.mo5408I(r5)
            if (r6 == 0) goto L_0x026e
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0270
        L_0x026e:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x0270:
            r4 = r4 | r6
            goto L_0x0276
        L_0x0272:
            r23 = r5
            r5 = r26
        L_0x0276:
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r10
            r26 = r5
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r5) goto L_0x02b7
            r5 = 23967451(0x16db6db, float:4.3661218E-38)
            r5 = r5 & r4
            r6 = 4793490(0x492492, float:6.71711E-39)
            if (r5 != r6) goto L_0x02b7
            boolean r5 = r0.mo5442i()
            if (r5 != 0) goto L_0x0291
            goto L_0x02b7
        L_0x0291:
            r0.mo5396C()
            r42 = r8
            r11 = r9
            r62 = r12
            r63 = r13
            r64 = r14
            r14 = r17
            r20 = r21
            r22 = r23
            r24 = r26
            r17 = r27
            r9 = r28
            r10 = r29
            r18 = r31
            r6 = r36
            r5 = r48
            r8 = r51
            r12 = r52
            goto L_0x0560
        L_0x02b7:
            r0.mo5466u0()
            r5 = r13 & 1
            if (r5 == 0) goto L_0x031d
            boolean r5 = r0.mo5425Y()
            if (r5 == 0) goto L_0x02c5
            goto L_0x031d
        L_0x02c5:
            r0.mo5396C()
            r1 = r14 & 16
            if (r1 == 0) goto L_0x02d0
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = r10 & r1
        L_0x02d0:
            r1 = r14 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x02d6
            r4 = r4 & -15
        L_0x02d6:
            r1 = r14 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x02dc
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x02dc:
            r1 = r14 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02e2
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02e2:
            r1 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x02ea
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = r4 & r1
        L_0x02ea:
            r1 = r14 & r20
            if (r1 == 0) goto L_0x02f2
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x02f2:
            r1 = r14 & r41
            if (r1 == 0) goto L_0x02fa
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r1
        L_0x02fa:
            r42 = r8
            r45 = r9
            r38 = r12
            r39 = r13
            r47 = r16
            r54 = r17
            r58 = r21
            r60 = r23
            r46 = r26
            r13 = r28
            r43 = r29
            r56 = r31
            r15 = r51
            r8 = 0
            r32 = r4
            r18 = r10
            r51 = r27
            goto L_0x049e
        L_0x031d:
            if (r11 == 0) goto L_0x0323
            androidx.compose.ui.d$a r5 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r48 = r5
        L_0x0323:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0392
            androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
            java.lang.String r11 = "initialValue"
            kotlin.jvm.internal.C19383o.m32797g(r5, r11)
            r11 = -862178912(0xffffffffcc9c31a0, float:-8.189056E7)
            r0.mo5465u(r11)
            androidx.compose.animation.core.h0<java.lang.Float> r11 = androidx.compose.material.C1258u1.f2630a
            androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1 r6 = androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1.INSTANCE
            r35 = r9
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r9)
            java.lang.Object r9 = r0.mo5431c0()
            r38 = r12
            androidx.compose.runtime.d$a$a r12 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r9 != r12) goto L_0x0352
            androidx.compose.material.t1 r9 = new androidx.compose.material.t1
            r9.<init>()
            r0.mo5407H0(r9)
        L_0x0352:
            r12 = 0
            r0.mo5418R(r12)
            androidx.compose.material.t1 r9 = (androidx.compose.material.C1254t1) r9
            r39 = r13
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r12] = r11
            r13[r25] = r6
            r12 = 2
            r13[r12] = r9
            java.lang.String r12 = "confirmStateChange"
            kotlin.jvm.internal.C19383o.m32797g(r6, r12)
            java.lang.String r12 = "snackbarHostState"
            kotlin.jvm.internal.C19383o.m32797g(r9, r12)
            androidx.compose.material.BackdropScaffoldState$Companion$Saver$1 r12 = androidx.compose.material.BackdropScaffoldState$Companion$Saver$1.INSTANCE
            r42 = r8
            androidx.compose.material.BackdropScaffoldState$Companion$Saver$2 r8 = new androidx.compose.material.BackdropScaffoldState$Companion$Saver$2
            r8.<init>(r11, r6, r9)
            androidx.compose.runtime.saveable.h r8 = androidx.compose.runtime.saveable.SaverKt.m2861a(r12, r8)
            androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3 r12 = new androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3
            r12.<init>(r5, r11, r6, r9)
            r5 = 4
            java.lang.Object r5 = androidx.compose.runtime.saveable.C1366b.m2863a(r13, r8, r12, r0, r5)
            androidx.compose.material.d r5 = (androidx.compose.material.C1175d) r5
            r6 = 0
            r0.mo5418R(r6)
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            r10 = r10 & r6
            r49 = r5
            goto L_0x039a
        L_0x0392:
            r42 = r8
            r35 = r9
            r38 = r12
            r39 = r13
        L_0x039a:
            if (r37 == 0) goto L_0x039e
            r50 = r25
        L_0x039e:
            if (r43 == 0) goto L_0x03a4
            float r5 = androidx.compose.material.C1167b.f2377a
            r51 = r5
        L_0x03a4:
            if (r15 == 0) goto L_0x03a9
            float r5 = androidx.compose.material.C1167b.f2378b
            goto L_0x03ab
        L_0x03a9:
            r5 = r28
        L_0x03ab:
            if (r1 == 0) goto L_0x03b0
            r6 = r25
            goto L_0x03b2
        L_0x03b0:
            r6 = r29
        L_0x03b2:
            if (r2 == 0) goto L_0x03b7
            r9 = r25
            goto L_0x03b9
        L_0x03b7:
            r9 = r35
        L_0x03b9:
            r1 = r14 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x03cc
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.material.v r1 = (androidx.compose.material.C1259v) r1
            long r1 = r1.mo5359f()
            r4 = r4 & -15
            goto L_0x03ce
        L_0x03cc:
            r1 = r52
        L_0x03ce:
            r8 = r14 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x03d9
            long r12 = androidx.compose.material.ColorsKt.m2174b(r1, r0)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x03db
        L_0x03d9:
            r12 = r17
        L_0x03db:
            r8 = r14 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0419
            float r8 = androidx.compose.material.C1167b.f2377a
            r8 = 1580588700(0x5e35de9c, float:3.27627087E18)
            r0.mo5465u(r8)
            androidx.compose.runtime.l1 r8 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.material.q1 r8 = (androidx.compose.material.C1225q1) r8
            p.a r8 = r8.f2549c
            r11 = 16
            float r11 = (float) r11
            p.d r15 = new p.d
            r15.<init>(r11)
            r17 = r1
            p.d r1 = new p.d
            r1.<init>(r11)
            r55 = 0
            r56 = 0
            r57 = 12
            r52 = r8
            r53 = r15
            r54 = r1
            p.a r1 = p202p.C7638a.m14651c(r52, r53, r54, r55, r56, r57)
            r2 = 0
            r0.mo5418R(r2)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r16 = r1
            goto L_0x041b
        L_0x0419:
            r17 = r1
        L_0x041b:
            if (r3 == 0) goto L_0x0420
            float r1 = androidx.compose.material.C1167b.f2379c
            goto L_0x0422
        L_0x0420:
            r1 = r27
        L_0x0422:
            r2 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0437
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r2 = r2.mo5363j()
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = r4 & r8
            goto L_0x0439
        L_0x0437:
            r2 = r31
        L_0x0439:
            r8 = r14 & r20
            if (r8 == 0) goto L_0x0446
            long r20 = androidx.compose.material.ColorsKt.m2174b(r2, r0)
            r8 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r8
            goto L_0x0448
        L_0x0446:
            r20 = r21
        L_0x0448:
            r8 = r14 & r41
            if (r8 == 0) goto L_0x0475
            float r8 = androidx.compose.material.C1167b.f2377a
            r8 = 1806270648(0x6ba980b8, float:4.0983264E26)
            r0.mo5465u(r8)
            androidx.compose.runtime.l1 r8 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.material.v r8 = (androidx.compose.material.C1259v) r8
            r67 = r1
            r27 = r2
            long r1 = r8.mo5363j()
            r3 = 1058642330(0x3f19999a, float:0.6)
            long r1 = androidx.compose.p015ui.graphics.C1545s.m3356b(r1, r3)
            r8 = 0
            r0.mo5418R(r8)
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r4 = r3
            goto L_0x047c
        L_0x0475:
            r67 = r1
            r27 = r2
            r8 = 0
            r1 = r23
        L_0x047c:
            if (r19 == 0) goto L_0x0481
            androidx.compose.runtime.internal.ComposableLambdaImpl r3 = androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.f2189a
            goto L_0x0483
        L_0x0481:
            r3 = r26
        L_0x0483:
            r60 = r1
            r46 = r3
            r32 = r4
            r43 = r6
            r45 = r9
            r54 = r12
            r47 = r16
            r52 = r17
            r58 = r20
            r56 = r27
            r15 = r51
            r51 = r67
            r13 = r5
            r18 = r10
        L_0x049e:
            r0.mo5419S()
            androidx.compose.runtime.l1 r1 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r2 = r0.mo5410J(r1)
            m0.b r2 = (p174m0.C7282b) r2
            float r17 = r2.mo3789B0(r15)
            java.lang.Object r1 = r0.mo5410J(r1)
            m0.b r1 = (p174m0.C7282b) r1
            float r11 = r1.mo3789B0(r13)
            r9 = 1744778315(0x67ff344b, float:2.4103362E24)
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1 r10 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
            r1 = r10
            r2 = r43
            r3 = r49
            r4 = r7
            r5 = r42
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r0, r9, r10)
            java.lang.Float r2 = java.lang.Float.valueOf(r11)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r0.mo5465u(r3)
            boolean r2 = r0.mo5408I(r2)
            java.lang.Object r3 = r0.mo5431c0()
            if (r2 != 0) goto L_0x04e5
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r2) goto L_0x04ed
        L_0x04e5:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 r3 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
            r3.<init>(r11)
            r0.mo5407H0(r3)
        L_0x04ed:
            r0.mo5418R(r8)
            r12 = r3
            kq.l r12 = (p753kq.C19857l) r12
            r62 = r38
            r2 = 0
            r3 = 0
            r4 = 0
            r37 = 0
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1 r5 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
            r9 = r5
            r10 = r48
            r6 = r11
            r11 = r1
            r1 = r13
            r63 = r39
            r13 = r6
            r64 = r14
            r14 = r45
            r8 = r15
            r6 = r36
            r15 = r50
            r16 = r49
            r19 = r47
            r20 = r56
            r22 = r58
            r24 = r51
            r25 = r32
            r26 = r1
            r27 = r8
            r28 = r6
            r29 = r60
            r31 = r46
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25, r26, r27, r28, r29, r31)
            r9 = -1049909631(0xffffffffc16ba681, float:-14.72815)
            androidx.compose.runtime.internal.ComposableLambdaImpl r38 = p628nj.C18263b.m30805A(r0, r9, r5)
            int r5 = r32 << 6
            r9 = r5 & 896(0x380, float:1.256E-42)
            r9 = r9 | r44
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r40 = r9 | r5
            r41 = 51
            r30 = r2
            r31 = r3
            r32 = r52
            r34 = r54
            r36 = r4
            r39 = r0
            androidx.compose.material.SurfaceKt.m2234a(r30, r31, r32, r34, r36, r37, r38, r39, r40, r41)
            r9 = r1
            r10 = r43
            r11 = r45
            r24 = r46
            r16 = r47
            r5 = r48
            r17 = r51
            r12 = r52
            r14 = r54
            r18 = r56
            r20 = r58
            r22 = r60
        L_0x0560:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x0567
            goto L_0x0582
        L_0x0567:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2 r4 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
            r1 = r4
            r2 = r7
            r3 = r42
            r7 = r4
            r4 = r6
            r6 = r49
            r65 = r7
            r7 = r50
            r25 = r63
            r26 = r62
            r27 = r64
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r20, r22, r24, r25, r26, r27)
            r1 = r65
            r0.f3081d = r1
        L_0x0582:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
