package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class NavigationRailKt$NavigationRail$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $header;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$2(C1436d dVar, long j, long j2, float f, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar2, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$elevation = f;
        this.$header = qVar;
        this.$content = qVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            androidx.compose.ui.d r1 = r0.$modifier
            long r2 = r0.$backgroundColor
            long r4 = r0.$contentColor
            float r6 = r0.$elevation
            kq.q<androidx.compose.foundation.layout.i, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r0.$header
            kq.q<androidx.compose.foundation.layout.i, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$content
            int r8 = r0.$$changed
            r14 = r8 | 1
            int r12 = r0.$$default
            androidx.compose.animation.core.j0<java.lang.Float> r8 = androidx.compose.material.NavigationRailKt.f2227a
            java.lang.String r8 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r8)
            r8 = 1790971523(0x6ac00e83, float:1.1609114E26)
            r9 = r29
            androidx.compose.runtime.ComposerImpl r8 = r9.mo5440h(r8)
            r9 = r12 & 1
            if (r9 == 0) goto L_0x002b
            r10 = r14 | 6
            goto L_0x003b
        L_0x002b:
            r10 = r14 & 14
            if (r10 != 0) goto L_0x003a
            boolean r10 = r8.mo5408I(r1)
            if (r10 == 0) goto L_0x0037
            r10 = 4
            goto L_0x0038
        L_0x0037:
            r10 = 2
        L_0x0038:
            r10 = r10 | r14
            goto L_0x003b
        L_0x003a:
            r10 = r14
        L_0x003b:
            r11 = r14 & 112(0x70, float:1.57E-43)
            if (r11 != 0) goto L_0x004f
            r11 = r12 & 2
            if (r11 != 0) goto L_0x004c
            boolean r11 = r8.mo5434e(r2)
            if (r11 == 0) goto L_0x004c
            r11 = 32
            goto L_0x004e
        L_0x004c:
            r11 = 16
        L_0x004e:
            r10 = r10 | r11
        L_0x004f:
            r11 = r14 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0063
            r11 = r12 & 4
            if (r11 != 0) goto L_0x0060
            boolean r11 = r8.mo5434e(r4)
            if (r11 == 0) goto L_0x0060
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r10 = r10 | r11
        L_0x0063:
            r11 = r12 & 8
            if (r11 == 0) goto L_0x006a
            r10 = r10 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r13 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x007a
            boolean r13 = r8.mo5428b(r6)
            if (r13 == 0) goto L_0x0077
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r10 = r10 | r13
        L_0x007a:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x0081
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0081:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x0095
            boolean r16 = r8.mo5408I(r7)
            if (r16 == 0) goto L_0x0091
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r10 = r10 | r16
        L_0x0095:
            r16 = r12 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x009e
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00ad
        L_0x009e:
            r16 = r14 & r17
            if (r16 != 0) goto L_0x00af
            boolean r16 = r8.mo5408I(r15)
            if (r16 == 0) goto L_0x00ab
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r10 = r10 | r16
        L_0x00af:
            r16 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r10 & r16
            r16 = r1
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r1) goto L_0x00ca
            boolean r0 = r8.mo5442i()
            if (r0 != 0) goto L_0x00c2
            goto L_0x00ca
        L_0x00c2:
            r8.mo5396C()
            r10 = r2
            r9 = r16
            goto L_0x014e
        L_0x00ca:
            r8.mo5466u0()
            r0 = r14 & 1
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r8.mo5425Y()
            if (r0 == 0) goto L_0x00d8
            goto L_0x00ea
        L_0x00d8:
            r8.mo5396C()
            r0 = r12 & 2
            if (r0 == 0) goto L_0x00e1
            r10 = r10 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e1:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x00e7
            r10 = r10 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e7:
            r1 = r16
            goto L_0x0116
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x00f1
        L_0x00ef:
            r1 = r16
        L_0x00f1:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0103
            androidx.compose.runtime.l1 r0 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r0 = r8.mo5410J(r0)
            androidx.compose.material.v r0 = (androidx.compose.material.C1259v) r0
            long r2 = r0.mo5363j()
            r10 = r10 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0103:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x010e
            long r4 = androidx.compose.material.ColorsKt.m2174b(r2, r8)
            r0 = r10 & -897(0xfffffffffffffc7f, float:NaN)
            r10 = r0
        L_0x010e:
            if (r11 == 0) goto L_0x0112
            float r6 = androidx.compose.material.C1181e1.f2431a
        L_0x0112:
            if (r13 == 0) goto L_0x0116
            r0 = 0
            r7 = r0
        L_0x0116:
            r8.mo5419S()
            r0 = 0
            r22 = 0
            r9 = -1571506489(0xffffffffa254b6c7, float:-2.882812E-18)
            androidx.compose.material.NavigationRailKt$NavigationRail$1 r11 = new androidx.compose.material.NavigationRailKt$NavigationRail$1
            r11.<init>(r7, r10, r15)
            androidx.compose.runtime.internal.ComposableLambdaImpl r24 = p628nj.C18263b.m30805A(r8, r9, r11)
            r9 = 1572864(0x180000, float:2.204052E-39)
            r11 = r10 & 14
            r9 = r9 | r11
            int r11 = r10 << 3
            r13 = r11 & 896(0x380, float:1.256E-42)
            r9 = r9 | r13
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r11
            int r10 = r10 << 6
            r10 = r10 & r17
            r26 = r9 | r10
            r27 = 18
            r16 = r1
            r17 = r0
            r18 = r2
            r20 = r4
            r23 = r6
            r25 = r8
            androidx.compose.material.SurfaceKt.m2234a(r16, r17, r18, r20, r22, r23, r24, r25, r26, r27)
            r9 = r1
            r10 = r2
        L_0x014e:
            androidx.compose.runtime.v0 r0 = r8.mo5421U()
            if (r0 != 0) goto L_0x0155
            goto L_0x0169
        L_0x0155:
            androidx.compose.material.NavigationRailKt$NavigationRail$2 r1 = new androidx.compose.material.NavigationRailKt$NavigationRail$2
            r8 = r1
            r2 = r12
            r12 = r4
            r3 = r14
            r14 = r6
            r4 = r15
            r15 = r7
            r16 = r4
            r17 = r3
            r18 = r2
            r8.<init>(r9, r10, r12, r14, r15, r16, r17, r18)
            r0.f3081d = r1
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt$NavigationRail$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
