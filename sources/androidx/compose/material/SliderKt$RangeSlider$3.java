package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20053e;

final class SliderKt$RangeSlider$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1228r1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C20053e<Float>, C19394m> $onValueChange;
    public final /* synthetic */ C19846a<C19394m> $onValueChangeFinished;
    public final /* synthetic */ int $steps;
    public final /* synthetic */ C20053e<Float> $valueRange;
    public final /* synthetic */ C20053e<Float> $values;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$3(C20053e<Float> eVar, C19857l<? super C20053e<Float>, C19394m> lVar, C1436d dVar, boolean z, C20053e<Float> eVar2, int i, C19846a<C19394m> aVar, C1228r1 r1Var, int i2, int i3) {
        super(2);
        this.$values = eVar;
        this.$onValueChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$valueRange = eVar2;
        this.$steps = i;
        this.$onValueChangeFinished = aVar;
        this.$colors = r1Var;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r31, int r32) {
        /*
            r30 = this;
            r0 = r30
            pq.e<java.lang.Float> r13 = r0.$values
            kq.l<pq.e<java.lang.Float>, kotlin.m> r14 = r0.$onValueChange
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            pq.e<java.lang.Float> r3 = r0.$valueRange
            int r4 = r0.$steps
            kq.a<kotlin.m> r5 = r0.$onValueChangeFinished
            androidx.compose.material.r1 r6 = r0.$colors
            int r7 = r0.$$changed
            r15 = r7 | 1
            int r12 = r0.$$default
            float r7 = androidx.compose.material.SliderKt.f2258a
            java.lang.String r7 = "values"
            kotlin.jvm.internal.C19383o.m32797g(r13, r7)
            java.lang.String r7 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r14, r7)
            r7 = -1556183027(0xffffffffa33e880d, float:-1.03287305E-17)
            r8 = r31
            androidx.compose.runtime.ComposerImpl r11 = r8.mo5440h(r7)
            r7 = r12 & 1
            if (r7 == 0) goto L_0x0034
            r7 = r15 | 6
            goto L_0x0044
        L_0x0034:
            r7 = r15 & 14
            if (r7 != 0) goto L_0x0043
            boolean r7 = r11.mo5408I(r13)
            if (r7 == 0) goto L_0x0040
            r7 = 4
            goto L_0x0041
        L_0x0040:
            r7 = 2
        L_0x0041:
            r7 = r7 | r15
            goto L_0x0044
        L_0x0043:
            r7 = r15
        L_0x0044:
            r8 = r12 & 2
            if (r8 == 0) goto L_0x004b
            r7 = r7 | 48
            goto L_0x005b
        L_0x004b:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x005b
            boolean r8 = r11.mo5408I(r14)
            if (r8 == 0) goto L_0x0058
            r8 = 32
            goto L_0x005a
        L_0x0058:
            r8 = 16
        L_0x005a:
            r7 = r7 | r8
        L_0x005b:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0062
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0072
        L_0x0062:
            r9 = r15 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x0072
            boolean r9 = r11.mo5408I(r1)
            if (r9 == 0) goto L_0x006f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0071
        L_0x006f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0071:
            r7 = r7 | r9
        L_0x0072:
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0079
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0079:
            r10 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0089
            boolean r10 = r11.mo5427a(r2)
            if (r10 == 0) goto L_0x0086
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r7 = r7 | r10
        L_0x0089:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r15
            if (r10 != 0) goto L_0x009f
            r10 = r12 & 16
            if (r10 != 0) goto L_0x009c
            boolean r10 = r11.mo5408I(r3)
            if (r10 == 0) goto L_0x009c
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r7 = r7 | r10
        L_0x009f:
            r10 = r12 & 32
            if (r10 == 0) goto L_0x00a6
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b7
        L_0x00a6:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x00b9
            boolean r16 = r11.mo5432d(r4)
            if (r16 == 0) goto L_0x00b5
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r7 = r7 | r16
        L_0x00b9:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00c0
            r17 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00d1
        L_0x00c0:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00d3
            boolean r17 = r11.mo5408I(r5)
            if (r17 == 0) goto L_0x00cf
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r7 = r7 | r17
        L_0x00d3:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r15 & r17
            if (r17 != 0) goto L_0x00e9
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r11.mo5408I(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e8
        L_0x00e6:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e8:
            r7 = r7 | r0
        L_0x00e9:
            r0 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r0 & r7
            r17 = r1
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r1) goto L_0x010e
            boolean r0 = r11.mo5442i()
            if (r0 != 0) goto L_0x00fb
            goto L_0x010e
        L_0x00fb:
            r11.mo5396C()
            r7 = r4
            r8 = r5
            r9 = r6
            r29 = r12
            r28 = r14
            r32 = r15
            r4 = r17
            r5 = r2
            r6 = r3
            r14 = r11
            goto L_0x0213
        L_0x010e:
            r11.mo5466u0()
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0132
            boolean r0 = r11.mo5425Y()
            if (r0 == 0) goto L_0x011d
            goto L_0x0132
        L_0x011d:
            r11.mo5396C()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0128
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r0
        L_0x0128:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x012f
            r0 = r17
            goto L_0x015b
        L_0x012f:
            r0 = r17
            goto L_0x015f
        L_0x0132:
            if (r8 == 0) goto L_0x0137
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0139
        L_0x0137:
            r0 = r17
        L_0x0139:
            if (r9 == 0) goto L_0x013c
            r2 = 1
        L_0x013c:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x014d
            r3 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            pq.d r9 = new pq.d
            r9.<init>(r3, r8)
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r3
            r3 = r9
        L_0x014d:
            if (r10 == 0) goto L_0x0150
            r4 = r1
        L_0x0150:
            if (r16 == 0) goto L_0x0153
            r5 = 0
        L_0x0153:
            r8 = r12 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x015f
            androidx.compose.material.e0 r6 = p568fn.C17782b.m29846L(r11)
        L_0x015b:
            r8 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r8
        L_0x015f:
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r6
            r4 = r7
            r11.mo5419S()
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r2)
            java.lang.Object r3 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r5) goto L_0x017f
            androidx.compose.foundation.interaction.k r3 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x017f:
            r11.mo5418R(r1)
            r6 = r3
            androidx.compose.foundation.interaction.j r6 = (androidx.compose.foundation.interaction.C0640j) r6
            r11.mo5465u(r2)
            java.lang.Object r2 = r11.mo5431c0()
            if (r2 != r5) goto L_0x0192
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x0192:
            r11.mo5418R(r1)
            r7 = r2
            androidx.compose.foundation.interaction.j r7 = (androidx.compose.foundation.interaction.C0640j) r7
            if (r25 < 0) goto L_0x019c
            r2 = 1
            goto L_0x019d
        L_0x019c:
            r2 = r1
        L_0x019d:
            if (r2 == 0) goto L_0x022a
            androidx.compose.runtime.j0 r8 = androidx.compose.foundation.layout.C0761x.m1664E0(r14, r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r11.mo5465u(r3)
            boolean r2 = r11.mo5408I(r2)
            java.lang.Object r3 = r11.mo5431c0()
            if (r2 != 0) goto L_0x01b9
            if (r3 != r5) goto L_0x01c0
        L_0x01b9:
            java.util.List r3 = androidx.compose.material.SliderKt.m2222k(r25)
            r11.mo5407H0(r3)
        L_0x01c0:
            r11.mo5418R(r1)
            r9 = r3
            java.util.List r9 = (java.util.List) r9
            androidx.compose.ui.d r1 = androidx.compose.material.TouchTargetKt.m2285a(r0)
            float r2 = androidx.compose.material.SliderKt.f2258a
            r3 = 4
            float r3 = (float) r3
            float r3 = r3 * r2
            r5 = 2
            float r5 = (float) r5
            float r2 = r2 * r5
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.SizeKt.m1491k(r1, r3, r2)
            r17 = 0
            r18 = 0
            r10 = 652589923(0x26e5bb63, float:1.5940858E-15)
            androidx.compose.material.SliderKt$RangeSlider$2 r5 = new androidx.compose.material.SliderKt$RangeSlider$2
            r1 = r5
            r2 = r24
            r3 = r13
            r31 = r0
            r0 = r5
            r5 = r8
            r8 = r23
            r32 = r15
            r15 = r10
            r10 = r25
            r28 = r14
            r14 = r11
            r11 = r27
            r29 = r12
            r12 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.runtime.internal.ComposableLambdaImpl r19 = p628nj.C18263b.m30805A(r14, r15, r0)
            r21 = 3072(0xc00, float:4.305E-42)
            r22 = 6
            r20 = r14
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m1460a(r16, r17, r18, r19, r20, r21, r22)
            r4 = r31
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
        L_0x0213:
            androidx.compose.runtime.v0 r0 = r14.mo5421U()
            if (r0 != 0) goto L_0x021a
            goto L_0x0229
        L_0x021a:
            androidx.compose.material.SliderKt$RangeSlider$3 r12 = new androidx.compose.material.SliderKt$RangeSlider$3
            r1 = r12
            r2 = r13
            r3 = r28
            r10 = r32
            r11 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f3081d = r12
        L_0x0229:
            return
        L_0x022a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "steps should be >= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$RangeSlider$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
