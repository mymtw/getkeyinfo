package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19862q;

final class ComposerImpl$insertMovableContentReferences$1$1$1 extends Lambda implements C19862q<C1299c<?>, C1306d1, C1424y0, C19394m> {
    public final /* synthetic */ C1296b $anchor;
    public final /* synthetic */ Ref$IntRef $effectiveNodeIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentReferences$1$1$1(Ref$IntRef ref$IntRef, C1296b bVar) {
        super(3);
        this.$effectiveNodeIndex = ref$IntRef;
        this.$anchor = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1299c<?> r9, androidx.compose.runtime.C1306d1 r10, androidx.compose.runtime.C1424y0 r11) {
        /*
            r8 = this;
            java.lang.String r1 = "applier"
            java.lang.String r3 = "slots"
            java.lang.String r5 = "<anonymous parameter 2>"
            r0 = r9
            r2 = r10
            r4 = r11
            androidx.compose.animation.C0391c.m1059f(r0, r1, r2, r3, r4, r5)
            kotlin.jvm.internal.Ref$IntRef r11 = r8.$effectiveNodeIndex
            androidx.compose.runtime.b r0 = r8.$anchor
            int r0 = r10.mo5668c(r0)
            int r1 = r10.f2849r
            r2 = 1
            r3 = 0
            if (r1 >= r0) goto L_0x001c
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            androidx.compose.runtime.ComposerKt.m2529f(r1)
            androidx.compose.runtime.ComposerImpl.m2419a0(r10, r9, r0)
            int r1 = r10.f2849r
            int r4 = r10.f2850s
        L_0x0027:
            if (r4 < 0) goto L_0x0034
            boolean r5 = r10.mo5684s(r4)
            if (r5 != 0) goto L_0x0034
            int r4 = r10.mo5691y(r4)
            goto L_0x0027
        L_0x0034:
            int r4 = r4 + r2
            r5 = r3
        L_0x0036:
            if (r4 >= r1) goto L_0x0061
            boolean r6 = r10.mo5681p(r1, r4)
            if (r6 == 0) goto L_0x0048
            boolean r6 = r10.mo5684s(r4)
            if (r6 == 0) goto L_0x0045
            r5 = r3
        L_0x0045:
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0048:
            boolean r6 = r10.mo5684s(r4)
            if (r6 == 0) goto L_0x0050
            r6 = r2
            goto L_0x005a
        L_0x0050:
            int[] r6 = r10.f2833b
            int r7 = r10.mo5679n(r4)
            int r6 = p001a0.C0005b.m8B(r7, r6)
        L_0x005a:
            int r5 = r5 + r6
            int r6 = r10.mo5680o(r4)
            int r4 = r4 + r6
            goto L_0x0036
        L_0x0061:
            int r1 = r10.f2849r
            if (r1 >= r0) goto L_0x0096
            boolean r1 = r10.mo5681p(r0, r1)
            if (r1 == 0) goto L_0x0090
            int r1 = r10.f2849r
            int r4 = r10.f2838g
            if (r1 >= r4) goto L_0x007f
            int[] r4 = r10.f2833b
            int r1 = r10.mo5679n(r1)
            boolean r1 = p001a0.C0005b.m68y(r1, r4)
            if (r1 == 0) goto L_0x007f
            r1 = r2
            goto L_0x0080
        L_0x007f:
            r1 = r3
        L_0x0080:
            if (r1 == 0) goto L_0x008c
            int r1 = r10.f2849r
            java.lang.Object r1 = r10.mo5690x(r1)
            r9.mo5613g(r1)
            r5 = r3
        L_0x008c:
            r10.mo5661J()
            goto L_0x0061
        L_0x0090:
            int r1 = r10.mo5657F()
            int r5 = r5 + r1
            goto L_0x0061
        L_0x0096:
            if (r1 != r0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r2 = r3
        L_0x009a:
            androidx.compose.runtime.ComposerKt.m2529f(r2)
            r11.element = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$1.invoke(androidx.compose.runtime.c, androidx.compose.runtime.d1, androidx.compose.runtime.y0):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
        return C19394m.f43287a;
    }
}
