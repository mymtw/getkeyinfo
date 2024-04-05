package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode$parent$2 */
public final class SemanticsNode$parent$2 extends Lambda implements C19857l<LayoutNode, Boolean> {
    public static final SemanticsNode$parent$2 INSTANCE = new SemanticsNode$parent$2();

    public SemanticsNode$parent$2() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "it");
        return Boolean.valueOf(C18263b.m30825T(layoutNode) != null);
    }
}
