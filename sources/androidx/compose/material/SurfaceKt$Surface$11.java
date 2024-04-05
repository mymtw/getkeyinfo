package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class SurfaceKt$Surface$11 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onCheckedChange;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$11(boolean z, C19857l<? super Boolean, C19394m> lVar, C1436d dVar, boolean z2, C1530k0 k0Var, long j, long j2, C0556g gVar, float f, C0640j jVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2, int i3) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$shape = k0Var;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = gVar;
        this.$elevation = f;
        this.$interactionSource = jVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r38, int r39) {
        /*
            r37 = this;
            r0 = r37
            boolean r15 = r0.$checked
            kq.l<java.lang.Boolean, kotlin.m> r14 = r0.$onCheckedChange
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            androidx.compose.ui.graphics.k0 r3 = r0.$shape
            long r4 = r0.$color
            long r6 = r0.$contentColor
            androidx.compose.foundation.g r8 = r0.$border
            float r9 = r0.$elevation
            androidx.compose.foundation.interaction.j r10 = r0.$interactionSource
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r13 = r0.$content
            int r11 = r0.$$changed
            r12 = r11 | 1
            int r11 = r0.$$changed1
            r16 = r11
            int r11 = r0.$$default
            java.lang.String r0 = "onCheckedChange"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            r0 = 1341569296(0x4ff6b910, float:8.2786468E9)
            r17 = r13
            r13 = r38
            androidx.compose.runtime.ComposerImpl r0 = r13.mo5440h(r0)
            r13 = r11 & 1
            r18 = 4
            if (r13 == 0) goto L_0x0040
            r13 = r12 | 6
            goto L_0x0051
        L_0x0040:
            r13 = r12 & 14
            if (r13 != 0) goto L_0x0050
            boolean r13 = r0.mo5427a(r15)
            if (r13 == 0) goto L_0x004d
            r13 = r18
            goto L_0x004e
        L_0x004d:
            r13 = 2
        L_0x004e:
            r13 = r13 | r12
            goto L_0x0051
        L_0x0050:
            r13 = r12
        L_0x0051:
            r19 = r11 & 2
            if (r19 == 0) goto L_0x0058
            r13 = r13 | 48
            goto L_0x0069
        L_0x0058:
            r19 = r12 & 112(0x70, float:1.57E-43)
            if (r19 != 0) goto L_0x0069
            boolean r19 = r0.mo5408I(r14)
            if (r19 == 0) goto L_0x0065
            r19 = 32
            goto L_0x0067
        L_0x0065:
            r19 = 16
        L_0x0067:
            r13 = r13 | r19
        L_0x0069:
            r19 = r11 & 4
            if (r19 == 0) goto L_0x0072
            r13 = r13 | 384(0x180, float:5.38E-43)
            r39 = r14
            goto L_0x0084
        L_0x0072:
            r39 = r14
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x0084
            boolean r14 = r0.mo5408I(r1)
            if (r14 == 0) goto L_0x0081
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x0083
        L_0x0081:
            r14 = 128(0x80, float:1.794E-43)
        L_0x0083:
            r13 = r13 | r14
        L_0x0084:
            r14 = r11 & 8
            if (r14 == 0) goto L_0x008d
            r13 = r13 | 3072(0xc00, float:4.305E-42)
            r20 = r1
            goto L_0x00a0
        L_0x008d:
            r20 = r1
            r1 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x00a0
            boolean r1 = r0.mo5427a(r2)
            if (r1 == 0) goto L_0x009c
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x009e
        L_0x009c:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x009e:
            r1 = r1 | r13
            goto L_0x00a1
        L_0x00a0:
            r1 = r13
        L_0x00a1:
            r13 = r11 & 16
            if (r13 == 0) goto L_0x00a8
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00bc
        L_0x00a8:
            r21 = 57344(0xe000, float:8.0356E-41)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x00bc
            boolean r21 = r0.mo5408I(r3)
            if (r21 == 0) goto L_0x00b8
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ba
        L_0x00b8:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00ba:
            r1 = r1 | r21
        L_0x00bc:
            r21 = 458752(0x70000, float:6.42848E-40)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x00d3
            r21 = r11 & 32
            if (r21 != 0) goto L_0x00cf
            boolean r21 = r0.mo5434e(r4)
            if (r21 == 0) goto L_0x00cf
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d1
        L_0x00cf:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x00d1:
            r1 = r1 | r21
        L_0x00d3:
            r21 = 3670016(0x380000, float:5.142788E-39)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x00ea
            r21 = r11 & 64
            if (r21 != 0) goto L_0x00e6
            boolean r21 = r0.mo5434e(r6)
            if (r21 == 0) goto L_0x00e6
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r1 = r1 | r21
        L_0x00ea:
            r21 = r2
            r2 = r11 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00f3
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x0104
        L_0x00f3:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r12 & r22
            if (r22 != 0) goto L_0x0106
            boolean r22 = r0.mo5408I(r8)
            if (r22 == 0) goto L_0x0102
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r1 = r1 | r22
        L_0x0106:
            r22 = r3
            r3 = r11 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x010f
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x0120
        L_0x010f:
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r23 = r12 & r23
            if (r23 != 0) goto L_0x0122
            boolean r23 = r0.mo5428b(r9)
            if (r23 == 0) goto L_0x011e
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0120
        L_0x011e:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0120:
            r1 = r1 | r23
        L_0x0122:
            r24 = r4
            r4 = r11 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x012b
            r5 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x013b
        L_0x012b:
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r5 = r5 & r12
            if (r5 != 0) goto L_0x013c
            boolean r5 = r0.mo5408I(r10)
            if (r5 == 0) goto L_0x0139
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013b
        L_0x0139:
            r5 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013b:
            r1 = r1 | r5
        L_0x013c:
            r5 = r11 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0149
            r5 = r16 | 6
            r36 = r17
            r17 = r5
            r5 = r36
            goto L_0x015f
        L_0x0149:
            r5 = r16 & 14
            if (r5 != 0) goto L_0x015b
            r5 = r17
            boolean r17 = r0.mo5408I(r5)
            if (r17 == 0) goto L_0x0156
            goto L_0x0158
        L_0x0156:
            r18 = 2
        L_0x0158:
            r17 = r16 | r18
            goto L_0x015f
        L_0x015b:
            r5 = r17
            r17 = r16
        L_0x015f:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r23 = r5
            r5 = r1 & r18
            r26 = r6
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x0193
            r5 = r17 & 11
            r6 = 2
            if (r5 != r6) goto L_0x0193
            boolean r5 = r0.mo5442i()
            if (r5 != 0) goto L_0x0179
            goto L_0x0193
        L_0x0179:
            r0.mo5396C()
            r33 = r39
            r13 = r10
            r30 = r12
            r34 = r15
            r4 = r20
            r5 = r21
            r6 = r22
            r12 = r9
            r9 = r26
            r27 = r11
            r11 = r8
            r7 = r24
            goto L_0x029a
        L_0x0193:
            r0.mo5466u0()
            r5 = r12 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r5 == 0) goto L_0x01bf
            boolean r5 = r0.mo5425Y()
            if (r5 == 0) goto L_0x01a4
            goto L_0x01bf
        L_0x01a4:
            r0.mo5396C()
            r2 = r11 & 32
            if (r2 == 0) goto L_0x01ac
            r1 = r1 & r6
        L_0x01ac:
            r2 = r11 & 64
            if (r2 == 0) goto L_0x01b4
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r2
        L_0x01b4:
            r7 = r1
            r18 = r8
            r19 = r9
            r13 = r26
            r26 = r10
            goto L_0x0225
        L_0x01bf:
            if (r19 == 0) goto L_0x01c5
            androidx.compose.ui.d$a r5 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r20 = r5
        L_0x01c5:
            if (r14 == 0) goto L_0x01ca
            r5 = 1
            r21 = r5
        L_0x01ca:
            if (r13 == 0) goto L_0x01cf
            androidx.compose.ui.graphics.e0$a r5 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            goto L_0x01d1
        L_0x01cf:
            r5 = r22
        L_0x01d1:
            r7 = r11 & 32
            if (r7 == 0) goto L_0x01e3
            androidx.compose.runtime.l1 r7 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.material.v r7 = (androidx.compose.material.C1259v) r7
            long r13 = r7.mo5363j()
            r1 = r1 & r6
            goto L_0x01e5
        L_0x01e3:
            r13 = r24
        L_0x01e5:
            r6 = r11 & 64
            if (r6 == 0) goto L_0x01f3
            long r6 = androidx.compose.material.ColorsKt.m2174b(r13, r0)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r18
            goto L_0x01f5
        L_0x01f3:
            r6 = r26
        L_0x01f5:
            if (r2 == 0) goto L_0x01f9
            r2 = 0
            r8 = r2
        L_0x01f9:
            if (r3 == 0) goto L_0x01fe
            r2 = 0
            float r2 = (float) r2
            r9 = r2
        L_0x01fe:
            if (r4 == 0) goto L_0x0219
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r2)
            java.lang.Object r2 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x0212
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x0212:
            r3 = 0
            r0.mo5418R(r3)
            androidx.compose.foundation.interaction.j r2 = (androidx.compose.foundation.interaction.C0640j) r2
            r10 = r2
        L_0x0219:
            r22 = r5
            r18 = r8
            r19 = r9
            r26 = r10
            r24 = r13
            r13 = r6
            r7 = r1
        L_0x0225:
            r0.mo5419S()
            androidx.compose.runtime.t r1 = androidx.compose.material.ElevationOverlayKt.f2207b
            java.lang.Object r2 = r0.mo5410J(r1)
            m0.d r2 = (p174m0.C7284d) r2
            float r2 = r2.f16155b
            float r6 = r2 + r19
            r2 = 2
            androidx.compose.runtime.t0[] r10 = new androidx.compose.runtime.C1412t0[r2]
            androidx.compose.runtime.t r2 = androidx.compose.material.ContentColorKt.f2199a
            androidx.compose.ui.graphics.s r3 = new androidx.compose.ui.graphics.s
            r3.<init>(r13)
            androidx.compose.runtime.t0 r2 = r2.mo5908b(r3)
            r3 = 0
            r10[r3] = r2
            m0.d r2 = new m0.d
            r2.<init>(r6)
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r2)
            r2 = 1
            r10[r2] = r1
            androidx.compose.material.SurfaceKt$Surface$10 r9 = new androidx.compose.material.SurfaceKt$Surface$10
            r1 = r9
            r2 = r20
            r3 = r22
            r4 = r24
            r8 = r18
            r28 = r9
            r9 = r19
            r29 = r10
            r10 = r15
            r27 = r11
            r11 = r26
            r30 = r12
            r12 = r21
            r31 = r13
            r13 = r39
            r33 = r39
            r14 = r23
            r34 = r15
            r15 = r17
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = -311657392(0xffffffffed6c7c50, float:-4.5742967E27)
            r2 = r28
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r0, r1, r2)
            r2 = 56
            r3 = r29
            androidx.compose.runtime.CompositionLocalKt.m2530a(r3, r1, r0, r2)
            r11 = r18
            r12 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r24
            r13 = r26
            r9 = r31
        L_0x029a:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x02a1
            goto L_0x02b7
        L_0x02a1:
            androidx.compose.material.SurfaceKt$Surface$11 r15 = new androidx.compose.material.SurfaceKt$Surface$11
            r1 = r15
            r2 = r34
            r3 = r33
            r14 = r23
            r35 = r15
            r15 = r30
            r17 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17)
            r1 = r35
            r0.f3081d = r1
        L_0x02b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt$Surface$11.invoke(androidx.compose.runtime.d, int):void");
    }
}
