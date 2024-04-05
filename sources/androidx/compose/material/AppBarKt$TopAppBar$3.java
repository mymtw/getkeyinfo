package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class AppBarKt$TopAppBar$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$3(C1436d dVar, long j, long j2, float f, C0759v vVar, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$elevation = f;
        this.$contentPadding = vVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            androidx.compose.ui.d r1 = r0.$modifier
            long r2 = r0.$backgroundColor
            long r4 = r0.$contentColor
            float r6 = r0.$elevation
            androidx.compose.foundation.layout.v r7 = r0.$contentPadding
            kq.q<androidx.compose.foundation.layout.z, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$content
            int r8 = r0.$$changed
            r13 = r8 | 1
            int r14 = r0.$$default
            float r8 = androidx.compose.material.AppBarKt.f2169a
            java.lang.String r8 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r8)
            r8 = 1897058582(0x7112d116, float:7.270013E29)
            r9 = r24
            androidx.compose.runtime.ComposerImpl r11 = r9.mo5440h(r8)
            r8 = r14 & 1
            if (r8 == 0) goto L_0x002b
            r9 = r13 | 6
            goto L_0x003b
        L_0x002b:
            r9 = r13 & 14
            if (r9 != 0) goto L_0x003a
            boolean r9 = r11.mo5408I(r1)
            if (r9 == 0) goto L_0x0037
            r9 = 4
            goto L_0x0038
        L_0x0037:
            r9 = 2
        L_0x0038:
            r9 = r9 | r13
            goto L_0x003b
        L_0x003a:
            r9 = r13
        L_0x003b:
            r10 = r13 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x004f
            r10 = r14 & 2
            if (r10 != 0) goto L_0x004c
            boolean r10 = r11.mo5434e(r2)
            if (r10 == 0) goto L_0x004c
            r10 = 32
            goto L_0x004e
        L_0x004c:
            r10 = 16
        L_0x004e:
            r9 = r9 | r10
        L_0x004f:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0063
            r10 = r14 & 4
            if (r10 != 0) goto L_0x0060
            boolean r10 = r11.mo5434e(r4)
            if (r10 == 0) goto L_0x0060
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r9 = r9 | r10
        L_0x0063:
            r10 = r14 & 8
            if (r10 == 0) goto L_0x006a
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r12 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x007a
            boolean r12 = r11.mo5428b(r6)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r9 = r9 | r12
        L_0x007a:
            r12 = r14 & 16
            if (r12 == 0) goto L_0x0081
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0081:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x0095
            boolean r16 = r11.mo5408I(r7)
            if (r16 == 0) goto L_0x0091
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r9 = r9 | r16
        L_0x0095:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x009e
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00ad
        L_0x009e:
            r16 = r13 & r17
            if (r16 != 0) goto L_0x00af
            boolean r16 = r11.mo5408I(r15)
            if (r16 == 0) goto L_0x00ab
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r9 = r9 | r16
        L_0x00af:
            r16 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r9 & r16
            r16 = r1
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r1) goto L_0x00d4
            boolean r0 = r11.mo5442i()
            if (r0 != 0) goto L_0x00c2
            goto L_0x00d4
        L_0x00c2:
            r11.mo5396C()
            r0 = r11
            r20 = r13
            r21 = r14
            r22 = r15
            r9 = r16
            r10 = r2
            r12 = r4
            r14 = r6
            r15 = r7
            goto L_0x015a
        L_0x00d4:
            r11.mo5466u0()
            r0 = r13 & 1
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r11.mo5425Y()
            if (r0 == 0) goto L_0x00e2
            goto L_0x00f4
        L_0x00e2:
            r11.mo5396C()
            r0 = r14 & 2
            if (r0 == 0) goto L_0x00eb
            r9 = r9 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00eb:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x00f1
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f1:
            r1 = r16
            goto L_0x0121
        L_0x00f4:
            if (r8 == 0) goto L_0x00f9
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x00fb
        L_0x00f9:
            r1 = r16
        L_0x00fb:
            r0 = r14 & 2
            if (r0 == 0) goto L_0x010d
            androidx.compose.runtime.l1 r0 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r0 = r11.mo5410J(r0)
            androidx.compose.material.v r0 = (androidx.compose.material.C1259v) r0
            long r2 = androidx.compose.material.ColorsKt.m2175c(r0)
            r9 = r9 & -113(0xffffffffffffff8f, float:NaN)
        L_0x010d:
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0118
            long r4 = androidx.compose.material.ColorsKt.m2174b(r2, r11)
            r0 = r9 & -897(0xfffffffffffffc7f, float:NaN)
            r9 = r0
        L_0x0118:
            if (r10 == 0) goto L_0x011c
            float r6 = androidx.compose.material.C1163a.f2372a
        L_0x011c:
            if (r12 == 0) goto L_0x0121
            androidx.compose.foundation.layout.w r0 = androidx.compose.material.C1163a.f2374c
            r7 = r0
        L_0x0121:
            r11.mo5419S()
            androidx.compose.ui.graphics.e0$a r18 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            int r0 = r9 >> 3
            r8 = r0 & 14
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r10 = r0 & 112(0x70, float:1.57E-43)
            r8 = r8 | r10
            r10 = r0 & 896(0x380, float:1.256E-42)
            r8 = r8 | r10
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r8
            int r8 = r9 << 15
            r8 = r8 & r17
            r0 = r0 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            int r9 = r9 << 3
            r8 = r8 & r9
            r9 = r8 | r0
            r10 = 0
            r8 = r6
            r0 = r11
            r11 = r2
            r20 = r13
            r21 = r14
            r13 = r4
            r22 = r15
            r15 = r7
            r16 = r0
            r17 = r1
            r19 = r22
            androidx.compose.material.AppBarKt.m2165a(r8, r9, r10, r11, r13, r15, r16, r17, r18, r19)
            r9 = r1
            r10 = r2
            r12 = r4
            r14 = r6
        L_0x015a:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x0161
            goto L_0x016f
        L_0x0161:
            androidx.compose.material.AppBarKt$TopAppBar$3 r1 = new androidx.compose.material.AppBarKt$TopAppBar$3
            r8 = r1
            r16 = r22
            r17 = r20
            r18 = r21
            r8.<init>(r9, r10, r12, r14, r15, r16, r17, r18)
            r0.f3081d = r1
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt$TopAppBar$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
