package com.google.accompanist.flowlayout;

import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1713x;
import java.util.ArrayList;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.Ref$IntRef;

public final class FlowKt$Flow$1 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ LayoutOrientation f27821a;

    /* renamed from: b */
    public final /* synthetic */ float f27822b;

    /* renamed from: c */
    public final /* synthetic */ SizeMode f27823c;

    /* renamed from: d */
    public final /* synthetic */ float f27824d;

    /* renamed from: e */
    public final /* synthetic */ MainAxisAlignment f27825e;

    /* renamed from: f */
    public final /* synthetic */ MainAxisAlignment f27826f;

    /* renamed from: g */
    public final /* synthetic */ FlowCrossAxisAlignment f27827g;

    public FlowKt$Flow$1(LayoutOrientation layoutOrientation, float f, SizeMode sizeMode, float f2, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, FlowCrossAxisAlignment flowCrossAxisAlignment) {
        this.f27821a = layoutOrientation;
        this.f27822b = f;
        this.f27823c = sizeMode;
        this.f27824d = f2;
        this.f27825e = mainAxisAlignment;
        this.f27826f = mainAxisAlignment2;
        this.f27827g = flowCrossAxisAlignment;
    }

    /* renamed from: f */
    public static final void m20296f(ArrayList arrayList, Ref$IntRef ref$IntRef, C1713x xVar, float f, ArrayList arrayList2, ArrayList arrayList3, Ref$IntRef ref$IntRef2, ArrayList arrayList4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
        if (!arrayList.isEmpty()) {
            ref$IntRef.element = xVar.mo3791V(f) + ref$IntRef.element;
        }
        arrayList.add(C19327t.m32660p1(arrayList2));
        arrayList3.add(Integer.valueOf(ref$IntRef2.element));
        arrayList4.add(Integer.valueOf(ref$IntRef.element));
        ref$IntRef.element += ref$IntRef2.element;
        ref$IntRef3.element = Math.max(ref$IntRef3.element, ref$IntRef4.element);
        arrayList2.clear();
        ref$IntRef4.element = 0;
        ref$IntRef2.element = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0120  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.layout.C1712w mo3260b(androidx.compose.p015ui.layout.C1713x r27, java.util.List<? extends androidx.compose.p015ui.layout.C1710u> r28, long r29) {
        /*
            r26 = this;
            r0 = r26
            r12 = r27
            java.lang.String r1 = "$this$Layout"
            kotlin.jvm.internal.C19383o.m32797g(r12, r1)
            java.lang.String r1 = "measurables"
            r2 = r28
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            kotlin.jvm.internal.Ref$IntRef r15 = new kotlin.jvm.internal.Ref$IntRef
            r15.<init>()
            kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            kotlin.jvm.internal.Ref$IntRef r7 = new kotlin.jvm.internal.Ref$IntRef
            r7.<init>()
            com.google.accompanist.flowlayout.LayoutOrientation r1 = r0.f27821a
            com.google.accompanist.flowlayout.LayoutOrientation r3 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            if (r1 != r3) goto L_0x0043
            int r4 = p174m0.C7280a.m13965j(r29)
            goto L_0x0047
        L_0x0043:
            int r4 = p174m0.C7280a.m13964i(r29)
        L_0x0047:
            r6 = r4
            if (r1 != r3) goto L_0x004f
            int r4 = p174m0.C7280a.m13963h(r29)
            goto L_0x0053
        L_0x004f:
            int r4 = p174m0.C7280a.m13962g(r29)
        L_0x0053:
            r5 = r4
            if (r1 != r3) goto L_0x005b
            int r4 = p174m0.C7280a.m13964i(r29)
            goto L_0x005f
        L_0x005b:
            int r4 = p174m0.C7280a.m13965j(r29)
        L_0x005f:
            if (r1 != r3) goto L_0x0065
            p174m0.C7280a.m13962g(r29)
            goto L_0x0068
        L_0x0065:
            p174m0.C7280a.m13963h(r29)
        L_0x0068:
            com.google.accompanist.flowlayout.LayoutOrientation r1 = r0.f27821a
            r16 = r15
            r15 = 0
            if (r1 != r3) goto L_0x0076
            r1 = 13
            long r17 = androidx.activity.C0114h.m315r(r5, r15, r1)
            goto L_0x007b
        L_0x0076:
            r1 = 7
            long r17 = androidx.activity.C0114h.m315r(r15, r5, r1)
        L_0x007b:
            r19 = r14
            r14 = r17
            java.util.Iterator r17 = r28.iterator()
        L_0x0083:
            boolean r1 = r17.hasNext()
            r18 = 1
            if (r1 == 0) goto L_0x0135
            java.lang.Object r1 = r17.next()
            androidx.compose.ui.layout.u r1 = (androidx.compose.p015ui.layout.C1710u) r1
            androidx.compose.ui.layout.i0 r3 = r1.mo6665J(r14)
            float r1 = r0.f27822b
            com.google.accompanist.flowlayout.LayoutOrientation r2 = r0.f27821a
            boolean r20 = r9.isEmpty()
            if (r20 != 0) goto L_0x00b7
            r20 = r4
            int r4 = r8.element
            int r1 = r12.mo3791V(r1)
            int r1 = r1 + r4
            com.google.accompanist.flowlayout.LayoutOrientation r4 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            if (r2 != r4) goto L_0x00af
            int r2 = r3.f3722b
            goto L_0x00b1
        L_0x00af:
            int r2 = r3.f3723c
        L_0x00b1:
            int r2 = r2 + r1
            if (r2 > r5) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            r1 = 0
            goto L_0x00bb
        L_0x00b7:
            r20 = r4
        L_0x00b9:
            r1 = r18
        L_0x00bb:
            if (r1 != 0) goto L_0x00df
            float r4 = r0.f27824d
            r1 = r11
            r2 = r10
            r21 = r14
            r14 = r3
            r3 = r27
            r15 = r20
            r15 = r5
            r5 = r9
            r23 = r6
            r6 = r13
            r28 = r7
            r30 = r8
            r8 = r19
            r24 = r9
            r9 = r16
            r25 = r10
            r10 = r30
            m20296f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00ed
        L_0x00df:
            r23 = r6
            r28 = r7
            r30 = r8
            r24 = r9
            r25 = r10
            r21 = r14
            r14 = r3
            r15 = r5
        L_0x00ed:
            boolean r1 = r24.isEmpty()
            r1 = r1 ^ 1
            r10 = r30
            if (r1 == 0) goto L_0x0102
            int r1 = r10.element
            float r2 = r0.f27822b
            int r2 = r12.mo3791V(r2)
            int r2 = r2 + r1
            r10.element = r2
        L_0x0102:
            r5 = r24
            r5.add(r14)
            int r1 = r10.element
            com.google.accompanist.flowlayout.LayoutOrientation r2 = r0.f27821a
            com.google.accompanist.flowlayout.LayoutOrientation r3 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            if (r2 != r3) goto L_0x0112
            int r4 = r14.f3722b
            goto L_0x0114
        L_0x0112:
            int r4 = r14.f3723c
        L_0x0114:
            int r4 = r4 + r1
            r10.element = r4
            r7 = r28
            int r1 = r7.element
            if (r2 != r3) goto L_0x0120
            int r2 = r14.f3723c
            goto L_0x0122
        L_0x0120:
            int r2 = r14.f3722b
        L_0x0122:
            int r1 = java.lang.Math.max(r1, r2)
            r7.element = r1
            r9 = r5
            r8 = r10
            r5 = r15
            r4 = r20
            r14 = r21
            r6 = r23
            r10 = r25
            goto L_0x0083
        L_0x0135:
            r20 = r4
            r15 = r5
            r23 = r6
            r5 = r9
            r25 = r10
            r10 = r8
            boolean r1 = r5.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0155
            float r4 = r0.f27824d
            r1 = r11
            r2 = r25
            r3 = r27
            r6 = r13
            r8 = r19
            r9 = r16
            m20296f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0155:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == r1) goto L_0x0162
            com.google.accompanist.flowlayout.SizeMode r1 = r0.f27823c
            com.google.accompanist.flowlayout.SizeMode r2 = com.google.accompanist.flowlayout.SizeMode.Expand
            if (r1 != r2) goto L_0x0162
            r8 = r15
            goto L_0x016d
        L_0x0162:
            r1 = r16
            int r1 = r1.element
            r4 = r23
            int r1 = java.lang.Math.max(r1, r4)
            r8 = r1
        L_0x016d:
            r1 = r25
            int r1 = r1.element
            r4 = r20
            int r1 = java.lang.Math.max(r1, r4)
            com.google.accompanist.flowlayout.LayoutOrientation r7 = r0.f27821a
            com.google.accompanist.flowlayout.LayoutOrientation r2 = com.google.accompanist.flowlayout.LayoutOrientation.Horizontal
            if (r7 != r2) goto L_0x017f
            r14 = r8
            goto L_0x0180
        L_0x017f:
            r14 = r1
        L_0x0180:
            if (r7 != r2) goto L_0x0184
            r15 = r1
            goto L_0x0185
        L_0x0184:
            r15 = r8
        L_0x0185:
            com.google.accompanist.flowlayout.FlowKt$Flow$1$measure$1 r10 = new com.google.accompanist.flowlayout.FlowKt$Flow$1$measure$1
            float r4 = r0.f27822b
            com.google.accompanist.flowlayout.MainAxisAlignment r5 = r0.f27825e
            com.google.accompanist.flowlayout.MainAxisAlignment r6 = r0.f27826f
            com.google.accompanist.flowlayout.FlowCrossAxisAlignment r9 = r0.f27827g
            r1 = r10
            r2 = r11
            r3 = r27
            r11 = r10
            r10 = r13
            r13 = r11
            r11 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.layout.w r1 = r12.mo4387Z(r14, r15, kotlin.collections.C19294b0.m32559p0(), r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt$Flow$1.mo3260b(androidx.compose.ui.layout.x, java.util.List, long):androidx.compose.ui.layout.w");
    }
}
