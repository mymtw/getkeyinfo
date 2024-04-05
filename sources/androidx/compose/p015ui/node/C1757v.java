package androidx.compose.p015ui.node;

import androidx.compose.runtime.C1293a;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.v */
public final class C1757v extends C1293a<LayoutNode> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1757v(LayoutNode layoutNode) {
        super(layoutNode);
        C19383o.m32797g(layoutNode, "root");
    }

    /* renamed from: a */
    public final void mo5639a(int i, int i2, int i3) {
        ((LayoutNode) this.f2796c).mo6746K(i, i2, i3);
    }

    /* renamed from: b */
    public final void mo5640b(int i, int i2) {
        ((LayoutNode) this.f2796c).mo6751P(i, i2);
    }

    /* renamed from: c */
    public final void mo5641c(int i, Object obj) {
        C19383o.m32797g((LayoutNode) obj, "instance");
    }

    /* renamed from: d */
    public final void mo5642d() {
        C1750p pVar = ((LayoutNode) this.f2794a).f3823h;
        if (pVar != null) {
            pVar.onEndApplyChanges();
        }
    }

    /* renamed from: f */
    public final void mo5643f(int i, Object obj) {
        LayoutNode layoutNode = (LayoutNode) obj;
        C19383o.m32797g(layoutNode, "instance");
        ((LayoutNode) this.f2796c).mo6739B(i, layoutNode);
    }

    /* renamed from: i */
    public final void mo5615i() {
        ((LayoutNode) this.f2794a).mo6750O();
    }
}
