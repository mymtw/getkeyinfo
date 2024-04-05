package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class TabRowKt$ScrollableTabRow$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $divider;
    public final /* synthetic */ float $edgePadding;
    public final /* synthetic */ C19862q<List<C1271y1>, C1302d, Integer, C19394m> $indicator;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ int $selectedTabIndex;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$3(int i, C1436d dVar, long j, long j2, float f, C19862q<? super List<C1271y1>, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i2, int i3) {
        super(2);
        this.$selectedTabIndex = i;
        this.$modifier = dVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$edgePadding = f;
        this.$indicator = qVar;
        this.$divider = pVar;
        this.$tabs = pVar2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r33, int r34) {
        /*
            r32 = this;
            r0 = r32
            int r8 = r0.$selectedTabIndex
            androidx.compose.ui.d r1 = r0.$modifier
            long r2 = r0.$backgroundColor
            long r4 = r0.$contentColor
            float r6 = r0.$edgePadding
            kq.q<java.util.List<androidx.compose.material.y1>, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r0.$indicator
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r9 = r0.$divider
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r11 = r0.$tabs
            int r10 = r0.$$changed
            r12 = r10 | 1
            int r13 = r0.$$default
            float r10 = androidx.compose.material.TabRowKt.f2322a
            java.lang.String r10 = "tabs"
            kotlin.jvm.internal.C19383o.m32797g(r11, r10)
            r10 = -1473476840(0xffffffffa82c8718, float:-9.577212E-15)
            r14 = r33
            androidx.compose.runtime.ComposerImpl r10 = r14.mo5440h(r10)
            r14 = r13 & 1
            if (r14 == 0) goto L_0x002f
            r14 = r12 | 6
            goto L_0x003f
        L_0x002f:
            r14 = r12 & 14
            if (r14 != 0) goto L_0x003e
            boolean r14 = r10.mo5432d(r8)
            if (r14 == 0) goto L_0x003b
            r14 = 4
            goto L_0x003c
        L_0x003b:
            r14 = 2
        L_0x003c:
            r14 = r14 | r12
            goto L_0x003f
        L_0x003e:
            r14 = r12
        L_0x003f:
            r15 = r13 & 2
            if (r15 == 0) goto L_0x0046
            r14 = r14 | 48
            goto L_0x0057
        L_0x0046:
            r16 = r12 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x0057
            boolean r16 = r10.mo5408I(r1)
            if (r16 == 0) goto L_0x0053
            r16 = 32
            goto L_0x0055
        L_0x0053:
            r16 = 16
        L_0x0055:
            r14 = r14 | r16
        L_0x0057:
            r0 = r12 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x006b
            r0 = r13 & 4
            if (r0 != 0) goto L_0x0068
            boolean r0 = r10.mo5434e(r2)
            if (r0 == 0) goto L_0x0068
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r0 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r14 = r14 | r0
        L_0x006b:
            r0 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x007f
            r0 = r13 & 8
            if (r0 != 0) goto L_0x007c
            boolean r0 = r10.mo5434e(r4)
            if (r0 == 0) goto L_0x007c
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r14 = r14 | r0
        L_0x007f:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0086
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009a
        L_0x0086:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r12 & r16
            if (r16 != 0) goto L_0x009a
            boolean r16 = r10.mo5428b(r6)
            if (r16 == 0) goto L_0x0096
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r14 = r14 | r16
        L_0x009a:
            r16 = r13 & 32
            if (r16 == 0) goto L_0x00a1
            r17 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b2
        L_0x00a1:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r12 & r17
            if (r17 != 0) goto L_0x00b4
            boolean r17 = r10.mo5408I(r7)
            if (r17 == 0) goto L_0x00b0
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r14 = r14 | r17
        L_0x00b4:
            r17 = r13 & 64
            r18 = 1572864(0x180000, float:2.204052E-39)
            if (r17 == 0) goto L_0x00bd
            r14 = r14 | r18
            goto L_0x00d0
        L_0x00bd:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r12 & r19
            if (r19 != 0) goto L_0x00d0
            boolean r19 = r10.mo5408I(r9)
            if (r19 == 0) goto L_0x00cc
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r14 = r14 | r19
        L_0x00d0:
            r19 = r1
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00d9
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00e9
        L_0x00d9:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r12
            if (r1 != 0) goto L_0x00ea
            boolean r1 = r10.mo5408I(r11)
            if (r1 == 0) goto L_0x00e7
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r14 = r14 | r1
        L_0x00ea:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r14
            r20 = r2
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r2) goto L_0x010a
            boolean r1 = r10.mo5442i()
            if (r1 != 0) goto L_0x00fc
            goto L_0x010a
        L_0x00fc:
            r10.mo5396C()
            r0 = r6
            r31 = r9
            r3 = r19
            r9 = r7
            r6 = r4
            r4 = r20
            goto L_0x01bb
        L_0x010a:
            r10.mo5466u0()
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0133
            boolean r1 = r10.mo5425Y()
            if (r1 == 0) goto L_0x0118
            goto L_0x0133
        L_0x0118:
            r10.mo5396C()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0121
            r14 = r14 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0121:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0127
            r14 = r14 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0127:
            r28 = r4
            r30 = r7
            r31 = r9
            r0 = r19
            r26 = r20
        L_0x0131:
            r9 = r6
            goto L_0x0179
        L_0x0133:
            if (r15 == 0) goto L_0x0138
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x013a
        L_0x0138:
            r1 = r19
        L_0x013a:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x014d
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r10.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r2 = androidx.compose.material.ColorsKt.m2175c(r2)
            r14 = r14 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x014f
        L_0x014d:
            r2 = r20
        L_0x014f:
            r15 = r13 & 8
            if (r15 == 0) goto L_0x0159
            long r4 = androidx.compose.material.ColorsKt.m2174b(r2, r10)
            r14 = r14 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0159:
            if (r0 == 0) goto L_0x015d
            float r6 = androidx.compose.material.C1274z1.f2680d
        L_0x015d:
            if (r16 == 0) goto L_0x016b
            r0 = -655609869(0xffffffffd8ec2ff3, float:-2.07752548E15)
            androidx.compose.material.TabRowKt$ScrollableTabRow$1 r7 = new androidx.compose.material.TabRowKt$ScrollableTabRow$1
            r7.<init>(r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r7 = p628nj.C18263b.m30805A(r10, r0, r7)
        L_0x016b:
            if (r17 == 0) goto L_0x016f
            androidx.compose.runtime.internal.ComposableLambdaImpl r9 = androidx.compose.material.ComposableSingletons$TabRowKt.f2197b
        L_0x016f:
            r0 = r1
            r26 = r2
            r28 = r4
            r30 = r7
            r31 = r9
            goto L_0x0131
        L_0x0179:
            r10.mo5419S()
            r20 = 0
            r21 = 0
            r15 = 1455860572(0x56c6ab5c, float:1.09219643E14)
            androidx.compose.material.TabRowKt$ScrollableTabRow$2 r7 = new androidx.compose.material.TabRowKt$ScrollableTabRow$2
            r1 = r7
            r2 = r9
            r3 = r11
            r4 = r31
            r5 = r8
            r6 = r30
            r33 = r9
            r9 = r7
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r22 = p628nj.C18263b.m30805A(r10, r15, r9)
            int r1 = r14 >> 3
            r1 = r1 & 14
            r1 = r1 | r18
            r2 = r14 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            r24 = r1 | r2
            r25 = 50
            r15 = 0
            r14 = r0
            r16 = r26
            r18 = r28
            r23 = r10
            androidx.compose.material.SurfaceKt.m2234a(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25)
            r3 = r0
            r4 = r26
            r6 = r28
            r9 = r30
            r0 = r33
        L_0x01bb:
            androidx.compose.runtime.v0 r14 = r10.mo5421U()
            if (r14 != 0) goto L_0x01c2
            goto L_0x01ce
        L_0x01c2:
            androidx.compose.material.TabRowKt$ScrollableTabRow$3 r15 = new androidx.compose.material.TabRowKt$ScrollableTabRow$3
            r1 = r15
            r2 = r8
            r8 = r0
            r10 = r31
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            r14.f3081d = r15
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt$ScrollableTabRow$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
