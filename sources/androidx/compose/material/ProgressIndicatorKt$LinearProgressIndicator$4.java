package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ProgressIndicatorKt$LinearProgressIndicator$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$4(C1436d dVar, long j, long j2, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$color = j;
        this.$backgroundColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1} */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        if (r7 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x0129;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            androidx.compose.ui.d r1 = r0.$modifier
            long r2 = r0.$color
            long r4 = r0.$backgroundColor
            int r6 = r0.$$changed
            r7 = 1
            r14 = r6 | 1
            int r15 = r0.$$default
            float r6 = androidx.compose.material.C1193i1.f2473a
            r6 = -819397058(0xffffffffcf28fe3e, float:-2.8352343E9)
            r8 = r26
            androidx.compose.runtime.ComposerImpl r6 = r8.mo5440h(r6)
            r8 = r15 & 1
            r9 = 4
            r10 = 2
            if (r8 == 0) goto L_0x0023
            r11 = r14 | 6
            goto L_0x0033
        L_0x0023:
            r11 = r14 & 14
            if (r11 != 0) goto L_0x0032
            boolean r11 = r6.mo5408I(r1)
            if (r11 == 0) goto L_0x002f
            r11 = r9
            goto L_0x0030
        L_0x002f:
            r11 = r10
        L_0x0030:
            r11 = r11 | r14
            goto L_0x0033
        L_0x0032:
            r11 = r14
        L_0x0033:
            r12 = r14 & 112(0x70, float:1.57E-43)
            if (r12 != 0) goto L_0x0047
            r12 = r15 & 2
            if (r12 != 0) goto L_0x0044
            boolean r12 = r6.mo5434e(r2)
            if (r12 == 0) goto L_0x0044
            r12 = 32
            goto L_0x0046
        L_0x0044:
            r12 = 16
        L_0x0046:
            r11 = r11 | r12
        L_0x0047:
            r12 = r14 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x005b
            r12 = r15 & 4
            if (r12 != 0) goto L_0x0058
            boolean r12 = r6.mo5434e(r4)
            if (r12 == 0) goto L_0x0058
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r11 = r11 | r12
        L_0x005b:
            r11 = r11 & 731(0x2db, float:1.024E-42)
            r12 = 146(0x92, float:2.05E-43)
            if (r11 != r12) goto L_0x0070
            boolean r11 = r6.mo5442i()
            if (r11 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r6.mo5396C()
        L_0x006b:
            r9 = r1
            r10 = r2
            r12 = r4
            goto L_0x0141
        L_0x0070:
            r6.mo5466u0()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x0082
            boolean r11 = r6.mo5425Y()
            if (r11 == 0) goto L_0x007e
            goto L_0x0082
        L_0x007e:
            r6.mo5396C()
            goto L_0x00a1
        L_0x0082:
            if (r8 == 0) goto L_0x0086
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x0086:
            r8 = r15 & 2
            if (r8 == 0) goto L_0x0096
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r6.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r2 = r2.mo5359f()
        L_0x0096:
            r8 = r15 & 4
            if (r8 == 0) goto L_0x00a1
            r4 = 1047904911(0x3e75c28f, float:0.24)
            long r4 = androidx.compose.p015ui.graphics.C1545s.m3356b(r2, r4)
        L_0x00a1:
            r6.mo5419S()
            androidx.compose.animation.core.InfiniteTransition r8 = androidx.compose.animation.core.C0412a0.m1110c(r6)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2 r11 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.INSTANCE
            androidx.compose.animation.core.b0 r11 = androidx.compose.foundation.layout.C0761x.m1743s0(r11)
            androidx.compose.animation.core.z r11 = androidx.compose.foundation.layout.C0761x.m1727i0(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.animation.core.InfiniteTransition$a r21 = androidx.compose.animation.core.C0412a0.m1108a(r8, r12, r11, r6)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2 r11 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.INSTANCE
            androidx.compose.animation.core.b0 r11 = androidx.compose.foundation.layout.C0761x.m1743s0(r11)
            androidx.compose.animation.core.z r11 = androidx.compose.foundation.layout.C0761x.m1727i0(r11)
            androidx.compose.animation.core.InfiniteTransition$a r22 = androidx.compose.animation.core.C0412a0.m1108a(r8, r12, r11, r6)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2 r11 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.INSTANCE
            androidx.compose.animation.core.b0 r11 = androidx.compose.foundation.layout.C0761x.m1743s0(r11)
            androidx.compose.animation.core.z r11 = androidx.compose.foundation.layout.C0761x.m1727i0(r11)
            androidx.compose.animation.core.InfiniteTransition$a r23 = androidx.compose.animation.core.C0412a0.m1108a(r8, r12, r11, r6)
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2 r11 = androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.INSTANCE
            androidx.compose.animation.core.b0 r11 = androidx.compose.foundation.layout.C0761x.m1743s0(r11)
            androidx.compose.animation.core.z r11 = androidx.compose.foundation.layout.C0761x.m1727i0(r11)
            androidx.compose.animation.core.InfiniteTransition$a r24 = androidx.compose.animation.core.C0412a0.m1108a(r8, r12, r11, r6)
            androidx.compose.ui.d r8 = androidx.compose.foundation.ProgressSemanticsKt.m1313a(r1)
            float r11 = androidx.compose.material.C1193i1.f2474b
            float r12 = androidx.compose.material.C1193i1.f2473a
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.SizeKt.m1493m(r8, r11, r12)
            r11 = 6
            java.lang.Object[] r12 = new java.lang.Object[r11]
            androidx.compose.ui.graphics.s r13 = new androidx.compose.ui.graphics.s
            r13.<init>(r4)
            r11 = 0
            r12[r11] = r13
            r12[r7] = r21
            r12[r10] = r22
            r7 = 3
            androidx.compose.ui.graphics.s r10 = new androidx.compose.ui.graphics.s
            r10.<init>(r2)
            r12[r7] = r10
            r12[r9] = r23
            r7 = 5
            r12[r7] = r24
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r6.mo5465u(r7)
            r7 = r11
            r9 = r7
            r10 = 6
        L_0x0113:
            if (r7 >= r10) goto L_0x011f
            r13 = r12[r7]
            boolean r13 = r6.mo5408I(r13)
            r9 = r9 | r13
            int r7 = r7 + 1
            goto L_0x0113
        L_0x011f:
            java.lang.Object r7 = r6.mo5431c0()
            if (r9 != 0) goto L_0x0129
            androidx.compose.runtime.d$a$a r9 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r7 != r9) goto L_0x0137
        L_0x0129:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1 r7 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
            r16 = r7
            r17 = r4
            r19 = r2
            r16.<init>(r17, r19, r21, r22, r23, r24)
            r6.mo5407H0(r7)
        L_0x0137:
            r6.mo5418R(r11)
            kq.l r7 = (p753kq.C19857l) r7
            androidx.compose.foundation.CanvasKt.m1294a(r8, r7, r6, r11)
            goto L_0x006b
        L_0x0141:
            androidx.compose.runtime.v0 r1 = r6.mo5421U()
            if (r1 != 0) goto L_0x0148
            goto L_0x0150
        L_0x0148:
            androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4 r2 = new androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            r8 = r2
            r8.<init>(r9, r10, r12, r14, r15)
            r1.f3081d = r2
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4.invoke(androidx.compose.runtime.d, int):void");
    }
}
