package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class AppBarKt$BottomAppBar$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C0759v $contentPadding;
    public final /* synthetic */ C1530k0 $cutoutShape;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$1(C1436d dVar, long j, long j2, C1530k0 k0Var, float f, C0759v vVar, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$cutoutShape = k0Var;
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

    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            androidx.compose.ui.d r1 = r0.$modifier
            long r2 = r0.$backgroundColor
            long r4 = r0.$contentColor
            androidx.compose.ui.graphics.k0 r6 = r0.$cutoutShape
            float r7 = r0.$elevation
            androidx.compose.foundation.layout.v r8 = r0.$contentPadding
            kq.q<androidx.compose.foundation.layout.z, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$content
            int r9 = r0.$$changed
            r10 = 1
            r15 = r9 | 1
            int r12 = r0.$$default
            float r9 = androidx.compose.material.AppBarKt.f2169a
            java.lang.String r9 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r9)
            r9 = -1651948973(0xffffffff9d894253, float:-3.6332176E-21)
            r11 = r25
            androidx.compose.runtime.ComposerImpl r13 = r11.mo5440h(r9)
            r9 = r12 & 1
            if (r9 == 0) goto L_0x002e
            r11 = r15 | 6
            goto L_0x003e
        L_0x002e:
            r11 = r15 & 14
            if (r11 != 0) goto L_0x003d
            boolean r11 = r13.mo5408I(r1)
            if (r11 == 0) goto L_0x003a
            r11 = 4
            goto L_0x003b
        L_0x003a:
            r11 = 2
        L_0x003b:
            r11 = r11 | r15
            goto L_0x003e
        L_0x003d:
            r11 = r15
        L_0x003e:
            r16 = r15 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x0053
            r16 = r12 & 2
            if (r16 != 0) goto L_0x004f
            boolean r16 = r13.mo5434e(r2)
            if (r16 == 0) goto L_0x004f
            r16 = 32
            goto L_0x0051
        L_0x004f:
            r16 = 16
        L_0x0051:
            r11 = r11 | r16
        L_0x0053:
            r10 = r15 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r12 & 4
            if (r10 != 0) goto L_0x0064
            boolean r10 = r13.mo5434e(r4)
            if (r10 == 0) goto L_0x0064
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r11 = r11 | r10
        L_0x0067:
            r10 = r12 & 8
            if (r10 == 0) goto L_0x006e
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006e:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x007f
            boolean r0 = r13.mo5408I(r6)
            if (r0 == 0) goto L_0x007b
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r0 = r0 | r11
            goto L_0x0080
        L_0x007f:
            r0 = r11
        L_0x0080:
            r11 = r12 & 16
            if (r11 == 0) goto L_0x0087
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0087:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x009b
            boolean r16 = r13.mo5428b(r7)
            if (r16 == 0) goto L_0x0097
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r0 = r0 | r16
        L_0x009b:
            r16 = r12 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00a4
            r18 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b3
        L_0x00a4:
            r18 = r15 & r17
            if (r18 != 0) goto L_0x00b5
            boolean r18 = r13.mo5408I(r8)
            if (r18 == 0) goto L_0x00b1
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r0 = r0 | r18
        L_0x00b5:
            r18 = r12 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00be
            r18 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00cd
        L_0x00be:
            r18 = r15 & r19
            if (r18 != 0) goto L_0x00cf
            boolean r18 = r13.mo5408I(r14)
            if (r18 == 0) goto L_0x00cb
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r0 = r0 | r18
        L_0x00cf:
            r18 = 2995931(0x2db6db, float:4.198194E-39)
            r20 = r1
            r1 = r0 & r18
            r21 = r2
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r2) goto L_0x00fa
            boolean r1 = r13.mo5442i()
            if (r1 != 0) goto L_0x00e4
            goto L_0x00fa
        L_0x00e4:
            r13.mo5396C()
            r16 = r7
            r17 = r8
            r0 = r12
            r23 = r15
            r10 = r20
            r11 = r21
            r15 = r6
            r21 = r13
            r22 = r14
            r13 = r4
            goto L_0x01aa
        L_0x00fa:
            r13.mo5466u0()
            r1 = r15 & 1
            if (r1 == 0) goto L_0x011c
            boolean r1 = r13.mo5425Y()
            if (r1 == 0) goto L_0x0108
            goto L_0x011c
        L_0x0108:
            r13.mo5396C()
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0111
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0111:
            r1 = r12 & 4
            if (r1 == 0) goto L_0x0117
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0117:
            r1 = r20
            r2 = r21
            goto L_0x014d
        L_0x011c:
            if (r9 == 0) goto L_0x0121
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0123
        L_0x0121:
            r1 = r20
        L_0x0123:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0136
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r13.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r2 = androidx.compose.material.ColorsKt.m2175c(r2)
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0138
        L_0x0136:
            r2 = r21
        L_0x0138:
            r9 = r12 & 4
            if (r9 == 0) goto L_0x0142
            long r4 = androidx.compose.material.ColorsKt.m2174b(r2, r13)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0142:
            if (r10 == 0) goto L_0x0145
            r6 = 0
        L_0x0145:
            if (r11 == 0) goto L_0x0149
            float r7 = androidx.compose.material.C1163a.f2373b
        L_0x0149:
            if (r16 == 0) goto L_0x014d
            androidx.compose.foundation.layout.w r8 = androidx.compose.material.C1163a.f2374c
        L_0x014d:
            r13.mo5419S()
            androidx.compose.runtime.l1 r9 = androidx.compose.material.ScaffoldKt.f2250a
            java.lang.Object r9 = r13.mo5410J(r9)
            androidx.compose.material.r0 r9 = (androidx.compose.material.C1227r0) r9
            if (r6 == 0) goto L_0x016e
            if (r9 == 0) goto L_0x0163
            boolean r10 = r9.f2550a
            r11 = 1
            if (r10 != r11) goto L_0x0163
            r10 = r11
            goto L_0x0164
        L_0x0163:
            r10 = 0
        L_0x0164:
            if (r10 == 0) goto L_0x016e
            androidx.compose.material.f r10 = new androidx.compose.material.f
            r10.<init>(r6, r9)
            r20 = r10
            goto L_0x0172
        L_0x016e:
            androidx.compose.ui.graphics.e0$a r9 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            r20 = r9
        L_0x0172:
            int r9 = r0 >> 3
            r10 = r9 & 14
            r9 = r9 & 112(0x70, float:1.57E-43)
            r9 = r9 | r10
            int r10 = r0 >> 6
            r11 = r10 & 896(0x380, float:1.256E-42)
            r9 = r9 | r11
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r10
            int r10 = r0 << 15
            r10 = r10 & r17
            r9 = r9 | r10
            r0 = r0 & r19
            r10 = r9 | r0
            r11 = 0
            r9 = r7
            r0 = r12
            r21 = r13
            r12 = r2
            r22 = r14
            r23 = r15
            r14 = r4
            r16 = r8
            r17 = r21
            r18 = r1
            r19 = r20
            r20 = r22
            androidx.compose.material.AppBarKt.m2165a(r9, r10, r11, r12, r14, r16, r17, r18, r19, r20)
            r10 = r1
            r11 = r2
            r13 = r4
            r15 = r6
            r16 = r7
            r17 = r8
        L_0x01aa:
            androidx.compose.runtime.v0 r1 = r21.mo5421U()
            if (r1 != 0) goto L_0x01b1
            goto L_0x01bf
        L_0x01b1:
            androidx.compose.material.AppBarKt$BottomAppBar$1 r2 = new androidx.compose.material.AppBarKt$BottomAppBar$1
            r9 = r2
            r18 = r22
            r19 = r23
            r20 = r0
            r9.<init>(r10, r11, r13, r15, r16, r17, r18, r19, r20)
            r1.f3081d = r2
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt$BottomAppBar$1.invoke(androidx.compose.runtime.d, int):void");
    }
}
