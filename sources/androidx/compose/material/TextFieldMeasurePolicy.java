package androidx.compose.material;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.layout.AlignmentLineKt;
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
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p753kq.C19861p;

public final class TextFieldMeasurePolicy implements C1711v {

    /* renamed from: a */
    public final boolean f2337a;

    /* renamed from: b */
    public final float f2338b;

    /* renamed from: c */
    public final C0759v f2339c;

    public TextFieldMeasurePolicy(boolean z, float f, C0759v vVar) {
        C19383o.m32797g(vVar, "paddingValues");
        this.f2337a = z;
        this.f2338b = f;
        this.f2339c = vVar;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo5194g(list, i, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        T t;
        T t2;
        C1686i0 i0Var;
        C1686i0 i0Var2;
        T t3;
        int i;
        T t4;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        C1713x xVar2 = xVar;
        C19383o.m32797g(xVar2, "$this$measure");
        C19383o.m32797g(list, "measurables");
        int V = xVar2.mo3791V(textFieldMeasurePolicy.f2339c.mo4153d());
        int V2 = xVar2.mo3791V(textFieldMeasurePolicy.f2339c.mo4150a());
        int V3 = xVar2.mo3791V(TextFieldKt.f2336c);
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
        if (uVar2 != null) {
            i0Var = J;
            i0Var2 = uVar2.mo6665J(C0114h.m312p0(-e, 0, a));
        } else {
            i0Var = J;
            i0Var2 = null;
        }
        int e2 = TextFieldImplKt.m2271e(i0Var2) + e;
        int i2 = -V2;
        int i3 = -e2;
        long p0 = C0114h.m312p0(i3, i2, a);
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
        C1686i0 J2 = uVar3 != null ? uVar3.mo6665J(p0) : null;
        if (J2 != null) {
            i = J2.mo6661M(AlignmentLineKt.f3695b);
            if (i == Integer.MIN_VALUE) {
                i = J2.f3723c;
            }
        } else {
            i = 0;
        }
        int max = Math.max(i, V);
        long p02 = C0114h.m312p0(i3, J2 != null ? (i2 - V3) - max : (-V) - V2, C7280a.m13956a(j, 0, 0, 0, 0, 11));
        for (C1710u uVar4 : list) {
            if (C19383o.m32792b(C1993m.m4346G(uVar4), "TextField")) {
                C1686i0 J3 = uVar4.mo6665J(p02);
                long a2 = C7280a.m13956a(p02, 0, 0, 0, 0, 14);
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
                C1686i0 J4 = uVar5 != null ? uVar5.mo6665J(a2) : null;
                int max2 = Math.max(Math.max(J3.f3722b, Math.max(TextFieldImplKt.m2271e(J2), TextFieldImplKt.m2271e(J4))) + TextFieldImplKt.m2271e(i0Var) + TextFieldImplKt.m2271e(i0Var2), C7280a.m13965j(j));
                int b = TextFieldKt.m2273b(J3.f3723c, J2 != null, max, TextFieldImplKt.m2270d(i0Var), TextFieldImplKt.m2270d(i0Var2), TextFieldImplKt.m2270d(J4), j, xVar.getDensity(), textFieldMeasurePolicy.f2339c);
                TextFieldMeasurePolicy$measure$1 textFieldMeasurePolicy$measure$1 = r0;
                int i4 = b;
                TextFieldMeasurePolicy$measure$1 textFieldMeasurePolicy$measure$12 = new TextFieldMeasurePolicy$measure$1(J2, V, i, max2, b, J3, J4, i0Var, i0Var2, this, max, V3, xVar);
                return xVar2.mo4387Z(max2, i4, C19294b0.m32559p0(), textFieldMeasurePolicy$measure$1);
            }
            textFieldMeasurePolicy = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo5194g(list, i, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo5193f(fVar, list, i, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return mo5193f(fVar, list, i, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.compose.ui.layout.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.compose.ui.layout.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: androidx.compose.ui.layout.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5193f(androidx.compose.p015ui.node.LayoutNode.C1725f r12, java.util.List r13, int r14, p753kq.C19861p r15) {
        /*
            r11 = this;
            java.util.Iterator r0 = r13.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0111
            java.lang.Object r1 = r0.next()
            r2 = r1
            androidx.compose.ui.layout.g r2 = (androidx.compose.p015ui.layout.C1681g) r2
            java.lang.Object r2 = androidx.compose.material.TextFieldImplKt.m2269c(r2)
            java.lang.String r3 = "TextField"
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r3)
            if (r2 == 0) goto L_0x0004
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r15.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.util.Iterator r0 = r13.iterator()
        L_0x002f:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x004a
            java.lang.Object r2 = r0.next()
            r4 = r2
            androidx.compose.ui.layout.g r4 = (androidx.compose.p015ui.layout.C1681g) r4
            java.lang.Object r4 = androidx.compose.material.TextFieldImplKt.m2269c(r4)
            java.lang.String r5 = "Label"
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r5)
            if (r4 == 0) goto L_0x002f
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            androidx.compose.ui.layout.g r2 = (androidx.compose.p015ui.layout.C1681g) r2
            r0 = 0
            if (r2 == 0) goto L_0x0060
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r2, r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = r2
            goto L_0x0061
        L_0x0060:
            r4 = r0
        L_0x0061:
            java.util.Iterator r2 = r13.iterator()
        L_0x0065:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.compose.ui.layout.g r6 = (androidx.compose.p015ui.layout.C1681g) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.m2269c(r6)
            java.lang.String r7 = "Trailing"
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r7)
            if (r6 == 0) goto L_0x0065
            goto L_0x0080
        L_0x007f:
            r5 = r3
        L_0x0080:
            androidx.compose.ui.layout.g r5 = (androidx.compose.p015ui.layout.C1681g) r5
            if (r5 == 0) goto L_0x0094
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r5 = r2
            goto L_0x0095
        L_0x0094:
            r5 = r0
        L_0x0095:
            java.util.Iterator r2 = r13.iterator()
        L_0x0099:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00b3
            java.lang.Object r6 = r2.next()
            r7 = r6
            androidx.compose.ui.layout.g r7 = (androidx.compose.p015ui.layout.C1681g) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m2269c(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            if (r7 == 0) goto L_0x0099
            goto L_0x00b4
        L_0x00b3:
            r6 = r3
        L_0x00b4:
            androidx.compose.ui.layout.g r6 = (androidx.compose.p015ui.layout.C1681g) r6
            if (r6 == 0) goto L_0x00c8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r15.invoke(r6, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r6 = r2
            goto L_0x00c9
        L_0x00c8:
            r6 = r0
        L_0x00c9:
            java.util.Iterator r13 = r13.iterator()
        L_0x00cd:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00e7
            java.lang.Object r2 = r13.next()
            r7 = r2
            androidx.compose.ui.layout.g r7 = (androidx.compose.p015ui.layout.C1681g) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.m2269c(r7)
            java.lang.String r8 = "Hint"
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)
            if (r7 == 0) goto L_0x00cd
            r3 = r2
        L_0x00e7:
            androidx.compose.ui.layout.g r3 = (androidx.compose.p015ui.layout.C1681g) r3
            if (r3 == 0) goto L_0x00fa
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r15.invoke(r3, r13)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            goto L_0x00fb
        L_0x00fa:
            r13 = r0
        L_0x00fb:
            if (r4 <= 0) goto L_0x0100
            r14 = 1
            r2 = r14
            goto L_0x0101
        L_0x0100:
            r2 = r0
        L_0x0101:
            long r7 = androidx.compose.material.TextFieldImplKt.f2329a
            float r9 = r12.getDensity()
            androidx.compose.foundation.layout.v r10 = r11.f2339c
            r3 = r4
            r4 = r6
            r6 = r13
            int r12 = androidx.compose.material.TextFieldKt.m2273b(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return r12
        L_0x0111:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "Collection contains no element matching the predicate."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldMeasurePolicy.mo5193f(androidx.compose.ui.node.LayoutNode$f, java.util.List, int, kq.p):int");
    }

    /* renamed from: g */
    public final int mo5194g(List<? extends C1681g> list, int i, C19861p<? super C1681g, ? super Integer, Integer> pVar) {
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
                float f = TextFieldKt.f2334a;
                return Math.max(Math.max(intValue, Math.max(intValue2, i2)) + intValue4 + intValue3, C7280a.m13965j(j));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
