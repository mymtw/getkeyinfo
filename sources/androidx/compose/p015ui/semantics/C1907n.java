package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.semantics.n */
public final class C1907n {

    /* renamed from: a */
    public final LayoutNode f4252a;

    public C1907n(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "rootNode");
        this.f4252a = layoutNode;
    }

    /* renamed from: a */
    public final SemanticsNode mo7355a() {
        C1904k T = C18263b.m30825T(this.f4252a);
        C19383o.m32794d(T);
        return new SemanticsNode(T, false);
    }
}
