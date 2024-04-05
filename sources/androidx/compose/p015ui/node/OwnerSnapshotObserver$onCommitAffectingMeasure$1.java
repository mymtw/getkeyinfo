package androidx.compose.p015ui.node;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1 */
public final class OwnerSnapshotObserver$onCommitAffectingMeasure$1 extends Lambda implements C19857l<LayoutNode, C19394m> {
    public static final OwnerSnapshotObserver$onCommitAffectingMeasure$1 INSTANCE = new OwnerSnapshotObserver$onCommitAffectingMeasure$1();

    public OwnerSnapshotObserver$onCommitAffectingMeasure$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "layoutNode");
        if (layoutNode.mo6696c()) {
            layoutNode.mo6754S(false);
        }
    }
}
