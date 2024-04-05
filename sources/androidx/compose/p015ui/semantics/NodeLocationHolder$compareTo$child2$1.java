package androidx.compose.p015ui.semantics;

import androidx.activity.C0114h;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p288y.C8345d;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.semantics.NodeLocationHolder$compareTo$child2$1 */
public final class NodeLocationHolder$compareTo$child2$1 extends Lambda implements C19857l<LayoutNode, Boolean> {
    public final /* synthetic */ C8345d $view2Bounds;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeLocationHolder$compareTo$child2$1(C8345d dVar) {
        super(1);
        this.$view2Bounds = dVar;
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "it");
        LayoutNodeWrapper Z = C19388s.m32854Z(layoutNode);
        return Boolean.valueOf(Z.mo6685c() && !C19383o.m32792b(this.$view2Bounds, C0114h.m275F(Z)));
    }
}
