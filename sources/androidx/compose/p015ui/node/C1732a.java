package androidx.compose.p015ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.a */
public final class C1732a implements Comparator<LayoutNode> {
    public final int compare(Object obj, Object obj2) {
        LayoutNode layoutNode = (LayoutNode) obj;
        LayoutNode layoutNode2 = (LayoutNode) obj2;
        C19383o.m32797g(layoutNode, "l1");
        C19383o.m32797g(layoutNode2, "l2");
        int i = C19383o.m32799i(layoutNode.f3824i, layoutNode2.f3824i);
        return i != 0 ? i : C19383o.m32799i(layoutNode.hashCode(), layoutNode2.hashCode());
    }
}
