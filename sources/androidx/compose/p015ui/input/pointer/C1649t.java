package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.node.C1734c;
import androidx.compose.p015ui.node.LayoutNode;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.input.pointer.t */
public final class C1649t {

    /* renamed from: a */
    public final LayoutNode f3682a;

    /* renamed from: b */
    public final C1634f f3683b;

    /* renamed from: c */
    public final C1645q f3684c = new C1645q();

    /* renamed from: d */
    public final C1734c<C1650u> f3685d = new C1734c<>();

    /* renamed from: e */
    public boolean f3686e;

    public C1649t(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "root");
        this.f3682a = layoutNode;
        this.f3683b = new C1634f(layoutNode.f3800D);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0043 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6621a(androidx.compose.p015ui.input.pointer.C1647r r12, androidx.compose.p015ui.input.pointer.C1654y r13, boolean r14) {
        /*
            r11 = this;
            java.lang.String r0 = "positionCalculator"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            boolean r0 = r11.f3686e
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            r0 = 1
            r11.f3686e = r0     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.input.pointer.q r2 = r11.f3684c     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.input.pointer.g r12 = r2.mo6617a(r12, r13)     // Catch:{ all -> 0x00f1 }
            java.util.Map<androidx.compose.ui.input.pointer.o, androidx.compose.ui.input.pointer.p> r13 = r12.f3632a     // Catch:{ all -> 0x00f1 }
            java.util.Collection r13 = r13.values()     // Catch:{ all -> 0x00f1 }
            boolean r2 = r13 instanceof java.util.Collection     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0025
            boolean r2 = r13.isEmpty()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0025
            goto L_0x0045
        L_0x0025:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0029:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r13.next()     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.input.pointer.p r2 = (androidx.compose.p015ui.input.pointer.C1644p) r2     // Catch:{ all -> 0x00f1 }
            boolean r3 = r2.f3659d     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0040
            boolean r2 = r2.f3662g     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = r1
            goto L_0x0041
        L_0x0040:
            r2 = r0
        L_0x0041:
            if (r2 == 0) goto L_0x0029
            r13 = r0
            goto L_0x0046
        L_0x0045:
            r13 = r1
        L_0x0046:
            if (r13 != 0) goto L_0x004a
            r13 = r0
            goto L_0x004b
        L_0x004a:
            r13 = r1
        L_0x004b:
            java.util.Map<androidx.compose.ui.input.pointer.o, androidx.compose.ui.input.pointer.p> r2 = r12.f3632a     // Catch:{ all -> 0x00f1 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x0055:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x0094
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.input.pointer.p r3 = (androidx.compose.p015ui.input.pointer.C1644p) r3     // Catch:{ all -> 0x00f1 }
            if (r13 != 0) goto L_0x0069
            boolean r4 = com.google.android.play.core.appupdate.C15562d.m25204t(r3)     // Catch:{ all -> 0x00f1 }
            if (r4 == 0) goto L_0x0055
        L_0x0069:
            int r4 = r3.f3663h     // Catch:{ all -> 0x00f1 }
            if (r4 != r0) goto L_0x006f
            r9 = r0
            goto L_0x0070
        L_0x006f:
            r9 = r1
        L_0x0070:
            androidx.compose.ui.node.LayoutNode r5 = r11.f3682a     // Catch:{ all -> 0x00f1 }
            long r6 = r3.f3658c     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.node.c<androidx.compose.ui.input.pointer.u> r8 = r11.f3685d     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.node.LayoutNode$b r4 = androidx.compose.p015ui.node.LayoutNode.f3792V     // Catch:{ all -> 0x00f1 }
            r10 = 1
            r5.mo6738A(r6, r8, r9, r10)     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.node.c<androidx.compose.ui.input.pointer.u> r4 = r11.f3685d     // Catch:{ all -> 0x00f1 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00f1 }
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x0055
            androidx.compose.ui.input.pointer.f r4 = r11.f3683b     // Catch:{ all -> 0x00f1 }
            long r5 = r3.f3656a     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.node.c<androidx.compose.ui.input.pointer.u> r3 = r11.f3685d     // Catch:{ all -> 0x00f1 }
            r4.mo6594d(r5, r3)     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.node.c<androidx.compose.ui.input.pointer.u> r3 = r11.f3685d     // Catch:{ all -> 0x00f1 }
            r3.clear()     // Catch:{ all -> 0x00f1 }
            goto L_0x0055
        L_0x0094:
            androidx.compose.ui.input.pointer.f r13 = r11.f3683b     // Catch:{ all -> 0x00f1 }
            java.lang.Object r13 = r13.f3631d     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.input.pointer.k r13 = (androidx.compose.p015ui.input.pointer.C1639k) r13     // Catch:{ all -> 0x00f1 }
            r13.mo6608f()     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.input.pointer.f r13 = r11.f3683b     // Catch:{ all -> 0x00f1 }
            boolean r13 = r13.mo6596f(r12, r14)     // Catch:{ all -> 0x00f1 }
            boolean r14 = r12.f3634c     // Catch:{ all -> 0x00f1 }
            if (r14 == 0) goto L_0x00a8
            goto L_0x00e7
        L_0x00a8:
            java.util.Map<androidx.compose.ui.input.pointer.o, androidx.compose.ui.input.pointer.p> r12 = r12.f3632a     // Catch:{ all -> 0x00f1 }
            java.util.Collection r12 = r12.values()     // Catch:{ all -> 0x00f1 }
            boolean r14 = r12 instanceof java.util.Collection     // Catch:{ all -> 0x00f1 }
            if (r14 == 0) goto L_0x00b9
            boolean r14 = r12.isEmpty()     // Catch:{ all -> 0x00f1 }
            if (r14 == 0) goto L_0x00b9
            goto L_0x00e7
        L_0x00b9:
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x00f1 }
        L_0x00bd:
            boolean r14 = r12.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r14 == 0) goto L_0x00e7
            java.lang.Object r14 = r12.next()     // Catch:{ all -> 0x00f1 }
            androidx.compose.ui.input.pointer.p r14 = (androidx.compose.p015ui.input.pointer.C1644p) r14     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r14, r2)     // Catch:{ all -> 0x00f1 }
            long r2 = com.google.android.play.core.appupdate.C15562d.m25184V(r14, r0)     // Catch:{ all -> 0x00f1 }
            long r4 = p288y.C8343c.f18295b     // Catch:{ all -> 0x00f1 }
            boolean r2 = p288y.C8343c.m16640a(r2, r4)     // Catch:{ all -> 0x00f1 }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x00e3
            boolean r14 = r14.mo6615b()     // Catch:{ all -> 0x00f1 }
            if (r14 == 0) goto L_0x00e3
            r14 = r0
            goto L_0x00e4
        L_0x00e3:
            r14 = r1
        L_0x00e4:
            if (r14 == 0) goto L_0x00bd
            goto L_0x00e8
        L_0x00e7:
            r0 = r1
        L_0x00e8:
            if (r0 == 0) goto L_0x00ec
            r12 = 2
            goto L_0x00ed
        L_0x00ec:
            r12 = r1
        L_0x00ed:
            r12 = r12 | r13
            r11.f3686e = r1
            return r12
        L_0x00f1:
            r12 = move-exception
            r11.f3686e = r1
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.C1649t.mo6621a(androidx.compose.ui.input.pointer.r, androidx.compose.ui.input.pointer.y, boolean):int");
    }
}
