package androidx.compose.p015ui.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.layout.v */
public interface C1711v {
    /* renamed from: a */
    int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1675d((C1681g) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo3260b(new C1685i(fVar, fVar.f3844b.f3834s), arrayList, C0114h.m315r(0, i, 7)).getWidth();
    }

    /* renamed from: b */
    C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j);

    /* renamed from: c */
    int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1675d((C1681g) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo3260b(new C1685i(fVar, fVar.f3844b.f3834s), arrayList, C0114h.m315r(0, i, 7)).getWidth();
    }

    /* renamed from: d */
    int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1675d((C1681g) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo3260b(new C1685i(fVar, fVar.f3844b.f3834s), arrayList, C0114h.m315r(i, 0, 13)).getHeight();
    }

    /* renamed from: e */
    int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C1675d((C1681g) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo3260b(new C1685i(fVar, fVar.f3844b.f3834s), arrayList, C0114h.m315r(i, 0, 13)).getHeight();
    }
}
