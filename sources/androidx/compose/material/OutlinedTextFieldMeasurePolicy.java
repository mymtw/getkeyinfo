package androidx.compose.material;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.layout.C1681g;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p288y.C8347f;
import p753kq.C19857l;
import p753kq.C19861p;

public final class OutlinedTextFieldMeasurePolicy implements C1711v {

    /* renamed from: a */
    public final C19857l<C8347f, C19394m> f2246a;

    /* renamed from: b */
    public final boolean f2247b;

    /* renamed from: c */
    public final float f2248c;

    /* renamed from: d */
    public final C0759v f2249d;

    public OutlinedTextFieldMeasurePolicy(C19857l<? super C8347f, C19394m> lVar, boolean z, float f, C0759v vVar) {
        C19383o.m32797g(lVar, "onLabelMeasured");
        C19383o.m32797g(vVar, "paddingValues");
        this.f2246a = lVar;
        this.f2247b = z;
        this.f2248c = f;
        this.f2249d = vVar;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo4987g(list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        T t;
        T t2;
        T t3;
        T t4;
        C1713x xVar2 = xVar;
        C19383o.m32797g(xVar2, "$this$measure");
        C19383o.m32797g(list, "measurables");
        int V = xVar2.mo3791V(this.f2249d.mo4150a());
        long a = C7280a.m13956a(j, 0, 0, 0, 0, 10);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C19383o.m32792b(C1993m.m4346G((C1710u) t), "Leading")) {
                break;
            }
        }
        C1710u uVar = (C1710u) t;
        C1686i0 J = uVar != null ? uVar.mo6665J(a) : null;
        int e = TextFieldImplKt.m2271e(J) + 0;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (C19383o.m32792b(C1993m.m4346G((C1710u) t2), "Trailing")) {
                break;
            }
        }
        C1710u uVar2 = (C1710u) t2;
        C1686i0 J2 = uVar2 != null ? uVar2.mo6665J(C0114h.m312p0(-e, 0, a)) : null;
        int i = -(TextFieldImplKt.m2271e(J2) + e);
        int i2 = -V;
        long p0 = C0114h.m312p0((i - xVar2.mo3791V(this.f2249d.mo4151b(xVar.getLayoutDirection()))) - xVar2.mo3791V(this.f2249d.mo4152c(xVar.getLayoutDirection())), i2, a);
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                t3 = null;
                break;
            }
            t3 = it3.next();
            if (C19383o.m32792b(C1993m.m4346G((C1710u) t3), "Label")) {
                break;
            }
        }
        C1710u uVar3 = (C1710u) t3;
        C1686i0 J3 = uVar3 != null ? uVar3.mo6665J(p0) : null;
        if (J3 != null) {
            this.f2246a.invoke(new C8347f(C0114h.m319t((float) J3.f3722b, (float) J3.f3723c)));
        }
        long a2 = C7280a.m13956a(C0114h.m312p0(i, i2 - Math.max(TextFieldImplKt.m2270d(J3) / 2, xVar2.mo3791V(this.f2249d.mo4153d())), j), 0, 0, 0, 0, 11);
        for (C1710u uVar4 : list) {
            if (C19383o.m32792b(C1993m.m4346G(uVar4), "TextField")) {
                C1686i0 J4 = uVar4.mo6665J(a2);
                long a3 = C7280a.m13956a(a2, 0, 0, 0, 0, 14);
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t4 = null;
                        break;
                    }
                    t4 = it4.next();
                    if (C19383o.m32792b(C1993m.m4346G((C1710u) t4), "Hint")) {
                        break;
                    }
                }
                C1710u uVar5 = (C1710u) t4;
                C1686i0 J5 = uVar5 != null ? uVar5.mo6665J(a3) : null;
                int e2 = TextFieldImplKt.m2271e(J);
                int e3 = TextFieldImplKt.m2271e(J2);
                int i3 = J4.f3722b;
                int e4 = TextFieldImplKt.m2271e(J3);
                int e5 = TextFieldImplKt.m2271e(J5);
                float f = OutlinedTextFieldKt.f2243a;
                int max = Math.max(Math.max(i3, Math.max(e4, e5)) + e2 + e3, C7280a.m13965j(j));
                int c = OutlinedTextFieldKt.m2200c(TextFieldImplKt.m2270d(J), TextFieldImplKt.m2270d(J2), J4.f3723c, TextFieldImplKt.m2270d(J3), TextFieldImplKt.m2270d(J5), j, xVar.getDensity(), this.f2249d);
                for (C1710u uVar6 : list) {
                    if (C19383o.m32792b(C1993m.m4346G(uVar6), "border")) {
                        return xVar2.mo4387Z(max, c, C19294b0.m32559p0(), new OutlinedTextFieldMeasurePolicy$measure$2(c, max, J, J2, J4, J3, J5, uVar6.mo6665J(C0114h.m313q(max != Integer.MAX_VALUE ? max : 0, max, c != Integer.MAX_VALUE ? c : 0, c)), this, xVar));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo4987g(list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo4986f(fVar, list, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo4986f(fVar, list, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.layout.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.layout.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.layout.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.compose.ui.layout.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4986f(androidx.compose.p015ui.node.LayoutNode.C1725f r11, java.util.List r12, int r13, p753kq.C19861p r14) {
        /*
            r10 = this;
            java.util.Iterator r0 = r12.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0109
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.g r2 = (androidx.compose.p015ui.layout.C1681g) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.m2269c(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r3)
            if (r2 == 0) goto L_0x0004
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r0 = r14.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.util.Iterator r0 = r12.iterator()
        L_0x002f:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x004a
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.compose.ui.layout.g r4 = (androidx.compose.p015ui.layout.C1681g) r4
            java.lang.Object r4 = androidx.compose.material.TextFieldImplKt.m2269c(r4)
            java.lang.String r5 = "Label"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
            if (r4 == 0) goto L_0x002f
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            androidx.compose.ui.layout.g r1 = (androidx.compose.p015ui.layout.C1681g) r1
            r0 = 0
            if (r1 == 0) goto L_0x0060
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r1, r4)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = r1
            goto L_0x0061
        L_0x0060:
            r4 = r0
        L_0x0061:
            java.util.Iterator r1 = r12.iterator()
        L_0x0065:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r1.next()
            r6 = r5
            androidx.compose.ui.layout.g r6 = (androidx.compose.p015ui.layout.C1681g) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.m2269c(r6)
            java.lang.String r7 = "Trailing"
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r7)
            if (r6 == 0) goto L_0x0065
            goto L_0x0080
        L_0x007f:
            r5 = r2
        L_0x0080:
            androidx.compose.ui.layout.g r5 = (androidx.compose.p015ui.layout.C1681g) r5
            if (r5 == 0) goto L_0x0094
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r5 = r1
            goto L_0x0095
        L_0x0094:
            r5 = r0
        L_0x0095:
            java.util.Iterator r1 = r12.iterator()
        L_0x0099:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00b3
            java.lang.Object r6 = r1.next()
            r7 = r6
            androidx.compose.ui.layout.g r7 = (androidx.compose.p015ui.layout.C1681g) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m2269c(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            if (r7 == 0) goto L_0x0099
            goto L_0x00b4
        L_0x00b3:
            r6 = r2
        L_0x00b4:
            androidx.compose.ui.layout.g r6 = (androidx.compose.p015ui.layout.C1681g) r6
            if (r6 == 0) goto L_0x00c7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r14.invoke(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            goto L_0x00c8
        L_0x00c7:
            r1 = r0
        L_0x00c8:
            java.util.Iterator r12 = r12.iterator()
        L_0x00cc:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x00e6
            java.lang.Object r6 = r12.next()
            r7 = r6
            androidx.compose.ui.layout.g r7 = (androidx.compose.p015ui.layout.C1681g) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m2269c(r7)
            java.lang.String r8 = "Hint"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            if (r7 == 0) goto L_0x00cc
            r2 = r6
        L_0x00e6:
            androidx.compose.ui.layout.g r2 = (androidx.compose.p015ui.layout.C1681g) r2
            if (r2 == 0) goto L_0x00f9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r14.invoke(r2, r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            goto L_0x00fa
        L_0x00f9:
            r12 = r0
        L_0x00fa:
            long r6 = androidx.compose.material.TextFieldImplKt.f2329a
            float r8 = r11.getDensity()
            androidx.compose.foundation.layout.v r9 = r10.f2249d
            r2 = r5
            r5 = r12
            int r11 = androidx.compose.material.OutlinedTextFieldKt.m2200c(r1, r2, r3, r4, r5, r6, r8, r9)
            return r11
        L_0x0109:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r12 = "Collection contains no element matching the predicate."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldMeasurePolicy.mo4986f(androidx.compose.ui.node.LayoutNode$f, java.util.List, int, kq.p):int");
    }

    /* renamed from: g */
    public final int mo4987g(List<? extends C1681g> list, int i, C19861p<? super C1681g, ? super Integer, Integer> pVar) {
        T t;
        T t2;
        T t3;
        T t4;
        for (T next : list) {
            if (C19383o.m32792b(TextFieldImplKt.m2269c((C1681g) next), "TextField")) {
                int intValue = pVar.invoke(next, Integer.valueOf(i)).intValue();
                Iterator<T> it = list.iterator();
                while (true) {
                    t = null;
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (C19383o.m32792b(TextFieldImplKt.m2269c((C1681g) t2), "Label")) {
                        break;
                    }
                }
                C1681g gVar = (C1681g) t2;
                int i2 = 0;
                int intValue2 = gVar != null ? pVar.invoke(gVar, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t3 = null;
                        break;
                    }
                    t3 = it2.next();
                    if (C19383o.m32792b(TextFieldImplKt.m2269c((C1681g) t3), "Trailing")) {
                        break;
                    }
                }
                C1681g gVar2 = (C1681g) t3;
                int intValue3 = gVar2 != null ? pVar.invoke(gVar2, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        t4 = null;
                        break;
                    }
                    t4 = it3.next();
                    if (C19383o.m32792b(TextFieldImplKt.m2269c((C1681g) t4), "Leading")) {
                        break;
                    }
                }
                C1681g gVar3 = (C1681g) t4;
                int intValue4 = gVar3 != null ? pVar.invoke(gVar3, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next2 = it4.next();
                    if (C19383o.m32792b(TextFieldImplKt.m2269c((C1681g) next2), "Hint")) {
                        t = next2;
                        break;
                    }
                }
                C1681g gVar4 = (C1681g) t;
                if (gVar4 != null) {
                    i2 = pVar.invoke(gVar4, Integer.valueOf(i)).intValue();
                }
                long j = TextFieldImplKt.f2329a;
                float f = OutlinedTextFieldKt.f2243a;
                return Math.max(Math.max(intValue, Math.max(intValue2, i2)) + intValue4 + intValue3, C7280a.m13965j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
