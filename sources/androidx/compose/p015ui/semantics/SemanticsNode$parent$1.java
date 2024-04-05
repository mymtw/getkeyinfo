package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode$parent$1 */
public final class SemanticsNode$parent$1 extends Lambda implements C19857l<LayoutNode, Boolean> {
    public static final SemanticsNode$parent$1 INSTANCE = new SemanticsNode$parent$1();

    public SemanticsNode$parent$1() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C1903j c;
        C19383o.m32797g(layoutNode, "it");
        C1904k T = C18263b.m30825T(layoutNode);
        boolean z = true;
        if (T == null || (c = T.mo7349c()) == null || !c.f4247c) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
