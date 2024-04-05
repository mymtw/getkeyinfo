package androidx.compose.p015ui.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.layout.p */
public interface C1702p extends C1436d.C1438b {
    /* renamed from: f */
    int mo3562f(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return mo3271v(new C1685i(xVar, xVar.getLayoutDirection()), new C1716z(layoutNodeWrapper, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width), C0114h.m315r(0, i, 7)).getWidth();
    }

    /* renamed from: r */
    int mo3563r(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return mo3271v(new C1685i(xVar, xVar.getLayoutDirection()), new C1716z(layoutNodeWrapper, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width), C0114h.m315r(0, i, 7)).getWidth();
    }

    /* renamed from: s */
    int mo3564s(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return mo3271v(new C1685i(xVar, xVar.getLayoutDirection()), new C1716z(layoutNodeWrapper, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height), C0114h.m315r(i, 0, 13)).getHeight();
    }

    /* renamed from: t */
    int mo3565t(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return mo3271v(new C1685i(xVar, xVar.getLayoutDirection()), new C1716z(layoutNodeWrapper, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height), C0114h.m315r(i, 0, 13)).getHeight();
    }

    /* renamed from: v */
    C1712w mo3271v(C1713x xVar, C1710u uVar, long j);
}
