package androidx.compose.material;

import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1713x;
import java.util.ArrayList;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.Ref$IntRef;

public final class AlertDialogKt$AlertDialogFlowRow$1 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ float f2167a;

    /* renamed from: b */
    public final /* synthetic */ float f2168b;

    public AlertDialogKt$AlertDialogFlowRow$1(float f, float f2) {
        this.f2167a = f;
        this.f2168b = f2;
    }

    /* renamed from: f */
    public static final void m2162f(ArrayList arrayList, Ref$IntRef ref$IntRef, C1713x xVar, float f, ArrayList arrayList2, ArrayList arrayList3, Ref$IntRef ref$IntRef2, ArrayList arrayList4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
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

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.layout.C1712w mo3260b(androidx.compose.p015ui.layout.C1713x r26, java.util.List<? extends androidx.compose.p015ui.layout.C1710u> r27, long r28) {
        /*
            r25 = this;
            r0 = r25
            r11 = r26
            java.lang.String r1 = "$this$Layout"
            kotlin.jvm.internal.C19383o.m32797g(r11, r1)
            java.lang.String r1 = "measurables"
            r2 = r27
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
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
            int r1 = p174m0.C7280a.m13963h(r28)
            r6 = 0
            r3 = 13
            long r4 = androidx.activity.C0114h.m315r(r1, r6, r3)
            java.util.Iterator r16 = r27.iterator()
        L_0x0047:
            boolean r1 = r16.hasNext()
            r17 = 1
            if (r1 == 0) goto L_0x00e3
            java.lang.Object r1 = r16.next()
            androidx.compose.ui.layout.u r1 = (androidx.compose.p015ui.layout.C1710u) r1
            androidx.compose.ui.layout.i0 r3 = r1.mo6665J(r4)
            float r1 = r0.f2167a
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x0074
            int r2 = r8.element
            int r1 = r11.mo3791V(r1)
            int r1 = r1 + r2
            int r2 = r3.f3722b
            int r1 = r1 + r2
            int r2 = p174m0.C7280a.m13963h(r28)
            if (r1 > r2) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r1 = r6
            goto L_0x0076
        L_0x0074:
            r1 = r17
        L_0x0076:
            if (r1 != 0) goto L_0x009b
            float r2 = r0.f2168b
            r1 = r12
            r18 = r2
            r2 = r10
            r19 = r12
            r12 = r3
            r3 = r26
            r20 = r4
            r4 = r18
            r5 = r9
            r18 = r6
            r6 = r13
            r27 = r7
            r22 = r8
            r8 = r14
            r23 = r9
            r9 = r15
            r24 = r10
            r10 = r22
            m2162f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x00aa
        L_0x009b:
            r20 = r4
            r18 = r6
            r27 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r19 = r12
            r12 = r3
        L_0x00aa:
            boolean r1 = r23.isEmpty()
            r1 = r1 ^ 1
            r10 = r22
            if (r1 == 0) goto L_0x00bf
            int r1 = r10.element
            float r2 = r0.f2167a
            int r2 = r11.mo3791V(r2)
            int r2 = r2 + r1
            r10.element = r2
        L_0x00bf:
            r5 = r23
            r5.add(r12)
            int r1 = r10.element
            int r2 = r12.f3722b
            int r1 = r1 + r2
            r10.element = r1
            r7 = r27
            int r1 = r7.element
            int r2 = r12.f3723c
            int r1 = java.lang.Math.max(r1, r2)
            r7.element = r1
            r9 = r5
            r8 = r10
            r6 = r18
            r12 = r19
            r4 = r20
            r10 = r24
            goto L_0x0047
        L_0x00e3:
            r5 = r9
            r24 = r10
            r19 = r12
            r10 = r8
            boolean r1 = r5.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00ff
            float r4 = r0.f2168b
            r1 = r19
            r2 = r24
            r3 = r26
            r6 = r13
            r8 = r14
            r9 = r15
            m2162f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x00ff:
            int r1 = p174m0.C7280a.m13963h(r28)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L_0x010d
            int r1 = p174m0.C7280a.m13963h(r28)
            goto L_0x0117
        L_0x010d:
            int r1 = r15.element
            int r2 = p174m0.C7280a.m13965j(r28)
            int r1 = java.lang.Math.max(r1, r2)
        L_0x0117:
            r7 = r1
            r1 = r24
            int r1 = r1.element
            int r2 = p174m0.C7280a.m13964i(r28)
            int r8 = java.lang.Math.max(r1, r2)
            androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$measure$1 r9 = new androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$measure$1
            float r4 = r0.f2167a
            r1 = r9
            r2 = r19
            r3 = r26
            r5 = r7
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.compose.ui.layout.w r1 = r11.mo4387Z(r7, r8, kotlin.collections.C19294b0.m32559p0(), r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1.mo3260b(androidx.compose.ui.layout.x, java.util.List, long):androidx.compose.ui.layout.w");
    }
}
