package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1711v;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$IntRef;
import p174m0.C7280a;

public final class BoxKt$boxMeasurePolicy$1 implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ boolean f1394a;

    /* renamed from: b */
    public final /* synthetic */ C1428a f1395b;

    public BoxKt$boxMeasurePolicy$1(C1428a aVar, boolean z) {
        this.f1394a = z;
        this.f1395b = aVar;
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        int i;
        int i2;
        C1686i0 i0Var;
        C1713x xVar2 = xVar;
        List<? extends C1710u> list2 = list;
        C19383o.m32797g(xVar2, "$this$MeasurePolicy");
        C19383o.m32797g(list2, "measurables");
        if (list.isEmpty()) {
            return xVar2.mo4387Z(C7280a.m13965j(j), C7280a.m13964i(j), C19294b0.m32559p0(), BoxKt$boxMeasurePolicy$1$measure$1.INSTANCE);
        }
        long a = this.f1394a ? j : C7280a.m13956a(j, 0, 0, 0, 0, 10);
        boolean z = false;
        if (list.size() == 1) {
            C1710u uVar = (C1710u) list2.get(0);
            Object f = uVar.mo6666f();
            C0731e eVar = f instanceof C0731e ? (C0731e) f : null;
            if (eVar != null) {
                z = eVar.f1495d;
            }
            if (!z) {
                i0Var = uVar.mo6665J(a);
                i2 = Math.max(C7280a.m13965j(j), i0Var.f3722b);
                i = Math.max(C7280a.m13964i(j), i0Var.f3723c);
            } else {
                i2 = C7280a.m13965j(j);
                i = C7280a.m13964i(j);
                i0Var = uVar.mo6665J(C7280a.C7281a.m13969c(C7280a.m13965j(j), C7280a.m13964i(j)));
            }
            int i3 = i2;
            int i4 = i;
            return xVar2.mo4387Z(i3, i4, C19294b0.m32559p0(), new BoxKt$boxMeasurePolicy$1$measure$2(i0Var, uVar, xVar, i3, i4, this.f1395b));
        }
        C1686i0[] i0VarArr = new C1686i0[list.size()];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = C7280a.m13965j(j);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = C7280a.m13964i(j);
        int size = list.size();
        boolean z2 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C1710u uVar2 = (C1710u) list2.get(i5);
            Object f2 = uVar2.mo6666f();
            C0731e eVar2 = f2 instanceof C0731e ? (C0731e) f2 : null;
            if (!(eVar2 != null ? eVar2.f1495d : false)) {
                C1686i0 J = uVar2.mo6665J(a);
                i0VarArr[i5] = J;
                ref$IntRef.element = Math.max(ref$IntRef.element, J.f3722b);
                ref$IntRef2.element = Math.max(ref$IntRef2.element, J.f3723c);
            } else {
                z2 = true;
            }
        }
        if (z2) {
            int i6 = ref$IntRef.element;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = ref$IntRef2.element;
            long q = C0114h.m313q(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                C1710u uVar3 = (C1710u) list2.get(i9);
                Object f3 = uVar3.mo6666f();
                C0731e eVar3 = f3 instanceof C0731e ? (C0731e) f3 : null;
                if (eVar3 != null ? eVar3.f1495d : false) {
                    i0VarArr[i9] = uVar3.mo6665J(q);
                }
            }
        }
        return xVar2.mo4387Z(ref$IntRef.element, ref$IntRef2.element, C19294b0.m32559p0(), new BoxKt$boxMeasurePolicy$1$measure$5(i0VarArr, list, xVar, ref$IntRef, ref$IntRef2, this.f1395b));
    }
}
