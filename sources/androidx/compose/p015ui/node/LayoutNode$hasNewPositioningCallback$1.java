package androidx.compose.p015ui.node;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.C1674c0;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p219r.C7734e;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.node.LayoutNode$hasNewPositioningCallback$1 */
final class LayoutNode$hasNewPositioningCallback$1 extends Lambda implements C19861p<C1436d.C1438b, Boolean, Boolean> {
    public final /* synthetic */ C7734e<Pair<LayoutNodeWrapper, C1674c0>> $onPositionedCallbacks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNode$hasNewPositioningCallback$1(C7734e<Pair<LayoutNodeWrapper, C1674c0>> eVar) {
        super(2);
        this.$onPositionedCallbacks = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((C1436d.C1438b) obj, ((Boolean) obj2).booleanValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean invoke(androidx.compose.p015ui.C1436d.C1438b r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "mod"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r0 = 0
            if (r8 != 0) goto L_0x0031
            boolean r8 = r7 instanceof androidx.compose.p015ui.layout.C1674c0
            if (r8 == 0) goto L_0x0032
            r.e<kotlin.Pair<androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.c0>> r8 = r6.$onPositionedCallbacks
            r1 = 0
            if (r8 == 0) goto L_0x002f
            int r2 = r8.f17157d
            if (r2 <= 0) goto L_0x002d
            T[] r8 = r8.f17155b
            r3 = r0
        L_0x0018:
            r4 = r8[r3]
            r5 = r4
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r5 = r5.getSecond()
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r7, r5)
            if (r5 == 0) goto L_0x0029
            r1 = r4
            goto L_0x002d
        L_0x0029:
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x0018
        L_0x002d:
            kotlin.Pair r1 = (kotlin.Pair) r1
        L_0x002f:
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.node.LayoutNode$hasNewPositioningCallback$1.invoke(androidx.compose.ui.d$b, boolean):java.lang.Boolean");
    }
}
