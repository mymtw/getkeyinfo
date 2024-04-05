package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20053e;

final class SliderKt$Slider$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Float, C19394m> $onValueChange;
    public final /* synthetic */ C19846a<C19394m> $onValueChangeFinished;
    public final /* synthetic */ int $steps;
    public final /* synthetic */ float $value;
    public final /* synthetic */ C20053e<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$4(float f, C19857l<? super Float, C19394m> lVar, C1436d dVar, boolean z, C20053e<Float> eVar, int i, C19846a<C19394m> aVar, C0640j jVar, C1228r1 r1Var, int i2, int i3) {
        super(2);
        this.$value = f;
        this.$onValueChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$valueRange = eVar;
        this.$steps = i;
        this.$onValueChangeFinished = aVar;
        this.$interactionSource = jVar;
        this.$colors = r1Var;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            float r11 = r0.$value
            kq.l<java.lang.Float, kotlin.m> r12 = r0.$onValueChange
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            pq.e<java.lang.Float> r3 = r0.$valueRange
            int r4 = r0.$steps
            kq.a<kotlin.m> r5 = r0.$onValueChangeFinished
            androidx.compose.foundation.interaction.j r6 = r0.$interactionSource
            androidx.compose.material.r1 r7 = r0.$colors
            int r8 = r0.$$changed
            r13 = r8 | 1
            int r14 = r0.$$default
            float r8 = androidx.compose.material.SliderKt.f2258a
            java.lang.String r8 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r12, r8)
            r8 = -1962335196(0xffffffff8b092424, float:-2.641243E-32)
            r9 = r29
            androidx.compose.runtime.ComposerImpl r15 = r9.mo5440h(r8)
            r8 = r14 & 1
            if (r8 == 0) goto L_0x0031
            r8 = r13 | 6
            goto L_0x0041
        L_0x0031:
            r8 = r13 & 14
            if (r8 != 0) goto L_0x0040
            boolean r8 = r15.mo5428b(r11)
            if (r8 == 0) goto L_0x003d
            r8 = 4
            goto L_0x003e
        L_0x003d:
            r8 = 2
        L_0x003e:
            r8 = r8 | r13
            goto L_0x0041
        L_0x0040:
            r8 = r13
        L_0x0041:
            r9 = r14 & 2
            if (r9 == 0) goto L_0x0048
            r8 = r8 | 48
            goto L_0x0058
        L_0x0048:
            r9 = r13 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0058
            boolean r9 = r15.mo5408I(r12)
            if (r9 == 0) goto L_0x0055
            r9 = 32
            goto L_0x0057
        L_0x0055:
            r9 = 16
        L_0x0057:
            r8 = r8 | r9
        L_0x0058:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x005f
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r10 = r13 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x006f
            boolean r10 = r15.mo5408I(r1)
            if (r10 == 0) goto L_0x006c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r8 = r8 | r10
        L_0x006f:
            r10 = r14 & 8
            if (r10 == 0) goto L_0x0076
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r0 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0086
            boolean r0 = r15.mo5427a(r2)
            if (r0 == 0) goto L_0x0083
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r8 = r8 | r0
        L_0x0086:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x009c
            r0 = r14 & 16
            if (r0 != 0) goto L_0x0099
            boolean r0 = r15.mo5408I(r3)
            if (r0 == 0) goto L_0x0099
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r8 = r8 | r0
        L_0x009c:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x00a3
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b4
        L_0x00a3:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00b6
            boolean r16 = r15.mo5432d(r4)
            if (r16 == 0) goto L_0x00b2
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r8 = r8 | r16
        L_0x00b6:
            r16 = r14 & 64
            if (r16 == 0) goto L_0x00bd
            r17 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00ce
        L_0x00bd:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00d0
            boolean r17 = r15.mo5408I(r5)
            if (r17 == 0) goto L_0x00cc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r8 = r8 | r17
        L_0x00d0:
            r17 = r1
            r1 = r14 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00d9
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00ea
        L_0x00d9:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00ec
            boolean r18 = r15.mo5408I(r6)
            if (r18 == 0) goto L_0x00e8
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r8 = r8 | r18
        L_0x00ec:
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x0105
            r18 = r2
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0101
            boolean r2 = r15.mo5408I(r7)
            if (r2 == 0) goto L_0x0101
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0103
        L_0x0101:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0103:
            r8 = r8 | r2
            goto L_0x0107
        L_0x0105:
            r18 = r2
        L_0x0107:
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r8
            r19 = r3
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r3) goto L_0x012b
            boolean r2 = r15.mo5442i()
            if (r2 != 0) goto L_0x0119
            goto L_0x012b
        L_0x0119:
            r15.mo5396C()
            r8 = r5
            r9 = r6
            r10 = r7
            r30 = r14
            r2 = r15
            r5 = r18
            r6 = r19
            r7 = r4
            r4 = r17
            goto L_0x025a
        L_0x012b:
            r15.mo5466u0()
            r2 = r13 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r2 == 0) goto L_0x015b
            boolean r2 = r15.mo5425Y()
            if (r2 == 0) goto L_0x013c
            goto L_0x015b
        L_0x013c:
            r15.mo5396C()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0147
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r0
        L_0x0147:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0154
            r0 = r8 & r3
            r1 = r17
            r2 = r18
            r3 = r19
            goto L_0x01ab
        L_0x0154:
            r1 = r17
            r2 = r18
            r3 = r19
            goto L_0x01ac
        L_0x015b:
            if (r9 == 0) goto L_0x0161
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r17 = r2
        L_0x0161:
            if (r10 == 0) goto L_0x0165
            r2 = 1
            goto L_0x0167
        L_0x0165:
            r2 = r18
        L_0x0167:
            r9 = r14 & 16
            if (r9 == 0) goto L_0x0178
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            pq.d r3 = new pq.d
            r3.<init>(r9, r10)
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r9
            goto L_0x017a
        L_0x0178:
            r3 = r19
        L_0x017a:
            if (r0 == 0) goto L_0x017e
            r0 = 0
            r4 = r0
        L_0x017e:
            if (r16 == 0) goto L_0x0182
            r0 = 0
            r5 = r0
        L_0x0182:
            if (r1 == 0) goto L_0x019d
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo5465u(r0)
            java.lang.Object r0 = r15.mo5431c0()
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r1) goto L_0x0196
            androidx.compose.foundation.interaction.k r0 = android.support.p013v4.media.C0072d.m198e(r15)
        L_0x0196:
            r1 = 0
            r15.mo5418R(r1)
            androidx.compose.foundation.interaction.j r0 = (androidx.compose.foundation.interaction.C0640j) r0
            r6 = r0
        L_0x019d:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b8
            androidx.compose.material.e0 r7 = p568fn.C17782b.m29846L(r15)
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r8
            r1 = r17
        L_0x01ab:
            r8 = r0
        L_0x01ac:
            r0 = r1
            r10 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r9 = r6
            r25 = r7
            goto L_0x01bb
        L_0x01b8:
            r1 = r17
            goto L_0x01ac
        L_0x01bb:
            r15.mo5419S()
            if (r23 < 0) goto L_0x01c2
            r1 = 1
            goto L_0x01c3
        L_0x01c2:
            r1 = 0
        L_0x01c3:
            if (r1 == 0) goto L_0x026f
            androidx.compose.runtime.j0 r16 = androidx.compose.foundation.layout.C0761x.m1664E0(r12, r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r15.mo5465u(r2)
            boolean r1 = r15.mo5408I(r1)
            java.lang.Object r2 = r15.mo5431c0()
            if (r1 != 0) goto L_0x01e1
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r1) goto L_0x01e8
        L_0x01e1:
            java.util.List r2 = androidx.compose.material.SliderKt.m2222k(r23)
            r15.mo5407H0(r2)
        L_0x01e8:
            r1 = 0
            r15.mo5418R(r1)
            r17 = r2
            java.util.List r17 = (java.util.List) r17
            androidx.compose.ui.d r1 = androidx.compose.material.TouchTargetKt.m2285a(r0)
            float r2 = androidx.compose.material.SliderKt.f2258a
            r3 = 2
            float r3 = (float) r3
            float r3 = r3 * r2
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1491k(r1, r3, r3)
            r2 = r11
            r3 = r17
            r4 = r10
            r5 = r12
            r6 = r22
            r7 = r23
            androidx.compose.ui.d r1 = androidx.compose.material.SliderKt.m2221j(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.d r18 = androidx.compose.foundation.FocusableKt.m1305b(r9, r1, r10)
            r19 = 0
            r20 = 0
            r7 = 2085116814(0x7c485b8e, float:4.1612653E36)
            androidx.compose.material.SliderKt$Slider$3 r6 = new androidx.compose.material.SliderKt$Slider$3
            r1 = r6
            r2 = r22
            r3 = r8
            r4 = r11
            r5 = r9
            r8 = r6
            r6 = r10
            r29 = r0
            r0 = r7
            r7 = r17
            r30 = r14
            r14 = r8
            r8 = r25
            r26 = r9
            r9 = r16
            r27 = r10
            r10 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r15, r0, r14)
            r1 = 3072(0xc00, float:4.305E-42)
            r21 = 6
            r2 = r15
            r15 = r18
            r16 = r19
            r17 = r20
            r18 = r0
            r19 = r2
            r20 = r1
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m1460a(r15, r16, r17, r18, r19, r20, r21)
            r4 = r29
            r6 = r22
            r7 = r23
            r8 = r24
            r10 = r25
            r9 = r26
            r5 = r27
        L_0x025a:
            androidx.compose.runtime.v0 r0 = r2.mo5421U()
            if (r0 != 0) goto L_0x0261
            goto L_0x026e
        L_0x0261:
            androidx.compose.material.SliderKt$Slider$4 r14 = new androidx.compose.material.SliderKt$Slider$4
            r1 = r14
            r2 = r11
            r3 = r12
            r11 = r13
            r12 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f3081d = r14
        L_0x026e:
            return
        L_0x026f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$Slider$4.invoke(androidx.compose.runtime.d, int):void");
    }
}
