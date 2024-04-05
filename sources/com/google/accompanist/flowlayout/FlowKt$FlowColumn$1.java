package com.google.accompanist.flowlayout;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class FlowKt$FlowColumn$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ FlowCrossAxisAlignment $crossAxisAlignment;
    public final /* synthetic */ float $crossAxisSpacing;
    public final /* synthetic */ MainAxisAlignment $lastLineMainAxisAlignment;
    public final /* synthetic */ MainAxisAlignment $mainAxisAlignment;
    public final /* synthetic */ SizeMode $mainAxisSize;
    public final /* synthetic */ float $mainAxisSpacing;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt$FlowColumn$1(C1436d dVar, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f, FlowCrossAxisAlignment flowCrossAxisAlignment, float f2, MainAxisAlignment mainAxisAlignment2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$mainAxisSize = sizeMode;
        this.$mainAxisAlignment = mainAxisAlignment;
        this.$mainAxisSpacing = f;
        this.$crossAxisAlignment = flowCrossAxisAlignment;
        this.$crossAxisSpacing = f2;
        this.$lastLineMainAxisAlignment = mainAxisAlignment2;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            androidx.compose.ui.d r1 = r0.$modifier
            com.google.accompanist.flowlayout.SizeMode r2 = r0.$mainAxisSize
            com.google.accompanist.flowlayout.MainAxisAlignment r3 = r0.$mainAxisAlignment
            float r4 = r0.$mainAxisSpacing
            com.google.accompanist.flowlayout.FlowCrossAxisAlignment r5 = r0.$crossAxisAlignment
            float r6 = r0.$crossAxisSpacing
            com.google.accompanist.flowlayout.MainAxisAlignment r7 = r0.$lastLineMainAxisAlignment
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$content
            int r8 = r0.$$changed
            r14 = r8 | 1
            int r13 = r0.$$default
            java.lang.String r8 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r8)
            r8 = 203669733(0xc23c0e5, float:1.261511E-31)
            r9 = r24
            androidx.compose.runtime.ComposerImpl r12 = r9.mo5440h(r8)
            r8 = r13 & 1
            if (r8 == 0) goto L_0x002d
            r9 = r14 | 6
            goto L_0x003d
        L_0x002d:
            r9 = r14 & 14
            if (r9 != 0) goto L_0x003c
            boolean r9 = r12.mo5408I(r1)
            if (r9 == 0) goto L_0x0039
            r9 = 4
            goto L_0x003a
        L_0x0039:
            r9 = 2
        L_0x003a:
            r9 = r9 | r14
            goto L_0x003d
        L_0x003c:
            r9 = r14
        L_0x003d:
            r10 = r13 & 2
            if (r10 == 0) goto L_0x0044
            r9 = r9 | 48
            goto L_0x0054
        L_0x0044:
            r11 = r14 & 112(0x70, float:1.57E-43)
            if (r11 != 0) goto L_0x0054
            boolean r11 = r12.mo5408I(r2)
            if (r11 == 0) goto L_0x0051
            r11 = 32
            goto L_0x0053
        L_0x0051:
            r11 = 16
        L_0x0053:
            r9 = r9 | r11
        L_0x0054:
            r11 = r13 & 4
            if (r11 == 0) goto L_0x005b
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005b:
            r0 = r14 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x006c
            boolean r0 = r12.mo5408I(r3)
            if (r0 == 0) goto L_0x0068
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x006a
        L_0x0068:
            r0 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r0 = r0 | r9
            goto L_0x006d
        L_0x006c:
            r0 = r9
        L_0x006d:
            r9 = r13 & 8
            if (r9 == 0) goto L_0x0076
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r16 = r1
            goto L_0x0088
        L_0x0076:
            r16 = r1
            r1 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0088
            boolean r1 = r12.mo5428b(r4)
            if (r1 == 0) goto L_0x0085
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r0 = r0 | r1
        L_0x0088:
            r1 = r13 & 16
            r17 = 57344(0xe000, float:8.0356E-41)
            if (r1 == 0) goto L_0x0092
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x0092:
            r18 = r14 & r17
            if (r18 != 0) goto L_0x00a3
            boolean r18 = r12.mo5408I(r5)
            if (r18 == 0) goto L_0x009f
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r0 = r0 | r18
        L_0x00a3:
            r18 = r13 & 32
            r19 = 458752(0x70000, float:6.42848E-40)
            if (r18 == 0) goto L_0x00ac
            r20 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00bb
        L_0x00ac:
            r20 = r14 & r19
            if (r20 != 0) goto L_0x00bd
            boolean r20 = r12.mo5428b(r6)
            if (r20 == 0) goto L_0x00b9
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r20
        L_0x00bd:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r21 = r14 & r20
            if (r21 != 0) goto L_0x00d4
            r21 = r13 & 64
            if (r21 != 0) goto L_0x00d0
            boolean r21 = r12.mo5408I(r7)
            if (r21 == 0) goto L_0x00d0
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r0 = r0 | r21
        L_0x00d4:
            r21 = r2
            r2 = r13 & 128(0x80, float:1.794E-43)
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            if (r2 == 0) goto L_0x00df
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00ee
        L_0x00df:
            r2 = r14 & r22
            if (r2 != 0) goto L_0x00ef
            boolean r2 = r12.mo5408I(r15)
            if (r2 == 0) goto L_0x00ec
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r0 = r0 | r2
        L_0x00ef:
            r2 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r2 & r0
            r25 = r3
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r3) goto L_0x0117
            boolean r2 = r12.mo5442i()
            if (r2 != 0) goto L_0x0101
            goto L_0x0117
        L_0x0101:
            r12.mo5396C()
            r11 = r25
            r0 = r12
            r19 = r13
            r20 = r14
            r9 = r16
            r10 = r21
            r12 = r4
            r13 = r5
            r14 = r6
            r21 = r15
            r15 = r7
            goto L_0x0199
        L_0x0117:
            r12.mo5466u0()
            r2 = r14 & 1
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r2 == 0) goto L_0x0137
            boolean r2 = r12.mo5425Y()
            if (r2 == 0) goto L_0x0128
            goto L_0x0137
        L_0x0128:
            r12.mo5396C()
            r1 = r13 & 64
            if (r1 == 0) goto L_0x0130
            r0 = r0 & r3
        L_0x0130:
            r3 = r25
            r1 = r16
            r2 = r21
            goto L_0x015f
        L_0x0137:
            if (r8 == 0) goto L_0x013d
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r16 = r2
        L_0x013d:
            if (r10 == 0) goto L_0x0142
            com.google.accompanist.flowlayout.SizeMode r2 = com.google.accompanist.flowlayout.SizeMode.Wrap
            goto L_0x0144
        L_0x0142:
            r2 = r21
        L_0x0144:
            if (r11 == 0) goto L_0x0149
            com.google.accompanist.flowlayout.MainAxisAlignment r8 = com.google.accompanist.flowlayout.MainAxisAlignment.Start
            goto L_0x014b
        L_0x0149:
            r8 = r25
        L_0x014b:
            r10 = 0
            if (r9 == 0) goto L_0x014f
            float r4 = (float) r10
        L_0x014f:
            if (r1 == 0) goto L_0x0153
            com.google.accompanist.flowlayout.FlowCrossAxisAlignment r5 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.Start
        L_0x0153:
            if (r18 == 0) goto L_0x0156
            float r6 = (float) r10
        L_0x0156:
            r1 = r13 & 64
            if (r1 == 0) goto L_0x015c
            r0 = r0 & r3
            r7 = r8
        L_0x015c:
            r3 = r8
            r1 = r16
        L_0x015f:
            r12.mo5419S()
            kq.q<androidx.compose.runtime.c<?>, androidx.compose.runtime.d1, androidx.compose.runtime.y0, kotlin.m> r8 = androidx.compose.runtime.ComposerKt.f2748a
            com.google.accompanist.flowlayout.LayoutOrientation r9 = com.google.accompanist.flowlayout.LayoutOrientation.Vertical
            r8 = r0 & 14
            r8 = r8 | 48
            int r0 = r0 << 3
            r10 = r0 & 896(0x380, float:1.256E-42)
            r8 = r8 | r10
            r10 = r0 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r10
            r10 = r0 & r17
            r8 = r8 | r10
            r10 = r0 & r19
            r8 = r8 | r10
            r10 = r0 & r20
            r8 = r8 | r10
            r10 = r0 & r22
            r8 = r8 | r10
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r10
            r18 = r8 | r0
            r8 = r1
            r10 = r2
            r11 = r3
            r0 = r12
            r12 = r4
            r19 = r13
            r13 = r5
            r20 = r14
            r14 = r6
            r21 = r15
            r15 = r7
            r16 = r21
            r17 = r0
            com.google.accompanist.flowlayout.FlowKt.m20294a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r9 = r1
        L_0x0199:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x01a0
            goto L_0x01ae
        L_0x01a0:
            com.google.accompanist.flowlayout.FlowKt$FlowColumn$1 r1 = new com.google.accompanist.flowlayout.FlowKt$FlowColumn$1
            r8 = r1
            r16 = r21
            r17 = r20
            r18 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.f3081d = r1
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt$FlowColumn$1.invoke(androidx.compose.runtime.d, int):void");
    }
}
