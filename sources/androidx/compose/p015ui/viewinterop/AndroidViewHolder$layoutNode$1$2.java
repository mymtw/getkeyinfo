package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.node.LayoutNode;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2 */
public final class AndroidViewHolder$layoutNode$1$2 extends Lambda implements C19857l<C7282b, C19394m> {
    public final /* synthetic */ LayoutNode $layoutNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.$layoutNode = layoutNode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C7282b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C7282b bVar) {
        C19383o.m32797g(bVar, "it");
        this.$layoutNode.mo6727g(bVar);
    }
}
