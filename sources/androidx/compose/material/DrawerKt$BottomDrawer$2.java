package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class DrawerKt$BottomDrawer$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ C1530k0 $drawerShape;
    public final /* synthetic */ C1185g $drawerState;
    public final /* synthetic */ boolean $gesturesEnabled;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ long $scrimColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2(C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, C1436d dVar, C1185g gVar, boolean z, C1530k0 k0Var, float f, long j, long j2, long j3, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$drawerContent = qVar;
        this.$modifier = dVar;
        this.$drawerState = gVar;
        this.$gesturesEnabled = z;
        this.$drawerShape = k0Var;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$scrimColor = j3;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r41, int r42) {
        /*
            r40 = this;
            r0 = r40
            kq.q<androidx.compose.foundation.layout.i, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$drawerContent
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.material.g r2 = r0.$drawerState
            boolean r3 = r0.$gesturesEnabled
            androidx.compose.ui.graphics.k0 r4 = r0.$drawerShape
            float r5 = r0.$drawerElevation
            long r6 = r0.$drawerBackgroundColor
            long r8 = r0.$drawerContentColor
            long r10 = r0.$scrimColor
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$content
            int r12 = r0.$$changed
            r13 = 1
            r12 = r12 | r13
            int r13 = r0.$$default
            float r16 = androidx.compose.material.DrawerKt.f2203a
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 625649286(0x254aa686, float:1.7577127E-16)
            r16 = r14
            r14 = r41
            androidx.compose.runtime.ComposerImpl r0 = r14.mo5440h(r0)
            r14 = r13 & 1
            r17 = r10
            if (r14 == 0) goto L_0x003c
            r11 = r12 | 6
            goto L_0x004c
        L_0x003c:
            r11 = r12 & 14
            if (r11 != 0) goto L_0x004b
            boolean r11 = r0.mo5408I(r15)
            if (r11 == 0) goto L_0x0048
            r11 = 4
            goto L_0x0049
        L_0x0048:
            r11 = 2
        L_0x0049:
            r11 = r11 | r12
            goto L_0x004c
        L_0x004b:
            r11 = r12
        L_0x004c:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0053
            r11 = r11 | 48
            goto L_0x0064
        L_0x0053:
            r19 = r12 & 112(0x70, float:1.57E-43)
            if (r19 != 0) goto L_0x0064
            boolean r19 = r0.mo5408I(r1)
            if (r19 == 0) goto L_0x0060
            r19 = 32
            goto L_0x0062
        L_0x0060:
            r19 = 16
        L_0x0062:
            r11 = r11 | r19
        L_0x0064:
            r10 = r12 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0078
            r10 = r13 & 4
            if (r10 != 0) goto L_0x0075
            boolean r10 = r0.mo5408I(r2)
            if (r10 == 0) goto L_0x0075
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0077
        L_0x0075:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0077:
            r11 = r11 | r10
        L_0x0078:
            r10 = r13 & 8
            if (r10 == 0) goto L_0x0081
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            r19 = r1
            goto L_0x0093
        L_0x0081:
            r19 = r1
            r1 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0093
            boolean r1 = r0.mo5427a(r3)
            if (r1 == 0) goto L_0x0090
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0092
        L_0x0090:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0092:
            r11 = r11 | r1
        L_0x0093:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r12
            if (r1 != 0) goto L_0x00a9
            r1 = r13 & 16
            if (r1 != 0) goto L_0x00a6
            boolean r1 = r0.mo5408I(r4)
            if (r1 == 0) goto L_0x00a6
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r11 = r11 | r1
        L_0x00a9:
            r1 = r13 & 32
            if (r1 == 0) goto L_0x00b0
            r20 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00c1
        L_0x00b0:
            r20 = 458752(0x70000, float:6.42848E-40)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x00c3
            boolean r20 = r0.mo5428b(r5)
            if (r20 == 0) goto L_0x00bf
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r11 = r11 | r20
        L_0x00c3:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x00da
            r20 = r13 & 64
            if (r20 != 0) goto L_0x00d6
            boolean r20 = r0.mo5434e(r6)
            if (r20 == 0) goto L_0x00d6
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r11 = r11 | r20
        L_0x00da:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r12 & r20
            if (r20 != 0) goto L_0x00f3
            r20 = r2
            r2 = r13 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00ef
            boolean r2 = r0.mo5434e(r8)
            if (r2 == 0) goto L_0x00ef
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r11 = r11 | r2
            goto L_0x00f5
        L_0x00f3:
            r20 = r2
        L_0x00f5:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x0112
            r2 = r13 & 256(0x100, float:3.59E-43)
            r21 = r3
            if (r2 != 0) goto L_0x010b
            r2 = r17
            boolean r17 = r0.mo5434e(r2)
            if (r17 == 0) goto L_0x010d
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010b:
            r2 = r17
        L_0x010d:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r11 = r11 | r17
            goto L_0x0116
        L_0x0112:
            r21 = r3
            r2 = r17
        L_0x0116:
            r17 = r2
            r2 = r13 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0121
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r16
            goto L_0x0133
        L_0x0121:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r12
            r3 = r16
            if (r2 != 0) goto L_0x0134
            boolean r2 = r0.mo5408I(r3)
            if (r2 == 0) goto L_0x0131
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0133
        L_0x0131:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0133:
            r11 = r11 | r2
        L_0x0134:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r11
            r16 = r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x015d
            boolean r2 = r0.mo5442i()
            if (r2 != 0) goto L_0x0146
            goto L_0x015d
        L_0x0146:
            r0.mo5396C()
            r10 = r8
            r35 = r12
            r37 = r13
            r38 = r15
            r12 = r17
            r3 = r19
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r20
            r5 = r21
            goto L_0x02cc
        L_0x015d:
            r0.mo5466u0()
            r2 = r12 & 1
            r22 = -3670017(0xffffffffffc7ffff, float:NaN)
            r23 = -57345(0xffffffffffff1fff, float:NaN)
            r24 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r2 == 0) goto L_0x01aa
            boolean r2 = r0.mo5425Y()
            if (r2 == 0) goto L_0x0174
            goto L_0x01aa
        L_0x0174:
            r0.mo5396C()
            r1 = r13 & 4
            if (r1 == 0) goto L_0x017d
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x017d:
            r1 = r13 & 16
            if (r1 == 0) goto L_0x0183
            r11 = r11 & r23
        L_0x0183:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x0189
            r11 = r11 & r22
        L_0x0189:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0191
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r11 = r11 & r1
        L_0x0191:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0197
            r11 = r11 & r24
        L_0x0197:
            r27 = r4
            r28 = r5
            r29 = r6
            r31 = r8
            r5 = r11
            r33 = r17
            r26 = r19
            r24 = r20
            r25 = r21
            goto L_0x0253
        L_0x01aa:
            if (r14 == 0) goto L_0x01af
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x01b1
        L_0x01af:
            r2 = r19
        L_0x01b1:
            r14 = r13 & 4
            if (r14 == 0) goto L_0x01f0
            androidx.compose.material.BottomDrawerValue r14 = androidx.compose.material.BottomDrawerValue.Closed
            java.lang.String r3 = "initialValue"
            kotlin.jvm.internal.C19383o.m32797g(r14, r3)
            r3 = -598115156(0xffffffffdc597cac, float:-2.44868592E17)
            r0.mo5465u(r3)
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$1 r3 = androidx.compose.material.DrawerKt$rememberBottomDrawerState$1.INSTANCE
            r26 = r2
            r27 = r4
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r2 = "confirmStateChange"
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            androidx.compose.material.BottomDrawerState$Companion$Saver$1 r2 = androidx.compose.material.BottomDrawerState$Companion$Saver$1.INSTANCE
            r28 = r5
            androidx.compose.material.BottomDrawerState$Companion$Saver$2 r5 = new androidx.compose.material.BottomDrawerState$Companion$Saver$2
            r5.<init>(r3)
            androidx.compose.runtime.saveable.h r2 = androidx.compose.runtime.saveable.SaverKt.m2861a(r2, r5)
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$2 r5 = new androidx.compose.material.DrawerKt$rememberBottomDrawerState$2
            r5.<init>(r14, r3)
            r3 = 4
            java.lang.Object r2 = androidx.compose.runtime.saveable.C1366b.m2863a(r4, r2, r5, r0, r3)
            androidx.compose.material.g r2 = (androidx.compose.material.C1185g) r2
            r3 = 0
            r0.mo5418R(r3)
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01f8
        L_0x01f0:
            r26 = r2
            r27 = r4
            r28 = r5
            r2 = r20
        L_0x01f8:
            if (r10 == 0) goto L_0x01fc
            r3 = 1
            goto L_0x01fe
        L_0x01fc:
            r3 = r21
        L_0x01fe:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x020f
            androidx.compose.runtime.l1 r4 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r4 = r0.mo5410J(r4)
            androidx.compose.material.q1 r4 = (androidx.compose.material.C1225q1) r4
            p.a r4 = r4.f2549c
            r11 = r11 & r23
            goto L_0x0211
        L_0x020f:
            r4 = r27
        L_0x0211:
            if (r1 == 0) goto L_0x0217
            float r1 = androidx.compose.material.C1203j0.f2505a
            r5 = r1
            goto L_0x0219
        L_0x0217:
            r5 = r28
        L_0x0219:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x022b
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.material.v r1 = (androidx.compose.material.C1259v) r1
            long r6 = r1.mo5363j()
            r11 = r11 & r22
        L_0x022b:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0237
            long r8 = androidx.compose.material.ColorsKt.m2174b(r6, r0)
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r11 = r11 & r1
        L_0x0237:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0241
            long r17 = androidx.compose.material.C1203j0.m2333a(r0)
            r11 = r11 & r24
        L_0x0241:
            r1 = r11
            r10 = r17
            r24 = r2
            r25 = r3
            r27 = r4
            r28 = r5
            r29 = r6
            r31 = r8
            r33 = r10
            r5 = r1
        L_0x0253:
            r0.mo5419S()
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r0.mo5465u(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r1)
            java.lang.Object r1 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r2) goto L_0x0279
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r1 = androidx.compose.runtime.C1415u.m3034h(r1, r0)
            androidx.compose.runtime.m r2 = new androidx.compose.runtime.m
            r2.<init>(r1)
            r0.mo5407H0(r2)
            r1 = r2
        L_0x0279:
            r2 = 0
            r0.mo5418R(r2)
            androidx.compose.runtime.m r1 = (androidx.compose.runtime.C1346m) r1
            kotlinx.coroutines.d0 r14 = r1.f2939b
            r0.mo5418R(r2)
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.SizeKt.m1486f(r26)
            r18 = 0
            r19 = 0
            androidx.compose.material.DrawerKt$BottomDrawer$1 r11 = new androidx.compose.material.DrawerKt$BottomDrawer$1
            r1 = r11
            r2 = r25
            r3 = r24
            r4 = r16
            r6 = r33
            r8 = r27
            r9 = r29
            r36 = r11
            r35 = r12
            r11 = r31
            r37 = r13
            r13 = r28
            r38 = r15
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r11, r13, r14, r15)
            r1 = 1220102512(0x48b94970, float:379467.5)
            r2 = r36
            androidx.compose.runtime.internal.ComposableLambdaImpl r20 = p628nj.C18263b.m30805A(r0, r1, r2)
            r22 = 3072(0xc00, float:4.305E-42)
            r23 = 6
            r21 = r0
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m1460a(r17, r18, r19, r20, r21, r22, r23)
            r4 = r24
            r5 = r25
            r3 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r10 = r31
            r12 = r33
        L_0x02cc:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x02d3
            goto L_0x02e7
        L_0x02d3:
            androidx.compose.material.DrawerKt$BottomDrawer$2 r15 = new androidx.compose.material.DrawerKt$BottomDrawer$2
            r1 = r15
            r2 = r38
            r14 = r16
            r39 = r15
            r15 = r35
            r16 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16)
            r1 = r39
            r0.f3081d = r1
        L_0x02e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$BottomDrawer$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
