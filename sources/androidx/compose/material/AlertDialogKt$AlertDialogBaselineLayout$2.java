package androidx.compose.material;

import androidx.compose.p015ui.layout.C1711v;

public final class AlertDialogKt$AlertDialogBaselineLayout$2 implements C1711v {

    /* renamed from: a */
    public static final AlertDialogKt$AlertDialogBaselineLayout$2 f2166a = new AlertDialogKt$AlertDialogBaselineLayout$2();

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fa  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.layout.C1712w mo3260b(androidx.compose.p015ui.layout.C1713x r11, java.util.List<? extends androidx.compose.p015ui.layout.C1710u> r12, long r13) {
        /*
            r10 = this;
            java.lang.String r0 = "$this$Layout"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.util.Iterator r0 = r12.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()
            r3 = r1
            androidx.compose.ui.layout.u r3 = (androidx.compose.p015ui.layout.C1710u) r3
            java.lang.Object r3 = androidx.compose.p015ui.text.input.C1993m.m4346G(r3)
            java.lang.String r4 = "title"
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x000e
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            androidx.compose.ui.layout.u r1 = (androidx.compose.p015ui.layout.C1710u) r1
            if (r1 == 0) goto L_0x003e
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 11
            r3 = r13
            long r3 = p174m0.C7280a.m13956a(r3, r5, r6, r7, r8, r9)
            androidx.compose.ui.layout.i0 r0 = r1.mo6665J(r3)
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            java.util.Iterator r12 = r12.iterator()
        L_0x0043:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r12.next()
            r3 = r1
            androidx.compose.ui.layout.u r3 = (androidx.compose.p015ui.layout.C1710u) r3
            java.lang.Object r3 = androidx.compose.p015ui.text.input.C1993m.m4346G(r3)
            java.lang.String r4 = "text"
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x0043
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            androidx.compose.ui.layout.u r1 = (androidx.compose.p015ui.layout.C1710u) r1
            if (r1 == 0) goto L_0x0072
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 11
            r3 = r13
            long r12 = p174m0.C7280a.m13956a(r3, r5, r6, r7, r8, r9)
            androidx.compose.ui.layout.i0 r12 = r1.mo6665J(r12)
            goto L_0x0073
        L_0x0072:
            r12 = r2
        L_0x0073:
            r13 = 0
            if (r0 == 0) goto L_0x0079
            int r14 = r0.f3722b
            goto L_0x007a
        L_0x0079:
            r14 = r13
        L_0x007a:
            if (r12 == 0) goto L_0x007f
            int r1 = r12.f3722b
            goto L_0x0080
        L_0x007f:
            r1 = r13
        L_0x0080:
            int r14 = java.lang.Math.max(r14, r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x009d
            androidx.compose.ui.layout.f r3 = androidx.compose.p015ui.layout.AlignmentLineKt.f3694a
            int r3 = r0.mo6661M(r3)
            if (r3 != r1) goto L_0x0092
            r3 = r2
            goto L_0x0096
        L_0x0092:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0096:
            if (r3 == 0) goto L_0x009d
            int r3 = r3.intValue()
            goto L_0x009e
        L_0x009d:
            r3 = r13
        L_0x009e:
            if (r0 == 0) goto L_0x00b5
            androidx.compose.ui.layout.f r4 = androidx.compose.p015ui.layout.AlignmentLineKt.f3695b
            int r4 = r0.mo6661M(r4)
            if (r4 != r1) goto L_0x00aa
            r4 = r2
            goto L_0x00ae
        L_0x00aa:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x00ae:
            if (r4 == 0) goto L_0x00b5
            int r4 = r4.intValue()
            goto L_0x00b6
        L_0x00b5:
            r4 = r13
        L_0x00b6:
            long r5 = androidx.compose.material.AlertDialogKt.f2163c
            int r5 = r11.mo3790E0(r5)
            int r5 = r5 - r3
            if (r12 == 0) goto L_0x00d3
            androidx.compose.ui.layout.f r3 = androidx.compose.p015ui.layout.AlignmentLineKt.f3694a
            int r3 = r12.mo6661M(r3)
            if (r3 != r1) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
        L_0x00cc:
            if (r2 == 0) goto L_0x00d3
            int r1 = r2.intValue()
            goto L_0x00d4
        L_0x00d3:
            r1 = r13
        L_0x00d4:
            if (r0 != 0) goto L_0x00dd
            long r2 = androidx.compose.material.AlertDialogKt.f2165e
            int r2 = r11.mo3790E0(r2)
            goto L_0x00e3
        L_0x00dd:
            long r2 = androidx.compose.material.AlertDialogKt.f2164d
            int r2 = r11.mo3790E0(r2)
        L_0x00e3:
            if (r0 == 0) goto L_0x00e9
            int r3 = r0.f3723c
            int r3 = r3 + r5
            goto L_0x00ea
        L_0x00e9:
            r3 = r13
        L_0x00ea:
            if (r0 != 0) goto L_0x00ef
            int r6 = r2 - r1
            goto L_0x00f8
        L_0x00ef:
            if (r4 != 0) goto L_0x00f4
            int r6 = r3 - r1
            goto L_0x00f7
        L_0x00f4:
            int r6 = r5 + r4
            int r6 = r6 - r1
        L_0x00f7:
            int r6 = r6 + r2
        L_0x00f8:
            if (r12 == 0) goto L_0x010c
            if (r4 != 0) goto L_0x0101
            int r13 = r12.f3723c
            int r13 = r13 + r2
            int r13 = r13 - r1
            goto L_0x010c
        L_0x0101:
            int r7 = r12.f3723c
            int r7 = r7 + r2
            int r7 = r7 - r1
            if (r0 == 0) goto L_0x0109
            int r13 = r0.f3723c
        L_0x0109:
            int r13 = r13 - r4
            int r13 = r7 - r13
        L_0x010c:
            int r13 = r13 + r3
            androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 r1 = new androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
            r1.<init>(r0, r5, r12, r6)
            androidx.compose.ui.layout.w r11 = r11.mo4387Z(r14, r13, kotlin.collections.C19294b0.m32559p0(), r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.mo3260b(androidx.compose.ui.layout.x, java.util.List, long):androidx.compose.ui.layout.w");
    }
}
