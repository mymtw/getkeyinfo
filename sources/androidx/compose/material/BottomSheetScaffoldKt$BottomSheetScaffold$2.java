package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ boolean $drawerGesturesEnabled;
    public final /* synthetic */ long $drawerScrimColor;
    public final /* synthetic */ C1530k0 $drawerShape;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1208l $scaffoldState;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ boolean $sheetGesturesEnabled;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ C1530k0 $sheetShape;
    public final /* synthetic */ C19862q<C1254t1, C1302d, Integer, C19394m> $snackbarHost;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$2(C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, C1436d dVar, C1208l lVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C1254t1, ? super C1302d, ? super Integer, C19394m> qVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i, boolean z, C1530k0 k0Var, float f, long j, long j2, float f2, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar3, boolean z2, C1530k0 k0Var2, float f3, long j3, long j4, long j5, long j6, long j7, C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar4, int i2, int i3, int i4, int i5) {
        super(2);
        this.$sheetContent = qVar;
        this.$modifier = dVar;
        this.$scaffoldState = lVar;
        this.$topBar = pVar;
        this.$snackbarHost = qVar2;
        this.$floatingActionButton = pVar2;
        this.$floatingActionButtonPosition = i;
        this.$sheetGesturesEnabled = z;
        this.$sheetShape = k0Var;
        this.$sheetElevation = f;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetPeekHeight = f2;
        this.$drawerContent = qVar3;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = k0Var2;
        this.$drawerElevation = f3;
        this.$drawerBackgroundColor = j3;
        this.$drawerContentColor = j4;
        this.$drawerScrimColor = j5;
        this.$backgroundColor = j6;
        this.$contentColor = j7;
        this.$content = qVar4;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$changed2 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:371:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r90, int r91) {
        /*
            r89 = this;
            r0 = r89
            kq.q<androidx.compose.foundation.layout.i, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$sheetContent
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.material.l r2 = r0.$scaffoldState
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r3 = r0.$topBar
            kq.q<androidx.compose.material.t1, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r4 = r0.$snackbarHost
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r5 = r0.$floatingActionButton
            int r6 = r0.$floatingActionButtonPosition
            boolean r7 = r0.$sheetGesturesEnabled
            androidx.compose.ui.graphics.k0 r8 = r0.$sheetShape
            float r9 = r0.$sheetElevation
            long r10 = r0.$sheetBackgroundColor
            long r12 = r0.$sheetContentColor
            float r14 = r0.$sheetPeekHeight
            r16 = r14
            kq.q<androidx.compose.foundation.layout.i, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$drawerContent
            r17 = r14
            boolean r14 = r0.$drawerGesturesEnabled
            r18 = r14
            androidx.compose.ui.graphics.k0 r14 = r0.$drawerShape
            r19 = r14
            float r14 = r0.$drawerElevation
            r20 = r12
            long r12 = r0.$drawerBackgroundColor
            r22 = r12
            long r12 = r0.$drawerContentColor
            r24 = r12
            long r12 = r0.$drawerScrimColor
            r26 = r12
            long r12 = r0.$backgroundColor
            r28 = r12
            long r12 = r0.$contentColor
            r30 = r12
            kq.q<androidx.compose.foundation.layout.v, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r12 = r0.$content
            int r13 = r0.$$changed
            r32 = r14
            r14 = 1
            r13 = r13 | r14
            int r14 = r0.$$changed1
            r33 = r10
            int r10 = r0.$$changed2
            int r11 = r0.$$default
            float r35 = androidx.compose.material.C1205k.f2506a
            java.lang.String r0 = "sheetContent"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            r0 = 46422755(0x2c45ae3, float:2.8851778E-37)
            r35 = r12
            r12 = r90
            androidx.compose.runtime.ComposerImpl r0 = r12.mo5440h(r0)
            r12 = r11 & 1
            r36 = 2
            r37 = r10
            if (r12 == 0) goto L_0x0074
            r12 = r13 | 6
            goto L_0x0085
        L_0x0074:
            r12 = r13 & 14
            if (r12 != 0) goto L_0x0084
            boolean r12 = r0.mo5408I(r15)
            if (r12 == 0) goto L_0x0080
            r12 = 4
            goto L_0x0082
        L_0x0080:
            r12 = r36
        L_0x0082:
            r12 = r12 | r13
            goto L_0x0085
        L_0x0084:
            r12 = r13
        L_0x0085:
            r38 = r11 & 2
            r39 = 16
            r40 = 32
            if (r38 == 0) goto L_0x0090
            r12 = r12 | 48
            goto L_0x00a1
        L_0x0090:
            r41 = r13 & 112(0x70, float:1.57E-43)
            if (r41 != 0) goto L_0x00a1
            boolean r41 = r0.mo5408I(r1)
            if (r41 == 0) goto L_0x009d
            r41 = r40
            goto L_0x009f
        L_0x009d:
            r41 = r39
        L_0x009f:
            r12 = r12 | r41
        L_0x00a1:
            r10 = r13 & 896(0x380, float:1.256E-42)
            r41 = 128(0x80, float:1.794E-43)
            r42 = 256(0x100, float:3.59E-43)
            if (r10 != 0) goto L_0x00b9
            r10 = r11 & 4
            if (r10 != 0) goto L_0x00b6
            boolean r10 = r0.mo5408I(r2)
            if (r10 == 0) goto L_0x00b6
            r10 = r42
            goto L_0x00b8
        L_0x00b6:
            r10 = r41
        L_0x00b8:
            r12 = r12 | r10
        L_0x00b9:
            r10 = r11 & 8
            r43 = 2048(0x800, float:2.87E-42)
            r44 = 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x00c6
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            r45 = r1
            goto L_0x00d9
        L_0x00c6:
            r45 = r1
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x00d9
            boolean r1 = r0.mo5408I(r3)
            if (r1 == 0) goto L_0x00d5
            r1 = r43
            goto L_0x00d7
        L_0x00d5:
            r1 = r44
        L_0x00d7:
            r1 = r1 | r12
            goto L_0x00da
        L_0x00d9:
            r1 = r12
        L_0x00da:
            r12 = r11 & 16
            r46 = 8192(0x2000, float:1.14794E-41)
            r47 = 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x00e5
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00f9
        L_0x00e5:
            r48 = 57344(0xe000, float:8.0356E-41)
            r48 = r13 & r48
            if (r48 != 0) goto L_0x00f9
            boolean r48 = r0.mo5408I(r4)
            if (r48 == 0) goto L_0x00f5
            r48 = r47
            goto L_0x00f7
        L_0x00f5:
            r48 = r46
        L_0x00f7:
            r1 = r1 | r48
        L_0x00f9:
            r48 = r11 & 32
            r49 = 131072(0x20000, float:1.83671E-40)
            r50 = 65536(0x10000, float:9.18355E-41)
            if (r48 == 0) goto L_0x0104
            r51 = 196608(0x30000, float:2.75506E-40)
            goto L_0x0115
        L_0x0104:
            r51 = 458752(0x70000, float:6.42848E-40)
            r51 = r13 & r51
            if (r51 != 0) goto L_0x0117
            boolean r51 = r0.mo5408I(r5)
            if (r51 == 0) goto L_0x0113
            r51 = r49
            goto L_0x0115
        L_0x0113:
            r51 = r50
        L_0x0115:
            r1 = r1 | r51
        L_0x0117:
            r51 = r11 & 64
            r52 = 1048576(0x100000, float:1.469368E-39)
            r53 = 524288(0x80000, float:7.34684E-40)
            r54 = 1572864(0x180000, float:2.204052E-39)
            if (r51 == 0) goto L_0x0124
            r1 = r1 | r54
            goto L_0x0137
        L_0x0124:
            r55 = 3670016(0x380000, float:5.142788E-39)
            r55 = r13 & r55
            if (r55 != 0) goto L_0x0137
            boolean r55 = r0.mo5432d(r6)
            if (r55 == 0) goto L_0x0133
            r55 = r52
            goto L_0x0135
        L_0x0133:
            r55 = r53
        L_0x0135:
            r1 = r1 | r55
        L_0x0137:
            r55 = r2
            r2 = r11 & 128(0x80, float:1.794E-43)
            r56 = 4194304(0x400000, float:5.877472E-39)
            if (r2 == 0) goto L_0x0142
            r57 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x0153
        L_0x0142:
            r57 = 29360128(0x1c00000, float:7.052966E-38)
            r57 = r13 & r57
            if (r57 != 0) goto L_0x0155
            boolean r57 = r0.mo5427a(r7)
            if (r57 == 0) goto L_0x0151
            r57 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0153
        L_0x0151:
            r57 = r56
        L_0x0153:
            r1 = r1 | r57
        L_0x0155:
            r57 = 234881024(0xe000000, float:1.5777218E-30)
            r57 = r13 & r57
            if (r57 != 0) goto L_0x016e
            r57 = r3
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x016a
            boolean r3 = r0.mo5408I(r8)
            if (r3 == 0) goto L_0x016a
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x016c
        L_0x016a:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x016c:
            r1 = r1 | r3
            goto L_0x0170
        L_0x016e:
            r57 = r3
        L_0x0170:
            r3 = r11 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0177
            r58 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0188
        L_0x0177:
            r58 = 1879048192(0x70000000, float:1.58456325E29)
            r58 = r13 & r58
            if (r58 != 0) goto L_0x018a
            boolean r58 = r0.mo5428b(r9)
            if (r58 == 0) goto L_0x0186
            r58 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0188
        L_0x0186:
            r58 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0188:
            r1 = r1 | r58
        L_0x018a:
            r58 = r14 & 14
            if (r58 != 0) goto L_0x01a8
            r58 = r4
            r4 = r11 & 1024(0x400, float:1.435E-42)
            r59 = r5
            if (r4 != 0) goto L_0x01a1
            r4 = r33
            boolean r33 = r0.mo5434e(r4)
            if (r33 == 0) goto L_0x01a3
            r33 = 4
            goto L_0x01a5
        L_0x01a1:
            r4 = r33
        L_0x01a3:
            r33 = r36
        L_0x01a5:
            r33 = r33 | r14
            goto L_0x01b0
        L_0x01a8:
            r58 = r4
            r59 = r5
            r4 = r33
            r33 = r14
        L_0x01b0:
            r34 = r14 & 112(0x70, float:1.57E-43)
            if (r34 != 0) goto L_0x01ce
            r60 = r4
            r4 = r11 & 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x01c5
            r4 = r20
            boolean r20 = r0.mo5434e(r4)
            if (r20 == 0) goto L_0x01c7
            r20 = r40
            goto L_0x01c9
        L_0x01c5:
            r4 = r20
        L_0x01c7:
            r20 = r39
        L_0x01c9:
            r33 = r33 | r20
            r20 = r4
            goto L_0x01d0
        L_0x01ce:
            r60 = r4
        L_0x01d0:
            r4 = r33
            r5 = r11 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x01db
            r4 = r4 | 384(0x180, float:5.38E-43)
            r33 = r6
            goto L_0x01f1
        L_0x01db:
            r33 = r6
            r6 = r14 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x01f1
            r6 = r16
            boolean r16 = r0.mo5428b(r6)
            if (r16 == 0) goto L_0x01ec
            r16 = r42
            goto L_0x01ee
        L_0x01ec:
            r16 = r41
        L_0x01ee:
            r4 = r4 | r16
            goto L_0x01f3
        L_0x01f1:
            r6 = r16
        L_0x01f3:
            r16 = r6
            r6 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x01fe
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r34 = r7
            goto L_0x0212
        L_0x01fe:
            r34 = r7
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0212
            r7 = r17
            boolean r17 = r0.mo5408I(r7)
            if (r17 == 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r43 = r44
        L_0x020f:
            r4 = r4 | r43
            goto L_0x0214
        L_0x0212:
            r7 = r17
        L_0x0214:
            r17 = r7
            r7 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x021d
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0233
        L_0x021d:
            r43 = 57344(0xe000, float:8.0356E-41)
            r43 = r14 & r43
            if (r43 != 0) goto L_0x0233
            r43 = r8
            r8 = r18
            boolean r18 = r0.mo5427a(r8)
            if (r18 == 0) goto L_0x0230
            r46 = r47
        L_0x0230:
            r4 = r4 | r46
            goto L_0x0237
        L_0x0233:
            r43 = r8
            r8 = r18
        L_0x0237:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r14 & r18
            r44 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x025a
            r18 = r11 & r44
            if (r18 != 0) goto L_0x0251
            r18 = r8
            r8 = r19
            boolean r19 = r0.mo5408I(r8)
            if (r19 == 0) goto L_0x0255
            r19 = r49
            goto L_0x0257
        L_0x0251:
            r18 = r8
            r8 = r19
        L_0x0255:
            r19 = r50
        L_0x0257:
            r4 = r4 | r19
            goto L_0x025e
        L_0x025a:
            r18 = r8
            r8 = r19
        L_0x025e:
            r19 = r11 & r50
            if (r19 == 0) goto L_0x0265
            r4 = r4 | r54
            goto L_0x027d
        L_0x0265:
            r46 = 3670016(0x380000, float:5.142788E-39)
            r46 = r14 & r46
            if (r46 != 0) goto L_0x027d
            r46 = r8
            r8 = r32
            boolean r32 = r0.mo5428b(r8)
            if (r32 == 0) goto L_0x0278
            r32 = r52
            goto L_0x027a
        L_0x0278:
            r32 = r53
        L_0x027a:
            r4 = r4 | r32
            goto L_0x0281
        L_0x027d:
            r46 = r8
            r8 = r32
        L_0x0281:
            r32 = 29360128(0x1c00000, float:7.052966E-38)
            r32 = r14 & r32
            if (r32 != 0) goto L_0x02a3
            r32 = r11 & r49
            r47 = r8
            if (r32 != 0) goto L_0x029a
            r32 = r9
            r8 = r22
            boolean r22 = r0.mo5434e(r8)
            if (r22 == 0) goto L_0x029e
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x02a0
        L_0x029a:
            r32 = r9
            r8 = r22
        L_0x029e:
            r22 = r56
        L_0x02a0:
            r4 = r4 | r22
            goto L_0x02a9
        L_0x02a3:
            r47 = r8
            r32 = r9
            r8 = r22
        L_0x02a9:
            r22 = 234881024(0xe000000, float:1.5777218E-30)
            r22 = r14 & r22
            r23 = 262144(0x40000, float:3.67342E-40)
            if (r22 != 0) goto L_0x02c7
            r22 = r11 & r23
            r62 = r8
            r8 = r24
            if (r22 != 0) goto L_0x02c2
            boolean r22 = r0.mo5434e(r8)
            if (r22 == 0) goto L_0x02c2
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x02c4
        L_0x02c2:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x02c4:
            r4 = r4 | r22
            goto L_0x02cb
        L_0x02c7:
            r62 = r8
            r8 = r24
        L_0x02cb:
            r22 = 1879048192(0x70000000, float:1.58456325E29)
            r22 = r14 & r22
            if (r22 != 0) goto L_0x02e7
            r22 = r11 & r53
            r24 = r8
            r8 = r26
            if (r22 != 0) goto L_0x02e2
            boolean r22 = r0.mo5434e(r8)
            if (r22 == 0) goto L_0x02e2
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x02e4
        L_0x02e2:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x02e4:
            r4 = r4 | r22
            goto L_0x02eb
        L_0x02e7:
            r24 = r8
            r8 = r26
        L_0x02eb:
            r22 = r37 & 14
            if (r22 != 0) goto L_0x0302
            r22 = r11 & r52
            r26 = r8
            r8 = r28
            if (r22 != 0) goto L_0x02ff
            boolean r22 = r0.mo5434e(r8)
            if (r22 == 0) goto L_0x02ff
            r36 = 4
        L_0x02ff:
            r22 = r36 | r37
            goto L_0x0308
        L_0x0302:
            r26 = r8
            r8 = r28
            r22 = r37
        L_0x0308:
            r28 = r37 & 112(0x70, float:1.57E-43)
            r29 = 2097152(0x200000, float:2.938736E-39)
            if (r28 != 0) goto L_0x0323
            r28 = r11 & r29
            r64 = r8
            r8 = r30
            if (r28 != 0) goto L_0x031e
            boolean r28 = r0.mo5434e(r8)
            if (r28 == 0) goto L_0x031e
            r39 = r40
        L_0x031e:
            r22 = r22 | r39
            r30 = r8
            goto L_0x0325
        L_0x0323:
            r64 = r8
        L_0x0325:
            r8 = r22
            r9 = r11 & r56
            if (r9 == 0) goto L_0x0334
            r8 = r8 | 384(0x180, float:5.38E-43)
            r22 = r14
            r14 = r35
            r9 = r37
            goto L_0x034b
        L_0x0334:
            r22 = r14
            r9 = r37
            r14 = r9 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x0349
            r14 = r35
            boolean r28 = r0.mo5408I(r14)
            if (r28 == 0) goto L_0x0346
            r41 = r42
        L_0x0346:
            r8 = r8 | r41
            goto L_0x034b
        L_0x0349:
            r14 = r35
        L_0x034b:
            r28 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r37 = r9
            r9 = r1 & r28
            r28 = r15
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r15) goto L_0x03a0
            r9 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r9 & r4
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r15) goto L_0x03a0
            r9 = r8 & 731(0x2db, float:1.024E-42)
            r15 = 146(0x92, float:2.05E-43)
            if (r9 != r15) goto L_0x03a0
            boolean r9 = r0.mo5442i()
            if (r9 != 0) goto L_0x036f
            goto L_0x03a0
        L_0x036f:
            r0.mo5396C()
            r80 = r11
            r82 = r13
            r81 = r14
            r14 = r20
            r83 = r22
            r23 = r24
            r25 = r26
            r29 = r30
            r11 = r32
            r8 = r33
            r9 = r34
            r35 = r37
            r10 = r43
            r3 = r45
            r19 = r46
            r20 = r47
            r4 = r55
            r5 = r57
            r6 = r58
            r7 = r59
            r12 = r60
            r21 = r62
            goto L_0x0714
        L_0x03a0:
            r0.mo5466u0()
            r9 = r13 & 1
            r35 = 0
            r36 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r9 == 0) goto L_0x0428
            boolean r9 = r0.mo5425Y()
            if (r9 == 0) goto L_0x03b4
            goto L_0x0428
        L_0x03b4:
            r0.mo5396C()
            r2 = r11 & 4
            if (r2 == 0) goto L_0x03bd
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x03bd:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03c3
            r1 = r1 & r36
        L_0x03c3:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x03c9
            r4 = r4 & -15
        L_0x03c9:
            r2 = r11 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x03cf
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x03cf:
            r2 = r11 & r44
            if (r2 == 0) goto L_0x03d7
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r2
        L_0x03d7:
            r2 = r11 & r49
            if (r2 == 0) goto L_0x03df
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r2
        L_0x03df:
            r2 = r11 & r23
            if (r2 == 0) goto L_0x03e5
            r4 = r4 & r36
        L_0x03e5:
            r2 = r11 & r53
            if (r2 == 0) goto L_0x03ed
            r2 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r2
        L_0x03ed:
            r2 = r11 & r52
            if (r2 == 0) goto L_0x03f3
            r8 = r8 & -15
        L_0x03f3:
            r2 = r11 & r29
            if (r2 == 0) goto L_0x03f9
            r8 = r8 & -113(0xffffffffffffff8f, float:NaN)
        L_0x03f9:
            r68 = r4
            r40 = r13
            r41 = r14
            r14 = r16
            r75 = r17
            r76 = r18
            r48 = r20
            r52 = r24
            r69 = r26
            r73 = r30
            r29 = r43
            r23 = r45
            r77 = r46
            r78 = r47
            r15 = r55
            r24 = r57
            r25 = r58
            r26 = r59
            r30 = r60
            r50 = r62
            r71 = r64
            r27 = r8
            r8 = r1
            goto L_0x05f0
        L_0x0428:
            if (r38 == 0) goto L_0x042e
            androidx.compose.ui.d$a r9 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r45 = r9
        L_0x042e:
            r9 = r11 & 4
            if (r9 == 0) goto L_0x04cc
            r9 = -1353009744(0xffffffffaf5ab5b0, float:-1.9891533E-10)
            r0.mo5465u(r9)
            androidx.compose.material.DrawerValue r9 = androidx.compose.material.DrawerValue.Closed
            androidx.compose.material.k0 r9 = androidx.compose.material.DrawerKt.m2181d(r9, r0)
            androidx.compose.material.BottomSheetValue r15 = androidx.compose.material.BottomSheetValue.Collapsed
            r40 = r13
            java.lang.String r13 = "initialValue"
            kotlin.jvm.internal.C19383o.m32797g(r15, r13)
            r13 = 1808153344(0x6bc63b00, float:4.7929186E26)
            r0.mo5465u(r13)
            androidx.compose.animation.core.h0<java.lang.Float> r13 = androidx.compose.material.C1258u1.f2630a
            r41 = r14
            androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1 r14 = androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1.INSTANCE
            r50 = r7
            r42 = r8
            r8 = 1
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r38 = 0
            r7[r38] = r13
            java.lang.String r8 = "confirmStateChange"
            kotlin.jvm.internal.C19383o.m32797g(r14, r8)
            androidx.compose.material.BottomSheetState$Companion$Saver$1 r8 = androidx.compose.material.BottomSheetState$Companion$Saver$1.INSTANCE
            r56 = r6
            androidx.compose.material.BottomSheetState$Companion$Saver$2 r6 = new androidx.compose.material.BottomSheetState$Companion$Saver$2
            r6.<init>(r13, r14)
            androidx.compose.runtime.saveable.h r6 = androidx.compose.runtime.saveable.SaverKt.m2861a(r8, r6)
            androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2 r8 = new androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2
            r8.<init>(r15, r13, r14)
            r13 = 4
            java.lang.Object r6 = androidx.compose.runtime.saveable.C1366b.m2863a(r7, r6, r8, r0, r13)
            androidx.compose.material.m r6 = (androidx.compose.material.C1211m) r6
            r7 = 0
            r0.mo5418R(r7)
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r7)
            java.lang.Object r7 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r8 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r7 != r8) goto L_0x0496
            androidx.compose.material.t1 r7 = new androidx.compose.material.t1
            r7.<init>()
            r0.mo5407H0(r7)
        L_0x0496:
            r13 = 0
            r0.mo5418R(r13)
            androidx.compose.material.t1 r7 = (androidx.compose.material.C1254t1) r7
            r13 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.mo5465u(r13)
            boolean r13 = r0.mo5408I(r9)
            boolean r14 = r0.mo5408I(r6)
            r13 = r13 | r14
            boolean r14 = r0.mo5408I(r7)
            r13 = r13 | r14
            java.lang.Object r14 = r0.mo5431c0()
            if (r13 != 0) goto L_0x04b8
            if (r14 != r8) goto L_0x04c0
        L_0x04b8:
            androidx.compose.material.l r14 = new androidx.compose.material.l
            r14.<init>(r9, r6, r7)
            r0.mo5407H0(r14)
        L_0x04c0:
            r6 = 0
            r0.mo5418R(r6)
            androidx.compose.material.l r14 = (androidx.compose.material.C1208l) r14
            r0.mo5418R(r6)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x04d8
        L_0x04cc:
            r56 = r6
            r50 = r7
            r42 = r8
            r40 = r13
            r41 = r14
            r14 = r55
        L_0x04d8:
            if (r10 == 0) goto L_0x04dc
            r57 = r35
        L_0x04dc:
            if (r12 == 0) goto L_0x04e1
            androidx.compose.runtime.internal.ComposableLambdaImpl r6 = androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.f2190a
            goto L_0x04e3
        L_0x04e1:
            r6 = r58
        L_0x04e3:
            if (r48 == 0) goto L_0x04e7
            r59 = r35
        L_0x04e7:
            if (r51 == 0) goto L_0x04eb
            r33 = 1
        L_0x04eb:
            if (r2 == 0) goto L_0x04ef
            r7 = 1
            goto L_0x04f1
        L_0x04ef:
            r7 = r34
        L_0x04f1:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0503
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.material.q1 r2 = (androidx.compose.material.C1225q1) r2
            p.a r2 = r2.f2549c
            r1 = r1 & r36
            r8 = r2
            goto L_0x0505
        L_0x0503:
            r8 = r43
        L_0x0505:
            if (r3 == 0) goto L_0x050b
            float r2 = androidx.compose.material.C1202j.f2503a
            r9 = r2
            goto L_0x050d
        L_0x050b:
            r9 = r32
        L_0x050d:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0520
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r2 = r2.mo5363j()
            r4 = r4 & -15
            goto L_0x0522
        L_0x0520:
            r2 = r60
        L_0x0522:
            r10 = r11 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x052d
            long r12 = androidx.compose.material.ColorsKt.m2174b(r2, r0)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x052f
        L_0x052d:
            r12 = r20
        L_0x052f:
            if (r5 == 0) goto L_0x0535
            float r5 = androidx.compose.material.C1202j.f2504b
            r16 = r5
        L_0x0535:
            if (r56 == 0) goto L_0x0539
            r17 = r35
        L_0x0539:
            if (r50 == 0) goto L_0x053d
            r18 = 1
        L_0x053d:
            r5 = r11 & r44
            if (r5 == 0) goto L_0x0551
            androidx.compose.runtime.l1 r5 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r5 = r0.mo5410J(r5)
            androidx.compose.material.q1 r5 = (androidx.compose.material.C1225q1) r5
            p.a r5 = r5.f2549c
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r10
            r46 = r5
        L_0x0551:
            if (r19 == 0) goto L_0x0557
            float r5 = androidx.compose.material.C1203j0.f2505a
            r47 = r5
        L_0x0557:
            r5 = r11 & r49
            if (r5 == 0) goto L_0x0574
            androidx.compose.runtime.l1 r5 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r5 = r0.mo5410J(r5)
            androidx.compose.material.v r5 = (androidx.compose.material.C1259v) r5
            long r19 = r5.mo5363j()
            r5 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r5
            r90 = r1
            r87 = r2
            r1 = r19
            r19 = r87
            goto L_0x057a
        L_0x0574:
            r90 = r1
            r19 = r2
            r1 = r62
        L_0x057a:
            r3 = r11 & r23
            if (r3 == 0) goto L_0x0585
            long r23 = androidx.compose.material.ColorsKt.m2174b(r1, r0)
            r4 = r4 & r36
            goto L_0x0587
        L_0x0585:
            r23 = r24
        L_0x0587:
            r3 = r11 & r53
            if (r3 == 0) goto L_0x0595
            long r25 = androidx.compose.material.C1203j0.m2333a(r0)
            r3 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r4
            r4 = r3
            goto L_0x0597
        L_0x0595:
            r25 = r26
        L_0x0597:
            r3 = r11 & r52
            if (r3 == 0) goto L_0x05b0
            androidx.compose.runtime.l1 r3 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r3 = r0.mo5410J(r3)
            androidx.compose.material.v r3 = (androidx.compose.material.C1259v) r3
            long r43 = r3.mo5354a()
            r3 = r42 & -15
            r87 = r1
            r1 = r43
            r42 = r87
            goto L_0x05b6
        L_0x05b0:
            r3 = r42
            r42 = r1
            r1 = r64
        L_0x05b6:
            r5 = r11 & r29
            if (r5 == 0) goto L_0x05c1
            long r29 = androidx.compose.material.ColorsKt.m2174b(r1, r0)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x05c3
        L_0x05c1:
            r29 = r30
        L_0x05c3:
            r71 = r1
            r27 = r3
            r68 = r4
            r34 = r7
            r32 = r9
            r48 = r12
            r15 = r14
            r14 = r16
            r75 = r17
            r76 = r18
            r52 = r23
            r69 = r25
            r73 = r29
            r50 = r42
            r23 = r45
            r77 = r46
            r78 = r47
            r24 = r57
            r26 = r59
            r25 = r6
            r29 = r8
            r30 = r19
            r8 = r90
        L_0x05f0:
            r0.mo5419S()
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r0.mo5465u(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r1)
            java.lang.Object r1 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r2) goto L_0x0616
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r1 = androidx.compose.runtime.C1415u.m3034h(r1, r0)
            androidx.compose.runtime.m r3 = new androidx.compose.runtime.m
            r3.<init>(r1)
            r0.mo5407H0(r3)
            r1 = r3
        L_0x0616:
            r3 = 0
            r0.mo5418R(r3)
            androidx.compose.runtime.m r1 = (androidx.compose.runtime.C1346m) r1
            kotlinx.coroutines.d0 r1 = r1.f2939b
            r0.mo5418R(r3)
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r3 = r0.mo5410J(r3)
            m0.b r3 = (p174m0.C7282b) r3
            float r12 = r3.mo3789B0(r14)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r3)
            java.lang.Object r3 = r0.mo5431c0()
            if (r3 != r2) goto L_0x0640
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = androidx.compose.foundation.layout.C0761x.m1751w0(r35, androidx.compose.runtime.C1351n1.f2948a)
            r0.mo5407H0(r3)
        L_0x0640:
            r2 = 0
            r0.mo5418R(r2)
            r16 = r3
            androidx.compose.runtime.j0 r16 = (androidx.compose.runtime.C1338j0) r16
            java.lang.Object r2 = r16.getValue()
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x065a
            float r2 = r2.floatValue()
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x065a
            r2 = 1
            goto L_0x065b
        L_0x065a:
            r2 = 0
        L_0x065b:
            if (r2 != 0) goto L_0x066a
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1 r3 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$semantics$1
            r3.<init>(r15, r1)
            r1 = 0
            androidx.compose.ui.d r1 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r2, r1, r3)
            goto L_0x066c
        L_0x066a:
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x066c:
            r13 = r1
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1 r10 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1
            r1 = r10
            r2 = r15
            r3 = r24
            r4 = r41
            r5 = r26
            r6 = r14
            r7 = r33
            r17 = r37
            r9 = r27
            r79 = r10
            r35 = r17
            r10 = r68
            r80 = r11
            r11 = r12
            r81 = r41
            r12 = r34
            r82 = r40
            r84 = r14
            r83 = r22
            r14 = r16
            r85 = r15
            r15 = r29
            r16 = r30
            r18 = r48
            r20 = r32
            r21 = r28
            r22 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22)
            r1 = 893101063(0x353ba407, float:6.990162E-7)
            r2 = r79
            androidx.compose.runtime.internal.ComposableLambdaImpl r57 = p628nj.C18263b.m30805A(r0, r1, r2)
            androidx.compose.ui.d r36 = androidx.compose.foundation.layout.SizeKt.m1486f(r23)
            r37 = 0
            r1 = 1273816607(0x4bece61f, float:3.1050814E7)
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1 r2 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
            r55 = r2
            r56 = r75
            r58 = r85
            r59 = r76
            r60 = r77
            r61 = r78
            r62 = r50
            r64 = r52
            r66 = r69
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r64, r66, r68)
            androidx.compose.runtime.internal.ComposableLambdaImpl r44 = p628nj.C18263b.m30805A(r0, r1, r2)
            int r1 = r27 << 6
            r2 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r54
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r46 = r2 | r1
            r47 = 50
            r42 = 0
            r43 = 0
            r38 = r71
            r40 = r73
            r45 = r0
            androidx.compose.material.SurfaceKt.m2234a(r36, r37, r38, r40, r42, r43, r44, r45, r46, r47)
            r3 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r10 = r29
            r12 = r30
            r11 = r32
            r8 = r33
            r9 = r34
            r14 = r48
            r21 = r50
            r23 = r52
            r25 = r69
            r64 = r71
            r29 = r73
            r17 = r75
            r18 = r76
            r19 = r77
            r20 = r78
            r16 = r84
            r4 = r85
        L_0x0714:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x071b
            goto L_0x0735
        L_0x071b:
            androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2 r2 = new androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
            r1 = r2
            r86 = r2
            r2 = r28
            r27 = r64
            r31 = r81
            r32 = r82
            r33 = r83
            r34 = r35
            r35 = r80
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r23, r25, r27, r29, r31, r32, r33, r34, r35)
            r1 = r86
            r0.f3081d = r1
        L_0x0735:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
