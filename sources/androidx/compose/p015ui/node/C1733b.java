package androidx.compose.p015ui.node;

import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.b */
public final class C1733b {

    /* renamed from: a */
    public final C19285c f3889a = C19350d.m32676a(LazyThreadSafetyMode.NONE, DepthSortedSet$mapOfOriginalDepth$2.INSTANCE);

    /* renamed from: b */
    public final TreeSet<LayoutNode> f3890b = new TreeSet<>(new C1732a());

    /* renamed from: a */
    public final void mo6831a(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "node");
        if (layoutNode.mo6696c()) {
            this.f3890b.add(layoutNode);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final boolean mo6832b(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "node");
        if (layoutNode.mo6696c()) {
            return this.f3890b.remove(layoutNode);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        String obj = this.f3890b.toString();
        C19383o.m32796f(obj, "set.toString()");
        return obj;
    }
}
