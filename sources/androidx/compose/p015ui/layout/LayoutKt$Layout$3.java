package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.layout.LayoutKt$Layout$3 */
final class LayoutKt$Layout$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> $maxIntrinsicHeightMeasureBlock;
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> $maxIntrinsicWidthMeasureBlock;
    public final /* synthetic */ C19862q<C1713x, List<? extends C1710u>, C7280a, C1712w> $measureBlock;
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> $minIntrinsicHeightMeasureBlock;
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> $minIntrinsicWidthMeasureBlock;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$Layout$3(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar2, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar3, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar4, C1436d dVar, C19862q<? super C1713x, ? super List<? extends C1710u>, ? super C7280a, ? extends C1712w> qVar5, int i, int i2) {
        super(2);
        this.$content = pVar;
        this.$minIntrinsicWidthMeasureBlock = qVar;
        this.$minIntrinsicHeightMeasureBlock = qVar2;
        this.$maxIntrinsicWidthMeasureBlock = qVar3;
        this.$maxIntrinsicHeightMeasureBlock = qVar4;
        this.$modifier = dVar;
        this.$measureBlock = qVar5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r0.$content
            kq.q<androidx.compose.ui.layout.h, java.util.List<? extends androidx.compose.ui.layout.g>, java.lang.Integer, java.lang.Integer> r8 = r0.$minIntrinsicWidthMeasureBlock
            kq.q<androidx.compose.ui.layout.h, java.util.List<? extends androidx.compose.ui.layout.g>, java.lang.Integer, java.lang.Integer> r9 = r0.$minIntrinsicHeightMeasureBlock
            kq.q<androidx.compose.ui.layout.h, java.util.List<? extends androidx.compose.ui.layout.g>, java.lang.Integer, java.lang.Integer> r10 = r0.$maxIntrinsicWidthMeasureBlock
            kq.q<androidx.compose.ui.layout.h, java.util.List<? extends androidx.compose.ui.layout.g>, java.lang.Integer, java.lang.Integer> r11 = r0.$maxIntrinsicHeightMeasureBlock
            androidx.compose.ui.d r1 = r0.$modifier
            kq.q<androidx.compose.ui.layout.x, java.util.List<? extends androidx.compose.ui.layout.u>, m0.a, androidx.compose.ui.layout.w> r12 = r0.$measureBlock
            int r2 = r0.$$changed
            r13 = r2 | 1
            int r14 = r0.$$default
            java.lang.String r2 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r7, r2)
            java.lang.String r2 = "minIntrinsicWidthMeasureBlock"
            kotlin.jvm.internal.C19383o.m32797g(r8, r2)
            java.lang.String r2 = "minIntrinsicHeightMeasureBlock"
            kotlin.jvm.internal.C19383o.m32797g(r9, r2)
            java.lang.String r2 = "maxIntrinsicWidthMeasureBlock"
            kotlin.jvm.internal.C19383o.m32797g(r10, r2)
            java.lang.String r2 = "maxIntrinsicHeightMeasureBlock"
            kotlin.jvm.internal.C19383o.m32797g(r11, r2)
            java.lang.String r2 = "measureBlock"
            kotlin.jvm.internal.C19383o.m32797g(r12, r2)
            r2 = 1164819031(0x456dba57, float:3803.6462)
            r3 = r19
            androidx.compose.runtime.ComposerImpl r15 = r3.mo5440h(r2)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0044
            r2 = r13 | 6
            goto L_0x0054
        L_0x0044:
            r2 = r13 & 14
            if (r2 != 0) goto L_0x0053
            boolean r2 = r15.mo5408I(r7)
            if (r2 == 0) goto L_0x0050
            r2 = 4
            goto L_0x0051
        L_0x0050:
            r2 = 2
        L_0x0051:
            r2 = r2 | r13
            goto L_0x0054
        L_0x0053:
            r2 = r13
        L_0x0054:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x005b
            r2 = r2 | 48
            goto L_0x006b
        L_0x005b:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x006b
            boolean r3 = r15.mo5408I(r8)
            if (r3 == 0) goto L_0x0068
            r3 = 32
            goto L_0x006a
        L_0x0068:
            r3 = 16
        L_0x006a:
            r2 = r2 | r3
        L_0x006b:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0072
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0082
        L_0x0072:
            r3 = r13 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0082
            boolean r3 = r15.mo5408I(r9)
            if (r3 == 0) goto L_0x007f
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0081
        L_0x007f:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0081:
            r2 = r2 | r3
        L_0x0082:
            r3 = r14 & 8
            if (r3 == 0) goto L_0x0089
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0099
        L_0x0089:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0099
            boolean r3 = r15.mo5408I(r10)
            if (r3 == 0) goto L_0x0096
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0098
        L_0x0096:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0098:
            r2 = r2 | r3
        L_0x0099:
            r3 = r14 & 16
            if (r3 == 0) goto L_0x00a0
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b2
        L_0x00a0:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x00b2
            boolean r3 = r15.mo5408I(r11)
            if (r3 == 0) goto L_0x00af
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b1
        L_0x00af:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00b1:
            r2 = r2 | r3
        L_0x00b2:
            r3 = r14 & 32
            if (r3 == 0) goto L_0x00b9
            r4 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00c9
        L_0x00b9:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00ca
            boolean r4 = r15.mo5408I(r1)
            if (r4 == 0) goto L_0x00c7
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r2 = r2 | r4
        L_0x00ca:
            r4 = r14 & 64
            if (r4 == 0) goto L_0x00d1
            r4 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00e1
        L_0x00d1:
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x00e2
            boolean r4 = r15.mo5408I(r12)
            if (r4 == 0) goto L_0x00df
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e1
        L_0x00df:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00e1:
            r2 = r2 | r4
        L_0x00e2:
            r16 = r2
            r2 = 2995931(0x2db6db, float:4.198194E-39)
            r2 = r16 & r2
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r4) goto L_0x00fe
            boolean r2 = r15.mo5442i()
            if (r2 != 0) goto L_0x00f5
            goto L_0x00fe
        L_0x00f5:
            r15.mo5396C()
            r17 = r1
            r16 = r14
            goto L_0x0191
        L_0x00fe:
            if (r3 == 0) goto L_0x0102
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x0102:
            r17 = r1
            androidx.compose.ui.layout.n r6 = new androidx.compose.ui.layout.n
            r1 = r6
            r2 = r12
            r3 = r8
            r4 = r9
            r5 = r10
            r0 = r6
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = r16 & 14
            int r2 = r16 >> 12
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r2)
            androidx.compose.runtime.l1 r2 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r2 = r15.mo5410J(r2)
            m0.b r2 = (p174m0.C7282b) r2
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r3 = r15.mo5410J(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p015ui.unit.LayoutDirection) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r4 = r15.mo5410J(r4)
            androidx.compose.ui.platform.j1 r4 = (androidx.compose.p015ui.platform.C1843j1) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r5.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r6 = androidx.compose.p015ui.layout.C1700o.m3617a(r17)
            int r1 = r1 << 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | 6
            r16 = r14
            androidx.compose.runtime.c<?> r14 = r15.f2715a
            boolean r14 = r14 instanceof androidx.compose.runtime.C1299c
            if (r14 == 0) goto L_0x01ac
            r15.mo5392A()
            boolean r14 = r15.f2702K
            if (r14 == 0) goto L_0x0159
            r15.mo5450m(r5)
            goto L_0x015c
        L_0x0159:
            r15.mo5452n()
        L_0x015c:
            r14 = 0
            r15.f2738x = r14
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r15, r0, r5)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r0 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r15, r2, r0)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r0 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r15, r3, r0)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r0 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r0 = p504ai.C13983i.m21490i(r15, r4, r0, r15)
            int r2 = r1 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.invoke(r0, r15, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo5465u(r0)
            int r0 = r1 >> 9
            r1 = r0 & 14
            r5 = 1
            r2 = r7
            r3 = r15
            r4 = r14
            r6 = r14
            androidx.compose.animation.C0472h.m1247j(r1, r2, r3, r4, r5, r6)
        L_0x0191:
            androidx.compose.runtime.v0 r0 = r15.mo5421U()
            if (r0 != 0) goto L_0x0198
            goto L_0x01ab
        L_0x0198:
            androidx.compose.ui.layout.LayoutKt$Layout$3 r14 = new androidx.compose.ui.layout.LayoutKt$Layout$3
            r1 = r14
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r17
            r8 = r12
            r9 = r13
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f3081d = r14
        L_0x01ab:
            return
        L_0x01ac:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.layout.LayoutKt$Layout$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
