package androidx.compose.animation;

import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.node.LayoutNode;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class AnimatedContentMeasurePolicy implements C1711v {

    /* renamed from: a */
    public final AnimatedContentScope<?> f963a;

    public AnimatedContentMeasurePolicy(AnimatedContentScope<?> animatedContentScope) {
        this.f963a = animatedContentScope;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedContentMeasurePolicy$maxIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: androidx.compose.ui.layout.i0[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: androidx.compose.animation.AnimatedContentScope$a} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r12v2, types: [androidx.compose.ui.layout.i0] */
    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.compose.ui.layout.i0] */
    /* JADX WARNING: type inference failed for: r5v2, types: [androidx.compose.ui.layout.i0] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r14v1, types: [androidx.compose.ui.layout.i0] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r12v6, types: [androidx.compose.ui.layout.i0] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r4v5, types: [androidx.compose.ui.layout.i0] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.layout.C1712w mo3260b(androidx.compose.p015ui.layout.C1713x r11, java.util.List<? extends androidx.compose.p015ui.layout.C1710u> r12, long r13) {
        /*
            r10 = this;
            java.lang.String r0 = "$this$measure"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            int r0 = r12.size()
            androidx.compose.ui.layout.i0[] r1 = new androidx.compose.p015ui.layout.C1686i0[r0]
            int r2 = r12.size()
            r3 = 0
            r4 = r3
        L_0x0016:
            r5 = 0
            r6 = 1
            if (r4 >= r2) goto L_0x003e
            java.lang.Object r7 = r12.get(r4)
            androidx.compose.ui.layout.u r7 = (androidx.compose.p015ui.layout.C1710u) r7
            java.lang.Object r8 = r7.mo6666f()
            boolean r9 = r8 instanceof androidx.compose.animation.AnimatedContentScope.C0377a
            if (r9 == 0) goto L_0x002b
            r5 = r8
            androidx.compose.animation.AnimatedContentScope$a r5 = (androidx.compose.animation.AnimatedContentScope.C0377a) r5
        L_0x002b:
            if (r5 == 0) goto L_0x0032
            boolean r5 = r5.f972b
            if (r5 != r6) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r6 = r3
        L_0x0033:
            if (r6 == 0) goto L_0x003b
            androidx.compose.ui.layout.i0 r5 = r7.mo6665J(r13)
            r1[r4] = r5
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x003e:
            int r2 = r12.size()
            r4 = r3
        L_0x0043:
            if (r4 >= r2) goto L_0x0058
            java.lang.Object r7 = r12.get(r4)
            androidx.compose.ui.layout.u r7 = (androidx.compose.p015ui.layout.C1710u) r7
            r8 = r1[r4]
            if (r8 != 0) goto L_0x0055
            androidx.compose.ui.layout.i0 r7 = r7.mo6665J(r13)
            r1[r4] = r7
        L_0x0055:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0058:
            if (r0 != 0) goto L_0x005c
            r12 = r6
            goto L_0x005d
        L_0x005c:
            r12 = r3
        L_0x005d:
            if (r12 == 0) goto L_0x0061
            r12 = r5
            goto L_0x0082
        L_0x0061:
            r12 = r1[r3]
            int r13 = r0 + -1
            if (r13 != 0) goto L_0x0068
            goto L_0x0082
        L_0x0068:
            if (r12 == 0) goto L_0x006d
            int r14 = r12.f3722b
            goto L_0x006e
        L_0x006d:
            r14 = r3
        L_0x006e:
            if (r6 > r13) goto L_0x0082
            r2 = r6
        L_0x0071:
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0078
            int r7 = r4.f3722b
            goto L_0x0079
        L_0x0078:
            r7 = r3
        L_0x0079:
            if (r14 >= r7) goto L_0x007d
            r12 = r4
            r14 = r7
        L_0x007d:
            if (r2 == r13) goto L_0x0082
            int r2 = r2 + 1
            goto L_0x0071
        L_0x0082:
            if (r12 == 0) goto L_0x0087
            int r12 = r12.f3722b
            goto L_0x0088
        L_0x0087:
            r12 = r3
        L_0x0088:
            if (r0 != 0) goto L_0x008c
            r13 = r6
            goto L_0x008d
        L_0x008c:
            r13 = r3
        L_0x008d:
            if (r13 == 0) goto L_0x0090
            goto L_0x00b0
        L_0x0090:
            r5 = r1[r3]
            int r0 = r0 + -1
            if (r0 != 0) goto L_0x0097
            goto L_0x00b0
        L_0x0097:
            if (r5 == 0) goto L_0x009c
            int r13 = r5.f3723c
            goto L_0x009d
        L_0x009c:
            r13 = r3
        L_0x009d:
            if (r6 > r0) goto L_0x00b0
        L_0x009f:
            r14 = r1[r6]
            if (r14 == 0) goto L_0x00a6
            int r2 = r14.f3723c
            goto L_0x00a7
        L_0x00a6:
            r2 = r3
        L_0x00a7:
            if (r13 >= r2) goto L_0x00ab
            r5 = r14
            r13 = r2
        L_0x00ab:
            if (r6 == r0) goto L_0x00b0
            int r6 = r6 + 1
            goto L_0x009f
        L_0x00b0:
            if (r5 == 0) goto L_0x00b4
            int r3 = r5.f3723c
        L_0x00b4:
            androidx.compose.animation.AnimatedContentScope<?> r13 = r10.f963a
            long r4 = androidx.compose.foundation.layout.C0761x.m1707a(r12, r3)
            androidx.compose.runtime.ParcelableSnapshotMutableState r13 = r13.f966c
            m0.i r14 = new m0.i
            r14.<init>(r4)
            r13.setValue(r14)
            androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3 r13 = new androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            r13.<init>(r1, r10, r12, r3)
            androidx.compose.ui.layout.w r11 = r11.mo4387Z(r12, r3, kotlin.collections.C19294b0.m32559p0(), r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentMeasurePolicy.mo3260b(androidx.compose.ui.layout.x, java.util.List, long):androidx.compose.ui.layout.w");
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedContentMeasurePolicy$minIntrinsicWidth$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedContentMeasurePolicy$maxIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        Integer num = (Integer) SequencesKt___SequencesKt.m32987r1(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(list), new AnimatedContentMeasurePolicy$minIntrinsicHeight$1(i)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
