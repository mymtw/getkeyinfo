package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class LazyGridState$scrollableState$1 extends Lambda implements C19857l<Float, Float> {
    public final /* synthetic */ LazyGridState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollableState$1(LazyGridState lazyGridState) {
        super(1);
        this.this$0 = lazyGridState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Float invoke(float r13) {
        /*
            r12 = this;
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = r12.this$0
            float r13 = -r13
            r1 = 0
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x000c
            boolean r2 = r0.f1691s
            if (r2 == 0) goto L_0x0014
        L_0x000c:
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0017
            boolean r2 = r0.f1690r
            if (r2 != 0) goto L_0x0017
        L_0x0014:
            r13 = r1
            goto L_0x015b
        L_0x0017:
            float r2 = r0.f1676d
            float r2 = java.lang.Math.abs(r2)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r2 > 0) goto L_0x0027
            r2 = r5
            goto L_0x0028
        L_0x0027:
            r2 = r4
        L_0x0028:
            if (r2 == 0) goto L_0x0161
            float r2 = r0.f1676d
            float r2 = r2 + r13
            r0.f1676d = r2
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x014b
            float r2 = r0.f1676d
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r0.f1685m
            java.lang.Object r6 = r6.getValue()
            androidx.compose.ui.layout.j0 r6 = (androidx.compose.p015ui.layout.C1690j0) r6
            if (r6 == 0) goto L_0x0046
            r6.mo6690b()
        L_0x0046:
            boolean r6 = r0.f1681i
            if (r6 == 0) goto L_0x014b
            float r7 = r0.f1676d
            float r2 = r2 - r7
            androidx.compose.foundation.lazy.layout.h r7 = r0.f1692t
            if (r6 != 0) goto L_0x0053
            goto L_0x014b
        L_0x0053:
            androidx.compose.foundation.lazy.grid.m r6 = r0.mo4315g()
            java.util.List r8 = r6.mo4331b()
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x014b
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
            r2 = r5
            goto L_0x0069
        L_0x0068:
            r2 = r4
        L_0x0069:
            if (r2 == 0) goto L_0x009d
            java.util.List r8 = r6.mo4331b()
            java.lang.Object r8 = kotlin.collections.C19327t.m32645a1(r8)
            androidx.compose.foundation.lazy.grid.g r8 = (androidx.compose.foundation.lazy.grid.C0805g) r8
            androidx.compose.runtime.ParcelableSnapshotMutableState r9 = r0.f1679g
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0088
            int r8 = r8.mo4340b()
            goto L_0x008c
        L_0x0088:
            int r8 = r8.mo4341c()
        L_0x008c:
            int r8 = r8 + r5
            java.util.List r9 = r6.mo4331b()
            java.lang.Object r9 = kotlin.collections.C19327t.m32645a1(r9)
            androidx.compose.foundation.lazy.grid.g r9 = (androidx.compose.foundation.lazy.grid.C0805g) r9
            int r9 = r9.getIndex()
            int r9 = r9 + r5
            goto L_0x00cf
        L_0x009d:
            java.util.List r8 = r6.mo4331b()
            java.lang.Object r8 = kotlin.collections.C19327t.m32638T0(r8)
            androidx.compose.foundation.lazy.grid.g r8 = (androidx.compose.foundation.lazy.grid.C0805g) r8
            androidx.compose.runtime.ParcelableSnapshotMutableState r9 = r0.f1679g
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00ba
            int r8 = r8.mo4340b()
            goto L_0x00be
        L_0x00ba:
            int r8 = r8.mo4341c()
        L_0x00be:
            int r8 = r8 + -1
            java.util.List r9 = r6.mo4331b()
            java.lang.Object r9 = kotlin.collections.C19327t.m32638T0(r9)
            androidx.compose.foundation.lazy.grid.g r9 = (androidx.compose.foundation.lazy.grid.C0805g) r9
            int r9 = r9.getIndex()
            int r9 = r9 - r5
        L_0x00cf:
            int r10 = r0.f1682j
            if (r8 == r10) goto L_0x014b
            if (r9 < 0) goto L_0x00dd
            int r6 = r6.mo4330a()
            if (r9 >= r6) goto L_0x00dd
            r6 = r5
            goto L_0x00de
        L_0x00dd:
            r6 = r4
        L_0x00de:
            if (r6 == 0) goto L_0x014b
            boolean r6 = r0.f1684l
            if (r6 == r2) goto L_0x00f7
            r.e<androidx.compose.foundation.lazy.layout.h$a> r6 = r0.f1683k
            int r9 = r6.f17157d
            if (r9 <= 0) goto L_0x00f7
            T[] r6 = r6.f17155b
            r10 = r4
        L_0x00ed:
            r11 = r6[r10]
            androidx.compose.foundation.lazy.layout.h$a r11 = (androidx.compose.foundation.lazy.layout.C0845h.C0846a) r11
            r11.cancel()
            int r10 = r10 + r5
            if (r10 < r9) goto L_0x00ed
        L_0x00f7:
            r0.f1684l = r2
            r0.f1682j = r8
            r.e<androidx.compose.foundation.lazy.layout.h$a> r2 = r0.f1683k
            r2.mo20235g()
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = r0.f1688p
            java.lang.Object r2 = r2.getValue()
            kq.l r2 = (p753kq.C19857l) r2
            androidx.compose.foundation.lazy.grid.x r5 = new androidx.compose.foundation.lazy.grid.x
            r5.<init>(r8)
            java.lang.Object r2 = r2.invoke(r5)
            java.util.List r2 = (java.util.List) r2
            int r5 = r2.size()
        L_0x0117:
            if (r4 >= r5) goto L_0x014b
            java.lang.Object r6 = r2.get(r4)
            kotlin.Pair r6 = (kotlin.Pair) r6
            r.e<androidx.compose.foundation.lazy.layout.h$a> r8 = r0.f1683k
            java.lang.Object r9 = r6.getFirst()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Object r6 = r6.getSecond()
            m0.a r6 = (p174m0.C7280a) r6
            long r10 = r6.f16152a
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = r7.f1811a
            java.lang.Object r6 = r6.getValue()
            androidx.compose.foundation.lazy.layout.h$b r6 = (androidx.compose.foundation.lazy.layout.C0845h.C0847b) r6
            if (r6 == 0) goto L_0x0143
            androidx.compose.foundation.lazy.layout.h$a r6 = r6.m34700schedulePrefetch0kLqBqw(r9, r10)
            if (r6 != 0) goto L_0x0145
        L_0x0143:
            androidx.compose.foundation.lazy.layout.a r6 = androidx.compose.foundation.lazy.layout.C0836a.f1792a
        L_0x0145:
            r8.mo20232c(r6)
            int r4 = r4 + 1
            goto L_0x0117
        L_0x014b:
            float r2 = r0.f1676d
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0156
            goto L_0x015b
        L_0x0156:
            float r2 = r0.f1676d
            float r13 = r13 - r2
            r0.f1676d = r1
        L_0x015b:
            float r13 = -r13
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            return r13
        L_0x0161:
            java.lang.String r13 = "entered drag with non-zero pending scroll: "
            java.lang.StringBuilder r13 = android.support.p013v4.media.C0072d.m201h(r13)
            float r0 = r0.f1676d
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1.invoke(float):java.lang.Float");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
