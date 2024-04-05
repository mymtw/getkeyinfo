package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.node.LayoutNode;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1 */
public final class AndroidViewHolder$layoutNode$1$1 extends Lambda implements C19857l<C1436d, C19394m> {
    public final /* synthetic */ C1436d $coreModifier;
    public final /* synthetic */ LayoutNode $layoutNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, C1436d dVar) {
        super(1);
        this.$layoutNode = layoutNode;
        this.$coreModifier = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1436d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1436d dVar) {
        C19383o.m32797g(dVar, "it");
        this.$layoutNode.mo6729k(dVar.mo6148i0(this.$coreModifier));
    }
}
