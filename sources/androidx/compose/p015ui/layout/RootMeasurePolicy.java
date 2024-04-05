package androidx.compose.p015ui.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;

/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy */
public final class RootMeasurePolicy extends LayoutNode.C1723d {

    /* renamed from: b */
    public static final RootMeasurePolicy f3700b = new RootMeasurePolicy();

    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(list, "measurables");
        if (list.isEmpty()) {
            return xVar.mo4387Z(C7280a.m13965j(j), C7280a.m13964i(j), C19294b0.m32559p0(), RootMeasurePolicy$measure$1.INSTANCE);
        }
        if (list.size() == 1) {
            C1686i0 J = ((C1710u) list.get(0)).mo6665J(j);
            return xVar.mo4387Z(C0114h.m287R(J.f3722b, j), C0114h.m286Q(J.f3723c, j), C19294b0.m32559p0(), new RootMeasurePolicy$measure$2(J));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C1710u) list.get(i)).mo6665J(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            C1686i0 i0Var = (C1686i0) arrayList.get(i4);
            i2 = Math.max(i0Var.f3722b, i2);
            i3 = Math.max(i0Var.f3723c, i3);
        }
        return xVar.mo4387Z(C0114h.m287R(i2, j), C0114h.m286Q(i3, j), C19294b0.m32559p0(), new RootMeasurePolicy$measure$4(arrayList));
    }
}
