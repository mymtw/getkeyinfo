package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.layout.n */
public final class C1697n implements C1711v {

    /* renamed from: a */
    public final /* synthetic */ C19862q<C1713x, List<? extends C1710u>, C7280a, C1712w> f3732a;

    /* renamed from: b */
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> f3733b;

    /* renamed from: c */
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> f3734c;

    /* renamed from: d */
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> f3735d;

    /* renamed from: e */
    public final /* synthetic */ C19862q<C1683h, List<? extends C1681g>, Integer, Integer> f3736e;

    public C1697n(C19862q<? super C1713x, ? super List<? extends C1710u>, ? super C7280a, ? extends C1712w> qVar, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar2, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar3, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar4, C19862q<? super C1683h, ? super List<? extends C1681g>, ? super Integer, Integer> qVar5) {
        this.f3732a = qVar;
        this.f3733b = qVar2;
        this.f3734c = qVar3;
        this.f3735d = qVar4;
        this.f3736e = qVar5;
    }

    /* renamed from: a */
    public final int mo3259a(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return this.f3735d.invoke(fVar, list, Integer.valueOf(i)).intValue();
    }

    /* renamed from: b */
    public final C1712w mo3260b(C1713x xVar, List<? extends C1710u> list, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(list, "measurables");
        return this.f3732a.invoke(xVar, list, new C7280a(j));
    }

    /* renamed from: c */
    public final int mo3261c(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return this.f3733b.invoke(fVar, list, Integer.valueOf(i)).intValue();
    }

    /* renamed from: d */
    public final int mo3262d(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return this.f3736e.invoke(fVar, list, Integer.valueOf(i)).intValue();
    }

    /* renamed from: e */
    public final int mo3263e(LayoutNode.C1725f fVar, List list, int i) {
        C19383o.m32797g(fVar, "<this>");
        return this.f3734c.invoke(fVar, list, Integer.valueOf(i)).intValue();
    }
}
