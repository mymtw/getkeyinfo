package androidx.compose.material;

public final class MaterialThemeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ac, code lost:
        if ((r50 & 4) != 0) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02a2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2189a(androidx.compose.material.C1259v r44, androidx.compose.material.C1178d2 r45, androidx.compose.material.C1225q1 r46, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r47, androidx.compose.runtime.C1302d r48, int r49, int r50) {
        /*
            r4 = r47
            r5 = r49
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            r0 = -891417079(0xffffffffcade0e09, float:-7276292.5)
            r1 = r48
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r5 & 14
            if (r1 != 0) goto L_0x0029
            r1 = r50 & 1
            if (r1 != 0) goto L_0x0024
            r1 = r44
            boolean r6 = r0.mo5408I(r1)
            if (r6 == 0) goto L_0x0026
            r6 = 4
            goto L_0x0027
        L_0x0024:
            r1 = r44
        L_0x0026:
            r6 = 2
        L_0x0027:
            r6 = r6 | r5
            goto L_0x002c
        L_0x0029:
            r1 = r44
            r6 = r5
        L_0x002c:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0045
            r7 = r50 & 2
            if (r7 != 0) goto L_0x003f
            r7 = r45
            boolean r8 = r0.mo5408I(r7)
            if (r8 == 0) goto L_0x0041
            r8 = 32
            goto L_0x0043
        L_0x003f:
            r7 = r45
        L_0x0041:
            r8 = 16
        L_0x0043:
            r6 = r6 | r8
            goto L_0x0047
        L_0x0045:
            r7 = r45
        L_0x0047:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0060
            r8 = r50 & 4
            if (r8 != 0) goto L_0x005a
            r8 = r46
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005a:
            r8 = r46
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r6 = r6 | r9
            goto L_0x0062
        L_0x0060:
            r8 = r46
        L_0x0062:
            r9 = r50 & 8
            if (r9 == 0) goto L_0x0069
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0079
            boolean r9 = r0.mo5408I(r4)
            if (r9 == 0) goto L_0x0076
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r6 = r6 | r9
        L_0x0079:
            r9 = r6 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008d
            boolean r9 = r0.mo5442i()
            if (r9 != 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            r0.mo5396C()
            r2 = r7
            r3 = r8
            goto L_0x0390
        L_0x008d:
            r0.mo5466u0()
            r9 = r5 & 1
            if (r9 == 0) goto L_0x00af
            boolean r9 = r0.mo5425Y()
            if (r9 == 0) goto L_0x009b
            goto L_0x00af
        L_0x009b:
            r0.mo5396C()
            r9 = r50 & 1
            if (r9 == 0) goto L_0x00a4
            r6 = r6 & -15
        L_0x00a4:
            r9 = r50 & 2
            if (r9 == 0) goto L_0x00aa
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00aa:
            r9 = r50 & 4
            if (r9 == 0) goto L_0x00d9
            goto L_0x00d7
        L_0x00af:
            r9 = r50 & 1
            if (r9 == 0) goto L_0x00bd
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.material.v r1 = (androidx.compose.material.C1259v) r1
            r6 = r6 & -15
        L_0x00bd:
            r9 = r50 & 2
            if (r9 == 0) goto L_0x00cb
            androidx.compose.runtime.l1 r7 = androidx.compose.material.TypographyKt.f2371a
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.material.d2 r7 = (androidx.compose.material.C1178d2) r7
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00cb:
            r9 = r50 & 4
            if (r9 == 0) goto L_0x00d9
            androidx.compose.runtime.l1 r8 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.material.q1 r8 = (androidx.compose.material.C1225q1) r8
        L_0x00d7:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d9:
            r15 = r6
            r13 = r7
            r14 = r8
            r0.mo5419S()
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r6)
            java.lang.Object r6 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r12 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r12) goto L_0x013c
            long r17 = r1.mo5359f()
            long r19 = r1.mo5360g()
            long r21 = r1.mo5361h()
            long r23 = r1.mo5362i()
            long r25 = r1.mo5354a()
            long r27 = r1.mo5363j()
            long r29 = r1.mo5355b()
            long r31 = r1.mo5356c()
            long r33 = r1.mo5357d()
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r1.f2641j
            java.lang.Object r6 = r6.getValue()
            androidx.compose.ui.graphics.s r6 = (androidx.compose.p015ui.graphics.C1545s) r6
            long r6 = r6.f3366a
            long r37 = r1.mo5358e()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r1.f2643l
            java.lang.Object r8 = r8.getValue()
            androidx.compose.ui.graphics.s r8 = (androidx.compose.p015ui.graphics.C1545s) r8
            long r8 = r8.f3366a
            boolean r41 = r1.mo5364k()
            androidx.compose.material.v r10 = new androidx.compose.material.v
            r16 = r10
            r35 = r6
            r39 = r8
            r16.<init>(r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41)
            r0.mo5407H0(r10)
            r6 = r10
        L_0x013c:
            r11 = 0
            r0.mo5418R(r11)
            r10 = r6
            androidx.compose.material.v r10 = (androidx.compose.material.C1259v) r10
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ColorsKt.f2187a
            java.lang.String r6 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r10, r6)
            java.lang.String r6 = "other"
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            long r6 = r1.mo5359f()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2632a
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5360g()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2633b
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5361h()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2634c
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5362i()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2635d
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5354a()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2636e
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5363j()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2637f
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5355b()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2638g
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5356c()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2639h
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5357d()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2640i
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r1.f2641j
            java.lang.Object r6 = r6.getValue()
            androidx.compose.ui.graphics.s r6 = (androidx.compose.p015ui.graphics.C1545s) r6
            long r6 = r6.f3366a
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2641j
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            long r6 = r1.mo5358e()
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2642k
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r1.f2643l
            java.lang.Object r6 = r6.getValue()
            androidx.compose.ui.graphics.s r6 = (androidx.compose.p015ui.graphics.C1545s) r6
            long r6 = r6.f3366a
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r10.f2643l
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r6)
            r8.setValue(r9)
            boolean r6 = r1.mo5364k()
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r10.f2644m
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.setValue(r6)
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r17 = 7
            r44 = r10
            r10 = r0
            r2 = r11
            r11 = r16
            r3 = r12
            r12 = r17
            androidx.compose.material.ripple.c r6 = androidx.compose.material.ripple.C1244j.m2369a(r6, r7, r8, r10, r11, r12)
            r7 = -721696685(0xffffffffd4fbc853, float:-8.6511814E12)
            r0.mo5465u(r7)
            long r7 = r44.mo5359f()
            long r9 = r44.mo5354a()
            r11 = 35572910(0x21eccae, float:1.1666747E-37)
            r0.mo5465u(r11)
            r11 = r44
            long r17 = androidx.compose.material.ColorsKt.m2173a(r11, r9)
            long r19 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r12 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            r24 = 1
            if (r12 == 0) goto L_0x024a
            r12 = r24
            goto L_0x024b
        L_0x024a:
            r12 = r2
        L_0x024b:
            if (r12 == 0) goto L_0x0254
            r42 = r17
            r17 = r3
            r2 = r42
            goto L_0x0260
        L_0x0254:
            androidx.compose.runtime.t r12 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r12 = r0.mo5410J(r12)
            androidx.compose.ui.graphics.s r12 = (androidx.compose.p015ui.graphics.C1545s) r12
            r17 = r3
            long r2 = r12.f3366a
        L_0x0260:
            r12 = 0
            r0.mo5418R(r12)
            float r12 = kotlinx.coroutines.C19543e0.m33302T(r0)
            long r2 = androidx.compose.p015ui.graphics.C1545s.m3356b(r2, r12)
            androidx.compose.ui.graphics.s r12 = new androidx.compose.ui.graphics.s
            r12.<init>(r7)
            r44 = r1
            androidx.compose.ui.graphics.s r1 = new androidx.compose.ui.graphics.s
            r1.<init>(r9)
            androidx.compose.ui.graphics.s r5 = new androidx.compose.ui.graphics.s
            r5.<init>(r2)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.mo5465u(r4)
            boolean r4 = r0.mo5408I(r12)
            boolean r1 = r0.mo5408I(r1)
            r1 = r1 | r4
            boolean r4 = r0.mo5408I(r5)
            r1 = r1 | r4
            java.lang.Object r4 = r0.mo5431c0()
            if (r1 != 0) goto L_0x02a2
            r1 = r17
            if (r4 != r1) goto L_0x029c
            goto L_0x02a2
        L_0x029c:
            r45 = r6
            r29 = r15
            goto L_0x0322
        L_0x02a2:
            androidx.compose.foundation.text.selection.t r4 = new androidx.compose.foundation.text.selection.t
            r45 = r6
            long r5 = r11.mo5359f()
            r19 = 1053609165(0x3ecccccd, float:0.4)
            r17 = r7
            r20 = r2
            r22 = r9
            float r1 = androidx.compose.foundation.layout.C0761x.m1665F(r17, r19, r20, r22)
            r12 = 1045220557(0x3e4ccccd, float:0.2)
            r19 = r12
            float r17 = androidx.compose.foundation.layout.C0761x.m1665F(r17, r19, r20, r22)
            r26 = 1083179008(0x40900000, float:4.5)
            int r1 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            r18 = 1053609165(0x3ecccccd, float:0.4)
            if (r1 < 0) goto L_0x02ce
            r29 = r15
            r12 = r18
            goto L_0x0318
        L_0x02ce:
            int r1 = (r17 > r26 ? 1 : (r17 == r26 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d5
            r29 = r15
            goto L_0x0318
        L_0x02d5:
            r27 = r12
            r29 = r15
            r12 = r18
            r28 = r12
            r1 = 0
        L_0x02de:
            r15 = 7
            if (r1 >= r15) goto L_0x0318
            r17 = r7
            r19 = r12
            r20 = r2
            r22 = r9
            float r15 = androidx.compose.foundation.layout.C0761x.m1665F(r17, r19, r20, r22)
            float r15 = r15 / r26
            r17 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 - r17
            r17 = 0
            int r18 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r18 > 0) goto L_0x0303
            r18 = 1008981770(0x3c23d70a, float:0.01)
            int r18 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r18 > 0) goto L_0x0303
            r18 = r24
            goto L_0x0305
        L_0x0303:
            r18 = 0
        L_0x0305:
            if (r18 != 0) goto L_0x0318
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x030e
            r28 = r12
            goto L_0x0310
        L_0x030e:
            r27 = r12
        L_0x0310:
            float r12 = r28 + r27
            r15 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r15
            int r1 = r1 + 1
            goto L_0x02de
        L_0x0318:
            long r1 = androidx.compose.p015ui.graphics.C1545s.m3356b(r7, r12)
            r4.<init>(r5, r1)
            r0.mo5407H0(r4)
        L_0x0322:
            r1 = 0
            r0.mo5418R(r1)
            androidx.compose.foundation.text.selection.t r4 = (androidx.compose.foundation.text.selection.C1026t) r4
            r0.mo5418R(r1)
            r2 = 7
            androidx.compose.runtime.t0[] r2 = new androidx.compose.runtime.C1412t0[r2]
            androidx.compose.runtime.l1 r3 = androidx.compose.material.ColorsKt.f2187a
            androidx.compose.runtime.t0 r3 = r3.mo5908b(r11)
            r2[r1] = r3
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentAlphaKt.f2198a
            float r3 = kotlinx.coroutines.C19543e0.m33301S(r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r3)
            r2[r24] = r1
            androidx.compose.runtime.l1 r1 = androidx.compose.foundation.IndicationKt.f1271a
            r3 = r45
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r3)
            r3 = 2
            r2[r3] = r1
            r1 = 3
            androidx.compose.runtime.l1 r3 = androidx.compose.material.ripple.RippleThemeKt.f2573a
            androidx.compose.material.z0 r5 = androidx.compose.material.C1273z0.f2676a
            androidx.compose.runtime.t0 r3 = r3.mo5908b(r5)
            r2[r1] = r3
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ShapesKt.f2252a
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r14)
            r3 = 4
            r2[r3] = r1
            r1 = 5
            androidx.compose.runtime.t r3 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.f2103a
            androidx.compose.runtime.t0 r3 = r3.mo5908b(r4)
            r2[r1] = r3
            androidx.compose.runtime.l1 r1 = androidx.compose.material.TypographyKt.f2371a
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r13)
            r3 = 6
            r2[r3] = r1
            r1 = -1740102967(0xffffffff984822c9, float:-2.5866956E-24)
            androidx.compose.material.MaterialThemeKt$MaterialTheme$1 r3 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$1
            r4 = r47
            r6 = r29
            r3.<init>(r13, r4, r6)
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r0, r1, r3)
            r3 = 56
            androidx.compose.runtime.CompositionLocalKt.m2530a(r2, r1, r0, r3)
            r1 = r44
            r2 = r13
            r3 = r14
        L_0x0390:
            androidx.compose.runtime.v0 r7 = r0.mo5421U()
            if (r7 != 0) goto L_0x0397
            goto L_0x03a5
        L_0x0397:
            androidx.compose.material.MaterialThemeKt$MaterialTheme$2 r8 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$2
            r0 = r8
            r4 = r47
            r5 = r49
            r6 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3081d = r8
        L_0x03a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MaterialThemeKt.m2189a(androidx.compose.material.v, androidx.compose.material.d2, androidx.compose.material.q1, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
