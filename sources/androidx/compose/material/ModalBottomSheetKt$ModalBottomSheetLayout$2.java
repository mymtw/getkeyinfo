package androidx.compose.material;

import androidx.compose.foundation.layout.C0739i;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

final class ModalBottomSheetKt$ModalBottomSheetLayout$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ long $scrimColor;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ C1530k0 $sheetShape;
    public final /* synthetic */ C1177d1 $sheetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$2(C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, C1436d dVar, C1177d1 d1Var, C1530k0 k0Var, float f, long j, long j2, long j3, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$sheetContent = qVar;
        this.$modifier = dVar;
        this.$sheetState = d1Var;
        this.$sheetShape = k0Var;
        this.$sheetElevation = f;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$scrimColor = j3;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r40, int r41) {
        /*
            r39 = this;
            r0 = r39
            kq.q<androidx.compose.foundation.layout.i, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$sheetContent
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.material.d1 r2 = r0.$sheetState
            androidx.compose.ui.graphics.k0 r3 = r0.$sheetShape
            float r4 = r0.$sheetElevation
            long r5 = r0.$sheetBackgroundColor
            long r7 = r0.$sheetContentColor
            long r9 = r0.$scrimColor
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$content
            int r11 = r0.$$changed
            r12 = 1
            r13 = r11 | 1
            int r11 = r0.$$default
            java.lang.String r12 = "sheetContent"
            kotlin.jvm.internal.C19383o.m32797g(r15, r12)
            java.lang.String r12 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r12)
            r12 = -1633763156(0xffffffff9e9ec0ac, float:-1.6808588E-20)
            r0 = r40
            androidx.compose.runtime.ComposerImpl r0 = r0.mo5440h(r12)
            r12 = r11 & 1
            r16 = 2
            r17 = r14
            if (r12 == 0) goto L_0x0039
            r12 = r13 | 6
            goto L_0x004a
        L_0x0039:
            r12 = r13 & 14
            if (r12 != 0) goto L_0x0049
            boolean r12 = r0.mo5408I(r15)
            if (r12 == 0) goto L_0x0045
            r12 = 4
            goto L_0x0047
        L_0x0045:
            r12 = r16
        L_0x0047:
            r12 = r12 | r13
            goto L_0x004a
        L_0x0049:
            r12 = r13
        L_0x004a:
            r18 = r11 & 2
            if (r18 == 0) goto L_0x0051
            r12 = r12 | 48
            goto L_0x0062
        L_0x0051:
            r19 = r13 & 112(0x70, float:1.57E-43)
            if (r19 != 0) goto L_0x0062
            boolean r19 = r0.mo5408I(r1)
            if (r19 == 0) goto L_0x005e
            r19 = 32
            goto L_0x0060
        L_0x005e:
            r19 = 16
        L_0x0060:
            r12 = r12 | r19
        L_0x0062:
            r14 = r13 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x0076
            r14 = r11 & 4
            if (r14 != 0) goto L_0x0073
            boolean r14 = r0.mo5408I(r2)
            if (r14 == 0) goto L_0x0073
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x0075
        L_0x0073:
            r14 = 128(0x80, float:1.794E-43)
        L_0x0075:
            r12 = r12 | r14
        L_0x0076:
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x008a
            r14 = r11 & 8
            if (r14 != 0) goto L_0x0087
            boolean r14 = r0.mo5408I(r3)
            if (r14 == 0) goto L_0x0087
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0089
        L_0x0087:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0089:
            r12 = r12 | r14
        L_0x008a:
            r14 = r11 & 16
            if (r14 == 0) goto L_0x0091
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0091:
            r19 = 57344(0xe000, float:8.0356E-41)
            r19 = r13 & r19
            if (r19 != 0) goto L_0x00a5
            boolean r19 = r0.mo5428b(r4)
            if (r19 == 0) goto L_0x00a1
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r12 = r12 | r19
        L_0x00a5:
            r19 = 458752(0x70000, float:6.42848E-40)
            r19 = r13 & r19
            if (r19 != 0) goto L_0x00bc
            r19 = r11 & 32
            if (r19 != 0) goto L_0x00b8
            boolean r19 = r0.mo5434e(r5)
            if (r19 == 0) goto L_0x00b8
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b8:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r12 = r12 | r19
        L_0x00bc:
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r13 & r19
            if (r19 != 0) goto L_0x00d3
            r19 = r11 & 64
            if (r19 != 0) goto L_0x00cf
            boolean r19 = r0.mo5434e(r7)
            if (r19 == 0) goto L_0x00cf
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r12 = r12 | r19
        L_0x00d3:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r13 & r19
            if (r19 != 0) goto L_0x00ec
            r19 = r1
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x00e8
            boolean r1 = r0.mo5434e(r9)
            if (r1 == 0) goto L_0x00e8
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r12 = r12 | r1
            goto L_0x00ee
        L_0x00ec:
            r19 = r1
        L_0x00ee:
            r1 = r11 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x00fb
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            r38 = r17
            r17 = r1
            r1 = r38
            goto L_0x010d
        L_0x00fb:
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x0110
            r1 = r17
            boolean r17 = r0.mo5408I(r1)
            if (r17 == 0) goto L_0x010b
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010d
        L_0x010b:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010d:
            r12 = r12 | r17
            goto L_0x0112
        L_0x0110:
            r1 = r17
        L_0x0112:
            r17 = 191739611(0xb6db6db, float:4.5782105E-32)
            r20 = r1
            r1 = r12 & r17
            r17 = r2
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r2) goto L_0x013b
            boolean r1 = r0.mo5442i()
            if (r1 != 0) goto L_0x0127
            goto L_0x013b
        L_0x0127:
            r0.mo5396C()
            r33 = r11
            r35 = r13
            r36 = r20
            r11 = r9
            r9 = r7
            r7 = r5
            r5 = r3
            r6 = r4
            r4 = r17
            r3 = r19
            goto L_0x02e6
        L_0x013b:
            r0.mo5466u0()
            r1 = r13 & 1
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r22 = 3
            r23 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r1 == 0) goto L_0x0186
            boolean r1 = r0.mo5425Y()
            if (r1 == 0) goto L_0x0151
            goto L_0x0186
        L_0x0151:
            r0.mo5396C()
            r1 = r11 & 4
            if (r1 == 0) goto L_0x015a
            r12 = r12 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x015a:
            r1 = r11 & 8
            if (r1 == 0) goto L_0x0160
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0160:
            r1 = r11 & 32
            if (r1 == 0) goto L_0x0166
            r12 = r12 & r21
        L_0x0166:
            r1 = r11 & 64
            if (r1 == 0) goto L_0x016e
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r12 = r12 & r1
        L_0x016e:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0174
            r12 = r12 & r23
        L_0x0174:
            r25 = r3
            r26 = r4
            r27 = r5
            r29 = r7
            r31 = r9
            r16 = r12
            r24 = r17
        L_0x0182:
            r23 = r19
            goto L_0x0269
        L_0x0186:
            if (r18 == 0) goto L_0x018b
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x018d
        L_0x018b:
            r1 = r19
        L_0x018d:
            r18 = r11 & 4
            if (r18 == 0) goto L_0x01e7
            androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
            r19 = r1
            java.lang.String r1 = "initialValue"
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            r1 = -1928569212(0xffffffff8d0c5e84, float:-4.32546E-31)
            r0.mo5465u(r1)
            androidx.compose.animation.core.h0<java.lang.Float> r1 = androidx.compose.material.C1258u1.f2630a
            r25 = r3
            androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$3 r3 = androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$3.INSTANCE
            r26 = r4
            r4 = -409288536(0xffffffffe79ac0a8, float:-1.4615966E24)
            r0.mo5465u(r4)
            r27 = r5
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r2
            r6 = 1
            r5[r6] = r1
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5[r16] = r6
            r5[r22] = r3
            java.lang.String r6 = "confirmStateChange"
            kotlin.jvm.internal.C19383o.m32797g(r3, r6)
            androidx.compose.material.ModalBottomSheetState$Companion$Saver$1 r6 = androidx.compose.material.ModalBottomSheetState$Companion$Saver$1.INSTANCE
            r29 = r7
            androidx.compose.material.ModalBottomSheetState$Companion$Saver$2 r7 = new androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
            r7.<init>(r1, r4, r3)
            androidx.compose.runtime.saveable.h r6 = androidx.compose.runtime.saveable.SaverKt.m2861a(r6, r7)
            androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2 r7 = new androidx.compose.material.ModalBottomSheetKt$rememberModalBottomSheetState$2
            r7.<init>(r2, r1, r4, r3)
            r1 = 4
            java.lang.Object r1 = androidx.compose.runtime.saveable.C1366b.m2863a(r5, r6, r7, r0, r1)
            androidx.compose.material.d1 r1 = (androidx.compose.material.C1177d1) r1
            r0.mo5418R(r4)
            r0.mo5418R(r4)
            r12 = r12 & -897(0xfffffffffffffc7f, float:NaN)
            r2 = r1
            goto L_0x01f3
        L_0x01e7:
            r19 = r1
            r25 = r3
            r26 = r4
            r27 = r5
            r29 = r7
            r2 = r17
        L_0x01f3:
            r1 = r11 & 8
            if (r1 == 0) goto L_0x0205
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.material.q1 r1 = (androidx.compose.material.C1225q1) r1
            p.a r1 = r1.f2549c
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
            goto L_0x0207
        L_0x0205:
            r3 = r25
        L_0x0207:
            if (r14 == 0) goto L_0x020d
            float r1 = androidx.compose.material.C1169b1.f2384a
            r4 = r1
            goto L_0x020f
        L_0x020d:
            r4 = r26
        L_0x020f:
            r1 = r11 & 32
            if (r1 == 0) goto L_0x0222
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.material.v r1 = (androidx.compose.material.C1259v) r1
            long r5 = r1.mo5363j()
            r12 = r12 & r21
            goto L_0x0224
        L_0x0222:
            r5 = r27
        L_0x0224:
            r1 = r11 & 64
            if (r1 == 0) goto L_0x0231
            long r7 = androidx.compose.material.ColorsKt.m2174b(r5, r0)
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r12 = r12 & r1
            goto L_0x0233
        L_0x0231:
            r7 = r29
        L_0x0233:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0259
            float r1 = androidx.compose.material.C1169b1.f2384a
            r1 = -112572414(0xfffffffff94a4802, float:-6.564403E34)
            r0.mo5465u(r1)
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.material.v r1 = (androidx.compose.material.C1259v) r1
            long r9 = r1.mo5358e()
            r1 = 1050924810(0x3ea3d70a, float:0.32)
            long r9 = androidx.compose.p015ui.graphics.C1545s.m3356b(r9, r1)
            r1 = 0
            r0.mo5418R(r1)
            r1 = r12 & r23
            r12 = r1
        L_0x0259:
            r24 = r2
            r25 = r3
            r26 = r4
            r27 = r5
            r29 = r7
            r31 = r9
            r16 = r12
            goto L_0x0182
        L_0x0269:
            r0.mo5419S()
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r0.mo5465u(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r1)
            java.lang.Object r1 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r2) goto L_0x028f
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.internal.f r1 = androidx.compose.runtime.C1415u.m3034h(r1, r0)
            androidx.compose.runtime.m r2 = new androidx.compose.runtime.m
            r2.<init>(r1)
            r0.mo5407H0(r2)
            r1 = r2
        L_0x028f:
            r2 = 0
            r0.mo5418R(r2)
            androidx.compose.runtime.m r1 = (androidx.compose.runtime.C1346m) r1
            kotlinx.coroutines.d0 r14 = r1.f2939b
            r0.mo5418R(r2)
            r17 = 0
            r18 = 0
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1 r12 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1
            r19 = r20
            r1 = r12
            r2 = r24
            r3 = r16
            r4 = r25
            r5 = r27
            r7 = r29
            r9 = r26
            r10 = r19
            r33 = r11
            r34 = r12
            r11 = r31
            r35 = r13
            r13 = r14
            r36 = r19
            r14 = r15
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r13, r14)
            r1 = 1607356310(0x5fce4f96, float:2.9732532E19)
            r2 = r34
            androidx.compose.runtime.internal.ComposableLambdaImpl r19 = p628nj.C18263b.m30805A(r0, r1, r2)
            int r1 = r16 >> 3
            r1 = r1 & 14
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r22 = 6
            r16 = r23
            r20 = r0
            r21 = r1
            androidx.compose.foundation.layout.BoxWithConstraintsKt.m1460a(r16, r17, r18, r19, r20, r21, r22)
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r9 = r29
        L_0x02e6:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x02ed
            goto L_0x0301
        L_0x02ed:
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2 r14 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
            r1 = r14
            r2 = r15
            r13 = r36
            r15 = r14
            r14 = r35
            r37 = r15
            r15 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r37
            r0.f3081d = r1
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2.invoke(androidx.compose.runtime.d, int):void");
    }
}
